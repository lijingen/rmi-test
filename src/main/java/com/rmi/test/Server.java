package com.rmi.test;

import java.net.InetAddress;
import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.RMISocketFactory;

public class Server {
 
   public static void main(String args[]){
           try {
               String hostIP = InetAddress.getLocalHost().getHostAddress();
               System.out.println("hostIp:" + hostIP);
               int rmiServerPort = 9999;  //数据传输服务为8400
               String bindName = "userService";
               String bindUrl = "//"+hostIP+":"+ rmiServerPort +"/"+bindName;
               UserService service = new UserServiceImpl("userService");
              /* System.setProperty("java.rmi.server.hostname","119.29.239.252");
               System.out.println(System.getProperty("java.rmi.server.hostname"));*/
               RMISocketFactory.setSocketFactory(new SMRMISocket());
               LocateRegistry.createRegistry(rmiServerPort);
               Naming.rebind(bindUrl, service);
           } catch (Exception e) {
               e.printStackTrace();
               System.out.println("exception");
           }
           System.out.println("add a object");
   }
}