package ru.startandroid.listbindinghomework.adapter;

import androidx.recyclerview.widget.RecyclerView;
import ru.startandroid.listbindinghomework.databinding.EmployeeItemBinding;
import ru.startandroid.listbindinghomework.model.Employee;

public class EmployeeHolder extends RecyclerView.ViewHolder {

    EmployeeItemBinding binding;

    public EmployeeHolder(EmployeeItemBinding binding) {
        super(binding.getRoot());
        this.binding = binding;
    }

    public void bind(Employee employee) {
        binding.setEmployee(employee);
        binding.executePendingBindings();
    }

}
