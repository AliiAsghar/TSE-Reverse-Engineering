package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class amdo extends amdr {
    private final amdr a;
    private final amdr b;
    private final int c;

    public amdo(amdr amdrVar, amdr amdrVar2) {
        this.a = amdrVar;
        this.b = amdrVar2;
        this.c = ((amdp) amdrVar).a;
    }

    @Override // defpackage.amdr
    public final long a(int i) {
        int i2 = this.c;
        if (i < i2) {
            return this.a.a(i);
        }
        return this.b.a((i + 1) - i2);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof amdo) {
            amdo amdoVar = (amdo) obj;
            if (this.a.equals(amdoVar.a) && this.b.equals(amdoVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }
}
