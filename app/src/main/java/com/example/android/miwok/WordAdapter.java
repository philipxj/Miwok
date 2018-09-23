package com.example.android.miwok;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter {

/** Resource ID for the background color of this list of word */
private int mColorResourceId;


    public WordAdapter(Context context, ArrayList Words,int colorResourceId) {
        super(context,0, Words);
        mColorResourceId = colorResourceId;
    }


    public View getView(int position, View convertView, ViewGroup parent) {

        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;

        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        Word currentWord= (Word) getItem(position);

        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.miwok_text_view);
        miwokTextView.setText(currentWord.getMiwokTranslation());

        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.default_text_view);
        defaultTextView.setText(currentWord.getDefaultTranslation());
       // find the ImageView in the list_item.xml layout with the ID image.
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);

      if(currentWord.hasImage() ) {
          imageView.setImageResource(currentWord.getmImageResourceId());
//Make sure the VIew is visible
          imageView.setVisibility((View.VISIBLE));
      }
      else{
          // Otherwise hid the ImageView (Set visibility to GONE).
          imageView.setVisibility(View.GONE);
      }
//Set the theme color for the list item
        View textContainer =listItemView.findViewById(R.id.text_container);
      //Find the color that the resource ID map to
        int color= ContextCompat.getColor(getContext(),mColorResourceId);
        //Ste the background color of the text container View
        textContainer.setBackgroundColor(color);

        return listItemView;
    }
}