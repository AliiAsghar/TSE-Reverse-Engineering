package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abrv {
    public final aaoc a;
    private final int b;
    private final abqy c;
    private final String d;

    public abrv(aaoc aaocVar, abqy abqyVar, String str) {
        this.a = aaocVar;
        this.c = abqyVar;
        this.d = str;
        this.b = Arrays.hashCode(new Object[]{aaocVar, abqyVar, str});
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof abrv)) {
            return false;
        }
        abrv abrvVar = (abrv) obj;
        if (!d.B(this.a, abrvVar.a) || !d.B(this.c, abrvVar.c) || !d.B(this.d, abrvVar.d)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.b;
    }
}
