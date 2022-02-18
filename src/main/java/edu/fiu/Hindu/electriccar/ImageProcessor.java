package edu.fiu.Hindu.electriccar;

import edu.fiu.jit.SelfCheckCapable;

public class ImageProcessor implements SelfCheckCapable {
	
	private void getImage() {}
	private void processImage() {}
	
	@Override
	public String getComponentName(){
		// TODO Auto-generated method stub
		return "Image Processor";
	}
		

		@Override
		public boolean selfCheck() {
			// TODO Auto-generated method stub
			return true;
		}

}
