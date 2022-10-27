package com.kpi.microservice.currencyexchangeexampleservice.demo;



public class CurrencyConversionSampleBean {

	
	
		private Long id;  
		private String from;  
		private String to;  
		private Double ConversionMultiple;  
		private Double quantity;  
		private Double totalCalculatedAmount;  
		private Double port;  
		//default constructor  
		public CurrencyConversionSampleBean()  
		{     
		}  
		//creating constructor  
		public CurrencyConversionSampleBean(Long id, String from, String to, Double conversionMultiple, Double quantity, Double totalCalculatedAmount, Double port)   
		{  
		super();  
		this.id = id;  
		this.from = from;  
		this.to = to;  
		ConversionMultiple = conversionMultiple;  
		this.quantity = quantity;  
		this.totalCalculatedAmount = totalCalculatedAmount;  
		this.port = port;  
		}  
		//creating setters and getters  
		public Long getId()   
		{  
		return id;  
		}  
		public void setId(Long id)   
		{  
		this.id = id;  
		}  
		public String getFrom()   
		{  
		return from;  
		}  
		public void setFrom(String from)   
		{  
		this.from = from;  
		}  
		public String getTo()   
		{  
		return to;  
		}  
		public void setTo(String to)   
		{  
		this.to = to;  
		}  
		public Double getConversionMultiple()   
		{  
		return ConversionMultiple;  
		}  
		public void setConversionMultiple(Double conversionMultiple)   
		{  
		ConversionMultiple = conversionMultiple;  
		}  
		public Double getQuantity()   
		{  
		return quantity;  
		}  
		public void setQuantity(Double quantity)   
		{  
		this.quantity = quantity;  
		}  
		public Double getTotalCalculatedAmount()   
		{  
		return totalCalculatedAmount;  
		}  
		public void setTotalCalculatedAmount(Double totalCalculatedAmount)   
		{  
		this.totalCalculatedAmount = totalCalculatedAmount;  
		}  
		public Double getPort()   
		{  
		return port;  
		}  
		public void setPort(Double port)   
		{  
		this.port = port;  
		}  
		} 

