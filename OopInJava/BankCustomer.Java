
class BankCustomer
{ 
    String _Name;
    String _BankAccountNumber;
   private int  _Balance;
   public BankCustomer(String Name,String BankAccountNumber,int Balance)
   {
      _Name= Name;
    _BankAccountNumber=BankAccountNumber;
     _Balance=Balance;
}
    // public void BankCustomerDetail(String Name,String BankAccountNumber,int Balance)
    // {
    //     _Name= Name;
    //     _BankAccountNumber=BankAccountNumber;
    //     _Balance=Balance;
    //   System.out.println(_Name +" "+ _BankAccountNumber +" "+ _Balance );
             
              
    // }
    public void Deposit(int Amount)
    {
        _Balance += Amount;
      System.out.println(_Balance );         
    } 
    public void WithDraw(int Amount)
    {
        _Balance -= Amount;
      System.out.println(_Balance );         
    } 
     
    class Java1 {


 public static void main(String[] args) 
 {
 //      Scanner sc = new Scanner ( System.in ) ;
   BankCustomer BC1=new BankCustomer();
     BC1.BankCustomerDetail("Ammar","ABC123" , 10000);
     BC1.Deposit(110000);
     BC1.WithDraw(1000);
     
      BankCustomer BC2=new BankCustomer();
     BC2.BankCustomerDetail("Ammar","ABC1234" , 1000000);
     BC2.Deposit(110000);
     BC2.WithDraw(1000);
 }
    
}
