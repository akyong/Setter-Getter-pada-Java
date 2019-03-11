/*
 * Project ini dibuat sebagai contoh dan hanya untuk memudahkan para pembaca dan 
 * hanya sebagai bahan belajar. 
 * 
 */
package setterandgetter.controller;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import setterandgetter.connection.koneksi;
import setterandgetter.domain.Student;

/**
 *
 * @author akyong
 */
public class StudentController {
    public void Create(){
        try{
            String qString = "insert into student(id,nim,name,age,address,phone_no) values (1, '001', 'Akyong', 26, 'Jl. Pantai Indah Kapuk', '081293308020')";
            Connection con = koneksi.getConnection(); 
            Statement statement = con.createStatement();
            statement.executeUpdate(qString);
        }
        catch(Exception e)
        {
            System.out.println("Error : -> "+e.getMessage()+"\n\n\n");
            
            System.out.println("Kalau ada error 'Duplicate entry `1` for key `PRIMARY`', ini karena data sudah ada \n jadi silakan ganti qString dengan data yang lain. \n\n");
//            e.printStackTrace();
        }
    }
    
    public Student getStudent(String nim){
        Student student = new Student();
        try{
            String qString = "select * from student where nim='"+nim+"' ";
            Connection con = koneksi.getConnection(); 
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(qString);
            while(rs.next())
            {
                student.setId(rs.getLong("id"));
                student.setNim(rs.getString("nim"));
                student.setName(rs.getString("name"));
                student.setAge(rs.getByte("age"));
                student.setAddress(rs.getString("address"));
                student.setPhoneNo(rs.getString("phone_no"));
            }
        }
        catch(Exception e)
        {
            System.out.println("Error : -> "+e.getMessage());
            e.printStackTrace();
        }

        return student;
    }
}
