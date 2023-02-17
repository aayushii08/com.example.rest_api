package com.icon.Employee;

import jakarta.persistence.*;

@Entity
@Table(name = "new_employee")
public class EmployeeEntity {


        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name="emp_id")
        private Long id;

        @Column(name="first_name")
        private String firstName;

        @Column(name="last_name")
        private String lastName;

        @Column(name="email_id")
        private String emailId;




        public EmployeeEntity(long id, String firstName, String lastName, String emailId) {
                this.id=id;
                this.firstName=firstName;
                this.lastName=lastName;
                this.emailId=emailId;

        }

        public EmployeeEntity() {

        }

        public Long getId () {
                return id;
        }

        public void setId (Long id){
                this.id = id;
        }

        public String getFirstName () {
                return firstName;
        }

        public void setFirstName (String firstName){
                this.firstName = firstName;

        }

        public String getLastName() {
                return lastName;
        }

        public void setLastName(String lastName) {
                this.lastName = lastName;
        }

        public String getEmailId() {
                return emailId;
        }

        public void setEmailId(String emailId) {
                this.emailId = emailId;
        }

        @Override
        public String toString() {
                return "EmployeeEntity{" +
                        "id=" + id +
                        ", firstName='" + firstName + '\'' +
                        ", lastName='" + lastName + '\'' +
                        ", emailId='" + emailId + '\'' +
                        '}';
        }
}