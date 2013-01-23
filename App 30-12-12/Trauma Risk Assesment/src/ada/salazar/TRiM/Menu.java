package ada.salazar.TRiM;

//import ada.salazar.TRiM.R;
import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Menu extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		 setContentView(R.layout.main);
		 
		 //Set up the button sound
		final MediaPlayer mpButtonClick = MediaPlayer.create(this, R.raw.button_sound); 
	    //The "final" allows to use the var in submethods	 the context "This" is just to use it in the instance of this object

		 Button bTRM = (Button) findViewById(R.id.idbTRM);
		 bTRM.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				//play the sound
				mpButtonClick.start();
				//This goes to the new layout 
				startActivity(new Intent("ada.salazar.TRiM.bIntentTRM"));
			}
		});
		 
		 
		Button bBH = (Button) findViewById(R.id.idbBH);
		bBH.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				//play the sound
				mpButtonClick.start();
				
				//This goes to the new layout 
				startActivity(new Intent("ada.salazar.TRiM.bIntentBH"));
			
			}
		}) ;
		
		
		Button bTR = (Button) findViewById(R.id.idbTR);
		bTR.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				//play the sound
				mpButtonClick.start();
				
				//This goes to the new layout 
				startActivity(new Intent("ada.salazar.TRiM.bIntentTR"));
			
			}
		}) ;
		 
	}//on create

}//activity
