package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahka {
    public final String a;

    public ahka(String str) {
        this.a = str;
    }

    public static ahka a(ahka ahkaVar, ahka... ahkaVarArr) {
        return new ahka(String.valueOf(ahkaVar.a).concat(new algs("").d(alzz.as(Arrays.asList(ahkaVarArr), new abes(19)))));
    }

    public static ahka b(Class cls) {
        if (!albo.ah(null)) {
            return new ahka("null".concat(String.valueOf(cls.getSimpleName())));
        }
        return new ahka(cls.getSimpleName());
    }

    public static ahka c(String str, Enum r2) {
        if (!albo.ah(str)) {
            return new ahka(str.concat(String.valueOf(r2.name())));
        }
        return new ahka(r2.name());
    }

    public static String d(ahka ahkaVar) {
        if (ahkaVar == null) {
            return null;
        }
        return ahkaVar.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ahka) {
            return this.a.equals(((ahka) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a;
    }
}
