package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.google.android.apps.messaging.ui.debug.DebugMmsConfigFragment;
import defpackage.apxm;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class aamg extends cg implements apxr {
    private ContextWrapper a;
    private boolean b;
    private volatile apxh c;
    private final Object d;
    private boolean e;

    public aamg() {
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
        o();
    }

    @Override // defpackage.apxq
    public final Object aS() {
        return aR().aS();
    }

    @Override // defpackage.apxr
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
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

    @Override // defpackage.cg
    public final void f(Context context) {
        super.f(context);
        a();
        o();
    }

    @Override // defpackage.cg
    public final LayoutInflater gl(Bundle bundle) {
        LayoutInflater aD = aD();
        return aD.cloneInContext(new apxm.a(aD, this));
    }

    protected final void o() {
        if (!this.e) {
            this.e = true;
            DebugMmsConfigFragment debugMmsConfigFragment = (DebugMmsConfigFragment) this;
            kqm kqmVar = (kqm) aS();
            debugMmsConfigFragment.e = (yjy) kqmVar.a.aF.b();
            krv krvVar = kqmVar.a;
            debugMmsConfigFragment.ah = new zjq(krvVar.hA, krvVar.pm, krvVar.vC);
            debugMmsConfigFragment.ag = (yck) kqmVar.a.fa.b();
        }
    }

    @Override // defpackage.cg
    public final Context x() {
        if (super.x() == null && !this.b) {
            return null;
        }
        a();
        return this.a;
    }

    aamg(int i) {
        super(i);
        this.d = new Object();
        this.e = false;
    }
}
