package defpackage;

import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class pwn implements pxe {
    private final UrlRequest a;

    public pwn(UrlRequest urlRequest) {
        this.a = urlRequest;
    }

    @Override // defpackage.pxe
    public final void a() {
        this.a.cancel();
    }

    @Override // defpackage.pxe
    public final void b() {
        this.a.start();
    }
}
