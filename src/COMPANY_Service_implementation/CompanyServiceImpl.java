package COMPANY_Service_implementation;

import java.util.List;
/*
* Classname : CompanyServiceImpl
*
* Created on 23 June 2020
*
* Copyright Alyona Sviridova NTU KhPI
*/
public class CompanyServiceImpl implements ICompanyService {



    @Override
    public Company getTopLevelParent(Company child) {
        return null;
    }

    @Override
    public long getEmployeeCountForCompanyAndChildren(Company company, List<Company> companies) {
        return 0;
    }
}
