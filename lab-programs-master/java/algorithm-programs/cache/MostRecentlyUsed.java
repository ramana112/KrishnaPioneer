package algorithem.programes;

import java.util.LinkedHashMap;
import java.util.Map;
import algorithem.programes.*;

public class MostRecentlyUsed extends AbstractCache {

	 public MostRecentlyUsed(int cacheSize) {
		super(cacheSize);
		// TODO Auto-generated constructor stub
	}

	
	    @Override
	    public void put(Object key, Object val) {
	        // check if pruning is needed
	        if (list.size() == this.cacheSize) {
	            this.prune();
	        }
	        list.addLast(key);
	        map.put(key, val);
	    }
	 
	    @Override
	    public Object get(Object key) {
	        boolean res = list.remove(key);
	        if (res) {
	            list.addLast(key);
	            return map.get(key);
	        }
	        return null;
	    }
	}
	
	

