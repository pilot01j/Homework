public class Employee {
	// Un angajat : Nume, Prenume, virsta, fuctia
	String name;
	String surname;
	byte age;
	String position;
	// Ce poate face un angajat : work , drink coffee, present results, goin salary
	public void work(){
	//void - o fuctiue care nu returneaza nimic 
	//in interiorul clasei nu am fuctii dar metode
		System.out.println ("Employee : working..");
	}
	public static void main(String []args){
		Employee emp = new Employee(); // nounui Enployee denumit emp il stabilim ca este de tip ca Employee definit anterior
		emp.name = "Ion";// denumire noului Employe + punct + timul de date care dorim / atribuim 
		emp.surname = "Mocanu";
		emp.age = 26;
		System.out.print (emp.name);
		System.out.print (emp.surname);
		System.out.print (emp.age);
		emp.work();// cemam o metoda care o asociam lui Employee emp , work  ()trebuie sa fie scris la fel ca anterior

	}	
	} 