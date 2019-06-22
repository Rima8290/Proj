package rest;

public class PNR {
 
	private int trainNo;
	private int pnrNo;
	private Status status;
	private String date;
	public int getTrainNo() {
		return trainNo;
	}
	public void setTrainNo(int trainNo) {
		this.trainNo = trainNo;
	}
	public int getPnrNo() {
		return pnrNo;
	}
	public void setPnrNo(int pnrNo) {
		this.pnrNo = pnrNo;
	}
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	//private ;
	public static enum Status{
		RAC, WAITING,CONFIRMED;
		
	}
}
