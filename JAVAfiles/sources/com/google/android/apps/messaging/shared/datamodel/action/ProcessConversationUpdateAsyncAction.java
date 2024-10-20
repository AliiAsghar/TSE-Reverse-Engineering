package com.google.android.apps.messaging.shared.datamodel.action;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import defpackage.ahmv;
import defpackage.akrh;
import defpackage.aktp;
import defpackage.akul;
import defpackage.amdy;
import defpackage.andi;
import defpackage.anen;
import defpackage.aqdu;
import defpackage.aqfn;
import defpackage.armf;
import defpackage.ikm;
import defpackage.mbl;
import defpackage.psw;
import defpackage.qyv;
import defpackage.rau;
import defpackage.ray;
import defpackage.rjd;
import defpackage.trg;
import defpackage.trn;
import defpackage.wpp;
import defpackage.wyp;
import defpackage.xze;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ProcessConversationUpdateAsyncAction extends Action<aqdu> {
    public final trn b;
    public final mbl c;
    public final anen d;
    public final anen e;
    public final armf f;
    public final armf g;
    public final armf h;
    public final armf i;
    public final armf j;
    public final psw k;
    public final armf l;
    public final wyp m;
    public final wpp n;
    public final ahmv o;
    private final anen p;
    public static final xze a = xze.g("BugleNetwork", "ProcessConversationUpdateAsyncAction");
    public static final Parcelable.Creator<Action<aqdu>> CREATOR = new ray(7);

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public interface a {
        rjd cW();
    }

    public ProcessConversationUpdateAsyncAction(trn trnVar, mbl mblVar, anen anenVar, anen anenVar2, anen anenVar3, armf armfVar, armf armfVar2, armf armfVar3, wpp wppVar, wyp wypVar, armf armfVar4, ahmv ahmvVar, armf armfVar5, psw pswVar, Parcel parcel, armf armfVar6) {
        super(parcel, amdy.PROCESS_CONVERSATION_UPDATE_ACTION);
        this.b = trnVar;
        this.c = mblVar;
        this.d = anenVar;
        this.e = anenVar2;
        this.p = anenVar3;
        this.f = armfVar;
        this.g = armfVar2;
        this.h = armfVar3;
        this.n = wppVar;
        this.m = wypVar;
        this.i = armfVar4;
        this.o = ahmvVar;
        this.j = armfVar5;
        this.k = pswVar;
        this.l = armfVar6;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final akrh a() {
        return aktp.e("ProcessConversationUpdateAsyncAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.ProcessConversationUpdate.ExecuteAction.Latency";
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final akul e() {
        Boolean bool = (Boolean) trg.a.e();
        if (bool.booleanValue()) {
            this.c.e("Bugle.Ditto.Action.Success.Metrics.Counts", 15);
        }
        akul e = aktp.aj(new ikm(this, 16), this.p).e(Throwable.class, new qyv(6), andi.a);
        if (bool.booleanValue()) {
            e.h(new rau(this, 3), this.d);
        }
        return aktp.ag(null);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C(parcel, i);
    }

    public ProcessConversationUpdateAsyncAction(trn trnVar, mbl mblVar, anen anenVar, anen anenVar2, anen anenVar3, armf armfVar, armf armfVar2, armf armfVar3, wpp wppVar, wyp wypVar, armf armfVar4, ahmv ahmvVar, armf armfVar5, psw pswVar, armf armfVar6, aqfn aqfnVar, String str, long j) {
        super(amdy.PROCESS_CONVERSATION_UPDATE_ACTION);
        this.b = trnVar;
        this.c = mblVar;
        this.d = anenVar;
        this.e = anenVar2;
        this.p = anenVar3;
        this.f = armfVar;
        this.g = armfVar2;
        this.h = armfVar3;
        this.n = wppVar;
        this.m = wypVar;
        this.o = ahmvVar;
        this.j = armfVar5;
        this.l = armfVar6;
        this.u.q("desktop_id_key", aqfnVar.toByteArray());
        this.u.v("request_id_key", str);
        this.i = armfVar4;
        this.u.s("conversation_timestamp_key", j);
        this.k = pswVar;
    }
}
