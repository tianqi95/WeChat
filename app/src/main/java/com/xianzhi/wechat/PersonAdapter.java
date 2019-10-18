package com.xianzhi.wechat;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

/**
 * Demo class
 *
 * @author LiBo
 * @date 2019/three/14
 */
public class PersonAdapter extends BaseAdapter {
    private List<Person> personList;
    private Context context;

    public PersonAdapter(List<Person> personList, Context context) {
        this.personList = personList;
        this.context = context;
    }



    @Override
    public int getCount() {
        return personList.size();
    }

    @Override
    public Object getItem(int position) {
        return personList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        if (convertView == null) {
            viewHolder = new ViewHolder();
            convertView = LayoutInflater.from(context).inflate(R.layout.person_item, null);
            viewHolder.tvName = convertView.findViewById(R.id.tv_name);
            viewHolder.tvText = convertView.findViewById(R.id.tv_text);
            viewHolder.ivPersonal = convertView.findViewById(R.id.iv_image);
            viewHolder.relContent = convertView.findViewById(R.id.rel_content);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        viewHolder.tvName.setText(personList.get(position).getName());
        viewHolder.tvText.setText(personList.get(position).getText());
        viewHolder.ivPersonal.setImageResource(personList.get(position).getImageId());

        viewHolder.relContent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, position + "" , Toast.LENGTH_SHORT).show();
            }
        });

        return convertView;

    }

    class ViewHolder {
        TextView tvName;
        TextView tvText;
        ImageView ivPersonal;
        RelativeLayout relContent;
    }
}
