package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jrj implements jrt {
    public final Instant a;
    public final jri b;
    public final mzc c;

    public jrj(mzc mzcVar, Instant instant, jri jriVar) {
        this.c = mzcVar;
        this.a = instant;
        this.b = jriVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jrj)) {
            return false;
        }
        jrj jrjVar = (jrj) obj;
        if (d.F(this.c, jrjVar.c) && d.F(this.a, jrjVar.a) && d.F(this.b, jrjVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.c.hashCode() * 31;
        Instant instant = this.a;
        if (instant == null) {
            hashCode = 0;
        } else {
            hashCode = instant.hashCode();
        }
        return ((hashCode2 + hashCode) * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "MapiPreparedMessage(envelope=" + this.c + ", scheduledTime=" + this.a + ", loggingEnvelope=" + this.b + ")";
    }
}
