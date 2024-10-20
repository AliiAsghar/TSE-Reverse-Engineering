package com.google.android.apps.messaging.shared.datamodel.action;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import defpackage.akrh;
import defpackage.aktp;
import defpackage.alwl;
import defpackage.alwo;
import defpackage.amdy;
import defpackage.armf;
import defpackage.lrf;
import defpackage.qoq;
import defpackage.qrl;
import defpackage.rbk;
import defpackage.rbs;
import defpackage.rcz;
import defpackage.rdk;
import defpackage.riz;
import defpackage.rji;
import defpackage.rjk;
import defpackage.rtz;
import defpackage.rvc;
import defpackage.rwd;
import defpackage.smr;
import defpackage.sya;
import defpackage.uvl;
import defpackage.vjs;
import defpackage.wpp;
import defpackage.xnv;
import defpackage.xyo;
import defpackage.xze;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class RedownloadMessageAction extends Action<Void> implements Parcelable {
    private final Context c;
    private final armf d;
    private final xnv e;
    private final qoq f;
    private final rjk g;
    private final rcz h;
    private final armf i;
    private final armf j;
    private final armf k;
    private final armf l;
    private static final xze a = xze.g("BugleDataModel", "RedownloadMessageAction");
    private static final alwo b = alwo.o("BugleNotifications");
    public static final Parcelable.Creator<Action<Void>> CREATOR = new rdk(10);

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public interface a {
        riz cS();
    }

    public RedownloadMessageAction(Context context, armf armfVar, xnv xnvVar, qoq qoqVar, rjk rjkVar, rcz rczVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, Parcel parcel) {
        super(parcel, amdy.REDOWNLOAD_MESSAGE_ACTION);
        this.c = context;
        this.d = armfVar;
        this.e = xnvVar;
        this.f = qoqVar;
        this.g = rjkVar;
        this.h = rczVar;
        this.i = armfVar2;
        this.j = armfVar3;
        this.k = armfVar4;
        this.l = armfVar5;
    }

    private final void h(MessageCoreData messageCoreData, int i) {
        long epochMilli = this.e.f().toEpochMilli();
        rwd rwdVar = (rwd) this.d.b();
        ConversationIdType z = messageCoreData.z();
        MessageIdType B = messageCoreData.B();
        sya syaVar = new sya();
        syaVar.aj("RedownloadMessageAction#updateMessageStatus");
        syaVar.L(i);
        syaVar.B(epochMilli);
        rwdVar.J(z, B, syaVar);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final akrh a() {
        return aktp.e("RedownloadMessageAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final /* bridge */ /* synthetic */ Object b() {
        String S;
        MessageCoreData q = ((rwd) this.d.b()).q(rvc.b(this.u.l("message_id")));
        if (this.u.y("open_conv") && q != null && !q.z().b()) {
            boolean z = false;
            if (qrl.a()) {
                z = ((Boolean) q.aa().map(new rbs(11)).orElse(false)).booleanValue();
            }
            boolean z2 = z;
            qoq qoqVar = this.f;
            Context context = this.c;
            ConversationIdType z3 = q.z();
            smr q2 = ((rtz) this.l.b()).q(z3);
            lrf lrfVar = (lrf) this.k.b();
            if (q2 == null) {
                S = null;
            } else {
                S = q2.S();
            }
            this.c.startActivity(qoqVar.w(context, lrfVar.l(z3, S, z2), null, false, z2));
        }
        if (q != null && ((q.bW() && q.d() != 1) || q.ci())) {
            if (q.cI()) {
                h(q, 103);
                Action r = uvl.r(this.g, q);
                if (r != null) {
                    r.B(this);
                }
            } else {
                h(q, 102);
                rcz.b(this.h.j.a(q, null), true);
                rbk.d(6, this);
            }
        } else if (q == null) {
            a.m("The message to be downloaded is null.");
        } else {
            xyo b2 = a.b();
            b2.H("Attempt to re-download an un-redownloadable message:");
            b2.z("status", q.ay());
            b2.z("protocol", q.ar());
            b2.q();
            q = null;
        }
        if (this.u.y("should_cancel_notification") && q != null) {
            ((alwl) ((alwl) b.g()).h("com/google/android/apps/messaging/shared/datamodel/action/RedownloadMessageAction", "executeAction", 258, "RedownloadMessageAction.java")).q("Canceling incoming message notification from redwonload message action");
            ((wpp) this.i.b()).H(q.z());
        } else {
            ((alwl) ((alwl) b.g()).h("com/google/android/apps/messaging/shared/datamodel/action/RedownloadMessageAction", "executeAction", 262, "RedownloadMessageAction.java")).q("Creating notification from RedownloadMessageAction");
            ((wpp) this.i.b()).K();
        }
        ((vjs) this.j.b()).f();
        return null;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.RedownloadMms.ExecuteAction.Latency";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C(parcel, i);
    }

    public RedownloadMessageAction(Context context, armf<rwd> armfVar, xnv xnvVar, qoq qoqVar, rjk rjkVar, rji rjiVar, rcz rczVar, armf<wpp> armfVar2, armf<vjs> armfVar3, armf<lrf> armfVar4, armf<rtz> armfVar5, MessageIdType messageIdType, boolean z) {
        super(amdy.REDOWNLOAD_MESSAGE_ACTION);
        this.c = context;
        this.d = armfVar;
        this.e = xnvVar;
        this.f = qoqVar;
        this.g = rjkVar;
        this.h = rczVar;
        this.i = armfVar2;
        this.j = armfVar3;
        this.k = armfVar4;
        this.l = armfVar5;
        this.u.v("message_id", messageIdType.a());
        this.u.p("open_conv", z);
        this.u.p("should_cancel_notification", false);
    }

    public RedownloadMessageAction(Context context, armf<rwd> armfVar, xnv xnvVar, qoq qoqVar, rjk rjkVar, rji rjiVar, rcz rczVar, armf<wpp> armfVar2, armf<vjs> armfVar3, armf<lrf> armfVar4, armf<rtz> armfVar5, MessageIdType messageIdType, boolean z, boolean z2) {
        super(amdy.REDOWNLOAD_MESSAGE_ACTION);
        this.c = context;
        this.d = armfVar;
        this.e = xnvVar;
        this.f = qoqVar;
        this.g = rjkVar;
        this.h = rczVar;
        this.i = armfVar2;
        this.j = armfVar3;
        this.k = armfVar4;
        this.l = armfVar5;
        this.u.v("message_id", messageIdType.a());
        this.u.p("open_conv", z);
        this.u.p("should_cancel_notification", z2);
    }
}
