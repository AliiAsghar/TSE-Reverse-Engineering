package defpackage;

import android.net.Uri;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vld {
    public CharSequence a;
    public Object b;
    public Object c;
    public Object d;
    private long e;
    private byte f;

    public vld() {
        throw null;
    }

    public final vle a() {
        CharSequence charSequence;
        if (this.f == 1 && (charSequence = this.a) != null) {
            Object obj = this.b;
            return new vle((Optional) obj, charSequence, this.e, (Optional) this.c, (Optional) this.d);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" messageText");
        }
        if (this.f == 0) {
            sb.append(" messageTimestamp");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(CharSequence charSequence) {
        if (charSequence != null) {
            this.a = charSequence;
            return;
        }
        throw new NullPointerException("Null messageText");
    }

    public final void c(long j) {
        this.e = j;
        this.f = (byte) 1;
    }

    public final inf d() {
        CharSequence charSequence;
        Object obj;
        Object obj2;
        if (this.f == 1 && (charSequence = this.a) != null && (obj = this.c) != null && (obj2 = this.b) != null) {
            return new inf((String) charSequence, (Uri) obj, (ameb) obj2, (myz) this.d, this.e);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" contentType");
        }
        if (this.c == null) {
            sb.append(" uri");
        }
        if (this.b == null) {
            sb.append(" contentSource");
        }
        if (this.f == 0) {
            sb.append(" fileSize");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void e(ameb amebVar) {
        if (amebVar != null) {
            this.b = amebVar;
            return;
        }
        throw new NullPointerException("Null contentSource");
    }

    public final void f(long j) {
        this.e = j;
        this.f = (byte) 1;
    }

    public final void g(Uri uri) {
        if (uri != null) {
            this.c = uri;
            return;
        }
        throw new NullPointerException("Null uri");
    }

    public vld(char[] cArr) {
    }

    public vld(byte[] bArr) {
        this.b = Optional.empty();
        this.c = Optional.empty();
        this.d = Optional.empty();
    }
}
