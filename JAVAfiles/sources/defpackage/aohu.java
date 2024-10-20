package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aohu {
    public final String a;
    public final String b;
    public final String c;
    public final long d;
    public final long e;
    public final String f;
    public final int g;

    static {
        a().a();
    }

    public aohu() {
        throw null;
    }

    public static aoht a() {
        aoht aohtVar = new aoht();
        aohtVar.d(0L);
        aohtVar.c(1);
        aohtVar.b(0L);
        return aohtVar;
    }

    public final boolean b() {
        if (this.g == 5) {
            return true;
        }
        return false;
    }

    public final boolean c() {
        int i = this.g;
        if (i == 2 || i == 1) {
            return true;
        }
        return false;
    }

    public final boolean d() {
        if (this.g == 4) {
            return true;
        }
        return false;
    }

    public final boolean e() {
        if (this.g == 3) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof aohu) {
            aohu aohuVar = (aohu) obj;
            String str3 = this.a;
            if (str3 != null ? str3.equals(aohuVar.a) : aohuVar.a == null) {
                int i = this.g;
                int i2 = aohuVar.g;
                if (i != 0) {
                    if (i == i2 && ((str = this.b) != null ? str.equals(aohuVar.b) : aohuVar.b == null) && ((str2 = this.c) != null ? str2.equals(aohuVar.c) : aohuVar.c == null) && this.d == aohuVar.d && this.e == aohuVar.e) {
                        String str4 = this.f;
                        String str5 = aohuVar.f;
                        if (str4 != null ? str4.equals(str5) : str5 == null) {
                            return true;
                        }
                    }
                } else {
                    throw null;
                }
            }
        }
        return false;
    }

    public final aohu f() {
        aoht aohtVar = new aoht(this);
        aohtVar.d = "BAD CONFIG";
        aohtVar.c(5);
        return aohtVar.a();
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        String str = this.a;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = this.g;
        a.aS(i2);
        String str2 = this.b;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = ((hashCode ^ 1000003) * 1000003) ^ i2;
        String str3 = this.c;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i4 = ((((i3 * 1000003) ^ hashCode2) * 1000003) ^ hashCode3) * 1000003;
        long j = this.d;
        int i5 = (i4 ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.e;
        int i6 = (i5 ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        String str4 = this.f;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return i6 ^ i;
    }

    public final String toString() {
        String str;
        int i = this.g;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            str = "null";
                        } else {
                            str = "REGISTER_ERROR";
                        }
                    } else {
                        str = "REGISTERED";
                    }
                } else {
                    str = "UNREGISTERED";
                }
            } else {
                str = "NOT_GENERATED";
            }
        } else {
            str = "ATTEMPT_MIGRATION";
        }
        return "PersistedInstallationEntry{firebaseInstallationId=" + this.a + ", registrationStatus=" + str + ", authToken=" + this.b + ", refreshToken=" + this.c + ", expiresInSecs=" + this.d + ", tokenCreationEpochInSecs=" + this.e + ", fisError=" + this.f + "}";
    }

    public aohu(String str, int i, String str2, String str3, long j, long j2, String str4) {
        this.a = str;
        this.g = i;
        this.b = str2;
        this.c = str3;
        this.d = j;
        this.e = j2;
        this.f = str4;
    }
}
