package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afbg {
    public final List a;
    public final String b;
    public final arqg c;
    public final afbf d;

    public afbg(List list, String str, arqg arqgVar, afbf afbfVar) {
        this.a = list;
        this.b = str;
        this.c = arqgVar;
        this.d = afbfVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof afbg)) {
            return false;
        }
        afbg afbgVar = (afbg) obj;
        if (d.F(this.a, afbgVar.a) && d.F(this.b, afbgVar.b) && d.F(this.c, afbgVar.c) && d.F(this.d, afbgVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.a.hashCode() * 31;
        String str = this.b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return ((((hashCode2 + hashCode) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "TypingIndicatorUiData(monogramItemList=" + this.a + ", contentDescription=" + this.b + ", onClick=" + this.c + ", flags=" + this.d + ")";
    }
}
