import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;


public class Person implements Serializable{
	
	private String name;
	private int age;
	
	public Person(String name, int age) 
	{
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void print() throws IOException
	{
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(FileDescriptor.out));
		writeObject(out);
	}

	private void writeObject(java.io.ObjectOutputStream out)
	{
		String str ="\n{<" + name + ">}" + "{<" + age + ">}";
	    try {
			out.writeObject(str);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
