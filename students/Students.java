        /*
         * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
         * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
         */
        package students;

        import java.util.Scanner;

        public class Students {
            private String name;
            private String course;
            private double grade;

            public Students(String name, String course, double grade) {
                this.name = name;
                this.course = course;
                this.grade = grade;
            }

            public String getName() {
                return name;
            }

            public String getCourse() {
                return course;
            }

            public double getGrade() {
                return grade;
            }

            public void setName(String name) {
                this.name = name;
            }


            public void setCourse(String course) {
                this.course = course;
            }

            public void setGrade(double grade) {
                this.grade = grade;
            }

            public static void main(String[] args) {
                Scanner user = new Scanner(System.in);
                Students[] list = new Students[10];
                int ctr = 0;

                while (true) {
                    System.out.println("1. Add Student ");
                    System.out.println("2. View Student List");
                    System.out.println("3. Edit Student Record");
                    System.out.println("4. Search Student Record");
                    System.out.println("5. Delete Student");
                    System.out.println("5. Exit");
                    int number = user.nextInt();

                    if (number == 1) {
                        if (ctr < 10) {
                            System.out.println("Enter student name: ");
                            String name = user.next();
                            System.out.println("Enter student course: ");
                            String course = user.next();
                            System.out.println("Enter student grade: ");
                            double grade = user.nextDouble();

                            Students student = new Students(name, course, grade);
                            list[ctr] = student;
                            ctr++;
                        } else {
                            System.out.println("Student list is already 10.");
                        }
                    } else if (number == 2) {
                        System.out.println("View Student List:");
                        for (int i = 0; i < ctr; i++) {
                            System.out.println("Student number " + (i + 1) + ":");
                            System.out.println("Name: " + list[i].getName());
                            System.out.println("Course: " + list[i].getCourse());
                            System.out.println("Grade: " + list[i].getGrade());
                            System.out.println(" ");
                        }
                    } else if (number == 3) {
                        System.out.println("Enter the student number ");
                        int num = user.nextInt();
                        if (num >= 1 || num <= ctr) {
                            System.out.println("Enter new student name: ");
                            String newName = user.next();
                            System.out.println("Enter new student course: ");
                            String newCourse = user.next();
                            System.out.println("Enter new student grade: ");
                            double newGrade = user.nextDouble();

                            list[num - 1].setName(newName);
                            list[num - 1].setCourse(newCourse);
                            list[num - 1].setGrade(newGrade);
                            System.out.println("Student record updated successfully.");
                        } else {
                            System.out.println("Invalid number not found.");
                        }
                    } else if (number == 4) {
                        System.out.println("Search the name of the student: ");
                        String Search = user.next();
                        boolean found = false;

                        for (int i = 0; i < ctr; i++) {
                            if (list[i].getName().equalsIgnoreCase(Search)) {
                                System.out.println("Student found:");
                                System.out.println("Name: " + list[i].getName());
                                System.out.println("Course: " + list[i].getCourse());
                                System.out.println("Grade: " + list[i].getGrade());
                                found = true;
                            }
                        }

                        if (!found) {
                            System.out.println("Student not found.");
                        }
                    } else if (number == 5) {
                        System.out.println("Enter the number of the student to delete:");
                            int num = user.nextInt();
                            if (num >= 1 || num <= ctr) {
                    
                            for (int i = num - 1; i < ctr - 1; i++) {
                            list[i] = list[i + 1];
                            }
                            list[ctr - 1] = null;
                            ctr--;
                                System.out.println("Student record deleted successfully.");
                            } else {
                                System.out.println("Invalid number not found.");
                            }
                    } else if (number == 6) {
                         System.out.println("Exiting the program.");
                        break;
                        } else {
                            System.out.println("Invalid!");
                        }
                    }
                
                }
            }

