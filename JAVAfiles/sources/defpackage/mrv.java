package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mrv {
    public final int a;
    public final aodz b;
    private final String c;

    public mrv() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof mrv) {
            mrv mrvVar = (mrv) obj;
            if (this.b.equals(mrvVar.b) && this.a == mrvVar.a) {
                String str = this.c;
                String str2 = mrvVar.c;
                if (str != null ? str.equals(str2) : str2 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.b.hashCode() ^ 1000003;
        int i = this.a;
        a.aS(i);
        String str = this.c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return (((((((((hashCode2 * 1000003) ^ i) * 1000003) ^ 1237) * 1000003) ^ 1237) * 1000003) ^ 1237) * 1000003) ^ hashCode;
    }

    public final String toString() {
        return "NumberAndValidity{phoneNumber=" + this.b.toString() + ", validity=" + a.a(this.a) + ", isPhoneWord=false, isDigitShortCode=false, isAlphaShortCode=false, parseRegion=" + this.c + "}";
    }

    public mrv(aodz aodzVar, int i, String str) {
        if (aodzVar == null) {
            throw new NullPointerException("Null phoneNumber");
        }
        this.b = aodzVar;
        this.a = i;
        this.c = str;
    }
}
