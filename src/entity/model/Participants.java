package entity.model;

public class Participants {
	 private int ParticipantID;   
	  private String ParticipantName ;
	  private String ParticipantType ;
	  private int EventID;         
	  private int PetID;
	  //default cons
	  public Participants () {
			System.out.println("Default Constructor of Participants  Class");
		}
	  //parametarized cons
	  public Participants(int participantID, String participantName, String participantType, int eventID, int petID) {
	        this.ParticipantID = participantID;
	        this.ParticipantName = participantName;
	        this.ParticipantType = participantType;
	        this.EventID = eventID;
	        this.PetID = petID;
	    }
	  
	@Override
	public String toString() {
		return "Participants [ParticipantID=" + ParticipantID + ", ParticipantName=" + ParticipantName
				+ ", ParticipantType=" + ParticipantType + ", EventID=" + EventID + ", PetID=" + PetID + "]";
	}
	public int getParticipantID() {
		return ParticipantID;
	}
	public void setParticipantID(int participantID) {
		ParticipantID = participantID;
	}
	public String getParticipantName() {
		return ParticipantName;
	}
	public void setParticipantName(String participantName) {
		ParticipantName = participantName;
	}
	public String getParticipantType() {
		return ParticipantType;
	}
	public void setParticipantType(String participantType) {
		ParticipantType = participantType;
	}
	public int getEventID() {
		return EventID;
	}
	public void setEventID(int eventID) {
		EventID = eventID;
	}
	public int getPetID() {
		return PetID;
	}
	public void setPetID(int petID) {
		PetID = petID;
	}
	  
	  
}
