package defpackage;

import androidx.compose.ui.graphics.BlockGraphicsLayerElement;
import androidx.compose.ui.graphics.GraphicsLayerElement;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cld {
    public static final cga a(cga cgaVar, arqr arqrVar) {
        return cgaVar.a(new BlockGraphicsLayerElement(arqrVar));
    }

    public static /* synthetic */ cga b(cga cgaVar, float f, float f2, float f3, float f4, float f5, float f6, float f7, cmb cmbVar, boolean z, int i, int i2) {
        long j;
        cmb cmbVar2;
        boolean z2;
        long j2;
        float f8;
        float f9;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        long j3 = 0;
        if ((i2 & 1024) != 0) {
            j = cmg.a;
        } else {
            j = 0;
        }
        if ((i2 & 2048) != 0) {
            cmbVar2 = clw.a;
        } else {
            cmbVar2 = cmbVar;
        }
        int i3 = 0;
        if ((i2 & 4096) != 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        boolean z3 = z2 & z;
        if ((i2 & 16384) != 0) {
            j2 = clf.a;
        } else {
            j2 = 0;
        }
        if ((32768 & i2) != 0) {
            j3 = clf.a;
        }
        long j4 = j3;
        if ((65536 & i2) == 0) {
            i3 = 1;
        }
        int i4 = i3 & i;
        int i5 = i2 & 256;
        int i6 = i2 & 32;
        int i7 = i2 & 16;
        int i8 = i2 & 8;
        int i9 = i2 & 4;
        int i10 = i2 & 2;
        int i11 = i2 & 1;
        if ((i2 & 512) != 0) {
            f8 = 8.0f;
        } else {
            f8 = 0.0f;
        }
        if (i5 != 0) {
            f9 = 0.0f;
        } else {
            f9 = f7;
        }
        if (i6 != 0) {
            f10 = 0.0f;
        } else {
            f10 = f6;
        }
        if (i7 != 0) {
            f11 = 0.0f;
        } else {
            f11 = f5;
        }
        if (i8 != 0) {
            f12 = 0.0f;
        } else {
            f12 = f4;
        }
        if (i9 != 0) {
            f13 = 1.0f;
        } else {
            f13 = f3;
        }
        if (i10 != 0) {
            f14 = 1.0f;
        } else {
            f14 = f2;
        }
        if (1 == i11) {
            f15 = 1.0f;
        } else {
            f15 = f;
        }
        return cgaVar.a(new GraphicsLayerElement(f15, f14, f13, f12, f11, f10, f9, f8, j, cmbVar2, z3, j2, j4, i4));
    }
}
