package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aeth implements aesg {
    public final String a;
    public final String b;
    public final String c;
    public final List d;
    public final aetf e;
    public final aetf f;
    public final arqg g;
    private final Integer h;

    public /* synthetic */ aeth(String str, String str2, String str3, List list, aetf aetfVar, arqg arqgVar, int i) {
        list = (i & 8) != 0 ? arnv.a : list;
        int i2 = i & 2;
        str3 = (i & 4) != 0 ? null : str3;
        str2 = i2 != 0 ? null : str2;
        aetfVar = (i & 32) != 0 ? null : aetfVar;
        str.getClass();
        list.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = list;
        this.h = null;
        this.e = aetfVar;
        this.f = null;
        this.g = arqgVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aeth)) {
            return false;
        }
        aeth aethVar = (aeth) obj;
        if (!d.F(this.a, aethVar.a) || !d.F(this.b, aethVar.b) || !d.F(this.c, aethVar.c) || !d.F(this.d, aethVar.d)) {
            return false;
        }
        Integer num = aethVar.h;
        if (!d.F(null, null) || !d.F(this.e, aethVar.e)) {
            return false;
        }
        aetf aetfVar = aethVar.f;
        if (d.F(null, null) && d.F(this.g, aethVar.g)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4 = this.a.hashCode() * 31;
        String str = this.b;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (hashCode4 + hashCode) * 31;
        String str2 = this.c;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int hashCode5 = ((i2 + hashCode2) * 31) + this.d.hashCode();
        aetf aetfVar = this.e;
        if (aetfVar == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = aetfVar.hashCode();
        }
        int i3 = hashCode5 * 961;
        arqg arqgVar = this.g;
        if (arqgVar != null) {
            i = arqgVar.hashCode();
        }
        return ((i3 + hashCode3) * 961) + i;
    }

    public final String toString() {
        return "TextListItemUiData(title=" + this.a + ", subtitle=" + this.b + ", overline=" + this.c + ", annotations=" + this.d + ", count=null, startDecoration=" + this.e + ", endDecoration=null, onClick=" + this.g + ")";
    }
}
