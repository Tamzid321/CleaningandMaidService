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
public class Userb {
    private int ClientId,TeamId,HeadOfTheTeam ;
    private String ClientName;
    
    
      public Userb(int ClientId, int TeamId,int HeadOfTheTeam,String ClientName )
    {
       
       this.ClientId=ClientId;
       this.TeamId=TeamId;
       this.HeadOfTheTeam=HeadOfTheTeam;
   
       this.ClientName = ClientName ;
    
 
       
       
       
       

    }
  
  
    public int getClientId()
    {
      return ClientId;
    }
    
     public int getTeamId()
    {
      return TeamId;
    }
   
      public int getHeadOfTheTeam()
    {
      return HeadOfTheTeam;
    }
   
   
   public String getClientName()
    {
      return ClientName;
    }

  
  
}
