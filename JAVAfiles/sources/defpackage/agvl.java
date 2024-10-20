package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agvl extends agwv {
    static final int a = 2992476;
    final String b;

    public agvl(int i, int i2) {
        super(c(a, i, i2));
        this.b = "";
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
        if (!(obj instanceof agvl)) {
            return false;
        }
        agvl agvlVar = (agvl) obj;
        if (super.equals(obj) && this.h == agvlVar.h && this.b.equals(agvlVar.b)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.agwv
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(super.hashCode()), this.b});
    }

    public final String toString() {
        algv aj = albo.aj(this);
        aj.g("id", this.h);
        aj.b("categoryName", this.b);
        return aj.toString();
    }
}
