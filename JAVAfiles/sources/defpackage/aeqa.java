package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aeqa implements aeqg {
    public final String a;
    public final List b;
    public final String c;
    public final List d;
    public final aewr e;
    public final aewr f;
    public final arqg g;

    public aeqa(String str, List list, String str2, List list2, aewr aewrVar, aewr aewrVar2, arqg arqgVar) {
        list2.getClass();
        arqgVar.getClass();
        this.a = str;
        this.b = list;
        this.c = str2;
        this.d = list2;
        this.e = aewrVar;
        this.f = aewrVar2;
        this.g = arqgVar;
    }

    public static /* synthetic */ aeqa b(aeqa aeqaVar, String str, List list, String str2, aewr aewrVar, aewr aewrVar2, arqg arqgVar, int i) {
        List list2;
        if ((i & 1) != 0) {
            str = aeqaVar.a;
        }
        String str3 = str;
        if ((i & 2) != 0) {
            list = aeqaVar.b;
        }
        List list3 = list;
        if ((i & 4) != 0) {
            str2 = aeqaVar.c;
        }
        String str4 = str2;
        if ((i & 8) != 0) {
            list2 = aeqaVar.d;
        } else {
            list2 = null;
        }
        List list4 = list2;
        if ((i & 16) != 0) {
            aewrVar = aeqaVar.e;
        }
        aewr aewrVar3 = aewrVar;
        if ((i & 32) != 0) {
            aewrVar2 = aeqaVar.f;
        }
        aewr aewrVar4 = aewrVar2;
        if ((i & 64) != 0) {
            arqgVar = aeqaVar.g;
        }
        arqg arqgVar2 = arqgVar;
        str3.getClass();
        list3.getClass();
        list4.getClass();
        arqgVar2.getClass();
        return new aeqa(str3, list3, str4, list4, aewrVar3, aewrVar4, arqgVar2);
    }

    @Override // defpackage.aeqg
    public final /* synthetic */ aeqg a(boolean z, arqg arqgVar) {
        return agkx.H(this, z, arqgVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aeqa)) {
            return false;
        }
        aeqa aeqaVar = (aeqa) obj;
        if (d.F(this.a, aeqaVar.a) && d.F(this.b, aeqaVar.b) && d.F(this.c, aeqaVar.c) && d.F(this.d, aeqaVar.d) && d.F(this.e, aeqaVar.e) && d.F(this.f, aeqaVar.f) && d.F(this.g, aeqaVar.g)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = (this.a.hashCode() * 31) + this.b.hashCode();
        String str = this.c;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int hashCode4 = ((((hashCode3 * 31) + hashCode) * 31) + this.d.hashCode()) * 31;
        aewr aewrVar = this.e;
        if (aewrVar == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = aewrVar.hashCode();
        }
        int i2 = (hashCode4 + hashCode2) * 31;
        aewr aewrVar2 = this.f;
        if (aewrVar2 != null) {
            i = aewrVar2.hashCode();
        }
        return ((i2 + i) * 31) + this.g.hashCode();
    }

    public final String toString() {
        return "Option(title=" + this.a + ", items=" + this.b + ", body=" + this.c + ", bodyAnnotations=" + this.d + ", confirmButton=" + this.e + ", dismissButton=" + this.f + ", onDismissRequest=" + this.g + ")";
    }

    public /* synthetic */ aeqa(String str, List list, String str2, List list2, aewr aewrVar, aewr aewrVar2, arqg arqgVar, int i) {
        this(str, list, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? arnv.a : list2, (i & 16) != 0 ? null : aewrVar, (i & 32) != 0 ? null : aewrVar2, (i & 64) != 0 ? aepz.a : arqgVar);
    }
}
