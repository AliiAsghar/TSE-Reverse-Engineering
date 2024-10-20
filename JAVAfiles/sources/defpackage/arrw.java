package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class arrw extends arrf implements artm {
    public arrw() {
        super(arrf.d, null, null, null, false);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof arrw) {
            arrw arrwVar = (arrw) obj;
            if (g().equals(arrwVar.g()) && this.f.equals(arrwVar.f) && this.g.equals(arrwVar.g) && d.F(this.e, arrwVar.e)) {
                return true;
            }
            return false;
        }
        if (!(obj instanceof artm)) {
            return false;
        }
        return obj.equals(e());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final artm f() {
        arte e = e();
        if (e != this) {
            return (artm) e;
        }
        throw new arqf();
    }

    public final int hashCode() {
        return (((g().hashCode() * 31) + this.f.hashCode()) * 31) + this.g.hashCode();
    }

    public final String toString() {
        arte e = e();
        if (e != this) {
            return e.toString();
        }
        return "property " + this.f + " (Kotlin reflection is not available)";
    }

    public arrw(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, 1 == i);
    }
}
