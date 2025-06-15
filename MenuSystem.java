import java.util.Scanner;
import java.io.File;
import java.io.*;
import java.lang.*;
import javax.lang.model.util.ElementScanner6;

public class MenuSystem {
    public static void main(String[] args) {
        // To create a file text file
        
        // File Myfile = new File("MenuSystemFile");
        // try {
        //     Myfile.createNewFile();
        // } catch (IOException e) {
        //     System.out.println("File is not Created!");
        //     throw new RuntimeException(e);
        // }
        
        while(true){   // While is use for Infinate loop(This is run at the infinate time)
            Scanner se = new Scanner(System.in);
            int num;
            System.out.println();
            System.out.println();
            System.out.println("\n\n===================================================================");
            System.out.println("\t\t Sterling Courier Company \t");
            System.out.println("===================================================================");
            System.out.println("1.  Custermer Registration");
            System.out.println("2.  Courier Order");
            System.out.println("3.  Courier Dispatch Responce Generation");
            System.out.println("4.  Courier Delivery");
            System.out.println("5.  Invoice Generation");
            System.out.println("6.  Exit");
            System.out.println("7.  Read the File");
            System.out.println();
            System.out.println();
            System.out.print("Enter Your Choice : ");
            num = se.nextInt();

            if(num==1){
                String  name,date, address,city,email;
                long  pin,mob;
                Scanner sc = new Scanner(System.in);
                Scanner sc1 = new Scanner(System.in);
                System.out.println("\n\n\tCustomer Registration");
                System.out.println("-------------------------------");

                System.out.print("Customer Name\t\t\t\t:  ");
                name = sc.nextLine();
                System.out.print("Date Of Registration(DD-MMM-YYYY)\t:  ");
                date = sc.nextLine();
                System.out.print("Address\t\t\t\t\t:  ");
                address = sc.nextLine();
                System.out.print("City \t\t\t\t\t:  ");
                city = sc.nextLine();
                System.out.print("Pin\t\t\t\t\t:  ");
                pin = sc.nextInt();
                System.out.print("Telephone Number\t\t\t:  ");
                mob = sc.nextLong();
                System.out.print("E-mail id\t\t\t\t:  ");
                email = sc1.nextLine(); 
                System.out.println(" Your Registration is Successfully Completed :)");
                try {
                    FileWriter fileWriter = new FileWriter("MenuSystemFile");
                    fileWriter.write("\n------------------This is the data of Customer----------------------");
                    fileWriter.write("\n\nCustomer Name\t\t : "+name);
                    fileWriter.write("\nDate Of Registration : "+date);
                    fileWriter.write("\nAddress\t\t\t\t : "+address);
                    fileWriter.write("\nCity\t\t\t\t : "+city);
                    fileWriter.write("\nPin\t\t\t\t\t : " +(int) pin);
                    fileWriter.write("\nTelephone Number\t : "+(long) mob);
                    fileWriter.write("\nE-mail id\t\t\t : " +email);
                    fileWriter.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            else if(num==2){
                Scanner sc2 = new Scanner(System.in);
                Scanner sc3 = new Scanner(System.in);
                int id;
                String address, name, city,  description;
                String sa;
                float weight;
                System.out.print("Customer Id\t\t\t\t:  ");
                id = sc2.nextInt();
                System.out.print("Date Of Order(DD-MMM-YYYY)\t\t:  ");
                sa = sc3.nextLine();
                // System.out.println("\n");
                System.out.print("Recipient Name\t\t\t\t:  ");
                name = sc3.nextLine();
                System.out.print("Recipient Address\t\t\t:  ");
                address = sc3.nextLine();
                System.out.print("Recipient City (D, P, B, C)\t\t:  ");
                city = sc3.nextLine();            
                System.out.print("Courier Weight\t\t\t\t:  ");
                weight = sc2.nextFloat();
                System.out.print("Description\t\t\t\t:  ");
                description = sc3.nextLine();
                System.out.println("Your Data is Here! ");
                try {
                    FileWriter fileWriter = new FileWriter("MenuSystemFile");
                    fileWriter.write("\n------------------This is the data of Customer----------------------");
                    fileWriter.write("\n\nCustomer Id : "+(int) id);
                    fileWriter.write("\nDate Of Order : "+ sa);
                    fileWriter.write("\nRecipient Name : "+name);
                    fileWriter.write("\nRecipient Address : "+address);
                    fileWriter.write("\nRecipient City : " + city);
                    fileWriter.write("\nCourier Weight : "+(float) weight);
                    fileWriter.write("\nDescription : "+description);
                    fileWriter.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            else if(num==3){
                String date;
                Scanner sc4 = new Scanner(System.in);
                System.out.println("\n\nCourier  Dispatch Reposeritry Generation \t");
                System.out.println("-------------------------------------------");
                System.out.print("Date of Distribution (DD-MM-YYYY)\t\t :  ");
                date = sc4.nextLine();
                System.out.println("Successfully Reposeritry Generation!");
                
                try {
                    FileWriter fileWriter = new FileWriter("MenuSystemFile");
                    fileWriter.write("Reposeritry Date : "+date);
                    fileWriter.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                
            }
            else if(num==4) {
                int id1,id2;
                String s,date,remake;
                Scanner sc4 = new Scanner(System.in);
                Scanner sc5 = new Scanner(System.in);
                System.out.println("\n\n----------------------------------");
                System.out.println("\t Courier Delivery");
                System.out.println("----------------------------------");
                System.out.print("\nEmployee Id\t\t\t\t : ");
                id1 = sc4.nextInt();
                System.out.print("Order Id\t\t\t\t : ");
                id2 = sc4.nextInt();
                System.out.print("Date of Delivery(DD-MM-YYYY)\t\t : ");
                date = sc5.nextLine();
                System.out.print("Status (P,R,D)\t\t\t\t : ");
                s = sc5.nextLine();
                System.out.print("Remarks\t\t\t\t\t : ");
                remake = sc5.nextLine();

                // File Handling
                try {
                    FileWriter fileWriter = new FileWriter("MenuSystemFile");
                    fileWriter.write("\nEmployee Id : "+(int)id1);
                    fileWriter.write("\nOrder Id : "+(int)id2);
                    fileWriter.write("\nDate of Delivery : "+date);
                    fileWriter.write("\nStatus : "+s);
                    fileWriter.write("\nRemarkes : "+remake);
                    fileWriter.close();

                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                // File Handling
                
            }
            else if(num==5){
                Scanner sc5 = new Scanner(System.in);
                Scanner sc6 = new Scanner(System.in);
                int i,m,y;
                String D;
                System.out.println("\n\n\t Invoice Generation");
                System.out.println("----------------------------------------------------");
                
                System.out.print("\nCustomer Id : ");
                i = sc5.nextInt();
                System.out.print("Envoice Month : ");
                m = sc5.nextInt();
                System.out.print("Invoice Year : ");
                y = sc5.nextInt();
                System.out.print("Description : ");
                D = sc6.nextLine();

                // File Handling
                try {
                    FileWriter fileWriter = new FileWriter("MenuSystemFile");
                    fileWriter.write("\nCustomer Id : "+(int) i);
                    fileWriter.write("\nEnvoice Month : "+(int) m);
                    fileWriter.write("\nInvoice Year : "+(int) y);
                    fileWriter.write("\nDescription : "+D);
                    fileWriter.close();

                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                // File Handling
                
            }
            else if(num==7){
                
                try {
                    File myFile = new File("MenuSystemFile.txt");
                    Scanner sc = new Scanner(myFile);
                    while (sc.hasNextLine()) {
                        String line = sc.nextLine();
                    }
                    sc.close();
                }
                catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
            }
            else if(num>7){
                System.out.println("Envalid Choice!");
                System.out.println("Please Enter valid Number.\n\n");
            }
            else 
            break;        
        }
    }
}