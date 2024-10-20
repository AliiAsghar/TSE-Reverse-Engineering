package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aenk {
    public final List a;
    public final arqr b;
    public final arqr c;
    public final arqr d;

    public aenk(List list, arqr arqrVar, arqr arqrVar2, arqr arqrVar3) {
        this.a = list;
        this.b = arqrVar;
        this.c = arqrVar2;
        this.d = arqrVar3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aenk)) {
            return false;
        }
        aenk aenkVar = (aenk) obj;
        if (d.F(this.a, aenkVar.a) && d.F(this.b, aenkVar.b) && d.F(this.c, aenkVar.c) && d.F(this.d, aenkVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "ComposeRowDraftAttachmentUiData(attachments=" + this.a + ", onClick=" + this.b + ", onRemove=" + this.c + ", onMagicEdit=" + this.d + ")";
    }

    public /* synthetic */ aenk(List list, arqr arqrVar, arqr arqrVar2) {
        this(list, arqrVar, arqrVar2, aedh.j);
    }
}
