 
package ctwo;


class UserT {
    
    
    private int ServiceId ;
    private String ServiceName,Cost,Unit ;
    public UserT(int ServiceId ,String ServiceName ,String Cost ,String Unit )
    {
       this.ServiceId=ServiceId;
       this.ServiceName=ServiceName;
       this.Cost=Cost;
       this.Unit =Unit ;
       
    
    }
    
    public int getServiceId()
    {
      return ServiceId;
    }
    public String getServiceName()
    {
      return ServiceName;
    }
    public String getCost()
    {
      return Cost;
    }
    public String getUnit ()
    {
      return Unit ;
    }

    private int ServiceAvailabilityId ;
    private String MostAvailableStartingTime,ServiceAvailableDay ;
    public UserT(int ServiceId ,int  ServiceAvailabilityId ,String MostAvailableStartingTime,String ServiceAvailableDay ) 
 
    {
       this.ServiceId=ServiceId;
       this.ServiceAvailabilityId=ServiceAvailabilityId;
       this.MostAvailableStartingTime=MostAvailableStartingTime;
       this.ServiceAvailableDay=ServiceAvailableDay ;
       
    
    }
    
    public int getServiceAvailabilityId()
    {
      return ServiceAvailabilityId;
    }
    public String getMostAvailableStartingTime()
    {
      return MostAvailableStartingTime;
    }
    public String getServiceAvailableDay()
    {
      return ServiceAvailableDay;
    }
   private String ServiceFee,CurrentStatus ;
    public UserT(int ServiceId ,String ServiceName ,String ServiceFee,String CurrentStatus ,String ServiceAvailableDay )
    {
       this.ServiceId=ServiceId;
       this.ServiceName=ServiceName;
       this.ServiceFee=ServiceFee;
       this.CurrentStatus =CurrentStatus ;
       this.ServiceAvailableDay =ServiceAvailableDay ;
       
    
    }
    
    
    public String getServiceFee()
    {
      return ServiceName;
    }
    public String getCurrentStatus()
    {
      return CurrentStatus;
    }
  
}

  
   
