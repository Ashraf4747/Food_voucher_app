package com.city.coding.restaurant3;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class newsFragment extends Fragment {
    //inflater view
    private View view ;


    //data for news
    private ArrayList<news> nData ;
    private ArrayList<Integer> nImage;
    //end data for news
    private RecyclerView recyclerView ;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        nData= new ArrayList<news>();
        nImage = new ArrayList<Integer>();
        addFragmentnewsData();
        addFragmentnewsImage();
    }

    /*inflate newsFragment layout
    * set news Recycler Adapter with data source
    * attach fragment recyclerView to set to it news Recycler Adapter
    * set layoutManager
    * set Adapter and return the inlfater view with adapted items with data*/
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.news_fragment_layout,container ,false);
        newsRecycleViewAdapter adapter = new newsRecycleViewAdapter(getContext(),nData ,nImage);
        recyclerView = view.findViewById(R.id.newsRecyclerViewID);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(adapter);
        return view;
    }
    //end


    //add news Image
    private void addFragmentnewsImage(){
        nImage.add(R.drawable.a1);
    }
    //end


    // add news Data (title , content)
    private void addFragmentnewsData(){
    nData.add(new news("news","content of the news dslfjsdkfsdfasjlkdflskdjfls sdkfjsdk sdfjsdlf sdfoij oj kj lj osdfk p jpsd ojsdf,d  ojsdf popsdfnsd  ojsdmfsdf slr fwdfs"));
    }
}//end newsFragment class
