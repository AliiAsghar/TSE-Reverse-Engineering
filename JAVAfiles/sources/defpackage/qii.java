package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.apps.messaging.shared.datamodel.action.ProcessDownloadedMmsAction;
import com.google.android.apps.messaging.shared.datamodel.action.ProcessSentMessageAction;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qii extends qim {
    public aksr a;
    public rdg b;
    public rbv c;

    @Override // defpackage.wng
    public final akrc a() {
        return this.a.b("CloudSyncInternalReceiver Receive broadcast");
    }

    @Override // defpackage.wng
    public final String b() {
        return "Bugle.Broadcast.CloudSync.Latency";
    }

    @Override // defpackage.wng
    public final void c(Context context, Intent intent) {
        boolean z;
        String action = intent.getAction();
        if (action != null) {
            int hashCode = action.hashCode();
            int i = 0;
            if (hashCode != -883916357) {
                if (hashCode == -525415832 && action.equals("com.google.android.apps.messaging.cloudsync.internal.action.SEND_MESSAGE_RESULT")) {
                    z = false;
                }
                z = -1;
            } else {
                if (action.equals("com.google.android.apps.messaging.cloudsync.internal.action.ACTION_ATTACHMENTS_DOWNLOADED")) {
                    z = true;
                }
                z = -1;
            }
            if (z) {
                if (z) {
                    rbv rbvVar = this.c;
                    if (getResultCode() != -1) {
                        i = 2;
                    }
                    String stringExtra = intent.getStringExtra("com.google.android.apps.messaging.cloudsync.extra.ID");
                    String[] stringArrayExtra = intent.getStringArrayExtra("com.google.android.apps.messaging.cloudsync.extra.ATTACHMENTS_TYPES");
                    String[] stringArrayExtra2 = intent.getStringArrayExtra("com.google.android.apps.messaging.cloudsync.extra.ATTACHMENTS_VALUES");
                    Bundle extras = intent.getExtras();
                    oia oiaVar = (oia) rbvVar.b.b();
                    oiaVar.getClass();
                    stringArrayExtra.getClass();
                    stringArrayExtra2.getClass();
                    extras.getClass();
                    new ProcessDownloadedMmsAction(rbvVar.d, oiaVar, rbvVar.c, i, stringExtra, stringArrayExtra, stringArrayExtra2, extras).z();
                    return;
                }
                return;
            }
            rdg rdgVar = this.b;
            MessageIdType b = rvc.b(intent.getStringExtra("com.google.android.apps.messaging.cloudsync.internal.extra.REQUEST_ID"));
            String stringExtra2 = intent.getStringExtra("com.google.android.apps.messaging.cloudsync.extra.ID");
            int intExtra = intent.getIntExtra("com.google.android.apps.messaging.cloudsync.internal.extra.SUB_ID", -1);
            int resultCode = getResultCode();
            vid vidVar = (vid) rdgVar.a.b();
            vidVar.getClass();
            new ProcessSentMessageAction(vidVar, b, stringExtra2, intExtra, resultCode).r(this);
        }
    }

    @Override // defpackage.wng
    protected final int e() {
        return 18;
    }
}
