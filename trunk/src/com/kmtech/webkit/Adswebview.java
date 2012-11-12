/*
 * Tint Browser for Android
 * 
 * Copyright (C) 2012 - to infinity and beyond J. Devauchelle and contributors.
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * version 3 as published by the Free Software Foundation.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 */

package com.kmtech.webkit;

import android.content.Context;
import android.util.AttributeSet;
import android.webkit.WebView;

public class Adswebview extends WebView{
	
	
	
	


static //
	Adswebview ads;
public Adswebview(Context context, AttributeSet attrs) {
	super(context, attrs);
	ads  = this;
	this.getSettings().setAppCacheEnabled(false);
	this.loadUrl("file:///android_asset/ads.html");
}

public Adswebview(Context context, AttributeSet attrs, int defStyle) {
	super(context, attrs, defStyle);
	ads  = this;
	this.getSettings().setAppCacheEnabled(false);
	this.loadUrl("file:///android_asset/ads.html");
}

public Adswebview(Context context) {
	super(context);
	ads  = this;
	this.getSettings().setAppCacheEnabled(false);
	this.loadUrl("file:///android_asset/ads.html");
}
public static void load(){
	ads.loadUrl("file:///android_asset/ads.html");
}
}