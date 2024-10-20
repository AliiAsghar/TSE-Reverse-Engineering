package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aext implements aexv {
    public final aexe a;
    public final boolean b;
    public final String c;
    public final int d;
    private final String e;
    private final String f;
    private final List g;
    private final arqg h;
    private final arqg i;

    public aext(String str, String str2, aexe aexeVar, List list, int i, boolean z, arqg arqgVar, String str3) {
        this.e = str;
        this.f = str2;
        this.a = aexeVar;
        this.g = list;
        this.d = i;
        this.b = z;
        this.h = arqgVar;
        this.c = str3;
        if (str == null && str2 == null) {
            throw new IllegalStateException("One of title or description must be provided.");
        }
        this.i = aewh.l;
    }

    @Override // defpackage.aetv
    public final String a() {
        throw null;
    }

    @Override // defpackage.aetv
    public final arqg b() {
        return this.i;
    }

    @Override // defpackage.aetv
    public final arqg c() {
        return this.h;
    }

    @Override // defpackage.aetv
    public final boolean d() {
        throw null;
    }

    @Override // defpackage.aexv
    public final String e() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aext)) {
            return false;
        }
        aext aextVar = (aext) obj;
        if (d.F(this.e, aextVar.e) && d.F(this.f, aextVar.f) && d.F(this.a, aextVar.a) && d.F(this.g, aextVar.g) && this.d == aextVar.d && this.b == aextVar.b && d.F(this.h, aextVar.h) && d.F(this.c, aextVar.c)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.aexv
    public final String f() {
        return this.e;
    }

    @Override // defpackage.aexv
    public final List g() {
        return this.g;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        String str = this.e;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        String str2 = this.f;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i2 = hashCode * 31;
        aexe aexeVar = this.a;
        if (aexeVar != null) {
            i = aexeVar.hashCode();
        }
        int hashCode3 = (((((i2 + hashCode2) * 31) + i) * 31) + this.g.hashCode()) * 31;
        int i3 = this.d;
        a.bm(i3);
        return ((((((hashCode3 + i3) * 31) + a.v(this.b)) * 31) + this.h.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("HorizontalRichCardUiData(title=");
        sb.append(this.e);
        sb.append(", description=");
        sb.append(this.f);
        sb.append(", media=");
        sb.append(this.a);
        sb.append(", actions=");
        sb.append(this.g);
        sb.append(", alignment=");
        if (this.d != 1) {
            str = "End";
        } else {
            str = "Start";
        }
        sb.append((Object) str);
        sb.append(", isHighlighted=");
        sb.append(this.b);
        sb.append(", onLayout=");
        sb.append(this.h);
        sb.append(", contentDescription=");
        sb.append(this.c);
        sb.append(")");
        return sb.toString();
    }
}
