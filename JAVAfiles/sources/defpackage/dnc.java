package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dnc implements dnd {
    private final int a;
    private final int b;

    public dnc(int i, int i2) {
        this.a = i;
        this.b = i2;
        if (i >= 0 && i2 >= 0) {
            return;
        }
        doz.b("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i + " and " + i2 + " respectively.");
    }

    @Override // defpackage.dnd
    public final void a(dnh dnhVar) {
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 < this.a) {
                int i4 = i3 + 1;
                int i5 = dnhVar.a;
                if (i5 > i4) {
                    if (dne.a(dnhVar.a((i5 - i4) - 1), dnhVar.a(dnhVar.a - i4))) {
                        i3 += 2;
                    } else {
                        i3 = i4;
                    }
                    i2++;
                } else {
                    i3 = i5;
                    break;
                }
            } else {
                break;
            }
        }
        int i6 = this.b;
        int i7 = 0;
        while (true) {
            if (i >= i6) {
                break;
            }
            int i8 = i7 + 1;
            if (dnhVar.b + i8 < dnhVar.c()) {
                if (dne.a(dnhVar.a((dnhVar.b + i8) - 1), dnhVar.a(dnhVar.b + i8))) {
                    i7 += 2;
                } else {
                    i7 = i8;
                }
                i++;
            } else {
                i7 = dnhVar.c() - dnhVar.b;
                break;
            }
        }
        int i9 = dnhVar.b;
        dnhVar.g(i9, i7 + i9);
        int i10 = dnhVar.a;
        dnhVar.g(i10 - i3, i10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dnc)) {
            return false;
        }
        dnc dncVar = (dnc) obj;
        if (this.a == dncVar.a && this.b == dncVar.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        return "DeleteSurroundingTextInCodePointsCommand(lengthBeforeCursor=" + this.a + ", lengthAfterCursor=" + this.b + ')';
    }
}
