
public class Student {
	int age = 0;
	double gpa = 0.0;
	boolean hasPeanutAllergy = false;
	char middleInitial = 'A';
	String firstName = "John";
	String lastName = "Doe";
	int studentNumber = 0000000000;
	
	public Student(int a, boolean p, char m, String f, String l) {
		age = a;
		hasPeanutAllergy = p;
		middleInitial = m;
		firstName = f;
		lastName = l;
		studentNumber = (int)(Math.random()*Math.pow(10, 10));
		}
	public void incrementAge() {
		age++;
	}
	public double calcGPA(int[] grades) {
		for(int i = 0; i<grades.length; i++) {
			if(grades[i]>=92.5) {
				gpa+=4.0;
			}
			else if(grades[i]>=89.5) {
				gpa+=3.67;
			}
			else if(grades[i]>=86.5) {
				gpa+=3.33;
			}
			else if(grades[i]>=82.5) {
				gpa+=3.0;
			}
			else if(grades[i]>=79.5) {
				gpa+=2.67;
			}
			else if(grades[i]>=76.5) {
				gpa+=2.33;
			}
			else if(grades[i]>=72.5) {
				gpa+=2.0;
			}
			else if(grades[i]>=69.5) {
				gpa+=1.67;
			}
			else if(grades[i]>=66.5) {
				gpa+=1.33;
			}
			else if(grades[i]>=62.5) {
				gpa+=1.0;
			}
			else if(grades[i]>=59.5) {
				gpa+=0.67;
			}
		}
		gpa /= grades.length;
		gpa+=0.005;
		gpa = ((int)(gpa*100)) / (double)100;
		return gpa;
	}
}
