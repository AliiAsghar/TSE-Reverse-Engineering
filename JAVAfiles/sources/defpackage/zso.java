package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zso {
    public boolean a;
    public byte b;
    public int c;
    public Object d;

    public zso() {
    }

    public final zsp a() {
        int i;
        Object obj;
        if (this.b == 1 && (i = this.c) != 0 && (obj = this.d) != null) {
            return new zsp(i, (zsn) obj, this.a);
        }
        StringBuilder sb = new StringBuilder();
        if (this.c == 0) {
            sb.append(" eligibility");
        }
        if (this.d == null) {
            sb.append(" priority");
        }
        if (this.b == 0) {
            sb.append(" hasBeenShown");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(boolean z) {
        this.a = z;
        this.b = (byte) 1;
    }

    public final void c(boolean z) {
        this.a = z;
        this.b = (byte) (this.b | 2);
    }

    public zso(zsp zspVar) {
        this.c = zspVar.c;
        this.d = zspVar.a;
        this.a = zspVar.b;
        this.b = (byte) 1;
    }
}
