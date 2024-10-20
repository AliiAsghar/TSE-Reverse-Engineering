package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jzn implements jzk {
    private final MessageId a;
    private final arml b;

    public jzn(MessageId messageId, arqg arqgVar) {
        this.a = messageId;
        this.b = armd.b(2, arqgVar);
    }

    @Override // defpackage.jzk
    public final MessageId a() {
        return this.a;
    }

    @Override // defpackage.jzk
    public final qkg b() {
        return (qkg) this.b.a();
    }
}
