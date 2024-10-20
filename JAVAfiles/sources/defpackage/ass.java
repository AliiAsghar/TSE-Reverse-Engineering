package defpackage;

import androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsModifier;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ass {
    public static final float a(int i, int i2, boolean z) {
        float b = b(i, i2);
        if (z) {
            return b + 100.0f;
        }
        return b;
    }

    public static final float b(int i, int i2) {
        return i2 + (i * 500);
    }

    public static final cga c(cga cgaVar, arqg arqgVar, asr asrVar, ahp ahpVar, boolean z, boolean z2) {
        return cgaVar.a(new LazyLayoutSemanticsModifier(arqgVar, asrVar, ahpVar, z, z2));
    }
}
