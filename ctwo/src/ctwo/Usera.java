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
public class Usera {
    
       private int OrderId,ClientId, TakenServices;
    private String ClientName,ClientContactNumber,ClientEmail ,ClientAddress,OrderDate,ServiceName,Payment;
    
    
     
  public Usera(int OrderId,int ClientId, String ClientName ,String ClientContactNumber ,String ClientEmail ,String ClientAddress,String OrderDate,String ServiceName,String Payment )
    {
       this.OrderId=OrderId;
       this.ClientId=ClientId;
       this.ClientName = ClientName ;
       this.ClientContactNumber =ClientContactNumber ;
       
       this.ClientEmail=ClientEmail;
       this.ClientAddress = ClientAddress ;
       this.OrderDate =OrderDate;
       this.ServiceName=ServiceName;
       this.Payment=Payment;
       
       
       

    }
  
  public int getOrderId()
    {
      return OrderId;
    }
    public int getClientId()
    {
      return ClientId;
    }
   
   public String getClientName()
    {
      return ClientName;
    }
  public String getClientContactNumber ()
  { 
      return ClientContactNumber ;
  }  
    public String getClientEmail()
    {
      return ClientEmail;
    }
  public String getClientAddress()
  { 
      return ClientAddress ;
  }  
  
    public String getOrderDate()
    {
      return OrderDate;
    }
  public String getServiceName()
  { 
      return ServiceName ;
  }  
  public String getPayment()
  { 
      return   Payment;
  } 
    
}
