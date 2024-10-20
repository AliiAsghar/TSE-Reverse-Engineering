package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ffz extends fgk {
    private final long c;
    private final long d;
    private final long e;
    private final boolean f;

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0067, code lost:
    
        if (r1 == r8) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ffz(defpackage.erz r8, long r9, long r11) {
        /*
            r7 = this;
            r7.<init>(r8)
            int r11 = r8.b()
            r12 = 0
            r0 = 1
            if (r11 != r0) goto L6d
            ery r11 = new ery
            r11.<init>()
            ery r8 = r8.p(r12, r11)
            r1 = 0
            long r9 = java.lang.Math.max(r1, r9)
            boolean r11 = r8.k
            if (r11 != 0) goto L2d
            int r11 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r11 == 0) goto L2d
            boolean r11 = r8.h
            if (r11 == 0) goto L27
            goto L2d
        L27:
            fga r8 = new fga
            r8.<init>(r0)
            throw r8
        L2d:
            long r1 = r8.m
            long r3 = r8.m
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r11 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r11 == 0) goto L4b
            int r11 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r11 <= 0) goto L3f
            r1 = r3
        L3f:
            int r11 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r11 > 0) goto L44
            goto L4b
        L44:
            fga r8 = new fga
            r9 = 2
            r8.<init>(r9)
            throw r8
        L4b:
            r7.c = r9
            r7.d = r1
            int r11 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r11 != 0) goto L55
            r9 = r5
            goto L57
        L55:
            long r9 = r1 - r9
        L57:
            r7.e = r9
            boolean r9 = r8.i
            if (r9 == 0) goto L6a
            if (r11 == 0) goto L69
            long r8 = r8.m
            int r10 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r10 == 0) goto L6a
            int r8 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r8 != 0) goto L6a
        L69:
            r12 = r0
        L6a:
            r7.f = r12
            return
        L6d:
            fga r8 = new fga
            r8.<init>(r12)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ffz.<init>(erz, long, long):void");
    }

    @Override // defpackage.fgk, defpackage.erz
    public final erx d(int i, erx erxVar, boolean z) {
        long j;
        this.b.d(0, erxVar, z);
        long j2 = erxVar.e - this.c;
        long j3 = this.e;
        if (j3 == -9223372036854775807L) {
            j = -9223372036854775807L;
        } else {
            j = j3 - j2;
        }
        erxVar.m(erxVar.a, erxVar.b, j, j2);
        return erxVar;
    }

    @Override // defpackage.fgk, defpackage.erz
    public final ery e(int i, ery eryVar, long j) {
        this.b.e(0, eryVar, 0L);
        long j2 = eryVar.p;
        long j3 = this.c;
        eryVar.p = j2 + j3;
        eryVar.m = this.e;
        eryVar.i = this.f;
        long j4 = eryVar.l;
        if (j4 != -9223372036854775807L) {
            long max = Math.max(j4, j3);
            eryVar.l = max;
            long j5 = this.d;
            if (j5 != -9223372036854775807L) {
                max = Math.min(max, j5);
            }
            eryVar.l = max;
            eryVar.l = max - this.c;
        }
        long j6 = this.c;
        int i2 = eul.a;
        long j7 = eryVar.e;
        long z = eul.z(j6);
        if (j7 != -9223372036854775807L) {
            eryVar.e = j7 + z;
        }
        long j8 = eryVar.f;
        if (j8 != -9223372036854775807L) {
            eryVar.f = j8 + z;
        }
        return eryVar;
    }
}
