package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class myw {
    private long a;
    private long b;
    private boolean c;
    private byte d;

    public final myx a() {
        if (this.d != 7) {
            StringBuilder sb = new StringBuilder();
            if ((this.d & 1) == 0) {
                sb.append(" bytesTransferred");
            }
            if ((this.d & 2) == 0) {
                sb.append(" totalBytesInFile");
            }
            if ((this.d & 4) == 0) {
                sb.append(" isFinished");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        return new myx(this.a, this.b, this.c);
    }

    public final void b(long j) {
        this.a = j;
        this.d = (byte) (this.d | 1);
    }

    public final void c(boolean z) {
        this.c = z;
        this.d = (byte) (this.d | 4);
    }

    public final void d(long j) {
        this.b = j;
        this.d = (byte) (this.d | 2);
    }
}
