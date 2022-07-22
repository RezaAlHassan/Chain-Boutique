/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication1.Model;

import java.io.Serializable;

/**
 *
 * @author Reza
 */
public class Message implements Serializable{
   
    private final String messageBody;
    private final String messageFrom;
    
    public Message(String messageBody, String messageFrom){
        this.messageBody = messageBody;
        this.messageFrom = messageFrom;

     }
    
    public String messageToString(){
        
        return messageBody + " from "+messageFrom;
    }
     public String getMessageBody() {
     return messageBody;
  }
    }
    
    
    

