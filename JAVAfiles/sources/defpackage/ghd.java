package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class ghd {
    public final int a;
    public int b = -1;
    private final qdq c;

    public ghd(int i, qdq qdqVar) {
        this.a = i;
        this.c = qdqVar;
    }

    public final void a(int i, int i2, boolean z) {
        boolean z2;
        boolean z3;
        if (i2 >= i) {
            z2 = true;
        } else {
            z2 = false;
        }
        d.s(z2);
        while (true) {
            Object obj = this.c.a;
            if (i <= i2) {
                ghj ghjVar = (ghj) obj;
                String B = ghjVar.e.B(i);
                if (B != null) {
                    if (z) {
                        if (!ghjVar.a.a.contains(B)) {
                            ghjVar.a.b.add(B);
                            z3 = true;
                        }
                    } else {
                        ghjVar.a.b.remove(B);
                        z3 = false;
                    }
                    ghjVar.e(B, z3);
                }
                i++;
            } else {
                ((ghj) obj).f();
                return;
            }
        }
    }

    public final String toString() {
        return "Range{begin=" + this.a + ", end=" + this.b + "}";
    }
}
