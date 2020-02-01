package com.acmvit.androidchallenge1.Adapters;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.acmvit.androidchallenge1.R;
import com.bumptech.glide.Glide;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class AmitAgarwalAdapter extends RecyclerView.Adapter<AmitAgarwalAdapter.ViewHolder> {

    ArrayList<String> mpicture_name;
    ArrayList<String> mpicture;
    ArrayList<String> mpicture_place;
    ArrayList<String> mlink;
    Context mcontext;

    public AmitAgarwalAdapter(Context context,ArrayList<String> picture_name,ArrayList<String> picture,
                              ArrayList<String> picture_place,ArrayList<String> link){
        mcontext = context;
        mpicture = picture;
        mpicture_name = picture_name;
        mpicture_place = picture_place;
        mlink = link;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                        .inflate(R.layout.activity_list_item , parent ,false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {

        Glide.with(mcontext)
             .load(mpicture.get(position))
             .into(holder.image);
        
        holder.image_text.setText(mpicture_name.get(position));

        holder.image_locate.setText(mpicture_place.get(position));

        holder.lay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = mlink.get(position);
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                mcontext.startActivity(i);
            }
        });

    }

    @Override
    public int getItemCount() {

        return mpicture.size();

    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        CircleImageView image ;
        TextView image_text;
        TextView image_locate;
        ConstraintLayout lay;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            image = (CircleImageView)itemView.findViewById(R.id.item_image);
            image_text = (TextView) itemView.findViewById(R.id.item_text_name);
            image_locate = (TextView)itemView.findViewById(R.id.item_text_place);
            lay = (ConstraintLayout)itemView.findViewById(R.id.item_layout);
        }
    }
}

    /*
    You will have to extend this class as a Recycler View Adapter, create a view holder and write the custom code.....
     */
