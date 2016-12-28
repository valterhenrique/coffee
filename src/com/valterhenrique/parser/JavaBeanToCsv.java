package com.valterhenrique.parser;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

import com.opencsv.CSVWriter;
import com.opencsv.bean.BeanToCsv;
import com.opencsv.bean.ColumnPositionMappingStrategy;

public class JavaBeanToCsv
{
    public static void main(String args[])
    {
        CSVWriter csvWriter = null;
        try
        {
            //Create CSVWriter for writing to Employee.csv
            csvWriter = new CSVWriter(new FileWriter("Employee.csv"));
            BeanToCsv bc = new BeanToCsv();
            //Creating Employee objects
            Employee emp1 = new Employee(1,"FirstName1","LastName1",10000);
            Employee emp2 = new Employee(2,"FirstName2","LastName2",20000);
            Employee emp3 = new Employee(3,"FirstName3","LastName3",30000);
            Employee emp4 = new Employee(4,"FirstName4","LastName4",40000);
            Employee emp5 = new Employee(5,"FirstName5","LastName5",50000);

            //Add Employee objects to a list
            List empList = new ArrayList();
            empList.add(emp1);
            empList.add(emp2);
            empList.add(emp3);
            empList.add(emp4);
            empList.add(emp5);

            //mapping of columns with their positions
            ColumnPositionMappingStrategy mappingStrategy =
                    new ColumnPositionMappingStrategy();
            //Set mappingStrategy type to Employee Type
            mappingStrategy.setType(Employee.class);
            //Fields in Employee Bean
            String[] columns = new String[]{"empId","firstName","lastName","salary"};
            //Setting the colums for mappingStrategy
            mappingStrategy.setColumnMapping(columns);
            //Writing empList to csv file
            bc.write(mappingStrategy,csvWriter,empList);
            System.out.println("CSV File written successfully!!!");
        }
        catch(Exception ee)
        {
            ee.printStackTrace();
        }
        finally
        {
            try
            {
                //closing the writer
                csvWriter.close();
            }
            catch(Exception ee)
            {
                ee.printStackTrace();
            }
        }
    }
}
