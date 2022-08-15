/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.raven.model;

import java.util.Objects;

/**
 *
 * @author User
 */
public class Patient {
    private static int id = 1000; 
    private String staffId;
    private String status;

    public Patient(String staffId, String status) {
        this.staffId = staffId;
        this.status = status;
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Patient.id = id;
    }

    public String getStaffId() {
        return staffId;
    }

    public void setStaffId(String staffId) {
        this.staffId = staffId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Patient{" + "staffId=" + staffId + ", status=" + status + '}';
    }
    
    
          
          
}
