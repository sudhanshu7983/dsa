package searching;

class Student {
    int rollNumber;
    String name;

    public Student(int rollNumber, String name) {
        this.rollNumber = rollNumber;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNumber=" + rollNumber +
                ", name='" + name + '\'' +
                '}';
    }
}

class Searcher {
    public static int search(Student[] student, Student key) {
        for (int index = 0; index < student.length; index++) {
            if (key.equals(student[index])) {
                return index;
            }
        }
        return -1;
    }
}

class main {
    public static void main(String[] args) {
        Student s1 = new Student(2, "sudhanshu");
        Student s2 = new Student(5, "sudh");
        Student s4 = new Student(7, "main");
        Student s8 = new Student(8, "not");
        Student[] students = new Student[]{s1, s2, s4, s8};
        Searcher searcher = new Searcher();

    }
}