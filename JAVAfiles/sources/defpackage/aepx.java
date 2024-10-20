package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aepx implements aeqg {
    public final String a;
    public final List b;
    public final aerb c;
    public final String d;
    public final boolean e;
    public final boolean f;
    public final aewr g;
    public final aewr h;
    public final arqg i;

    public aepx(String str, List list, aerb aerbVar, String str2, boolean z, boolean z2, aewr aewrVar, aewr aewrVar2, arqg arqgVar) {
        str.getClass();
        list.getClass();
        arqgVar.getClass();
        this.a = str;
        this.b = list;
        this.c = aerbVar;
        this.d = str2;
        this.e = z;
        this.f = z2;
        this.g = aewrVar;
        this.h = aewrVar2;
        this.i = arqgVar;
    }

    @Override // defpackage.aeqg
    public final /* synthetic */ aeqg a(boolean z, arqg arqgVar) {
        return agkx.H(this, z, arqgVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aepx)) {
            return false;
        }
        aepx aepxVar = (aepx) obj;
        if (d.F(this.a, aepxVar.a) && d.F(this.b, aepxVar.b) && this.c == aepxVar.c && d.F(this.d, aepxVar.d) && this.e == aepxVar.e && this.f == aepxVar.f && d.F(this.g, aepxVar.g) && d.F(this.h, aepxVar.h) && d.F(this.i, aepxVar.i)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = (this.a.hashCode() * 31) + this.b.hashCode();
        aerb aerbVar = this.c;
        int i = 0;
        if (aerbVar == null) {
            hashCode = 0;
        } else {
            hashCode = aerbVar.hashCode();
        }
        int i2 = ((hashCode3 * 31) + hashCode) * 31;
        String str = this.d;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int v = (((((((i2 + hashCode2) * 31) + a.v(this.e)) * 31) + a.v(this.f)) * 31) + this.g.hashCode()) * 31;
        aewr aewrVar = this.h;
        if (aewrVar != null) {
            i = aewrVar.hashCode();
        }
        return ((v + i) * 31) + this.i.hashCode();
    }

    public final String toString() {
        return "Alert(body=" + this.a + ", bodyAnnotations=" + this.b + ", icon=" + this.c + ", title=" + this.d + ", selectableText=" + this.e + ", isError=" + this.f + ", confirmButton=" + this.g + ", dismissButton=" + this.h + ", onDismissRequest=" + this.i + ")";
    }

    public /* synthetic */ aepx(String str, List list, aerb aerbVar, String str2, boolean z, boolean z2, aewr aewrVar, aewr aewrVar2, arqg arqgVar, int i) {
        this(str, (i & 2) != 0 ? arnv.a : list, (i & 4) != 0 ? null : aerbVar, (i & 8) != 0 ? null : str2, ((i & 16) == 0) & z, ((i & 32) == 0) & z2, aewrVar, (i & 128) != 0 ? null : aewrVar2, (i & 256) != 0 ? aepz.b : arqgVar);
    }
}
