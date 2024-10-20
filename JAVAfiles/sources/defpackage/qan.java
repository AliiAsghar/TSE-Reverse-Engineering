package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qan implements qaq {
    public static final alwo a = alwo.o("BugleFileTransfer");
    public final armf b;
    public final vjs c;
    private final anen d;
    private final anen e;
    private final Optional f;
    private final xnv g;

    public qan(anen anenVar, anen anenVar2, armf armfVar, Optional optional, vjs vjsVar, xnv xnvVar) {
        this.d = anenVar;
        this.e = anenVar2;
        this.b = armfVar;
        this.f = optional;
        this.c = vjsVar;
        this.g = xnvVar;
    }

    @Override // defpackage.qaq
    public final akul a(MessageCoreData messageCoreData) {
        long epochMilli;
        alwl alwlVar = (alwl) a.g();
        alwlVar.X(ydl.o, messageCoreData.z().toString());
        alwlVar.X(ydl.a, String.valueOf(messageCoreData.B().a));
        alwlVar.X(ydl.e, messageCoreData.E().b);
        ((alwl) alwlVar.h("com/google/android/apps/messaging/shared/chatapi/filetransfer/retry/NoRetryStrategy", "execute", 59, "NoRetryStrategy.java")).q("Failing file transfer with no retry.");
        if (messageCoreData.cw()) {
            epochMilli = messageCoreData.n();
        } else {
            epochMilli = this.g.f().toEpochMilli();
        }
        messageCoreData.aS(epochMilli);
        this.f.ifPresent(new ptf(messageCoreData, 7));
        return aktp.ai(new mzn(this, messageCoreData, 16, null), this.d).i(new prf(this, 5), this.e).i(new jab(11), this.e).h(new puy(messageCoreData, 3), this.e);
    }
}
