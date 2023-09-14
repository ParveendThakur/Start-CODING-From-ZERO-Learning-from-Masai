class Main {
  public static void main(String[] args) {
    // Student Information
    String name = "Parveend"; 
    String school = "S.B.V. School"; 
    char grade = 'A';
    int rollNo = 33;

    // Marks in Subjects
    int mathsMarks = 95;
    int scienceMarks = 88;
    int englishMarks = 92;


    // Print Report Card
        System.out.println("\n***** Student Report Card *****");
        System.out.println("Name: " + name);
        System.out.println("School: " + school);
        System.out.println("Grade: " + grade);
        System.out.println("Roll Number: " + rollNo);
        System.out.println("\nSubject Wise Marks:");
        System.out.println("Maths: " + mathsMarks);
        System.out.println("Science: " + scienceMarks);
        System.out.println("English: " + englishMarks);
        System.out.println("\n*******************************\n");
    
  }
}