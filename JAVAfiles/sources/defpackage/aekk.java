package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aekk {
    public final aehx a;
    public final arqg b;
    public final arqg c;
    public final boolean d;

    public aekk(aehx aehxVar, arqg arqgVar, arqg arqgVar2, boolean z) {
        arqgVar.getClass();
        arqgVar2.getClass();
        this.a = aehxVar;
        this.b = arqgVar;
        this.c = arqgVar2;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aekk)) {
            return false;
        }
        aekk aekkVar = (aekk) obj;
        if (d.F(this.a, aekkVar.a) && d.F(this.b, aekkVar.b) && d.F(this.c, aekkVar.c) && this.d == aekkVar.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + a.v(this.d);
    }

    public final String toString() {
        return "ComposeAttachmentBubbleUiData(onRemoveCallback=" + this.a + ", onClick=" + this.b + ", onMagicEdit=" + this.c + ", useMagicEdit=" + this.d + ")";
    }
}
