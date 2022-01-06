package com.example.tp2_mmm.databinding;
import com.example.tp2_mmm.R;
import com.example.tp2_mmm.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentFirstBindingImpl extends FragmentFirstBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.userDataContainer, 1);
        sViewsWithIds.put(R.id.text_VilleNaissance, 2);
        sViewsWithIds.put(R.id.text_Prenom, 3);
        sViewsWithIds.put(R.id.text_Nom, 4);
        sViewsWithIds.put(R.id.text_PhoneNum, 5);
        sViewsWithIds.put(R.id.text_DepartmentBirth, 6);
        sViewsWithIds.put(R.id.text_DateNaissance, 7);
        sViewsWithIds.put(R.id.editFirstName, 8);
        sViewsWithIds.put(R.id.editLastName, 9);
        sViewsWithIds.put(R.id.editBirthCity, 10);
        sViewsWithIds.put(R.id.editBirthDay, 11);
        sViewsWithIds.put(R.id.editPhoneNum, 12);
        sViewsWithIds.put(R.id.spinnerDepartmentBirth, 13);
        sViewsWithIds.put(R.id.button_Valid, 14);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentFirstBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 15, sIncludes, sViewsWithIds));
    }
    private FragmentFirstBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.Button) bindings[14]
            , (android.widget.EditText) bindings[10]
            , (android.widget.EditText) bindings[11]
            , (android.widget.EditText) bindings[8]
            , (android.widget.EditText) bindings[9]
            , (android.widget.EditText) bindings[12]
            , (android.widget.Spinner) bindings[13]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[2]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[1]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x1L;
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
            return variableSet;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
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
        // batch finished
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): null
    flag mapping end*/
    //end
}