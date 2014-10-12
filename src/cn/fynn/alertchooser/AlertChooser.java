package cn.fynn.alertchooser;

import java.util.ArrayList;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.Toast;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import cn.fynn.alertchooser.util.*;

public class AlertChooser extends Dialog {

	Context context;
	ArrayList<CharSequence> itemText;
	ArrayList<OnClickListener> itemClickListener;
	
	public AlertChooser(Context context) {
		super(context,R.style.AlertChooser);
		this.context = context;
	}
	
	public AlertChooser(Context context,int theme) {
		super(context,theme);
		this.context = context;
	}
	
	public void setTitle(CharSequence title){
		TextView t = (TextView) findViewById(R.id.title);
		t.setText(title);
	}
	
	public void addItem(CharSequence text,View.OnClickListener itemClickListener){
		itemText = new ArrayList<CharSequence>();
		this.itemText.add(text);
		this.itemClickListener.add(null);
		
		LinearLayout t = (LinearLayout) findViewById(R.id.content);
		
		View v = new View(context);
		v.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT,1));
		v.setBackgroundColor(Color.parseColor("#DCDCDC"));
		
		TextView tv = new TextView(context);
		LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
				LayoutParams.MATCH_PARENT,LayoutParams.WRAP_CONTENT);
		tv.setLayoutParams(params);
		tv.setGravity(Gravity.CENTER);
		tv.setClickable(true);
		int pad = Util.dip2px(context, 10);
		tv.setPadding(pad, pad, pad, pad);
		tv.setText(text);
		tv.setOnClickListener(itemClickListener);
		
		t.addView(v);
		t.addView(tv);
	}
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.fynn_alertchooser_normal);
		
		Window window = this.getWindow();
		WindowManager.LayoutParams params = window.getAttributes();
		params.width = Util.getScreenWidth(context);	
		params.gravity = Gravity.BOTTOM;
		window.setAttributes(params);	
		
		this.addItem("确定", new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Toast.makeText(context, "ok", 0).show();
			}
		});
	}

}
