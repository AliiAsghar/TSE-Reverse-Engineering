package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afzh {
    public final List a;
    public final arqr b;
    private final arml c = armd.a(new afzg(this, 0));

    public afzh(List list, arqr arqrVar) {
        this.a = list;
        this.b = arqrVar;
    }

    public final String[] a() {
        return (String[]) this.c.a();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof afzh)) {
            return false;
        }
        afzh afzhVar = (afzh) obj;
        if (d.F(this.a, afzhVar.a) && d.F(this.b, afzhVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "ContentInsertionListener(mediaTypes=" + this.a + ", onContentInserted=" + this.b + ")";
    }
}
