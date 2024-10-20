package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajpj {
    private boolean a;
    private byte b;

    public final ajpk a() {
        if (this.b == 1) {
            return new ajot(this.a);
        }
        throw new IllegalStateException("Missing required properties: supportsSubjectManagement");
    }

    public final void b(boolean z) {
        this.a = z;
        this.b = (byte) 1;
    }

    public final agnv c() {
        if (this.b == 1) {
            return new agnv(this.a);
        }
        throw new IllegalStateException("Missing required properties: withoutSqliteTransaction");
    }

    public final void d(boolean z) {
        this.a = z;
        this.b = (byte) 1;
    }
}
