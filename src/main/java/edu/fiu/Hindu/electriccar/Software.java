package edu.fiu.Hindu.electriccar;

import edu.fiu.jit.SelfCheckCapable;

public class Software implements SelfCheckCapable {
	
	private String Softwaretype;
	private String VersionNumber;
	private void checkUpdates() {
		
	}
	private void getUpdates() {
}
	
	@Override
	public String getComponentName(){
		// TODO Auto-generated method stub
		return "Software";
	}
		

		@Override
		public boolean selfCheck() {
			// TODO Auto-generated method stub
			return true;
		}
}
