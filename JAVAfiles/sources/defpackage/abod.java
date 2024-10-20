package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abod {
    final apbt a;

    public abod() {
        this.a = null;
    }

    public static abod a(apbt apbtVar) {
        if (apbtVar != null && apbtVar != aozo.a) {
            return new abod(apbtVar);
        }
        return aboj.a;
    }

    public final boolean equals(Object obj) {
        apbt apbtVar;
        if (this == obj) {
            return true;
        }
        if ((obj instanceof abod) && (apbtVar = this.a) != null && apbtVar.equals(((abod) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        abhg.h(!aboj.b.equals(this));
        if (aboj.a.equals(this)) {
            return 0;
        }
        apbt apbtVar = this.a;
        abhg.m(apbtVar);
        return apbtVar.hashCode();
    }

    public final String toString() {
        if (aboj.b.equals(this)) {
            return "$use_sticky_dims$";
        }
        if (aboj.a.equals(this)) {
            return "$no_dims$";
        }
        apbt apbtVar = this.a;
        abhg.m(apbtVar);
        return apbtVar.toString();
    }

    private abod(apbt apbtVar) {
        this.a = apbtVar;
    }
}
