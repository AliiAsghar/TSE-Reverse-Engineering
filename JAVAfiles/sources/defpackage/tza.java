package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class tza extends tzq {
    private final MessageCoreData a;
    private final tzv b;

    public tza(MessageCoreData messageCoreData) {
        this.a = messageCoreData;
        arml armlVar = tzv.a;
        int j = messageCoreData.j();
        tzv tzvVar = (tzv) ((Map) tzv.a.a()).get(Integer.valueOf(j));
        if (tzvVar != null) {
            this.b = tzvVar;
            return;
        }
        throw new IllegalArgumentException(a.bV(j, "Invalid group membership change tombstone status code "));
    }

    @Override // defpackage.tzq
    public final MessageCoreData a() {
        return this.a;
    }

    @Override // defpackage.tzq
    public final tzf b() {
        int ordinal = this.b.ordinal();
        if (ordinal != 0 && ordinal != 1 && ordinal != 2 && ordinal != 3 && ordinal != 4) {
            return tzf.c;
        }
        return tzf.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof tza) && d.F(this.a, ((tza) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "GroupMembershipChangeTombstone(message=" + this.a + ")";
    }
}
