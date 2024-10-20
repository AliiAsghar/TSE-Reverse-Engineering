package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class ato implements cpz {
    private final avc a;
    private final ahp b;

    public ato(avc avcVar, ahp ahpVar) {
        this.a = avcVar;
        this.b = ahpVar;
    }

    @Override // defpackage.cpz
    public final long a(long j, long j2, int i) {
        long j3;
        if (a.bA(i, 2)) {
            if (this.b == ahp.b) {
                j3 = j2 >> 32;
            } else {
                j3 = 4294967295L & j2;
            }
            if (Float.intBitsToFloat((int) j3) != brg.a) {
                throw new CancellationException("Scroll cancelled");
            }
            return 0L;
        }
        return 0L;
    }

    @Override // defpackage.cpz
    public final long b(long j, int i) {
        long j2;
        float f;
        float intBitsToFloat;
        if (a.bA(i, 1) && Math.abs(this.a.c()) > 1.0E-6d) {
            float c = this.a.c() * r11.k();
            int c2 = this.a.p().c() + this.a.p().d();
            float f2 = -Math.signum(this.a.c());
            avc avcVar = this.a;
            ahp ahpVar = this.b;
            float c3 = avcVar.c();
            if (ahpVar == ahp.b) {
                j2 = j >> 32;
            } else {
                j2 = j & 4294967295L;
            }
            float intBitsToFloat2 = Float.intBitsToFloat((int) j2);
            float f3 = (c2 * f2) + c;
            if (c3 > brg.a) {
                f = f3;
            } else {
                f = c;
            }
            if (c3 <= brg.a) {
                c = f3;
            }
            float f4 = -this.a.a(-arrn.q(intBitsToFloat2, f, c));
            if (this.b == ahp.b) {
                intBitsToFloat = f4;
            } else {
                intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
            }
            if (this.b != ahp.a) {
                f4 = Float.intBitsToFloat((int) (j & 4294967295L));
            }
            return cjn.g(intBitsToFloat, f4);
        }
        return 0L;
    }

    @Override // defpackage.cpz
    public final Object c(long j, long j2, arpe arpeVar) {
        long e;
        if (this.b == ahp.a) {
            e = drp.e(j2, brg.a, brg.a, 2);
        } else {
            e = drp.e(j2, brg.a, brg.a, 1);
        }
        return new drp(e);
    }

    @Override // defpackage.cpz
    public final /* synthetic */ Object d(long j, arpe arpeVar) {
        return new drp(0L);
    }
}
