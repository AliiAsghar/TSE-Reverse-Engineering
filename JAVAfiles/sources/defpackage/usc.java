package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class usc {
    public final long a;
    public final List b;
    public final int c;

    public usc(long j, List list, int i) {
        this.a = j;
        this.b = list;
        this.c = i;
    }

    public static /* synthetic */ usc a(usc uscVar, List list, int i, int i2) {
        long j;
        if ((i2 & 1) != 0) {
            j = uscVar.a;
        } else {
            j = 0;
        }
        if ((i2 & 2) != 0) {
            list = uscVar.b;
        }
        if ((i2 & 4) != 0) {
            i = uscVar.c;
        }
        list.getClass();
        return new usc(j, list, i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof usc)) {
            return false;
        }
        usc uscVar = (usc) obj;
        if (this.a == uscVar.a && d.F(this.b, uscVar.b) && this.c == uscVar.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((a.A(this.a) * 31) + this.b.hashCode()) * 31) + this.c;
    }

    public final String toString() {
        return "ActiveWorkerStats(startedAtTimeMillis=" + this.a + ", currentlyExecutingItems=" + this.b + ", completedWorkItems=" + this.c + ")";
    }
}
