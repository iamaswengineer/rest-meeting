package tr.com.can.employeemeeting.daos;

import org.springframework.stereotype.Repository;

import tr.com.can.employeemeeting.entities.Meeting;

@Repository("meetingDAO")
public class MeetingDAO extends BaseDAO<Integer, Meeting>{
	
	  public Meeting findById(Integer id) {
		  	Meeting meeting = getByID(id);
	        return meeting;
	    }
	 
	    public Boolean save(Meeting meeting) {
			Boolean result = create(meeting);
			return result;
	    }
}