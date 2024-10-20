package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class btf {
    public static final int a(cvc cvcVar) {
        if (cvcVar != null) {
            return cvcVar.b;
        }
        return 0;
    }

    public static final int b(cvc cvcVar) {
        if (cvcVar != null) {
            return cvcVar.a;
        }
        return 0;
    }

    public static final int c(int i, int i2) {
        if (i == Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }
        return i - i2;
    }

    public static final Object d(ctc ctcVar) {
        ctm ctmVar;
        Object f = ctcVar.f();
        if (f instanceof ctm) {
            ctmVar = (ctm) f;
        } else {
            ctmVar = null;
        }
        if (ctmVar == null) {
            return null;
        }
        return ctmVar.b();
    }
}
