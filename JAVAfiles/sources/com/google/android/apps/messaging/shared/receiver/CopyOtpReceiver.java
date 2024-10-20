package com.google.android.apps.messaging.shared.receiver;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import defpackage.akrc;
import defpackage.aksr;
import defpackage.alwl;
import defpackage.alwo;
import defpackage.amfh;
import defpackage.amfp;
import defpackage.amfq;
import defpackage.amfr;
import defpackage.amrs;
import defpackage.aozy;
import defpackage.aqax;
import defpackage.armf;
import defpackage.lzz;
import defpackage.maq;
import defpackage.rix;
import defpackage.ruy;
import defpackage.rvc;
import defpackage.wlk;
import defpackage.xwj;
import defpackage.ydl;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class CopyOtpReceiver extends wlk {
    private static final alwo f = alwo.o("Bugle");
    public armf a;
    public armf b;
    public armf c;
    public armf d;
    public armf e;

    @Override // defpackage.wng
    public final akrc a() {
        return ((aksr) this.c.b()).b("CopyOtpReceiver Receive broadcast");
    }

    @Override // defpackage.wng
    public final String b() {
        return "Bugle.Broadcast.CopyOtp.Latency";
    }

    @Override // defpackage.wng
    public final void c(Context context, Intent intent) {
        String stringExtra = intent.getStringExtra("otp_code");
        ConversationIdType b = ruy.b(intent.getStringExtra("conversation_id"));
        MessageIdType b2 = rvc.b(intent.getStringExtra("message_id"));
        if (!b.b()) {
            alwl alwlVar = (alwl) f.g();
            alwlVar.X(ydl.o, b.toString());
            ((alwl) alwlVar.h("com/google/android/apps/messaging/shared/receiver/CopyOtpReceiver", "processBroadcast", 77, "CopyOtpReceiver.java")).q("Starting CopyOtpReceiver");
            ((rix) this.b.b()).h(b, b2, false).r(this);
        }
        amfq amfqVar = (amfq) amfr.a.createBuilder();
        amfp amfpVar = amfp.BUGLE_CONVERSATION;
        if (!amfqVar.b.isMutable()) {
            amfqVar.u();
        }
        amfr amfrVar = (amfr) amfqVar.b;
        amfrVar.i = amfpVar.dg;
        amfrVar.b |= 1;
        if (!b.b()) {
            aozy createBuilder = amfh.a.createBuilder();
            long a = ((lzz) this.e.b()).a(b);
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            amfh amfhVar = (amfh) createBuilder.b;
            amfhVar.b |= 65536;
            amfhVar.r = a;
            if (!amfqVar.b.isMutable()) {
                amfqVar.u();
            }
            amfr amfrVar2 = (amfr) amfqVar.b;
            amfh amfhVar2 = (amfh) createBuilder.s();
            amfhVar2.getClass();
            amfrVar2.l = amfhVar2;
            amfrVar2.b |= 8;
        }
        ((maq) this.d.b()).k(amfqVar, amrs.ACTIVE_USER_ENTER_CONVERSATION_WITH_UNREAD_MESSAGE);
        q("copy-otp", ((xwj) this.a.b()).a(stringExtra, b2, aqax.NOTIFICATION_VIEW));
    }

    @Override // defpackage.wng
    protected final int e() {
        return 18;
    }
}
