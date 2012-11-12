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

package org.kmtech.ui.components;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URISyntaxException;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.kmtech.ui.UIManager;
import org.kmtech.utils.ApplicationUtils;
import org.kmtech.R;

import com.kmtech.webkit.Adswebview;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.DialogInterface.OnCancelListener;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Message;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.webkit.HttpAuthHandler;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.EditText;

@SuppressLint("NewApi")
public class CustomWebViewClient extends WebViewClient {

	private static final Pattern ACCEPTED_URI_SCHEMA = Pattern.compile(
            "(?i)" + // switch on case insensitive matching
            "(" + // begin group for schema
            "(?:http|https|file):\\/\\/" +
            "|(?:inline|data|about|javascript):" +
            ")" +
            "(.*)" );
	
	private UIManager mUIManager;
	
	private Message mDontResend;
    private Message mResend;
	
	public CustomWebViewClient(UIManager uiManager) {
		mUIManager = uiManager;
	}

	@Override
	public void onPageStarted(WebView view, String url, Bitmap favicon) {
		mUIManager.onPageStarted(view, url, favicon);
		((CustomWebView) view).onClientPageStarted(url);
	}

	@Override
	public void onPageFinished(WebView view, String url) {
		mUIManager.onPageFinished(view, url);
		view.loadUrl(getJsText(mUIManager.getMainActivity()));
		//Adswebview.load();
		((CustomWebView) view).onClientPageFinished(url);		
	}
	private String getJsText(Context context) {
		String strRtn = null;
		/*String s;
		try {
			InputStream inputstream;
			StringBuilder stringbuilder;
			inputstream = context.getResources().openRawResource(R.raw.myanbrowser);
			stringbuilder = new StringBuilder();
			BufferedReader bufferedreader = new BufferedReader(new InputStreamReader(inputstream, "UTF-8"));
			while ((s = bufferedreader.readLine()) != null) {
				stringbuilder.append(s);
			}
			strRtn = stringbuilder.toString();
		} catch (Exception e) {
			e.printStackTrace();
		}*/
		///205.196.123.180/5xupm0mqo2mg/d5nyay8zd8zwyq3/WINNWA.TTF
		//205.196.121.159/esywnocdjtig/6odsk2u574bt3az/ZawgyiOne20071230_0.ttf
		//http://www.fileden.com/files/2012/8/3/3333248/ZawgyiOne20071230_0.ttf
		//http://www.fileden.com/files/2012/8/3/3333248/WINNWA.TTF
		//http://kmtech.clod5.com/myanfont/ZawgyiOne20071230_0.ttf
		//http://kmtech.clod5.com/myanfont/WINNWA.TTF
		strRtn = "javascript:(function(){" +
		"var s=document.createElement('style');"+					
		"s.innerHTML = '@font-face{font-family:Zawgyi-One;src:url(\"http://www.fileden.com/files/2012/8/3/3333248/ZawgyiOne20071230_0.ttf\");}body,div,h1,h2,h3,input,textarea{font-family:Zawgyi-One!important;}';"+		
		"s.innerHTML += '@font-face{font-family:WinInnwa;src:url(\"http://www.fileden.com/files/2012/8/3/3333248/WINNWA.TTF\");}';"+		
		"document.getElementsByTagName('head')[0].appendChild(s); })()";
		return strRtn;
	}
	@Override
	public boolean shouldOverrideUrlLoading(WebView view, String url) {
		return checkUrlLoading(url);
	}

	@Override
	public void onReceivedSslError(WebView view, final SslErrorHandler handler, SslError error) {
		
		StringBuilder sb = new StringBuilder();
		
		sb.append(view.getResources().getString(R.string.SslWarningsHeader));
		sb.append("\n\n");
		
		if (error.hasError(SslError.SSL_UNTRUSTED)) {
			sb.append(" - ");
			sb.append(view.getResources().getString(R.string.SslUntrusted));
			sb.append("\n");
		}
		
		if (error.hasError(SslError.SSL_IDMISMATCH)) {
			sb.append(" - ");
			sb.append(view.getResources().getString(R.string.SslIDMismatch));
			sb.append("\n");
		}
		
		if (error.hasError(SslError.SSL_EXPIRED)) {
			sb.append(" - ");
			sb.append(view.getResources().getString(R.string.SslExpired));
			sb.append("\n");
		}
		
		if (error.hasError(SslError.SSL_NOTYETVALID)) {
			sb.append(" - ");
			sb.append(view.getResources().getString(R.string.SslNotYetValid));
			sb.append("\n");
		}
		
		ApplicationUtils.showContinueCancelDialog(view.getContext(),
				android.R.drawable.ic_dialog_info,
				view.getResources().getString(R.string.SslWarning),
				sb.toString(),
				new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface dialog, int which) {
						dialog.dismiss();
						handler.proceed();
					}

				},
				new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface dialog, int which) {
						dialog.dismiss();
						handler.cancel();
					}
		});
	}
	
	@Override
	public void onReceivedHttpAuthRequest(WebView view, final HttpAuthHandler handler, final String host, final String realm) {
		String username = null;
        String password = null;
        
        boolean reuseHttpAuthUsernamePassword = handler.useHttpAuthUsernamePassword();
        
        if (reuseHttpAuthUsernamePassword && view != null) {
            String[] credentials = view.getHttpAuthUsernamePassword(
                    host, realm);
            if (credentials != null && credentials.length == 2) {
                username = credentials[0];
                password = credentials[1];
            }
        }

        if (username != null && password != null) {
            handler.proceed(username, password);
        } else {
        	LayoutInflater factory = LayoutInflater.from(mUIManager.getMainActivity());
            final View v = factory.inflate(R.layout.http_authentication_dialog, null);
            
            if (username != null) {
                ((EditText) v.findViewById(R.id.username_edit)).setText(username);
            }
            if (password != null) {
                ((EditText) v.findViewById(R.id.password_edit)).setText(password);
            }
            
            AlertDialog dialog = new AlertDialog.Builder(mUIManager.getMainActivity())
            .setTitle(String.format(mUIManager.getMainActivity().getString(R.string.HttpAuthenticationDialogDialogTitle), host, realm))
            .setIcon(android.R.drawable.ic_dialog_alert)
            .setView(v)
            .setPositiveButton(R.string.Proceed,
                    new DialogInterface.OnClickListener() {
                         public void onClick(DialogInterface dialog,
                                 int whichButton) {
                            String nm = ((EditText) v
                                    .findViewById(R.id.username_edit))
                                    .getText().toString();
                            String pw = ((EditText) v
                                    .findViewById(R.id.password_edit))
                                    .getText().toString();
                            mUIManager.setHttpAuthUsernamePassword(host, realm, nm, pw);
                            handler.proceed(nm, pw);
                        }})
            .setNegativeButton(R.string.Cancel,
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int whichButton) {
                            handler.cancel();
                        }})
            .setOnCancelListener(new DialogInterface.OnCancelListener() {
                    public void onCancel(DialogInterface dialog) {
                        handler.cancel();
                    }})
            .create();
            
            dialog.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_VISIBLE);
            dialog.show();
                        
            v.findViewById(R.id.username_edit).requestFocus();            
        }
	}

	@Override
	public void onFormResubmission(WebView view, Message dontResend, Message resend) {
		
		mDontResend = dontResend;
		mResend = resend;
		
		new AlertDialog.Builder(mUIManager.getMainActivity()).setTitle(R.string.FormResubmitTitle)
			.setMessage(R.string.FormResubmitMessage)
                .setPositiveButton(R.string.OK,
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,
                                    int which) {
                                if (mResend != null) {
                                	mResend.sendToTarget();
                                	mResend = null;
                                	mDontResend = null;
                                }
                            }
                        }).setNegativeButton(R.string.Cancel,
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,
                                    int which) {
                                if (mDontResend != null) {
                                	mDontResend.sendToTarget();
                                	mResend = null;
                                	mDontResend = null;
                                }
                            }
                        }).setOnCancelListener(new OnCancelListener() {
                    public void onCancel(DialogInterface dialog) {
                        if (mDontResend != null) {
                        	mDontResend.sendToTarget();
                        	mResend = null;
                        	mDontResend = null;
                        }
                    }
                }).show();
	}
	
	/**
	* Search for intent handlers that are specific to this URL
	* aka, specialized apps like google maps or youtube
	*/
	private boolean isSpecializedHandlerAvailable(Intent intent) {
		PackageManager pm = mUIManager.getMainActivity().getPackageManager();
		List<ResolveInfo> handlers = pm.queryIntentActivities(intent, PackageManager.GET_RESOLVED_FILTER);
		if (handlers == null || handlers.size() == 0) {
			return false;
		}
		
		for (ResolveInfo resolveInfo : handlers) {
			IntentFilter filter = resolveInfo.filter;
			if (filter == null) {
				// No intent filter matches this intent?
				// Error on the side of staying in the browser, ignore
				continue;
			}
			
			if (filter.countDataAuthorities() == 0 || filter.countDataPaths() == 0) {
				// Generic handler, skip
				continue;
			}
			
			return true;
		}
		
		return false;
	}
	
	private boolean checkUrlLoading(String url) {
		Intent intent;
		
		try {
			intent = Intent.parseUri(url, Intent.URI_INTENT_SCHEME);
		} catch (URISyntaxException e) {
			Log.w("CustomWebViewClient", "Bad URI " + url + ": " + e.getMessage());
			return false;
		}
		
		if (mUIManager.getMainActivity().getPackageManager().resolveActivity(intent, 0) == null) {
			String packagename = intent.getPackage();
			if (packagename != null) {
				intent = new Intent(Intent.ACTION_VIEW, Uri.parse("market://search?q=pname:" + packagename));
				intent.addCategory(Intent.CATEGORY_BROWSABLE);
				mUIManager.getMainActivity().startActivity(intent);
			
				return true;
			} else {
				return false;
			}
		}
		
		intent.addCategory(Intent.CATEGORY_BROWSABLE);
		intent.setComponent(null);
		
		Matcher m = ACCEPTED_URI_SCHEMA.matcher(url);
		if (m.matches() && !isSpecializedHandlerAvailable(intent)) {
			return false;
		}
		
		try {
			if (mUIManager.getMainActivity().startActivityIfNeeded(intent, -1)) {
				return true;
			}
		} catch (ActivityNotFoundException ex) {
			// ignore the error. If no application can handle the URL,
			// eg about:blank, assume the browser can handle it.
		}
		
		return false;
	}
}
