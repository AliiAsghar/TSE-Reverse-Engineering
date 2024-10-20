package com.google.android.apps.messaging.shared.datamodel.action;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import defpackage.agnq;
import defpackage.akrh;
import defpackage.aktp;
import defpackage.alvg;
import defpackage.alvi;
import defpackage.alvw;
import defpackage.alwp;
import defpackage.amdy;
import defpackage.amfd;
import defpackage.armf;
import defpackage.lga;
import defpackage.mbl;
import defpackage.mho;
import defpackage.qyy;
import defpackage.qzy;
import defpackage.qzz;
import defpackage.rbk;
import defpackage.rhl;
import defpackage.rvc;
import defpackage.rvx;
import defpackage.rwd;
import defpackage.tqf;
import defpackage.uie;
import defpackage.vqu;
import defpackage.xnv;
import defpackage.xyo;
import defpackage.xze;
import defpackage.ydl;
import defpackage.yxx;
import j$.util.Objects;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class InitiateClientSideFallbackAction extends Action<Boolean> {
    public final armf b;
    public final xnv c;
    public final mho d;
    public final mbl e;
    public final vqu f;
    public final uie g;
    private final yxx i;
    private final agnq j;
    private static final alvi h = alvi.m("com/google/android/apps/messaging/shared/datamodel/action/InitiateClientSideFallbackAction");
    public static final xze a = xze.g("BugleAction", "InitiateClientSideFallbackAction");
    public static final Parcelable.Creator<Action<Boolean>> CREATOR = new qyy(19);

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public interface a {
        qzz Np();
    }

    public InitiateClientSideFallbackAction(armf armfVar, xnv xnvVar, mho mhoVar, mbl mblVar, yxx yxxVar, vqu vquVar, agnq agnqVar, uie uieVar, Parcel parcel) {
        super(parcel, amdy.INITIATE_CLIENT_SIDE_FALLBACK_ACTION);
        this.b = armfVar;
        this.c = xnvVar;
        this.d = mhoVar;
        this.e = mblVar;
        this.i = yxxVar;
        this.f = vquVar;
        this.j = agnqVar;
        this.g = uieVar;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final akrh a() {
        return aktp.e("InitiateClientSideFallbackAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final /* bridge */ /* synthetic */ Object b() {
        tqf tqfVar;
        MessageIdType b = rvc.b(this.u.l("message_id"));
        rhl rhlVar = this.u;
        int a2 = rhlVar.a("sub_id");
        amfd amfdVar = (amfd) Optional.ofNullable(amfd.b(rhlVar.a("latch_change_reason"))).orElse(amfd.UNKNOWN_LATCH_REASON);
        if (Objects.equals(amfdVar, amfd.UNKNOWN_LATCH_REASON)) {
            alvw i = h.i();
            i.X(alwp.a, "BugleAction");
            ((alvg) ((alvg) i).h("com/google/android/apps/messaging/shared/datamodel/action/InitiateClientSideFallbackAction", "getFallbackReason", 268, "InitiateClientSideFallbackAction.java")).q("Unknown latch reason");
            tqfVar = tqf.UNKNOWN;
        } else if (lga.ar(amfdVar)) {
            tqfVar = tqf.CFS_MANUAL_FALLBACK_ON_NOT_DELIVERED;
        } else {
            tqfVar = tqf.CFS_AUTO_FALLBACK_ON_OUTGOING_FAILURE;
        }
        tqf tqfVar2 = tqfVar;
        MessageCoreData q = ((rwd) this.b.b()).q(b);
        if (q == null) {
            xyo e = a.e();
            e.c(b);
            e.H("doesn't exist, cant manually fallback.");
            e.q();
            return Boolean.FALSE;
        }
        if (!q.cI()) {
            alvw i2 = h.i();
            i2.X(alwp.a, "BugleAction");
            alvg alvgVar = (alvg) i2;
            alvgVar.X(ydl.b, b);
            alvgVar.X(ydl.f, q.E());
            ((alvg) alvgVar.h("com/google/android/apps/messaging/shared/datamodel/action/InitiateClientSideFallbackAction", "executeAction", 169, "InitiateClientSideFallbackAction.java")).q("Cannot fallback non-RCS message");
            return Boolean.FALSE;
        }
        if (rvx.l(q.j())) {
            xyo a3 = a.a();
            a3.c(b);
            a3.H("message has been delivered, should not fallback");
            a3.q();
            return Boolean.FALSE;
        }
        if (((Boolean) this.j.c("InitiateClientSideFallbackAction#executeAction", new qzy(this, q, a2, b, tqfVar2, 0))).booleanValue()) {
            rbk.d(7, this);
            this.i.b(q.z(), amfdVar);
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.InitiateClientSideFallback.ExecuteAction.Latency";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C(parcel, i);
    }

    public InitiateClientSideFallbackAction(armf armfVar, xnv xnvVar, mho mhoVar, mbl mblVar, yxx yxxVar, vqu vquVar, agnq agnqVar, uie uieVar, MessageIdType messageIdType, int i, amfd amfdVar) {
        super(amdy.INITIATE_CLIENT_SIDE_FALLBACK_ACTION);
        this.b = armfVar;
        this.c = xnvVar;
        this.d = mhoVar;
        this.e = mblVar;
        this.i = yxxVar;
        this.f = vquVar;
        this.j = agnqVar;
        this.g = uieVar;
        this.u.v("message_id", messageIdType.a());
        this.u.r("sub_id", i);
        this.u.r("latch_change_reason", amfdVar.i);
    }
}
