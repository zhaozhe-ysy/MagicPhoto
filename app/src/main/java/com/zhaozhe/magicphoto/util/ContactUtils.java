package com.zhaozhe.magicphoto.util;

import android.Manifest;
import android.content.Context;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.provider.ContactsContract;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.util.Log;

import com.zhaozhe.magicphoto.model.UserInfo;

import java.util.ArrayList;
import java.util.Currency;
import java.util.List;

/**
 * Created by zhaozhe on 2018/4/15.
 */

public class ContactUtils {

    private static final String TAG = ContactUtils.class.getSimpleName();

    private static ContactUtils utils;

    private static Context mContext;

    private List<UserInfo> contactList = new ArrayList<UserInfo>();

    public static ContactUtils getInstance(Context context){

        if (utils == null){
            utils = new ContactUtils();
        }
        mContext = context;
        return utils;
    }

    public List<UserInfo> getContact(){
        Log.d(TAG,"getContact");


        Cursor cursor;

        try {
            cursor = mContext.getContentResolver().query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, null, null, null, null);

            if (cursor != null) {
                while (cursor.moveToNext()) {
                    String displayName = cursor.getString(cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME));
                    Log.d(TAG,displayName);
                    String number = cursor.getString(cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.NUMBER));
                    contactList.add(new UserInfo(1,displayName,number));
                }
                //notify公布
//                adapter.notifyDataSetChanged();
            }
        } catch (Exception e){
            e.printStackTrace();
        }

        return contactList;
    }
}
