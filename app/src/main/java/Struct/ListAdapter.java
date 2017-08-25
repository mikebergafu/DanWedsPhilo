package Struct;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.widget.Toast;

import com.bitlogictechnologies.danwedsphilo.R;

import java.util.ArrayList;

import static com.bitlogictechnologies.danwedsphilo.R.id.tv_title;

/**
 * Created by Mike-berg on 18-07-2017.
 */

public class ListAdapter extends ArrayAdapter<String> {
    private ArrayList<String> main_text;
    private Activity context;

    public ListAdapter(Activity context, ArrayList<String> main_text) {
        super(context,R.layout.prog_list_struct, main_text);
        this.main_text = main_text;
        this.context = context;
    }

    //Makes the list a viewer object
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //creates a new inflate object ready to display the listview row items
        LayoutInflater inflater = context.getLayoutInflater();
        //defines a view object that is to display items in the listview based on a design defined in xml
        View listViewItem = inflater.inflate(R.layout.prog_list_struct, null, true);
        //references the fields in xml to load the list into one at a time
        TextView tv_main = (TextView) listViewItem.findViewById(R.id.tv_main_text);

        tv_main.setText(main_text.get(position));

        return  listViewItem;
    }
}
