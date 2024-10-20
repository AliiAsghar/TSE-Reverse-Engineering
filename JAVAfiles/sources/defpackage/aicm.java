package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aicm {
    public final String a;
    public final int b;
    public final int c;

    public aicm() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aicm) {
            aicm aicmVar = (aicm) obj;
            if (this.a.equals(aicmVar.a) && this.b == aicmVar.b) {
                int i = this.c;
                int i2 = aicmVar.c;
                if (i != 0) {
                    if (i2 == 1) {
                        return true;
                    }
                } else {
                    throw null;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() ^ 1000003;
        a.aS(this.c);
        return (((hashCode * 1000003) ^ this.b) * 1000003) ^ 1;
    }

    public final String toString() {
        String str;
        if (this.c != 1) {
            str = "null";
        } else {
            str = "PROGRAMMATIC_API";
        }
        int i = this.b;
        return "ClientProfile{packageName=" + this.a + ", versionCode=" + i + ", requestSource=" + str + "}";
    }

    public aicm(String str, int i) {
        this.a = str;
        this.b = i;
        this.c = 1;
    }
}
