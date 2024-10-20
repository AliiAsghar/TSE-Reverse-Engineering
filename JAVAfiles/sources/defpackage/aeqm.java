package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aeqm {
    public final String a;
    public final List b;

    public aeqm(String str, List list) {
        this.a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aeqm)) {
            return false;
        }
        aeqm aeqmVar = (aeqm) obj;
        if (d.F(this.a, aeqmVar.a) && d.F(this.b, aeqmVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "FavoriteRowUiData(title=" + this.a + ", items=" + this.b + ")";
    }
}
