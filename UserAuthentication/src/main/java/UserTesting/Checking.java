package UserTesting;

public class Checking
{
   public String check(String Username,String Password)
   {
	   
	   if(Username.equals("Dhaneshan") || Password.equals("Dhaneshan@2001"))
	   {
		   
		   if(Username.equals("Dhaneshan"))
		   {
			    if(Password.equals("Dhaneshan@2001"))
			    {
			    	return "Welcome Dhaneshan";
			    }
			    else
			    {
			    	return "Invalid Password";
			    }
		   }
		   else
		   {
			   return "Invalid Username";
		   }
	   }
		   
	   else
	   {
		   return "Invalid Username And Password";
	   }  
	   
   } 
   public Boolean Assert_check(String Username,String Password)
   {
	   if(Username=="Dhaneshan" && Password=="Dhaneshan@123" )
	   {
		   return true;
	   }
	   else
	   {
		   return false;
	   }
   }
}
