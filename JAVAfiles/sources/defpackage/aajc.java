package defpackage;

import j$.time.Instant;
import j$.time.ZoneId;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aajc {
    public final Instant a;
    private final String b;
    private final long c;
    private final aajd d;
    private final rxg e;
    private final Map f;

    public aajc(String str, long j, Instant instant, aajd aajdVar, rxg rxgVar, Map map) {
        aajdVar.getClass();
        this.b = str;
        this.c = j;
        this.a = instant;
        this.d = aajdVar;
        this.e = rxgVar;
        this.f = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aajc)) {
            return false;
        }
        aajc aajcVar = (aajc) obj;
        if (d.F(this.b, aajcVar.b) && this.c == aajcVar.c && d.F(this.a, aajcVar.a) && this.d == aajcVar.d && d.F(this.e, aajcVar.e) && d.F(this.f, aajcVar.f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((((((this.b.hashCode() * 31) + a.A(this.c)) * 31) + this.a.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode();
    }

    public final String toString() {
        String str = this.b;
        Long valueOf = Long.valueOf(this.c);
        Instant instant = this.a;
        return aqjn.aK(aqjn.B(str, valueOf, instant, instant.atZone(ZoneId.systemDefault()), this.d.name(), this.e, this.f), ", ", null, null, yzm.t, 30);
    }
}
