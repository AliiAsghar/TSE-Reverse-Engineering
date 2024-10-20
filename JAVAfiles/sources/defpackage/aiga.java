package defpackage;

import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class aiga extends aifh {
    final /* synthetic */ aigc a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aiga(aigc aigcVar, InputStream inputStream) {
        super(inputStream);
        this.a = aigcVar;
    }

    @Override // defpackage.aifh, java.io.InputStream
    public final int available() {
        this.a.d();
        return super.available();
    }

    @Override // defpackage.aifh, java.io.InputStream
    public final int read() {
        this.a.d();
        return super.read();
    }

    @Override // defpackage.aifh, java.io.InputStream
    public final int read(byte[] bArr) {
        this.a.d();
        return super.read(bArr);
    }

    @Override // defpackage.aifh, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        this.a.d();
        return super.read(bArr, i, i2);
    }
}
