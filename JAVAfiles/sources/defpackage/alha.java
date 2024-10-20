package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class alha extends algw {
    private static final long serialVersionUID = 0;
    public final Object a;

    public alha(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.algw
    public final algw a(algk algkVar) {
        Object apply = algkVar.apply(this.a);
        apply.getClass();
        return new alha(apply);
    }

    @Override // defpackage.algw
    public final Object b() {
        return this.a;
    }

    @Override // defpackage.algw
    public final Object c(alhr alhrVar) {
        alhrVar.getClass();
        return this.a;
    }

    @Override // defpackage.algw
    public final Object d(Object obj) {
        obj.getClass();
        return this.a;
    }

    @Override // defpackage.algw
    public final Object e() {
        return this.a;
    }

    @Override // defpackage.algw
    public final boolean equals(Object obj) {
        if (obj instanceof alha) {
            return this.a.equals(((alha) obj).a);
        }
        return false;
    }

    @Override // defpackage.algw
    public final boolean f() {
        return true;
    }

    @Override // defpackage.algw
    public final int hashCode() {
        return this.a.hashCode() + 1502476572;
    }

    public final String toString() {
        return "Optional.of(" + this.a.toString() + ")";
    }
}
