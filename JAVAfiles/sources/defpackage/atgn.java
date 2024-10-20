package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class atgn implements atgl {
    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        atgl atglVar = (atgl) obj;
        if (this == atglVar) {
            return 0;
        }
        long millis = atglVar.getMillis();
        long millis2 = getMillis();
        if (millis2 == millis) {
            return 0;
        }
        if (millis2 < millis) {
            return -1;
        }
        return 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof atgl)) {
            return false;
        }
        atgl atglVar = (atgl) obj;
        if (getMillis() == atglVar.getMillis() && atow.r(a(), atglVar.a())) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((int) (getMillis() ^ (getMillis() >>> 32))) + a().hashCode();
    }

    public final String toString() {
        return atjd.a.a(this);
    }
}
