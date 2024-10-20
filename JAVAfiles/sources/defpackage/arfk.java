package defpackage;

import java.io.OutputStream;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class arfk extends aqzg {
    final ByteBuffer a;

    public arfk(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        this.a = byteBuffer;
    }

    @Override // defpackage.aqzg, defpackage.arfh
    public final void b() {
        this.a.mark();
    }

    @Override // defpackage.aqzg, defpackage.arfh
    public final void c() {
        this.a.reset();
    }

    @Override // defpackage.aqzg, defpackage.arfh
    public final boolean d() {
        return true;
    }

    @Override // defpackage.arfh
    public final int e() {
        a(1);
        return this.a.get() & 255;
    }

    @Override // defpackage.arfh
    public final int f() {
        return this.a.remaining();
    }

    @Override // defpackage.arfh
    public final /* bridge */ /* synthetic */ arfh g(int i) {
        a(i);
        ByteBuffer byteBuffer = this.a;
        ByteBuffer duplicate = byteBuffer.duplicate();
        duplicate.limit(byteBuffer.position() + i);
        this.a.position(this.a.position() + i);
        return new arfk(duplicate);
    }

    @Override // defpackage.arfh
    public final void i(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        int remaining = byteBuffer.remaining();
        a(remaining);
        ByteBuffer byteBuffer2 = this.a;
        int limit = byteBuffer2.limit();
        this.a.limit(byteBuffer2.position() + remaining);
        byteBuffer.put(this.a);
        this.a.limit(limit);
    }

    @Override // defpackage.arfh
    public final void j(OutputStream outputStream, int i) {
        a(i);
        if (this.a.hasArray()) {
            ByteBuffer byteBuffer = this.a;
            outputStream.write(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), i);
            ByteBuffer byteBuffer2 = this.a;
            byteBuffer2.position(byteBuffer2.position() + i);
            return;
        }
        byte[] bArr = new byte[i];
        this.a.get(bArr);
        outputStream.write(bArr);
    }

    @Override // defpackage.arfh
    public final void k(byte[] bArr, int i, int i2) {
        a(i2);
        this.a.get(bArr, i, i2);
    }

    @Override // defpackage.arfh
    public final void l(int i) {
        a(i);
        this.a.position(this.a.position() + i);
    }
}
