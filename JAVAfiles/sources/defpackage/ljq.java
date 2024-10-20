package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ljq {
    public final afaw a;
    public final lix b;
    public final List c;
    private final boolean d;

    public /* synthetic */ ljq(afaw afawVar, lix lixVar, List list) {
        afawVar.getClass();
        lixVar.getClass();
        list.getClass();
        this.a = afawVar;
        this.d = true;
        this.b = lixVar;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ljq)) {
            return false;
        }
        ljq ljqVar = (ljq) obj;
        if (!d.F(this.a, ljqVar.a)) {
            return false;
        }
        boolean z = ljqVar.d;
        if (d.F(this.b, ljqVar.b) && d.F(this.c, ljqVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + 1231) * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "AutoCompleteTopAppBarUiData(topAppBarUiData=" + this.a + ", focusTextField=true, suggestionListUiData=" + this.b + ", selectedRecipients=" + this.c + ")";
    }
}
