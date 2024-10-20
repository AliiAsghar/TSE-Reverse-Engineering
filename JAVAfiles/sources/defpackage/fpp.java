package defpackage;

import java.io.EOFException;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fpp implements flu {
    public boolean a;
    private final euf b;
    private final fmf c;
    private final fmc d;
    private final fmq e;
    private flw f;
    private fmq g;
    private fmq h;
    private int i;
    private erk j;
    private long k;
    private long l;
    private long m;
    private long n;
    private int o;
    private fpq p;
    private final efu q;

    public fpp() {
        this(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x039d  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x032b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int a(defpackage.flv r50) {
        /*
            Method dump skipped, instructions count: 1143
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fpp.a(flv):int");
    }

    private final long b(long j) {
        return this.k + ((j * 1000000) / this.c.d);
    }

    private final void c() {
        fpq fpqVar = this.p;
        if ((fpqVar instanceof fpm) && fpqVar.c()) {
            long j = this.n;
            if (j != -1 && j != this.p.e()) {
                fpm fpmVar = (fpm) this.p;
                this.p = new fpm(this.n, fpmVar.a, fpmVar.b, fpmVar.c);
                flw flwVar = this.f;
                dzg.g(flwVar);
                flwVar.w(this.p);
            }
        }
    }

    private static boolean j(int i, long j) {
        if ((i & (-128000)) == (j & (-128000))) {
            return true;
        }
        return false;
    }

    private final boolean k(flv flvVar) {
        fpq fpqVar = this.p;
        if (fpqVar != null) {
            long e = fpqVar.e();
            if (e != -1 && flvVar.e() > e - 4) {
                return true;
            }
        }
        try {
            if (!flvVar.o(this.b.a, 0, 4, true)) {
                return true;
            }
            return false;
        } catch (EOFException unused) {
            return true;
        }
    }

    private final boolean l(flv flvVar, boolean z) {
        int i;
        int i2;
        int a;
        int i3;
        flvVar.l();
        if (((fln) flvVar).c == 0) {
            erk w = this.q.w(flvVar, null);
            this.j = w;
            if (w != null) {
                this.d.b(w);
            }
            i = (int) flvVar.e();
            if (!z) {
                flvVar.m(i);
            }
            i2 = 0;
        } else {
            i = 0;
            i2 = 0;
        }
        int i4 = i2;
        int i5 = i4;
        while (true) {
            if (k(flvVar)) {
                if (i4 <= 0) {
                    c();
                    throw new EOFException();
                }
            } else {
                this.b.J(0);
                int e = this.b.e();
                if ((i2 != 0 && !j(e, i2)) || (a = fmg.a(e)) == -1) {
                    if (true != z) {
                        i3 = 131072;
                    } else {
                        i3 = 32768;
                    }
                    int i6 = i5 + 1;
                    if (i5 == i3) {
                        if (z) {
                            return false;
                        }
                        c();
                        throw new EOFException();
                    }
                    if (z) {
                        flvVar.l();
                        flvVar.g(i + i6);
                    } else {
                        flvVar.m(1);
                    }
                    i2 = 0;
                    i5 = i6;
                    i4 = 0;
                } else {
                    i4++;
                    if (i4 == 1) {
                        this.c.a(e);
                        i2 = e;
                    } else if (i4 == 4) {
                        break;
                    }
                    flvVar.g(a - 4);
                }
            }
        }
        if (z) {
            flvVar.m(i + i5);
        } else {
            flvVar.l();
        }
        this.i = i2;
        return true;
    }

    @Override // defpackage.flu
    public final /* synthetic */ List d() {
        int i = alog.d;
        return alsx.a;
    }

    @Override // defpackage.flu
    public final void e(flw flwVar) {
        this.f = flwVar;
        fmq p = flwVar.p(0, 1);
        this.g = p;
        this.h = p;
        this.f.r();
    }

    @Override // defpackage.flu
    public final void f(long j, long j2) {
        this.i = 0;
        this.k = -9223372036854775807L;
        this.l = 0L;
        this.o = 0;
        fpq fpqVar = this.p;
        if (!(fpqVar instanceof fpn)) {
            return;
        }
        throw null;
    }

    @Override // defpackage.flu
    public final boolean g(flv flvVar) {
        return l(flvVar, true);
    }

    @Override // defpackage.flu
    public final int i(flv flvVar, vtk vtkVar) {
        dzg.h(this.g);
        int i = eul.a;
        int a = a(flvVar);
        if (a == -1 && (this.p instanceof fpn)) {
            if (this.p.a() != b(this.l)) {
                throw null;
            }
        }
        return a;
    }

    public fpp(byte[] bArr) {
        this.b = new euf(10);
        this.c = new fmf();
        this.d = new fmc();
        this.k = -9223372036854775807L;
        this.q = new efu((short[]) null);
        flr flrVar = new flr();
        this.e = flrVar;
        this.h = flrVar;
        this.n = -1L;
    }

    @Override // defpackage.flu
    public final /* synthetic */ void h() {
    }
}
