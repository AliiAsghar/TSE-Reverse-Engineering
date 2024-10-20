package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aezs {
    private final long a;
    private final long b;
    private final long c;
    private final long d;
    private final long e;
    private final long f;
    private final List g;

    public aezs(long j, long j2, long j3, long j4, long j5, long j6, long j7) {
        this.a = j2;
        this.b = j3;
        this.c = j4;
        this.d = j5;
        this.e = j6;
        this.f = j7;
        this.g = aqjn.B(new cku(j), new cku(j2), new cku(j3), new cku(j4), new cku(j5), new cku(j6), new cku(j7));
    }

    public final long a(String str) {
        int hashCode = str.hashCode();
        int size = this.g.size();
        int i = hashCode % size;
        return ((cku) this.g.get(i + (size & (((i ^ size) & ((-i) | i)) >> 31)))).i;
    }
}
