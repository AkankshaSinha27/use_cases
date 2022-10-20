package com.Insurance.Assign_Insurance;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="Insurance_Table")
public class InsurEntity {
		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
		private Integer Id;
		private String Client_name;
		private Integer Client_age;
		private String Insurance_policy;
		private String Issue_date;
		private String expiry_date;
		private String Insurance_term;
		
		public Integer getId() {
			return Id;
		}
		public void setId(Integer id) {
			Id = id;
		}
		public String getClient_name() {
			return Client_name;
		}
		public void setClient_name(String client_name) {
			Client_name = client_name;
		}
		public Integer getClient_age() {
			return Client_age;
		}
		public void setClient_age(Integer client_age) {
			Client_age = client_age;
		}
		public String getInsurance_policy() {
			return Insurance_policy;
		}
		public void setInsurance_policy(String insurance_policy) {
			Insurance_policy = insurance_policy;
		}
		public String getIssue_date() {
			return Issue_date;
		}
		public void setIssue_date(String issue_date) {
			Issue_date = issue_date;
		}
		public String getExpiry_date() {
			return expiry_date;
		}
		public void setExpiry_date(String expiry_date) {
			this.expiry_date = expiry_date;
		}
		public String getInsurance_term() {
			return Insurance_term;
		}
		public void setInsurance_term(String insurance_term) {
			Insurance_term = insurance_term;
		}
		
		
		
}
