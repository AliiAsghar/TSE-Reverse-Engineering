package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kih implements aemc {
    public final List a;
    public final arqg b;
    private final boolean c;

    public kih(List list, arqg arqgVar) {
        list.getClass();
        this.a = list;
        this.c = true;
        this.b = arqgVar;
    }

    @Override // defpackage.aemc
    public final aemc a(arqg arqgVar) {
        return new kih(this.a, this.b);
    }

    @Override // defpackage.aemc
    public final arqg b() {
        return this.b;
    }

    @Override // defpackage.aemc
    public final boolean c() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kih)) {
            return false;
        }
        kih kihVar = (kih) obj;
        if (!d.F(this.a, kihVar.a)) {
            return false;
        }
        boolean z = kihVar.c;
        if (d.F(this.b, kihVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + a.v(true)) * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "DebugActionsBottomSheetUiData(debugActions=" + this.a + ", includeScrim=true, onDismiss=" + this.b + ")";
    }
}
