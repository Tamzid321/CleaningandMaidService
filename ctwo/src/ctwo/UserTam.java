/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ctwo;

/**
 *
 * @author Lenovo
 */
class UserTam {
    
    
    private int ClientId ,TakenServices;
    private String ClientName,ClientContactNumber,ClientEmail ,ClientAddress;
    public UserTam(int ClientId ,String ClientName ,String ClientContactNumber ,String ClientEmail ,int TakenServices,String ClientAddress)
    {
       this.ClientId=ClientId;
       this.ClientName=ClientName;
       this.ClientContactNumber=ClientContactNumber;
       this.ClientEmail = ClientEmail ;
       this.TakenServices=TakenServices;
       this.ClientAddress=ClientAddress;
              
    
    }

    UserTam(int aInt, int aInt0, String string, String string0, String string1, String string2, String string3, String string4) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
    public int getClientId()
    {
      return ClientId;
    }
    public String getClientName()
    {
      return ClientName;
    }
    public String getClientContactNumber()
    {
      return ClientContactNumber;
    }
    public String getClientEmail ()
    {
      return ClientEmail ;
    }
  public int getTakenServices()
  { 
      return TakenServices;
  }  
  public String getClientAddress()
  {
     return ClientAddress;
  }
    
  
  private int ProjectId;
    private String ServiceFee,OrderDate,CurrentStatus;
    public UserTam(int ClientId ,int ProjectId,String ServiceFee ,String OrderDate ,String CurrentStatus)
    {
       this.ClientId=ClientId;
       this.ProjectId=ProjectId;
       this.ServiceFee=ServiceFee;
       this.OrderDate = OrderDate ;
       this.CurrentStatus=CurrentStatus;

    }
    
   /* public int getClientId()
    {
      return ClientId;
    }*/
    public int getProjectId()
    {
      return ProjectId;
    }
    public String getServiceFee()
    {
      return ServiceFee;
    }
    public String getOrderDate ()
    {
      return OrderDate  ;
    }
  public String getCurrentStatus()
  { 
      return CurrentStatus;
  }  

  
  
private int OrderId;   
private String CName,ServiceName,paymenttype,CPhone,CAddress;
  
  public UserTam(int OrderId, String CName ,String ServiceName,String paymenttype,String CPhone,String CAddress )
    {
       this.OrderId=OrderId;
       this.CName=CName;
     
       
       this.OrderDate=OrderDate;
       this.ServiceName = ServiceName ;
       this.paymenttype =paymenttype;
       this.CPhone=CPhone;
       this.CAddress=CAddress;

    }
  
   public String getCAddress()
    {
      return CAddress;
    }
  
  public int getOrderId()
    {
      return OrderId;
    }
    public String getCName()
    {
      return CName;
    }
   
public String getCPhone()
    {
      return CPhone;
    } 
   
   public String getServiceName()
    {
      return ServiceName;
    }
  public String getpaymenttype ()
  { 
      return paymenttype ;
  }  
  
  
  
  
     
private String Payment;

  public UserTam(String Payment)
    {
       this.Payment=Payment;

    }
  
   public String getPayment()
    {
      return Payment;
    }
  
  
 
}


