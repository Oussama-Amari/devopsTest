package devops.tuto;

import devops.tuto.employe.Emolye;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
Emolye emolye = new Emolye("Oussama Amari", 31, "0616400633", "78 Rue Jean Jaures 59000 Lille") ; 

System.out.println(emolye.getName()+ "--"+ emolye.getAddress() +"--"+ emolye.getAge()+"--"+emolye.getTel());
    }
}
