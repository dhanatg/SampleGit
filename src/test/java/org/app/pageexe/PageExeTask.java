package org.app.pageexe;

import org.app.base.BaseClassTask;
import org.app.locator.LocatorTask;

public class PageExeTask extends LocatorTask {
	
	public static void username() {
		BaseClassTask.input_text(LocatorTask.getusername(),BaseClassTask.excelread_base(1, 0));
	}
	public static void password() {
		BaseClassTask.input_text(LocatorTask.getpassword(), BaseClassTask.excelread_base(1, 1));
	}

	public static void loginButton() {
		BaseClassTask.click_value(LocatorTask.getloginbutton());
	}
}
