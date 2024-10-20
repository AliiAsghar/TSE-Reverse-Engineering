package com.google.android.apps.messaging.shared.receiver;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.messaging.R;
import defpackage.akrc;
import defpackage.akrh;
import defpackage.aksr;
import defpackage.aktp;
import defpackage.amme;
import defpackage.aozy;
import defpackage.apag;
import defpackage.armf;
import defpackage.mex;
import defpackage.mfc;
import defpackage.mho;
import defpackage.uuf;
import defpackage.uuh;
import defpackage.via;
import defpackage.wlw;
import defpackage.xyo;
import defpackage.xze;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class SmsRejectedReceiver extends wlw {
    public armf c;
    public armf d;
    public armf e;
    public armf f;
    private static final xze g = xze.g("Bugle", "SmsRejectedReceiver");
    public static final uuf a = uuh.i(uuh.b, "enable_sms_rejected_receiver", false);
    public static final uuf b = uuh.i(uuh.b, "enable_sms_rejected_receiver_to_post_notification", false);

    @Override // defpackage.wng
    public final akrc a() {
        return ((aksr) this.c.b()).b("SmsRejectedReceiver Receive broadcast");
    }

    @Override // defpackage.wng
    public final String b() {
        return null;
    }

    @Override // defpackage.wng
    public final void c(Context context, Intent intent) {
        akrh e = aktp.e("SmsRejectedReceiver.executeAction");
        if (intent != null) {
            try {
                String action = intent.getAction();
                xze xzeVar = g;
                xyo e2 = xzeVar.e();
                e2.H(intent);
                e2.q();
                if ("android.provider.Telephony.SMS_REJECTED".equals(action)) {
                    int intExtra = intent.getIntExtra("result", 1);
                    int intExtra2 = intent.getIntExtra("subId", -1);
                    xyo e3 = xzeVar.e();
                    e3.H("SMS_REJECTED_ACTION");
                    e3.x("result", intExtra);
                    e3.q();
                    ((mho) this.d.b()).X(intExtra, intExtra2);
                    mfc mfcVar = (mfc) this.f.b();
                    aozy createBuilder = mex.a.createBuilder();
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    apag apagVar = createBuilder.b;
                    mex mexVar = (mex) apagVar;
                    mexVar.c = 1;
                    mexVar.b = 1 | mexVar.b;
                    if (!apagVar.isMutable()) {
                        createBuilder.u();
                    }
                    mex mexVar2 = (mex) createBuilder.b;
                    mexVar2.b |= 16;
                    mexVar2.g = intExtra;
                    mfcVar.e((mex) createBuilder.s());
                    if (((Boolean) b.e()).booleanValue()) {
                        ((via) this.e.b()).N(amme.SMS_REJECTED, context.getResources().getString(R.string.report_receive_issue_notification_message));
                    }
                }
            } catch (Throwable th) {
                try {
                    e.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        e.close();
    }

    @Override // defpackage.wng
    protected final int e() {
        return 6;
    }
}
