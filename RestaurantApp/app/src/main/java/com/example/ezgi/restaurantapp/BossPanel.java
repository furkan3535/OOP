package com.example.ezgi.restaurantapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;


import src.ChefBarista;
import src.Employee;
import src.Organization;
import src.Waiter;

public class BossPanel extends AppCompatActivity {

    Organization org = new Organization();
    public String allText = "";
    private Button hirebutton;
    private Button firebutton;
    private EditText nameTextView;
    private EditText surnameTextView;
    private EditText salaryTextView;
    private TextView listofView;
    private TextView output;
    private RadioGroup radioGroup;
    private static int jobstatus = 0; //0 Chef 1 Waiter

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boss_panel);

        nameTextView = findViewById(R.id.nameTextView);
        surnameTextView = findViewById(R.id.surnameTextView);
        salaryTextView = findViewById(R.id.salaryTextView);

        radioGroup = (RadioGroup) findViewById(R.id.myRadioGroup);
        listofView = findViewById(R.id.listofView);
        output = findViewById(R.id.output);
        hirebutton = findViewById(R.id.hireButton);
        listofView.append(org.rst.getEmployees());
        hirebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                radioCheck();
                hireEmployee();

            }
        });
        firebutton = findViewById(R.id.fireButton);
        firebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fireEmployee();

            }
        });

    }

    public void radioCheck() {

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {
                if (checkedId == R.id.radioWaiter) {
                    jobstatus = 1;
                    System.out.println("waiter");
                    System.out.println("job status in the method" + jobstatus);

                } else if (checkedId == R.id.radioChef) {
                    jobstatus = 0;
                    System.out.println("chef");
                    System.out.println("job status in the method" + jobstatus);

                } else {
                    System.out.println("job status can not changed");
                }
            }
        });
    }

    public void hireEmployee() {
        output.setText("");
        String empname = nameTextView.getText().toString();
        String empsurname = surnameTextView.getText().toString();
        String empsalary = salaryTextView.getText().toString();


        try {
            Employee emp;
            System.out.println("jobstatus is:" + jobstatus);
            if (jobstatus == 1) {

                emp = new Waiter(empname, empsurname, Double.parseDouble(empsalary));

            } else if (jobstatus == 0) {
                emp = new ChefBarista(empname, empsurname, Double.parseDouble(empsalary));

            } else {
                emp = null;
                output.setText(" checkk the box");
            }
            if (emp != null) {
                org.rst.hireEmployee(emp);
                System.out.println("list of thee employee hire..");
                org.rst.printEmployees();
                listofView.append(org.rst.getEmployee(org.rst.employees.size() - 1));
            }

            //listofView.append(org.rst.getEmployees());
        } catch (NumberFormatException e) {
            output.setText("Wrong Input");
        }
        nameTextView.setText("");
        surnameTextView.setText("");
        salaryTextView.setText("");

    }

    public void fireEmployee() {
        output.setText("");
        String empname = nameTextView.getText().toString();
        String empsurname = surnameTextView.getText().toString();
        String empsalary = salaryTextView.getText().toString();


        try {
            Employee emp;
            if (jobstatus == 1) {
                emp = new Waiter(empname, empsurname, Double.parseDouble(empsalary));
                System.out.println("waiter olustu");

            } else {
                emp = new ChefBarista(empname, empsurname, Double.parseDouble(empsalary));
                System.out.println("chef olustu");

            }
            org.rst.printEmployees();
            int index = org.rst.checkEmployee(empname, empsurname);
            System.out.println("emp index is" + index);
            if (index == -1) {
                System.out.println(empname + " " + empsurname + " " + empsurname);
                output.setText("Invalid Employee");
            } else {

                //org.rst.fireEmployee(emp);
                org.rst.fireEmployee(index);
                org.rst.printEmployees();
                listofView.setText("");
                listofView.append(org.rst.getEmployees());
            }


        } catch (NumberFormatException e) {
            output.setText("Wrong Input");
        }
        nameTextView.setText("");
        surnameTextView.setText("");
        salaryTextView.setText("");


    }


}
