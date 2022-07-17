package com.bridgelabz.oops;


class Main {


        public static void main(String[] args)
        {
            System.out.println("welcome to address book system");
            AddressBookSystem myEntry=new AddressBookSystem();
            String firstName="bridgelabz" ;
            String lastName="RFP-169" ;
            String address="mango";
            String city="jsr";
            String state="jharkhand";
            long zip=021;

            long phoneNumber = 1256234581;
            String Email="mango@123.gmAIL.Com";



            myEntry.setFirstName(firstName);
            myEntry.setLastName(lastName);
            myEntry.setAddress(address);
            myEntry.setCity(city);
            myEntry.setZip(zip);
            myEntry.setEmail(Email);
            myEntry.setPhoneNumber(phoneNumber);
            myEntry.setState(address);



            System.out.println("My name is :"+ myEntry.getFirstName());
            System.out.println("My Last name is"+myEntry.getLastName());
            System.out.println("adress is "+myEntry.getAddress());
            System.out.println("city is"+myEntry.getCity());
            System.out.println("phone number is"+myEntry.getPhoneNumber());
            System.out.println("state is"+myEntry.getState());
            System.out.println("zip number is"+myEntry.getZip());


        }
    }

    public class AddressBookSystem {

        private String firstName;
        private String lastName;
        private String address;
        private String city;


        private String state;
        private long zip;
        private long phoneNumber;
        private String Email;



        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }
        public void setLastName(String lastName){
            this.lastName = lastName;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public void setCity(String city) {
            this.city = city;

        }

        public void setState(String State) {
            this.state=state;
        }

        public void setZip(long zip){
            this.zip=zip;
        }

        public void setPhoneNumber(long phoneNumber)
        {
            this.phoneNumber = phoneNumber;
        }

        public void setEmail(String pEmail) {
            Email = pEmail;
        }

        public String getFirstName() {
            return firstName;
        }
        public String getLastName() {
            return lastName;
        }
        public String getAddress() {
            return address;
        }

        public String getCity()
        {
            return city;
        }

        public String getState() {
            return state;
        }

        public long getZip() {
            return zip;
        }

        public long getPhoneNumber() {
            return phoneNumber;
        }

        public String getEmail() {
            return Email;
        }
}






