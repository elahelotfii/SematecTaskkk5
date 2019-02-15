package ir.sematec.sematectask5;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class TestAdapter extends RecyclerView.Adapter<TestAdapter.TestViewHolder> {


    @NonNull
    @Override
    public TestViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

       View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.test_recycler_item,parent,false);

       TestViewHolder holder = new TestViewHolder(v);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull TestViewHolder holder, int position) {
        switch (position){
            case 0:
                holder.txt.setText("Pouya Heydari");
                break;
            case 1:
                holder.txt.setText("Arbabi");
                break;
            case 2:
                holder.txt.setText("Amjadi");
                break;
                case 3:
                holder.txt.setText("Basim Far");
                break;
                case 4:
                holder.txt.setText("Sarani");
                break;
            case 5:
                holder.txt.setText("Salehi");
                break;
            case 6:
                holder.txt.setText("Tariqi");
                break;
            case 7:
                holder.txt.setText("Talaee");
                break;
            case 8:
                holder.txt.setText("Alipour");
                break;
            case 9:
                holder.txt.setText("Elahe Lotfi");
                break;
            case 10:
                holder.txt.setText("Nasrin Mohammadi");
                break;
        }

    }

    @Override
    public int getItemCount() {
        return 11;
    }

    class TestViewHolder extends RecyclerView.ViewHolder{

        TextView txt;
        public TestViewHolder( View itemView){
          super(itemView);

            txt = itemView.findViewById(R.id.txtName);
        }




    }
}
