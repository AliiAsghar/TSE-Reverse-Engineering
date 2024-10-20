package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zcx {
    public final String a;
    public final List b;
    public final arqg c;
    public final String d;

    public zcx() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zcx)) {
            return false;
        }
        zcx zcxVar = (zcx) obj;
        if (d.F(this.a, zcxVar.a) && d.F(this.b, zcxVar.b) && d.F(this.c, zcxVar.c) && d.F(this.d, zcxVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        String str = this.d;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return (hashCode2 * 31) + hashCode;
    }

    public final String toString() {
        return "ContactSuggestionListUiData(id=" + this.a + ", suggestionList=" + this.b + ", onSuggestionListInteractive=" + this.c + ", a11ySuggestionsTitle=" + this.d + ")";
    }

    public zcx(String str, List list, arqg arqgVar, String str2) {
        list.getClass();
        this.a = str;
        this.b = list;
        this.c = arqgVar;
        this.d = str2;
    }

    public /* synthetic */ zcx(byte[] bArr) {
        this("", arnv.a, yyo.h, null);
    }
}
