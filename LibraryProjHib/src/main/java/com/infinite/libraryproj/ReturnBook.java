package com.infinite.libraryproj;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Transreturn")
public class ReturnBook {
	
	@Id
	@Column(name="tid")
	private int tid;
	
	@Column(name="Username")
	private String username;
	
	@Column(name="Bookid")
	private int bookId;
	
	@Column(name="Fromdate")
	private Date fromDate;

	public ReturnBook() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ReturnBook(int tid, String username, int bookId, Date fromDate) {
		super();
		this.tid = tid;
		this.username = username;
		this.bookId = bookId;
		this.fromDate = fromDate;
	}

	@Override
	public String toString() {
		return "ReturnBook [tid=" + tid + ", username=" + username + ", bookId=" + bookId + ", fromDate=" + fromDate
				+ "]";
	}

	public int getTid() {
		return tid;
	}

	public void setTid(int tid) {
		this.tid = tid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public Date getFromDate() {
		return fromDate;
	}

	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}

	
}