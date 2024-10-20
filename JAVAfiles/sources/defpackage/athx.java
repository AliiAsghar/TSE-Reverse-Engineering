package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class athx extends atgd implements Serializable {
    public static final atgd a = new athx();
    private static final long serialVersionUID = 2656707858124633367L;

    private athx() {
    }

    private Object readResolve() {
        return a;
    }

    @Override // defpackage.atgd
    public final long a(long j, int i) {
        return atow.p(j, i);
    }

    @Override // defpackage.atgd
    public final long b(long j, long j2) {
        return atow.p(j, j2);
    }

    @Override // defpackage.atgd
    public final long c() {
        return 1L;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        long c = ((atgd) obj).c();
        if (c == 1) {
            return 0;
        }
        if (c > 1) {
            return -1;
        }
        return 1;
    }

    @Override // defpackage.atgd
    public final atgf d() {
        return atgf.l;
    }

    @Override // defpackage.atgd
    public final boolean e() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof athx) {
            return true;
        }
        return false;
    }

    @Override // defpackage.atgd
    public final boolean f() {
        return true;
    }

    public final int hashCode() {
        return 1;
    }

    public final String toString() {
        return "DurationField[millis]";
    }
}
