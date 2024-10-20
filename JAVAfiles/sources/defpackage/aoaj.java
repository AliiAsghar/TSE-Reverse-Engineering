package defpackage;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class aoaj implements annk {
    private final List a;
    private final annk b;

    public aoaj(List list, annk annkVar) {
        this.a = list;
        this.b = annkVar;
    }

    @Override // defpackage.annk
    public final InputStream a(InputStream inputStream, byte[] bArr) {
        return new aoag(this.a, inputStream, bArr);
    }

    @Override // defpackage.annk
    public final OutputStream b(OutputStream outputStream, byte[] bArr) {
        return this.b.b(outputStream, bArr);
    }
}
