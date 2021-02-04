/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbcdemo;
import java.sql.SQLException;
import java.util.Scanner;




/**
 *
 * @author 1711j
 */
public class Jdbcdemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            
            SqlUtil.connectDB();
 Scanner sc=new Scanner(System.in);
 int choice=sc.nextInt()  ;     
do
{
  
System.out.println("ENTER YOUR CHOICE");
System.out.println("1. Insert Student Record");
System.out.println("2. Update Student Record");
System.out.println("3. Show all Student Record");
System.out.println("4. Show Student by id Record");
System.out.println("5. Delete Student Record");
 
 switch(choice){
     case 1: String queryi="insert into student value (6,'bcom','sandhya','B');";
              SqlUtil.insert(queryi);
         break;
     case 2:   String  queryu="update student set id=5 where id=7;";
      SqlUtil.update(queryu);
         break;
         
     case 3: String  queryf="select * from student;";
              SqlUtil.fetch(queryf);
         break;
         
     case 4: String  queryfid="select * from student where id =1;";
              SqlUtil.fetch(queryfid);
         break;
         
         
     case 5:  String  queryd="delete from student where id=6;";
                  SqlUtil.delete(queryd);
         
     
 }
     
     
     
     
 } while(choice<=5);

         

            
      
        } 
        catch (ClassNotFoundException ex) {
            System.out.println(ex);
        }
        catch(SQLException ex){
            System.out.println(ex);
        }
    }
    
}
