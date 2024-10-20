package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afah implements afaj, aetq {
    public final List a;
    private final String b;

    public afah(String str, List list) {
        this.b = str;
        this.a = list;
    }

    @Override // defpackage.aetq
    public final String b() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof afah)) {
            return false;
        }
        afah afahVar = (afah) obj;
        if (d.F(this.b, afahVar.b) && d.F(this.a, afahVar.a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    public final String toString() {
        return "MultipleLines(id=" + this.b + ", lines=" + this.a + ")";
    }
}
