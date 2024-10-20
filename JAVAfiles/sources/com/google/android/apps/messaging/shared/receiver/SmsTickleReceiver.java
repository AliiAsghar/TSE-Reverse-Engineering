package com.google.android.apps.messaging.shared.receiver;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.provider.Telephony;
import android.telephony.SmsMessage;
import defpackage.a;
import defpackage.akrc;
import defpackage.aksr;
import defpackage.alvg;
import defpackage.alvi;
import defpackage.alvw;
import defpackage.alwp;
import defpackage.aozs;
import defpackage.apag;
import defpackage.apba;
import defpackage.aqht;
import defpackage.armf;
import defpackage.nxf;
import defpackage.uuf;
import defpackage.uuh;
import defpackage.uvd;
import defpackage.wlx;
import defpackage.yjv;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class SmsTickleReceiver extends wlx {
    public armf b;
    public armf c;
    public armf d;
    public armf e;
    private static final alvi f = alvi.m("com/google/android/apps/messaging/shared/receiver/SmsTickleReceiver");
    public static final uuf a = uuh.e(uuh.b, "sms_tickle_receiver_port", 8901);

    @Override // defpackage.wng
    public final akrc a() {
        return ((aksr) this.c.b()).b("SmsTickleReceiver Receive broadcast");
    }

    @Override // defpackage.wng
    public final String b() {
        return "Bugle.Broadcast.SmsTickleReceiver.Latency";
    }

    @Override // defpackage.wng
    protected final int e() {
        return 19;
    }

    @Override // defpackage.wna
    public final String f() {
        return "Bugle.Broadcast.ForegroundService.SmsTickleReceiver.Latency";
    }

    @Override // defpackage.wna
    public final void g(Context context, Intent intent) {
        int length;
        SmsMessage smsMessage;
        int aa;
        alvi alviVar = f;
        alvw g = alviVar.g();
        g.X(alwp.a, "BugleSatellite");
        ((alvg) ((alvg) g).h("com/google/android/apps/messaging/shared/receiver/SmsTickleReceiver", "doInBackground", 99, "SmsTickleReceiver.java")).t("processBroadcast %s", intent);
        int intValue = ((Integer) a.e()).intValue();
        alvw d = alviVar.d();
        d.X(alwp.a, "BugleSatellite");
        ((alvg) ((alvg) d).h("com/google/android/apps/messaging/shared/receiver/SmsTickleReceiver", "getSmsPort", 108, "SmsTickleReceiver.java")).r("getSmsPort from flag: %d", intValue);
        Uri data = intent.getData();
        if (data == null) {
            alvw i = alviVar.i();
            i.X(alwp.a, "BugleSatellite");
            ((alvg) ((alvg) i).h("com/google/android/apps/messaging/shared/receiver/SmsTickleReceiver", "processSmsIntent", 115, "SmsTickleReceiver.java")).q("processSmsIntent, uri is null, ignoring");
            return;
        }
        int port = data.getPort();
        if (intValue != port) {
            alvw i2 = alviVar.i();
            i2.X(alwp.a, "BugleSatellite");
            ((alvg) ((alvg) i2).h("com/google/android/apps/messaging/shared/receiver/SmsTickleReceiver", "processSmsIntent", 120, "SmsTickleReceiver.java")).u("processSmsIntent, port not matching, ignoring. expectedPort: %d actual port: %d", intValue, port);
            return;
        }
        SmsMessage[] messagesFromIntent = Telephony.Sms.Intents.getMessagesFromIntent(intent);
        if (messagesFromIntent != null && (length = messagesFromIntent.length) > 0 && (smsMessage = messagesFromIntent[0]) != null) {
            byte[] userData = smsMessage.getUserData();
            alvw d2 = alviVar.d();
            d2.X(alwp.a, "BugleSatellite");
            ((alvg) ((alvg) d2).h("com/google/android/apps/messaging/shared/receiver/SmsTickleReceiver", "processSmsIntent", 134, "SmsTickleReceiver.java")).r("Received Message Count: %d", length);
            try {
                aqht aqhtVar = (aqht) apag.parseFrom(aqht.a, userData, aozs.a());
                if (aqhtVar != null && ((aa = a.aa(aqhtVar.d)) == 0 || aa != 3)) {
                    alvw i3 = alviVar.i();
                    i3.X(alwp.a, "BugleSatellite");
                    ((alvg) ((alvg) i3).h("com/google/android/apps/messaging/shared/receiver/SmsTickleReceiver", "processSmsIntent", 145, "SmsTickleReceiver.java")).r("processSmsIntent, skipping because of unexpected tickle type: %d", aqhtVar.d);
                    return;
                }
                ((uvd) this.e.b()).a(aqhtVar);
                return;
            } catch (apba e) {
                alvw h = f.h();
                h.X(alwp.a, "BugleSatellite");
                ((alvg) ((alvg) ((alvg) h).g(e)).h("com/google/android/apps/messaging/shared/receiver/SmsTickleReceiver", "processSmsIntent", (char) 140, "SmsTickleReceiver.java")).q("processSmsIntent: couldn't parse payload into an SmsTickle, skipping");
                return;
            }
        }
        alvw h2 = alviVar.h();
        h2.X(alwp.a, "BugleSatellite");
        ((alvg) ((alvg) h2).h("com/google/android/apps/messaging/shared/receiver/SmsTickleReceiver", "processSmsIntent", 129, "SmsTickleReceiver.java")).q("Received SMS data intent could not be parsed");
    }

    @Override // defpackage.wna
    public final boolean h(Context context, Intent intent) {
        if (!((nxf) this.b.b()).a()) {
            alvw i = f.i();
            i.X(alwp.a, "BugleSatellite");
            ((alvg) ((alvg) i).h("com/google/android/apps/messaging/shared/receiver/SmsTickleReceiver", "onPreExecute", 85, "SmsTickleReceiver.java")).q("SmsTickle not enabled");
            return false;
        }
        alvi alviVar = f;
        alvw g = alviVar.g();
        g.X(alwp.a, "BugleSatellite");
        ((alvg) ((alvg) g).h("com/google/android/apps/messaging/shared/receiver/SmsTickleReceiver", "onPreExecute", 88, "SmsTickleReceiver.java")).q("SmsTickle feature enabled");
        if (!((yjv) this.d.b()).d()) {
            alvw i2 = alviVar.i();
            i2.X(alwp.a, "BugleSatellite");
            ((alvg) ((alvg) i2).h("com/google/android/apps/messaging/shared/receiver/SmsTickleReceiver", "onPreExecute", 91, "SmsTickleReceiver.java")).q("SmsTickle not default sms app");
            return false;
        }
        return true;
    }

    @Override // defpackage.wna
    public final boolean i(Intent intent) {
        return true;
    }
}
