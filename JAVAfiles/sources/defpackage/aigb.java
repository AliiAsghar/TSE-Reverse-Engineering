package defpackage;

import java.io.OutputStream;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class aigb extends aifi {
    final /* synthetic */ aigc a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aigb(aigc aigcVar, OutputStream outputStream) {
        super(outputStream);
        this.a = aigcVar;
    }

    @Override // defpackage.aifi, java.io.OutputStream, java.io.Flushable
    public final void flush() {
        this.a.d();
        super.flush();
    }

    @Override // defpackage.aifi, java.io.OutputStream
    public final void write(int i) {
        this.a.d();
        super.write(i);
    }

    @Override // defpackage.aifi, java.io.OutputStream
    public final void write(byte[] bArr) {
        this.a.d();
        super.write(bArr);
    }

    @Override // defpackage.aifi, java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        this.a.d();
        super.write(bArr, i, i2);
    }
}
