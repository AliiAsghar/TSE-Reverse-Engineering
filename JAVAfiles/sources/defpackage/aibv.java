package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aibv implements ahys {
    public final aiba a;
    public final String b;
    public final long c;
    public final adae d;

    public aibv() {
        throw null;
    }

    @Override // defpackage.ahys
    public final adae a() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aibv) {
            aibv aibvVar = (aibv) obj;
            aiba aibaVar = this.a;
            if (aibaVar != null ? aibaVar.equals(aibvVar.a) : aibvVar.a == null) {
                String str = this.b;
                if (str != null ? str.equals(aibvVar.b) : aibvVar.b == null) {
                    if (this.c == aibvVar.c) {
                        adae adaeVar = this.d;
                        adae adaeVar2 = aibvVar.d;
                        if (adaeVar != null ? adaeVar.equals(adaeVar2) : adaeVar2 == null) {
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
        aiba aibaVar = this.a;
        int i = 0;
        if (aibaVar == null) {
            hashCode = 0;
        } else {
            hashCode = aibaVar.hashCode();
        }
        String str = this.b;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i2 = hashCode ^ 1000003;
        long j = this.c;
        adae adaeVar = this.d;
        if (adaeVar != null) {
            i = adaeVar.hashCode();
        }
        return (((((i2 * 1000003) ^ hashCode2) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ i;
    }

    public final String toString() {
        adae adaeVar = this.d;
        return "IsOpenRequest{place=" + String.valueOf(this.a) + ", placeId=" + this.b + ", utcTimeMillis=" + this.c + ", cancellationToken=" + String.valueOf(adaeVar) + "}";
    }

    public aibv(aiba aibaVar, String str, long j, adae adaeVar) {
        this.a = aibaVar;
        this.b = str;
        this.c = j;
        this.d = adaeVar;
    }
}
