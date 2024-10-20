package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agwo extends agwv {
    static final int a = 2992510;
    static final agwo b = new agwo(-1, -1, "");
    final String c;

    public agwo(int i, int i2, String str) {
        super(c(a, i, i2));
        this.c = str;
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
        if (!(obj instanceof agwo)) {
            return false;
        }
        agwo agwoVar = (agwo) obj;
        if (super.equals(obj) && this.h == agwoVar.h && this.c.equals(agwoVar.c)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.agwv
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(super.hashCode()), this.c});
    }

    public final String toString() {
        algv aj = albo.aj(this);
        aj.g("id", this.h);
        aj.b("description", this.c);
        return aj.toString();
    }
}
