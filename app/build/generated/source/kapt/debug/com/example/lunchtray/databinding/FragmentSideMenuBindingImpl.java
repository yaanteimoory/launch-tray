package com.example.lunchtray.databinding;
import com.example.lunchtray.R;
import com.example.lunchtray.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentSideMenuBindingImpl extends FragmentSideMenuBinding implements com.example.lunchtray.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.side_options, 16);
        sViewsWithIds.put(R.id.divider, 17);
    }
    // views
    @NonNull
    private final android.widget.ScrollView mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback11;
    @Nullable
    private final android.view.View.OnClickListener mCallback12;
    @Nullable
    private final android.view.View.OnClickListener mCallback9;
    @Nullable
    private final android.view.View.OnClickListener mCallback13;
    @Nullable
    private final android.view.View.OnClickListener mCallback8;
    @Nullable
    private final android.view.View.OnClickListener mCallback10;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentSideMenuBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 18, sIncludes, sViewsWithIds));
    }
    private FragmentSideMenuBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (android.widget.Button) bindings[14]
            , (android.view.View) bindings[17]
            , (android.widget.Button) bindings[15]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[9]
            , (android.widget.RadioButton) bindings[7]
            , (android.widget.RadioButton) bindings[10]
            , (android.widget.TextView) bindings[11]
            , (android.widget.TextView) bindings[12]
            , (android.widget.RadioButton) bindings[1]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[3]
            , (android.widget.RadioGroup) bindings[16]
            , (android.widget.RadioButton) bindings[4]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[13]
            );
        this.cancelButton.setTag(null);
        this.mboundView0 = (android.widget.ScrollView) bindings[0];
        this.mboundView0.setTag(null);
        this.nextButton.setTag(null);
        this.potatoDescription.setTag(null);
        this.potatoPrice.setTag(null);
        this.potatoes.setTag(null);
        this.rice.setTag(null);
        this.riceDescription.setTag(null);
        this.ricePrice.setTag(null);
        this.salad.setTag(null);
        this.saladDescription.setTag(null);
        this.saladPrice.setTag(null);
        this.soup.setTag(null);
        this.soupDescription.setTag(null);
        this.soupPrice.setTag(null);
        this.subtotal.setTag(null);
        setRootTag(root);
        // listeners
        mCallback11 = new com.example.lunchtray.generated.callback.OnClickListener(this, 4);
        mCallback12 = new com.example.lunchtray.generated.callback.OnClickListener(this, 5);
        mCallback9 = new com.example.lunchtray.generated.callback.OnClickListener(this, 2);
        mCallback13 = new com.example.lunchtray.generated.callback.OnClickListener(this, 6);
        mCallback8 = new com.example.lunchtray.generated.callback.OnClickListener(this, 1);
        mCallback10 = new com.example.lunchtray.generated.callback.OnClickListener(this, 3);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x10L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.context == variableId) {
            setContext((com.example.lunchtray.ui.order.SideMenuFragment) variable);
        }
        else if (BR.viewModel == variableId) {
            setViewModel((com.example.lunchtray.model.OrderViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setContext(@Nullable com.example.lunchtray.ui.order.SideMenuFragment Context) {
        this.mContext = Context;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.context);
        super.requestRebind();
    }
    public void setViewModel(@Nullable com.example.lunchtray.model.OrderViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelSubtotal((androidx.lifecycle.LiveData<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeViewModelSide((androidx.lifecycle.LiveData<com.example.lunchtray.model.MenuItem>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelSubtotal(androidx.lifecycle.LiveData<java.lang.String> ViewModelSubtotal, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelSide(androidx.lifecycle.LiveData<com.example.lunchtray.model.MenuItem> ViewModelSide, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        androidx.lifecycle.LiveData<java.lang.String> viewModelSubtotal = null;
        java.lang.String viewModelMenuItemsSoupName = null;
        java.util.Map<java.lang.String,com.example.lunchtray.model.MenuItem> viewModelMenuItems = null;
        com.example.lunchtray.model.MenuItem viewModelMenuItemsSoup = null;
        java.lang.String viewModelMenuItemsSoupGetFormattedPrice = null;
        java.lang.String viewModelMenuItemsPotatoesDescription = null;
        com.example.lunchtray.model.MenuItem viewModelSideGetValue = null;
        boolean viewModelSideEqualsViewModelMenuItemsSalad = false;
        java.lang.String viewModelMenuItemsSoupDescription = null;
        androidx.lifecycle.LiveData<com.example.lunchtray.model.MenuItem> viewModelSide = null;
        java.lang.String viewModelMenuItemsPotatoesName = null;
        com.example.lunchtray.model.MenuItem viewModelMenuItemsPotatoes = null;
        boolean viewModelSideEqualsViewModelMenuItemsSoup = false;
        com.example.lunchtray.model.MenuItem viewModelMenuItemsSalad = null;
        boolean viewModelSideEqualsViewModelMenuItemsPotatoes = false;
        java.lang.String subtotalAndroidStringSubtotalViewModelSubtotal = null;
        com.example.lunchtray.ui.order.SideMenuFragment context = mContext;
        java.lang.String viewModelMenuItemsRiceDescription = null;
        java.lang.String viewModelMenuItemsRiceName = null;
        java.lang.String viewModelSubtotalGetValue = null;
        com.example.lunchtray.model.MenuItem viewModelMenuItemsRice = null;
        java.lang.String viewModelMenuItemsSaladDescription = null;
        java.lang.String viewModelMenuItemsSaladName = null;
        java.lang.String viewModelMenuItemsPotatoesGetFormattedPrice = null;
        java.lang.String viewModelMenuItemsSaladGetFormattedPrice = null;
        com.example.lunchtray.model.OrderViewModel viewModel = mViewModel;
        java.lang.String viewModelMenuItemsRiceGetFormattedPrice = null;
        boolean viewModelSideEqualsViewModelMenuItemsRice = false;

        if ((dirtyFlags & 0x1bL) != 0) {


            if ((dirtyFlags & 0x19L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.subtotal
                        viewModelSubtotal = viewModel.getSubtotal();
                    }
                    updateLiveDataRegistration(0, viewModelSubtotal);


                    if (viewModelSubtotal != null) {
                        // read viewModel.subtotal.getValue()
                        viewModelSubtotalGetValue = viewModelSubtotal.getValue();
                    }


                    // read @android:string/subtotal
                    subtotalAndroidStringSubtotalViewModelSubtotal = subtotal.getResources().getString(R.string.subtotal, viewModelSubtotalGetValue);
            }
            if ((dirtyFlags & 0x1aL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.menuItems
                        viewModelMenuItems = viewModel.getMenuItems();
                        // read viewModel.side
                        viewModelSide = viewModel.getSide();
                    }
                    updateLiveDataRegistration(1, viewModelSide);


                    if (viewModelMenuItems != null) {
                        // read viewModel.menuItems["soup"]
                        viewModelMenuItemsSoup = viewModelMenuItems.get("soup");
                        // read viewModel.menuItems["potatoes"]
                        viewModelMenuItemsPotatoes = viewModelMenuItems.get("potatoes");
                        // read viewModel.menuItems["salad"]
                        viewModelMenuItemsSalad = viewModelMenuItems.get("salad");
                        // read viewModel.menuItems["rice"]
                        viewModelMenuItemsRice = viewModelMenuItems.get("rice");
                    }
                    if (viewModelSide != null) {
                        // read viewModel.side.getValue()
                        viewModelSideGetValue = viewModelSide.getValue();
                    }

                if ((dirtyFlags & 0x18L) != 0) {

                        if (viewModelMenuItemsSoup != null) {
                            // read viewModel.menuItems["soup"].name
                            viewModelMenuItemsSoupName = viewModelMenuItemsSoup.getName();
                            // read viewModel.menuItems["soup"].getFormattedPrice()
                            viewModelMenuItemsSoupGetFormattedPrice = viewModelMenuItemsSoup.getFormattedPrice();
                            // read viewModel.menuItems["soup"].description
                            viewModelMenuItemsSoupDescription = viewModelMenuItemsSoup.getDescription();
                        }
                        if (viewModelMenuItemsPotatoes != null) {
                            // read viewModel.menuItems["potatoes"].description
                            viewModelMenuItemsPotatoesDescription = viewModelMenuItemsPotatoes.getDescription();
                            // read viewModel.menuItems["potatoes"].name
                            viewModelMenuItemsPotatoesName = viewModelMenuItemsPotatoes.getName();
                            // read viewModel.menuItems["potatoes"].getFormattedPrice()
                            viewModelMenuItemsPotatoesGetFormattedPrice = viewModelMenuItemsPotatoes.getFormattedPrice();
                        }
                        if (viewModelMenuItemsSalad != null) {
                            // read viewModel.menuItems["salad"].description
                            viewModelMenuItemsSaladDescription = viewModelMenuItemsSalad.getDescription();
                            // read viewModel.menuItems["salad"].name
                            viewModelMenuItemsSaladName = viewModelMenuItemsSalad.getName();
                            // read viewModel.menuItems["salad"].getFormattedPrice()
                            viewModelMenuItemsSaladGetFormattedPrice = viewModelMenuItemsSalad.getFormattedPrice();
                        }
                        if (viewModelMenuItemsRice != null) {
                            // read viewModel.menuItems["rice"].description
                            viewModelMenuItemsRiceDescription = viewModelMenuItemsRice.getDescription();
                            // read viewModel.menuItems["rice"].name
                            viewModelMenuItemsRiceName = viewModelMenuItemsRice.getName();
                            // read viewModel.menuItems["rice"].getFormattedPrice()
                            viewModelMenuItemsRiceGetFormattedPrice = viewModelMenuItemsRice.getFormattedPrice();
                        }
                }

                    if (viewModelSideGetValue != null) {
                        // read viewModel.side.getValue().equals(viewModel.menuItems["salad"])
                        viewModelSideEqualsViewModelMenuItemsSalad = viewModelSideGetValue.equals(viewModelMenuItemsSalad);
                        // read viewModel.side.getValue().equals(viewModel.menuItems["soup"])
                        viewModelSideEqualsViewModelMenuItemsSoup = viewModelSideGetValue.equals(viewModelMenuItemsSoup);
                        // read viewModel.side.getValue().equals(viewModel.menuItems["potatoes"])
                        viewModelSideEqualsViewModelMenuItemsPotatoes = viewModelSideGetValue.equals(viewModelMenuItemsPotatoes);
                        // read viewModel.side.getValue().equals(viewModel.menuItems["rice"])
                        viewModelSideEqualsViewModelMenuItemsRice = viewModelSideGetValue.equals(viewModelMenuItemsRice);
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x10L) != 0) {
            // api target 1

            this.cancelButton.setOnClickListener(mCallback12);
            this.nextButton.setOnClickListener(mCallback13);
            this.potatoes.setOnClickListener(mCallback10);
            this.rice.setOnClickListener(mCallback11);
            this.salad.setOnClickListener(mCallback8);
            this.soup.setOnClickListener(mCallback9);
        }
        if ((dirtyFlags & 0x18L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.potatoDescription, viewModelMenuItemsPotatoesDescription);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.potatoPrice, viewModelMenuItemsPotatoesGetFormattedPrice);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.potatoes, viewModelMenuItemsPotatoesName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.rice, viewModelMenuItemsRiceName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.riceDescription, viewModelMenuItemsRiceDescription);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.ricePrice, viewModelMenuItemsRiceGetFormattedPrice);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.salad, viewModelMenuItemsSaladName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.saladDescription, viewModelMenuItemsSaladDescription);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.saladPrice, viewModelMenuItemsSaladGetFormattedPrice);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.soup, viewModelMenuItemsSoupName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.soupDescription, viewModelMenuItemsSoupDescription);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.soupPrice, viewModelMenuItemsSoupGetFormattedPrice);
        }
        if ((dirtyFlags & 0x1aL) != 0) {
            // api target 1

            androidx.databinding.adapters.CompoundButtonBindingAdapter.setChecked(this.potatoes, viewModelSideEqualsViewModelMenuItemsPotatoes);
            androidx.databinding.adapters.CompoundButtonBindingAdapter.setChecked(this.rice, viewModelSideEqualsViewModelMenuItemsRice);
            androidx.databinding.adapters.CompoundButtonBindingAdapter.setChecked(this.salad, viewModelSideEqualsViewModelMenuItemsSalad);
            androidx.databinding.adapters.CompoundButtonBindingAdapter.setChecked(this.soup, viewModelSideEqualsViewModelMenuItemsSoup);
        }
        if ((dirtyFlags & 0x19L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.subtotal, subtotalAndroidStringSubtotalViewModelSubtotal);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 4: {
                // localize variables for thread safety
                // viewModel
                com.example.lunchtray.model.OrderViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {



                    viewModel.setSide("rice");
                }
                break;
            }
            case 5: {
                // localize variables for thread safety
                // context != null
                boolean contextJavaLangObjectNull = false;
                // context
                com.example.lunchtray.ui.order.SideMenuFragment context = mContext;



                contextJavaLangObjectNull = (context) != (null);
                if (contextJavaLangObjectNull) {


                    context.cancelOrder();
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // viewModel
                com.example.lunchtray.model.OrderViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {



                    viewModel.setSide("soup");
                }
                break;
            }
            case 6: {
                // localize variables for thread safety
                // context != null
                boolean contextJavaLangObjectNull = false;
                // context
                com.example.lunchtray.ui.order.SideMenuFragment context = mContext;



                contextJavaLangObjectNull = (context) != (null);
                if (contextJavaLangObjectNull) {


                    context.goToNextScreen();
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // viewModel
                com.example.lunchtray.model.OrderViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {



                    viewModel.setSide("salad");
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // viewModel
                com.example.lunchtray.model.OrderViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {



                    viewModel.setSide("potatoes");
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.subtotal
        flag 1 (0x2L): viewModel.side
        flag 2 (0x3L): context
        flag 3 (0x4L): viewModel
        flag 4 (0x5L): null
    flag mapping end*/
    //end
}