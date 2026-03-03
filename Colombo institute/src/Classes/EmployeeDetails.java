/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import hrmsystem.DB;

/**
 *
 * @author Aif
 */
public class EmployeeDetails {

    private String name;
    private String occupation;
    private double salary;
    private String department;
    private String contactnumber;
    private String epfNumber;

    public void saveEmployee(String emp_Name, String emp_Occu, double salary, String emp_dep, String emp_contact, String emp_epf) {
        try {
            this.name = emp_Name;
            this.occupation = emp_Occu;
            this.salary = salary;
            this.department = emp_dep;
            this.contactnumber = emp_contact;
            this.epfNumber = emp_epf;

            String insertsql = "INSERT INTO `empdetails`\n"
                    + "            (`username`,\n"
                    + "             `occupation`,\n"
                    + "             `salary`,\n"
                    + "             `department`,\n"
                    + "             `contact`,\n"
                    + "             `epfnumber`)\n"
                    + "VALUES ('" + name + "',\n"
                    + "        '" + occupation + "',\n"
                    + "        '" + salary + "',\n"
                    + "        '" + department + "',\n"
                    + "        '" + contactnumber + "',\n"
                    + "        '" + epfNumber + "');";
            DB.iud(insertsql);          
       } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
