package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afal implements aetq {
    public final String a;
    public final aerb b;
    public final List c;
    public final arqg d;
    private final String e = "RbmToolstoneId";

    public afal(String str, aerb aerbVar, List list, arqg arqgVar) {
        this.a = str;
        this.b = aerbVar;
        this.c = list;
        this.d = arqgVar;
    }

    @Override // defpackage.aetq
    public final String b() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof afal)) {
            return false;
        }
        afal afalVar = (afal) obj;
        if (d.F(this.e, afalVar.e) && d.F(this.a, afalVar.a) && this.b == afalVar.b && d.F(this.c, afalVar.c) && d.F(this.d, afalVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.e.hashCode() * 31) + this.a.hashCode();
        aerb aerbVar = this.b;
        if (aerbVar == null) {
            hashCode = 0;
        } else {
            hashCode = aerbVar.hashCode();
        }
        return (((((hashCode2 * 31) + hashCode) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "ToolstoneUiData(id=" + this.e + ", text=" + this.a + ", icon=" + this.b + ", annotations=" + this.c + ", onClose=" + this.d + ")";
    }
}
