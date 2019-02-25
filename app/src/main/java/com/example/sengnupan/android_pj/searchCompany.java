package com.example.sengnupan.android_pj;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Bundle;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.TypedValue;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;



import java.util.ArrayList;
import java.util.List;

public class searchCompany extends AppCompatActivity {

    private RecyclerView recyclerView;
    private CompanyAdapter adapter;
    private List<company> companyList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_company);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        // initCollapsingToolbar();
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        companyList = new ArrayList<>();
        adapter = new CompanyAdapter(this, companyList);

        RecyclerView.LayoutManager mLayoutManager = new GridLayoutManager(this, 1);
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.addItemDecoration(new GridSpacingItemDecoration(1, dpToPx(10), true));
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);
        prepareCompany();
        if(getIntent().getExtras() != null){
            Toast.makeText(this, "Search Company ",Toast.LENGTH_SHORT).show();
        }
    }
  /*  public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.stories_menu, menu);
        return true;
    }*/



    /**
     * Adding few albums for testing
     */
    private void prepareCompany() {
        company ii= new company("Marter Innovative Solution", "Mon-Sat","8:30AM-5:00PM","Lunch Free","No","free style", "09787391332","www.softwaremyanmar.com","171.5th Floor,Ka(3rd)Street,Insein Tsp(Near Nyaung Pin Bus Stop),Yangon","16.841241","96.126531");
        companyList.add(ii);
        company k = new company("Software Myanmar(ICT service and Training)","Mon-Sun","9:00AM-8:00PM","No","No","free style", "09787391332","www.softwaremyanmar.com","171.5th Floor,Ka(3rd)Street,Insein Tsp(Near Nyaung Pin Bus Stop),Yangon","16.841241","96.126531");
        companyList.add(k);
        company e = new company("Acroquest Myanmar Technology", "Mon-Fri","9:00AM-5:00PM","lunch Free","-","Only Shirt", "01374128","www.acromyanmar.com","5th Floor,Bld,No(260/261),Shwe Bon Tha Street & Corner of Anawrahta Road,Pabedan Tsp,Yangon","16.777155","96.156133");
        companyList.add(e);

        company a = new company("SignalBase Myanmar Co.,Ltd", "Mon-Fri","8:00AM-3:00PM","No","coffee and snack free","not required","09264577072","www.signalbase.co.jp","TWIN CENTRO,Tower A,409,Baho Road,Sanchaung Township,Yangon","16.799747","96.130390");
        companyList.add(a);

        company b = new company("Orient Co.,Ltd", "Mon-Fri","8:30AM-5:00PM","No","No","free style", "09441037890","www.orientitsolution.com","28th Street,Between 70th & 71st Streets,Mandalay","21.979322","96.099550");
        companyList.add(b);
        company c = new company("U.M.S Queen", "Mon-Fri","8:00AM-5:00PM","No","No","free style",     "095064316","www.umsqueen.com.mm","MICT Park,Hlaing Universities Campus,Yangon","16.849648","96.129225");
        companyList.add(c);

        company f = new company("Global Innovation Consulting(GIC)","Mon-Fri","8:30AM-5:00PM","No","No","free style","0103001675","www.gicjp.com","Building No.256,Room No.307,7th Floor,Pin Lon Hteik Htar,Pan So Dan Upper block,Kyauktada Tsp,Yangon","16.775488","96.163606");
        companyList.add(f);
        company g = new company("Global Innovation Consulting(GIC)","Mon-Fri","8:30AM-5:00PM","No","No","free style","09423385177","www.gicjp.com","No.A5,SinLanMa Street,Bet 18*19 & 57*58,Nanshae,Shwe Nan Taw Housing,Aung May Tharsan Tsp,Mandalay,Myanmar","21.991830","96.123102");
        companyList.add(g);


        company j= new company("T Work System", "Mon-Sat","9:00AM-5:00PM","No","No","free style",    "09965088114","www.tworksystem.com","No(14/1),79th Street,between 39th and 40th Streets,Mandalay","21.962157","96.084245");
        companyList.add(j);




        company m = new company("Galaxy Software Service", "Mon-Fri","8:30AM-5:30PM","No","Free","free style", "0943209550","www.galaxy.com.mm","29-A/B,1st floor,New University Avenue Road,Bahan Tsp,Yangon","16.823546","96.154977");
        companyList.add(m);
        company o= new company("ICT Star Group Myanmar Co.,Ltd","Mon-Fri","8:30AM-5:00PM","NO","Snack everyday","free style", "01430013","www.isgm2.com","No.520,Excel Treasure Tower,7th Floor,Room 701,Shwe Gon Daing Tsp,Yangon","16.807623","96.155013");
        companyList.add(o);

        company n= new company("Nex4","Mon-Fri","9:00AM-5:00PM","No","No","free style", "012305190","www.nex4.net","Blk 18,MICT Park #212-214,Hlaing Tsp,Yangon","16.850509","96.128700");

        companyList.add(n);
       // company jj = new company("Bits Manager", "Mon-Sat","8:30AM-5:00PM","Free","-","free style","http://bits-manager.com","77st,Between 31st & 332st,Mandalay");
       // companyList.add(jj);
        company p= new company("High Quality Service(HQS)Co.,Ltd", "Tue-Sat","8:30AM-5:30PM","No","Snack Free","free style","01507050","www.hqsco.com","Damar Yon St,Yangon","16.842278","96.132471");

        companyList.add(p);


       // company r= new company("View Research", "Mon-Fri","8:30AM-5:00PM","Free","-","free style","www.viewresearch.com","Yangon");
       // companyList.add(r);
      //  company s= new company("Skynet", "Mon-Fri","8:30AM-5:00PM","Free","-","free style","www.skynetdth.com","Yangon");
        //companyList.add(s);

        //company t= new company("Ayeyarwaddy Informatin Technology Development","Mon-Sat","9:00AM-5:00PM","No","No","free style","www.aitdevelop.com","Yangon");
      //  companyList.add(t);
       // company u= new company("Ayeyarwaddy Informatin Technology Development", "Mon-Sat","9:00AM-5:00PM","No","No","free style","www.aitdevelop.com","Yangon");
       // companyList.add(u);

        company v=new company("Myanmar DCR", "Mon-Fri","8:00AM-5:00PM","No","Snack free","free style",  "01248053","www.myanmardcr.com","No.608,Bosoonpat Condo 11F,Corner of Merchant Road & Bosoonpat Street,Merchant Road,Pabedan Tsp,Yangon","16.772224","96.157253");
        companyList.add(v);
        company w=  new company("Myanmar DCR", "Mon-Fri","8:00AM-5:00PM","No","Snack free","free style",        "01248053","www.myanmardcr.com","Block1,Unit2,Mingalar Project Building,73rd St,Between Thazin St, and Ngu Shwe War St,Chan Mya Tharsi Tsp,Mandalay","21.941002","96.092177");
companyList.add(w);
        company x=new company("Realistic Infotech Group","Mon-Fri","8:30AM-5:00PM","No","No","free style","09450063582","www.rig-info.com",",No.242,First Floor,36th Street,Upper Block,Kyauttader Tsp,Yangon,Myanmar","16.778366","96.161317");
        companyList.add(x);
        company y= new company("Realistic Infotech Group", "Mon-Fri","8:30AM-5:00PM","No","No","free style","09772519761","www.rig-info.com","Yarzar Business Center,39th Street(Bamawtike Street) Between 70th & 71st Street,Mandalay","21.963775","96.101318");
        companyList.add(y);

        company z= new company("360ed", "Mon-Fri","9:30AM-6:00PM","No","No","free style",        "09969624360","www.360ed.org","No.(70-72)6th floor,Thamain Bayan Road,Tarmwe Gyi(Kha)Quarter,Yangon","16.811113","96.175811");
        companyList.add(z);
       // company aa=  new company("Tosco", "Mon-Fri","8:00AM-5:00PM","No","No","free style","www.cscnet.co.jp","2-12-19 GotandaNN Bld.13F,Nishigotanda,Shinagawa-ku,Tokyo,141-0031,Japan");
       // companyList.add(aa);

        company bb=  new company("NTT Data Myanmar","Mon-Fri","9:00AM-5:00PM","No","No","free style",       "012305132","www.nttdata.com.mm","Building No.17,1st Floor,MICT Park(Phase-3),Thamine College St,Yangon","16.850599","96.129009 ");
        companyList.add(bb);
        company cc=  new company("Mspiral Company", "Mon-Fri","9:00AM-6:00PM","No","Snack free","free style",      "0973162122","www.mspiral.com","Seikkantha St.,Yangon","16.777248","96.163317");
        companyList.add(cc);

       // company dd =new company("Thazin FM", "Mon-Fri","8:30AM-4:00PM","No","No","free style","www.thazinfm.com.mm","Pyin Oo Lwin");
       // companyList.add(dd);
       // company ee= new company("Ayeyarwady Bank","Mon-Fri","9:30AM-3:00PM","No","no","yes","www.ayabank.com","No.416,Mahabandoola Road,Kyauktada Tsp,Yangon");
        //companyList.add(ee);
        company ff = new company("Ahtar Oo Co.,Ltd", "Mon-Sat","9:00AM-5:00PM","no","no","free style", "012305193","www.ahtaroo.com","B-9,Room-001,Shwe Kabar Housing,Mindama Road,3-Quarter,Mayangone Tsp,Building-16,Room-505,MICT Park,Hlaing Tsp,Yangon,Myanmar","16.868192","96.131121");
        companyList.add(ff);
        company gg =  new company("Asia Brightway IT Co.,Ltd", "Mon-Sat","9:00AM-5:00PM","No","Snack Free","free style",      "09256400425","www.asiabrightway.com","No.A3,78th St,Bet 32nd & 33rd St,Mandalay","21.975333","96.118360");
        companyList.add(gg);
        company hh=  new company("Asia Brightway IT Co.,Ltd", "Mon-Sat","8:00AM-5:00PM","no","No","free style",
                "09256400425","www.asiabrightway.com","No.A3,78th St,Bet 32nd & 33rd St,Mandalay","21.975333","96.118360");
        companyList.add(hh);
        adapter.notifyDataSetChanged();
    }



    /**
     * RecyclerView item decoration - give equal margin around grid item
     */
    public class GridSpacingItemDecoration extends RecyclerView.ItemDecoration {

        private int spanCount;
        private int spacing;
        private boolean includeEdge;

        public GridSpacingItemDecoration(int spanCount, int spacing, boolean includeEdge) {
            this.spanCount = spanCount;
            this.spacing = spacing;
            this.includeEdge = includeEdge;
        }

        @Override
        public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
            int position = parent.getChildAdapterPosition(view); // item position
            int column = position % spanCount; // item column

            if (includeEdge) {
                outRect.left = spacing - column * spacing / spanCount; // spacing - column * ((1f / spanCount) * spacing)
                outRect.right = (column + 1) * spacing / spanCount; // (column + 1) * ((1f / spanCount) * spacing)

                if (position < spanCount) { // top edge
                    outRect.top = spacing;
                }
                outRect.bottom = spacing; // item bottom
            } else {
                outRect.left = column * spacing / spanCount; // column * ((1f / spanCount) * spacing)
                outRect.right = spacing - (column + 1) * spacing / spanCount; // spacing - (column + 1) * ((1f /    spanCount) * spacing)
                if (position >= spanCount) {
                    outRect.top = spacing; // item top
                }
            }
        }
    }

    /**
     * Converting dp to pixel
     */
    private int dpToPx(int dp) {
        Resources r = getResources();
        return Math.round(TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp, r.getDisplayMetrics()));
    }
   /* private void initCollapsingToolbar() {
        final CollapsingToolbarLayout collapsingToolbar =
                (CollapsingToolbarLayout) findViewById(R.id.collapsing_toolbar);
        collapsingToolbar.setTitle(" ");
        AppBarLayout appBarLayout = (AppBarLayout) findViewById(R.id.appbar);
        appBarLayout.setExpanded(true);

        // hiding & showing the title when toolbar expanded & collapsed
        appBarLayout.addOnOffsetChangedListener(new AppBarLayout.OnOffsetChangedListener() {
            boolean isShow = false;
            int scrollRange = -1;

            @Override
            public void onOffsetChanged(AppBarLayout appBarLayout, int verticalOffset) {
                if (scrollRange == -1) {
                    scrollRange = appBarLayout.getTotalScrollRange();
                }
                if (scrollRange + verticalOffset == 0) {
                    collapsingToolbar.setTitle(getString(R.string.app_name));
                    isShow = true;
                } else if (isShow) {
                    collapsingToolbar.setTitle(" ");
                    isShow = false;
                }
            }
        });
    }
*/
}




