package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aikq extends aiks {
    public aikr a;

    public aikq() {
        this.e = "tel";
    }

    public final String a() {
        return this.a.b;
    }

    public final String b() {
        return this.a.c();
    }

    @Override // defpackage.aiks, defpackage.aiku
    public final String c() {
        return this.e + ":" + this.a.c();
    }

    @Override // defpackage.aiks, defpackage.aiku
    public final Object clone() {
        aikq aikqVar = new aikq();
        aikqVar.e = this.e;
        aikr aikrVar = this.a;
        if (aikrVar != null) {
            aikqVar.a = (aikr) aikrVar.clone();
        }
        return aikqVar;
    }

    @Override // defpackage.aiks
    public final String d() {
        return this.e;
    }

    public final boolean e() {
        return this.a.a;
    }

    @Override // defpackage.aiks
    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof aikq)) {
            aikq aikqVar = (aikq) obj;
            aikr aikrVar = this.a;
            if (aikrVar != null || aikqVar.a == null) {
                if (aikrVar == null || aikrVar.equals(aikqVar.a)) {
                    return super.equals(obj);
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @Override // defpackage.aiks
    public final void h(String str) {
        aikr aikrVar = this.a;
        aikrVar.c.e(new aikz("method", str));
    }

    @Override // defpackage.aiks
    public final int hashCode() {
        int hashCode = super.hashCode();
        aikr aikrVar = this.a;
        if (aikrVar != null) {
            return (hashCode * 37) + aikrVar.hashCode();
        }
        return hashCode;
    }

    @Override // defpackage.aiks
    public final boolean l() {
        return false;
    }

    @Override // defpackage.aiks
    public final String toString() {
        return c();
    }
}
