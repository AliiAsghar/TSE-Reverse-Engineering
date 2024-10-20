package defpackage;

import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class aobt implements annk {
    @Override // defpackage.annk
    public final InputStream a(InputStream inputStream, byte[] bArr) {
        return new aocg(this, inputStream, bArr);
    }

    @Override // defpackage.annk
    public final OutputStream b(OutputStream outputStream, byte[] bArr) {
        return new aoch(this, outputStream, bArr);
    }

    public abstract int c();

    public abstract int d();

    public abstract int e();

    public abstract int f();

    public abstract aoce g();

    public abstract aocf h(byte[] bArr);
}
