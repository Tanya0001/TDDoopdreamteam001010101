package task.pkg6.dm.pt;


public class TestReport {



  public static void main(String[] args) throws Exception {
 
      
 try{
     CheckingAccount acc1 = new CheckingAccount(500,1000);
     acc1.deposit(500);
     acc1.withdraw(2000);
 }
    catch (OverdraftException ex)
    {
        System.out.println(ex.getMessage()+", $"+ex.GetDeficit());
    }
      
    }
  }
