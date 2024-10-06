
package application;



import java.util.Date;
import java.util.List;
import java.util.Scanner;
import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;


public class Program {
    
    public static void main (String [] args){
        
        Scanner scan = new Scanner(System.in);
        
        SellerDao sellerdao = DaoFactory.createSellerDao();
        System.out.println("=== TEST 1: seller findbyid ===");
        Seller seller = sellerdao.findById(3);
        System.out.println(seller);
        
        System.out.println("=== TEST 2: seller findbyDepartment ===");
        Department department = new Department(2, null);
        List<Seller> list = sellerdao.findByDepartment(department);
        for(Seller obj : list){
        System.out.println(obj);
            
        }
        System.out.println("=== TEST 3: seller findbyAll ===");
        list = sellerdao.findAll();
        for(Seller obj : list){
        System.out.println(obj);
    }
        System.out.println("=== TEST 4: seller insert ===");
        Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000, department);
        sellerdao.insert(newSeller);
        System.out.println("Inserted! New id = " + newSeller.getId());
        
         System.out.println("=== TEST 5: seller update ===");
         seller = sellerdao.findById(1);
         seller.setName("Neymar");
         sellerdao.update(seller);
         System.out.println("Update Completed");
         
         System.out.println("=== TEST 6: seller delete ===");
         System.out.println("Enter id for delete test: ");
         int id = scan.nextInt();
         sellerdao.deleteById(id);
         System.out.println("Delete completed");
         
         scan.close();
 }
}
