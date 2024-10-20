package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class tzd extends tzq {
    private final MessageCoreData a;

    public tzd(MessageCoreData messageCoreData) {
        this.a = messageCoreData;
    }

    @Override // defpackage.tzq
    public final MessageCoreData a() {
        return this.a;
    }

    @Override // defpackage.tzq
    public final tzf b() {
        if (this.a.cn()) {
            return tzf.d;
        }
        return tzf.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof tzd) && d.F(this.a, ((tzd) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "GroupRenameTombstone(message=" + this.a + ")";
    }
}
