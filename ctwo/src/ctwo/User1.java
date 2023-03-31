
package ctwo;


public class User1 {
     private int ProjectId,ServiceId,TeamId,ClientId;
    private String ServiceFee,OrderDate,StartingDate,Deadline,CurrentStatus;
    public User1(int ProjectId,int ServiceId,int TeamId,int ClientId,String ServiceFee ,String OrderDate ,String StartingDate,String Deadline,String CurrentStatus)
    {
       
       this.ProjectId=ProjectId;
       this.ServiceId=ServiceId;
       this.TeamId=TeamId;
       this.ClientId = ClientId ;
       this.ServiceFee=ServiceFee;
       this.OrderDate=OrderDate;
       this.StartingDate=StartingDate;
       this.Deadline=Deadline;
       this.CurrentStatus=CurrentStatus;
       

    }
    
   
    public int getProjectId()
    {
      return ProjectId;
    }
      public int getServiceId()
    {
      return ServiceId;
    }
  
     public int getTeamId()
    {
      return TeamId;
    }
 public int getClientId()
    {
      return ClientId;
    }
    public String getServiceFee()
    {
      return ServiceFee;
    }
    public String getOrderDate()
    {
      return OrderDate  ;
    }
   public String getStartingDate()
    {
      return StartingDate  ;
    }
    public String getDeadline()
    {
      return Deadline  ;
    }

  public String getCurrentStatus()
  { 
      return CurrentStatus;
  }
   
    private String ServiceName,Cost,Unit;
    public User1(int ProjectId ,int ServiceId,String ServiceFee ,String Deadline ,String CurrentStatus,String ServiceName,String Cost,String Unit)
    {
       this.ProjectId=ProjectId;
       this.ServiceId=ServiceId;
       this.ServiceFee=ServiceFee;
       this.Deadline = Deadline ;
       this.CurrentStatus=CurrentStatus;
       this.ServiceName=ServiceName;
       this.Cost=Cost;
       this.Unit=Unit;
    }
    
   
   
    public String getServiceName()
    {
      return ServiceName;
    }
    public String getCost ()
    {
      return Cost  ;
    }
  public String getUnit()
  { 
      return Unit;
  }  
 
  private int TakenServices;
  private String ClientName,ClientContactNumber,ClientEmail,ClientAddress;
    public User1(int ClientId,String ClientName ,String ClientContactNumber,String ClientEmail ,int TakenServices,String ClientAddress)
    {
       this.ClientId=ClientId;
       this.ClientName=ClientName;
       this.ClientContactNumber=ClientContactNumber;
       this.ClientEmail = ClientEmail ;
       this.TakenServices=TakenServices;
       this.ClientAddress=ClientAddress;
       
    }
    
   
   
    public String getClientName()
    {
      return ClientName;
    }
    public String getClientContactNumber ()
    {
      return ClientContactNumber  ;
    }
   public String getClientEmail()
   { 
      return ClientEmail;
   }
    public int getTakenServices()
   { 
      return TakenServices;
   }
     public String getClientAddress()
   { 
      return ClientAddress;
   }
   
  
}
  
 
    


