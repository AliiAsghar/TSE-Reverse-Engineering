package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ambb extends amba {
    final ambc a;
    final /* synthetic */ ambd b;

    public ambb(ambd ambdVar, int i) {
        this.b = ambdVar;
        this.a = new ambc(i);
    }

    @Override // defpackage.ambl
    public final void c(byte b) {
        this.a.write(b);
    }

    @Override // defpackage.amba, defpackage.ambl
    public final void f(ByteBuffer byteBuffer) {
        this.a.b(byteBuffer);
    }

    @Override // defpackage.amba, defpackage.ambl
    public final void g(byte[] bArr, int i) {
        this.a.write(bArr, 0, i);
    }

    @Override // defpackage.ambl
    public final ambj q() {
        ambc ambcVar = this.a;
        return this.b.e(ambcVar.c(), ambcVar.a());
    }
}
