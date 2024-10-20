package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fgg implements fhx {
    private final alog a;
    private long b;

    public fgg(List list, List list2) {
        boolean z;
        alob alobVar = new alob();
        if (list.size() == list2.size()) {
            z = true;
        } else {
            z = false;
        }
        d.s(z);
        for (int i = 0; i < list.size(); i++) {
            alobVar.h(new fgf((fhx) list.get(i), (List) list2.get(i)));
        }
        this.a = alobVar.g();
        this.b = -9223372036854775807L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.fhx
    public final long d() {
        int i = 0;
        long j = Long.MAX_VALUE;
        long j2 = Long.MAX_VALUE;
        while (true) {
            alog alogVar = this.a;
            if (i >= ((alsx) alogVar).c) {
                break;
            }
            fgf fgfVar = (fgf) alogVar.get(i);
            long d = fgfVar.d();
            if ((fgfVar.a.contains(1) || fgfVar.a.contains(2) || fgfVar.a.contains(4)) && d != Long.MIN_VALUE) {
                j = Math.min(j, d);
            }
            if (d != Long.MIN_VALUE) {
                j2 = Math.min(j2, d);
            }
            i++;
        }
        if (j != Long.MAX_VALUE) {
            this.b = j;
            return j;
        }
        if (j2 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        long j3 = this.b;
        if (j3 != -9223372036854775807L) {
            return j3;
        }
        return j2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.fhx
    public final long e() {
        int i = 0;
        long j = Long.MAX_VALUE;
        while (true) {
            alog alogVar = this.a;
            if (i >= ((alsx) alogVar).c) {
                break;
            }
            long e = ((fgf) alogVar.get(i)).e();
            if (e != Long.MIN_VALUE) {
                j = Math.min(j, e);
            }
            i++;
        }
        if (j == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.fhx
    public final void l(long j) {
        int i = 0;
        while (true) {
            alog alogVar = this.a;
            if (i < ((alsx) alogVar).c) {
                ((fgf) alogVar.get(i)).l(j);
                i++;
            } else {
                return;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.fhx
    public final boolean n(fam famVar) {
        boolean z;
        boolean z2;
        boolean z3 = false;
        do {
            long e = e();
            if (e == Long.MIN_VALUE) {
                break;
            }
            int i = 0;
            z = false;
            while (true) {
                alog alogVar = this.a;
                if (i >= ((alsx) alogVar).c) {
                    break;
                }
                long e2 = ((fgf) alogVar.get(i)).e();
                if (e2 != Long.MIN_VALUE && e2 <= famVar.a) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (e2 == e || z2) {
                    z |= ((fgf) this.a.get(i)).n(famVar);
                }
                i++;
            }
            z3 |= z;
        } while (z);
        return z3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.fhx
    public final boolean o() {
        int i = 0;
        while (true) {
            alog alogVar = this.a;
            if (i >= ((alsx) alogVar).c) {
                return false;
            }
            if (((fgf) alogVar.get(i)).o()) {
                return true;
            }
            i++;
        }
    }
}
