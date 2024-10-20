package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class anjn {
    public final String a;
    public final anjq b;
    public final Map c;
    public final anjg d;

    public anjn(String str, anjq anjqVar, Map map, anjg anjgVar) {
        str.getClass();
        anjqVar.getClass();
        map.getClass();
        anjgVar.getClass();
        this.a = str;
        this.b = anjqVar;
        this.c = map;
        this.d = anjgVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof anjn)) {
            return false;
        }
        anjn anjnVar = (anjn) obj;
        if (d.F(this.a, anjnVar.a) && this.b == anjnVar.b && d.F(this.c, anjnVar.c) && d.F(this.d, anjnVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "GroupProperties(name=" + this.a + ", type=" + this.b + ", metadata=" + this.c + ", icon=" + this.d + ")";
    }
}
