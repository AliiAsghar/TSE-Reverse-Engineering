package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class tyz extends tzq {
    private final MessageCoreData a;

    public tyz(MessageCoreData messageCoreData) {
        this.a = messageCoreData;
    }

    @Override // defpackage.tzq
    public final MessageCoreData a() {
        return this.a;
    }

    @Override // defpackage.tzq
    public final tzf b() {
        return tzf.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof tyz) && d.F(this.a, ((tyz) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "GenericTombstone(message=" + this.a + ")";
    }
}
