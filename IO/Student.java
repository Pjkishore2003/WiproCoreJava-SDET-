package IO;

import java.io.Serializable;

public class Student implements Serializable{
	private static final long serialVersionUID = 1609723986391993247L;
    int id;
    String name;
    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
