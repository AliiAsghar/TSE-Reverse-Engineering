package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jzm implements jzk {
    private final MessageId a;
    private final Long b;
    private final boolean c = false;
    private final qkg d;

    public jzm(MessageId messageId, Long l, qkg qkgVar) {
        this.a = messageId;
        this.b = l;
        this.d = qkgVar;
    }

    @Override // defpackage.jzk
    public final MessageId a() {
        return this.a;
    }

    @Override // defpackage.jzk
    public final qkg b() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jzm)) {
            return false;
        }
        jzm jzmVar = (jzm) obj;
        if (!d.F(this.a, jzmVar.a) || !d.F(this.b, jzmVar.b)) {
            return false;
        }
        boolean z = jzmVar.c;
        if (d.F(this.d, jzmVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + 1237) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "EagerBugleMessageUiDataWrapper(id=" + this.a + ", timestamp=" + this.b + ", requiresImmediateRefresh=false, value=" + this.d + ")";
    }
}
