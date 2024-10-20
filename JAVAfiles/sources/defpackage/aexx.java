package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aexx {
    public final aexz a;
    public final arqg b;

    public aexx(aexz aexzVar, arqg arqgVar) {
        aexzVar.getClass();
        this.a = aexzVar;
        this.b = arqgVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aexx)) {
            return false;
        }
        aexx aexxVar = (aexx) obj;
        if (d.F(this.a, aexxVar.a) && d.F(this.b, aexxVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "MessageReplySnippetUiData(replyContent=" + this.a + ", onClick=" + this.b + ")";
    }
}
