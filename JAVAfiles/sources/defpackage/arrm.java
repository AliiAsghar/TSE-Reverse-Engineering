package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class arrm extends arrf implements arrl, arth {
    private final int a;
    private final int b;

    public arrm(int i, Object obj, Class cls, String str, String str2, int i2) {
        super(obj, cls, str, str2, 1 == i2);
        this.a = i;
        this.b = 0;
    }

    @Override // defpackage.arrl
    public final int dO() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof arrm) {
            arrm arrmVar = (arrm) obj;
            if (this.f.equals(arrmVar.f) && this.g.equals(arrmVar.g)) {
                int i = arrmVar.b;
                if (this.a == arrmVar.a && d.F(this.e, arrmVar.e) && d.F(g(), arrmVar.g())) {
                    return true;
                }
            }
            return false;
        }
        if (!(obj instanceof arth)) {
            return false;
        }
        return obj.equals(e());
    }

    public final int hashCode() {
        int hashCode;
        if (g() == null) {
            hashCode = 0;
        } else {
            hashCode = g().hashCode() * 31;
        }
        return ((hashCode + this.f.hashCode()) * 31) + this.g.hashCode();
    }

    @Override // defpackage.arrf
    protected final void i() {
        int i = arsc.a;
    }

    public final String toString() {
        arte e = e();
        if (e != this) {
            return e.toString();
        }
        if ("<init>".equals(this.f)) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + this.f + " (Kotlin reflection is not available)";
    }

    public arrm(int i, Class cls, String str, String str2, int i2) {
        this(i, d, cls, str, str2, i2);
    }
}
