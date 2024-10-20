package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aexu implements aexv {
    public final aexf a;
    public final boolean b;
    public final String c;
    private final String d;
    private final String e;
    private final List f;
    private final arqg g;
    private final arqg h;

    public aexu(String str, String str2, aexf aexfVar, List list, boolean z, arqg arqgVar, String str3) {
        this.d = str;
        this.e = str2;
        this.a = aexfVar;
        this.f = list;
        this.b = z;
        this.g = arqgVar;
        this.c = str3;
        if (str == null && str2 == null && aexfVar == null) {
            throw new IllegalStateException("One of title, description, or media must be provided.");
        }
        this.h = aewh.n;
    }

    @Override // defpackage.aetv
    public final String a() {
        throw null;
    }

    @Override // defpackage.aetv
    public final arqg b() {
        return this.h;
    }

    @Override // defpackage.aetv
    public final arqg c() {
        return this.g;
    }

    @Override // defpackage.aetv
    public final boolean d() {
        throw null;
    }

    @Override // defpackage.aexv
    public final String e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aexu)) {
            return false;
        }
        aexu aexuVar = (aexu) obj;
        if (d.F(this.d, aexuVar.d) && d.F(this.e, aexuVar.e) && d.F(this.a, aexuVar.a) && d.F(this.f, aexuVar.f) && this.b == aexuVar.b && d.F(this.g, aexuVar.g) && d.F(this.c, aexuVar.c)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.aexv
    public final String f() {
        return this.d;
    }

    @Override // defpackage.aexv
    public final List g() {
        return this.f;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        String str = this.d;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        String str2 = this.e;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i2 = hashCode * 31;
        aexf aexfVar = this.a;
        if (aexfVar != null) {
            i = aexfVar.hashCode();
        }
        return ((((((((((i2 + hashCode2) * 31) + i) * 31) + this.f.hashCode()) * 31) + a.v(this.b)) * 31) + this.g.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "VerticalRichCardUiData(title=" + this.d + ", description=" + this.e + ", media=" + this.a + ", actions=" + this.f + ", isHighlighted=" + this.b + ", onLayout=" + this.g + ", contentDescription=" + this.c + ")";
    }
}
