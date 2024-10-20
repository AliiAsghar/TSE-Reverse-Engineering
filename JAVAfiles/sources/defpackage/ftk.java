package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ftk implements ftn {
    private static final byte[] c = {73, 68, 51};
    public long a;
    public long b;
    private final boolean d;
    private final String f;
    private final int g;
    private String h;
    private fmq i;
    private fmq j;
    private int k;
    private int l;
    private int m;
    private boolean n;
    private boolean o;
    private int p;
    private int q;
    private int r;
    private boolean s;
    private int t;
    private fmq u;
    private long v;
    private final fjl w = new fjl(new byte[7], (byte[]) null);
    private final euf e = new euf(Arrays.copyOf(c, 10));

    public ftk(boolean z, String str, int i) {
        h();
        this.p = -1;
        this.q = -1;
        this.a = -9223372036854775807L;
        this.b = -9223372036854775807L;
        this.d = z;
        this.f = str;
        this.g = i;
    }

    public static boolean f(int i) {
        if ((i & 65526) == 65520) {
            return true;
        }
        return false;
    }

    private final void g() {
        this.o = false;
        h();
    }

    private final void h() {
        this.k = 0;
        this.l = 0;
        this.m = 256;
    }

    private final void i() {
        this.k = 3;
        this.l = 0;
    }

    private final void j(fmq fmqVar, long j, int i, int i2) {
        this.k = 4;
        this.l = i;
        this.u = fmqVar;
        this.v = j;
        this.t = i2;
    }

    private final boolean k(euf eufVar, byte[] bArr, int i) {
        int min = Math.min(eufVar.b(), i - this.l);
        eufVar.E(bArr, this.l, min);
        int i2 = this.l + min;
        this.l = i2;
        if (i2 == i) {
            return true;
        }
        return false;
    }

    private static final boolean l(byte b) {
        return f((b & 255) | 65280);
    }

    private static final boolean m(euf eufVar, byte[] bArr, int i) {
        if (eufVar.b() < i) {
            return false;
        }
        eufVar.E(bArr, 0, i);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x02b5 A[SYNTHETIC] */
    @Override // defpackage.ftn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(defpackage.euf r17) {
        /*
            Method dump skipped, instructions count: 716
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ftk.a(euf):void");
    }

    @Override // defpackage.ftn
    public final void b(flw flwVar, fuq fuqVar) {
        fuqVar.c();
        this.h = fuqVar.b();
        fmq p = flwVar.p(fuqVar.a(), 1);
        this.i = p;
        this.u = p;
        if (this.d) {
            fuqVar.c();
            fmq p2 = flwVar.p(fuqVar.a(), 5);
            this.j = p2;
            eqm eqmVar = new eqm();
            eqmVar.a = fuqVar.b();
            eqmVar.b("application/id3");
            p2.h(new eqn(eqmVar));
            return;
        }
        this.j = new flr();
    }

    @Override // defpackage.ftn
    public final void d(long j, int i) {
        this.b = j;
    }

    @Override // defpackage.ftn
    public final void e() {
        this.b = -9223372036854775807L;
        g();
    }

    @Override // defpackage.ftn
    public final void c(boolean z) {
    }
}
