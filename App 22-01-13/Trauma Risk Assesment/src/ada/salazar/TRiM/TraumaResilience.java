package ada.salazar.TRiM;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

public class TraumaResilience extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	
		//WebView webview = new WebView(this);
	   // setContentView(webview);
	    //webview.loadUrl("file:///android_asset/webpages/webpage3.html");
		
		
		setContentView(R.layout.books);
		WebView webView = (WebView) findViewById(R.id.wvBook);
		webView.loadUrl("file:///android_asset/webpages/webpage3.html");
		
		Button bBack = (Button) findViewById(R.id.idbback);
		 bBack.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				//This goes back by finishing the current layout
				finish();
			}
		});
        
    }//oncreate
	
}//class SecondBook
