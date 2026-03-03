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
public class DepartmentDetails {

    private String department_name;

    public void saveDepartment(String department) {
        this.department_name = department;
        try {
            String insertsql = "INSERT INTO `department`\n"
                            + "            (`departmentname`)\n"
                            + "VALUES ('" + department_name + "');";
                    DB.iud(insertsql);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
