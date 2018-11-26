package com.city.coding.restaurant3;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class homeFragment extends Fragment {
    //create inflated view
    private View view ;

    /*list of voucher objts information*/
    ArrayList<voucher> vData ;
    ArrayList<Integer> vImage ;
    ArrayList<Integer> QRimage ;
    ArrayList<String> QRnumber;


    /*Reference to Recycle view in xml*/
    private RecyclerView recyclerView;
    /*Reference to homeRecyclerView adapter*/
    private homeRecycleViewAdapter adapter ;


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /*Initializing voucher data ArrayList*/
        vData = new ArrayList<>();
        vImage = new ArrayList<>();
        QRimage = new ArrayList<>();
        QRnumber = new ArrayList<>();

        /*adding Mooc data to these arrayList to adapt theme into recycle view*/

        addVoucherQRnumber(QRnumber);//voucher QR number
        addVoucherData(vData);//voucher data(title , description , price , QR number)
        addVoucherImage(vImage);//voucher image
        addVoucherQRimage(QRimage); //voucher QR image to scan

    }//end onCreate



    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        //inflate the view when creating the fragment
        View view = inflater.inflate(R.layout.home_fragment_layout,container,false);
        //attach recyclerView from XML
        recyclerView = view.findViewById(R.id.homeRecyclerViewID);
        // inital adapter and pass to it all data source and activity Context
        adapter = new homeRecycleViewAdapter(getContext(), vData , vImage );
        //set recyclerView layoutManager with context Param
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        //set recyclerView adapter
        recyclerView.setAdapter(adapter);
        //return inflated view
        return view;
    }//end OnCreateView



    /*Helper method to seperate adding data from code*/
    // add QR numbers to voucher data to display it under QR image
    private void addVoucherQRnumber(ArrayList<String> qRnumber) {
        qRnumber.add("dfkf2dg2f");
        qRnumber.add("e5d86f8s9e");
        qRnumber.add("Ddf45G4g");
        qRnumber.add("D4d7ddd7Dd7");
        qRnumber.add("tlb5wot");
        qRnumber.add("Ed58Upvm5E");
        qRnumber.add("WEVMG58DKUR");
        qRnumber.add("wJuKhGk55pK");
        qRnumber.add("6yJ7h567gtr");
        qRnumber.add("TgrfLjMe55p4l");
        qRnumber.add("asd5D5df47F");

    }

    /*add voucher data into vData ArrayList<Voucher>*/
    private void addVoucherData(List<voucher> vData) {
        vData.add(new voucher(name[0],"$ "+21.9f,desc[0],120 ,QRnumber.get(0)));
        vData.add(new voucher(name[1],"$ "+53,desc[1],54,QRnumber.get(1)));

        vData.add(new voucher(name[2],"$ "+31.9f,desc[2],78,QRnumber.get(2)));
        vData.add(new voucher(name[3],"$ "+63,desc[3],248,QRnumber.get(3)));

        vData.add(new voucher(name[4],"$ "+11.9f,desc[4],148,QRnumber.get(4)));
        vData.add(new voucher(name[5],"$ "+30,desc[5],789,QRnumber.get(5)));

        vData.add(new voucher(name[6],"$ "+54.9f,desc[6],12,QRnumber.get(6)));
        vData.add(new voucher(name[7],"$ "+87,desc[7],456,QRnumber.get(7)));

        vData.add(new voucher(name[8],"$ "+210.9f,desc[8],147,QRnumber.get(8)));
        vData.add(new voucher(name[9],"$ "+530,desc[9],159,QRnumber.get(9)));

        vData.add(new voucher(name[10],"$ "+216.9f,desc[10],73,QRnumber.get(10)));

    }
    /*end voucher data*/

    /*add voucher image*/
    private void addVoucherImage(List<Integer> vImage) {
        vImage.add(R.drawable.a1);
        vImage.add(R.drawable.a2);
        vImage.add(R.drawable.a3);
        vImage.add(R.drawable.a4);
        vImage.add(R.drawable.a5);
        vImage.add(R.drawable.a7);
        vImage.add(R.drawable.a8);
        vImage.add(R.drawable.a9);
        vImage.add(R.drawable.a10);
        vImage.add(R.drawable.a9);
        vImage.add(R.drawable.a3);

    }/*end add voucher image*/

    /*Add voucher QR image*/
    private void addVoucherQRimage(ArrayList<Integer> qr)
    {
        qr.add(R.drawable.qr);
        qr.add(R.drawable.qr);
        qr.add(R.drawable.qr);
        qr.add(R.drawable.qr);
        qr.add(R.drawable.qr);
        qr.add(R.drawable.qr);
        qr.add(R.drawable.qr);
        qr.add(R.drawable.qr);
        qr.add(R.drawable.qr);
        qr.add(R.drawable.qr);
        qr.add(R.drawable.qr);

    }
    /*end QR*/


    /*Array Of String to hold voucher MOOC descriptioin data*/
    String [] desc ={"Charleen Badman's terrific leek gratin, topped with mozzarella, a fried egg and mustardy bread crumbs"
    ,"My motto is, 'mostly local, mostly organic...or stuff I really like, says chef-owner Christian Caiazzo"
    ,"David McGhee Smoked pork jowl: It's like bacon to the bacon power says chef and co-owner Tim Byres"
    ,"Viet Pham and Bowman Brown have turned an old bungalow into a minimalist restaurant and brought refined"
    ,"Chef Sean Baker's vegan charcuterie does not involve a bunch of vegetables masquerading as salumi"
    ,"Saison used to be a pop-up spot where customers had to walk through the kitchen to get to the very casual dining room"
    ,"Sweet or savory, hand pies appeal to anyone with a practical nature: They're tidy and easy to eat"
    ,"Could there possibly be another French toast prepared with as much attention as the one at this bright little place in Chicago's West Town?"
    ,"At Coppa, co-chef Jamie Bissonnette doesn't list all of his purveyors on his menu. I'm sick of reading menus like that"
    ,"For chef-owners Rich Torrisi and Mario Carbone, this dish's name is an inside joke and a serious reflection of their food philosophy."
    ,"The berries pay homage to the restaurant's Mulberry Street address"};

    /*MOOC data for voucher names*/
    String [] name ={"Braised Leeks","Lamb Salad","Smoked Pork Jowl"
                     ,"Scallop Sashimi","Vegan Charcuterie","Pappardelle"
                     ,"Pork Rillette Hand Pies","Malted Custard French Toast"
                     ,"Pasta with Lamb Rag","Island Duck ","Mulberry Mustard"};
}
