package com.rubenvj.sevillafc.features.employee.data;

import com.rubenvj.sevillafc.features.employee.data.local.EmployeeFileLocalDataSource;

public class EmployeeDataRepository {
    private EmployeeFileLocalDataSource employeeFileLocalDataSource = new EmployeeFileLocalDataSource();

    private EmployeeDataRepository instance = null;

    public EmployeeDataRepository newInstance() {
        if (instance == null) {
            instance = new EmployeeDataRepository();
        }
        return instance;
    }

}
