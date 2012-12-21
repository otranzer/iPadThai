package com.example.ipadthai;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class MainActivity extends Activity  implements OnClickListener{
	
	
	
	private static final String TAG = "iPadThai";
	private Plate mPlate = null;
	private ImageView[] listImage = null;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    	RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.ipadthai_RL);
        
        mPlate = new Plate(10,4,3,5,6,this);
        listImage = new ImageView[mPlate.mNumElement];
        for(int i = 0; i<mPlate.mNumElement;i++){
        	listImage[i]= new ImageView(this);
        	listImage[i].setOnClickListener(this);
        	listImage[i].setImageResource(mPlate.getRefElement(i));
        	RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
        	params.leftMargin = mPlate.getXCoordElement(i);
        	params.topMargin = mPlate.getYCoordElement(i);
        	relativeLayout.addView(listImage[i], params);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }

	@Override
	public void onClick(View v) {
		v.setVisibility(View.INVISIBLE);
		mPlate.mNumElementEaten++;
		if(mPlate.isPlateFinnished())
			Log.v(TAG,"you win!!!!");
	}
}
