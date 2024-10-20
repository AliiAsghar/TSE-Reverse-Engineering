package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bgq<T> {
    public final Object a;
    public final arqw b;

    public bgq(Object obj, arqw arqwVar) {
        this.a = obj;
        this.b = arqwVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bgq)) {
            return false;
        }
        bgq bgqVar = (bgq) obj;
        if (d.F(this.a, bgqVar.a) && d.F(this.b, bgqVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        Object obj = this.a;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        return (hashCode * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "FadeInFadeOutAnimationItem(key=" + this.a + ", transition=" + this.b + ')';
    }
}
