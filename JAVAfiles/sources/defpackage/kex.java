package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kex implements jzj {
    public final List a;
    private final MessageId b;
    private final long c;
    private final String d;

    public kex(List list, MessageId messageId, long j) {
        this.a = list;
        this.b = messageId;
        this.c = j;
        String a = messageId.a();
        a.getClass();
        this.d = a;
    }

    @Override // defpackage.jzj
    public final MessageId a() {
        return this.b;
    }

    @Override // defpackage.aetq
    public final String b() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kex)) {
            return false;
        }
        kex kexVar = (kex) obj;
        if (d.F(this.a, kexVar.a) && d.F(this.b, kexVar.b) && this.c == kexVar.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + a.A(this.c);
    }

    public final String toString() {
        return "BugleMultiPartMessageUiData(messageBubbles=" + this.a + ", messageId=" + this.b + ", timestamp=" + this.c + ")";
    }
}
