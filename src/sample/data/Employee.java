package sample.data;

import java.math.BigDecimal;
import java.util.Date;

public class Employee {
    public Employee(String name){
        this.employeeFullName = name;
    }

    public Employee(int id,
                    String employeeFullName,
                    String employeeContacts,
                    String position, Date contractDate,
                    int contractTerm, Date medExaminationDate,
                    double rate,
                    int experience) {
        this.id = id;
        this.employeeFullName = employeeFullName;
        this.employeeContacts = employeeContacts;
        this.position = position;
        this.contractDate = contractDate;
        this.contractTerm = contractTerm;
        this.medExaminationDate = medExaminationDate;
        this.rate = rate;
        this.experience = experience;
    }

    int id;
    String employeeFullName;
    String employeeContacts;
    String position;
    Date contractDate;
    int contractTerm;
    Date medExaminationDate;
    double rate;
    int experience;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmployeeFullName() {
        return employeeFullName;
    }

    public void setEmployeeFullName(String employeeFullName) {
        this.employeeFullName = employeeFullName;
    }

    public String getEmployeeContacts() {
        return employeeContacts;
    }

    public void setEmployeeContacts(String employeeContacts) {
        this.employeeContacts = employeeContacts;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Date getContractDate() {
        return contractDate;
    }

    public void setContractDate(Date contractDate) {
        this.contractDate = contractDate;
    }

    public int getContractTerm() {
        return contractTerm;
    }

    public void setContractTerm(int contractTerm) {
        this.contractTerm = contractTerm;
    }

    public Date getMedExaminationDate() {
        return medExaminationDate;
    }

    public void setMedExaminationDate(Date medExaminationDate) {
        this.medExaminationDate = medExaminationDate;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
}
