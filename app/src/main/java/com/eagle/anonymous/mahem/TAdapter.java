package com.example.mohsal.near_me2;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;



public class TAdapter extends RecyclerView.Adapter<TAdapter.TViewHolder> {

    private Context context;
    private List<Takhfif> AdvList;
    private final ClickListener listener;
    private ArrayList<Integer> ratingg;

    private ImageView moon_1,moon_2,moon_3,moon_4,moon_5;
    private ImageView[] moons;

    public TAdapter(Context context, List<Takhfif> TakhfifList, ClickListener listener, ArrayList<Integer> ratingg) {

        this.context = context;
        this.AdvList = TakhfifList;
        this.listener = listener;
        this.ratingg=ratingg;
    }
    @Override
    public TViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        LayoutInflater inflater=LayoutInflater.from(context);
        View view=inflater.inflate(R.layout.activity_t_list,null);
        TViewHolder TViewHolder=new TViewHolder(view,listener,ratingg);

        return TViewHolder;
    }

    @Override
    public void onBindViewHolder(TViewHolder holder, int position) {

        Takhfif Takhfif=AdvList.get(position);
        holder.new_cost.setText(Takhfif.getNew_c());
        holder.pre_cost.setText(Takhfif.getLast_c());
        holder.t_describtion.setText(Takhfif.getT_describe());
        holder.t_city.setText(Takhfif.getT_city());
        holder.t_percent.setText((CharSequence) Takhfif.gett_percent());
        holder.t_image.setImageResource(Takhfif.getT_image());


    }

    @Override
    public int getItemCount() {
        return AdvList.size();
    }

    class TViewHolder extends RecyclerView.ViewHolder {


        private WeakReference<ClickListener> listenerRef;

        TextView new_cost, pre_cost, t_describtion, t_percent, t_city;
        ImageView t_image;

        public TViewHolder(View itemView, ClickListener listener, ArrayList<Integer> rating) {
            super(itemView);

            listenerRef = new WeakReference<>(listener);
            new_cost = (TextView) itemView.findViewById(R.id.new_cost);
            pre_cost = (TextView) itemView.findViewById(R.id.last_cost);
            t_describtion = (TextView) itemView.findViewById(R.id.t_des);
            t_percent = (TextView) itemView.findViewById(R.id.t_percent);
            t_city = (TextView) itemView.findViewById(R.id.t_city);
            moon_1 = (ImageView) itemView.findViewById(R.id.moon_one);
            moon_2 = (ImageView) itemView.findViewById(R.id.moon_two);
            moon_3 = (ImageView) itemView.findViewById(R.id.moon_three);
            moon_4 = (ImageView) itemView.findViewById(R.id.moon_four);
            moon_5 = (ImageView) itemView.findViewById(R.id.moon_five);
            t_image=(ImageView)itemView.findViewById(R.id.t_image);

            moons = new ImageView[]{moon_1, moon_2, moon_3, moon_4, moon_5};

            for (ImageView v:moons
                    ) {
                v.setImageResource(R.drawable.one);
            }
            for(int i=0;i<rating.get(i);++i){
                moons[i].setImageResource(R.drawable.two);
            }
        }

    }

}
