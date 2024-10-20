package com.google.android.apps.messaging.shared.datamodel.action;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import defpackage.akrh;
import defpackage.aktp;
import defpackage.akul;
import defpackage.amdy;
import defpackage.andi;
import defpackage.anen;
import defpackage.anhe;
import defpackage.aozs;
import defpackage.apag;
import defpackage.apba;
import defpackage.aqdu;
import defpackage.aqex;
import defpackage.aqfn;
import defpackage.armf;
import defpackage.mbl;
import defpackage.qcf;
import defpackage.qyv;
import defpackage.rau;
import defpackage.ray;
import defpackage.rbp;
import defpackage.rjg;
import defpackage.trg;
import defpackage.trn;
import defpackage.vcc;
import defpackage.vco;
import defpackage.vfe;
import defpackage.wpp;
import defpackage.xze;
import defpackage.ykw;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ProcessUserAlertAsyncAction extends Action<aqdu> {
    public final armf b;
    public final trn c;
    public final mbl d;
    public final armf e;
    public final wpp f;
    private final armf g;
    private final anen h;
    private final anen i;
    private final vco j;
    public static final xze a = xze.g("BugleNetwork", "ProcessUserAlertAsyncAction");
    public static final Parcelable.Creator<ProcessUserAlertAsyncAction> CREATOR = new ray(20);

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public interface a {
        rjg cY();
    }

    public ProcessUserAlertAsyncAction(armf armfVar, armf armfVar2, trn trnVar, mbl mblVar, anen anenVar, anen anenVar2, vco vcoVar, wpp wppVar, armf armfVar3, int i, aqfn aqfnVar, String str) {
        super(amdy.PROCESS_USER_ALERT_ACTION);
        this.g = armfVar;
        this.b = armfVar2;
        this.c = trnVar;
        this.d = mblVar;
        this.i = anenVar;
        this.h = anenVar2;
        this.j = vcoVar;
        this.f = wppVar;
        this.e = armfVar3;
        this.u.r("alert_type_key", i);
        this.u.q("desktop_id_key", aqfnVar.toByteArray());
        this.u.v("request_id_key", str);
        this.u.p("skip_revoke_key", false);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final akrh a() {
        return aktp.e("ProcessUserAlertAsyncAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final /* bridge */ /* synthetic */ Object b() {
        v();
        return null;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.ProcessUserAlert.ExecuteAction.Latency";
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final akul e() {
        v();
        return aktp.ag(null);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final Bundle fw() {
        akul h;
        Boolean bool = (Boolean) trg.a.e();
        if (bool.booleanValue()) {
            this.d.e("Bugle.Ditto.Action.Success.Metrics.Counts", 19);
        }
        akrh e = aktp.e("ProcessUserAlertAsyncAction.executeAction");
        try {
            anhe b = anhe.b(this.u.a("alert_type_key"));
            if (b != anhe.BROWSER_ACTIVE && b != anhe.BROWSER_INACTIVE && b != anhe.BROWSER_INACTIVE_FROM_INACTIVITY && b != anhe.BROWSER_INACTIVE_FROM_TIMEOUT) {
                h = this.c.b(new rbp(this, b, 4)).h(new qyv(12), andi.a);
            } else {
                byte[] A = this.u.A("desktop_id_key");
                String l = this.u.l("request_id_key");
                if (A != null && l != null) {
                    try {
                        h = h((aqfn) apag.parseFrom(aqfn.a, A, aozs.a()), l, b, Optional.empty()).h(new qyv(10), andi.a);
                    } catch (apba e2) {
                        a.n("Desktop ID invalid.", e2);
                        aktp.ag(null);
                    }
                } else {
                    a.m("Desktop ID or request ID null, skipping UserAlert.");
                    aktp.ag(null);
                }
                e.close();
                return null;
            }
            akul e3 = h.e(Throwable.class, new qyv(11), andi.a);
            if (bool.booleanValue()) {
                e3.h(new rau(this, 8), this.i);
            }
            e.close();
            return null;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [armf, java.lang.Object] */
    public final akul h(aqfn aqfnVar, String str, anhe anheVar, Optional optional) {
        akul ag;
        int a2 = this.u.a("alert_type_key");
        if (a2 != 1 && a2 != 7) {
            ag = aktp.ag(aqex.a);
        } else if (this.u.y("skip_revoke_key")) {
            ag = aktp.ag(aqex.a);
        } else {
            xze xzeVar = a;
            xzeVar.p("Revoking messages by this sender.");
            vco vcoVar = this.j;
            vcc vccVar = (vcc) vcoVar.b.b();
            vccVar.getClass();
            ((ykw) vcoVar.a.b()).getClass();
            aqfnVar.getClass();
            vfe vfeVar = new vfe(vccVar, aqfnVar);
            if (vfeVar.a > 0) {
                xzeVar.p("Revoking starts.");
                ag = ((vcc) this.g.b()).a(vfeVar);
            } else {
                ag = aktp.ag(aqex.a);
            }
        }
        return ag.i(new qcf(this, anheVar, optional, aqfnVar, str, 3), this.h);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C(parcel, i);
    }

    public ProcessUserAlertAsyncAction(armf armfVar, armf armfVar2, trn trnVar, mbl mblVar, anen anenVar, anen anenVar2, vco vcoVar, wpp wppVar, armf armfVar3, Parcel parcel) {
        super(parcel, amdy.PROCESS_USER_ALERT_ACTION);
        this.g = armfVar;
        this.b = armfVar2;
        this.c = trnVar;
        this.d = mblVar;
        this.i = anenVar;
        this.h = anenVar2;
        this.j = vcoVar;
        this.f = wppVar;
        this.e = armfVar3;
    }
}
