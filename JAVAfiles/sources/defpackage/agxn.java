package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agxn extends agxp {
    private final String a;

    public agxn(String str) {
        this.a = str;
    }

    @Override // defpackage.agxy
    public final int b() {
        return 4;
    }

    @Override // defpackage.agxp, defpackage.agxy
    public final String c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof agxy) {
            agxy agxyVar = (agxy) obj;
            if (agxyVar.b() == 4 && this.a.equals(agxyVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Item{emptyCategoryDesc=" + this.a + "}";
    }
}
