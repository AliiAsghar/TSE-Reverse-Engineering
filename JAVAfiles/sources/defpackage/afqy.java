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
public abstract class afqy extends agem implements apxr {
    private ContextWrapper a;
    private boolean b;
    private volatile apxh c;
    private final Object d;
    private boolean e;

    afqy() {
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
            afre afreVar = (afre) this;
            kqm kqmVar = (kqm) aS();
            afreVar.aH = (anca) kqmVar.a.yA.b();
            afreVar.aI = kqmVar.a.a.ck;
            afreVar.aJ = (arwe) kqmVar.e.b();
            afreVar.aK = Optional.empty();
            afreVar.a = Optional.empty();
            apya apyaVar = kqmVar.aY;
            krv krvVar = kqmVar.a;
            apya apyaVar2 = krvVar.dO;
            krx krxVar = krvVar.a;
            afreVar.e = new adef(apyaVar, apyaVar2, krxVar.gS, krvVar.yA, krxVar.ck, null);
        }
    }

    @Override // defpackage.agai, defpackage.cg
    public void f(Context context) {
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

    public afqy(Integer num, agen agenVar) {
        super(num, agenVar);
        this.d = new Object();
        this.e = false;
    }
}
