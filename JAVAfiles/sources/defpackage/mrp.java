package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mrp {
    public final msy a;
    private final String b;
    private final String c;
    private final String d;
    private final yjt e;
    private final int f;
    private final aodz g;

    public mrp() {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ String a(alhr alhrVar, alhr alhrVar2, alhr alhrVar3) {
        if (((Boolean) alhrVar.get()).booleanValue()) {
            return (String) alhrVar2.get();
        }
        return (String) alhrVar3.get();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ Optional b(alhr alhrVar, alhr alhrVar2, alhr alhrVar3) {
        yjt yjtVar;
        if (((Boolean) alhrVar.get()).booleanValue()) {
            yjtVar = (yjt) alhrVar2.get();
        } else {
            yjtVar = (yjt) alhrVar3.get();
        }
        return Optional.of(yjtVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ String c(String str, Optional optional, boolean z) {
        StringBuilder sb = new StringBuilder(str);
        if (optional.isEmpty()) {
            return sb.toString();
        }
        if (!str.startsWith("+")) {
            sb.insert(0, "+");
        }
        if (!z) {
            sb.insert(1, ((yjt) optional.get()).toString());
        }
        sb.insert(((yjt) optional.get()).toString().length() + 1, " ");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        aodz aodzVar;
        int i;
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof mrp) {
            mrp mrpVar = (mrp) obj;
            String str2 = this.b;
            if (str2 != null ? str2.equals(mrpVar.b) : mrpVar.b == null) {
                if (this.a.equals(mrpVar.a) && this.c.equals(mrpVar.c) && ((aodzVar = this.g) != null ? aodzVar.equals(mrpVar.g) : mrpVar.g == null) && ((i = this.f) != 0 ? i == mrpVar.f : mrpVar.f == 0) && ((str = this.d) != null ? str.equals(mrpVar.d) : mrpVar.d == null)) {
                    yjt yjtVar = this.e;
                    yjt yjtVar2 = mrpVar.e;
                    if (yjtVar != null ? yjtVar.equals(yjtVar2) : yjtVar2 == null) {
                        return true;
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
        String str = this.b;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int hashCode4 = ((((hashCode ^ 1000003) * 1000003) ^ this.a.hashCode()) * 1000003) ^ this.c.hashCode();
        aodz aodzVar = this.g;
        if (aodzVar == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = aodzVar.hashCode();
        }
        int i2 = ((hashCode4 * 1000003) ^ hashCode2) * 1000003;
        int i3 = this.f;
        if (i3 == 0) {
            i3 = 0;
        } else {
            a.aS(i3);
        }
        int i4 = (i2 ^ i3) * 1000003;
        String str2 = this.d;
        if (str2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str2.hashCode();
        }
        int i5 = (i4 ^ hashCode3) * 1000003;
        yjt yjtVar = this.e;
        if (yjtVar != null) {
            i = yjtVar.a;
        }
        return i5 ^ i;
    }

    public final String toString() {
        return "ParsedDestination{rawDestination=" + this.b + ", destinationType=" + this.a.toString() + ", sourceRegionCode=" + this.c + ", parsedNumber=" + String.valueOf(this.g) + ", validation=" + a.a(this.f) + ", targetRegionCode=" + this.d + ", targetCallingCode=" + String.valueOf(this.e) + "}";
    }

    public mrp(String str, msy msyVar, String str2, aodz aodzVar, int i, String str3, yjt yjtVar) {
        this.b = str;
        if (msyVar == null) {
            throw new NullPointerException("Null destinationType");
        }
        this.a = msyVar;
        if (str2 != null) {
            this.c = str2;
            this.g = aodzVar;
            this.f = i;
            this.d = str3;
            this.e = yjtVar;
            return;
        }
        throw new NullPointerException("Null sourceRegionCode");
    }
}
