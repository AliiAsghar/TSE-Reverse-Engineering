package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.google.android.apps.messaging.R;
import defpackage.apxm;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class afoh extends agep implements apxr {
    private ContextWrapper a;
    private boolean b;
    private volatile apxh c;
    private final Object d;
    private boolean e;

    public afoh(agen agenVar) {
        super(R.layout.emoji_screen_layout, agenVar);
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
        ba();
    }

    @Override // defpackage.apxq
    public final Object aS() {
        return aR().aS();
    }

    @Override // defpackage.apxr
    /* renamed from: aZ, reason: merged with bridge method [inline-methods] */
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

    protected final void ba() {
        if (!this.e) {
            this.e = true;
            afof afofVar = (afof) this;
            kqm kqmVar = (kqm) aS();
            afofVar.aH = (anca) kqmVar.a.yA.b();
            afofVar.aI = kqmVar.a.a.ck;
            afofVar.aJ = (arwe) kqmVar.e.b();
            afofVar.aK = Optional.of(kqmVar.a.a.cm);
            afofVar.am = (afmd) kqmVar.a.a.cg.b();
            afofVar.a = (arwe) kqmVar.a.dO.b();
            afofVar.b = (afpp) kqmVar.bh.aK.b();
            afofVar.c = new afox((Activity) kqmVar.bh.c.b(), (arwe) kqmVar.a.dO.b(), (afmq) kqmVar.a.a.cp.b(), (afke) kqmVar.a.a.ck.b(), (arwe) kqmVar.e.b(), (afpp) kqmVar.bh.aK.b());
            afofVar.d = new afoy((afmq) kqmVar.a.a.cp.b(), (afke) kqmVar.a.a.ck.b(), (afpp) kqmVar.bh.aK.b(), (arwe) kqmVar.e.b());
            afofVar.ag = alfd.a;
            kqmVar.o();
            afofVar.ap = kqmVar.r();
            afofVar.an = (afmq) kqmVar.a.a.cp.b();
        }
    }

    @Override // defpackage.agai, defpackage.cg
    public void f(Context context) {
        super.f(context);
        a();
        ba();
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
}
