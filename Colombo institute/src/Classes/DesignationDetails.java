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
public class DesignationDetails {

    private String designation_name;
    private double salary;

    public void setDesignation(String name, double salary) {
        try {
            this.designation_name = name;
            this.salary = salary;

            String insertsql = "INSERT INTO `occupations`\n"
                    + "            (`occupationname`,\n"
                    + "             `salary`)\n"
                    + "VALUES ('" + designation_name + "',\n"
                    + "        '" + salary + "');";
            DB.iud(insertsql);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
