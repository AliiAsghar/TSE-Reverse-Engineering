package defpackage;

import java.security.spec.ECParameterSpec;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class anye {
    public static final anye a = new anye("NIST_P256", ansx.a);
    public static final anye b = new anye("NIST_P384", ansx.b);
    public static final anye c = new anye("NIST_P521", ansx.c);
    public final String d;
    public final ECParameterSpec e;

    private anye(String str, ECParameterSpec eCParameterSpec) {
        this.d = str;
        this.e = eCParameterSpec;
    }

    public final String toString() {
        return this.d;
    }
}
