package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jxh {
    public final List b;
    public final arqg c;
    public final String a = "Connect to Satellite";
    private final aerb d = null;
    private final boolean e = true;

    public jxh(List list, arqg arqgVar) {
        this.b = list;
        this.c = arqgVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jxh)) {
            return false;
        }
        jxh jxhVar = (jxh) obj;
        if (!d.F(this.a, jxhVar.a)) {
            return false;
        }
        aerb aerbVar = jxhVar.d;
        boolean z = jxhVar.e;
        if (d.F(this.b, jxhVar.b) && d.F(this.c, jxhVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 961) + 1231) * 31) + 1) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "DebugActionUiData(title=" + this.a + ", icon=null, isVisible=true, subActions=" + this.b + ", execute=" + this.c + ")";
    }
}
