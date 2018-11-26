package com.city.coding.restaurant3;

import android.content.Context;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.constraint.ConstraintLayout;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class homeRecycleViewAdapter extends RecyclerView.Adapter<homeRecycleViewAdapter.viewHolder> {
    // view position
    int position ;
    //ArrayList of voucher object's
    private  ArrayList<voucher> voucherData;
    //Mooc image data
    private ArrayList<Integer> mImage;
    //Mooc QR image
    private ArrayList<Integer> QRimage ;
    //Mooc QR number

    //Application context reference
    private Context mContext;

    //constructor
    public homeRecycleViewAdapter(Context mContext , ArrayList<voucher> voucherData, ArrayList<Integer> mImage ) {
        this.voucherData = voucherData;
        this.mContext = mContext;
        this.mImage= mImage;
        }//end Constructor


    //viewHolder onCreateViewHolder method
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int position)
    {
        //inflate a view to send it to view Holder constructor
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.voucher_item,viewGroup,false);
        //make a new object from view holder and pass to it a view to hold it
        viewHolder viewHolder = new viewHolder(view);
        //return viewHolder object
        return viewHolder;
    }//end viewHolder OnCreateViewHolder method


    /*when binding data into the view this method invoked
    * first get  a voucher object according to position of the viewHolder
    * second set a data to this viewHolder
    * set a click listener to each viewHolder
    * send viewHolder data if it get clicked to detail's activity Using intent class*/
    @Override
    public void onBindViewHolder(@NonNull  viewHolder v,   final int position) {
        final voucher voucher = voucherData.get(position);
      v.voucherImage.setImageResource(mImage.get(position));
      v.quantity.setText(voucherData.get(position).getQuantity()+"");
      v.itemLayout.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              //initial an intent object moving from Main to voucherDetail activity
              Intent intent = new Intent (mContext , voucher_detail.class);
              /*puting data in intent object*/
              intent.putExtra("voucher_title",voucher.getName());
              intent.putExtra("voucher_desc" , voucher.getDesc());
              intent.putExtra("voucher_image",mImage.get(position));
              intent.putExtra("QRnum" , voucher.getQRnumber());
             // start the intent , moving to another intent
              mContext.startActivity(intent);
          }
      });//end viewHolder clickListener
    }//end binding method
    @Override
    public int getItemCount() {
        return voucherData.size();
    }


    //ViewHolder class to hold voucher item layout
    //to render it on rcycle view
    public class viewHolder extends RecyclerView.ViewHolder  {

        //set id's for voucher item fields
        ImageView voucherImage;
        TextView quantity;
        ConstraintLayout itemLayout ;
        //end

        public viewHolder(@NonNull View itemView) {
            super(itemView);

            //attach items by id's
            voucherImage = itemView.findViewById(R.id.voucher_image_id);
            quantity = itemView.findViewById(R.id.quantity_id);
            itemLayout = itemView.findViewById(R.id.voucher_item_ID);
            //end attaching id's
        }//end constructor

    }//end ViewHolder Class
}//end RecyclerView parent