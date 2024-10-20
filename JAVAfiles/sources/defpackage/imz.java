package defpackage;

import android.net.Uri;
import android.util.Size;
import com.google.android.apps.messaging.conversation.draft.model.GalleryContent;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class imz {
    public Size a;
    public Uri b;
    public Uri c;
    public byte d;
    public int e;
    public myz f;
    private String g;
    private Uri h;
    private ameb i;
    private long j;
    private boolean k;
    private Optional l;
    private tqj m;

    public imz() {
        this.f = null;
    }

    public final GalleryContent a() {
        Optional of;
        boolean z;
        String str = this.g;
        if (str != null) {
            if (gh.w(str)) {
                c("application/txt");
            }
            if ((this.d & 2) == 0) {
                of = Optional.empty();
            } else {
                of = Optional.of(Boolean.valueOf(this.k));
            }
            ameb amebVar = this.i;
            if (amebVar != null) {
                if (amebVar != ameb.FILE_CHOOSER) {
                    z = true;
                } else {
                    z = false;
                }
                this.k = ((Boolean) of.orElse(Boolean.valueOf(z))).booleanValue();
                int i = this.d | 2;
                this.d = (byte) i;
                if (i == 7 && this.g != null && this.h != null && this.i != null && this.a != null && this.m != null && this.e != 0) {
                    imq imqVar = new imq(this.g, this.h, this.i, this.a, this.j, this.k, false, this.b, this.l, this.m, this.c, null, this.e);
                    imqVar.p.set(this.f);
                    imqVar.i.ifPresent(new ibo(imqVar, 17));
                    return imqVar;
                }
                StringBuilder sb = new StringBuilder();
                if (this.g == null) {
                    sb.append(" contentType");
                }
                if (this.h == null) {
                    sb.append(" uri");
                }
                if (this.i == null) {
                    sb.append(" contentSource");
                }
                if (this.a == null) {
                    sb.append(" size");
                }
                if ((this.d & 1) == 0) {
                    sb.append(" mediaModifiedTimestamp");
                }
                if ((this.d & 2) == 0) {
                    sb.append(" isResizable");
                }
                if ((this.d & 4) == 0) {
                    sb.append(" saveToExternalStorage");
                }
                if (this.m == null) {
                    sb.append(" mediaSendType");
                }
                if (this.e == 0) {
                    sb.append(" displayState");
                }
                throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
            }
            throw new IllegalStateException("Property \"contentSource\" has not been set");
        }
        throw new IllegalStateException("Property \"contentType\" has not been set");
    }

    public final void b(ameb amebVar) {
        if (amebVar != null) {
            this.i = amebVar;
            return;
        }
        throw new NullPointerException("Null contentSource");
    }

    public final void c(String str) {
        if (str != null) {
            this.g = str;
            return;
        }
        throw new NullPointerException("Null contentType");
    }

    public final void d(long j) {
        this.l = Optional.of(Long.valueOf(j));
    }

    public final void e(long j) {
        this.j = j;
        this.d = (byte) (this.d | 1);
    }

    public final void f(tqj tqjVar) {
        if (tqjVar != null) {
            this.m = tqjVar;
            return;
        }
        throw new NullPointerException("Null mediaSendType");
    }

    public final void g(Uri uri) {
        if (uri != null) {
            this.h = uri;
            return;
        }
        throw new NullPointerException("Null uri");
    }

    public imz(byte[] bArr) {
        this.f = null;
        this.l = Optional.empty();
    }
}
