package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class esp {
    public static final esp a = new esp(-1, -1, -1);
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    public esp(int i, int i2, int i3) {
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = eul.W(i3) ? eul.n(i3, i2) : -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof esp)) {
            return false;
        }
        esp espVar = (esp) obj;
        if (this.b == espVar.b && this.c == espVar.c && this.d == espVar.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.b), Integer.valueOf(this.c), Integer.valueOf(this.d)});
    }

    public final String toString() {
        return "AudioFormat[sampleRate=" + this.b + ", channelCount=" + this.c + ", encoding=" + this.d + "]";
    }

    public esp(eqn eqnVar) {
        this(eqnVar.E, eqnVar.D, eqnVar.F);
    }
}
