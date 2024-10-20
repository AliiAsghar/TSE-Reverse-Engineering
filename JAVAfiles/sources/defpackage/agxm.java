package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agxm extends agxp {
    private final String a;

    public agxm(String str) {
        this.a = str;
    }

    @Override // defpackage.agxp, defpackage.agxy
    public final String a() {
        return this.a;
    }

    @Override // defpackage.agxy
    public final int b() {
        return 1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof agxy) {
            agxy agxyVar = (agxy) obj;
            if (agxyVar.b() == 1 && this.a.equals(agxyVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Item{emoji=" + this.a + "}";
    }
}
