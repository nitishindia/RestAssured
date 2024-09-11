package Payload;

import java.util.*;

public class PojoPayloa {

	   int page;
	   int perpage;
	   int total;
	   int total_pages;
	   ArrayList<Object> data;
	   /**
	    * 
	    * @param page
	    * @param perpage
	    * @param total
	    * @param total_pages
	    * @param data
	    */
	public PojoPayloa(int page, int perpage, int total, int total_pages, ArrayList<Object> data) {
		super();
		this.page = page;
		this.perpage = perpage;
		this.total = total;
		this.total_pages = total_pages;
		this.data = data;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public int getPerpage() {
		return perpage;
	}
	public void setPerpage(int perpage) {
		this.perpage = perpage;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public int getTotal_pages() {
		return total_pages;
	}
	public void setTotal_pages(int total_pages) {
		this.total_pages = total_pages;
	}
	public ArrayList<Object> getData() {
		return data;
	}
	public void setData(ArrayList<Object> data) {
		this.data = data;
	}
	   
}


class data{
	/**
	 * @author dell
	 */
	  int id;
      String email;
      String first_name;
      String last_name;
      
      /**
       * 
       * @param id
       * @param email
       * @param first_name
       * @param last_name
       */
	public data(int id, String email, String first_name, String last_name) {
		super();
		this.id = id;
		this.email = email;
		this.first_name = first_name;
		this.last_name = last_name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
      
      
     
}