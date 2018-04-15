package com.zhaozhe.magicphoto;

import android.Manifest;
import android.content.pm.PackageManager;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.zhaozhe.magicphoto.UI.ContactListFragment;
import com.zhaozhe.magicphoto.UI.dummy.DummyContent;
import com.zhaozhe.magicphoto.model.UserInfo;

public class MainActivity extends AppCompatActivity implements ContactListFragment.OnListFragmentInteractionListener {

    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(TAG,"onCreate");
        super.onCreate(savedInstanceState);
        if(ContextCompat.checkSelfPermission(this, Manifest.permission.READ_CONTACTS) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.READ_CONTACTS}, 1);
        }
        setContentView(R.layout.activity_main);

    }

    @Override
    public void onListFragmentInteraction(UserInfo item) {

        Log.d(TAG,"onListFragmentInteraction");
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

        Log.d(TAG,"onPointerCaptureChanged");
    }
}
