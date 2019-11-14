package ru.startandroid.listbindinghomework;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.LinkedList;

import ru.startandroid.listbindinghomework.adapter.EmployeeAdapter;
import ru.startandroid.listbindinghomework.model.Employee;

public class MainActivity extends AppCompatActivity {

    LinkedList<Employee> employeeList = new LinkedList<>();
    RecyclerView rv;
    EmployeeAdapter ea;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rv = findViewById(R.id.employee_list);
        ea = new EmployeeAdapter();
        rv.setLayoutManager(new LinearLayoutManager(this));
        rv.setAdapter(ea);
        rv.setItemAnimator(new DefaultItemAnimator());
        initData();
        ea.setData(employeeList);

    }
    private void initData () {
        for (int i = 0; i <= 10; i++){
            employeeList.add(new Employee("Kolya " + i));
        }
    }
}
