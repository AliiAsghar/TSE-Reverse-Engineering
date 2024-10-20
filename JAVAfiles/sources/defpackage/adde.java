package defpackage;

import com.google.android.rcs.client.messaging.data.ContentType;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adde implements adaf {
    private String a;
    private final alob b;
    private ajur c = new ajur(null);

    public adde(alob alobVar) {
        this.b = alobVar;
    }

    @Override // defpackage.adaf
    public final void a() {
        this.c = new ajur(null);
    }

    @Override // defpackage.adaf
    public final void b(byte[] bArr) {
        try {
            ajur ajurVar = this.c;
            ajurVar.n(ContentType.d(this.a));
            ajurVar.m(aozb.w(bArr));
        } catch (NullPointerException e) {
            throw new IOException("Error parsing content type in multi part CPIM message", e);
        }
    }

    @Override // defpackage.adaf
    public final void c() {
        this.b.h(ajki.i(this.c.l()));
        this.c = new ajur(null);
        this.a = "";
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.CharSequence, java.lang.Object] */
    @Override // defpackage.adaf
    public final void d(adxq adxqVar) {
        if (albo.ar(adxqVar.a, assi.a)) {
            this.a = (String) adxqVar.b;
        }
    }
}
