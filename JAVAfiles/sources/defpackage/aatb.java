package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aatb extends aatc {
    public final int a;
    public final int b;
    private int d;

    public aatb(int i, int i2, int i3) {
        super(i);
        this.d = -1;
        this.a = i2;
        this.b = i3;
    }

    @Override // defpackage.aatc
    public final int a() {
        int i = this.d;
        if (i == -1) {
            int hashCode = hashCode();
            this.d = hashCode;
            return hashCode;
        }
        return i;
    }

    @Override // defpackage.aatc
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof aatb)) {
            return false;
        }
        aatb aatbVar = (aatb) obj;
        if (super.equals(obj) && this.a == aatbVar.a && this.b == aatbVar.b) {
            return true;
        }
        return false;
    }

    @Override // defpackage.aatc
    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.c), Integer.valueOf(this.a), Integer.valueOf(this.b));
    }
}
