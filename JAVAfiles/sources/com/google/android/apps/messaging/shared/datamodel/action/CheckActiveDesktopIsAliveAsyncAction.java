package com.google.android.apps.messaging.shared.datamodel.action;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import defpackage.akrh;
import defpackage.aktp;
import defpackage.akul;
import defpackage.albo;
import defpackage.amdy;
import defpackage.andi;
import defpackage.anen;
import defpackage.anfo;
import defpackage.angd;
import defpackage.aozs;
import defpackage.aozy;
import defpackage.apag;
import defpackage.apba;
import defpackage.apwt;
import defpackage.aqdq;
import defpackage.aqfn;
import defpackage.armf;
import defpackage.ksn;
import defpackage.lpg;
import defpackage.ltv;
import defpackage.mbl;
import defpackage.qdm;
import defpackage.qlf;
import defpackage.qwz;
import defpackage.qyv;
import defpackage.qyw;
import defpackage.sol;
import defpackage.soo;
import defpackage.sor;
import defpackage.tgn;
import defpackage.tkg;
import defpackage.trf;
import defpackage.trg;
import defpackage.trh;
import defpackage.trm;
import defpackage.trn;
import defpackage.vcc;
import defpackage.vcf;
import defpackage.veq;
import defpackage.ver;
import defpackage.wpp;
import defpackage.xnv;
import defpackage.xze;
import defpackage.ydv;
import j$.util.Optional;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class CheckActiveDesktopIsAliveAsyncAction extends Action<Void> {
    public final trn d;
    public final mbl e;
    public final armf f;
    public final qyw g;
    private final apwt h;
    private final armf i;
    private final armf j;
    private final armf k;
    private final anen l;
    private final anen m;
    private final xnv n;
    private final wpp o;
    public static final xze a = xze.g("BugleAction", "CheckActiveDesktopIsAliveAsyncAction");
    public static final long b = TimeUnit.MINUTES.toMillis(((Integer) trf.f.e()).intValue());
    static final long c = TimeUnit.HOURS.toMillis(((Integer) trf.e.e()).intValue());
    public static final Parcelable.Creator<Action<Void>> CREATOR = new ltv(20);

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public interface a {
        qyw Nc();
    }

    public CheckActiveDesktopIsAliveAsyncAction(qyw qywVar, trn trnVar, apwt apwtVar, armf armfVar, armf armfVar2, armf armfVar3, anen anenVar, anen anenVar2, xnv xnvVar, mbl mblVar, wpp wppVar, armf armfVar4, Parcel parcel) {
        super(parcel, amdy.CHECK_ACTIVE_DESKTOP_IS_ALIVE_ACTION);
        this.g = qywVar;
        this.d = trnVar;
        this.h = apwtVar;
        this.i = armfVar;
        this.j = armfVar2;
        this.k = armfVar3;
        this.l = anenVar;
        this.m = anenVar2;
        this.n = xnvVar;
        this.e = mblVar;
        this.o = wppVar;
        this.f = armfVar4;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final akrh a() {
        return aktp.e("CheckActiveDesktopIsAliveAsyncAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.CheckActiveDesktopIsAlive.ExecuteAction.Latency";
    }

    public final akul d(byte[] bArr, String str, trm trmVar) {
        aqfn aqfnVar;
        String str2;
        long j;
        veq veqVar;
        akul a2;
        try {
            if (((lpg) this.f.b()).z()) {
                aqfnVar = trmVar.e.d;
                str2 = trmVar.b;
            } else {
                aqfnVar = (aqfn) apag.parseFrom(aqfn.a, bArr, aozs.a());
                str2 = str;
            }
        } catch (apba unused) {
        }
        if (!this.d.e(aqfnVar)) {
            return aktp.ag(null);
        }
        trn trnVar = this.d;
        akrh e = aktp.e("DittoDesktops#getMillisSinceLastDesktopConnection");
        try {
            soo a3 = sor.a();
            a3.w("getMillisSinceLastDesktopConnection");
            a3.d(new tkg(aqfnVar, 14));
            a3.c(new tgn(6));
            int i = 1;
            a3.u(1);
            sol solVar = (sol) a3.b().n();
            try {
                long j2 = -1;
                if (solVar.moveToFirst()) {
                    j = trnVar.b.f().toEpochMilli() - solVar.g();
                    solVar.close();
                    e.close();
                } else {
                    solVar.close();
                    e.close();
                    j = -1;
                }
                soo a4 = sor.a();
                a4.w("getDesktopChallengeTime");
                a4.d(new tkg(aqfnVar, 12));
                a4.c(new tgn(7));
                a4.u(1);
                sol solVar2 = (sol) a4.b().n();
                try {
                    if (solVar2.moveToFirst()) {
                        j2 = solVar2.h();
                    }
                    solVar2.close();
                    if (j > c) {
                        if (j2 < 0) {
                            if (((lpg) this.f.b()).z()) {
                                veqVar = this.o.P(trmVar.e);
                                veqVar.b = str2;
                                aozy createBuilder = angd.a.createBuilder();
                                anfo anfoVar = anfo.a;
                                if (!createBuilder.b.isMutable()) {
                                    createBuilder.u();
                                }
                                angd angdVar = (angd) createBuilder.b;
                                anfoVar.getClass();
                                angdVar.c = anfoVar;
                                angdVar.b = 7;
                                veqVar.b(createBuilder.s());
                            } else {
                                veq O = this.o.O(aqfnVar, Optional.empty());
                                O.b = str;
                                aozy createBuilder2 = angd.a.createBuilder();
                                anfo anfoVar2 = anfo.a;
                                if (!createBuilder2.b.isMutable()) {
                                    createBuilder2.u();
                                }
                                angd angdVar2 = (angd) createBuilder2.b;
                                anfoVar2.getClass();
                                angdVar2.c = anfoVar2;
                                angdVar2.b = 7;
                                O.b(createBuilder2.s());
                                veqVar = O;
                            }
                            veqVar.e = aqdq.USER;
                            ver a5 = veqVar.a();
                            ((trh) this.i.b()).d(str2, aqfnVar.c, albo.aE(18), 7, a5.b);
                            if (((lpg) this.f.b()).z()) {
                                a2 = ((vcf) this.k.b()).a(a5);
                            } else {
                                a2 = ((vcc) this.j.b()).a(a5);
                            }
                            a5.l(a2);
                            a2.k(new ydv(new ksn(this, aqfnVar, 15), new qdm(this, 11), 0), this.l);
                            return a2.h(new qyv(i), andi.a);
                        }
                        if (this.n.f().toEpochMilli() - j2 > b) {
                        }
                    }
                    return aktp.ag(null);
                } finally {
                }
            } finally {
            }
        } finally {
        }
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final akul e() {
        aqfn aqfnVar;
        Boolean bool = (Boolean) trg.a.e();
        if (bool.booleanValue()) {
            this.e.e("Bugle.Ditto.Action.Success.Metrics.Counts", 11);
        }
        byte[] A = this.u.A("desktop_id_key");
        if (A != null) {
            try {
                aqfnVar = (aqfn) apag.parseFrom(aqfn.a, A, aozs.a());
            } catch (apba unused) {
                aqfnVar = null;
            }
            if (aqfnVar != null && !this.d.e(aqfnVar)) {
            }
        }
        akul e = this.d.b(new qwz(this, 8)).h(new qlf(this, 17), this.m).e(Throwable.class, new qyv(0), andi.a);
        if (bool.booleanValue()) {
            return e.h(new qlf(this, 16), this.m);
        }
        return e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C(parcel, i);
    }

    public CheckActiveDesktopIsAliveAsyncAction(qyw qywVar, trn trnVar, apwt apwtVar, armf armfVar, armf armfVar2, armf armfVar3, anen anenVar, anen anenVar2, xnv xnvVar, mbl mblVar, wpp wppVar, armf armfVar4) {
        super(amdy.CHECK_ACTIVE_DESKTOP_IS_ALIVE_ACTION);
        this.g = qywVar;
        this.d = trnVar;
        this.h = apwtVar;
        this.i = armfVar;
        this.j = armfVar2;
        this.k = armfVar3;
        this.l = anenVar;
        this.m = anenVar2;
        this.n = xnvVar;
        this.e = mblVar;
        this.o = wppVar;
        this.f = armfVar4;
        if (TextUtils.isEmpty(null)) {
            return;
        }
        this.u.v("request_id_key", null);
    }
}
