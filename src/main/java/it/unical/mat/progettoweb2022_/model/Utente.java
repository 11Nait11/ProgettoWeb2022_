package it.unical.mat.progettoweb2022_.model;

public class Utente {
    Integer id;
    String name;
    String lastname;
    Integer age;
    String nickname;
    String password;
    String email;
    String role;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    Boolean isbanned;


    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setIsbanned(Boolean isbanned) {
        this.isbanned = isbanned;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public Integer getAge() {
        return age;
    }

    public String getNickname() {
        return nickname;
    }

    public String getPassword() {
        return password;
    }

    public String getRole() {
        return role;
    }

    public Boolean getIsbanned() {
        return isbanned;
    }
    public void stampa(){
        System.out.println(id);
        System.out.println(name);
        System.out.println(lastname);
        System.out.println(age);
        System.out.println(nickname);
        System.out.println(password);
        System.out.println(email);
        System.out.println(role);
        System.out.println(isbanned);



    }
}
