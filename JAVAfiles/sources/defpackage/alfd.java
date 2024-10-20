package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class alfd extends algw {
    public static final alfd a = new alfd();
    private static final long serialVersionUID = 0;

    private alfd() {
    }

    private Object readResolve() {
        return a;
    }

    @Override // defpackage.algw
    public final algw a(algk algkVar) {
        return a;
    }

    @Override // defpackage.algw
    public final Object b() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    @Override // defpackage.algw
    public final Object c(alhr alhrVar) {
        Object obj = alhrVar.get();
        obj.getClass();
        return obj;
    }

    @Override // defpackage.algw
    public final Object d(Object obj) {
        obj.getClass();
        return obj;
    }

    @Override // defpackage.algw
    public final Object e() {
        return null;
    }

    @Override // defpackage.algw
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return false;
    }

    @Override // defpackage.algw
    public final boolean f() {
        return false;
    }

    @Override // defpackage.algw
    public final int hashCode() {
        return 2040732332;
    }

    public final String toString() {
        return "Optional.absent()";
    }
}
