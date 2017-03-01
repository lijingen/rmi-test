package com.rmi.test;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface UserService extends Remote {
   void addUser(String user) throws RemoteException;
   String getUser() throws RemoteException;
}