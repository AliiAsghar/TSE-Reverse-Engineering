package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rhd {
    public final atok a;
    public final rve b;
    public final asgt c;
    public final apct d;
    public final int e;
    public final int f;
    public final int g;

    public rhd() {
        throw null;
    }

    public final boolean equals(Object obj) {
        asgt asgtVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof rhd) {
            rhd rhdVar = (rhd) obj;
            atok atokVar = this.a;
            if (atokVar != null ? atokVar.equals(rhdVar.a) : rhdVar.a == null) {
                rve rveVar = this.b;
                if (rveVar != null ? rveVar.equals(rhdVar.b) : rhdVar.b == null) {
                    int i = this.e;
                    int i2 = rhdVar.e;
                    if (i != 0) {
                        if (i == i2) {
                            int i3 = this.f;
                            int i4 = rhdVar.f;
                            if (i3 != 0) {
                                if (i3 == i4) {
                                    int i5 = this.g;
                                    int i6 = rhdVar.g;
                                    if (i5 != 0) {
                                        if (i5 == i6 && ((asgtVar = this.c) != null ? asgtVar.equals(rhdVar.c) : rhdVar.c == null)) {
                                            apct apctVar = this.d;
                                            apct apctVar2 = rhdVar.d;
                                            if (apctVar != null ? apctVar.equals(apctVar2) : apctVar2 == null) {
                                                return true;
                                            }
                                        }
                                    } else {
                                        throw null;
                                    }
                                }
                            } else {
                                throw null;
                            }
                        }
                    } else {
                        throw null;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        atok atokVar = this.a;
        int i = 0;
        if (atokVar == null) {
            hashCode = 0;
        } else {
            hashCode = atokVar.hashCode();
        }
        rve rveVar = this.b;
        if (rveVar == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = rveVar.hashCode();
        }
        int i2 = hashCode ^ 1000003;
        int i3 = this.e;
        a.bm(i3);
        int i4 = this.f;
        a.bm(i4);
        int i5 = this.g;
        a.bm(i5);
        asgt asgtVar = this.c;
        if (asgtVar == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = asgtVar.hashCode();
        }
        int i6 = ((((((((((i2 * 1000003) ^ hashCode2) * 1000003) ^ i3) * 1000003) ^ i4) * 1000003) ^ i5) * 1000003) ^ hashCode3) * 1000003;
        apct apctVar = this.d;
        if (apctVar != null) {
            i = apctVar.hashCode();
        }
        return i6 ^ i;
    }

    public final String toString() {
        String str;
        String str2;
        rve rveVar = this.b;
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(rveVar);
        int i = this.e;
        String str3 = "null";
        if (i == 0) {
            str = "null";
        } else {
            str = Integer.toString(a.aq(i));
        }
        int i2 = this.f;
        if (i2 == 0) {
            str2 = "null";
        } else {
            str2 = Integer.toString(atpj.b(i2));
        }
        int i3 = this.g;
        if (i3 != 0) {
            str3 = Integer.toString(arsd.at(i3));
        }
        asgt asgtVar = this.c;
        apct apctVar = this.d;
        return "XslParams{traceId=" + valueOf + ", rcsMessageId=" + valueOf2 + ", type=" + str + ", xslNode=" + str2 + ", xslInsideNode=" + str3 + ", bugleSendingInternalStatus=" + String.valueOf(asgtVar) + ", timestamp=" + String.valueOf(apctVar) + "}";
    }

    public rhd(atok atokVar, rve rveVar, int i, int i2, int i3, asgt asgtVar, apct apctVar) {
        this.a = atokVar;
        this.b = rveVar;
        this.e = i;
        this.f = i2;
        this.g = i3;
        this.c = asgtVar;
        this.d = apctVar;
    }
}
