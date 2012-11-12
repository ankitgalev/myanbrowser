/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /Users/kyawmyinttin/AndroidProject/KMTech Project/KMyanBrowser/src/org/kmtech/addons/framework/IAddon.aidl
 */
package org.kmtech.addons.framework;
/**
 * AIDL interface for an addon service.
 */
public interface IAddon extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements org.kmtech.addons.framework.IAddon
{
private static final java.lang.String DESCRIPTOR = "org.kmtech.addons.framework.IAddon";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an org.kmtech.addons.framework.IAddon interface,
 * generating a proxy if needed.
 */
public static org.kmtech.addons.framework.IAddon asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = (android.os.IInterface)obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof org.kmtech.addons.framework.IAddon))) {
return ((org.kmtech.addons.framework.IAddon)iin);
}
return new org.kmtech.addons.framework.IAddon.Stub.Proxy(obj);
}
public android.os.IBinder asBinder()
{
return this;
}
@Override public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException
{
switch (code)
{
case INTERFACE_TRANSACTION:
{
reply.writeString(DESCRIPTOR);
return true;
}
case TRANSACTION_onBind:
{
data.enforceInterface(DESCRIPTOR);
this.onBind();
reply.writeNoException();
return true;
}
case TRANSACTION_onUnbind:
{
data.enforceInterface(DESCRIPTOR);
this.onUnbind();
reply.writeNoException();
return true;
}
case TRANSACTION_getName:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _result = this.getName();
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_getShortDescription:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _result = this.getShortDescription();
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_getDescription:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _result = this.getDescription();
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_getContact:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _result = this.getContact();
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_getCallbacks:
{
data.enforceInterface(DESCRIPTOR);
int _result = this.getCallbacks();
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_onPageStarted:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _arg1;
_arg1 = data.readString();
java.util.List<org.kmtech.addons.framework.Action> _result = this.onPageStarted(_arg0, _arg1);
reply.writeNoException();
reply.writeTypedList(_result);
return true;
}
case TRANSACTION_onPageFinished:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _arg1;
_arg1 = data.readString();
java.util.List<org.kmtech.addons.framework.Action> _result = this.onPageFinished(_arg0, _arg1);
reply.writeNoException();
reply.writeTypedList(_result);
return true;
}
case TRANSACTION_onTabOpened:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.util.List<org.kmtech.addons.framework.Action> _result = this.onTabOpened(_arg0);
reply.writeNoException();
reply.writeTypedList(_result);
return true;
}
case TRANSACTION_onTabClosed:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.util.List<org.kmtech.addons.framework.Action> _result = this.onTabClosed(_arg0);
reply.writeNoException();
reply.writeTypedList(_result);
return true;
}
case TRANSACTION_onTabSwitched:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.util.List<org.kmtech.addons.framework.Action> _result = this.onTabSwitched(_arg0);
reply.writeNoException();
reply.writeTypedList(_result);
return true;
}
case TRANSACTION_getContributedMainMenuItem:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _arg1;
_arg1 = data.readString();
java.lang.String _arg2;
_arg2 = data.readString();
java.lang.String _result = this.getContributedMainMenuItem(_arg0, _arg1, _arg2);
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_onContributedMainMenuItemSelected:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _arg1;
_arg1 = data.readString();
java.lang.String _arg2;
_arg2 = data.readString();
java.util.List<org.kmtech.addons.framework.Action> _result = this.onContributedMainMenuItemSelected(_arg0, _arg1, _arg2);
reply.writeNoException();
reply.writeTypedList(_result);
return true;
}
case TRANSACTION_getContributedLinkContextMenuItem:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
java.lang.String _arg2;
_arg2 = data.readString();
java.lang.String _result = this.getContributedLinkContextMenuItem(_arg0, _arg1, _arg2);
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_onContributedLinkContextMenuItemSelected:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
java.lang.String _arg2;
_arg2 = data.readString();
java.util.List<org.kmtech.addons.framework.Action> _result = this.onContributedLinkContextMenuItemSelected(_arg0, _arg1, _arg2);
reply.writeNoException();
reply.writeTypedList(_result);
return true;
}
case TRANSACTION_getContributedHistoryBookmarksMenuItem:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _result = this.getContributedHistoryBookmarksMenuItem(_arg0);
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_onContributedHistoryBookmarksMenuItemSelected:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.util.List<org.kmtech.addons.framework.Action> _result = this.onContributedHistoryBookmarksMenuItemSelected(_arg0);
reply.writeNoException();
reply.writeTypedList(_result);
return true;
}
case TRANSACTION_getContributedBookmarkContextMenuItem:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _result = this.getContributedBookmarkContextMenuItem(_arg0);
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_onContributedBookmarkContextMenuItemSelected:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _arg1;
_arg1 = data.readString();
java.lang.String _arg2;
_arg2 = data.readString();
java.util.List<org.kmtech.addons.framework.Action> _result = this.onContributedBookmarkContextMenuItemSelected(_arg0, _arg1, _arg2);
reply.writeNoException();
reply.writeTypedList(_result);
return true;
}
case TRANSACTION_getContributedHistoryContextMenuItem:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _result = this.getContributedHistoryContextMenuItem(_arg0);
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_onContributedHistoryContextMenuItemSelected:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _arg1;
_arg1 = data.readString();
java.lang.String _arg2;
_arg2 = data.readString();
java.util.List<org.kmtech.addons.framework.Action> _result = this.onContributedHistoryContextMenuItemSelected(_arg0, _arg1, _arg2);
reply.writeNoException();
reply.writeTypedList(_result);
return true;
}
case TRANSACTION_onUserConfirm:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
boolean _arg2;
_arg2 = (0!=data.readInt());
java.util.List<org.kmtech.addons.framework.Action> _result = this.onUserConfirm(_arg0, _arg1, _arg2);
reply.writeNoException();
reply.writeTypedList(_result);
return true;
}
case TRANSACTION_onUserInput:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
boolean _arg2;
_arg2 = (0!=data.readInt());
java.lang.String _arg3;
_arg3 = data.readString();
java.util.List<org.kmtech.addons.framework.Action> _result = this.onUserInput(_arg0, _arg1, _arg2, _arg3);
reply.writeNoException();
reply.writeTypedList(_result);
return true;
}
case TRANSACTION_onUserChoice:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
boolean _arg2;
_arg2 = (0!=data.readInt());
int _arg3;
_arg3 = data.readInt();
java.util.List<org.kmtech.addons.framework.Action> _result = this.onUserChoice(_arg0, _arg1, _arg2, _arg3);
reply.writeNoException();
reply.writeTypedList(_result);
return true;
}
case TRANSACTION_showAddonSettingsActivity:
{
data.enforceInterface(DESCRIPTOR);
this.showAddonSettingsActivity();
reply.writeNoException();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements org.kmtech.addons.framework.IAddon
{
private android.os.IBinder mRemote;
Proxy(android.os.IBinder remote)
{
mRemote = remote;
}
public android.os.IBinder asBinder()
{
return mRemote;
}
public java.lang.String getInterfaceDescriptor()
{
return DESCRIPTOR;
}
public void onBind() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_onBind, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
public void onUnbind() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_onUnbind, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
public java.lang.String getName() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getName, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public java.lang.String getShortDescription() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getShortDescription, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public java.lang.String getDescription() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getDescription, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public java.lang.String getContact() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getContact, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public int getCallbacks() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getCallbacks, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public java.util.List<org.kmtech.addons.framework.Action> onPageStarted(java.lang.String tabId, java.lang.String url) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.util.List<org.kmtech.addons.framework.Action> _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(tabId);
_data.writeString(url);
mRemote.transact(Stub.TRANSACTION_onPageStarted, _data, _reply, 0);
_reply.readException();
_result = _reply.createTypedArrayList(org.kmtech.addons.framework.Action.CREATOR);
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public java.util.List<org.kmtech.addons.framework.Action> onPageFinished(java.lang.String tabId, java.lang.String url) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.util.List<org.kmtech.addons.framework.Action> _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(tabId);
_data.writeString(url);
mRemote.transact(Stub.TRANSACTION_onPageFinished, _data, _reply, 0);
_reply.readException();
_result = _reply.createTypedArrayList(org.kmtech.addons.framework.Action.CREATOR);
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public java.util.List<org.kmtech.addons.framework.Action> onTabOpened(java.lang.String tabId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.util.List<org.kmtech.addons.framework.Action> _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(tabId);
mRemote.transact(Stub.TRANSACTION_onTabOpened, _data, _reply, 0);
_reply.readException();
_result = _reply.createTypedArrayList(org.kmtech.addons.framework.Action.CREATOR);
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public java.util.List<org.kmtech.addons.framework.Action> onTabClosed(java.lang.String tabId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.util.List<org.kmtech.addons.framework.Action> _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(tabId);
mRemote.transact(Stub.TRANSACTION_onTabClosed, _data, _reply, 0);
_reply.readException();
_result = _reply.createTypedArrayList(org.kmtech.addons.framework.Action.CREATOR);
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public java.util.List<org.kmtech.addons.framework.Action> onTabSwitched(java.lang.String tabId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.util.List<org.kmtech.addons.framework.Action> _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(tabId);
mRemote.transact(Stub.TRANSACTION_onTabSwitched, _data, _reply, 0);
_reply.readException();
_result = _reply.createTypedArrayList(org.kmtech.addons.framework.Action.CREATOR);
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public java.lang.String getContributedMainMenuItem(java.lang.String currentTabId, java.lang.String currentTitle, java.lang.String currentUrl) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(currentTabId);
_data.writeString(currentTitle);
_data.writeString(currentUrl);
mRemote.transact(Stub.TRANSACTION_getContributedMainMenuItem, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public java.util.List<org.kmtech.addons.framework.Action> onContributedMainMenuItemSelected(java.lang.String currentTabId, java.lang.String currentTitle, java.lang.String currentUrl) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.util.List<org.kmtech.addons.framework.Action> _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(currentTabId);
_data.writeString(currentTitle);
_data.writeString(currentUrl);
mRemote.transact(Stub.TRANSACTION_onContributedMainMenuItemSelected, _data, _reply, 0);
_reply.readException();
_result = _reply.createTypedArrayList(org.kmtech.addons.framework.Action.CREATOR);
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public java.lang.String getContributedLinkContextMenuItem(java.lang.String currentTabId, int hitTestResult, java.lang.String url) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(currentTabId);
_data.writeInt(hitTestResult);
_data.writeString(url);
mRemote.transact(Stub.TRANSACTION_getContributedLinkContextMenuItem, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public java.util.List<org.kmtech.addons.framework.Action> onContributedLinkContextMenuItemSelected(java.lang.String currentTabId, int hitTestResult, java.lang.String url) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.util.List<org.kmtech.addons.framework.Action> _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(currentTabId);
_data.writeInt(hitTestResult);
_data.writeString(url);
mRemote.transact(Stub.TRANSACTION_onContributedLinkContextMenuItemSelected, _data, _reply, 0);
_reply.readException();
_result = _reply.createTypedArrayList(org.kmtech.addons.framework.Action.CREATOR);
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public java.lang.String getContributedHistoryBookmarksMenuItem(java.lang.String currentTabId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(currentTabId);
mRemote.transact(Stub.TRANSACTION_getContributedHistoryBookmarksMenuItem, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public java.util.List<org.kmtech.addons.framework.Action> onContributedHistoryBookmarksMenuItemSelected(java.lang.String currentTabId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.util.List<org.kmtech.addons.framework.Action> _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(currentTabId);
mRemote.transact(Stub.TRANSACTION_onContributedHistoryBookmarksMenuItemSelected, _data, _reply, 0);
_reply.readException();
_result = _reply.createTypedArrayList(org.kmtech.addons.framework.Action.CREATOR);
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public java.lang.String getContributedBookmarkContextMenuItem(java.lang.String currentTabId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(currentTabId);
mRemote.transact(Stub.TRANSACTION_getContributedBookmarkContextMenuItem, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public java.util.List<org.kmtech.addons.framework.Action> onContributedBookmarkContextMenuItemSelected(java.lang.String currentTabId, java.lang.String title, java.lang.String url) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.util.List<org.kmtech.addons.framework.Action> _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(currentTabId);
_data.writeString(title);
_data.writeString(url);
mRemote.transact(Stub.TRANSACTION_onContributedBookmarkContextMenuItemSelected, _data, _reply, 0);
_reply.readException();
_result = _reply.createTypedArrayList(org.kmtech.addons.framework.Action.CREATOR);
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public java.lang.String getContributedHistoryContextMenuItem(java.lang.String currentTabId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(currentTabId);
mRemote.transact(Stub.TRANSACTION_getContributedHistoryContextMenuItem, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public java.util.List<org.kmtech.addons.framework.Action> onContributedHistoryContextMenuItemSelected(java.lang.String currentTabId, java.lang.String title, java.lang.String url) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.util.List<org.kmtech.addons.framework.Action> _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(currentTabId);
_data.writeString(title);
_data.writeString(url);
mRemote.transact(Stub.TRANSACTION_onContributedHistoryContextMenuItemSelected, _data, _reply, 0);
_reply.readException();
_result = _reply.createTypedArrayList(org.kmtech.addons.framework.Action.CREATOR);
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public java.util.List<org.kmtech.addons.framework.Action> onUserConfirm(java.lang.String currentTabId, int questionId, boolean positiveAnswer) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.util.List<org.kmtech.addons.framework.Action> _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(currentTabId);
_data.writeInt(questionId);
_data.writeInt(((positiveAnswer)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_onUserConfirm, _data, _reply, 0);
_reply.readException();
_result = _reply.createTypedArrayList(org.kmtech.addons.framework.Action.CREATOR);
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public java.util.List<org.kmtech.addons.framework.Action> onUserInput(java.lang.String currentTabId, int questionId, boolean cancelled, java.lang.String userInput) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.util.List<org.kmtech.addons.framework.Action> _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(currentTabId);
_data.writeInt(questionId);
_data.writeInt(((cancelled)?(1):(0)));
_data.writeString(userInput);
mRemote.transact(Stub.TRANSACTION_onUserInput, _data, _reply, 0);
_reply.readException();
_result = _reply.createTypedArrayList(org.kmtech.addons.framework.Action.CREATOR);
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public java.util.List<org.kmtech.addons.framework.Action> onUserChoice(java.lang.String currentTabId, int questionId, boolean cancelled, int userChoice) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.util.List<org.kmtech.addons.framework.Action> _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(currentTabId);
_data.writeInt(questionId);
_data.writeInt(((cancelled)?(1):(0)));
_data.writeInt(userChoice);
mRemote.transact(Stub.TRANSACTION_onUserChoice, _data, _reply, 0);
_reply.readException();
_result = _reply.createTypedArrayList(org.kmtech.addons.framework.Action.CREATOR);
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public void showAddonSettingsActivity() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_showAddonSettingsActivity, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
}
static final int TRANSACTION_onBind = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_onUnbind = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_getName = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_getShortDescription = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_getDescription = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_getContact = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_getCallbacks = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
static final int TRANSACTION_onPageStarted = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
static final int TRANSACTION_onPageFinished = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
static final int TRANSACTION_onTabOpened = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
static final int TRANSACTION_onTabClosed = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
static final int TRANSACTION_onTabSwitched = (android.os.IBinder.FIRST_CALL_TRANSACTION + 11);
static final int TRANSACTION_getContributedMainMenuItem = (android.os.IBinder.FIRST_CALL_TRANSACTION + 12);
static final int TRANSACTION_onContributedMainMenuItemSelected = (android.os.IBinder.FIRST_CALL_TRANSACTION + 13);
static final int TRANSACTION_getContributedLinkContextMenuItem = (android.os.IBinder.FIRST_CALL_TRANSACTION + 14);
static final int TRANSACTION_onContributedLinkContextMenuItemSelected = (android.os.IBinder.FIRST_CALL_TRANSACTION + 15);
static final int TRANSACTION_getContributedHistoryBookmarksMenuItem = (android.os.IBinder.FIRST_CALL_TRANSACTION + 16);
static final int TRANSACTION_onContributedHistoryBookmarksMenuItemSelected = (android.os.IBinder.FIRST_CALL_TRANSACTION + 17);
static final int TRANSACTION_getContributedBookmarkContextMenuItem = (android.os.IBinder.FIRST_CALL_TRANSACTION + 18);
static final int TRANSACTION_onContributedBookmarkContextMenuItemSelected = (android.os.IBinder.FIRST_CALL_TRANSACTION + 19);
static final int TRANSACTION_getContributedHistoryContextMenuItem = (android.os.IBinder.FIRST_CALL_TRANSACTION + 20);
static final int TRANSACTION_onContributedHistoryContextMenuItemSelected = (android.os.IBinder.FIRST_CALL_TRANSACTION + 21);
static final int TRANSACTION_onUserConfirm = (android.os.IBinder.FIRST_CALL_TRANSACTION + 22);
static final int TRANSACTION_onUserInput = (android.os.IBinder.FIRST_CALL_TRANSACTION + 23);
static final int TRANSACTION_onUserChoice = (android.os.IBinder.FIRST_CALL_TRANSACTION + 24);
static final int TRANSACTION_showAddonSettingsActivity = (android.os.IBinder.FIRST_CALL_TRANSACTION + 25);
}
public void onBind() throws android.os.RemoteException;
public void onUnbind() throws android.os.RemoteException;
public java.lang.String getName() throws android.os.RemoteException;
public java.lang.String getShortDescription() throws android.os.RemoteException;
public java.lang.String getDescription() throws android.os.RemoteException;
public java.lang.String getContact() throws android.os.RemoteException;
public int getCallbacks() throws android.os.RemoteException;
public java.util.List<org.kmtech.addons.framework.Action> onPageStarted(java.lang.String tabId, java.lang.String url) throws android.os.RemoteException;
public java.util.List<org.kmtech.addons.framework.Action> onPageFinished(java.lang.String tabId, java.lang.String url) throws android.os.RemoteException;
public java.util.List<org.kmtech.addons.framework.Action> onTabOpened(java.lang.String tabId) throws android.os.RemoteException;
public java.util.List<org.kmtech.addons.framework.Action> onTabClosed(java.lang.String tabId) throws android.os.RemoteException;
public java.util.List<org.kmtech.addons.framework.Action> onTabSwitched(java.lang.String tabId) throws android.os.RemoteException;
public java.lang.String getContributedMainMenuItem(java.lang.String currentTabId, java.lang.String currentTitle, java.lang.String currentUrl) throws android.os.RemoteException;
public java.util.List<org.kmtech.addons.framework.Action> onContributedMainMenuItemSelected(java.lang.String currentTabId, java.lang.String currentTitle, java.lang.String currentUrl) throws android.os.RemoteException;
public java.lang.String getContributedLinkContextMenuItem(java.lang.String currentTabId, int hitTestResult, java.lang.String url) throws android.os.RemoteException;
public java.util.List<org.kmtech.addons.framework.Action> onContributedLinkContextMenuItemSelected(java.lang.String currentTabId, int hitTestResult, java.lang.String url) throws android.os.RemoteException;
public java.lang.String getContributedHistoryBookmarksMenuItem(java.lang.String currentTabId) throws android.os.RemoteException;
public java.util.List<org.kmtech.addons.framework.Action> onContributedHistoryBookmarksMenuItemSelected(java.lang.String currentTabId) throws android.os.RemoteException;
public java.lang.String getContributedBookmarkContextMenuItem(java.lang.String currentTabId) throws android.os.RemoteException;
public java.util.List<org.kmtech.addons.framework.Action> onContributedBookmarkContextMenuItemSelected(java.lang.String currentTabId, java.lang.String title, java.lang.String url) throws android.os.RemoteException;
public java.lang.String getContributedHistoryContextMenuItem(java.lang.String currentTabId) throws android.os.RemoteException;
public java.util.List<org.kmtech.addons.framework.Action> onContributedHistoryContextMenuItemSelected(java.lang.String currentTabId, java.lang.String title, java.lang.String url) throws android.os.RemoteException;
public java.util.List<org.kmtech.addons.framework.Action> onUserConfirm(java.lang.String currentTabId, int questionId, boolean positiveAnswer) throws android.os.RemoteException;
public java.util.List<org.kmtech.addons.framework.Action> onUserInput(java.lang.String currentTabId, int questionId, boolean cancelled, java.lang.String userInput) throws android.os.RemoteException;
public java.util.List<org.kmtech.addons.framework.Action> onUserChoice(java.lang.String currentTabId, int questionId, boolean cancelled, int userChoice) throws android.os.RemoteException;
public void showAddonSettingsActivity() throws android.os.RemoteException;
}
