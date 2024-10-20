package defpackage;

import j$.time.Duration;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xkd {
    public final xkk a;
    public final Duration b;

    public xkd(xkk xkkVar, Duration duration) {
        xkkVar.getClass();
        this.a = xkkVar;
        this.b = duration;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xkd)) {
            return false;
        }
        xkd xkdVar = (xkd) obj;
        if (this.a == xkdVar.a && d.F(this.b, xkdVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "UpdateResults(status=" + this.a + ", txnDuration=" + this.b + ")";
    }
}
