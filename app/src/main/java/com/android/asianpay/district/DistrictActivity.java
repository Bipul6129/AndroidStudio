package com.android.asianpay.district;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.android.asianpay.R;
import com.android.asianpay.district.model.DistrictModel;

import java.util.ArrayList;

public class DistrictActivity extends AppCompatActivity {

    RecyclerView districtRecyclerView;
    LinearLayoutManager layoutManager;

    ArrayList<DistrictModel> data = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_district);
        //fixme 1 init
        districtRecyclerView = findViewById(R.id.district_recyclerview);
        //fixme 2 linearlayout manager
        layoutManager = new LinearLayoutManager(this);
        //fixme 3 set layout manager
        districtRecyclerView.setLayoutManager(layoutManager);
        //fixme 4 init adapter
        //fixme 5 set adapter
    }

    void createDistrictData () {
        data.add(new DistrictModel("Nawalparasi", 643508, 27.9, 216.9));
        data.add(new DistrictModel("Ilam", 290254, 21.6, 1703.5));
        data.add(new DistrictModel("Kaski", 492098, 22.5, 2015.5));
        data.add(new DistrictModel("Dang", 553481, 26.1, 2819.5));
        data.add(new DistrictModel("Kailali", 775709, 27.4, 3184.4));
        data.add(new DistrictModel("Baitadi", 250898, 23.7, 1521.0));
        data.add(new DistrictModel("Dhankuta", 163412, 20.8, 891.5));
        data.add(new DistrictModel("Jumla", 108921, 16.9, 2534.0));
        data.add(new DistrictModel("Sankhuwasabha", 159203, 19.4, 3483.0));
        data.add(new DistrictModel("Taplejung", 127461, 18.3, 3646.0));
        data.add(new DistrictModel("Gorkha", 271061, 22.5, 3610.2));
        data.add(new DistrictModel("Baglung", 289148, 19.5, 1785.5));
        data.add(new DistrictModel("Syangja", 289148, 21.1, 395.6));
        data.add(new DistrictModel("Rupandehi", 880196, 26.8, 1360.0));
        data.add(new DistrictModel("Palpa", 261180, 23.8, 1373.0));
        data.add(new DistrictModel("Salyan", 261180, 25.5, 1460.0));
        data.add(new DistrictModel("Dolakha", 204229, 18.4, 2191.0));
        data.add(new DistrictModel("Makwanpur", 420477, 26.2, 2427.0));
        data.add(new DistrictModel("Okhaldhunga", 147984, 18.8, 1079.0));
        data.add(new DistrictModel("Udayapur", 317532, 25.7, 2064.0));
        data.add(new DistrictModel("Tanahu", 315237, 22.7, 1548.6));
        data.add(new DistrictModel("Parbat", 157826, 20.5, 494.0));
        data.add(new DistrictModel("Kanchanpur", 451248, 26.8, 6156.0));
        data.add(new DistrictModel("Bajura", 133408, 16.2, 2415.0));
        data.add(new DistrictModel("Bajhang", 195159, 21.1, 3427.0));
        data.add(new DistrictModel("Humla", 50, 7.4, 5693.0));
        data.add(new DistrictModel("Kapilvastu", 571936, 26.4, 1738.0));
        data.add(new DistrictModel("Saptari", 639284, 27.5, 1362.0));
        data.add(new DistrictModel("Siraha", 637328, 27.7, 1183.0));
        data.add(new DistrictModel("Dhanusha", 754777, 27.1, 1185.0));
        data.add(new DistrictModel("Mahottari", 627580, 27.8, 1016.0));
        data.add(new DistrictModel("Rautahat", 686722, 27.5, 1122.0));
        data.add(new DistrictModel("Bara", 687708, 28.0, 1197.0));
        data.add(new DistrictModel("Parsa", 601017, 27.6, 1368.0));
        data.add(new DistrictModel("Kavrepalanchok", 385672, 21.8, 1397.0));
        data.add(new DistrictModel("Lalitpur", 337785, 23.2, 385.0));
        data.add(new DistrictModel("Bhaktapur", 304651, 22.8, 119.0));
        data.add(new DistrictModel("Sindhuli", 296192, 25.0, 2491.0));
        data.add(new DistrictModel("Nuwakot", 277471, 21.8, 1121.0));
        data.add(new DistrictModel("Sindhupalchok", 296192, 19.7, 2541.0));


    }
}