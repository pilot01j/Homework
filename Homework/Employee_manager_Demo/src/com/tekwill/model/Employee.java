
package com.tekwill.model;

/** @author User*/
public class Employee {
    private String name;
    private String surname;
    private String idnp;
    
    public Employee() {
    }
    
    public Employee (String name, String surname, String idnp){
    this.name = name;
    this.surname = surname;
    this.idnp = idnp;
    }
    //getters and setters
    public String getName (){
    return name;}
    public String getSurname(){
    return surname;}
    public String getIdnp(){
    return idnp;}
    
    public void setName(String name){
    this.name = name;}
    public void setSurname(String surname){
    this.surname = surname;}
    public void setIdnp(String idnp){
    this.idnp = idnp;}
    @Override
    public String toString(){
    return "Employee{" + "name=" + name + ", surname=" + surname + ", idnp=" + idnp + "}";
    }
    
}
