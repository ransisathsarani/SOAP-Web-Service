/**
 * ProductServiceImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.soap.service;

public interface ProductServiceImpl extends java.rmi.Remote {
    public com.soap.model.Product getProduct(int id) throws java.rmi.RemoteException;
    public com.soap.model.Product[] getAllProducts() throws java.rmi.RemoteException;
    public boolean deleteProduct(int id) throws java.rmi.RemoteException;
    public boolean addProduct(com.soap.model.Product p) throws java.rmi.RemoteException;
}
