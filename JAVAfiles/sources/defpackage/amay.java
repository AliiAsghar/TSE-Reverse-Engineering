package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class amay extends amba {
    private final ByteBuffer a = ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN);

    private final void m(int i) {
        try {
            e(this.a.array(), i);
        } finally {
            this.a.clear();
        }
    }

    public abstract void a(byte b);

    public void b(ByteBuffer byteBuffer) {
        throw null;
    }

    @Override // defpackage.ambl
    public final void c(byte b) {
        a(b);
    }

    @Override // defpackage.amba
    public final void d(char c) {
        this.a.putChar(c);
        m(2);
    }

    protected void e(byte[] bArr, int i) {
        throw null;
    }

    @Override // defpackage.amba, defpackage.ambl
    public final void f(ByteBuffer byteBuffer) {
        b(byteBuffer);
    }

    @Override // defpackage.amba, defpackage.ambl
    public final void g(byte[] bArr, int i) {
        albo.S(0, i, bArr.length);
        e(bArr, i);
    }

    @Override // defpackage.amba, defpackage.ambl
    public final void h(int i) {
        this.a.putInt(i);
        m(4);
    }

    @Override // defpackage.amba, defpackage.ambl
    public final void i(long j) {
        this.a.putLong(j);
        m(8);
    }

    @Override // defpackage.amba, defpackage.ambl
    public final void j(byte[] bArr) {
        bArr.getClass();
        e(bArr, bArr.length);
    }
}
