package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahok {
    public int a;
    public byte b;
    public int c;

    public final ahol a() {
        int i;
        if (this.b == 3 && (i = this.c) != 0) {
            return new ahol(i, this.a);
        }
        StringBuilder sb = new StringBuilder();
        if (this.c == 0) {
            sb.append(" enablement");
        }
        if ((this.b & 1) == 0) {
            sb.append(" rateLimitPerSecond");
        }
        if ((this.b & 2) == 0) {
            sb.append(" perfettoMustBeExplicitlyTriggered");
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
