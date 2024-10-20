package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agna {
    public final String a;
    public final String b;
    public final int c;
    public final int d;
    public final boolean e;
    public final alog f;
    private final agmz g;

    public agna() {
        throw null;
    }

    public static agmy a() {
        agmy agmyVar = new agmy();
        int i = alog.d;
        agmyVar.e(alsx.a);
        agmyVar.d(false);
        return agmyVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof agna) {
            agna agnaVar = (agna) obj;
            if (this.a.equals(agnaVar.a) && this.b.equals(agnaVar.b) && this.c == agnaVar.c && this.d == agnaVar.d && this.e == agnaVar.e && alzz.at(this.f, agnaVar.f)) {
                agmz agmzVar = this.g;
                agmz agmzVar2 = agnaVar.g;
                if (agmzVar != null ? agmzVar.equals(agmzVar2) : agmzVar2 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode;
        int hashCode2 = ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
        if (true != this.e) {
            i = 1237;
        } else {
            i = 1231;
        }
        int hashCode3 = (((((((hashCode2 * 1000003) ^ this.c) * 1000003) ^ this.d) * 1000003) ^ i) * 1000003) ^ this.f.hashCode();
        agmz agmzVar = this.g;
        if (agmzVar == null) {
            hashCode = 0;
        } else {
            hashCode = agmzVar.hashCode();
        }
        return (hashCode3 * 1000003) ^ hashCode;
    }

    public final String toString() {
        agmz agmzVar = this.g;
        return "DatabaseConstructionParameters{storageFileName=" + this.a + ", handleName=" + this.b + ", currentSchemaVersion=" + this.c + ", transactionOrderingPosition=" + this.d + ", ignoreDowngrade=" + this.e + ", invalidRanges=" + String.valueOf(this.f) + ", onOpenCallback=" + String.valueOf(agmzVar) + "}";
    }

    public agna(String str, String str2, int i, int i2, boolean z, alog alogVar, agmz agmzVar) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = i2;
        this.e = z;
        this.f = alogVar;
        this.g = agmzVar;
    }
}
