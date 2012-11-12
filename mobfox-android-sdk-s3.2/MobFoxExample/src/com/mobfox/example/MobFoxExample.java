package com.mobfox.example;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.mobfox.example.R;
import com.mobfox.sdk.BannerListener;
import com.mobfox.sdk.MobFoxView;
import com.mobfox.sdk.Mode;
import com.mobfox.sdk.RequestException;

public class MobFoxExample extends Activity implements BannerListener {
	/** Called when the activity is first created. */
	private RelativeLayout layout;

	private MobFoxView mobfoxView;
	
	final Handler updateHandler = new Handler();
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.mobfox_example);
		layout = (RelativeLayout) findViewById(R.id.mobfoxContent);

		mobfoxView = new MobFoxView(this, "fed5ae7d80eb8378ddd8fd1b85e305ab", Mode.LIVE, true, true);
		
		mobfoxView.setBannerListener(this);
		mobfoxView.setVisibility(View.GONE);
		mobfoxView.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				updateHandler.post(new Runnable() {
					public void run() {
						TextView errorText = (TextView)findViewById(R.id.errorText);
						errorText.setText("View clicked ad");
						Log.v("MbFoxExample","OnClick");
					}
				});
				
			}});
		layout.addView(mobfoxView);
	}
	
	@Override
	protected void onPause() {
		super.onPause();
		mobfoxView.pause();
	}

	@Override
	protected void onResume() {
		super.onResume();
		mobfoxView.resume();
	}
	
	@Override
	public void onConfigurationChanged(Configuration newConfig) {
	  super.onConfigurationChanged(newConfig);
	  mobfoxView.pause();
	  mobfoxView.resume();
	}

	@Override
	public void noAdFound() {
		updateHandler.post(new Runnable() {
			public void run() {
				TextView errorText = (TextView)findViewById(R.id.errorText);
				errorText.setText("No ad Found");
			}
		});
	}

	@Override
	public void bannerLoadFailed(RequestException e) {
		updateHandler.post(new Runnable() {
			public void run() {
				TextView errorText = (TextView)findViewById(R.id.errorText);
				errorText.setText("Error loading ad");
			}
		});
	}


	@Override
	public void bannerLoadSucceeded() {
		updateHandler.post(new Runnable() {
			public void run() {
				TextView errorText = (TextView)findViewById(R.id.errorText);
				errorText.setText("Ad loaded successfully");
				mobfoxView.setVisibility(View.VISIBLE);
			}
		});
	}
	@Override
	public void adClicked() {
		updateHandler.post(new Runnable() {
			public void run() {
				TextView errorText = (TextView)findViewById(R.id.errorText);
				errorText.setText("Ad clicked");
			}
		});				
	}
	
}