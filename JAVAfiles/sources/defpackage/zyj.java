package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zyj {
    public final aesg a;
    public final int b;

    public zyj(aesg aesgVar, int i) {
        this.a = aesgVar;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zyj)) {
            return false;
        }
        zyj zyjVar = (zyj) obj;
        if (d.F(this.a, zyjVar.a) && this.b == zyjVar.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        int i = this.b;
        a.bm(i);
        return hashCode + i;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("ConversationActionUiData(data=");
        sb.append(this.a);
        sb.append(", color=");
        if (this.b != 1) {
            str = "ERROR";
        } else {
            str = "PRIMARY";
        }
        sb.append((Object) str);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ zyj(aesg aesgVar) {
        this(aesgVar, 1);
    }
}
