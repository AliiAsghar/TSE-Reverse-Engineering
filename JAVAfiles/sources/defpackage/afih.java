package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import defpackage.apxm;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class afih extends agem implements apxr {
    private ContextWrapper a;
    private boolean b;
    private volatile apxh c;
    private final Object d;
    private boolean e;

    afih() {
        this.d = new Object();
        this.e = false;
    }

    private final void a() {
        if (this.a == null) {
            this.a = new apxm.a(super.x(), this);
            this.b = aowt.q(super.x());
        }
    }

    @Override // defpackage.cg, defpackage.enb
    public final eov P() {
        return aowt.n(this, super.P());
    }

    @Override // defpackage.cg
    public final void Y(Activity activity) {
        super.Y(activity);
        ContextWrapper contextWrapper = this.a;
        boolean z = true;
        if (contextWrapper != null && apxh.d(contextWrapper) != activity) {
            z = false;
        }
        apzj.g(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        a();
        bg();
    }

    @Override // defpackage.apxq
    public final Object aS() {
        return aR().aS();
    }

    @Override // defpackage.apxr
    /* renamed from: bf, reason: merged with bridge method [inline-methods] */
    public final apxh aR() {
        if (this.c == null) {
            synchronized (this.d) {
                if (this.c == null) {
                    this.c = new apxh(this);
                }
            }
        }
        return this.c;
    }

    protected final void bg() {
        if (!this.e) {
            this.e = true;
            afid afidVar = (afid) this;
            kqm kqmVar = (kqm) aS();
            afidVar.aH = (anca) kqmVar.a.yA.b();
            afidVar.aI = kqmVar.a.a.ck;
            afidVar.aJ = (arwe) kqmVar.e.b();
            afidVar.aK = Optional.of(kqmVar.J);
            afidVar.am = (afks) kqmVar.aQ.b();
            afidVar.az = (afxz) kqmVar.aR.b();
            afidVar.aB = (aiim) kqmVar.bh.aC.b();
            afidVar.ax = new adwp(kqmVar.aU, null, null);
            arwe arweVar = (arwe) kqmVar.e.b();
            cg cgVar = (cg) ((apxx) kqmVar.b).a;
            Optional of = Optional.of(new afgt(new afgy(new adze(kqmVar.a.a.ck, null), 1), Optional.empty(), new afgy(new adwo(kqmVar.a.a.ck), 0)));
            arweVar.getClass();
            Optional map = of.map(new admk(new afho(arweVar, cgVar, 2, null), 18));
            map.getClass();
            afidVar.an = map;
            afidVar.aw = new adwp(kqmVar.bh.aC, null);
            afidVar.ay = new adwo(kqmVar.b, null, null);
            afidVar.aC = (aodz) kqmVar.aV.b();
            afidVar.ao = (Activity) kqmVar.bh.c.b();
            afidVar.ap = Optional.empty();
            afidVar.aq = Optional.empty();
            afidVar.ar = (aful) kqmVar.a.a.gk.b();
            afidVar.as = (afdv) kqmVar.a.a.eT.b();
            afidVar.at = (arwe) kqmVar.a.bQ.b();
            afidVar.au = Optional.of((iou) kqmVar.bh.m.b());
            afidVar.aA = new addp(kqmVar.bh.c, kqmVar.aX, (byte[]) null, (byte[]) null);
            afidVar.av = kqmVar.a.a.eV;
        }
    }

    @Override // defpackage.agai, defpackage.cg
    public final void f(Context context) {
        super.f(context);
        a();
        bg();
    }

    @Override // defpackage.cg
    public final LayoutInflater gl(Bundle bundle) {
        LayoutInflater aD = aD();
        return aD.cloneInContext(new apxm.a(aD, this));
    }

    @Override // defpackage.cg
    public final Context x() {
        if (super.x() == null && !this.b) {
            return null;
        }
        a();
        return this.a;
    }

    public afih(Integer num, agen agenVar) {
        super(num, agenVar);
        this.d = new Object();
        this.e = false;
    }
}
