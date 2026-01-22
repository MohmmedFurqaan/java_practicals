class StudentDetail{
    String SName;
    long e_no;
    long Snumber;


    // consstructore
    StudentDetail(long r, String name, long number){
        this.SName = name;
        this.e_no = r;
        this.Snumber = number;
    }

    void display_details(){
        System.out.println("Name is " + this.SName);
        System.out.println("Enrollement Number : "+this.e_no);
        System.out.println("Phone number : " +this.Snumber);
    }


}

public class Student {

     public static void main(String[] args) {
        StudentDetail st1 = new StudentDetail(246470307061L, "A", 9999999999L);
        st1.display_details();
        StudentDetail st2 = new StudentDetail(246470307052L, "B", 8888888888L);
        st2.display_details();
     }
}