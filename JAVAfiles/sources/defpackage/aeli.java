package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aeli {
    public final int a;
    public final int b;

    public aeli() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aeli)) {
            return false;
        }
        aeli aeliVar = (aeli) obj;
        int i = aeliVar.a;
        int i2 = aeliVar.b;
        return true;
    }

    public final int hashCode() {
        a.bm(1);
        a.bm(1);
        return 32;
    }

    public final String toString() {
        return "Style(colors=DEFAULT, size=DEFAULT)";
    }

    public /* synthetic */ aeli(byte[] bArr) {
        this.a = 1;
        this.b = 1;
    }
}
