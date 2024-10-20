package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afcg extends adom {
    public final String a;
    public final Map b;

    public afcg(String str, Map map) {
        super(null);
        this.a = str;
        this.b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof afcg)) {
            return false;
        }
        afcg afcgVar = (afcg) obj;
        if (d.F(this.a, afcgVar.a) && d.F(this.b, afcgVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }

    public final String toString() {
        return "Url(url=" + this.a + ", additionalHttpHeaders=" + this.b + ")";
    }
}
