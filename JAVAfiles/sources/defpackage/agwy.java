package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agwy extends agwv {
    static final int a = 2992520;

    public agwy(int i, int i2) {
        super(c(a, i, i2));
    }

    @Override // defpackage.agwv
    public final int a() {
        return a;
    }

    @Override // defpackage.agwv
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof agwy)) {
            return false;
        }
        agwy agwyVar = (agwy) obj;
        if (super.equals(obj) && this.h == agwyVar.h) {
            return true;
        }
        return false;
    }

    @Override // defpackage.agwv
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(super.hashCode())});
    }

    public final String toString() {
        algv aj = albo.aj(this);
        aj.g("id", this.h);
        return aj.toString();
    }
}
