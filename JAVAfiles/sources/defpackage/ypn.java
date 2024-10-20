package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ypn {
    public final ypm a;
    public final String b;
    public final MessageIdType c;
    public final ConversationIdType d;
    public final int e;
    public final boolean f;
    public final String g;

    public ypn(ypm ypmVar, String str) {
        this.a = ypmVar;
        this.b = str;
        this.c = ypmVar.a;
        this.d = ypmVar.b;
        this.e = ypmVar.c;
        this.f = ypmVar.d;
        this.g = ypmVar.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ypn)) {
            return false;
        }
        ypn ypnVar = (ypn) obj;
        if (d.F(this.a, ypnVar.a) && d.F(this.b, ypnVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.a.hashCode() * 31;
        String str = this.b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        return "MessageWrapper(metadata=" + this.a + ", text=" + this.b + ")";
    }
}
