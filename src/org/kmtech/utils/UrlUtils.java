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

package org.kmtech.utils;

import org.kmtech.R;

import android.content.Context;
import android.preference.PreferenceManager;

/**
 * Url management utils.
 */
public class UrlUtils {

	/**
	 * Check if a string is an url.
	 * For now, just consider that if a string contains a dot, it is an url.
	 * @param url The url to check.
	 * @return True if the string is an url.
	 */
	public static boolean isUrl(String url) {
		return url.equals(Constants.URL_ABOUT_BLANK) ||
			url.equals(Constants.URL_ABOUT_START) ||
			url.contains(".");
	}
	
	/**
	 * Get the current search url.
	 * @param context The current context.
	 * @param searchTerms The terms to search for.
	 * @return The search url.
	 */
	public static String getSearchUrl(Context context, String searchTerms) {
		String currentSearchUrl = PreferenceManager.getDefaultSharedPreferences(context).getString(Constants.PREFERENCE_SEARCH_URL, context.getString(R.string.SearchUrlGoogle));
		return String.format(currentSearchUrl, searchTerms);
	}
	
	/**
	 * Check en url. Add http:// before if missing.
	 * @param url The url to check.
	 * @return The modified url if necessary.
	 */
	public static String checkUrl(String url) {
		if ((url != null) &&
    			(url.length() > 0)) {
    	
    		if ((!url.startsWith("http://")) &&
    				(!url.startsWith("https://")) &&
    				(!url.startsWith("file://")) &&
    				(!url.startsWith(Constants.URL_ABOUT_BLANK)) &&
    				(!url.startsWith(Constants.URL_ABOUT_START))) {
    			
    			url = "http://" + url;
    			
    		}
		}
		
		return url;
	}		
	
}
