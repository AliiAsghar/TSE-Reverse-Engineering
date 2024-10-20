package com.bumptech.glide.manager;

import androidx.lifecycle.OnLifecycleEvent;
import defpackage.enf;
import defpackage.eng;
import defpackage.enh;
import defpackage.enl;
import defpackage.enm;
import defpackage.hwa;
import defpackage.hwb;
import defpackage.hyv;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class LifecycleLifecycle implements hwa, enl {
    private final Set a = new HashSet();
    private final enh b;

    public LifecycleLifecycle(enh enhVar) {
        this.b = enhVar;
        enhVar.c(this);
    }

    @Override // defpackage.hwa
    public final void a(hwb hwbVar) {
        this.a.add(hwbVar);
        if (this.b.a() == eng.DESTROYED) {
            hwbVar.k();
        } else if (this.b.a().a(eng.STARTED)) {
            hwbVar.l();
        } else {
            hwbVar.m();
        }
    }

    @Override // defpackage.hwa
    public final void b(hwb hwbVar) {
        this.a.remove(hwbVar);
    }

    @OnLifecycleEvent(a = enf.ON_DESTROY)
    public void onDestroy(enm enmVar) {
        Iterator it = hyv.g(this.a).iterator();
        while (it.hasNext()) {
            ((hwb) it.next()).k();
        }
        enmVar.N().d(this);
    }

    @OnLifecycleEvent(a = enf.ON_START)
    public void onStart(enm enmVar) {
        Iterator it = hyv.g(this.a).iterator();
        while (it.hasNext()) {
            ((hwb) it.next()).l();
        }
    }

    @OnLifecycleEvent(a = enf.ON_STOP)
    public void onStop(enm enmVar) {
        Iterator it = hyv.g(this.a).iterator();
        while (it.hasNext()) {
            ((hwb) it.next()).m();
        }
    }
}
