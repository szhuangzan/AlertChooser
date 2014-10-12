package cn.fynn.alertchooser.util;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;

public class Util {
	public static int dip2px(Context context, float dpValue) {  
		final float scale = context.getResources().getDisplayMetrics().density;  
		return (int) (dpValue * scale + 0.5f);  
	}
	
	/**��ȡ��Ļ�ֱ��ʿ�*/
	public static int getScreenWidth(Context context){
		DisplayMetrics dm = new DisplayMetrics();
		((Activity) context).getWindowManager().getDefaultDisplay().getMetrics(dm);
		return dm.widthPixels;
	}
}
