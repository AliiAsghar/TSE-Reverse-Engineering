package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yzr {
    public final arqg a;
    public final arqg b;
    private final zep c;

    public yzr() {
        this(null, 7);
    }

    public final boolean a() {
        return this.c.d();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yzr)) {
            return false;
        }
        yzr yzrVar = (yzr) obj;
        if (this.c == yzrVar.c && d.F(this.a, yzrVar.a) && d.F(this.b, yzrVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((this.c.hashCode() * 31) + this.a.hashCode()) * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "CreateGroupUiData(selectionMode=" + this.c + ", onRenderCreateGroupButton=" + this.a + ", onCreateGroupButton=" + this.b + ")";
    }

    public yzr(zep zepVar, arqg arqgVar, arqg arqgVar2) {
        zepVar.getClass();
        this.c = zepVar;
        this.a = arqgVar;
        this.b = arqgVar2;
    }

    public /* synthetic */ yzr(zep zepVar, int i) {
        this((i & 1) != 0 ? zep.c : zepVar, yyo.c, yyo.d);
    }
}
