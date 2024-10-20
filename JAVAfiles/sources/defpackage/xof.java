package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xof {
    private long a;
    private long b;
    private byte c;

    public final xog a() {
        boolean z;
        boolean z2 = true;
        if (this.c != 3) {
            StringBuilder sb = new StringBuilder();
            if ((this.c & 1) == 0) {
                sb.append(" bytesTransferred");
            }
            if ((this.c & 2) == 0) {
                sb.append(" totalBytesInFile");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        xog xogVar = new xog(this.a, this.b);
        if (xogVar.a >= 0) {
            z = true;
        } else {
            z = false;
        }
        albo.U(z, "Bytes transferred must be non-negative.");
        if (xogVar.b < 0) {
            z2 = false;
        }
        albo.U(z2, "Total bytes in file must be non-negative.");
        return xogVar;
    }

    public final void b(long j) {
        this.a = j;
        this.c = (byte) (this.c | 1);
    }

    public final void c(long j) {
        this.b = j;
        this.c = (byte) (this.c | 2);
    }
}
