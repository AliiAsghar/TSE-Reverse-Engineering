package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.media.AudioManager;
import android.os.Bundle;
import android.view.LayoutInflater;
import defpackage.apxm;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class agil extends agem implements apxr {
    private ContextWrapper a;
    private boolean b;
    private volatile apxh c;
    private final Object d;
    private boolean e;

    agil() {
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
            agit agitVar = (agit) this;
            kqm kqmVar = (kqm) aS();
            agitVar.aH = (anca) kqmVar.a.yA.b();
            agitVar.aI = kqmVar.a.a.ck;
            agitVar.aJ = (arwe) kqmVar.e.b();
            agitVar.aK = Optional.empty();
            agitVar.d = (aiim) kqmVar.bh.aC.b();
            agitVar.b = (AudioManager) kqmVar.a.ur.b();
            krx krxVar = kqmVar.a.a;
            agitVar.c = new agje(new aggk((Context) krxVar.a.n.b(), (arwe) krxVar.a.dO.b()), (Activity) kqmVar.bh.c.b(), Optional.empty());
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

    public agil(Integer num) {
        super(num);
        this.d = new Object();
        this.e = false;
    }
}
