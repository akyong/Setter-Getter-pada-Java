/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
