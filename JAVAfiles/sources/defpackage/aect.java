package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aect {
    public final String a;
    public final aecg b;
    private final Map c;

    public aect() {
        this((String) null, (aecg) (0 == true ? 1 : 0), 7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aect)) {
            return false;
        }
        aect aectVar = (aect) obj;
        if (d.F(this.a, aectVar.a) && this.b == aectVar.b && d.F(this.c, aectVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "Verdict(pv=" + this.a + ", action=" + this.b + ")";
    }

    public aect(String str, aecg aecgVar, Map map) {
        str.getClass();
        aecgVar.getClass();
        this.a = str;
        this.b = aecgVar;
        this.c = map;
    }

    public /* synthetic */ aect(String str, aecg aecgVar, int i) {
        this(1 == (i & 1) ? "UNKNOWN" : str, (i & 2) != 0 ? aecg.d : aecgVar, arnw.a);
    }
}
