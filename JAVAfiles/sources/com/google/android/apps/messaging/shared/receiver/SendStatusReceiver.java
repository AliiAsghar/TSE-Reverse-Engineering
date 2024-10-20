package com.google.android.apps.messaging.shared.receiver;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.telephony.SmsMessage;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.action.ProcessDeliveryReportAction;
import com.google.android.apps.messaging.shared.datamodel.action.ProcessDownloadedMmsAction;
import com.google.android.apps.messaging.shared.datamodel.action.ProcessSentMessageAction;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import com.google.android.ims.rcsservice.chatsession.message.groupmanagement.GroupManagementRequest;
import defpackage.agnq;
import defpackage.akrc;
import defpackage.akrh;
import defpackage.aksr;
import defpackage.aktp;
import defpackage.albo;
import defpackage.armf;
import defpackage.mgv;
import defpackage.mho;
import defpackage.msk;
import defpackage.oia;
import defpackage.rbr;
import defpackage.rbv;
import defpackage.rdg;
import defpackage.rvc;
import defpackage.utz;
import defpackage.vid;
import defpackage.wls;
import defpackage.wzm;
import defpackage.wzs;
import defpackage.xca;
import defpackage.xnv;
import defpackage.xyo;
import defpackage.xzb;
import defpackage.xze;
import defpackage.yck;
import defpackage.ydk;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class SendStatusReceiver extends wls {
    private static final xze i = xze.g("Bugle", "SendStatusReceiver");
    public armf a;
    public armf b;
    public armf c;
    public armf d;
    public armf e;
    public armf f;
    public armf g;
    public armf h;

    @Override // defpackage.wng
    public final akrc a() {
        return ((aksr) this.e.b()).b("SendStatusReceiver Receive broadcast");
    }

    @Override // defpackage.wng
    public final String b() {
        return "Bugle.Broadcast.SendStatus.Latency";
    }

    @Override // defpackage.wng
    protected final int e() {
        return 18;
    }

    @Override // defpackage.wna
    public final String f() {
        return "Bugle.Broadcast.ForegroundService.SendStatus.Latency";
    }

    @Override // defpackage.wna
    public final void g(Context context, Intent intent) {
        akrh akrhVar;
        String action;
        int i2;
        int intExtra;
        long longExtra;
        xze xzeVar;
        SmsMessage createFromPdu;
        int i3;
        int i4;
        akrh e = aktp.e("SendStatusReceiver.processBroadcast");
        try {
            action = intent.getAction();
            i2 = 0;
            intExtra = intent.getIntExtra("resultCode", 0);
            longExtra = intent.getLongExtra("messageId", 0L);
            xzeVar = i;
            xyo c = xzeVar.c();
            c.H("processBroadcast.");
            c.z(GroupManagementRequest.ACTION_TAG, action);
            c.x("resultCode", intExtra);
            c.v(longExtra);
            c.q();
        } catch (Throwable th) {
            th = th;
            akrhVar = e;
        }
        try {
            if ("com.google.android.apps.messaging.shared.receiver.SendStatusReceiver.MESSAGE_SENT".equals(action)) {
                ((mgv) this.f.b()).f(mgv.e);
                Uri uri = (Uri) intent.getParcelableExtra(ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI);
                int intExtra2 = intent.getIntExtra("errorCode", -1);
                int intExtra3 = intent.getIntExtra("partCnt", 1);
                int intExtra4 = intent.getIntExtra("partId", -1);
                akrhVar = e;
                int intExtra5 = intent.getIntExtra("subId", -1);
                String stringExtra = intent.getStringExtra("destination");
                String stringExtra2 = intent.getStringExtra("format");
                Boolean bool = (Boolean) intent.getSerializableExtra("ims");
                ((msk) this.h.b()).t(albo.ag(stringExtra), intExtra5);
                if (intExtra == -1) {
                    if (((yck) this.g.b()).n) {
                        intExtra = -1;
                    } else {
                        if (xzb.q("Bugle", 2)) {
                            xyo d = xzeVar.d();
                            d.H("received sent result.");
                            d.x("partId", intExtra4);
                            d.x("partCount", intExtra3);
                            d.x("resultCode", -1);
                            d.z("messageUri", uri);
                            d.q();
                        }
                        i3 = intExtra2;
                        i4 = -1;
                        MessageIdType b = rvc.b(intent.getStringExtra("message_id"));
                        rdg rdgVar = (rdg) this.c.b();
                        vid vidVar = (vid) rdgVar.a.b();
                        vidVar.getClass();
                        wzm wzmVar = (wzm) rdgVar.b.b();
                        wzmVar.getClass();
                        new ProcessSentMessageAction(vidVar, wzmVar, b, uri, i4, i3, intExtra5, intExtra3, stringExtra2, bool).r(this);
                    }
                }
                xyo b2 = xzeVar.b();
                b2.H("failure in sending message part.");
                b2.x("partId", intExtra4);
                b2.x("partCount", intExtra3);
                b2.x("resultCode", intExtra);
                b2.x("errorCode", intExtra2);
                b2.z("messageUri", uri);
                b2.v(longExtra);
                b2.q();
                if (intExtra2 == -1) {
                    xyo a = xzeVar.a();
                    a.H("intent extras:\n");
                    a.H(xzb.a(intent));
                    a.q();
                    intExtra2 = -1;
                }
                if (((yck) this.g.b()).n) {
                    i3 = -1;
                    i4 = 1;
                } else {
                    i3 = intExtra2;
                    i4 = intExtra;
                }
                MessageIdType b3 = rvc.b(intent.getStringExtra("message_id"));
                rdg rdgVar2 = (rdg) this.c.b();
                vid vidVar2 = (vid) rdgVar2.a.b();
                vidVar2.getClass();
                wzm wzmVar2 = (wzm) rdgVar2.b.b();
                wzmVar2.getClass();
                new ProcessSentMessageAction(vidVar2, wzmVar2, b3, uri, i4, i3, intExtra5, intExtra3, stringExtra2, bool).r(this);
            } else {
                akrhVar = e;
                if ("com.google.android.apps.messaging.shared.receiver.SendStatusReceiver.MMS_SENT".equals(action)) {
                    ((mgv) this.f.b()).f(mgv.f);
                    Uri data = intent.getData();
                    rdg rdgVar3 = (rdg) this.c.b();
                    Bundle extras = intent.getExtras();
                    vid vidVar3 = (vid) rdgVar3.a.b();
                    vidVar3.getClass();
                    data.getClass();
                    extras.getClass();
                    new ProcessSentMessageAction(vidVar3, intExtra, data, extras).r(this);
                } else if ("com.google.android.apps.messaging.shared.receiver.SendStatusReceiver.MMS_DOWNLOADED".equals(action)) {
                    rbv rbvVar = (rbv) this.b.b();
                    Bundle extras2 = intent.getExtras();
                    oia oiaVar = (oia) rbvVar.b.b();
                    oiaVar.getClass();
                    extras2.getClass();
                    new ProcessDownloadedMmsAction(rbvVar.a, oiaVar, rbvVar.c, intExtra, extras2).r(this);
                } else if ("com.google.android.apps.messaging.shared.receiver.SendStatusReceiver.MESSAGE_DELIVERED".equals(action)) {
                    byte[] byteArrayExtra = intent.getByteArrayExtra("pdu");
                    Integer num = null;
                    if (byteArrayExtra != null) {
                        String stringExtra3 = intent.getStringExtra("format");
                        if (stringExtra3 != null) {
                            createFromPdu = SmsMessage.createFromPdu(byteArrayExtra, stringExtra3);
                        } else {
                            createFromPdu = SmsMessage.createFromPdu(byteArrayExtra);
                        }
                        if (createFromPdu != null) {
                            int status = createFromPdu.getStatus();
                            if (!((Boolean) ((utz) xca.b.get()).e()).booleanValue() || status != 131072) {
                                i2 = status;
                            }
                            num = Integer.valueOf(i2);
                        }
                    }
                    if (num == null) {
                        xzeVar.m("empty report message");
                    } else {
                        Uri uri2 = (Uri) intent.getParcelableExtra(ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI);
                        try {
                            if (uri2 == null) {
                                xzeVar.m("smsMessageUri is null");
                            } else {
                                xyo a2 = xzeVar.a();
                                a2.H("processing SMS delivery report.");
                                a2.z("smsMessageUri", uri2);
                                a2.z("status", num);
                                a2.v(longExtra);
                                a2.q();
                                if (ydk.z(uri2)) {
                                    rbr rbrVar = (rbr) this.a.b();
                                    int intValue = num.intValue();
                                    xnv xnvVar = (xnv) rbrVar.b.b();
                                    xnvVar.getClass();
                                    wzs wzsVar = (wzs) rbrVar.c.b();
                                    wzsVar.getClass();
                                    mho mhoVar = (mho) rbrVar.d.b();
                                    mhoVar.getClass();
                                    agnq agnqVar = (agnq) rbrVar.e.b();
                                    agnqVar.getClass();
                                    new ProcessDeliveryReportAction(rbrVar.a, xnvVar, wzsVar, mhoVar, agnqVar, uri2, intValue).r(this);
                                }
                            }
                        } catch (NullPointerException unused) {
                            i.m("NPE inside SmsMessage");
                        }
                    }
                }
            }
            akrhVar.close();
        } catch (Throwable th2) {
            th = th2;
            Throwable th3 = th;
            try {
                akrhVar.close();
                throw th3;
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
                throw th3;
            }
        }
    }

    @Override // defpackage.wna
    public final boolean h(Context context, Intent intent) {
        intent.putExtra("resultCode", getResultCode());
        return true;
    }

    @Override // defpackage.wna
    public final boolean i(Intent intent) {
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.wna
    public final String k(Context context, Intent intent) {
        char c;
        String action = intent.getAction();
        if (action != null) {
            switch (action.hashCode()) {
                case -1366403072:
                    if (action.equals("com.google.android.apps.messaging.shared.receiver.SendStatusReceiver.MESSAGE_SENT")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case -1070391116:
                    if (action.equals("com.google.android.apps.messaging.shared.receiver.SendStatusReceiver.MMS_SENT")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case -246885565:
                    if (action.equals("com.google.android.apps.messaging.shared.receiver.SendStatusReceiver.MMS_DOWNLOADED")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 1022419196:
                    if (action.equals("com.google.android.apps.messaging.shared.receiver.SendStatusReceiver.MESSAGE_DELIVERED")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            if (c != 0 && c != 1) {
                if (c != 2) {
                    if (c != 3) {
                        return null;
                    }
                    return context.getString(R.string.downloaded_mms_foreground_notification_text);
                }
                return context.getString(R.string.delivered_message_foreground_notification_text);
            }
            return context.getString(R.string.outgoing_message_foreground_notification_text);
        }
        return null;
    }
}
