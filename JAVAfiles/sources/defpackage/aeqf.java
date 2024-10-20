package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aeqf implements aeqg {
    public final String a;
    public final String b;
    public final List c;
    public final aewr d;
    public final aewr e;
    public final arqg f;
    public final aeqe g;

    public aeqf(aeqe aeqeVar, String str, String str2, List list, aewr aewrVar, aewr aewrVar2, arqg arqgVar) {
        this.g = aeqeVar;
        this.a = str;
        this.b = str2;
        this.c = list;
        this.d = aewrVar;
        this.e = aewrVar2;
        this.f = arqgVar;
    }

    @Override // defpackage.aeqg
    public final /* synthetic */ aeqg a(boolean z, arqg arqgVar) {
        return agkx.H(this, z, arqgVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aeqf)) {
            return false;
        }
        aeqf aeqfVar = (aeqf) obj;
        if (d.F(this.g, aeqfVar.g) && d.F(this.a, aeqfVar.a) && d.F(this.b, aeqfVar.b) && d.F(this.c, aeqfVar.c) && d.F(this.d, aeqfVar.d) && d.F(this.e, aeqfVar.e) && d.F(this.f, aeqfVar.f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (((((((this.g.hashCode() * 31) + this.a.hashCode()) * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
        aewr aewrVar = this.e;
        if (aewrVar == null) {
            hashCode = 0;
        } else {
            hashCode = aewrVar.hashCode();
        }
        return (((hashCode2 * 31) + hashCode) * 31) + this.f.hashCode();
    }

    public final String toString() {
        return "Verification(icon=" + this.g + ", title=" + this.a + ", body=" + this.b + ", bodyAnnotations=" + this.c + ", confirmButton=" + this.d + ", dismissButton=" + this.e + ", onDismissRequest=" + this.f + ")";
    }
}
