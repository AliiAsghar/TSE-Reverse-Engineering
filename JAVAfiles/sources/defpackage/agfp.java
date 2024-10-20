package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agfp {
    public final agfo a;
    public final Duration b;
    public final long c;
    public final dje d;

    public agfp(agfo agfoVar, Duration duration, long j, dje djeVar) {
        djeVar.getClass();
        this.a = agfoVar;
        this.b = duration;
        this.c = j;
        this.d = djeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof agfp)) {
            return false;
        }
        agfp agfpVar = (agfp) obj;
        if (d.F(this.a, agfpVar.a) && d.F(this.b, agfpVar.b) && a.bB(this.c, agfpVar.c) && d.F(this.d, agfpVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        agfo agfoVar = this.a;
        if (agfoVar == null) {
            hashCode = 0;
        } else {
            hashCode = agfoVar.hashCode();
        }
        return (((((hashCode * 31) + this.b.hashCode()) * 31) + a.A(this.c)) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "TimerData(dotData=" + this.a + ", time=" + this.b + ", textColor=" + cku.g(this.c) + ", textStyle=" + this.d + ")";
    }
}
