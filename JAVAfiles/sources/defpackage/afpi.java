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
public abstract class afpi extends agep implements apxr {
    private ContextWrapper a;
    private boolean b;
    private volatile apxh c;
    private final Object d;
    private boolean e;

    public afpi(agen agenVar) {
        super(R.layout.gboard_emoji_screen_layout, agenVar);
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

    @Override // defpackage.agai, defpackage.cg
    public void f(Context context) {
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
            afpb afpbVar = (afpb) this;
            kqm kqmVar = (kqm) aS();
            afpbVar.aH = (anca) kqmVar.a.yA.b();
            afpbVar.aI = kqmVar.a.a.ck;
            afpbVar.aJ = (arwe) kqmVar.e.b();
            afpbVar.aK = Optional.of(kqmVar.a.a.cm);
            afpbVar.c = (afmd) kqmVar.a.a.cg.b();
            afpbVar.a = alfd.a;
            kqmVar.o();
            afpbVar.b = kqmVar.b();
            apya apyaVar = kqmVar.bh.c;
            apya apyaVar2 = kqmVar.b;
            apya apyaVar3 = kqmVar.e;
            krv krvVar = kqmVar.a;
            apya apyaVar4 = krvVar.z;
            krx krxVar = krvVar.a;
            afpbVar.d = new afxz((armf) apyaVar, (armf) apyaVar2, (armf) apyaVar3, (armf) apyaVar4, (armf) krxVar.gQ, (armf) kqmVar.aZ, (byte[]) null, (byte[]) null);
            Context context = (Context) kqmVar.a.n.b();
            aneo aneoVar = (aneo) kqmVar.a.m.b();
            aneo aneoVar2 = (aneo) kqmVar.a.z.b();
            adwv adwvVar = (adwv) kqmVar.a.a.gR.b();
            krx krxVar2 = kqmVar.a.a;
            afpbVar.e = new afxz(context, aneoVar, aneoVar2, adwvVar, krxVar2.iq(), (afke) krxVar2.ck.b());
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
}
