package ch12;
//ÇÏ´ÂÁß
class Obj {
	int obj_var;
	
	Obj(int obj_var){
		this.obj_var = obj_var;
	}
}

class ObjOverride {
	int obj_var;
	
	ObjOverride(int obj_var) {
		this.obj_var = obj_var;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof ObjOverride) {
			return true ;
		}else {
			return false;
		}
	}
}

public class P286 {

}
