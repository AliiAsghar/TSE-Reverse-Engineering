package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class myy {
    public ncq a;
    private boolean b;
    private boolean c;
    private boolean d;
    private boolean e;
    private boolean f;
    private boolean g;
    private byte h;

    public final myz a() {
        ncq ncqVar;
        if (this.h == 63 && (ncqVar = this.a) != null) {
            return new myz(ncqVar, this.b, this.c, this.d, this.e, this.f, this.g);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" progress");
        }
        if ((this.h & 1) == 0) {
            sb.append(" isTransferring");
        }
        if ((this.h & 2) == 0) {
            sb.append(" isYetToManualDownload");
        }
        if ((this.h & 4) == 0) {
            sb.append(" isManualDownloading");
        }
        if ((this.h & 8) == 0) {
            sb.append(" isAutoDownloading");
        }
        if ((this.h & 16) == 0) {
            sb.append(" hasPermanentFailure");
        }
        if ((this.h & 32) == 0) {
            sb.append(" isCms");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(boolean z) {
        this.f = z;
        this.h = (byte) (this.h | 16);
    }

    public final void c(boolean z) {
        this.e = z;
        this.h = (byte) (this.h | 8);
    }

    public final void d(boolean z) {
        this.g = z;
        this.h = (byte) (this.h | 32);
    }

    public final void e(boolean z) {
        this.d = z;
        this.h = (byte) (this.h | 4);
    }

    public final void f(boolean z) {
        this.b = z;
        this.h = (byte) (this.h | 1);
    }

    public final void g(boolean z) {
        this.c = z;
        this.h = (byte) (this.h | 2);
    }
}
