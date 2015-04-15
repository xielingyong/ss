package com.example.ssssss;

import com.example.testdemo.Utils.HTML5WebView;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;

public class MainActivity extends Activity {
	//private String url="http://mobile.wxb.com.cn";
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		HTML5WebView hv=new HTML5WebView(MainActivity.this);//添加了一下注释
		hv.initView();
	}


}
