# YAZILIM MİMARİSİ VE TASARIMI

CREATİONAL PATTERN

- PROTOTİP TASARIM DESENİ

Prototip Desen, yeni bir nesne oluşturmak yerine mevcut bir nesnenin klonlanmasının ve gereksinime göre özelleştirilebileceğini söylüyor .

Yeni bir nesne yaratmanın maliyeti pahalı ve kaynak yoğunsa, bu şablon izlenmelidir.

- PROTOTİP DESEN AVANTAJI

Prototip modelinin ana avantajları aşağıdaki gibidir:

-Alt sınıflama ihtiyacını azaltır.

-Nesne yaratmanın karmaşıklığını gizler.

-İstemciler, ne tür bir nesne olacağını bilmeden yeni nesneler alabilirler.

-Çalışma zamanında nesneleri eklemenizi veya silmenizi sağlar.

- PROTOTİP DESENİN KULLANIMI

-Çalışma zamanında sınıflar başlatıldığında.

-Bir nesne yaratmanın maliyeti pahalı veya karmaşık olduğunda.

-Bir uygulamadaki sınıf sayısını minimumda tutmak istediğinizde.

-İstemci uygulamasının, nesne oluşturma ve temsil etmekten habersiz olması gerektiğinde.


- PROTOTİP DESEN İÇİN UML

![uml](https://www.javatpoint.com/images/designpattern/prototype.jpg)

Protorip bir arayüz oluşturmak için getClone () metodlu Prototip tipini oluşturduk.
Ardından, EmployeeRecord nesnesinin klonlamasını yapan Prototip arabirimini uygulayan somut bir EmployeeRecord sınıfı oluşturuyoruz .
PrototypeDemo sınıfı , bu EmployeeRecord sınıfını kullanacaktır .


- PROTOTİP TASARIM ÖRNEĞİ

Dosya: Prototype.java

    interface Prototype {  
  
     public Prototype getClone();  
      
    }// Prototip arayüzünün sonu.


Dosya: EmployeeRecord.java

    class EmployeeRecord implements Prototype{  
      
    private int id;  
    private String name, designation;  
    private double salary;  
    private String address;  
      
    public EmployeeRecord(){  
            System.out.println("   Oracle Corporation Çalışan Kayıtları ");  
            System.out.println("---------------------------------------------");  
            System.out.println("Eid"+"\t"+"Ename"+"\t"+"Edesignation"+"\t"+"Esalary"+"\t\t"+"Eaddress");  
      
    }  
  
    public  EmployeeRecord(int id, String name, String designation, double salary, String address) {  
          
        this();  
        this.id = id;  
        this.name = name;  
        this.designation = designation;  
        this.salary = salary;  
        this.address = address;  
    }  
      
    public void showRecord(){  
          
        System.out.println(id+"\t"+name+"\t"+designation+"\t"+salary+"\t"+address);  
    }  
  
    @Override  
    public Prototype getClone() {  
          
        return new EmployeeRecord(id,name,designation,salary,address);  
    }  
    }//EmployeeRecord sınıfının sonu.


Dosya: PrototypeDemo.java

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




