package ada.salazar.TRiM;

//import java.io.IOException;
//import java.io.InputStream;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

public class ComingHome extends Activity{

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
		WebView webView = (WebView) findViewById(R.id.wvBook);
		webView.loadUrl("file:///android_asset/webpages/webpage4.html");
	    
		Button bBack = (Button) findViewById(R.id.idbback);
		 bBack.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				//This goes back by finishing the current layout
				finish();
			}
		});
	  
	    /*
	     * NO USED
	     * webview.loadUrl("http://www.thebarcodewarehouse.co.uk/");*/
       /* try {
            InputStream fin = getAssets().open("webpage.html");
    		byte[] buffer = new byte[fin.available()];
    		fin.read(buffer);
    		fin.close();
    		webview.loadData(new String(buffer), "text/html", "UTF-8");
    		
        } catch (IOException e) {
            e.printStackTrace();
        }*/
		
        //setContentView(R.layout.test);
		//WebView webv = new WebView(this);
		
		
		/*WebView wbv = new WebView(this);
		String summary = "<html><body>You scored <b>192</b> points.</body></html>";
		 wbv.loadData(summary, "text/html", null);
		 setContentView(wbv);*/
		
    }//oncreate

}//activity
	


