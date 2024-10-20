package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agoh {
    public final agoz a;
    public final agmh b;
    public final agmh c;
    public final String d;
    public final agpw e;
    public final String f;
    public final boolean g;

    public agoh() {
        throw null;
    }

    public static agog a(agoz agozVar) {
        agog agogVar = new agog();
        agogVar.b(false);
        agogVar.a = agozVar;
        return agogVar;
    }

    public static agog b(agoz agozVar, agmh agmhVar, agmh agmhVar2) {
        agog agogVar = new agog();
        agogVar.b(false);
        agogVar.a = agozVar;
        agogVar.b = agmhVar;
        agogVar.c = agmhVar2;
        agogVar.d = "=";
        return agogVar;
    }

    public final boolean equals(Object obj) {
        agmh agmhVar;
        agmh agmhVar2;
        String str;
        agpw agpwVar;
        String str2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof agoh) {
            agoh agohVar = (agoh) obj;
            if (this.a.equals(agohVar.a) && ((agmhVar = this.b) != null ? agmhVar.equals(agohVar.b) : agohVar.b == null) && ((agmhVar2 = this.c) != null ? agmhVar2.equals(agohVar.c) : agohVar.c == null) && ((str = this.d) != null ? str.equals(agohVar.d) : agohVar.d == null) && ((agpwVar = this.e) != null ? agpwVar.equals(agohVar.e) : agohVar.e == null) && ((str2 = this.f) != null ? str2.equals(agohVar.f) : agohVar.f == null) && this.g == agohVar.g) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int i;
        int hashCode5 = this.a.hashCode() ^ 1000003;
        agmh agmhVar = this.b;
        int i2 = 0;
        if (agmhVar == null) {
            hashCode = 0;
        } else {
            hashCode = agmhVar.hashCode();
        }
        int i3 = ((hashCode5 * 1000003) ^ hashCode) * 1000003;
        agmh agmhVar2 = this.c;
        if (agmhVar2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = agmhVar2.hashCode();
        }
        int i4 = (i3 ^ hashCode2) * 1000003;
        String str = this.d;
        if (str == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str.hashCode();
        }
        int i5 = (i4 ^ hashCode3) * 1000003;
        agpw agpwVar = this.e;
        if (agpwVar == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = agpwVar.hashCode();
        }
        int i6 = (i5 ^ hashCode4) * 1000003;
        String str2 = this.f;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        int i7 = (i6 ^ i2) * 1000003;
        if (true != this.g) {
            i = 1237;
        } else {
            i = 1231;
        }
        return i7 ^ i;
    }

    public final String toString() {
        agpw agpwVar = this.e;
        agmh agmhVar = this.c;
        agmh agmhVar2 = this.b;
        return "JoinSpec{query=" + String.valueOf(this.a) + ", joinColumn=" + String.valueOf(agmhVar2) + ", parentJoinColumn=" + String.valueOf(agmhVar) + ", onClauseComparator=" + this.d + ", onClause=" + String.valueOf(agpwVar) + ", retrievalTag=" + this.f + ", isExemptFromIndexRequirementOnJoinedColumn=" + this.g + "}";
    }

    public agoh(agoz agozVar, agmh agmhVar, agmh agmhVar2, String str, agpw agpwVar, String str2, boolean z) {
        this.a = agozVar;
        this.b = agmhVar;
        this.c = agmhVar2;
        this.d = str;
        this.e = agpwVar;
        this.f = str2;
        this.g = z;
    }
}
