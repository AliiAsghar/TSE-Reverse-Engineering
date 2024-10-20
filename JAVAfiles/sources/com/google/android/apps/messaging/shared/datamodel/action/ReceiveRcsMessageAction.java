package com.google.android.apps.messaging.shared.datamodel.action;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.ims.rcsservice.group.GroupInfo;
import com.google.android.ims.rcsservice.locationsharing.LocationInformation;
import com.google.android.ims.util.common.RcsIntents;
import defpackage.aczf;
import defpackage.akrh;
import defpackage.aktp;
import defpackage.akul;
import defpackage.amdy;
import defpackage.aozs;
import defpackage.apag;
import defpackage.apba;
import defpackage.apdj;
import defpackage.apwq;
import defpackage.armf;
import defpackage.psq;
import defpackage.qei;
import defpackage.rdk;
import defpackage.ref;
import defpackage.rhl;
import defpackage.rve;
import defpackage.vqx;
import defpackage.vqy;
import defpackage.vxx;
import defpackage.vyv;
import defpackage.xnv;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ReceiveRcsMessageAction extends Action<MessageCoreData> implements Parcelable {
    public static final Parcelable.Creator<Action<MessageCoreData>> CREATOR = new rdk(6);
    private final xnv a;
    private final armf b;
    private final vyv c;

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public interface a {
        ref NM();
    }

    public ReceiveRcsMessageAction(xnv xnvVar, vyv vyvVar, armf armfVar, Bundle bundle) {
        super(bundle, amdy.RECEIVE_RCS_MESSAGE_ACTION);
        this.a = xnvVar;
        this.c = vyvVar;
        this.b = armfVar;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final akrh a() {
        return aktp.e("ReceiveRcsMessageAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.ReceiveRcsMessage.ExecuteAction.Latency";
    }

    /* JADX WARN: Type inference failed for: r6v7, types: [armf, java.lang.Object] */
    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final akul e() {
        boolean z;
        qei qeiVar;
        LocationInformation locationInformation;
        apwq apwqVar;
        long epochMilli = this.a.f().toEpochMilli();
        rhl rhlVar = this.u;
        rve b = rve.b(rhlVar.f(), RcsIntents.EXTRA_MESSAGE_ID);
        String l = rhlVar.l(RcsIntents.EXTRA_USER_ID);
        apdj apdjVar = (apdj) rhlVar.h("chat.remoteChatEndpoint");
        String l2 = rhlVar.l(RcsIntents.EXTRA_TEXT);
        String l3 = rhlVar.l(RcsIntents.EXTRA_REMOTE_INSTANCE);
        boolean z2 = rhlVar.z(RcsIntents.EXTRA_IS_CONFERENCE, false);
        long e = rhlVar.e("rcs.intent.extra.received_timestamp", epochMilli);
        long e2 = rhlVar.e(RcsIntents.EXTRA_TIMESTAMP, e);
        String l4 = rhlVar.l("rcs.intent.extra.contentType");
        LocationInformation locationInformation2 = (LocationInformation) rhlVar.h(RcsIntents.EXTRA_LOCATION);
        String l5 = rhlVar.l(RcsIntents.EXTRA_SIP_ALIAS);
        GroupInfo groupInfo = (GroupInfo) rhlVar.h(RcsIntents.EXTRA_GROUP_INFO);
        int b2 = rhlVar.b(RcsIntents.EXTRA_SPAM_VERDICT, 0);
        boolean y = rhlVar.y(RcsIntents.EXTRA_IS_BOT);
        if (apdjVar == null) {
            qeiVar = ((psq) this.c.a.b()).a(l, z2);
            z = y;
        } else {
            z = y;
            qeiVar = (qei) apdjVar.a(qei.a, aozs.a());
        }
        qei qeiVar2 = qei.a;
        apdj apdjVar2 = (apdj) rhlVar.h("chat.selfChatEndpoint");
        apdjVar2.getClass();
        qei qeiVar3 = (qei) apdjVar2.a(qei.a, aozs.a());
        try {
            byte[] A = rhlVar.A(RcsIntents.EXTRA_CUSTOM_HEADERS);
            if (A != null) {
                locationInformation = locationInformation2;
                apwqVar = (apwq) apag.parseFrom(apwq.a, A, aozs.a());
            } else {
                locationInformation = locationInformation2;
                apwqVar = null;
            }
            long e3 = rhlVar.e(RcsIntents.EXTRA_ASSOCIATED_SESSION_ID, -1L);
            int a2 = rhlVar.a("rcs.intent.extra.message_status");
            vqx a3 = vqy.a();
            a3.h(b);
            a3.l(l);
            a3.k(qeiVar);
            a3.m(qeiVar3);
            a3.b = l3;
            a3.e(z2);
            a3.n(e2);
            a3.j(e);
            a3.e = l4;
            a3.a = l2;
            a3.i(e3);
            a3.i = locationInformation;
            a3.f = l5;
            a3.g = groupInfo;
            a3.o(b2);
            a3.f(z);
            a3.h = apwqVar;
            a3.g(a2);
            Bundle C = rhlVar.C();
            if (C != null) {
                a3.b(C);
            }
            String string = rhlVar.f().getString("rcs.conversation.id");
            String string2 = rhlVar.f().getString("rcs.conference.uri");
            a3.c = string;
            a3.d = string2;
            if (aczf.E()) {
                a3.c(rhlVar.f().getBoolean("rcs.delivery.report.requested"));
                a3.d(rhlVar.f().getBoolean("rcs.read.report.requested"));
            } else {
                a3.c(false);
                a3.d(false);
            }
            return ((vxx) this.b.b()).d(a3.a());
        } catch (apba e4) {
            throw new IllegalArgumentException("Could not parse CustomCpimHeaders", e4);
        }
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final boolean fA() {
        return false;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C(parcel, i);
    }

    public ReceiveRcsMessageAction(xnv xnvVar, vyv vyvVar, armf armfVar, Parcel parcel) {
        super(parcel, amdy.RECEIVE_RCS_MESSAGE_ACTION);
        this.a = xnvVar;
        this.c = vyvVar;
        this.b = armfVar;
    }
}
