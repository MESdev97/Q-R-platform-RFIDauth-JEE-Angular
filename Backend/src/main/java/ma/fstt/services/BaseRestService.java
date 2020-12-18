package ma.fstt.services;

import java.util.List;

public interface BaseRestService<RES,ID> {
	
	public List<RES> getAll();
	   
	public RES get( ID id) ;
	
	public RES create(RES resource);
	
	public RES update( ID id, RES res);

	public void delete( ID id);

}
