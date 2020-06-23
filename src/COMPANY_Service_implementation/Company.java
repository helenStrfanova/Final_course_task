package COMPANY_Service_implementation;

/*
* Classname : Company
*
* Created on 23 June 2020
*
* Copyright Alyona Sviridova NTU KhPI
*/

public class Company {

    // parent for this company nullable,
    // when there is no parent for this company
    private Company parent;
    private long employeesCount;

    public Company(Company parent, long employeesCount) {
        this.parent = parent;
        this.employeesCount = employeesCount;
    }
}
