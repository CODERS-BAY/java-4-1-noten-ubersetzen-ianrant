public class Main {
    public static void main(String[] args) {
        int gradeAsNumber = (int) (Math.random() * 5);
        String gradeAsText = "";

        if (gradeAsNumber == 0) {
            gradeAsNumber = 1;
        }

        System.out.println("The grade expressed as a number is " + gradeAsNumber);
        System.out.println();

        switch (gradeAsNumber) {
            case 1:
                gradeAsText = "A";
                break;
            case 2:
                gradeAsText = "B";
                break;
            case 3:
                gradeAsText = "C";
                break;
            case 4:
                gradeAsText = "D";
                break;
            case 5:
                gradeAsText = "F";
                break;
        }

        System.out.println("The grade expressed as a number is " + gradeAsText);


    }
}
