package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class tzo extends tzq {
    public final MessageCoreData a;
    private final tzy b;

    public tzo(MessageCoreData messageCoreData) {
        this.a = messageCoreData;
        arml armlVar = tzy.a;
        int j = messageCoreData.j();
        tzy tzyVar = (tzy) ((Map) tzy.a.a()).get(Integer.valueOf(j));
        if (tzyVar != null) {
            this.b = tzyVar;
            return;
        }
        throw new IllegalArgumentException(a.bV(j, "Invalid protocol change tombstone status code "));
    }

    @Override // defpackage.tzq
    public final MessageCoreData a() {
        return this.a;
    }

    @Override // defpackage.tzq
    public final tzf b() {
        return this.b.a();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof tzo) && d.F(this.a, ((tzo) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ProtocolSwitchTombstone(message=" + this.a + ")";
    }
}
