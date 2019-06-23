/* @author pilot*/
public class Employee {
    String name , surname2, position, salary, sex, nationality, age, IDNO;
    public void NameSurname (String name, String surname2){
    this.name = name;
    this.surname2 = surname2;
    System.out.println("Name: "+name +" Surname: "+surname2);}
    public void NameSurname (String name, String surname2, String position, String salary){
    this.NameSurname(name, surname2);
    this.position = position;
    this.salary = salary;
    System.out.println("Name: "+name +" Surname: "+surname2+" Position: "+position+" Salary: "+salary);}
    public void NameSurname(String name, String surname2, String position, String salary, String sex, String nationality,String age, String IDNO){
    this.NameSurname(name, surname2, position, salary);
    this.sex = sex;
    this.nationality = nationality;
    this.age = age;
    this.IDNO = IDNO;
    System.out.println("Name: "+name +" Surname: "+surname2+" Position: "+position+" Salary: "+salary+" Sex: "+sex+" Nationality: "+nationality+" Age: "+age+" IDNO: "+IDNO);}
}
