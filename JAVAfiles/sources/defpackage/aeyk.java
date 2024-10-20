package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aeyk {
    public final boolean a;
    public final String b;
    public final String c;
    public final boolean d = false;
    public final arqg e;

    public aeyk(boolean z, String str, String str2, arqg arqgVar) {
        this.a = z;
        this.b = str;
        this.c = str2;
        this.e = arqgVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aeyk)) {
            return false;
        }
        aeyk aeykVar = (aeyk) obj;
        if (this.a != aeykVar.a || !d.F(this.b, aeykVar.b) || !d.F(this.c, aeykVar.c)) {
            return false;
        }
        boolean z = aeykVar.d;
        if (d.F(this.e, aeykVar.e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int v = (a.v(this.a) * 31) + this.b.hashCode();
        String str = this.c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return (((((v * 31) + hashCode) * 31) + a.v(false)) * 31) + this.e.hashCode();
    }

    public final String toString() {
        return "ScrollToBottomUiData(isVisible=" + this.a + ", contentDescription=" + this.b + ", text=" + this.c + ", useSurfaceContainer=false, onClick=" + this.e + ")";
    }
}
