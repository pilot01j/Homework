
/* @author pilot*/
public class Employee {
    String name , surname2, position, salary, sex, nationality, age, IDNO;
    public Employee (String name, String surname2){
    this.name = name;
    this.surname2 = surname2;
    //System.out.println("Name: "+name +"\n"+" Surname: "+surname2);

    }
    public Employee (String name, String surname2, String position, String salary){
    this(name, surname2);
    this.position = position;
    this.salary = salary;
    //System.out.println("Name: "+name +"\n"+" Surname: "+surname2+"\n"+" Position: "+position+"\n"+" Salary: "+salary);
    }
    public Employee (String name, String surname2, String position, String salary, String sex, String nationality,String age, String IDNO){
    this(name, surname2, position, salary);
    this.sex = sex;
    this.nationality = nationality;
    this.age = age;
    this.IDNO = IDNO;
   // System.out.println("Name: "+name +"\n"+" Surname: "+surname2+"\n"+" Position: "+position+"\n"+" Salary: "+salary+"\n"+" Sex: "+sex+"\n"+" Nationality: "+nationality+"\n"+" Age: "+age+"\n"+" IDNO: "+IDNO);
    }
}
