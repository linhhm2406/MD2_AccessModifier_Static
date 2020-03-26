public class Student {
    private int id;
    private String name;
    private static String college = "CodeGym";

    public Student(int id, String name){
        this.id = id;
        this.name = name;
    };

    static void change(){
        college = "Hogwart";
    }

    void display(){
        System.out.printf("%-5d%-10s%-10s\n",id,name,college);
    }
}
