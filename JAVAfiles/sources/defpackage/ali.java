package defpackage;

import defpackage.alf;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ali {
    public final alf.a a;
    public cuc b;
    public cvc c;
    public cuc d;
    public cvc e;
    public tu f;
    public tu g;
    private final int h = 0;
    private final int i = 0;

    public ali(alf.a aVar) {
        this.a = aVar;
    }

    public final tu a(boolean z, int i, int i2) {
        alf.a aVar = alf.a.a;
        int ordinal = this.a.ordinal();
        if (ordinal == 0 || ordinal == 1) {
            return null;
        }
        if (ordinal != 2) {
            if (ordinal == 3) {
                if (z) {
                    return this.f;
                }
                if (i + 1 < 0 || i2 < 0) {
                    return null;
                }
                return this.g;
            }
            throw new armm();
        }
        if (!z) {
            return null;
        }
        return this.f;
    }

    public final void b(ctc ctcVar, ctc ctcVar2, long j) {
        cuc cucVar;
        cuc cucVar2;
        long a = amg.a(j, ama.a);
        if (ctcVar != null) {
            int e = akz.e(ctcVar, dqs.a(a));
            this.f = new tu(tu.c(e, akz.c(ctcVar, e)));
            if (ctcVar instanceof cuc) {
                cucVar2 = (cuc) ctcVar;
            } else {
                cucVar2 = null;
            }
            this.b = cucVar2;
            this.c = null;
        }
        if (ctcVar2 != null) {
            int e2 = akz.e(ctcVar2, dqs.a(a));
            this.g = new tu(tu.c(e2, akz.c(ctcVar2, e2)));
            if (ctcVar2 instanceof cuc) {
                cucVar = (cuc) ctcVar2;
            } else {
                cucVar = null;
            }
            this.d = cucVar;
            this.e = null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ali)) {
            return false;
        }
        ali aliVar = (ali) obj;
        if (this.a != aliVar.a) {
            return false;
        }
        int i = aliVar.h;
        int i2 = aliVar.i;
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode() * 961;
    }

    public final String toString() {
        return "FlowLayoutOverflowState(type=" + this.a + ", minLinesToShowCollapse=0, minCrossAxisSizeToShowCollapse=0)";
    }
}
