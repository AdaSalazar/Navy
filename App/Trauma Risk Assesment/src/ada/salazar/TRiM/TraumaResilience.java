package ada.salazar.TRiM;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class TraumaResilience extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	
		WebView webview = new WebView(this);
	    setContentView(webview);
	    webview.loadUrl("file:///android_asset/webpage3.html");

        
    }//oncreate
	
}//class SecondBook
