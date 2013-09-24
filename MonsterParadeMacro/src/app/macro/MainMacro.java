package app.macro;

import app.common.CommonConstants;
import app.common.CommonConstants.Mode;
import app.macro.framework.MacroBase;

public class MainMacro {

	MacroBase macro;
	
	public void start(Mode mode, int item){
		if(mode == Mode.Create){
			macro = new CreateMacro();
			macro.init(item);
			macro.start();
		}
	}
}
