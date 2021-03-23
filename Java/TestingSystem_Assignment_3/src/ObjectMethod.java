
public class ObjectMethod {

    public static void main(String[] args) {

        Department[] departments = new Department[5];

        Department department1 = new Department();
        department1.id = 1;
        department1.name = "Sale";

        Department department2 = new Department();
        department2.id = 2;
        department2.name = "Marketing";

        Department department3 = new Department();
        department3.id = 3;
        department3.name = "Director";

        Department department4 = new Department();
        department4.id = 4;
        department4.name = "Waiting room";

        Department department5 = new Department();
        department5.id = 5;
        department5.name = "Accounting";

        departments[0] = department1;
        departments[1] = department2;
        departments[2] = department3;
        departments[3] = department4;
        departments[4] = department5;

        question1(department1);
        question2(departments);
        question3(department1);
        question4(department1);
        question5(department1, department2);
        question6(departments);
        System.out.println("");
        question7(departments);

    }
    // Q1.

    public static void question1(Department department) {
        System.out.println(department);
    }

    // Q2.
    public static void question2(Department[] departments) {
        for (Department department : departments) {
            System.out.println(department);
        }
    }
    // Q3.

    public static void question3(Department department) {
        System.out.println(department.hashCode());
    }

    // Q4.
    public static void question4(Department department) {
        if (department.name.equals("Phòng A")) {
            System.out.println("Có tên là phòng A");
        } else {
            System.out.println("Không tên là phòng A");
        }
    }

    // Q5.
    public static void question5(Department department1, Department department2) {
        if (department1.name.equals(department2.name)) {
            System.out.println("Có bằng nhau !");
        } else {
            System.out.println("Không bằng nhau !");
        }
    }

    // Q6.
    public static void question6(Department[] departments) {

        for (int i = 0; i < departments.length; i++) {
            for (int j = 0; j < departments.length - 1; j++) {

                if (departments[i].name.compareToIgnoreCase(departments[j].name) < 0) {
                    Department temp = departments[i];
                    departments[i] = departments[j];
                    departments[j] = temp;
                }
            }
        }

        for (Department department : departments) {
            System.out.println(department);
        }
    }

    // Q7.
    public static void question7(Department[] departments) {

        for (int i = 0; i < departments.length; i++) {
            String reverseNameDepartment = reverseWords(departments[i].name);
            for (int j = 0; j < departments.length - 1; j++) {
                String reverseNameComparingDepartment = reverseWords(departments[j].name);
                if (reverseNameDepartment.compareToIgnoreCase(reverseNameComparingDepartment) < 0) {
                    Department temp = departments[i];
                    departments[i] = departments[j];
                    departments[j] = temp;
                }
            }
        }

        for (Department department : departments) {
            System.out.println(department);
        }
    }

    private static String reverseWords(String str) {
        str = str.trim();
        str = str.replaceAll("\\s+", " ");

        String[] words = str.split(" ");

        str = "";
        for (int i = words.length - 1; i >= 0; i--) {
            str += words[i] + " ";
        }

        return str.substring(0, str.length() - 2);
    }
}
