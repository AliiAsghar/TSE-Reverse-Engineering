package defpackage;

import android.net.Uri;
import android.util.Size;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ims {
    public Size a;
    public int b;
    private String c;
    private Uri d;
    private ameb e;
    private Optional f;
    private long g;
    private boolean h;
    private boolean i;
    private ampy j;
    private byte k;

    public ims() {
        throw null;
    }

    public final imt a() {
        Optional of;
        boolean z;
        Optional of2;
        String str;
        Uri uri;
        ameb amebVar;
        Size size;
        ampy ampyVar;
        ameb amebVar2 = this.e;
        if (amebVar2 != null) {
            if ((this.k & 2) == 0) {
                of = Optional.empty();
            } else {
                of = Optional.of(Boolean.valueOf(this.h));
            }
            boolean z2 = false;
            if (amebVar2 != ameb.FILE_CHOOSER) {
                z = true;
            } else {
                z = false;
            }
            this.h = ((Boolean) of.orElse(Boolean.valueOf(z))).booleanValue();
            int i = this.k | 2;
            this.k = (byte) i;
            if ((i & 4) == 0) {
                of2 = Optional.empty();
            } else {
                of2 = Optional.of(Boolean.valueOf(this.i));
            }
            if (amebVar2 == ameb.CAMERA || amebVar2 == ameb.MINI_CAMERA || amebVar2 == ameb.FULLSCREEN_CAMERA) {
                z2 = true;
            }
            boolean booleanValue = ((Boolean) of2.orElse(Boolean.valueOf(z2))).booleanValue();
            this.i = booleanValue;
            int i2 = this.k | 4;
            this.k = (byte) i2;
            if (i2 == 7 && (str = this.c) != null && (uri = this.d) != null && (amebVar = this.e) != null && (size = this.a) != null && (ampyVar = this.j) != null && this.b != 0) {
                return new imt(str, uri, amebVar, size, this.f, this.g, this.h, booleanValue, ampyVar);
            }
            StringBuilder sb = new StringBuilder();
            if (this.c == null) {
                sb.append(" contentType");
            }
            if (this.d == null) {
                sb.append(" uri");
            }
            if (this.e == null) {
                sb.append(" contentSource");
            }
            if (this.a == null) {
                sb.append(" size");
            }
            if ((this.k & 1) == 0) {
                sb.append(" mediaModifiedTimestamp");
            }
            if ((this.k & 2) == 0) {
                sb.append(" isResizable");
            }
            if ((this.k & 4) == 0) {
                sb.append(" saveToExternalStorage");
            }
            if (this.j == null) {
                sb.append(" captureInfo");
            }
            if (this.b == 0) {
                sb.append(" displayState");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        throw new IllegalStateException("Property \"contentSource\" has not been set");
    }

    public final void b(ampy ampyVar) {
        if (ampyVar != null) {
            this.j = ampyVar;
            return;
        }
        throw new NullPointerException("Null captureInfo");
    }

    public final void c(ameb amebVar) {
        if (amebVar != null) {
            this.e = amebVar;
            return;
        }
        throw new NullPointerException("Null contentSource");
    }

    public final void d(String str) {
        if (str != null) {
            this.c = str;
            return;
        }
        throw new NullPointerException("Null contentType");
    }

    public final void e(long j) {
        this.f = Optional.of(Long.valueOf(j));
    }

    public final void f(long j) {
        this.g = j;
        this.k = (byte) (this.k | 1);
    }

    public final void g(Uri uri) {
        if (uri != null) {
            this.d = uri;
            return;
        }
        throw new NullPointerException("Null uri");
    }

    public ims(byte[] bArr) {
        this.f = Optional.empty();
    }
}
