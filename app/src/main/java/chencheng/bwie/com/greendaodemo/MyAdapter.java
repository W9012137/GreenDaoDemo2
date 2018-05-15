package chencheng.bwie.com.greendaodemo;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>{
  private Context context;
  private List<User> list;
    OnClickfl onClickfl;
    public interface OnClickfl{
        void onClickxq(int position);
    }
    public void setOnclickSpflAdpter(OnClickfl onClickfl) {
        this.onClickfl = onClickfl;
    }
    public MyAdapter(Context context, List<User> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view=View.inflate(context,R.layout.rv_item,null);
        return new myHodwl(view);
    }


    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, final int position) {
         myHodwl hodwl= (myHodwl) holder;
         hodwl.text.setText(list.get(position).getName());
         hodwl.ll.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 onClickfl.onClickxq(position);
             }
         });
    }
    class  myHodwl extends RecyclerView.ViewHolder{
        LinearLayout ll;
    TextView text;
        public myHodwl(View itemView) {
            super(itemView);
            text=itemView.findViewById(R.id.text);
            ll=itemView.findViewById(R.id.ll);
        }
    }
    @Override
    public int getItemCount() {
        return list.size();
    }
}
