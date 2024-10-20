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
public abstract class afvt extends agem implements apxr {
    private ContextWrapper a;
    private boolean b;
    private volatile apxh c;
    private final Object d;
    private boolean e;

    afvt() {
        this.d = new Object();
        this.e = false;
    }

    private final void e() {
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
        e();
        d();
    }

    @Override // defpackage.apxr
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
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

    @Override // defpackage.apxq
    public final Object aS() {
        return aR().aS();
    }

    protected final void d() {
        if (!this.e) {
            this.e = true;
            afvx afvxVar = (afvx) this;
            kqm kqmVar = (kqm) aS();
            afvxVar.aH = (anca) kqmVar.a.yA.b();
            afvxVar.aI = kqmVar.a.a.ck;
            afvxVar.aJ = (arwe) kqmVar.e.b();
            afvxVar.aK = Optional.of(kqmVar.G);
            afvxVar.ak = new aday(kqmVar.ba, kqmVar.bb, (char[]) null, (byte[]) null);
            afvxVar.aj = new adta(kqmVar.E, null, null, null);
            kqj kqjVar = kqmVar.bh;
            apya apyaVar = kqjVar.c;
            apya apyaVar2 = kqmVar.e;
            krv krvVar = kqmVar.a;
            afvxVar.ai = new afxz((armf) apyaVar, (armf) apyaVar2, (armf) krvVar.dO, (armf) krvVar.bQ, (armf) kqjVar.aF, (armf) kqmVar.bd, (byte[]) null);
            afvxVar.ag = Optional.empty();
            afvxVar.ah = Optional.empty();
        }
    }

    @Override // defpackage.agai, defpackage.cg
    public final void f(Context context) {
        super.f(context);
        e();
        d();
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
        e();
        return this.a;
    }

    public afvt(Integer num, agen agenVar) {
        super(num, agenVar);
        this.d = new Object();
        this.e = false;
    }
}
