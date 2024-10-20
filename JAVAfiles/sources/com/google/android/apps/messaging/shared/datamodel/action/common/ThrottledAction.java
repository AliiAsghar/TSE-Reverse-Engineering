package com.google.android.apps.messaging.shared.datamodel.action.common;

import android.os.Bundle;
import android.os.Parcel;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.akrh;
import defpackage.aktp;
import defpackage.akul;
import defpackage.algm;
import defpackage.amdy;
import defpackage.andi;
import defpackage.nau;
import defpackage.rhj;
import defpackage.rhl;
import defpackage.rht;
import defpackage.rhx;
import defpackage.uac;
import defpackage.wng;
import defpackage.xyo;
import defpackage.xze;
import defpackage.yyb;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class ThrottledAction extends Action<Void> {
    private static final xze a = xze.g("Bugle", "ThrottledAction");
    private final uac b;

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public interface a {
        uac RY();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public ThrottledAction(Parcel parcel, amdy amdyVar) {
        super(parcel, amdyVar);
        this.b = ((a) yyb.aL(a.class)).RY();
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final void A(rhj rhjVar) {
        rhj.b(this.t, rhjVar);
        G().b(this, f(), null);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final void E(rhj rhjVar) {
        rhj.b(this.t, rhjVar);
        G().b(this, f(), null);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final void F(long j) {
        int f = f();
        rht G = G();
        G.d(this, f, j, j, true);
        rhx rhxVar = G.c;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [armf, java.lang.Object] */
    public final rht G() {
        rht rhtVar;
        Class<?> cls = getClass();
        uac uacVar = this.b;
        synchronized (uacVar.b) {
            if (!uacVar.b.containsKey(cls)) {
                uacVar.b.put(cls, (rht) uacVar.a.b());
            }
            rhtVar = (rht) uacVar.b.get(cls);
        }
        return rhtVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void H(ThrottledAction throttledAction, String str) {
        rhl rhlVar = throttledAction.u;
        boolean z = false;
        boolean z2 = this.u.z(str, false);
        boolean z3 = rhlVar.z(str, false);
        if (z2 && z3) {
            z = true;
        }
        this.u.p(str, z);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void I(ThrottledAction throttledAction, String str) {
        rhl rhlVar = throttledAction.u;
        boolean z = false;
        boolean z2 = this.u.z(str, false);
        boolean z3 = rhlVar.z(str, false);
        if (z2 || z3) {
            z = true;
        }
        this.u.p(str, z);
    }

    public final void J() {
        G().d(this, f(), 0L, g(), false);
    }

    final boolean K() {
        rhl rhlVar = this.u;
        if (rhlVar == null) {
            xyo a2 = a.a();
            a2.H("actionParameters is null:");
            a2.H(getClass().getName());
            a2.q();
            return true;
        }
        return rhlVar.z("is_background", true);
    }

    public final void L() {
        F(g());
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public akrh a() {
        return aktp.e("ThrottledAction unknown action");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final /* bridge */ /* synthetic */ Object b() {
        throw new UnsupportedOperationException("#executeActionAsync should be called instead");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final akul e() {
        if (K()) {
            v();
            return aktp.ag(null);
        }
        return G().a(this);
    }

    public abstract int f();

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final Bundle fw() {
        throw new UnsupportedOperationException("#doBackgroundWorkAsync should be called instead");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final akul fx() {
        if (K()) {
            return G().a(this).h(new algm(null), andi.a);
        }
        return aktp.ag(null);
    }

    public abstract long g();

    public abstract String h();

    public akul k() {
        return aktp.ah(new nau(this, 16), andi.a);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final ListenableFuture r(wng wngVar) {
        return G().b(this, f(), wngVar);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final ListenableFuture t() {
        return G().b(this, f(), null);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final void w(long j) {
        G().d(this, f(), j, j, false);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C(parcel, i);
    }

    public ThrottledAction(amdy amdyVar) {
        super(amdyVar);
        this.b = ((a) yyb.aL(a.class)).RY();
    }

    public void i() {
    }

    public void j(ThrottledAction throttledAction) {
    }
}
