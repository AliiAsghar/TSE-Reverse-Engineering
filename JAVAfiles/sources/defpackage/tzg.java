package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class tzg extends tzq {
    private static final xze b = xze.g("BugleEtouffee", "NewConversationTombstone");
    public final MessageCoreData a;
    private final tzw c;

    public tzg(MessageCoreData messageCoreData) {
        this.a = messageCoreData;
        arml armlVar = tzw.a;
        int j = messageCoreData.j();
        tzw tzwVar = (tzw) ((Map) tzw.a.a()).get(Integer.valueOf(j));
        if (tzwVar != null) {
            this.c = tzwVar;
            return;
        }
        throw new IllegalArgumentException(a.bV(j, "Invalid new conversation tombstone status code "));
    }

    @Override // defpackage.tzq
    public final MessageCoreData a() {
        return this.a;
    }

    @Override // defpackage.tzq
    public final tzf b() {
        return this.c.a();
    }

    public final tzw c(tzf tzfVar) {
        tzfVar.getClass();
        int ordinal = tzfVar.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return null;
            }
            if (ordinal != 2) {
                if (ordinal == 3) {
                    tzw tzwVar = this.c;
                    int ordinal2 = tzwVar.ordinal();
                    if (ordinal2 != 0) {
                        if (ordinal2 != 2 && ordinal2 != 3) {
                            return tzwVar;
                        }
                        return tzw.f;
                    }
                    return tzw.c;
                }
                throw new armm();
            }
            tzw tzwVar2 = this.c;
            int ordinal3 = tzwVar2.ordinal();
            if (ordinal3 != 1) {
                if (ordinal3 != 3 && ordinal3 != 4) {
                    return tzwVar2;
                }
                return tzw.d;
            }
            return tzw.b;
        }
        b.q("Unknown group tombstone protocol");
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof tzg) && d.F(this.a, ((tzg) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "NewConversationTombstone(message=" + this.a + ")";
    }
}
