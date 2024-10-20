package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cod extends cnz {
    public final float a;
    public final float b;
    public final int c;
    public final int d;
    private final cls e;

    public /* synthetic */ cod(float f, float f2, int i, int i2, int i3) {
        this.a = 1 == (i3 & 1) ? brg.a : f;
        this.b = (i3 & 2) != 0 ? 4.0f : f2;
        this.c = (i3 & 4) != 0 ? 0 : i;
        this.d = (i3 & 8) != 0 ? 0 : i2;
        this.e = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cod)) {
            return false;
        }
        cod codVar = (cod) obj;
        if (this.a != codVar.a || this.b != codVar.b || !a.bA(this.c, codVar.c) || !a.bA(this.d, codVar.d)) {
            return false;
        }
        cls clsVar = codVar.e;
        if (d.F(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((((Float.floatToIntBits(this.a) * 31) + Float.floatToIntBits(this.b)) * 31) + this.c) * 31) + this.d) * 31;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Stroke(width=");
        sb.append(this.a);
        sb.append(", miter=");
        sb.append(this.b);
        sb.append(", cap=");
        int i = this.c;
        String str2 = "Unknown";
        if (a.bA(i, 0)) {
            str = "Butt";
        } else if (a.bA(i, 1)) {
            str = "Round";
        } else if (!a.bA(i, 2)) {
            str = "Unknown";
        } else {
            str = "Square";
        }
        sb.append((Object) str);
        sb.append(", join=");
        int i2 = this.d;
        if (a.bA(i2, 0)) {
            str2 = "Miter";
        } else if (a.bA(i2, 1)) {
            str2 = "Round";
        } else if (a.bA(i2, 2)) {
            str2 = "Bevel";
        }
        sb.append((Object) str2);
        sb.append(", pathEffect=null)");
        return sb.toString();
    }
}
