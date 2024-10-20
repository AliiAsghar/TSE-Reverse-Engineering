package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class uha {
    public final msh a;
    public final String b;
    public final long c;
    public final String d;
    public final String e;

    public uha() {
        throw null;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof uha) {
            uha uhaVar = (uha) obj;
            if (this.a.equals(uhaVar.a) && ((str = this.b) != null ? str.equals(uhaVar.b) : uhaVar.b == null) && this.c == uhaVar.c && ((str2 = this.d) != null ? str2.equals(uhaVar.d) : uhaVar.d == null) && this.e.equals(uhaVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.a.hashCode() ^ 1000003;
        String str = this.b;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        long j = this.c;
        int i2 = ((((hashCode2 * 1000003) ^ hashCode) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        String str2 = this.d;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return ((i2 ^ i) * 1000003) ^ this.e.hashCode();
    }

    public final String toString() {
        return "MatchingContactData{messagingIdentity=" + String.valueOf(this.a) + ", displayName=" + this.b + ", contactId=" + this.c + ", photoUri=" + this.d + ", lookupKey=" + this.e + "}";
    }

    public uha(msh mshVar, String str, long j, String str2, String str3) {
        this.a = mshVar;
        this.b = str;
        this.c = j;
        this.d = str2;
        this.e = str3;
    }
}
