package com.example.italianresraurant;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends ListActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		String[] specials={"Appetizer Special - Antipasto","Main Course - Spaghetti and Clams",
				"Dessert Special - Tiramisu","La Scala Full Web Site"};
		setListAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,specials));
		}
	protected void onListItemClick(ListView l,View v, int position, long id){
		switch(position){
		case 0:
			startActivity(new Intent(MainActivity.this,Antipasto.class));
			break;
		case 1:
			startActivity(new Intent(MainActivity.this,Clams.class));
			break;
		case 2:
			startActivity(new Intent(MainActivity.this,Tiramisu.class));
			break;
		case 3:
			startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.lascaladining.com/")));
			break;
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
