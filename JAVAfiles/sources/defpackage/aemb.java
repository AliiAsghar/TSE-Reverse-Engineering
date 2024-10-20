package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aemb implements aemc {
    public final String a;
    public final aewr b;
    public final aewr c;
    public final String d;
    public final List e;
    public final boolean f;
    public final aelt g;
    public final arqg h;
    public final aews i;
    private final boolean j;
    private final boolean k;

    public aemb(String str, aewr aewrVar, aewr aewrVar2, String str2, List list, aews aewsVar, boolean z, aelt aeltVar, arqg arqgVar) {
        str.getClass();
        list.getClass();
        aeltVar.getClass();
        this.a = str;
        this.b = aewrVar;
        this.c = aewrVar2;
        this.d = str2;
        this.e = list;
        this.i = aewsVar;
        this.f = z;
        this.j = false;
        this.g = aeltVar;
        this.k = true;
        this.h = arqgVar;
    }

    @Override // defpackage.aemc
    public final aemc a(arqg arqgVar) {
        return new aemb(this.a, this.b, this.c, this.d, this.e, this.i, this.f, this.g, arqgVar);
    }

    @Override // defpackage.aemc
    public final arqg b() {
        return this.h;
    }

    @Override // defpackage.aemc
    public final boolean c() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aemb)) {
            return false;
        }
        aemb aembVar = (aemb) obj;
        if (!d.F(this.a, aembVar.a) || !d.F(this.b, aembVar.b) || !d.F(this.c, aembVar.c) || !d.F(this.d, aembVar.d) || !d.F(this.e, aembVar.e) || !d.F(this.i, aembVar.i) || this.f != aembVar.f) {
            return false;
        }
        boolean z = aembVar.j;
        if (this.g != aembVar.g) {
            return false;
        }
        boolean z2 = aembVar.k;
        if (d.F(this.h, aembVar.h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i;
        int hashCode2 = (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        String str = this.d;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int hashCode3 = ((((hashCode2 * 31) + hashCode) * 31) + this.e.hashCode()) * 31;
        aews aewsVar = this.i;
        if (aewsVar == null) {
            i = 0;
        } else {
            i = aewsVar.a;
        }
        return ((((((((((hashCode3 + i) * 31) + a.v(this.f)) * 31) + a.v(false)) * 31) + this.g.hashCode()) * 31) + a.v(true)) * 31) + this.h.hashCode();
    }

    public final String toString() {
        return "OptIn(title=" + this.a + ", confirmButton=" + this.b + ", denyButton=" + this.c + ", body=" + this.d + ", bodyAnnotations=" + this.e + ", illustration=" + this.i + ", showCloseButton=" + this.f + ", useEqualButtons=false, buttonLayout=" + this.g + ", includeScrim=true, onDismiss=" + this.h + ")";
    }

    public /* synthetic */ aemb(String str, aewr aewrVar, aewr aewrVar2, String str2, List list, aews aewsVar, aelt aeltVar, arqg arqgVar, int i) {
        this(str, aewrVar, aewrVar2, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? arnv.a : list, (i & 32) != 0 ? null : aewsVar, (i & 64) != 0, (i & 256) != 0 ? aelt.c : aeltVar, arqgVar);
    }
}
