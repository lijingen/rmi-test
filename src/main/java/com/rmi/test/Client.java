package com.rmi.test;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RMISecurityManager;
import java.rmi.RemoteException;

public class Client{
 
   public static void main(String args[]){
       try {
           Context namingContext=new InitialContext();
          /* if(System.getSecurityManager()==null){
            System.setSecurityManager(new RMISecurityManager());
           }*/
           UserService userService=(UserService) Naming.lookup("rmi://119.29.239.252:9999/userService");
           System.out.println(userService.getUser());
       } catch (NamingException e) {
           e.printStackTrace();
       } catch (NotBoundException e) {
           e.printStackTrace();
       } catch (MalformedURLException e) {
           e.printStackTrace();
       } catch (RemoteException e) {
           e.printStackTrace();
       }
   }
}