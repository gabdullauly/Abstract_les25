/*
Создать 5 объектов студентов, 5 объектов тичер
Создать массив из 5 студентов и 5 тичеров массива юзер и вывести getUserData у каждого элемента этого массива
 */

public class Main {
    public static void main (String[] args){
        Student student = new Student();
        student.setId(10);
        student.setLogin("z.gabdullauly");
        student.setPassword("Zhan1");
        student.setName("Zhandos");
        student.setSurname("Gabdullauly");
        student.setGroup("IT-special");
        student.setGpa(3.6);

        Student student1 = new Student(20, "s.gabdulla", "Sam1", "Samal", "Gabdulla", "HouseManager", 3.4);
        Student student2 = new Student(30, "ais.baby", "Ais1","Aisana", "Gabdulla", "HouseChild1", 3.8);
        Student student3 = new Student(40, "aino", "Aino1","Ainazar", "Gabdulla", "HouseChild2", 4.0);
        Student student4 = new Student(50, "t.tume", "Tume1","Tumekul", "Tlepova", "HouseMam", 3.0);

        Teacher teacher = new Teacher();
        teacher.setId(110);
        teacher.setLogin("k.mbappe");
        teacher.setPassword("Mbappe111");
        teacher.setNickName("Mbappe");
        teacher.setStatus("Doctor");
        String[] subjects = {"Ball", "Foot", "Offside", "Out"};
        teacher.setSubjects(subjects);

        String[] subjects1 = {"GoldBall", "BestPlayer", "Barca"};

        Teacher teacher1 = new Teacher(120, "l.messi", "messi111", "Messi", "Professor", subjects1);
        Teacher teacher2 = new Teacher(130, "c.ronaldo", "ronal111", "Ronaldo", "Academic", subjects1);
        Teacher teacher3 = new Teacher(140, "e.hazard", "hazard111", "Hazard", "Asistent", subjects);
        Teacher teacher4 = new Teacher(150, "a.fergusson", "alex111", "Fergusson", "Tutor", subjects);

        User[] users = {student, teacher2, student4, student1, teacher4, student3, teacher, student2, teacher1, teacher3};

        for(int i=0; i<users.length; i++){
            System.out.println(users[i].getUserData());
        }
    }
}
