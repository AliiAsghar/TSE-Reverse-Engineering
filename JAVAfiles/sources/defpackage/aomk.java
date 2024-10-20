package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aomk {
    public byte a;
    private boolean b;
    private boolean c;

    public final aoml a() {
        if (this.a != 7) {
            StringBuilder sb = new StringBuilder();
            if ((this.a & 1) == 0) {
                sb.append(" enableCelLogsiteMetadata");
            }
            if ((this.a & 2) == 0) {
                sb.append(" enableSafeFormatArgs");
            }
            if ((this.a & 4) == 0) {
                sb.append(" includeSuppressedExceptions");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        return new aoml(this.b, this.c);
    }

    public final void b(boolean z) {
        this.b = z;
        this.a = (byte) (this.a | 1);
    }

    public final void c(boolean z) {
        this.c = z;
        this.a = (byte) (this.a | 2);
    }

    public final acsd d() {
        if (((Boolean) acsd.a.a()).booleanValue()) {
            f(true);
        }
        if (this.a != 3) {
            StringBuilder sb = new StringBuilder();
            if ((1 & this.a) == 0) {
                sb.append(" cleanupFileTransferAfterUploadCompletes");
            }
            if ((this.a & 2) == 0) {
                sb.append(" isFileTransferViaSmsSupported");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        return new acsd(this.b, this.c);
    }

    public final void e(boolean z) {
        this.b = z;
        this.a = (byte) (this.a | 1);
    }

    public final void f(boolean z) {
        this.c = z;
        this.a = (byte) (this.a | 2);
    }

    public final qch g() {
        if (this.a != 3) {
            StringBuilder sb = new StringBuilder();
            if ((this.a & 1) == 0) {
                sb.append(" isSuccessful");
            }
            if ((this.a & 2) == 0) {
                sb.append(" shouldRefreshConversation");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        return new qch(this.b, this.c);
    }

    public final void h(boolean z) {
        this.b = z;
        this.a = (byte) (this.a | 1);
    }

    public final void i(boolean z) {
        this.c = z;
        this.a = (byte) (this.a | 2);
    }
}
