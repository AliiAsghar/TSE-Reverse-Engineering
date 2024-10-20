package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kha {
    public final boolean a;
    private final khe b;
    private final khf c;
    private final boolean d;

    public kha() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kha)) {
            return false;
        }
        kha khaVar = (kha) obj;
        if (this.a == khaVar.a && this.b == khaVar.b && d.F(this.c, khaVar.c) && this.d == khaVar.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int v = (a.v(this.a) * 31) + this.b.hashCode();
        khf khfVar = this.c;
        if (khfVar == null) {
            hashCode = 0;
        } else {
            hashCode = khfVar.hashCode();
        }
        return (((v * 31) + hashCode) * 31) + a.v(this.d);
    }

    public final String toString() {
        return "MessageSelectionData(isSelected=" + this.a + ", selectionMode=" + this.b + ", offset=" + this.c + ", isOnFirstSelection=" + this.d + ")";
    }

    public kha(boolean z, khe kheVar, khf khfVar, boolean z2) {
        kheVar.getClass();
        this.a = z;
        this.b = kheVar;
        this.c = khfVar;
        this.d = z2;
    }

    public /* synthetic */ kha(byte[] bArr) {
        this(false, khe.a, null, false);
    }
}
