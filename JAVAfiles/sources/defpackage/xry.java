package defpackage;

import android.net.Uri;
import com.google.android.rcs.client.messaging.data.ContentType;
import j$.time.Duration;
import j$.util.Optional;
import j$.util.OptionalLong;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xry {
    private Optional a;
    private Optional b;
    private Uri c;
    private Optional d;
    private OptionalLong e;
    private Optional f;
    private Optional g;

    public xry() {
        throw null;
    }

    public final xrz a() {
        this.a.ifPresent(new xpw(this, 5));
        if (this.c != null) {
            return new xrz(this.a, this.b, this.c, this.d, this.e, this.f, this.g);
        }
        throw new IllegalStateException("Missing required properties: contentUri");
    }

    public final void b(Duration duration) {
        this.a = Optional.ofNullable(duration);
    }

    public final void c(ContentType contentType) {
        this.b = Optional.ofNullable(contentType);
    }

    public final void d(Uri uri) {
        if (uri != null) {
            this.c = uri;
            return;
        }
        throw new NullPointerException("Null contentUri");
    }

    public final void e(String str) {
        this.d = Optional.ofNullable(str);
    }

    public final void f(long j) {
        this.e = OptionalLong.of(j);
    }

    public final void g(ContentType contentType) {
        this.f = Optional.of(contentType);
    }

    public final void h(aozb aozbVar) {
        this.g = Optional.of(aozbVar);
    }

    public xry(byte[] bArr) {
        this.a = Optional.empty();
        this.b = Optional.empty();
        this.d = Optional.empty();
        this.e = OptionalLong.empty();
        this.f = Optional.empty();
        this.g = Optional.empty();
    }
}
