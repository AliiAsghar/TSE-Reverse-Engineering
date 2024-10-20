package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aokd {
    public static final aqrq a = new aqrq("com.google.frameworks.client.data.android.auth.AuthContext", null);
    public final String b;
    public final String c;

    public aokd() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aokd) {
            aokd aokdVar = (aokd) obj;
            String str = this.b;
            if (str != null ? str.equals(aokdVar.b) : aokdVar.b == null) {
                if (this.c.equals(aokdVar.c)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        String str = this.b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return ((hashCode ^ 1000003) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        return "AuthContext{identifier=" + this.b + ", type=" + this.c + "}";
    }

    public aokd(String str, String str2) {
        this.b = str;
        if (str2 == null) {
            throw new NullPointerException("Null type");
        }
        this.c = str2;
    }
}
