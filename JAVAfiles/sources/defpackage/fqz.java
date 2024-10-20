package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fqz implements frc {
    public static final /* synthetic */ int a = 0;
    private static final alsr b = new allq(new ezr(10), also.a);
    private final alog c;
    private final long[] d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c8 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public fqz(java.util.List r15) {
        /*
            r14 = this;
            r14.<init>()
            r0 = r15
            alsx r0 = (defpackage.alsx) r0
            int r0 = r0.c
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r3 = 0
            r4 = 1
            if (r0 != r4) goto L49
            java.lang.Object r15 = defpackage.alzz.aP(r15)
            xab r15 = (defpackage.xab) r15
            long r5 = r15.c
            long r5 = d(r5)
            long r7 = r15.b
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 != 0) goto L32
            java.lang.Object r15 = r15.d
            alog r15 = defpackage.alog.r(r15)
            r14.c = r15
            long[] r15 = new long[r4]
            r15[r3] = r5
            r14.d = r15
            return
        L32:
            java.lang.Object r0 = r15.d
            alog r1 = defpackage.alsx.a
            alog r0 = defpackage.alog.s(r0, r1)
            r14.c = r0
            long r0 = r15.b
            long r0 = r0 + r5
            r15 = 2
            long[] r15 = new long[r15]
            r15[r3] = r5
            r15[r4] = r0
            r14.d = r15
            return
        L49:
            int r0 = r0 + r0
            long[] r0 = new long[r0]
            r14.d = r0
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            java.util.Arrays.fill(r0, r4)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            alsr r4 = defpackage.fqz.b
            alog r15 = defpackage.alog.E(r4, r15)
            r4 = r3
        L62:
            r5 = r15
            alsx r5 = (defpackage.alsx) r5
            int r5 = r5.c
            if (r3 >= r5) goto Lcb
            java.lang.Object r5 = r15.get(r3)
            xab r5 = (defpackage.xab) r5
            long r6 = r5.c
            long r6 = d(r6)
            long r8 = r5.b
            long r8 = r8 + r6
            if (r4 == 0) goto Laa
            long[] r10 = r14.d
            int r11 = r4 + (-1)
            r12 = r10[r11]
            int r10 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1))
            if (r10 >= 0) goto L85
            goto Laa
        L85:
            if (r10 != 0) goto L99
            java.lang.Object r10 = r0.get(r11)
            alog r10 = (defpackage.alog) r10
            boolean r10 = r10.isEmpty()
            if (r10 == 0) goto L99
            java.lang.Object r6 = r5.d
            r0.set(r11, r6)
            goto Lb6
        L99:
            java.lang.String r10 = "CuesWithTimingSubtitle"
            java.lang.String r12 = "Truncating unsupported overlapping cues."
            defpackage.eub.f(r10, r12)
            long[] r10 = r14.d
            r10[r11] = r6
            java.lang.Object r6 = r5.d
            r0.set(r11, r6)
            goto Lb6
        Laa:
            long[] r10 = r14.d
            int r11 = r4 + 1
            r10[r4] = r6
            java.lang.Object r4 = r5.d
            r0.add(r4)
            r4 = r11
        Lb6:
            long r5 = r5.b
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 == 0) goto Lc8
            long[] r5 = r14.d
            int r6 = r4 + 1
            r5[r4] = r8
            alog r4 = defpackage.alsx.a
            r0.add(r4)
            r4 = r6
        Lc8:
            int r3 = r3 + 1
            goto L62
        Lcb:
            alog r15 = defpackage.alog.n(r0)
            r14.c = r15
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fqz.<init>(java.util.List):void");
    }

    public static long d(long j) {
        if (j == -9223372036854775807L) {
            return 0L;
        }
        return j;
    }

    @Override // defpackage.frc
    public final int a() {
        return this.c.size();
    }

    @Override // defpackage.frc
    public final int b(long j) {
        alog alogVar = this.c;
        int ah = eul.ah(this.d, j, false);
        if (ah < alogVar.size()) {
            return ah;
        }
        return -1;
    }

    @Override // defpackage.frc
    public final long c(int i) {
        boolean z;
        if (i < this.c.size()) {
            z = true;
        } else {
            z = false;
        }
        d.s(z);
        return this.d[i];
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.frc
    public final /* bridge */ /* synthetic */ List e(long j) {
        int ai = eul.ai(this.d, j, false);
        if (ai == -1) {
            int i = alog.d;
            return alsx.a;
        }
        return (alog) this.c.get(ai);
    }
}
