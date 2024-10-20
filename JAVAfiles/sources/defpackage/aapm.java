package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aapm {
    public final String a;
    public final int b;
    public final String c;

    public aapm() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aapm) {
            aapm aapmVar = (aapm) obj;
            String str = this.a;
            if (str != null ? str.equals(aapmVar.a) : aapmVar.a == null) {
                if (this.b == aapmVar.b) {
                    String str2 = this.c;
                    String str3 = aapmVar.c;
                    if (str2 != null ? str2.equals(str3) : str3 == null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        String str = this.a;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = this.b;
        String str2 = this.c;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return ((((hashCode ^ 1000003) * 1000003) ^ i2) * 1000003) ^ i;
    }

    public final String toString() {
        return "Detail{content=" + this.a + ", type=" + this.b + ", customLabel=" + this.c + "}";
    }

    public aapm(String str, int i, String str2) {
        this.a = str;
        this.b = i;
        this.c = str2;
    }
}
