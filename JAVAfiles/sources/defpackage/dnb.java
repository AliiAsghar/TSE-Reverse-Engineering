package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dnb implements dnd {
    private final int a;
    private final int b;

    public dnb(int i, int i2) {
        this.a = i;
        this.b = i2;
        if (i >= 0 && i2 >= 0) {
            return;
        }
        doz.b("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i + " and " + i2 + " respectively.");
    }

    @Override // defpackage.dnd
    public final void a(dnh dnhVar) {
        int i = dnhVar.b;
        int i2 = this.b;
        int i3 = i + i2;
        if (((i ^ i3) & (i2 ^ i3)) < 0) {
            i3 = dnhVar.c();
        }
        dnhVar.g(dnhVar.b, Math.min(i3, dnhVar.c()));
        int i4 = dnhVar.a;
        int i5 = this.a;
        int i6 = i4 - i5;
        if (((i4 ^ i6) & (i5 ^ i4)) < 0) {
            i6 = 0;
        }
        dnhVar.g(Math.max(0, i6), dnhVar.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dnb)) {
            return false;
        }
        dnb dnbVar = (dnb) obj;
        if (this.a == dnbVar.a && this.b == dnbVar.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        return "DeleteSurroundingTextCommand(lengthBeforeCursor=" + this.a + ", lengthAfterCursor=" + this.b + ')';
    }
}
