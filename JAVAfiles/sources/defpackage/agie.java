package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agie {
    public final arqg a;
    public final int b;
    public final int c;

    public agie(arqg arqgVar, int i, int i2) {
        this.a = arqgVar;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof agie)) {
            return false;
        }
        agie agieVar = (agie) obj;
        if (d.F(this.a, agieVar.a) && this.b == agieVar.b && this.c == agieVar.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b) * 31) + this.c;
    }

    public final String toString() {
        return "PlayPauseButtonData(onClick=" + this.a + ", iconResId=" + this.b + ", contentDescriptionId=" + this.c + ")";
    }
}
