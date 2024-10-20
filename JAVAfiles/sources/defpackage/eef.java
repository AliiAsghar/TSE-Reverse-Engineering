package defpackage;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.WindowInsetsController;
import android.widget.EdgeEffect;
import java.io.EOFException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eef {
    public static efu a(View view) {
        WindowInsetsController windowInsetsController;
        windowInsetsController = view.getWindowInsetsController();
        if (windowInsetsController != null) {
            return new efu(windowInsetsController);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static CharSequence b(View view) {
        CharSequence stateDescription;
        stateDescription = view.getStateDescription();
        return stateDescription;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c(View view, CharSequence charSequence) {
        view.setStateDescription(charSequence);
    }

    public static float d(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return egp.a(edgeEffect);
        }
        return brg.a;
    }

    public static float e(EdgeEffect edgeEffect, float f, float f2) {
        if (Build.VERSION.SDK_INT >= 31) {
            return egp.b(edgeEffect, f, f2);
        }
        ego.a(edgeEffect, f, f2);
        return f;
    }

    public static EdgeEffect f(Context context, AttributeSet attributeSet) {
        if (Build.VERSION.SDK_INT >= 31) {
            return egp.c(context, attributeSet);
        }
        return new EdgeEffect(context);
    }

    public static int g(euf eufVar, int i) {
        switch (i) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i - 2);
            case 6:
                return eufVar.j() + 1;
            case 7:
                return eufVar.n() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (i - 8);
            default:
                return -1;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003d A[EDGE_INSN: B:10:0x003d->B:11:0x003d BREAK  A[LOOP:0: B:2:0x0001->B:9:0x003b], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003b A[LOOP:0: B:2:0x0001->B:9:0x003b, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int h(defpackage.flv r10, byte[] r11, int r12, int r13) {
        /*
            r0 = 0
        L1:
            if (r0 >= r13) goto L3d
            int r1 = r12 + r0
            int r5 = r13 - r0
            r8 = r10
            fln r8 = (defpackage.fln) r8
            r8.i(r5)
            int r2 = r8.f
            int r4 = r8.e
            int r2 = r2 - r4
            r9 = -1
            if (r2 != 0) goto L28
            byte[] r3 = r8.d
            r6 = 0
            r7 = 1
            r2 = r8
            int r2 = r2.b(r3, r4, r5, r6, r7)
            if (r2 != r9) goto L22
            r2 = r9
            goto L38
        L22:
            int r3 = r8.f
            int r3 = r3 + r2
            r8.f = r3
            goto L2c
        L28:
            int r2 = java.lang.Math.min(r5, r2)
        L2c:
            byte[] r3 = r8.d
            int r4 = r8.e
            java.lang.System.arraycopy(r3, r4, r11, r1, r2)
            int r1 = r8.e
            int r1 = r1 + r2
            r8.e = r1
        L38:
            if (r2 != r9) goto L3b
            goto L3d
        L3b:
            int r0 = r0 + r2
            goto L1
        L3d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eef.h(flv, byte[], int, int):int");
    }

    public static void i(boolean z, String str) {
        if (z) {
        } else {
            throw new erm(str, null, true, 1);
        }
    }

    public static boolean j(flv flvVar, byte[] bArr, int i, int i2) {
        try {
            flvVar.k(bArr, i, i2);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    public static boolean k(flv flvVar, int i) {
        try {
            flvVar.m(i);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    public static boolean l(flv flvVar, byte[] bArr, int i, boolean z) {
        try {
            return flvVar.o(bArr, 0, i, z);
        } catch (EOFException e) {
            if (z) {
                return false;
            }
            throw e;
        }
    }

    public static boolean m(euf eufVar, flz flzVar, boolean z, vtk vtkVar) {
        try {
            long t = eufVar.t();
            if (!z) {
                t *= flzVar.b;
            }
            vtkVar.a = t;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x007b, code lost:
    
        if (r3 != r22.f) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0088, code lost:
    
        if ((r21.j() * 1000) == r5) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0097, code lost:
    
        if (r4 == r5) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean n(defpackage.euf r21, defpackage.flz r22, int r23, defpackage.vtk r24) {
        /*
            Method dump skipped, instructions count: 184
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eef.n(euf, flz, int, vtk):boolean");
    }
}
