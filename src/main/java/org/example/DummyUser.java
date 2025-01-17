package org.example;

//intellij wants to change this class to a record which is way more concise for holding only data. Almost too concise.
public abstract class DummyUser implements User{
    private final String username;
    private final DummyRole[] roles;
    private final String password;
    private final String email;
    private final int age;
    private final String name;
    //private and final so the variables can't be changed

    //constructor
    public DummyUser(UserData userData) {
        this.username = userData.userName;
        this.roles = userData.roles;
        this.password = userData.password;
        this.email = userData.email;
        this.age = userData.age;
        this.name = userData.name;
    }

    //public void passwordCheck(DummyUser users) {

    //methods go here
    @Override
    public String getUsername() {
        return username;
    } //returns username

    //returns roles
    @Override
    public DummyRole[] getRoles() {
        return (DummyRole[]) this.roles;
    }

    @Override
    public String getPassword() { //returns password
        return this.password;
    }

    @Override
    public int getAge() {
        return this.age;
    }

    @Override
    public String getEmail() {
        return this.email;
    }
    @Override
    public String getName() {
        return this.name;
    }
}
