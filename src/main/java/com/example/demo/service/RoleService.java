package com.example.demo.service;

public interface RoleService {
    String Display();

    String Query(String type);

    String Delete(String type);

    String Insert(String type,String ds,String pm);

    String Info();

}
