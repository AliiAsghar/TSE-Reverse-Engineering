package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class aolv extends aqrx {
    private final Object a = new Object();
    private long b;
    private long c;
    private final aolu d;

    public aolv(aolu aoluVar) {
        this.d = aoluVar;
    }

    @Override // defpackage.aqae
    public final void b(long j) {
        synchronized (this.a) {
            this.c += j;
        }
    }

    @Override // defpackage.aqae
    public final void c(long j) {
        synchronized (this.a) {
            this.b += j;
        }
    }

    @Override // defpackage.aqae
    public final void e() {
        boolean z;
        synchronized (this.a) {
            aolu aoluVar = this.d;
            long j = this.b;
            boolean z2 = true;
            if (j >= 0) {
                z = true;
            } else {
                z = false;
            }
            d.t(z, "Cannot record negative request bytes.");
            aoluVar.j.add(Long.valueOf(j));
            aolu aoluVar2 = this.d;
            long j2 = this.c;
            if (j2 < 0) {
                z2 = false;
            }
            d.t(z2, "Cannot record negative response bytes.");
            aoluVar2.k.add(Long.valueOf(j2));
        }
    }
}
