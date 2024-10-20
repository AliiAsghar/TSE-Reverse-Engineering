package defpackage;

import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class areh implements arhp {
    private InputStream a;

    public areh(InputStream inputStream) {
        this.a = inputStream;
    }

    @Override // defpackage.arhp
    public final InputStream g() {
        InputStream inputStream = this.a;
        this.a = null;
        return inputStream;
    }
}
