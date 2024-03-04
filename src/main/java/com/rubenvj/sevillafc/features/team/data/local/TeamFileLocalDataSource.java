package com.rubenvj.sevillafc.features.team.data.local;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.rubenvj.sevillafc.features.employee.domain.Employee;

import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * Esta clase la proporciona el profesor
 */
public class TeamFileLocalDataSource {

    private String nameFile = "employee.txt";

    private Gson gson = new Gson();

    private final Type type = new TypeToken<Employee>(){}.getType();

    public void saveBuy(Employee employee) {
        try {
            if (!Files.exists(Paths.get(nameFile))) {
                Files.createFile(Paths.get(nameFile));
            }
            FileWriter myWriter = new FileWriter(nameFile, true);
            myWriter.write(gson.toJson(employee) + System.lineSeparator());
            myWriter.close();
            System.out.println("Compra guardada correctamente");
        } catch (IOException e) {
            System.out.println("Ha ocurrido un error al guardar la compra.");
        }
    }

    public Employee obtainEmployee(String employeeId) {
        try {
            List<String> lines = Files.readAllLines(Paths.get(nameFile));
            for (String line: lines) {
                Employee employee = gson.fromJson(line, Employee.class);
                if (employee.employeeId.equals(employeeId)) {
                    return employee;
                }
            }
        } catch (IOException e) {
            System.out.println("Ha ocurrido un error al obtener las compras");
        }
        return null;
    }

    public ArrayList<Employee> obtainBuys() {
        ArrayList<Employee> buys = new ArrayList<>();
        try {
            List<String> lines = Files.readAllLines(Paths.get(nameFile));
            for(String line : lines) {
                Employee employee = gson.fromJson(line, Employee.class);
                buys.add(employee);
            }
        } catch (IOException e) {
            System.out.println("Error al obtener compras");
        }

        return buys;
    }

    public void clear() {
        try {
            FileWriter myWriter = new FileWriter(nameFile);
            myWriter.write("");
            myWriter.close();
            System.out.println("Datos guardados correctamente");
        } catch (IOException e) {
            System.out.println("Ha ocurrido un error al guardar la información.");
        }
    }
}
