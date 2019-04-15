package com.example.group8_finalproject_w2019_mad3125.Modal;

import java.util.ArrayList;
import java.util.List;

public class Customer {

        private int Customerid;
        private String fname;
        private String lname;
        private String password;
        private String address;
        private String email;
        private String shipinfo;
        private int ccinfo;
        private List<Customer> custDetails = new ArrayList<>();

        public Customer(int customerid, String fname, String lname, String password, String address, String email, String shipinfo, int ccinfo) {
            Customerid = customerid;
            this.fname = fname;
            this.lname = lname;
            this.password = password;
            this.address = address;
            this.email = email;
            this.shipinfo = shipinfo;
            this.ccinfo = ccinfo;

        }

        public Customer() {
            this.fname = "";
            this.lname = "";
            this.address = "";
            this.ccinfo = 0;
            this.shipinfo = "";
            this.email = "";
            this.password = "";
            this.custDetails = new ArrayList<>();
        }



        public int getCustomerid() {
            return Customerid;
        }

        public void setCustomerid(int customerid) {
            Customerid = customerid;
        }

        public String getFname() {
            return fname;
        }

        public void setFname(String fname) {
            this.fname = fname;
        }

        public String getLname() {
            return lname;
        }

        public void setLname(String lname) {
            this.lname = lname;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getShipinfo() {
            return shipinfo;
        }

        public void setShipinfo(String shipinfo) {
            this.shipinfo = shipinfo;
        }

        public int getCcinfo() {
            return ccinfo;
        }

        public void setCcinfo(int ccinfo) {
            this.ccinfo = ccinfo;
        }

        public List<Customer> getCustDetails() {
            return custDetails;
        }

        public void setCustDetails(List<Customer> custDetails) {
            this.custDetails = custDetails;
        }

        @Override
        public String toString() {
            return "Customer{" +
                    "Customerid=" + Customerid +
                    ", fname='" + fname + '\'' +
                    ", lname='" + lname + '\'' +
                    ", password='" + password + '\'' +
                    ", address='" + address + '\'' +
                    ", email='" + email + '\'' +
                    ", shipinfo='" + shipinfo + '\'' +
                    ", ccinfo=" + ccinfo +
                    ", custDetails=" + custDetails +
                    '}';
        }


        public void register(Customer c)
        {
            this.custDetails.add(c);
        }


        public boolean checklogin(String email, String pass) {

            boolean ch = false;
            for (Customer c : this.custDetails) {


                if (c.getEmail().equals(email) && c.getPassword().equals(pass)) {
                    ch = true;
                    //break;
                } else {
                    ch = false;
                    // break;
                }
            }
            return ch;
        }
    }

