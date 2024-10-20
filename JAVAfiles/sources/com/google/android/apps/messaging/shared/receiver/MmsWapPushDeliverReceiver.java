package com.google.android.apps.messaging.shared.receiver;

import android.content.Context;
import android.content.Intent;
import android.telephony.TelephonyManager;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.action.ReceiveWapPushSiMessageAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.ims.rcsservice.chatsession.message.groupmanagement.GroupManagementRequest;
import defpackage.agnq;
import defpackage.akrc;
import defpackage.aksr;
import defpackage.armf;
import defpackage.lpg;
import defpackage.mho;
import defpackage.qyn;
import defpackage.rdo;
import defpackage.rfl;
import defpackage.rim;
import defpackage.rji;
import defpackage.rtb;
import defpackage.ryg;
import defpackage.rys;
import defpackage.tqx;
import defpackage.wga;
import defpackage.wlo;
import defpackage.wyt;
import defpackage.wzs;
import defpackage.xca;
import defpackage.xcd;
import defpackage.xnv;
import defpackage.xyo;
import defpackage.xze;
import defpackage.yhx;
import defpackage.yjr;
import defpackage.yjy;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class MmsWapPushDeliverReceiver extends wlo {
    private static final xze g = xze.g("Bugle", "MmsWapPushDeliverReceiver");
    public armf a;
    public armf b;
    public armf c;
    public armf d;
    public armf e;
    public armf f;

    @Override // defpackage.wng
    public final akrc a() {
        return ((aksr) this.f.b()).b("MmsWapPushDeliverReceiver Receive broadcast");
    }

    @Override // defpackage.wng
    public final String b() {
        return "Bugle.Broadcast.MmsWapPushDeliver.Latency";
    }

    @Override // defpackage.wng
    protected final int e() {
        return 7;
    }

    @Override // defpackage.wna
    public final String f() {
        return "Bugle.Broadcast.ForegroundService.MmsWapPushDeliver.Latency";
    }

    @Override // defpackage.wna
    public final void g(Context context, Intent intent) {
        int i;
        Action receiveWapPushSiMessageAction;
        TelephonyManager createForSubscriptionId;
        int simCarrierId;
        if ("android.provider.Telephony.WAP_PUSH_DELIVER".equals(intent.getAction()) || "com.google.android.apps.messaging.TestAction".equals(intent.getAction())) {
            if (!((yjr) this.b.b()).B()) {
                g.o("Ignoring 'mms received' because SMS is not enabled");
                return;
            }
            String type = intent.getType();
            if (!"application/vnd.wap.mms-message".equals(type) && !"application/vnd.wap.sic".equals(type)) {
                return;
            }
            int a = ((yjy) this.c.b()).h(intent.getIntExtra("subscription", -1)).a();
            int max = Math.max(((Integer) Optional.ofNullable(((yjy) this.c.b()).h(a).x()).map(new wga(18)).orElse(0)).intValue(), 0);
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (telephonyManager != null && yhx.b) {
                createForSubscriptionId = telephonyManager.createForSubscriptionId(a);
                simCarrierId = createForSubscriptionId.getSimCarrierId();
                i = Math.max(simCarrierId, 0);
            } else {
                i = 0;
            }
            byte[] byteArrayExtra = intent.getByteArrayExtra(GroupManagementRequest.DATA_TAG);
            if (byteArrayExtra == null) {
                g.m("Received wap push has empty data");
                return;
            }
            long longExtra = intent.getLongExtra("messageId", 0L);
            if ("application/vnd.wap.mms-message".equals(type)) {
                xze xzeVar = g;
                xyo c = xzeVar.c();
                c.H("Received MMS WAP Push");
                c.v(longExtra);
                c.q();
                xzeVar.k("MMS receiving START");
                receiveWapPushSiMessageAction = ((rdo) this.d.b()).a(a, byteArrayExtra, longExtra, max, i);
            } else {
                if (!((xcd) this.a.b()).c(a)) {
                    g.l("WAP Push SI message ignored because the feature disabled");
                    return;
                }
                xyo c2 = g.c();
                c2.H("Received WAP Push SI");
                c2.v(longExtra);
                c2.q();
                rfl rflVar = (rfl) this.e.b();
                Context context2 = (Context) rflVar.f.b();
                context2.getClass();
                xnv xnvVar = (xnv) rflVar.o.b();
                xnvVar.getClass();
                wyt wytVar = (wyt) rflVar.p.b();
                wytVar.getClass();
                ((xca) rflVar.z.b()).getClass();
                mho mhoVar = (mho) rflVar.r.b();
                mhoVar.getClass();
                wzs wzsVar = (wzs) rflVar.s.b();
                wzsVar.getClass();
                ryg rygVar = (ryg) rflVar.A.b();
                rygVar.getClass();
                qyn qynVar = (qyn) rflVar.m.b();
                qynVar.getClass();
                rim rimVar = (rim) rflVar.e.b();
                rimVar.getClass();
                rys rysVar = (rys) rflVar.a.b();
                rysVar.getClass();
                rji rjiVar = (rji) rflVar.l.b();
                rjiVar.getClass();
                tqx tqxVar = (tqx) rflVar.c.b();
                tqxVar.getClass();
                rtb rtbVar = (rtb) rflVar.k.b();
                rtbVar.getClass();
                agnq agnqVar = (agnq) rflVar.j.b();
                agnqVar.getClass();
                lpg lpgVar = (lpg) rflVar.h.b();
                lpgVar.getClass();
                armf armfVar = rflVar.b;
                armf armfVar2 = rflVar.g;
                armf armfVar3 = rflVar.d;
                armf armfVar4 = rflVar.q;
                armf armfVar5 = rflVar.u;
                armf armfVar6 = rflVar.y;
                armf armfVar7 = rflVar.i;
                armf armfVar8 = rflVar.v;
                armf armfVar9 = rflVar.w;
                receiveWapPushSiMessageAction = new ReceiveWapPushSiMessageAction(context2, rflVar.t, xnvVar, wytVar, mhoVar, wzsVar, rflVar.n, rflVar.x, armfVar9, armfVar8, rygVar, qynVar, rimVar, rysVar, rjiVar, tqxVar, rtbVar, agnqVar, armfVar7, lpgVar, armfVar6, armfVar5, armfVar4, armfVar3, armfVar2, armfVar, a, byteArrayExtra, longExtra);
            }
            receiveWapPushSiMessageAction.r(this);
        }
    }

    @Override // defpackage.wna
    public final boolean i(Intent intent) {
        return true;
    }

    @Override // defpackage.wna
    public final String k(Context context, Intent intent) {
        return context.getString(R.string.incoming_message_foreground_notification_text);
    }
}
