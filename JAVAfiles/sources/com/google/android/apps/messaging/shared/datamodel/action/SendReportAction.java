package com.google.android.apps.messaging.shared.datamodel.action;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import defpackage.agoh;
import defpackage.akrh;
import defpackage.aktp;
import defpackage.alvg;
import defpackage.alvi;
import defpackage.alvw;
import defpackage.alwp;
import defpackage.amdy;
import defpackage.armf;
import defpackage.atkn;
import defpackage.pdi;
import defpackage.rfw;
import defpackage.rjm;
import defpackage.rsc;
import defpackage.rtk;
import defpackage.ruy;
import defpackage.rvc;
import defpackage.smv;
import defpackage.snf;
import defpackage.sni;
import defpackage.sxy;
import defpackage.vqu;
import defpackage.wen;
import defpackage.wfe;
import defpackage.xyl;
import defpackage.ydl;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class SendReportAction extends Action<Void> implements Parcelable {
    private final vqu e;
    private final rjm f;
    private final wfe g;
    private final armf h;
    private final wen i;
    private static final alvi b = alvi.m("com/google/android/apps/messaging/shared/datamodel/action/SendReportAction");
    static final long[] a = {TimeUnit.SECONDS.toMillis(1), TimeUnit.SECONDS.toMillis(5), TimeUnit.SECONDS.toMillis(10), TimeUnit.SECONDS.toMillis(20), TimeUnit.SECONDS.toMillis(40), TimeUnit.SECONDS.toMillis(80), TimeUnit.SECONDS.toMillis(160), TimeUnit.SECONDS.toMillis(320), TimeUnit.SECONDS.toMillis(640), TimeUnit.SECONDS.toMillis(1280)};
    private static long c = -1;
    private static final Object d = new Object();
    public static final Parcelable.Creator<Action<Void>> CREATOR = new rfw(3);

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public interface a {
        rjm dd();
    }

    public SendReportAction(vqu vquVar, rjm rjmVar, wfe wfeVar, armf armfVar, wen wenVar, Parcel parcel) {
        super(parcel, amdy.SEND_REPORT_ACTION);
        this.e = vquVar;
        this.f = rjmVar;
        this.g = wfeVar;
        this.h = armfVar;
        this.i = wenVar;
    }

    static long h() {
        synchronized (d) {
            long[] jArr = a;
            int length = jArr.length;
            for (int i = 0; i < 10; i++) {
                long j = jArr[i];
                if (j > c) {
                    c = j;
                    return j;
                }
            }
            return c;
        }
    }

    public static void m() {
        synchronized (d) {
            c = -1L;
        }
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final akrh a() {
        return aktp.e("SendReportAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final /* bridge */ /* synthetic */ Object b() {
        v();
        return null;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.SendReport.ExecuteAction.Latency";
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final Bundle fw() {
        int i;
        if (((pdi) this.h.b()).a()) {
            if (this.g.h().isEmpty()) {
                alvw e = b.e();
                e.X(alwp.a, "BugleDataModel");
                ((alvg) ((alvg) e).h("com/google/android/apps/messaging/shared/datamodel/action/SendReportAction", "getPreconditionsResult", 167, "SendReportAction.java")).q("RCS is not enabled on any identity. Cannot send delivery reports.");
                this.f.d().x(101, h());
                i = 3;
            }
            i = 0;
        } else {
            if (!this.e.O()) {
                alvw e2 = b.e();
                e2.X(alwp.a, "BugleDataModel");
                ((alvg) ((alvg) e2).h("com/google/android/apps/messaging/shared/datamodel/action/SendReportAction", "getPreconditionsResult", 179, "SendReportAction.java")).q("RCS is not enabled. Cannot send delivery reports.");
                this.f.d().x(101, h());
                i = 3;
            }
            i = 0;
        }
        Bundle bundle = new Bundle(1);
        bundle.putInt("result", i);
        if (i == 0) {
            int a2 = this.u.a("action_type");
            alvw e3 = b.e();
            e3.X(alwp.a, "BugleDataModel");
            ((alvg) ((alvg) e3).h("com/google/android/apps/messaging/shared/datamodel/action/SendReportAction", "doBackgroundWork", 215, "SendReportAction.java")).r("Running SendReportAction with actionType %d", a2);
            if (a2 != 1) {
                if (a2 != 2) {
                    if (a2 != 3) {
                        if (a2 == 4) {
                            l(this.i.b(), true);
                        } else {
                            throw new IllegalArgumentException(defpackage.a.bV(a2, "Unexpected action type: "));
                        }
                    } else {
                        m();
                        j(this.i.b());
                    }
                } else {
                    ConversationIdType b2 = ruy.b(this.u.l("conversation_id"));
                    xyl.k(!b2.b());
                    wen wenVar = this.i;
                    alvg alvgVar = (alvg) wen.a.d();
                    alvgVar.X(ydl.p, b2);
                    ((alvg) alvgVar.h("com/google/android/apps/messaging/shared/rcs/outgoing/RcsReportSender", "sendReportsForConversation", 118, "RcsReportSender.java")).q("Try to send DELIVERY/DISPLAY reports for conversation.");
                    Set h = wenVar.b.h();
                    smv[] smvVarArr = rtk.a;
                    sxy d2 = MessagesTable.d();
                    d2.w("getAllUnsentMessagesForConversationQuery");
                    d2.k(rtk.b);
                    d2.g(new rsc(b2, 8));
                    rtk.a(h, d2);
                    d2.h(new atkn((Object) MessagesTable.c.i, false));
                    snf e4 = sni.e();
                    e4.c(rtk.a);
                    d2.A(agoh.b(e4.b(), sni.c.a, MessagesTable.c.b).a());
                    j(wenVar.d(d2.b().t()));
                }
            } else {
                MessageIdType b3 = rvc.b(this.u.l("message_id"));
                xyl.k(true ^ b3.b());
                j(this.i.c(b3));
            }
        }
        return bundle;
    }

    public final void j(boolean z) {
        l(z, false);
    }

    public final void l(boolean z, boolean z2) {
        long j;
        if (z) {
            alvw d2 = b.d();
            d2.X(alwp.a, "BugleDataModel");
            ((alvg) ((alvg) d2).h("com/google/android/apps/messaging/shared/datamodel/action/SendReportAction", "handleResult", 258, "SendReportAction.java")).q("DELIVERY/DISPLAY report(s) successfully sent.");
            m();
            return;
        }
        if (!z2) {
            synchronized (d) {
                j = c;
            }
            if (j != -1) {
                return;
            }
        }
        this.f.d().x(101, h());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C(parcel, i);
    }

    public SendReportAction(vqu vquVar, rjm rjmVar, wfe wfeVar, armf armfVar, wen wenVar, MessageIdType messageIdType, ConversationIdType conversationIdType, int i) {
        super(amdy.SEND_REPORT_ACTION);
        this.e = vquVar;
        this.f = rjmVar;
        this.g = wfeVar;
        this.h = armfVar;
        this.i = wenVar;
        if (i == 1) {
            this.u.r("action_type", 1);
            if (messageIdType.b()) {
                return;
            }
            this.u.v("message_id", messageIdType.a());
            return;
        }
        if (i == 2) {
            this.u.r("action_type", 2);
            if (conversationIdType.b()) {
                return;
            }
            this.u.v("conversation_id", conversationIdType.a());
            return;
        }
        if (i == 3) {
            this.u.r("action_type", 3);
        } else {
            if (i != 4) {
                return;
            }
            this.u.r("action_type", 4);
        }
    }
}
