package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kes implements jzj {
    public final aemj a;
    private final MessageId b;
    private final String c;

    public kes(aemj aemjVar, MessageId messageId) {
        this.a = aemjVar;
        this.b = messageId;
        String a = messageId.a();
        a.getClass();
        this.c = a;
    }

    @Override // defpackage.jzj
    public final MessageId a() {
        return this.b;
    }

    @Override // defpackage.aetq
    public final String b() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kes)) {
            return false;
        }
        kes kesVar = (kes) obj;
        if (d.F(this.a, kesVar.a) && d.F(this.b, kesVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "CardstoneUiData(cardstoneUiData=" + this.a + ", messageId=" + this.b + ")";
    }
}
