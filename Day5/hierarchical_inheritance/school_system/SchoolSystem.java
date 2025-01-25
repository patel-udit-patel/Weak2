package Day5.hierarchical_inheritance.school_system;

//Controller class for school system
public class SchoolSystem {
    public static void main(String[] args) {
        //Creating person object and calling displayDetail method
        Person p1=new Person("Vinay",21);
        p1.displayDetail();

        //creating Teacher object and calling displayRole and displayDetail methods
        System.out.println();
        Teacher t1=new Teacher("Bhuban Prakash ",28,"Java");
        t1.displayRole();
        t1.displayDetail();

        //calling student object and calling displayRole and displayDetail methods
        System.out.println();
        Student s1=new Student("Udit ",21,'A');
        s1.displayRole();
        s1.displayDetail();

        //creating staff object and calling displayRole and displayDetail method
        System.out.println();
        Staff st=new Staff("Utkarsh ",25,9);
        st.displayRole();
        st.displayDetail();
    }

}
