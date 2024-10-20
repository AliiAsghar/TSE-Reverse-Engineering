package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bey extends bck<bey> {
    private final doj e;
    private final baa f;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public bey(defpackage.doj r8, defpackage.dob r9, defpackage.baa r10, defpackage.bfn r11) {
        /*
            r7 = this;
            dhv r1 = r8.a
            long r2 = r8.b
            if (r10 == 0) goto L9
            diy r0 = r10.a
            goto La
        L9:
            r0 = 0
        La:
            r4 = r0
            r0 = r7
            r5 = r9
            r6 = r11
            r0.<init>(r1, r2, r4, r5, r6)
            r7.e = r8
            r7.f = r10
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bey.<init>(doj, dob, baa, bfn):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x000e, code lost:
    
        if (r0 == null) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int C(defpackage.baa r8, int r9) {
        /*
            r7 = this;
            cti r0 = r8.b
            if (r0 == 0) goto L10
            cti r1 = r8.c
            if (r1 == 0) goto Ld
            cjp r0 = defpackage.cth.a(r1, r0)
            goto Le
        Ld:
            r0 = 0
        Le:
            if (r0 != 0) goto L12
        L10:
            cjp r0 = defpackage.cjp.a
        L12:
            dob r1 = r7.a
            doj r2 = r7.e
            diy r3 = r8.a
            long r4 = r2.b
            int r2 = defpackage.djc.a(r4)
            int r1 = r1.a(r2)
            cjp r1 = r3.m(r1)
            float r2 = r1.b
            float r1 = r1.c
            long r3 = r0.b()
            r5 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r3 = r3 & r5
            float r9 = (float) r9
            int r0 = (int) r3
            float r0 = java.lang.Float.intBitsToFloat(r0)
            float r0 = r0 * r9
            dob r9 = r7.a
            diy r8 = r8.a
            int r2 = java.lang.Float.floatToRawIntBits(r2)
            long r2 = (long) r2
            float r1 = r1 + r0
            int r0 = java.lang.Float.floatToRawIntBits(r1)
            long r0 = (long) r0
            r4 = 32
            long r2 = r2 << r4
            long r0 = r0 & r5
            long r0 = r0 | r2
            int r8 = r8.j(r0)
            int r8 = r9.b(r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bey.C(baa, int):int");
    }

    public final void A() {
        baa baaVar;
        if (g().length() > 0 && (baaVar = this.f) != null) {
            int C = C(baaVar, 1);
            h(C, C);
        }
    }

    public final void B() {
        baa baaVar;
        if (g().length() > 0 && (baaVar = this.f) != null) {
            int C = C(baaVar, -1);
            h(C, C);
        }
    }

    public final doj y() {
        return doj.b(this.e, this.d, this.c, 4);
    }

    public final List z(arqr arqrVar) {
        if (djc.h(this.c)) {
            dnd dndVar = (dnd) arqrVar.a(this);
            if (dndVar == null) {
                return null;
            }
            return aqjn.y(dndVar);
        }
        return aqjn.B(new dmw("", 0), new doi(djc.d(this.c), djc.d(this.c)));
    }
}
