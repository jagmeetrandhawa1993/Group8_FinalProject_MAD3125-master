package com.example.group8_finalproject_w2019_mad3125.Modal;

import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private static Customer cust=new Customer();
    public static Customer getInstance( )
    {
        return cust;
    }

        private int Customerid;
        private String fname;
        private String password;
        private String address;
        private String email;
        private String creditinfo;
        private List<Customer> custDetails = new ArrayList<>();

        public Customer(int customerid, String fname,String password, String address, String email,String creditinfo) {
            Customerid = customerid;
            this.fname = fname;
            this.password = password;
            this.address = address;
            this.email = email;
            this.creditinfo = creditinfo;

        }

        public Customer() {
            this.fname = "";
            this.address = "";
            this.creditinfo ="";
            this.email = "";
            this.password = "";
            this.custDetails = new ArrayList<>();
        }

        public static Customer getCust() {
        return cust;
        }

        public static void setCust(Customer cust) {
        Customer.cust = cust;
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



        public String getCreditinfo() {
            return creditinfo;
        }

        public void setCreditinfo(String creditinfo) {
            this.creditinfo = creditinfo;
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
                    ", password='" + password + '\'' +
                    ", address='" + address + '\'' +
                    ", email='" + email + '\'' +
                    ", creditinfo=" + creditinfo +
                    ", custDetails=" + custDetails +
                    '}';
        }


        public void register(Customer c)
        {
            for (Customer c1:this.custDetails)
            {
                Log.d("userdata",c1.getEmail());
                }

            this.custDetails.add(c);
        }


        public boolean checklogin(String email, String pass) {

            boolean ch = false;
            for (Customer c : this.custDetails) {


                if (c.getEmail().equals(email) && c.getPassword().equals(pass)) {
                    ch = true;

                } else {
                    ch = false;

                }
            }
            return ch;
        }
    }

