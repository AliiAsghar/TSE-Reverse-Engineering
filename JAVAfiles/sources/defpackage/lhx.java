package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lhx {
    public final String a;
    public final aesp b;

    public lhx(String str, aesp aespVar) {
        this.a = str;
        this.b = aespVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lhx)) {
            return false;
        }
        lhx lhxVar = (lhx) obj;
        if (d.F(this.a, lhxVar.a) && d.F(this.b, lhxVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "ConversationEntry(id=" + this.a + ", itemUiData=" + this.b + ")";
    }
}
