package com.example.bai52giangbai;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class SanphamAdapter extends BaseAdapter {
    //gọi cái layout nào
    private Context context;
    //truyền ở dạng layout nào tự mình
    private int layout;
    // list danh sách chứa đổi tượng (các sản phẩm)
    private List<Sanpham> sanphamList;// dựa vào cái này

    public SanphamAdapter(Context context, int layout, List<Sanpham> sanphamList) {
        this.context = context;
        this.layout = layout;
        this.sanphamList = sanphamList;
    }


// trả lại số dòng để hiển thị trên listview
    @Override
    public int getCount() {
        return sanphamList.size();// nếu 5 dòng thôi thì return 5;
    }

    //2 thằng id và Itemid mình k sử (sử dụng cái mảng sanphamList)
    @Override
    public Object getItem(int i) {
        return null;
    }

    //trả về id của mỗi dòng list view
    @Override
    public long getItemId(int i) {
        return 0;
    }


    //
    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        //trả về mỗi dòng của list view khi gọi đến cái adapter
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        view = layoutInflater.inflate(layout,null);

        //Ánh xạ view
        TextView txtTen = (TextView) view.findViewById(R.id.TextviewTen);
        TextView txtMoTa = (TextView) view.findViewById(R.id.textviewMoTa);
        ImageView img = (ImageView) view.findViewById(R.id.imageviewhinh);

        //Gán giá trị
        Sanpham sanpham = sanphamList.get(i);

        txtTen.setText(sanpham.getName());
        txtMoTa.setText(sanpham.getDescription());
        img.setImageResource(sanpham.getImage());

        return view;
    }
}
