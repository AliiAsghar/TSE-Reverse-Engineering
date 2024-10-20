package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class wjj {
    public final wji a;
    private final MessageIdType b;
    private final rve c;

    public wjj(wji wjiVar) {
        this.a = wjiVar;
        MessageIdType b = rvc.b(wjiVar.b);
        this.b = b;
        String str = wjiVar.c;
        rve a = rve.a(true == d.F(str, "") ? null : str);
        this.c = a;
        Instant.ofEpochMilli(wjiVar.d).getClass();
        if (!b.b()) {
            if (a.k()) {
                return;
            } else {
                throw new IllegalArgumentException("Creating an EditMessageDataWrapper with empty editedRcsMessageId");
            }
        }
        throw new IllegalArgumentException("Creating an EditMessageDataWrapper with empty editedMessageId");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof wjj) && d.F(this.a, ((wjj) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "EditMessageDataWrapper(editMessageData=" + this.a + ")";
    }
}
