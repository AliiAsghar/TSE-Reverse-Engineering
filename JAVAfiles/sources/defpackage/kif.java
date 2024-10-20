package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kif implements aemc {
    public final List a;
    private final boolean b = true;
    private final arqg c;

    public kif(List list, arqg arqgVar) {
        this.a = list;
        this.c = arqgVar;
    }

    @Override // defpackage.aemc
    public final aemc a(arqg arqgVar) {
        return new kif(this.a, arqgVar);
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
        if (!(obj instanceof kif)) {
            return false;
        }
        kif kifVar = (kif) obj;
        if (!d.F(this.a, kifVar.a)) {
            return false;
        }
        boolean z = kifVar.b;
        if (d.F(this.c, kifVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + 1231) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "ActiveComposersUiData(composers=" + this.a + ", includeScrim=true, onDismiss=" + this.c + ")";
    }
}
