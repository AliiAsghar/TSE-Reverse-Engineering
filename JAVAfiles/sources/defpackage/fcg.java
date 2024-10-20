package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fcg {
    public static final fcg a = new hov().e();
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public fcg(hov hovVar) {
        this.b = hovVar.b;
        this.c = hovVar.c;
        this.d = hovVar.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            fcg fcgVar = (fcg) obj;
            if (this.b == fcgVar.b && this.c == fcgVar.c && this.d == fcgVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        boolean z = this.b;
        boolean z2 = this.c;
        return ((z ? 1 : 0) << 2) + (z2 ? 1 : 0) + (z2 ? 1 : 0) + (this.d ? 1 : 0);
    }
}
