package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lbv extends ldk {
    private final Boolean a;
    private final Boolean b;
    private final Boolean c;
    private final Boolean d;
    private final Boolean e;
    private final Boolean f;

    public lbv(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6) {
        this.a = bool;
        this.b = bool2;
        this.c = bool3;
        this.d = bool4;
        this.e = bool5;
        this.f = bool6;
    }

    @Override // defpackage.ldk
    public final Boolean a() {
        return this.a;
    }

    @Override // defpackage.ldk
    public final Boolean b() {
        return this.b;
    }

    @Override // defpackage.ldk
    public final Boolean c() {
        return this.f;
    }

    @Override // defpackage.ldk
    public final Boolean d() {
        return this.e;
    }

    @Override // defpackage.ldk
    public final Boolean e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ldk) {
            ldk ldkVar = (ldk) obj;
            Boolean bool = this.a;
            if (bool != null ? bool.equals(ldkVar.a()) : ldkVar.a() == null) {
                Boolean bool2 = this.b;
                if (bool2 != null ? bool2.equals(ldkVar.b()) : ldkVar.b() == null) {
                    Boolean bool3 = this.c;
                    if (bool3 != null ? bool3.equals(ldkVar.f()) : ldkVar.f() == null) {
                        Boolean bool4 = this.d;
                        if (bool4 != null ? bool4.equals(ldkVar.e()) : ldkVar.e() == null) {
                            Boolean bool5 = this.e;
                            if (bool5 != null ? bool5.equals(ldkVar.d()) : ldkVar.d() == null) {
                                Boolean bool6 = this.f;
                                if (bool6 != null ? bool6.equals(ldkVar.c()) : ldkVar.c() == null) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.ldk
    public final Boolean f() {
        return this.c;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        Boolean bool = this.a;
        int i = 0;
        if (bool == null) {
            hashCode = 0;
        } else {
            hashCode = bool.hashCode();
        }
        Boolean bool2 = this.b;
        if (bool2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = bool2.hashCode();
        }
        int i2 = hashCode ^ 1000003;
        Boolean bool3 = this.c;
        if (bool3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = bool3.hashCode();
        }
        int i3 = ((((i2 * 1000003) ^ hashCode2) * 1000003) ^ hashCode3) * 1000003;
        Boolean bool4 = this.d;
        if (bool4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = bool4.hashCode();
        }
        int i4 = (i3 ^ hashCode4) * 1000003;
        Boolean bool5 = this.e;
        if (bool5 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = bool5.hashCode();
        }
        int i5 = (i4 ^ hashCode5) * 1000003;
        Boolean bool6 = this.f;
        if (bool6 != null) {
            i = bool6.hashCode();
        }
        return i5 ^ i;
    }

    public final String toString() {
        return "SuperSortQueryBuilder{whereArchived=" + this.a + ", whereNotArchived=" + this.b + ", whereSpam=" + this.c + ", whereNotRbm=" + this.d + ", whereNotPenpal=" + this.e + ", whereNotEmergencySos=" + this.f + "}";
    }
}
