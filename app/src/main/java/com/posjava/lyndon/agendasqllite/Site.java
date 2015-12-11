package chintan.khetiya.sqlite.cursor;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class Site extends Activity {
    private WebView webView;

    public void onCreate(Bundle savedInstanceState) {
	super.onCreate(savedInstanceState);
	setContentView(R.layout.my_blog);

	webView = (WebView) findViewById(R.id.webView1);
	webView.getSettings().setJavaScriptEnabled(true);
	webView.loadUrl("http://utfpr.edu.br/");

    }

}
