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
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ViewFlipper;

import com.bumptech.glide.Glide;

import java.util.List;

public class AlbumsAdapter extends RecyclerView.Adapter<AlbumsAdapter.MyViewHolder> {
    private Context mContext;
    private List<Album> companyList;
   //int[]albums={R.drawable.album1,R.drawable.album2,R.drawable.album3,
            //R.drawable.album14
   //};
    public AlbumsAdapter(Context mContext, List<Album> companyList) {
        this.mContext = mContext;
        this.companyList = companyList;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        private Album album;
        private ViewFlipper flipper;
        public ImageView react, like;

        public MyViewHolder(View view) {
            super(view);
            react = (ImageView) view.findViewById(R.id.react);
            like = (ImageView) view.findViewById(R.id.overflow);
            flipper = (ViewFlipper) view.findViewById(R.id.flipper);
        }


        public void bindData(Album album) {
            this.album = album;
            like.setImageResource(album.getReact());

            /*title.setText(company.getTitle());
            days.setText(company.getDays());
            time.setText(company.getTime());
            lunch.setText(company.getLunch());
            coffee.setText(company.getCoffee());
            uniform.setText(company.getUniform());
            phone.setText(company.getPhone());
            internet.setText(company.getInternet());
            address.setText(company.getAddress());
            lat = company.getLat();
            lon = company.getLon();*/
       int[]albums=album.getImages();
            flipper.setInAnimation(AnimationUtils.loadAnimation(mContext, R.anim.push_left_in));
            flipper.setOutAnimation(AnimationUtils.loadAnimation(mContext, R.anim.push_left_out));
            for (int item : albums) {
                ImageView imageView = new ImageView(mContext);
                imageView.setImageResource(item);
                like.setOnClickListener(new View.OnClickListener() {
                    boolean paused=true;

                    public void onClick(View view) {
                        if(paused){

                            //Glide.with(mContext).load(R.drawable.love).into(like);
                            //  Glide.with(mContext).load(R.drawable.sad).into(react);
                            react.setImageResource(R.drawable.smile);
                            like.setImageResource(R.drawable.like);
                            // num.setText(""+count);
                            paused=false;

                        }
                        else
                        {
                            //Glide.with(mContext).load(R.drawable.love_white).into(like);
                            react.setImageResource(R.drawable.sad);
                            like.setImageResource(R.drawable.love_white);
                            //  count++;
                            //  num.setText(""+count);
                            paused=true;
                            // icon=R.drawable.love;


                        }
                    }
                });
                flipper.addView(imageView, new ViewGroup.LayoutParams(ViewGroup.LayoutParams.FILL_PARENT, ViewGroup.LayoutParams.FILL_PARENT));

            }
            flipper.setFlipInterval(2000);
            flipper.startFlipping();


          like.setOnClickListener(new View.OnClickListener() {
                boolean paused = true;

                // int count=0;
                public void onClick(View view) {
                    if (paused) {
                        //icon=R.drawable.love_white;
                        // Glide.with(mContext).load(R.drawable.love).into(like);
                        //  Glide.with(mContext).load(R.drawable.sad).into(react);
                        like.setImageResource(R.drawable.love);
                        react.setImageResource(R.drawable.smile);
                        // num.setText(""+count);
                        paused = false;
                        //count--;
                    } else {
                        // Glide.with(mContext).load(R.drawable.love_white).into(like);
                        like.setImageResource(R.drawable.love_white);
                        react.setImageResource(R.drawable.sad);
                        //  count++;
                        //  num.setText(""+count);
                        paused = true;
                        // icon=R.drawable.love;


                    }
                }

            });

        }
    }



        public AlbumsAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View itemView = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.content_main, parent, false);

            return new MyViewHolder(itemView);
        }

        public void onBindViewHolder(final AlbumsAdapter.MyViewHolder holder, int position) {
            Album album = companyList.get(position);
            holder.bindData(album);

        }


        public int getItemCount() {
            return companyList.size();
        }

    }

