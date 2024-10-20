package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aqta {
    public final String a;
    public final aqsz b;
    public final long c;
    public final aqtk d;
    public final aqtk e;

    public aqta(String str, aqsz aqszVar, long j, aqtk aqtkVar) {
        this.a = str;
        aqszVar.getClass();
        this.b = aqszVar;
        this.c = j;
        this.d = null;
        this.e = aqtkVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof aqta) {
            aqta aqtaVar = (aqta) obj;
            if (d.B(this.a, aqtaVar.a) && d.B(this.b, aqtaVar.b) && this.c == aqtaVar.c) {
                aqtk aqtkVar = aqtaVar.d;
                if (d.B(null, null) && d.B(this.e, aqtaVar.e)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Long.valueOf(this.c), null, this.e});
    }

    public final String toString() {
        algv aj = albo.aj(this);
        aj.b("description", this.a);
        aj.b("severity", this.b);
        aj.g("timestampNanos", this.c);
        aj.b("channelRef", null);
        aj.b("subchannelRef", this.e);
        return aj.toString();
    }
}
