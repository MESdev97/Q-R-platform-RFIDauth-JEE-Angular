package ma.fstt.metier;

import java.util.List;

public interface BaseRestMetier<RES,ID> {
	public List<RES> getAll();
    public RES get( ID id) ;
	
	public RES create(RES res);
	
	public RES update( ID id, RES res);

	public void delete( ID id);
}
