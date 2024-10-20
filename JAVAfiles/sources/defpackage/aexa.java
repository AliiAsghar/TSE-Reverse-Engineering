package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aexa implements aetv {
    public final List a;
    public final boolean b;
    public final arqg c;
    public final arqg d;
    public final String e;
    public final int f;

    public aexa(List list, int i, boolean z, arqg arqgVar, arqg arqgVar2, String str) {
        this.a = list;
        this.f = i;
        this.b = z;
        this.c = arqgVar;
        this.d = arqgVar2;
        this.e = str;
    }

    @Override // defpackage.aetv
    public final String a() {
        throw null;
    }

    @Override // defpackage.aetv
    public final arqg b() {
        return this.c;
    }

    @Override // defpackage.aetv
    public final arqg c() {
        throw null;
    }

    @Override // defpackage.aetv
    public final boolean d() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aexa)) {
            return false;
        }
        aexa aexaVar = (aexa) obj;
        if (d.F(this.a, aexaVar.a) && this.f == aexaVar.f && this.b == aexaVar.b && d.F(this.c, aexaVar.c) && d.F(this.d, aexaVar.d) && d.F(this.e, aexaVar.e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        int i = this.f;
        a.bm(i);
        return ((((((((hashCode + i) * 31) + a.v(this.b)) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("RichCardCarouselUiData(cards=");
        sb.append(this.a);
        sb.append(", cardWidth=");
        int i = this.f;
        if (i != 120) {
            if (i != 232) {
                str = "null";
            } else {
                str = "Medium";
            }
        } else {
            str = "Small";
        }
        sb.append((Object) str);
        sb.append(", isHighlighted=");
        sb.append(this.b);
        sb.append(", onClick=");
        sb.append(this.c);
        sb.append(", onLayout=");
        sb.append(this.d);
        sb.append(", contentDescription=");
        sb.append(this.e);
        sb.append(")");
        return sb.toString();
    }
}
