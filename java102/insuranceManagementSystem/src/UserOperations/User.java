package UserOperations;

import Addresses.Address;
import InsuranceOperations.Insurance;

import java.util.ArrayList;
import java.util.Date;

public class User {
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String job;
    private String membership;
    private int age;
    private ArrayList <Address> addressList = new ArrayList<>();
    private Date lastEntry;
    private Address addresses;
    private Insurance insurance;
    private ArrayList<Insurance> insuranceList = new ArrayList<>();

    public User(String firstName,String lastName,String email,String password,String job,
                int age, Address address,String membership) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.job = job;
        this.membership = membership;
        this.age = age;
        this.addresses = address;
        this.addressList.add(addresses);
        this.lastEntry = new Date(System.currentTimeMillis());

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getMembership() {
        return membership;
    }

    public void setMembership(String membership) {
        this.membership = membership;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public ArrayList<Address> getAddressList() {
        return addressList;
    }

    public void setAddressList(Address addressList) {
        this.addressList.add(addressList);
    }

    public Date getLastEntry() {
        return lastEntry;
    }


    public Address getAddresses() {
        return addresses;
    }

    public void setAddresses(Address addresses) {
        this.addresses = addresses;
    }

    public Insurance getInsurance() {
        return insurance;
    }

    public void setInsurance(Insurance insurance) {
        this.insurance = insurance;
    }

    public ArrayList<Insurance> getInsuranceList() {
        return insuranceList;
    }

    public void setInsuranceList(Insurance insurance) {
        this.insuranceList.add(insurance);
    }
}
