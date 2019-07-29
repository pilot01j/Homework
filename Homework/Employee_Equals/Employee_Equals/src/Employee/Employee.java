
package Employee;
public class Employee {
   public String name, surname, age, idnp ;
    
   public Employee (String name, String surname, String age, String idnp){
   this.name=name;
   this.surname=surname;
   this.age=age;
   this.idnp=idnp;
   }
   @Override
   public String toString() {
   return name + " " + surname + " " + age + " " + idnp;}
   //return "Name: "+name + " " + "Surname: "+surname + " " + "Age: "+age + " " + "IDNP:"+idnp;}
   
    @Override
    public boolean equals(Object obj){
    if(obj == this)
    return true;
    if(obj == null)
    return false;
    if(!(getClass() == obj.getClass()))
    return false;
    else
    {
    Employee tmp = (Employee)obj;
    if(tmp.name == this.name && tmp.surname == this.surname && tmp.age == this.age && tmp.idnp == this.idnp)
    return true;
    else
    return false;
    }
  }
}
