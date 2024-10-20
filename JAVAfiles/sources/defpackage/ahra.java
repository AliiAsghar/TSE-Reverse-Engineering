package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahra {
    public float a;
    public byte b;
    public int c;

    public final ahrb a() {
        int i;
        boolean z = true;
        if (this.b == 1 && (i = this.c) != 0) {
            ahrb ahrbVar = new ahrb(i, this.a);
            float f = ahrbVar.a;
            if (f < brg.a || f > 1.0f) {
                z = false;
            }
            albo.U(z, "Probability shall be between 0 and 1.");
            return ahrbVar;
        }
        StringBuilder sb = new StringBuilder();
        if (this.c == 0) {
            sb.append(" enablement");
        }
        if (this.b == 0) {
            sb.append(" samplingProbability");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(boolean z) {
        int i;
        if (true != z) {
            i = 2;
        } else {
            i = 3;
        }
        this.c = i;
    }
}
