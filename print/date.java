import java.io.*;
class Date
{   
    public static void main(String args[])throws IOException
    {   
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int l, y, d, m;
        String dd, mm, yy;
        int maxdays[]={0,31,28,31,30,31,30,31,31,30,31,30,31};
        String month[]={ "", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November",                              "December" };
 
        System.out.print("Enter any date in 8 digits (ddmmyyyy) format: ");
        String date = br.readLine();
 
        l = date.length(); 
 
        if(l==8) 
        {
            dd = date.substring(0,2);
            mm = date.substring(2,4); 
            yy = date.substring(4); 
            d = Integer.parseInt(dd); 
            m = Integer.parseInt(mm);
            y = Integer.parseInt(yy);  
            if((y%400==0) || ((y%100!=0)&&(y%4==0))) 
            {
                maxdays[2]=29;
            }
           
 
            if(m<0 || m>12 || d<0 || d>maxdays[m] || y<0 || y>9999)
            {
            System.out.println("The day, month or year are outside acceptable limit");
            }
 
            else
            {
              
                System.out.println("Date in dd/mm/yyyy format = "+dd+"/"+mm+"/"+yy);
                              
              
                System.out.print("Date in dd, month name, yyyy format = "+dd+" "+month[m]+", "+yy);
            }
        }
 
        else
            System.out.println("Wrong Input");
    }
}
