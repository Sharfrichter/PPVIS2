package sample.data;

import java.util.Date;

public class Pupil {
    public Pupil(String fullName, String parentFullName, String adress, String contacts, Date dateOfBirth, int group) {
        this.fullName = fullName;
        this.parentFullName = parentFullName;
        this.adress = adress;
        this.contacts = contacts;
        this.dateOfBirth = dateOfBirth;
        this.group = group;
    }

    String fullName;
    String parentFullName;
    String adress;
    String contacts;
    Date dateOfBirth;
    int group;
}
