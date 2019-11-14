package ru.startandroid.listbindinghomework.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;
import java.util.LinkedList;
import java.util.List;
import ru.startandroid.listbindinghomework.R;
import ru.startandroid.listbindinghomework.databinding.EmployeeItemBinding;
import ru.startandroid.listbindinghomework.model.Employee;

public class EmployeeAdapter extends RecyclerView.Adapter<EmployeeHolder> {

    private List<Employee> items = new LinkedList<>();

    public void setData(List<Employee> data) {
        items.clear();
        items.addAll(data);
    }

    @NonNull
    @Override
    public EmployeeHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        EmployeeItemBinding binding = DataBindingUtil.inflate(inflater, R.layout.employee_item, parent, false);
        return new EmployeeHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull EmployeeHolder holder, int position) {
        holder.bind(items.get(position));
    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}
