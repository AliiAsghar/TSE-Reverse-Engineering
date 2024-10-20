package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fam {
    public final long a;
    public final float b;
    public final long c;

    public fam(fal falVar) {
        this.a = falVar.a;
        this.b = falVar.b;
        this.c = falVar.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fam)) {
            return false;
        }
        fam famVar = (fam) obj;
        if (this.a == famVar.a && this.b == famVar.b && this.c == famVar.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), Float.valueOf(this.b), Long.valueOf(this.c)});
    }
}
