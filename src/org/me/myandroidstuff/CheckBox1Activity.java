package org.me.myandroidstuff;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class CheckBox1Activity extends Activity implements OnClickListener
{
	CheckBox cb1;
	CheckBox cb2;
	CheckBox cb3;
	Button updateButton;
	TextView shoppingList;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) 
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        cb1 = (CheckBox)findViewById(R.id.cb1);
        cb2 = (CheckBox)findViewById(R.id.cb2);
        cb3 = (CheckBox)findViewById(R.id.cb3);
        updateButton = (Button)findViewById(R.id.updateButton);
        shoppingList = (TextView)findViewById(R.id.shoppingList);
        updateButton.setOnClickListener(this);
    }
	@Override
	public void onClick(View arg0) 
	{
		// Clear List
		shoppingList.setText("");
		// Update list for each box checked
		if (cb1.isChecked())
		{
			shoppingList.append(cb1.getText() + "\n");
		}
		
			if (cb2.isChecked())
			{
				shoppingList.append(cb2.getText() + "\n");
			}
			
				if (cb3.isChecked())
				{
					shoppingList.append(cb3.getText() + "\n");
				}
		
	}
    
    
} // End of class