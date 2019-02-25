package com.example.sengnupan.android_pj;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.github.barteksc.pdfviewer.PDFView;
import com.github.barteksc.pdfviewer.listener.OnLoadCompleteListener;
import com.github.barteksc.pdfviewer.listener.OnPageChangeListener;
import com.github.barteksc.pdfviewer.scroll.DefaultScrollHandle;

public class Files extends AppCompatActivity implements OnPageChangeListener,OnLoadCompleteListener{

    // public static final String SAMPLE_FILE = "SBM_internship_application_form.pdf";

    PDFView pdfView;
    Integer pageNumber = 0;
    String pdfFileName;
    MainActivity mainActivity;
    String[]cvForm={"Signal Base Myanmar.pdf", "Software Myanmar.pdf","Orient.pdf", "UTYCC Intern.pdf"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_files);
        pdfView= (PDFView)findViewById(R.id.pdfView);

        Bundle extra=getIntent().getExtras();
        if(extra!=null){
            displayFromAsset(extra.getString("key"));
        }

        //Log.e("output",sampleFile);


        /*browser=(WebView)findViewById(R.id.cv);
        browser.loadUrl("http://www.softwaremyanmar.com");*/


    }
    private void displayFromAsset(String assetFileName) {

        if(assetFileName.equals("Signal Base Myanmar")){
            pdfFileName=cvForm[0];
        }
        else if(assetFileName.equals("Software Myanmar")){
            pdfFileName=cvForm[1];
        }
        else if(assetFileName.equals("Orient")){
            pdfFileName=cvForm[2];
        }
        else{
            pdfFileName=cvForm[3];
        }
        pdfView.fromAsset(pdfFileName)
                .defaultPage(pageNumber)
                .enableSwipe(true)

                .swipeHorizontal(false)
                .onPageChange(this)
                .enableAnnotationRendering(true)
                .onLoad(this)
                .scrollHandle(new DefaultScrollHandle(this))
                .load();
    }


    @Override
    public void onPageChanged(int page, int pageCount) {
       /* pageNumber = page;
        setTitle(String.format("%s %s / %s", pdfFileName, page + 1, pageCount));*/
    }


    @Override
    public void loadComplete(int nbPages) {
        /*PdfDocument.Meta meta = pdfView.getDocumentMeta();
        printBookmarksTree(pdfView.getTableOfContents(), "-");*/

    }

    /*public void printBookmarksTree(List<PdfDocument.Bookmark> tree, String sep) {
        for (PdfDocument.Bookmark b : tree) {

            Log.e(TAG, String.format("%s %s, p %d", sep, b.getTitle(), b.getPageIdx()));

            if (b.hasChildren()) {
                printBookmarksTree(b.getChildren(), sep + "-");
            }
        }
    }*/

    /*public void fileOpen(String name){
        String file="";
        try{
            InputStream input=getAssets().open(name);
            file=input.toString();

        }
        catch (IOException e){
            e.printStackTrace();
        }

    }*/

}
