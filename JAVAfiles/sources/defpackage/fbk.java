package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fbk {
    public final long a;
    public final erz b;
    public final int c;
    public final fgv d;
    public final long e;
    public final erz f;
    public final int g;
    public final fgv h;
    public final long i;
    public final long j;

    public fbk(long j, erz erzVar, int i, fgv fgvVar, long j2, erz erzVar2, int i2, fgv fgvVar2, long j3, long j4) {
        this.a = j;
        this.b = erzVar;
        this.c = i;
        this.d = fgvVar;
        this.e = j2;
        this.f = erzVar2;
        this.g = i2;
        this.h = fgvVar2;
        this.i = j3;
        this.j = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            fbk fbkVar = (fbk) obj;
            if (this.a == fbkVar.a && this.c == fbkVar.c && this.e == fbkVar.e && this.g == fbkVar.g && this.i == fbkVar.i && this.j == fbkVar.j && d.B(this.b, fbkVar.b) && d.B(this.d, fbkVar.d) && d.B(this.f, fbkVar.f) && d.B(this.h, fbkVar.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), this.b, Integer.valueOf(this.c), this.d, Long.valueOf(this.e), this.f, Integer.valueOf(this.g), this.h, Long.valueOf(this.i), Long.valueOf(this.j)});
    }
}
