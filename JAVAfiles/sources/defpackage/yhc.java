package defpackage;

import android.net.Uri;
import java.io.File;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yhc {
    public String a;
    private Uri b;
    private File c;
    private long d;
    private double e;
    private boolean f;
    private double g;
    private byte h;

    public final yhd a() {
        Uri uri;
        File file;
        if (this.h == 15 && (uri = this.b) != null && (file = this.c) != null) {
            return new yhd(uri, file, this.d, this.e, this.f, this.g, this.a);
        }
        StringBuilder sb = new StringBuilder();
        if (this.b == null) {
            sb.append(" sourceUri");
        }
        if (this.c == null) {
            sb.append(" outputPath");
        }
        if ((this.h & 1) == 0) {
            sb.append(" sizeLimit");
        }
        if ((this.h & 2) == 0) {
            sb.append(" bitrateLimitFactor");
        }
        if ((this.h & 4) == 0) {
            sb.append(" enableHighBudgetVideoCompression");
        }
        if ((this.h & 8) == 0) {
            sb.append(" mmsVideoCompressionFudgeFactor");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(double d) {
        this.e = d;
        this.h = (byte) (this.h | 2);
    }

    public final void c(boolean z) {
        this.f = z;
        this.h = (byte) (this.h | 4);
    }

    public final void d(double d) {
        this.g = d;
        this.h = (byte) (this.h | 8);
    }

    public final void e(File file) {
        if (file != null) {
            this.c = file;
            return;
        }
        throw new NullPointerException("Null outputPath");
    }

    public final void f(long j) {
        this.d = j;
        this.h = (byte) (this.h | 1);
    }

    public final void g(Uri uri) {
        if (uri != null) {
            this.b = uri;
            return;
        }
        throw new NullPointerException("Null sourceUri");
    }
}
