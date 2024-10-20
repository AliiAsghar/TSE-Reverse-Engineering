package defpackage;

import java.io.DataInput;
import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class atjm {
    final atjk a;
    final String b;
    final int c;

    public atjm(atjk atjkVar, String str, int i) {
        this.a = atjkVar;
        this.b = str;
        this.c = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static atjm c(DataInput dataInput) {
        return new atjm(new atjk((char) dataInput.readUnsignedByte(), dataInput.readUnsignedByte(), dataInput.readByte(), dataInput.readUnsignedByte(), dataInput.readBoolean(), (int) atow.m(dataInput)), dataInput.readUTF(), (int) atow.m(dataInput));
    }

    public final long a(long j, int i, int i2) {
        atjk atjkVar = this.a;
        char c = atjkVar.a;
        if (c == 'w') {
            i += i2;
        } else if (c != 's') {
            i = 0;
        }
        long j2 = i;
        long j3 = j + j2;
        athk athkVar = athk.o;
        long a = atjkVar.a(athkVar, athkVar.i.e(athkVar.i.h(athkVar.m.h(j3, atjkVar.b), 0), Math.min(atjkVar.f, 86399999)));
        if (atjkVar.d == 0) {
            if (a <= j3) {
                a = atjkVar.a(athkVar, athkVar.n.e(a, 1));
            }
        } else {
            a = atjkVar.c(athkVar, a);
            if (a <= j3) {
                a = atjkVar.c(athkVar, atjkVar.a(athkVar, athkVar.m.h(athkVar.n.e(a, 1), atjkVar.b)));
            }
        }
        return athkVar.i.e(athkVar.i.h(a, 0), atjkVar.f) - j2;
    }

    public final long b(long j, int i, int i2) {
        atjk atjkVar = this.a;
        char c = atjkVar.a;
        if (c == 'w') {
            i += i2;
        } else if (c != 's') {
            i = 0;
        }
        long j2 = i;
        long j3 = j + j2;
        athk athkVar = athk.o;
        long b = atjkVar.b(athkVar, athkVar.i.e(athkVar.i.h(athkVar.m.h(j3, atjkVar.b), 0), atjkVar.f));
        if (atjkVar.d == 0) {
            if (b >= j3) {
                b = atjkVar.b(athkVar, athkVar.n.e(b, -1));
            }
        } else {
            b = atjkVar.c(athkVar, b);
            if (b >= j3) {
                b = atjkVar.c(athkVar, atjkVar.b(athkVar, athkVar.m.h(athkVar.n.e(b, -1), atjkVar.b)));
            }
        }
        return athkVar.i.e(athkVar.i.h(b, 0), atjkVar.f) - j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof atjm) {
            atjm atjmVar = (atjm) obj;
            if (this.c == atjmVar.c && this.b.equals(atjmVar.b) && this.a.equals(atjmVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.c), this.b, this.a});
    }

    public final String toString() {
        return this.a.toString() + " named " + this.b + " at " + this.c;
    }
}
