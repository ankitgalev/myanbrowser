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

package org.kmtech.ui.fragments;

import org.kmtech.ui.UIManager;
import org.kmtech.R;

import android.app.ActionBar.Tab;
import android.text.TextUtils;
import android.webkit.WebView;

public class TabletWebViewFragment extends PhoneWebViewFragment {
	
	private static final int TAB_TITLE_LENGTH = 30;
	
	private Tab mTab;
	
	public TabletWebViewFragment() {	
		super();
	}
	
	public void init(UIManager uiManager, Tab tab, boolean privateBrowsing, String urlToLoad) {
		mTab = tab;
		init(uiManager, privateBrowsing, urlToLoad);
	}
	
	public void onTabSelected(Tab tab) {
		mTab = tab;
		
		if (mWebView != null) {
			mWebView.requestFocus();
		}
	}
	
	public Tab getTab() {
		return mTab;
	}
	
	public void onReceivedTitle(WebView view, String title) {
		if (view == mWebView) {
			if (!TextUtils.isEmpty(title)) {
				mTab.setText(stripTitle(title));
			} else {
				mTab.setText(R.string.NewTab);
			}
		}
	}
	
	private String stripTitle(String title) {
		if (title.length() > TAB_TITLE_LENGTH) {
			title = title.substring(0, TAB_TITLE_LENGTH) + '\u2026';
		}
		
		return title;
	}

}
