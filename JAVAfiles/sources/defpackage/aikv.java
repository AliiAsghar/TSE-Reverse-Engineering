package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aikv {
    public String a;
    public int b;

    public aikv() {
        this.b = 1;
    }

    public static boolean a(String str) {
        if (str.charAt(0) != '[' || str.charAt(str.length() - 1) != ']') {
            return false;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof aikv)) {
            return d.B(this.a, ((aikv) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public aikv(String str) {
        if (str != null) {
            this.a = str;
            this.b = str.indexOf(58) != -1 ? 3 : 2;
            return;
        }
        throw new IllegalArgumentException("null host name");
    }
}
