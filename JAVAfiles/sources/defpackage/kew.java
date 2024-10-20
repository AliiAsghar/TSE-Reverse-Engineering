package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kew implements jzj {
    private final MessageId a;
    private final String b;

    public kew(MessageId messageId) {
        this.a = messageId;
        String a = messageId.a();
        a.getClass();
        this.b = a;
    }

    @Override // defpackage.jzj
    public final MessageId a() {
        return this.a;
    }

    @Override // defpackage.aetq
    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof kew) && d.F(this.a, ((kew) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "HiddenMessageUiData(messageId=" + this.a + ")";
    }
}
