package defpackage;

import androidx.compose.foundation.BorderModifierNodeElement;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adl {
    public static final long a(long j, float f) {
        float max = Math.max(brg.a, Float.intBitsToFloat((int) (j >> 32)) - f);
        float max2 = Math.max(brg.a, Float.intBitsToFloat((int) (j & 4294967295L)) - f);
        return (Float.floatToRawIntBits(max) << 32) | (Float.floatToRawIntBits(max2) & 4294967295L);
    }

    public static final cga b(cga cgaVar, adr adrVar, cmb cmbVar) {
        return d(cgaVar, adrVar.a, adrVar.b, cmbVar);
    }

    public static final cga c(cga cgaVar, float f, long j, cmb cmbVar) {
        return d(cgaVar, f, new cmd(j), cmbVar);
    }

    public static final cga d(cga cgaVar, float f, cko ckoVar, cmb cmbVar) {
        return cgaVar.a(new BorderModifierNodeElement(f, ckoVar, cmbVar));
    }
}
