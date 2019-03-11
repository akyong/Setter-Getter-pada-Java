/*
 * Project ini dibuat sebagai contoh dan hanya untuk memudahkan para pembaca dan 
 * hanya sebagai bahan belajar. 
 * 
 */
package setterandgetter;


import java.sql.Connection;
import java.sql.Statement;
import setterandgetter.connection.koneksi;
import setterandgetter.controller.StudentController;
import setterandgetter.domain.Student;

/**
 *
 * @author akyong
 */
public class SetterAndGetter {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        StudentController studentController = new StudentController();
        // TODO create Student if student still not exist
        try{
         studentController.Create(); 
        }catch(Exception e){
            System.out.println("Data tersebut sudah ada");
        }
        
        
        // TODO get Student if student exist
        Student student = studentController.getStudent("001");
        System.out.println("-------------------------");
        System.out.println("id: "+student.getId());
        System.out.println("nim: "+student.getNim());
        System.out.println("name: "+student.getName());
        System.out.println("age: "+student.getAge());
        System.out.println("address: "+student.getAddress());
        System.out.println("phoneNo: "+student.getPhoneNo());
        
    }
    
}
