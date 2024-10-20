package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class tzh extends tzq {
    public final MessageCoreData a;

    public tzh(MessageCoreData messageCoreData) {
        this.a = messageCoreData;
    }

    @Override // defpackage.tzq
    public final MessageCoreData a() {
        return this.a;
    }

    @Override // defpackage.tzq
    public final tzf b() {
        return tze.b(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof tzh) && d.F(this.a, ((tzh) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "NonTombstone(message=" + this.a + ")";
    }
}
