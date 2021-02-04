/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbcdemo;

/**
 *
 * @author 1711j
 */
public class Student {
    private int id;
    private String name ,city, gender ,mobile;
    private float marks;
   

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMarks(float marks) {
        this.marks = marks;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public float getMarks() {
        return marks;
    }

    public String getCity() {
        return city;
    }

    public String getGender() {
        return gender;
    }

    public String getMobile() {
        return mobile;
    }
    
    
    
}
