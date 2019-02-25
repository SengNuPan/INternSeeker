package com.example.sengnupan.android_pj;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.widget.PopupMenu;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import java.util.List;

public class CompanyAdapter extends RecyclerView.Adapter<CompanyAdapter.MyViewHolder> {
    private Context mContext;
    private List<company> companyList;
    public String internet;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView title,days,time,lunch,coffee,uniform,internet,address,phone;
        private company company;
        public String lat,lon;
        public Button detail;
        public ImageView star;

        public MyViewHolder(View view) {
            super(view);
            title = (TextView) view.findViewById(R.id.title);
            days = (TextView) view.findViewById(R.id.days);
            time = (TextView) view.findViewById(R.id.time);
            lunch = (TextView) view.findViewById(R.id.lunch);
            coffee=(TextView)view.findViewById(R.id.coffee);
            uniform=(TextView)view.findViewById(R.id.uniform);
            phone=(TextView)view.findViewById(R.id.phone);
            internet=(TextView)view.findViewById(R.id.internet);
            address=(TextView)view.findViewById(R.id.address);
            detail=(Button)view.findViewById(R.id.detail);
star=   (ImageView)view.findViewById(R.id.star);

        }


        public void bindData(company company) {
            this.company = company;
            title.setText(company.getTitle());
            days.setText(company.getDays());
            time.setText(company.getTime());
            lunch.setText(company.getLunch());
            coffee.setText(company.getCoffee());
            uniform.setText(company.getUniform());
            phone.setText(company.getPhone());
            internet.setText(company.getInternet());
            address.setText(company.getAddress());
            lat = company.getLat();
            lon = company.getLon();


            star.setOnClickListener(new View.OnClickListener() {
                    boolean paused = true;
                    // int count=0;
                    public void onClick(View view) {
                        if(paused){
                            //icon=R.drawable.love_white;
                           // Glide.with(mContext).load(R.drawable.love).into(like);
                            //  Glide.with(mContext).load(R.drawable.sad).into(react);
                            star.setImageResource(R.drawable.star);
                            // num.setText(""+count);
                            paused=false;
                            //count--;
                        }
                        else
                        {
                           // Glide.with(mContext).load(R.drawable.love_white).into(like);
                            star.setImageResource(R.drawable.star_whit);
                            //  count++;
                            //  num.setText(""+count);
                            paused=true;
                            // icon=R.drawable.love;


                        }
                    }

            });

            internet.setOnClickListener(new View.OnClickListener(){
                public void onClick(View view){
                    String str=  internet.getText().toString();
                    Intent intent = new Intent(mContext, webview.class);
                    //Bundle bd=new Bundle();
                    //bd.putString("hhh",str);
                    //intent.putExtra("Web View", bd);
                    //mContext.startActivity(intent);

                    // intent.putExtra("EXTRA_SESSION_ID", 1);
                    intent.putExtra("hhh", str);
                    mContext.startActivity(intent);

                   /* String web=internet.getText().toString();
                   webv

                    Uri uri=Uri.parse(web);
                    Intent intent=new Intent(Intent.ACTION_VIEW,uri);
                    mContext.startActivity(intent);*/

                }
            });
            detail.setOnClickListener(new View.OnClickListener(){
                public void onClick(View view){
                    Uri uri= Uri.parse("geo:"+lat+","+lon);
                    Intent intent= new Intent(Intent.ACTION_VIEW,uri);
                    intent.setPackage("com.google.android.apps.maps");
                    mContext.startActivity(intent);

                }
            });
            phone.setOnClickListener(new View.OnClickListener(){
                public void onClick(View view){
                   String phonenum=phone.getText().toString();
                   String d="tel:"+phonenum;
                   Intent phoneIntent=new Intent(Intent.ACTION_DIAL);
                   phoneIntent.setData(Uri.parse(d));
                   try{
                       mContext.startActivity(phoneIntent);
                       Log.i("finished making a call"," ");

                   }
                   catch (android.content.ActivityNotFoundException ex){
                       Toast.makeText(mContext, "Call fail, please try again later.", Toast.LENGTH_SHORT).show();
                   }

                }
            });
        }

    }

    public CompanyAdapter(Context mContext, List<company> companyList) {
        this.mContext = mContext;
        this.companyList = companyList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.cards, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, int position) {
        company company = companyList.get(position);
        holder.bindData(company);

    }


    public int getItemCount() {
        return companyList.size();
    }

}

