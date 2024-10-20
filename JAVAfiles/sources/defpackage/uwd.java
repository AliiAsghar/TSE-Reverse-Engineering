package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class uwd {
    public static final xze a = xze.g("Bugle", "MessageTrackerImpl");
    public static final alwo b = alwo.o("Bugle");
    public final anen c;
    public final apwt d;

    public uwd(anen anenVar, apwt apwtVar) {
        this.c = anenVar;
        this.d = apwtVar;
    }

    public final akul a(List list, tqg tqgVar) {
        return akul.g(((uwc) this.d.b()).j.d("markFlaggedMessagesAsNotified", new ung(list, tqgVar, 4, null)));
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [agnq, java.lang.Object] */
    public final void b(MessageIdType messageIdType, long j, tqg tqgVar) {
        akul i;
        String str;
        if (messageIdType.b()) {
            xyo e = a.e();
            e.H("Cannot track message - messageId cannot be");
            if (true != messageIdType.b()) {
                str = "empty";
            } else {
                str = "null";
            }
            e.H(str);
            e.q();
            return;
        }
        uwc uwcVar = (uwc) this.d.b();
        int i2 = 0;
        if (messageIdType.b()) {
            uwc.a.q("Cannot flag message - messageId cannot be empty.");
            i = aktp.ag(false);
        } else {
            d.t(true ^ uwcVar.j.b.j(), "This transaction must not be nested, as the transform routine needs the results to be visible");
            i = akul.g(uwcVar.j.c("MessageFlagger#flagMessage", new ruc(messageIdType, tqgVar, j, 2))).i(new uwa(uwcVar, i2), uwcVar.c);
        }
        byte[] bArr = null;
        i.k(qjc.a(new ydv(new rge(tqgVar, messageIdType, 10, bArr), new rge(tqgVar, messageIdType, 11, bArr), 0)), this.c);
    }

    public final void c(MessageIdType messageIdType, tqg tqgVar) {
        akul i;
        String str;
        int i2 = 1;
        if (messageIdType.b()) {
            xyo e = a.e();
            e.z("reason", tqgVar);
            e.H("Cannot stop tracking message - messageId cannot be");
            if (true != messageIdType.b()) {
                str = "empty";
            } else {
                str = "null";
            }
            e.H(str);
            e.q();
            return;
        }
        uwc uwcVar = (uwc) this.d.b();
        if (messageIdType.b()) {
            uwc.a.q("Cannot unflag message - messageId cannot be empty.");
            i = aktp.ag(false);
        } else {
            i = aktp.ai(new ulo(messageIdType, tqgVar, 10), uwcVar.b).i(new uwa(uwcVar, i2), uwcVar.c);
        }
        byte[] bArr = null;
        i.k(qjc.a(new ydv(new rge(tqgVar, messageIdType, 12, bArr), new rge(tqgVar, messageIdType, 13, bArr), 0)), this.c);
    }
}
