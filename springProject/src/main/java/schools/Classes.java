package schools;

import java.util.List;
import java.util.TreeSet;

public class Classes {
	String name;
	List<Student> students;
	int totalClassRank;
	
	public Classes(String name, List<Student> students) {
		this.name = name;
		this.students = students;
		rankCalc();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public TreeSet<Student> getSet(){
		return new TreeSet(students);
	}
	public int getTotalClassRank() {
		return totalClassRank;
	}
	public void setTotalClassRank(int totalClassRank) {
		this.totalClassRank = totalClassRank;
	}
	public List<Student> getStudents() {
		return students;
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	}
	void rankCalc() {
		
		for(Student std : students) {
			int count = 1;
			for(Student sd : students) {
				if(std.avg < sd.avg) {
					count++;
				}
			}
			
			std.classesRank = count;
		}
	}
	@Override
	public String toString() {
		return "Classes [name=" + name + ", students=" + students + ", totalClassRank=" + totalClassRank + "]";
	}
}
