/*
 * Tint Browser for Android
 * 
 * Copyright (C) 2012 - to infinity and beyond J. Devauchelle and contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.kmtech.addons.framework;

import android.os.Parcel;

public class LoadUrlAction extends TabAction {

	private String mUrl;
	private boolean mLoadRawUrl;
	
	public LoadUrlAction(String url) {
		this(null, url, false);
	}
	
	public LoadUrlAction(String tabId, String url) {
		this(tabId, url, false);
	}
	
	public LoadUrlAction(String url, boolean loadRawUrl) {
		this(null, url, loadRawUrl);
	}
	
	public LoadUrlAction(String tabId, String url, boolean loadRawUrl) {
		super(ACTION_LOAD_URL, tabId);
		
		mUrl = url;
		mLoadRawUrl = loadRawUrl;
	}
	
	public LoadUrlAction(Parcel in) {
		super(in, ACTION_LOAD_URL);
		
		mUrl = in.readString();
		mLoadRawUrl = in.readInt() > 0 ? true : false;
	}
	
	public String getUrl() {
		return mUrl;
	}
	
	public boolean getLoadRawUrl() {
		return mLoadRawUrl;
	}

	@Override
	public void writeToParcel(Parcel dest, int flags) {
		super.writeToParcel(dest, flags);
		
		dest.writeString(mUrl);
		dest.writeInt(mLoadRawUrl ? 1 : 0);
	}
	
}
