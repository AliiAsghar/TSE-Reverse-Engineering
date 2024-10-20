package defpackage;

import androidx.compose.ui.draw.ShadowGraphicsLayerElement;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class chw {
    public static /* synthetic */ cga a(cga cgaVar, float f, cmb cmbVar, long j, long j2, int i) {
        if ((i & 2) != 0) {
            cmbVar = clw.a;
        }
        cmb cmbVar2 = cmbVar;
        boolean z = false;
        if ((i & 4) != 0 && Float.compare(f, brg.a) > 0) {
            z = true;
        }
        if ((i & 8) != 0) {
            j = clf.a;
        }
        long j3 = j;
        if ((i & 16) != 0) {
            j2 = clf.a;
        }
        long j4 = j2;
        if (Float.compare(f, brg.a) <= 0) {
            if (z) {
                z = true;
            } else {
                return cgaVar;
            }
        }
        return cgaVar.a(new ShadowGraphicsLayerElement(f, cmbVar2, z, j3, j4));
    }
}
