package com.workintech.maps.modelone;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class mainEmployee {
    public static void main(String[] args) {

        List<Employee> employeeList = new LinkedList<>();
        employeeList.add(new Employee(1,"Oguzhan", "Colak"));
        employeeList.add(new Employee(2,"Ahmet", "Ozturk"));
        employeeList.add(new Employee(3,"Sena", "Yıldırım"));
        employeeList.add(new Employee(3,"Sena", "Yıldırım"));
        employeeList.add(new Employee(3,"Sena", "Yıldırım"));
        employeeList.add(new Employee(4,"Dogukan", "Oz"));
        employeeList.add(new Employee(5,"Gizem", "Kayal"));
        employeeList.add(new Employee(5,"Gizem", "Kayal"));
        employeeList.add(new Employee(5,"Gizem", "Kayal"));

        System.out.println(employeeList);

        List<Employee> duplicateList = new LinkedList<>();
        HashMap<Integer, Employee> uniqueMap = new HashMap<>();

        Iterator<Employee> employeeIterator = employeeList.iterator();
        while (employeeIterator.hasNext()) {
            Employee employee = employeeIterator.next();
            if (uniqueMap.containsKey(employee.getId())) {
                duplicateList.add(employee);
                employeeIterator.remove();
            }else {
                uniqueMap.put(employee.getId(), employee);
            }
        }

        System.out.println("");
        System.out.println("Duplicate List");
        for(Employee duplicateEmp : duplicateList) {
            System.out.println(duplicateEmp);
        }
        System.out.println("");
        System.out.println("Unique List");
        for(Employee uniqueEmp: uniqueMap.values()) {
            System.out.println(uniqueEmp);
        }

    }
}
