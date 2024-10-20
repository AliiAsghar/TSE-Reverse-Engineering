package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bmb {
    public static final /* synthetic */ int a = 0;

    static {
        int i = bvy.a;
        bvg bvgVar = bvk.a;
        int i2 = bux.a;
        int i3 = buv.a;
        int i4 = bvx.a;
    }

    public static final bma a(blh blhVar, cku ckuVar) {
        long b;
        long f;
        bma bmaVar = blhVar.R;
        if (bmaVar == null) {
            long j = cku.g;
            if (ckuVar != null) {
                b = ckuVar.i;
            } else {
                buo buoVar = bvm.a;
                b = bli.b(blhVar, bvm.c);
            }
            long j2 = cku.g;
            if (ckuVar != null) {
                buo buoVar2 = bvm.a;
                f = ckw.f(cku.d(r8), cku.c(r8), cku.b(r8), bvm.b, cku.f(ckuVar.i));
            } else {
                buo buoVar3 = bvm.a;
                f = ckw.f(cku.d(r8), cku.c(r8), cku.b(r8), bvm.b, cku.f(bli.b(blhVar, bvm.a)));
            }
            bmaVar = new bma(j, b, j2, f);
            blhVar.R = bmaVar;
        }
        return bmaVar;
    }

    public static /* synthetic */ long b() {
        float f;
        float f2;
        float f3;
        if (a.bA(1, 0)) {
            bvg bvgVar = bvk.a;
            f2 = bvk.c;
            f3 = bvk.d;
        } else {
            if (a.bA(1, 1)) {
                bvg bvgVar2 = bvk.a;
                float f4 = bvk.e;
                f = f4 + f4;
            } else if (a.bA(1, 2)) {
                bvg bvgVar3 = bvk.a;
                f2 = bvk.f;
                f3 = bvk.g;
            } else {
                f = brg.a;
            }
            bvg bvgVar4 = bvk.a;
            return a.z(bvk.b + f, 40.0f);
        }
        f = f2 + f3;
        bvg bvgVar42 = bvk.a;
        return a.z(bvk.b + f, 40.0f);
    }

    public static final bma c(long j, long j2, long j3, long j4, bwj bwjVar, int i) {
        long j5;
        long j6;
        long j7;
        if ((i & 1) != 0) {
            j5 = cku.h;
        } else {
            j5 = j;
        }
        if ((i & 2) != 0) {
            j6 = cku.h;
        } else {
            j6 = j2;
        }
        if ((i & 4) != 0) {
            j7 = cku.h;
        } else {
            j7 = j3;
        }
        return a(bmp.a(bwjVar), null).c(j5, j6, j7, j4);
    }
}
