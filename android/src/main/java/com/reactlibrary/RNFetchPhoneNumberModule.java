
package com.reactlibrary;

import android.content.Context;
import android.telephony.TelephonyManager;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;

public class RNFetchPhoneNumberModule extends ReactContextBaseJavaModule {

  private final ReactApplicationContext reactContext;

  public RNFetchPhoneNumberModule(ReactApplicationContext reactContext) {
    super(reactContext);
    this.reactContext = reactContext;
  }

  @Override
  public String getName() {
    return "RNFetchPhoneNumber";
  }

  @ReactMethod
  public void getPhoneNumber(Callback callback)
  {

    TelephonyManager telephonyManager = (TelephonyManager)getCurrentActivity().getSystemService(reactContext.TELEPHONY_SERVICE);
    if (telephonyManager != null){
      String phoneNum = telephonyManager.getLine1Number();
      if (phoneNum != null){
        callback.invoke(phoneNum);
      }else{
        callback.invoke("");
      }
    }else{
      callback.invoke("");
    }
  }
}