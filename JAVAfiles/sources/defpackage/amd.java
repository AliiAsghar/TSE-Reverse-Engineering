package defpackage;

import androidx.compose.foundation.layout.OffsetElement;
import androidx.compose.foundation.layout.OffsetPxElement;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class amd {
    public static final cga a(cga cgaVar, arqr arqrVar) {
        return cgaVar.a(new OffsetPxElement(arqrVar));
    }

    public static final cga b(cga cgaVar, float f, float f2) {
        return cgaVar.a(new OffsetElement(f, f2));
    }

    public static /* synthetic */ cga c(cga cgaVar, float f, float f2, int i) {
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        if (1 == (i & 1)) {
            f = 0.0f;
        }
        return b(cgaVar, f, f2);
    }
}
