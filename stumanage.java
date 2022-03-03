import java.util.ArrayList;
import java.util.Scanner;
class StudentAL1{
    int age;
    int regno;
    String name;
    static int maxmarks=100;
    int marks;
    void setStudent(){
    }
void getStudent(){
}
}
class Main  {
    public static void main(String a[]){
        int i=0;
        int regnumber=0;
        int mark=0;
Scanner scan=new Scanner(System.in);
        ArrayList<StudentAL1> sal=new ArrayList<>();
                while(true){
            System.out.println("enter your choice 1. add 2. delete 3. show a particular student 4. showall 5.update a student 6.exit");
               
            i=scan.nextInt();
            switch(i){
                case 1://to add
                    StudentAL1 ob=new StudentAL1();
                    ob.setStudent();
                    sal.add(ob);
                    break;
                case 2: //delete
                    System.out.println("enter the regno you want to delete");
                    regnumber=scan.nextInt();
                    for(int j=0;j<sal.size();j++){
                        if (sal.get(j).regno==regnumber){
                            sal.remove(j);
                        }
                    }
                    break;
                case 3:    //show a particular student
                    System.out.println("enter the regno of student you want to print");
                    regnumber=scan.nextInt();
                    for(int j=0;j<sal.size();j++){
                        if (sal.get(j).regno==regnumber){
                            StudentAL1 stud=sal.get(j);
                            stud.getStudent();
                        }
                    }
                    break;
                case 4: // show all the student
                    for(int j=0;j<sal.size();j++){
                           StudentAL1 stud=sal.get(j);
                            stud.getStudent();
                        }
                    break;
                case 5: // update a student
                    System.out.println("enter the regno of student you want to update");
                    regnumber=scan.nextInt();
                    for(int j=0;j<sal.size();j++){
                        if (sal.get(j).regno==regnumber){
                            StudentAL1 stud=sal.get(j);
                            stud.getStudent();
                        }
                    }
                    System.out.println("enter the mark of student");
                    mark=scan.nextInt();
                    
                          break;
                case 6: // exiting
                                    System.exit(0); 
                                    break;
                default:
                    System.out.println("Please enter valid option");
            }
        }
    }
}
