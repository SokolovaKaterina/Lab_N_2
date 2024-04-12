package com.university.application;

import com.university.domain.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApplicationServiceImpl implements ApplicationService {
    @Autowired
    DepartmentRepository departmentRepository;
    @Autowired
    EmployeeRepository employeeRepository;
    @Autowired
    OrganisationRepository organisationRepository;

    @Override
    public Department getRecordDepartments(int id) {return departmentRepository.getEntity(id);}
    @Override
    public Department getDepartmentByName(String name) {return departmentRepository.getDepartmentByName(name);}
    @Override
    public void editDepartment(Department department) {departmentRepository.editDepartment(department);}
    @Override
    public void addRecordDepartment(Department department) {
        departmentRepository.addDepartment(department);
    }
    @Override
    public void deleteRecordDepartments(Department department) {
        departmentRepository.removeDepartment(department);
    }
    @Override
    public List<Department> getRecordsDepartments() {
        return departmentRepository.getDepartments();
    }

    @Override
    public Employee getRecordEmployees(int id) {
        return employeeRepository.getEntity(id);
    }
    @Override
    public Employee getEmployeeByFIO(String FIO) {return employeeRepository.getEmployeeByFIO(FIO);}
    @Override
    public void editEmployee(Employee employee) {
        employeeRepository.editEmployee(employee);
    }
    @Override
    public void addRecordEmployee(Employee employee) {
        employeeRepository.addEmployee(employee);
    }
    @Override
    public void deleteRecordEmployees(Employee employee) {
        employeeRepository.removeEmployee(employee);
    }
    @Override
    public List<Employee> getRecordsEmployees() {
        return employeeRepository.getEmployees();
    }

    @Override
    public Organisation getRecordOrganisations(int id) { return organisationRepository.getEntity(id); }
    @Override
    public Organisation getOrganisationByName(String name) { return organisationRepository.getOrganisationByName(name); }
    @Override
    public void addRecordOrganisation(Organisation organisation) { organisationRepository.addOrganisation(organisation); }
    @Override
    public void editOrganisation(Organisation organisation) { organisationRepository.editOrganisation(organisation); }
    @Override
    public void deleteRecordOrganisations(Organisation organisation) { organisationRepository.removeOrganisation(organisation); }
    @Override
    public List<Organisation> getRecordsOrganisations() { return organisationRepository.getOrganisations(); }
}