package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aflm {
    public final int a;
    public final int b;

    public aflm(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aflm)) {
            return false;
        }
        aflm aflmVar = (aflm) obj;
        if (this.a == aflmVar.a && this.b == aflmVar.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        return "TextSelection(anchor=" + this.a + ", edge=" + this.b + ")";
    }
}
