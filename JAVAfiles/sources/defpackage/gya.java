package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gya {
    public final String a;
    public final int b;
    public final int c;

    public gya(String str, int i, int i2) {
        str.getClass();
        this.a = str;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gya)) {
            return false;
        }
        gya gyaVar = (gya) obj;
        if (d.F(this.a, gyaVar.a) && this.b == gyaVar.b && this.c == gyaVar.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b) * 31) + this.c;
    }

    public final String toString() {
        return "SystemIdInfo(workSpecId=" + this.a + ", generation=" + this.b + ", systemId=" + this.c + ')';
    }
}
