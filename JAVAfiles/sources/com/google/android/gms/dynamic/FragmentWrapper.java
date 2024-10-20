package com.google.android.gms.dynamic;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.google.android.gms.dynamic.IFragmentWrapper;
import defpackage.abhg;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class FragmentWrapper extends IFragmentWrapper.Stub {
    private final Fragment a;

    private FragmentWrapper(Fragment fragment) {
        this.a = fragment;
    }

    public static FragmentWrapper wrap(Fragment fragment) {
        if (fragment != null) {
            return new FragmentWrapper(fragment);
        }
        return null;
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public IObjectWrapper getActivity() {
        return ObjectWrapper.wrap(this.a.getActivity());
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public Bundle getArguments() {
        return this.a.getArguments();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public int getId() {
        return this.a.getId();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public IFragmentWrapper getParentFragment() {
        return wrap(this.a.getParentFragment());
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public IObjectWrapper getResources() {
        return ObjectWrapper.wrap(this.a.getResources());
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public boolean getRetainInstance() {
        return this.a.getRetainInstance();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public String getTag() {
        return this.a.getTag();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public IFragmentWrapper getTargetFragment() {
        return wrap(this.a.getTargetFragment());
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public int getTargetRequestCode() {
        return this.a.getTargetRequestCode();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public boolean getUserVisibleHint() {
        return this.a.getUserVisibleHint();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public IObjectWrapper getView() {
        return ObjectWrapper.wrap(this.a.getView());
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public boolean isAdded() {
        return this.a.isAdded();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public boolean isDetached() {
        return this.a.isDetached();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public boolean isHidden() {
        return this.a.isHidden();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public boolean isInLayout() {
        return this.a.isInLayout();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public boolean isRemoving() {
        return this.a.isRemoving();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public boolean isResumed() {
        return this.a.isResumed();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public boolean isVisible() {
        return this.a.isVisible();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public void registerForContextMenu(IObjectWrapper iObjectWrapper) {
        View view = (View) ObjectWrapper.unwrap(iObjectWrapper);
        abhg.m(view);
        this.a.registerForContextMenu(view);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public void setHasOptionsMenu(boolean z) {
        this.a.setHasOptionsMenu(z);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public void setMenuVisibility(boolean z) {
        this.a.setMenuVisibility(z);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public void setRetainInstance(boolean z) {
        this.a.setRetainInstance(z);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public void setUserVisibleHint(boolean z) {
        this.a.setUserVisibleHint(z);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public void startActivity(Intent intent) {
        this.a.startActivity(intent);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public void startActivityForResult(Intent intent, int i) {
        this.a.startActivityForResult(intent, i);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public void unregisterForContextMenu(IObjectWrapper iObjectWrapper) {
        View view = (View) ObjectWrapper.unwrap(iObjectWrapper);
        abhg.m(view);
        this.a.unregisterForContextMenu(view);
    }
}
