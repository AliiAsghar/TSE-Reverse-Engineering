package com.google.android.libraries.compose.ui.composable;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;
import defpackage.abid;
import defpackage.afkq;
import defpackage.afmg;
import defpackage.afmo;
import defpackage.afob;
import defpackage.afww;
import defpackage.afxy;
import defpackage.afxz;
import defpackage.afye;
import defpackage.afyf;
import defpackage.afyi;
import defpackage.afyk;
import defpackage.agdq;
import defpackage.ageo;
import defpackage.agff;
import defpackage.alvi;
import defpackage.armd;
import defpackage.armf;
import defpackage.arml;
import defpackage.arpe;
import defpackage.arqr;
import defpackage.arrn;
import defpackage.arro;
import defpackage.arwe;
import defpackage.da;
import defpackage.nq;
import defpackage.rg;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class HugoHostFragment extends afyi implements afyf {
    public static final alvi a = alvi.m("com/google/android/libraries/compose/ui/composable/HugoHostFragment");
    public afkq ag;
    public agff ah;
    public arqr ai;
    public afxy aj;
    public rg ak;
    public Integer al;
    private final arml am;
    public afxz b;
    public arwe c;
    public Optional d;
    public armf e;

    public HugoHostFragment() {
        super(R.layout.hugo_anchor);
        this.ai = afob.n;
        this.am = armd.a(new afww(this, 18));
    }

    @Override // defpackage.cg
    public final View K(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        View K = super.K(layoutInflater, viewGroup, bundle);
        byte[] bArr = null;
        if (K == null) {
            return null;
        }
        afxz afxzVar = this.b;
        if (afxzVar == null) {
            arro.b("hugoManagerFactory");
            afxzVar = null;
        }
        ageo ageoVar = e().a;
        da G = G();
        afww afwwVar = new afww(this, 16);
        abid abidVar = new abid(K, this, 17, bArr);
        e();
        boolean z = e().d;
        e();
        afye a2 = afxzVar.a(ageoVar, G, afwwVar, new agdq(new afww(this, 17), (ViewGroup) K, abidVar, 0, false, false, false, z, e().g, true, 5090));
        a2.d();
        this.aj = a2;
        this.ak = nq.o(F().c(), F(), false, new afmo(this, 14));
        arrn.J(o(), null, null, new afmg(this, (arpe) null, 14), 3);
        arrn.J(o(), null, null, new afmg(this, (arpe) null, 15, (byte[]) null), 3);
        return K;
    }

    @Override // defpackage.cg
    public final void aa() {
        afxy afxyVar = this.aj;
        if (afxyVar != null) {
            afxyVar.f();
        }
        rg rgVar = this.ak;
        if (rgVar != null) {
            rgVar.f();
        }
        super.aa();
    }

    @Override // defpackage.cg
    public final void ag(View view, Bundle bundle) {
        afxy afxyVar;
        view.getClass();
        if (e().b && bundle != null && (afxyVar = this.aj) != null) {
            afxyVar.i(bundle);
        }
    }

    public final afyk e() {
        return (afyk) this.am.a();
    }

    @Override // defpackage.cg
    public final void j(Bundle bundle) {
        afxy afxyVar;
        if (e().b && (afxyVar = this.aj) != null) {
            afxyVar.j(bundle);
        }
    }

    public final arwe o() {
        arwe arweVar = this.c;
        if (arweVar != null) {
            return arweVar;
        }
        arro.b("uiScope");
        return null;
    }

    @Override // defpackage.cg, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        configuration.getClass();
        super.onConfigurationChanged(configuration);
        if (e().e) {
            afxy afxyVar = this.aj;
            if (afxyVar == null) {
                arro.b("hugoManager");
                afxyVar = null;
            }
            afxyVar.g();
        }
    }
}
