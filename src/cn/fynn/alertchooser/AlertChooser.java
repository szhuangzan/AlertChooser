package cn.fynn.alertchooser;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;

public class AlertChooser extends Dialog {

	public AlertChooser(Context context) {
		super(context);
	}
	
	public AlertChooser(Context context,int theme) {
		super(context,theme);
	}
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.fynn_alertchooser_normal);
	}

}
