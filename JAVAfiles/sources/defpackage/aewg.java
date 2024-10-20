package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aewg implements aewe {
    public final String a;
    public final aewd b;
    public final float c;
    public final arqg d;
    public final List e;
    public final int f;
    private final aevy g;

    public aewg() {
        this(null, null, 0, null, null, 63);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aewg)) {
            return false;
        }
        aewg aewgVar = (aewg) obj;
        if (d.F(this.g, aewgVar.g) && d.F(this.a, aewgVar.a) && this.f == aewgVar.f && this.b == aewgVar.b && Float.compare(this.c, aewgVar.c) == 0 && d.F(this.d, aewgVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        aevy aevyVar = this.g;
        int i = 0;
        if (aevyVar == null) {
            hashCode = 0;
        } else {
            hashCode = aevyVar.hashCode();
        }
        String str = this.a;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i2 = ((hashCode * 31) + hashCode2) * 31;
        int i3 = this.f;
        a.bm(i3);
        int hashCode3 = ((((i2 + i3) * 31) + this.b.hashCode()) * 31) + Float.floatToIntBits(this.c);
        arqg arqgVar = this.d;
        if (arqgVar != null) {
            i = arqgVar.hashCode();
        }
        return (hashCode3 * 31) + i;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("SingleMonogramUiData(item=");
        sb.append(this.g);
        sb.append(", contentDescription=");
        sb.append(this.a);
        sb.append(", iconOverride=");
        int i = this.f;
        if (i != 1) {
            if (i != 2) {
                str = "SELECTED";
            } else {
                str = "BLOCKED";
            }
        } else {
            str = "NONE";
        }
        sb.append((Object) str);
        sb.append(", shape=");
        sb.append(this.b);
        sb.append(", spacerWeight=");
        sb.append(this.c);
        sb.append(", onClick=");
        sb.append(this.d);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ aewg(aevy aevyVar, String str, int i, aewd aewdVar, arqg arqgVar, int i2) {
        aewdVar = (i2 & 8) != 0 ? aewd.a : aewdVar;
        i = (i2 & 4) != 0 ? 1 : i;
        int i3 = i2 & 1;
        str = (i2 & 2) != 0 ? null : str;
        aevyVar = 1 == i3 ? null : aevyVar;
        float f = (i2 & 16) != 0 ? 0.05f : brg.a;
        arqgVar = (i2 & 32) != 0 ? null : arqgVar;
        if (i == 0) {
            throw null;
        }
        aewdVar.getClass();
        this.g = aevyVar;
        this.a = str;
        this.f = i;
        this.b = aewdVar;
        this.c = f;
        this.d = arqgVar;
        this.e = aevyVar == null ? arnv.a : aqjn.y(aevyVar);
    }
}
