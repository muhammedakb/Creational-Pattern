import java.io.BufferedReader;  
import java.io.IOException;  
import java.io.InputStreamReader;  
  
class PrototypeDemo{  
     public static void main(String[] args) throws IOException {  
          
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));  
        System.out.print("İşçi Id Giriniz: ");  
        int eid=Integer.parseInt(br.readLine());  
        System.out.print("\n");  
          
        System.out.print("İşçi İsmi Giriniz: ");  
        String ename=br.readLine();  
        System.out.print("\n");  
          
        System.out.print("İşçi Ataması Gir: ");  
        String edesignation=br.readLine();  
        System.out.print("\n");  
          
        System.out.print("İşçi Adres Gir: ");  
        String eaddress=br.readLine();  
        System.out.print("\n");  
          
        System.out.print("İşçi Maaş Gir: ");  
        double esalary= Double.parseDouble(br.readLine());  
        System.out.print("\n");  
           
        EmployeeRecord e1=new EmployeeRecord(eid,ename,edesignation,esalary,eaddress);  
          
        e1.showRecord();  
        System.out.println("\n");  
        EmployeeRecord e2=(EmployeeRecord) e1.getClone();  
        e2.showRecord();  
    }     
}//ProtoypeDemo sınıfının sonu.