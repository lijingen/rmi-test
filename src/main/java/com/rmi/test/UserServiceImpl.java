package com.rmi.test;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class UserServiceImpl extends UnicastRemoteObject implements UserService {
    String service;
    protected UserServiceImpl(String service) throws RemoteException {
        this.service=service;
    }

    public void addUser(String user)throws RemoteException {
   System.out.println("add"+user);
   };
  public String getUser()throws RemoteException{
   System.out.println("getUser");
   return "lijingen";
   };
}