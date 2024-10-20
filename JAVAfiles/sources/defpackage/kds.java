package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kds {
    public final String a;
    public final List b;

    public kds(String str, List list) {
        str.getClass();
        this.a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kds)) {
            return false;
        }
        kds kdsVar = (kds) obj;
        if (d.F(this.a, kdsVar.a) && d.F(this.b, kdsVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "CachableUiDataParts(processedText=" + this.a + ", combinedAnnotations=" + this.b + ")";
    }
}
