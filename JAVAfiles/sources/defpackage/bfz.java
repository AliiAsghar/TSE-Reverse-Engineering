package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bfz implements bgn {
    public static final bfz a = new bfz();

    private bfz() {
    }

    @Override // defpackage.bgn
    public final long a(long j, float f, bwj bwjVar) {
        long f2;
        bwjVar.y(-1687113661);
        bfs a2 = bgu.a(bwjVar);
        if (Float.compare(f, brg.a) > 0 && !a2.m()) {
            f2 = ckw.f(cku.d(r0), cku.c(r0), cku.b(r0), ((((float) Math.log(f + 1.0f)) * 4.5f) + 2.0f) / 100.0f, cku.f(bft.a(j, bwjVar)));
            j = ckw.h(f2, j);
        }
        bwjVar.q();
        return j;
    }
}
