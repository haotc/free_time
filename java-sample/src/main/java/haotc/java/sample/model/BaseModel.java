package haotc.java.sample.model;

import java.io.Serializable;
import java.util.Date;

public class BaseModel implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private int id;
	private Date createdDate;
	private Date updatedDate;
	private int updatedUserId;
}
