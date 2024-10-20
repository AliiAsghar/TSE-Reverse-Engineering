package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akgf {
    public final akfb a;
    public final long b;
    public final akfn c;
    public final akfr d;
    public final int e;
    public final Instant f;

    public akgf() {
        throw null;
    }

    public final akgf a(akfb akfbVar, Instant instant) {
        boolean z;
        if (this.b != Long.MAX_VALUE) {
            z = true;
        } else {
            z = false;
        }
        albo.U(z, "You've just overflowed a long. Consider upgrading to a BigDecimal, if this happens more than once.");
        return new akgf(akfbVar, this.b + 1, new akfn(0L), new akfr(0L), 0, instant);
    }

    public final boolean b(akgf akgfVar) {
        boolean z;
        boolean z2;
        if (this.b != Long.MIN_VALUE) {
            z = true;
        } else {
            z = false;
        }
        albo.T(z);
        if (equals(akgfVar) && this != akgfVar) {
            z2 = false;
        } else {
            z2 = true;
        }
        albo.T(z2);
        long j = this.b;
        long j2 = akgfVar.b;
        if (j >= j2) {
            if (j != j2) {
                return false;
            }
            if (this.c.a >= akgfVar.c.a) {
                if (this.d.a >= akgfVar.d.a) {
                    return false;
                }
            }
        }
        return true;
    }

    public final boolean c() {
        if (this.e > 3) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof akgf) {
            akgf akgfVar = (akgf) obj;
            if (this.a.equals(akgfVar.a) && this.b == akgfVar.b && this.c.equals(akgfVar.c) && this.d.equals(akgfVar.d) && this.e == akgfVar.e && this.f.equals(akgfVar.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() ^ 1000003;
        long j = this.b;
        return (((((((((hashCode * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e) * 1000003) ^ this.f.hashCode();
    }

    public final String toString() {
        Instant instant = this.f;
        akfr akfrVar = this.d;
        akfn akfnVar = this.c;
        return "SubscribeSequenceState{dataSource=" + this.a.toString() + ", index=" + this.b + ", fetchTaskIdentifier=" + String.valueOf(akfnVar) + ", loadTaskIdentifier=" + String.valueOf(akfrVar) + ", loadAttempts=" + this.e + ", epochTimeAtStart=" + instant.toString() + "}";
    }

    public akgf(akfb akfbVar, long j, akfn akfnVar, akfr akfrVar, int i, Instant instant) {
        this.a = akfbVar;
        this.b = j;
        if (akfnVar == null) {
            throw new NullPointerException("Null fetchTaskIdentifier");
        }
        this.c = akfnVar;
        if (akfrVar != null) {
            this.d = akfrVar;
            this.e = i;
            if (instant != null) {
                this.f = instant;
                return;
            }
            throw new NullPointerException("Null epochTimeAtStart");
        }
        throw new NullPointerException("Null loadTaskIdentifier");
    }
}
