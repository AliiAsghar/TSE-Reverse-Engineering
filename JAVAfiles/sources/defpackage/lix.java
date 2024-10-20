package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lix {
    public final String a;
    public final List b;
    public final arqg c;

    public lix() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lix)) {
            return false;
        }
        lix lixVar = (lix) obj;
        if (d.F(this.a, lixVar.a) && d.F(this.b, lixVar.b) && d.F(this.c, lixVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "SuggestionListUiData(id=" + this.a + ", suggestionList=" + this.b + ", onSuggestionListInteractive=" + this.c + ")";
    }

    public lix(String str, List list, arqg arqgVar) {
        this.a = str;
        this.b = list;
        this.c = arqgVar;
    }

    public /* synthetic */ lix(byte[] bArr) {
        this("", arnv.a, kek.q);
    }
}
