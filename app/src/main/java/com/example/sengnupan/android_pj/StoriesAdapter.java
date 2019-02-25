package com.example.sengnupan.android_pj;

import android.content.Context;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;



import java.util.ArrayList;

public class StoriesAdapter extends BaseAdapter {

    private Context context;
    private ArrayList<stories> models;

    public ImageView star1,star2,star3,star4,star5;

    public StoriesAdapter(Context context, ArrayList<stories> models) {
        this.context = context;
        this.models = models;
    }

    public int getCount() {
        return models.size();
    }

    @Override
    public Object getItem(int i) {
        return models.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if(view==null){
            view=View.inflate(context, R.layout.list_view,null);
        }

        ImageView images=(ImageView)view.findViewById(R.id.companyLogo);
        TextView title=(TextView)view.findViewById(R.id.companyName);
        TextView about=(TextView)view.findViewById(R.id.desc);

      ImageView star1=(ImageView)view.findViewById(R.id.star1);
        ImageView star2=(ImageView)view.findViewById(R.id.star2);
        ImageView star3=(ImageView)view.findViewById(R.id.star3);
        ImageView star4=(ImageView)view.findViewById(R.id.star4);
        ImageView star5=(ImageView)view.findViewById(R.id.star5);
//String[]star={"Software Myanmar Co,.Ltd","Nex4 Company Ltd"};


        stories model=models.get(i);

        images.setImageResource(model.getImageId());
        title.setText(model.getMovieName());

       if(model.getMovieName()=="Software Myanmar Co.,Ltd"){
            star1.setImageResource(R.drawable.star);
            star2.setImageResource(R.drawable.star);
            star3.setImageResource(R.drawable.star_whit);
            star4.setImageResource(R.drawable.star_whit);
            star5.setImageResource(R.drawable.star_whit);

        }
        if(model.getMovieName()=="Nex4 Company Ltd"){
            star1.setImageResource(R.drawable.star);
            star2.setImageResource(R.drawable.star);
            star3.setImageResource(R.drawable.star);
            star4.setImageResource(R.drawable.star_whit);
            star5.setImageResource(R.drawable.star_whit);


        }
        if(model.getMovieName()=="Bits Manager Co.,Ltd"){
            star1.setImageResource(R.drawable.star);
            star2.setImageResource(R.drawable.star);
            star3.setImageResource(R.drawable.star);
            star4.setImageResource(R.drawable.star);
            star5.setImageResource(R.drawable.star_whit);

        }
        if(model.getMovieName()=="High Quality Service Co.,Ltd"){
            star1.setImageResource(R.drawable.star);
            star2.setImageResource(R.drawable.star);
            star3.setImageResource(R.drawable.star);
            star4.setImageResource(R.drawable.star);
            star5.setImageResource(R.drawable.star);


        }
        about.setText(model.getAboutMovie());

        return view;
    }
  /*stories story=models.get(0);
     if(story.getMovieName()=="Software Mayanmar Co,.Ltd"){
        star1.setImageResource(R.drawable.star);
        star2.setImageResource(R.drawable.star)
        ;
    }
*/
    @Nullable
    @Override
    public CharSequence[] getAutofillOptions() {
        return new CharSequence[0];
    }
}
