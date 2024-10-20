package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rim {
    private static final xze a = xze.g("BugleDataModel", "DeleteMessageUtil");
    private final armf b;
    private final wzs c;

    public rim(armf armfVar, wzs wzsVar) {
        this.b = armfVar;
        this.c = wzsVar;
    }

    public final void a(MessageCoreData messageCoreData) {
        if (messageCoreData == null) {
            return;
        }
        armf armfVar = this.b;
        MessageIdType B = messageCoreData.B();
        if (((uzo) armfVar.b()).a(B) > 0) {
            xyo c = a.c();
            c.H("Deleted local message.");
            c.c(B);
            c.q();
        } else {
            xyo e = a.e();
            e.H("Could not delete local message.");
            e.c(B);
            e.q();
        }
        Uri t = messageCoreData.t();
        if (t != null) {
            if (this.c.a(t, "Bugle.Telephony.Delete.MmsWap.Latency") > 0) {
                xyo c2 = a.c();
                c2.H("Deleted message. uri:");
                c2.H(t);
                c2.q();
                return;
            }
            xyo e2 = a.e();
            e2.H("Could not delete message from telephony.");
            e2.c(B);
            e2.z("messageUri", t);
            e2.q();
            return;
        }
        xyo c3 = a.c();
        c3.H("Local message has no telephony uri.");
        c3.c(B);
        c3.q();
    }
}
