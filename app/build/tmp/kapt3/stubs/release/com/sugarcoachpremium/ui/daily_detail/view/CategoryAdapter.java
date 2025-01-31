package com.sugarcoachpremium.ui.daily_detail.view;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\r\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u0018\u0010\"\u001a\u00020#2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010$\u001a\u00020\u0004H\u0002J\b\u0010%\u001a\u00020&H\u0016J\u0010\u0010\'\u001a\u00020#2\u0006\u0010(\u001a\u00020&H\u0016J\u0018\u0010)\u001a\u00020#2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010*\u001a\u00020&H\u0016J\u0018\u0010+\u001a\u00020\u00022\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020&H\u0016J\u0016\u0010/\u001a\u00020#2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000400H\u0016J\u000e\u00101\u001a\u00020#2\u0006\u00102\u001a\u00020\u001dR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u00020\tX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u000fX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\"\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0017X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\u00020\u001dX\u0096.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!\u00a8\u00063"}, d2 = {"Lcom/sugarcoachpremium/ui/daily_detail/view/CategoryAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lcom/skydoves/powerspinner/PowerSpinnerInterface;", "Lcom/sugarcoachpremium/data/database/repository/dailyregister/Category;", "activity", "Lcom/sugarcoachpremium/ui/daily_detail/view/DailyDetailActivity;", "(Lcom/sugarcoachpremium/ui/daily_detail/view/DailyDetailActivity;)V", "binding", "Lcom/sugarcoachpremium/databinding/CategoryItemBinding;", "getBinding", "()Lcom/sugarcoachpremium/databinding/CategoryItemBinding;", "setBinding", "(Lcom/sugarcoachpremium/databinding/CategoryItemBinding;)V", "holder", "Lcom/sugarcoachpremium/ui/daily_detail/view/CategoriesHolder;", "getHolder", "()Lcom/sugarcoachpremium/ui/daily_detail/view/CategoriesHolder;", "setHolder", "(Lcom/sugarcoachpremium/ui/daily_detail/view/CategoriesHolder;)V", "itemList", "", "onSpinnerItemSelectedListener", "Lcom/skydoves/powerspinner/OnSpinnerItemSelectedListener;", "getOnSpinnerItemSelectedListener", "()Lcom/skydoves/powerspinner/OnSpinnerItemSelectedListener;", "setOnSpinnerItemSelectedListener", "(Lcom/skydoves/powerspinner/OnSpinnerItemSelectedListener;)V", "spinnerView", "Lcom/skydoves/powerspinner/PowerSpinnerView;", "getSpinnerView", "()Lcom/skydoves/powerspinner/PowerSpinnerView;", "setSpinnerView", "(Lcom/skydoves/powerspinner/PowerSpinnerView;)V", "bind", "", "item", "getItemCount", "", "notifyItemSelected", "index", "onBindViewHolder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setItems", "", "setPowerView", "powerSpinnerView", "app_release"})
public final class CategoryAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<androidx.recyclerview.widget.RecyclerView.ViewHolder> implements com.skydoves.powerspinner.PowerSpinnerInterface<com.sugarcoachpremium.data.database.repository.dailyregister.Category> {
    @org.jetbrains.annotations.NotNull
    private final com.sugarcoachpremium.ui.daily_detail.view.DailyDetailActivity activity = null;
    public com.skydoves.powerspinner.PowerSpinnerView spinnerView;
    @org.jetbrains.annotations.Nullable
    private com.skydoves.powerspinner.OnSpinnerItemSelectedListener<com.sugarcoachpremium.data.database.repository.dailyregister.Category> onSpinnerItemSelectedListener;
    @org.jetbrains.annotations.NotNull
    private java.util.List<com.sugarcoachpremium.data.database.repository.dailyregister.Category> itemList;
    public com.sugarcoachpremium.ui.daily_detail.view.CategoriesHolder holder;
    public com.sugarcoachpremium.databinding.CategoryItemBinding binding;
    
    public CategoryAdapter(@org.jetbrains.annotations.NotNull
    com.sugarcoachpremium.ui.daily_detail.view.DailyDetailActivity activity) {
        super();
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public com.skydoves.powerspinner.PowerSpinnerView getSpinnerView() {
        return null;
    }
    
    public void setSpinnerView(@org.jetbrains.annotations.NotNull
    com.skydoves.powerspinner.PowerSpinnerView p0) {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public com.skydoves.powerspinner.OnSpinnerItemSelectedListener<com.sugarcoachpremium.data.database.repository.dailyregister.Category> getOnSpinnerItemSelectedListener() {
        return null;
    }
    
    @java.lang.Override
    public void setOnSpinnerItemSelectedListener(@org.jetbrains.annotations.Nullable
    com.skydoves.powerspinner.OnSpinnerItemSelectedListener<com.sugarcoachpremium.data.database.repository.dailyregister.Category> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.sugarcoachpremium.ui.daily_detail.view.CategoriesHolder getHolder() {
        return null;
    }
    
    public final void setHolder(@org.jetbrains.annotations.NotNull
    com.sugarcoachpremium.ui.daily_detail.view.CategoriesHolder p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.sugarcoachpremium.databinding.CategoryItemBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.NotNull
    com.sugarcoachpremium.databinding.CategoryItemBinding p0) {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    androidx.recyclerview.widget.RecyclerView.ViewHolder holder, int position) {
    }
    
    public final void setPowerView(@org.jetbrains.annotations.NotNull
    com.skydoves.powerspinner.PowerSpinnerView powerSpinnerView) {
    }
    
    @java.lang.Override
    public void setItems(@org.jetbrains.annotations.NotNull
    java.util.List<com.sugarcoachpremium.data.database.repository.dailyregister.Category> itemList) {
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override
    public void notifyItemSelected(int index) {
    }
    
    private final void bind(com.sugarcoachpremium.ui.daily_detail.view.CategoriesHolder holder, com.sugarcoachpremium.data.database.repository.dailyregister.Category item) {
    }
}