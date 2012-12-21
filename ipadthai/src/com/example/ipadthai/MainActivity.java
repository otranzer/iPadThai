package com.example.ipadthai;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.ImageView;

public class MainActivity extends Activity {
	
	
	
	private Plate mPlate = null;
	private ImageView[] listImage = null;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        mPlate = new Plate(10,4,3,5,6,this);
        for(int i = 0; i<mPlate.mNumElement;i++){
        	
        }
        
        
        
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
}
