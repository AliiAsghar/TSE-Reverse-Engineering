package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kis implements aemc {
    public final List a;
    private final boolean b = true;
    private final arqg c;

    public kis(List list, arqg arqgVar) {
        this.a = list;
        this.c = arqgVar;
    }

    @Override // defpackage.aemc
    public final aemc a(arqg arqgVar) {
        return new kis(this.a, arqgVar);
    }

    @Override // defpackage.aemc
    public final arqg b() {
        return this.c;
    }

    @Override // defpackage.aemc
    public final boolean c() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kis)) {
            return false;
        }
        kis kisVar = (kis) obj;
        if (!d.F(this.a, kisVar.a)) {
            return false;
        }
        boolean z = kisVar.b;
        if (d.F(this.c, kisVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + 1231) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "ReactionsSummaryUiData(reactions=" + this.a + ", includeScrim=true, onDismiss=" + this.c + ")";
    }
}
