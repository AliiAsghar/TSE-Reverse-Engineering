package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zlo {
    public final String a;
    public final msh b;
    public final String c;
    public final int d;
    public final int e;

    public zlo() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zlo) {
            zlo zloVar = (zlo) obj;
            String str = this.a;
            if (str != null ? str.equals(zloVar.a) : zloVar.a == null) {
                msh mshVar = this.b;
                if (mshVar != null ? mshVar.equals(zloVar.b) : zloVar.b == null) {
                    String str2 = this.c;
                    if (str2 != null ? str2.equals(zloVar.c) : zloVar.c == null) {
                        if (this.d == zloVar.d && this.e == zloVar.e) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        String str = this.a;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        msh mshVar = this.b;
        if (mshVar == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = mshVar.hashCode();
        }
        int i2 = hashCode ^ 1000003;
        String str2 = this.c;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return (((((((i2 * 1000003) ^ hashCode2) * 1000003) ^ i) * 1000003) ^ this.d) * 1000003) ^ this.e;
    }

    public final String toString() {
        return "SimMessagesData{message=" + this.a + ", sender=" + String.valueOf(this.b) + ", timestampText=" + this.c + ", index=" + this.d + ", id=" + this.e + "}";
    }

    public zlo(String str, msh mshVar, String str2, int i, int i2) {
        this.a = str;
        this.b = mshVar;
        this.c = str2;
        this.d = i;
        this.e = i2;
    }
}
