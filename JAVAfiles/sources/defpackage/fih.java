package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fih implements fig {
    public static final /* synthetic */ int a = 0;
    private static final alsr b = new almk(new allq(new ezr(5), also.a), new allq(new ezr(6), alti.a));
    private final List c = new ArrayList();

    @Override // defpackage.fig
    public final long a(long j) {
        int i = 0;
        long j2 = -9223372036854775807L;
        while (true) {
            if (i >= this.c.size()) {
                break;
            }
            long j3 = ((xab) this.c.get(i)).c;
            long j4 = ((xab) this.c.get(i)).a;
            if (j < j3) {
                if (j2 != -9223372036854775807L) {
                    j2 = Math.min(j2, j3);
                } else {
                    j2 = j3;
                }
            } else {
                if (j < j4) {
                    if (j2 == -9223372036854775807L) {
                        j2 = j4;
                    } else {
                        j2 = Math.min(j2, j4);
                    }
                }
                i++;
            }
        }
        if (j2 != -9223372036854775807L) {
            return j2;
        }
        return Long.MIN_VALUE;
    }

    @Override // defpackage.fig
    public final long b(long j) {
        if (!this.c.isEmpty()) {
            if (j >= ((xab) this.c.get(0)).c) {
                long j2 = ((xab) this.c.get(0)).c;
                for (int i = 0; i < this.c.size(); i++) {
                    long j3 = ((xab) this.c.get(i)).c;
                    long j4 = ((xab) this.c.get(i)).a;
                    if (j4 <= j) {
                        j2 = Math.max(j2, j4);
                    } else {
                        if (j3 > j) {
                            break;
                        }
                        j2 = Math.max(j2, j3);
                    }
                }
                return j2;
            }
            return -9223372036854775807L;
        }
        return -9223372036854775807L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, java.lang.Iterable] */
    @Override // defpackage.fig
    public final alog c(long j) {
        if (!this.c.isEmpty()) {
            if (j >= ((xab) this.c.get(0)).c) {
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < this.c.size(); i++) {
                    xab xabVar = (xab) this.c.get(i);
                    if (j >= xabVar.c && j < xabVar.a) {
                        arrayList.add(xabVar);
                    }
                    if (j < xabVar.c) {
                        break;
                    }
                }
                alog E = alog.E(b, arrayList);
                alob alobVar = new alob();
                for (int i2 = 0; i2 < ((alsx) E).c; i2++) {
                    alobVar.j(((xab) E.get(i2)).d);
                }
                return alobVar.g();
            }
        }
        int i3 = alog.d;
        return alsx.a;
    }

    @Override // defpackage.fig
    public final void d() {
        this.c.clear();
    }

    @Override // defpackage.fig
    public final void e(long j) {
        int i = 0;
        while (i < this.c.size()) {
            long j2 = ((xab) this.c.get(i)).c;
            if (j > j2 && j > ((xab) this.c.get(i)).a) {
                this.c.remove(i);
                i--;
            } else if (j < j2) {
                return;
            }
            i++;
        }
    }

    @Override // defpackage.fig
    public final boolean f(xab xabVar, long j) {
        boolean z;
        boolean z2;
        boolean z3;
        if (xabVar.c != -9223372036854775807L) {
            z = true;
        } else {
            z = false;
        }
        d.s(z);
        if (xabVar.b != -9223372036854775807L) {
            z2 = true;
        } else {
            z2 = false;
        }
        d.s(z2);
        if (xabVar.c <= j && j < xabVar.a) {
            z3 = true;
        } else {
            z3 = false;
        }
        int size = this.c.size();
        do {
            size--;
            if (size < 0) {
                this.c.add(0, xabVar);
                return z3;
            }
        } while (xabVar.c < ((xab) this.c.get(size)).c);
        this.c.add(size + 1, xabVar);
        return z3;
    }
}
