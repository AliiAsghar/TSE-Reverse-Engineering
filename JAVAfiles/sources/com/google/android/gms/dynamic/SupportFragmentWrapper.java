package com.google.android.gms.dynamic;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.google.android.gms.dynamic.IFragmentWrapper;
import defpackage.abhg;
import defpackage.cg;
import defpackage.elz;
import defpackage.ema;
import defpackage.emb;
import defpackage.emd;
import defpackage.eme;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class SupportFragmentWrapper extends IFragmentWrapper.Stub {
    private final cg a;

    private SupportFragmentWrapper(cg cgVar) {
        this.a = cgVar;
    }

    public static SupportFragmentWrapper wrap(cg cgVar) {
        if (cgVar != null) {
            return new SupportFragmentWrapper(cgVar);
        }
        return null;
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public IObjectWrapper getActivity() {
        return ObjectWrapper.wrap(this.a.fe());
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public Bundle getArguments() {
        return this.a.m;
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public int getId() {
        return this.a.F;
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public IFragmentWrapper getParentFragment() {
        return wrap(this.a.E);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public IObjectWrapper getResources() {
        return ObjectWrapper.wrap(this.a.z());
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public boolean getRetainInstance() {
        cg cgVar = this.a;
        emd emdVar = new emd(cgVar);
        emb.d(emdVar);
        ema b = emb.b(cgVar);
        if (b.b.contains(elz.DETECT_RETAIN_INSTANCE_USAGE) && emb.e(b, cgVar.getClass(), emdVar.getClass())) {
            emb.c(b, emdVar);
        }
        return cgVar.K;
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public String getTag() {
        return this.a.H;
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public IFragmentWrapper getTargetFragment() {
        return wrap(this.a.fd());
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public int getTargetRequestCode() {
        cg cgVar = this.a;
        eme emeVar = new eme(cgVar);
        emb.d(emeVar);
        ema b = emb.b(cgVar);
        if (b.b.contains(elz.DETECT_TARGET_FRAGMENT_USAGE) && emb.e(b, cgVar.getClass(), emeVar.getClass())) {
            emb.c(b, emeVar);
        }
        return cgVar.p;
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public boolean getUserVisibleHint() {
        return this.a.S;
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public IObjectWrapper getView() {
        return ObjectWrapper.wrap(this.a.Q);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public boolean isAdded() {
        return this.a.aw();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public boolean isDetached() {
        return this.a.J;
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public boolean isHidden() {
        return this.a.ax();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public boolean isInLayout() {
        return this.a.w;
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public boolean isRemoving() {
        return this.a.s;
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public boolean isResumed() {
        return this.a.az();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public boolean isVisible() {
        return this.a.aB();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public void registerForContextMenu(IObjectWrapper iObjectWrapper) {
        View view = (View) ObjectWrapper.unwrap(iObjectWrapper);
        abhg.m(view);
        view.setOnCreateContextMenuListener(this.a);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public void setHasOptionsMenu(boolean z) {
        this.a.am(z);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public void setMenuVisibility(boolean z) {
        this.a.ao(z);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public void setRetainInstance(boolean z) {
        this.a.ar(z);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public void setUserVisibleHint(boolean z) {
        this.a.at(z);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public void startActivity(Intent intent) {
        this.a.au(intent);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public void startActivityForResult(Intent intent, int i) {
        this.a.startActivityForResult(intent, i);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public void unregisterForContextMenu(IObjectWrapper iObjectWrapper) {
        View view = (View) ObjectWrapper.unwrap(iObjectWrapper);
        abhg.m(view);
        view.setOnCreateContextMenuListener(null);
    }
}
