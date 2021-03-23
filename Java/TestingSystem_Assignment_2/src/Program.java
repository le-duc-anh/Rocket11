
import java.util.Date;
import javafx.util.Duration;

public class Program {

    public static void main(String[] args) {
        
        Department department1 = new Department();
        department1.id = 1;
        department1.name = "Sale";

        Department department2 = new Department();
        department2.id = 2;
        department2.name = "Marketing";

        Department department3 = new Department();
        department3.id = 3;
        department3.name = "HR";

        Position position1 = new Position();
        position1.id = 1;
        position1.name = "Dev";

        Position position2 = new Position();
        position2.id = 2;
        position2.name = "Test";

        Position position3 = new Position();
        position3.id = 3;
        position3.name = "PM";

        Account account1 = new Account();
        account1.id = 1;
        account1.createdate = new Date(2021, 03, 17);
        account1.department = department1;
        account1.email = "An@gmail.com";
        account1.fullname = "Nguyen Van An";
        account1.position = position1;
        account1.username = "an.nguyenvan";

        Account account2 = new Account();
        account2.id = 2;
        account2.createdate = new Date(2021, 01, 11);
        account2.department = department1;
        account2.email = "Linh@gmail.com";
        account2.fullname = "Nguyen Hoai Linh";
        account2.position = position3;
        account2.username = "Linh.nguyenhoai";

        Account account3 = new Account();
        account3.id = 3;
        account3.createdate = new Date(2021, 02, 20);
        account3.department = department2;
        account3.email = "ha@gmail.com";
        account3.fullname = "Pham Hai Ha";
        account3.position = position1;
        account3.username = "Ha.phamhai";

        Group group1 = new Group();
        group1.id = 1;
        group1.name = "Java Fresher";
        group1.createdate = new Date(2021, 01, 11);

        Group group2 = new Group();
        group2.id = 2;
        group2.name = "DB Fresher";
        group2.createdate = new Date(2021, 02, 20);

        Group group3 = new Group();
        group3.id = 3;
        group3.name = "C++ Fresher";
        group3.createdate = new Date(2021, 03, 17);

        GroupAccount groupaccount1 = new GroupAccount();
        groupaccount1.account = account1;
        groupaccount1.group = group1;
        groupaccount1.joindate = new Date(2021, 03, 17);

        GroupAccount groupaccount2 = new GroupAccount();
        groupaccount1.account = account2;
        groupaccount1.group = group2;
        groupaccount1.joindate = new Date(2021, 03, 17);

        GroupAccount groupaccount3 = new GroupAccount();
        groupaccount1.account = account3;
        groupaccount1.group = group3;
        groupaccount1.joindate = new Date(2021, 03, 17);

        GroupAccount[] groupaccounts = {groupaccount1, groupaccount2, groupaccount3};
        group1.accounts = groupaccounts;
        account1.groups = groupaccounts;

        CategoryQuestion category1 = new CategoryQuestion();
        category1.id = 1;
        category1.name = "JAVA";

        CategoryQuestion category2 = new CategoryQuestion();
        category2.id = 2;
        category2.name = "DB";

        CategoryQuestion category3 = new CategoryQuestion();
        category3.id = 3;
        category3.name = "C++";

        TypeQuestion type1 = new TypeQuestion();
        type1.id = 1;
        type1.name = "Essay";

        TypeQuestion type2 = new TypeQuestion();
        type2.id = 2;
        type2.name = "Multi-choice";

        // Create Question
        Question question1 = new Question();
        question1.categoryquestion = category1;
        question1.content = "Dac diem chinh cua Java";
        question1.createdate = new Date(2020, 1, 7);
        question1.creator = account1;
        question1.id = 1;
        question1.typequestion = type1;

        Question question2 = new Question();
        question2.categoryquestion = category1;
        question2.content = "Cac chuong trinh Java chu yeu";
        question2.createdate = new Date(2020, 2, 8);
        question2.creator = account1;
        question2.id = 2;
        question2.typequestion = type2;

        Question question3 = new Question();
        question3.categoryquestion = category1;
        question3.content = "Quy tac thiet ke Database";
        question3.createdate = new Date(2019, 2, 9);
        question3.creator = account2;
        question3.id = 3;
        question3.typequestion = type1;

        Exam exam1 = new Exam();
        exam1.code = "JV01";
        exam1.createdate = new Date(2019, 9, 4);
        exam1.creator = account1;
        exam1.duration = Duration.minutes(60);
        exam1.id = 1;
        exam1.title = "Kien thuc co ban ve Java";

        Exam exam2 = new Exam();
        exam2.code = "DB01";
        exam2.createdate = new Date(2019, 12, 4);
        exam2.creator = account2;
        exam2.duration = Duration.minutes(45);
        exam2.id = 2;
        exam1.title = "Kien thuc co ban ve Database";

        Question[] questionOfExam1 = {question1, question2};
        exam1.questions = questionOfExam1;

        Question[] questionOfExam2 = {question3};
        exam1.questions = questionOfExam2;

        Answer answer1 = new Answer();
        answer1.id = 1;
        answer1.content = "JAVA la ngon ngu lap trinh pho bien nhat";
        answer1.isCorrect = true;
        answer1.question = question1;

        Answer answer2 = new Answer();
        answer2.id = 2;
        answer2.content = "JAVA la ngon ngu lap trinh mat phi";
        answer2.isCorrect = false;
        answer2.question = question1;

        System.out.println(department1.id);
        System.out.println(department1.name);
        System.out.println(position1.id);
        System.out.println(position1.name);
        System.out.println(account1.id);
        System.out.println(account1.createdate);
        System.out.println(account1.department);
        System.out.println(account1.email);
        System.out.println(account1.fullname);
        System.out.println(account1.username);
        System.out.println(account1.position);
        System.out.println(account1.groups);
    }
}
