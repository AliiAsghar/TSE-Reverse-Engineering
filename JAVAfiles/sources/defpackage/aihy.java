package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aihy {
    public final String a;
    public final apiq b;
    public final String c;
    public final long d;
    public final boolean e;

    public aihy() {
        throw null;
    }

    public static aihy a(aihy aihyVar) {
        return new aihy(aihyVar.a, aihyVar.b, aihyVar.c, aihyVar.d, true);
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof aihy) {
            aihy aihyVar = (aihy) obj;
            if (this.a.equals(aihyVar.a) && this.b.equals(aihyVar.b) && ((str = this.c) != null ? str.equals(aihyVar.c) : aihyVar.c == null) && this.d == aihyVar.d && this.e == aihyVar.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i;
        int hashCode2 = ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
        String str = this.c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = ((hashCode2 * 1000003) ^ hashCode) * 1000003;
        long j = this.d;
        int i3 = (i2 ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        if (true != this.e) {
            i = 1237;
        } else {
            i = 1231;
        }
        return i3 ^ i;
    }

    public final String toString() {
        return "LoggableQuery{target=" + this.a + ", type=" + this.b.toString() + ", dnsServer=" + this.c + ", queryTimeMillis=" + this.d + ", isFallbackAttempt=" + this.e + "}";
    }

    public aihy(String str, apiq apiqVar, String str2, long j, boolean z) {
        this.a = str;
        if (apiqVar == null) {
            throw new NullPointerException("Null type");
        }
        this.b = apiqVar;
        this.c = str2;
        this.d = j;
        this.e = z;
    }
}
