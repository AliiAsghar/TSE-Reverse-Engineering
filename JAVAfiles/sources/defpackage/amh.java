package defpackage;

import androidx.compose.foundation.layout.PaddingElement;
import androidx.compose.foundation.layout.PaddingValuesElement;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class amh {
    public static final float a(amj amjVar, drk drkVar) {
        if (drkVar == drk.a) {
            return amjVar.c(drkVar);
        }
        return amjVar.b(drkVar);
    }

    public static final float b(amj amjVar, drk drkVar) {
        if (drkVar == drk.a) {
            return amjVar.b(drkVar);
        }
        return amjVar.c(drkVar);
    }

    public static final cga c(cga cgaVar, amj amjVar) {
        return cgaVar.a(new PaddingValuesElement(amjVar));
    }

    public static final cga d(cga cgaVar, float f) {
        return cgaVar.a(new PaddingElement(f, f, f, f));
    }

    public static final cga e(cga cgaVar, float f, float f2) {
        return cgaVar.a(new PaddingElement(f, f2, f, f2));
    }

    public static final cga f(cga cgaVar, float f, float f2, float f3, float f4) {
        return cgaVar.a(new PaddingElement(f, f2, f3, f4));
    }

    public static /* synthetic */ amj g(float f, float f2, int i) {
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        if (1 == (i & 1)) {
            f = 0.0f;
        }
        return new amk(f, f2, f, f2);
    }

    public static /* synthetic */ amj h(float f, float f2, float f3, float f4, int i) {
        if ((i & 8) != 0) {
            f4 = 0.0f;
        }
        if ((i & 4) != 0) {
            f3 = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        if (1 == (i & 1)) {
            f = 0.0f;
        }
        return new amk(f, f2, f3, f4);
    }

    public static /* synthetic */ cga i(cga cgaVar, float f, float f2, int i) {
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        if (1 == (i & 1)) {
            f = 0.0f;
        }
        return e(cgaVar, f, f2);
    }

    public static /* synthetic */ cga j(cga cgaVar, float f, float f2, float f3, float f4, int i) {
        if ((i & 8) != 0) {
            f4 = 0.0f;
        }
        if ((i & 4) != 0) {
            f3 = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        if (1 == (i & 1)) {
            f = 0.0f;
        }
        return f(cgaVar, f, f2, f3, f4);
    }
}
