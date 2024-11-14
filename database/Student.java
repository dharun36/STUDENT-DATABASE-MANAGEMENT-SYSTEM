package database;

public class Student {
    private int id;
    private String name;
    private int age;
    private int mark;

    public Student(int id, String name, int age, int mark){
      try{
        if (mark < 0 || mark > 100) {
            throw new Exception("Mark cannot be negative");
        }
        this.id = id;
        this.name = name;
        this.age = age;
        this.mark = mark;

      }
      catch(Exception e){
        System.out.print(e);
      }
    }

    public void displayInfo() {
        System.out.println("ID: " + id + ", Name: " + name + ", Age: " + age + ", Mark: " + mark);
    }

    public int getId() {
        return id;
    }

    public int getMark() {
        return mark;
    }
}
