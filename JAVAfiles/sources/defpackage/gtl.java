package defpackage;

import java.util.Set;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gtl {
    public final UUID a;
    public final gtk b;
    public final Set c;
    public final gsf d;
    private final gsi e;
    private final gsi f;
    private final int g;
    private final int h;
    private final long i;
    private final gtj j;
    private final long k;
    private final int l;

    public gtl(UUID uuid, gtk gtkVar, Set set, gsi gsiVar, gsi gsiVar2, int i, int i2, gsf gsfVar, long j, gtj gtjVar, long j2, int i3) {
        gsiVar2.getClass();
        this.a = uuid;
        this.b = gtkVar;
        this.c = set;
        this.e = gsiVar;
        this.f = gsiVar2;
        this.g = i;
        this.h = i2;
        this.d = gsfVar;
        this.i = j;
        this.j = gtjVar;
        this.k = j2;
        this.l = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !d.F(getClass(), obj.getClass())) {
            return false;
        }
        gtl gtlVar = (gtl) obj;
        if (this.g != gtlVar.g || this.h != gtlVar.h || !d.F(this.a, gtlVar.a) || this.b != gtlVar.b || !d.F(this.e, gtlVar.e) || !d.F(this.d, gtlVar.d) || this.i != gtlVar.i || !d.F(this.j, gtlVar.j) || this.k != gtlVar.k || this.l != gtlVar.l || !d.F(this.c, gtlVar.c)) {
            return false;
        }
        return d.F(this.f, gtlVar.f);
    }

    public final int hashCode() {
        int i;
        int hashCode = (((((((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.e.hashCode()) * 31) + this.c.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g) * 31) + this.h) * 31) + this.d.hashCode();
        gtj gtjVar = this.j;
        if (gtjVar != null) {
            i = gtjVar.hashCode();
        } else {
            i = 0;
        }
        return (((((((hashCode * 31) + a.A(this.i)) * 31) + i) * 31) + a.A(this.k)) * 31) + this.l;
    }

    public final String toString() {
        return "WorkInfo{id='" + this.a + "', state=" + this.b + ", outputData=" + this.e + ", tags=" + this.c + ", progress=" + this.f + ", runAttemptCount=" + this.g + ", generation=" + this.h + ", constraints=" + this.d + ", initialDelayMillis=" + this.i + ", periodicityInfo=" + this.j + ", nextScheduleTimeMillis=" + this.k + "}, stopReason=" + this.l;
    }
}
