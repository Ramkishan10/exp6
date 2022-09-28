import java.util.Scanner;
public class GetIDAndAge {
    public static void main(String[] args) 
    throws DataEntryException {
        Scanner sc=new Scanner(System.in);
        int id,age,n;
        String alertID =  "ID is not in the range of valid ID numbers. \nValid ID number (0 through 999)";
        String alertAge = "Age is not in the range of valid AGE. \nValid AGE number (0 through 119)";
        System.out.println("Enter the no. of people You wnted to chech");
        n=sc.nextInt();
        while(n!=0)
        {
            try
            {
                System.out.println("Enter ID-->:");
                id=sc.nextInt();
                //System.out.println("Enter Age-->:");
                //age=sc.nextInt();
                if((id<=0||id>=999))
                {
                    throw (new DataEntryException(alertID));
                }
                System.out.println("Enter Age-->:");
                age=sc.nextInt();
                if((age<=0||age>=119))
                {
                    throw (new DataEntryException(alertAge));
                }
            }
            catch( DataEntryException e)
            {
               System.out.println(e.getMessage()); 
            }
            
            n--;
        }
    }
}
class DataEntryException extends Exception
{
    DataEntryException(String alterEx)
    {
        super(alterEx);
        System.out.println(alterEx);
    }
    public String getMessage()
    {
        return "Invalid Data";
    }
}