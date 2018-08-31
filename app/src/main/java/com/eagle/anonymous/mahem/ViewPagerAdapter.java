package com.eagle.anonymous.mahem;

        import android.content.Context;
        import android.support.v4.view.PagerAdapter;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.ImageView;



public class ViewPagerAdapter extends PagerAdapter {

    private Context context;
    private LayoutInflater inflater;
        
        ///////////fill this array with network data for view pager
        /////////the drawables that I set to array is for test
    private int[] images={R.drawable.p1,R.drawable.p2,R.drawable.p3};
        ////////////////




    public ViewPagerAdapter(Context context){
        this.context=context;
    }
    @Override
    public int getCount() {
        return images.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view==object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        inflater =(LayoutInflater)context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View v=inflater.inflate(R.layout.swipe,container,false);
        ImageView imageView=(ImageView)v.findViewById(R.id.image_view);

        imageView.setImageResource(images[position]);

        container.addView(v);
        return v;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.invalidate();
    }
}
