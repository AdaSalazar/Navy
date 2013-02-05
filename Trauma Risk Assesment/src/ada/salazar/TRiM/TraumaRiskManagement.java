package ada.salazar.TRiM;

//import java.io.IOException;
//import java.io.InputStream;

import java.lang.reflect.Method;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;

public class TraumaRiskManagement extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		

		/* OLD VERSION
		WebView webview = new WebView(this);
	    setContentView(webview);
	    webview.loadUrl("file:///android_asset/webpages/webpage.html");
	    */
		setContentView(R.layout.books);
		final WebView wvBook = (WebView) findViewById(R.id.wvBook);
		wvBook.getSettings().setBuiltInZoomControls(true);
		
		try{
			wvBook.loadUrl("file:///android_asset/webpages/trim.html");
		}catch (Exception e){
			e.printStackTrace();
		}
		
		
		
		Button bBack = (Button) findViewById(R.id.idbback);
		 bBack.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				//This goes back by finishing the current layout
				finish();
			}
		});
		// Set an EditText view to get user input 
				 final EditText searchText = (EditText) findViewById(R.id.etToFind);
				
				 final Button bFind = (Button) findViewById(R.id.idbSearch);
				 bFind.setOnClickListener(new View.OnClickListener() {
					
					public void onClick(View v) {
						//Searches for the text in the web view
				        	searchWV(wvBook, searchText);
					}
				});
				 
				
						//check if the enter key is clicked
						searchText.setOnKeyListener(new View.OnKeyListener() {
							
							public boolean onKey(View v, int keyCode, KeyEvent event) {
								if ((event.getAction() == KeyEvent.ACTION_DOWN) &&
						                (keyCode == KeyEvent.KEYCODE_ENTER)) {
									
									//This makes the search box have only one line
						        	searchText.setSingleLine(true);
						        	//Searches for the text in the web view
						        	searchWV(wvBook, searchText);
						        	
						        	bFind.requestFocus();	
						        } 
								return false;
							}
							
							
						});	 
						
		    }//oncreate
			
			
			//searches the web view for the text in editable text
			public void searchWV(WebView wbToFind, EditText etToFind ){
				
				//This gets the text from the edit text field in the form books
				String toFind = etToFind.getText().toString();
				//This search the word(s) 
				wbToFind.findAll (toFind);
					try{
						Method m = WebView.class.getMethod ("setFindIsUp", Boolean.TYPE);
						m.invoke ( wbToFind , true);
					}//catch any errors
						catch (Throwable ignored){
						Log.i ("Error", ignored.toString ());
					}
			}
			

}//activity
	


