package defpackage;

import java.io.OutputStream;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aifv extends aifi implements aipf {
    private final aipl a;

    public aifv(OutputStream outputStream) {
        super(outputStream);
        this.a = aipl.i(aifo.f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void a() {
        super.close();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void b(byte[] bArr) {
        super.write(bArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void c(byte[] bArr, int i, int i2) {
        super.write(bArr, i, i2);
    }

    @Override // defpackage.aifi, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.c(aifo.CLOSING, new aify(new aifu(this, 0), 4), aifo.CLOSED);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void d(int i) {
        super.write(i);
    }

    @Override // defpackage.aipf
    public final void e(aipi aipiVar) {
        this.a.e(aipiVar);
    }

    @Override // defpackage.aifi, java.io.OutputStream
    public final void write(final int i) {
        this.a.b(aifo.ACTIVE, new aify(new aipb() { // from class: aift
            @Override // defpackage.aipb
            public final void a() {
                aifv.this.d(i);
            }
        }, 4));
    }

    @Override // defpackage.aifi, java.io.OutputStream
    public final void write(byte[] bArr) {
        this.a.b(aifo.ACTIVE, new aify(new aifz(this, bArr, 1), 4));
    }

    @Override // defpackage.aifi, java.io.OutputStream
    public final void write(final byte[] bArr, final int i, final int i2) {
        this.a.b(aifo.ACTIVE, new aify(new aipb() { // from class: aifs
            @Override // defpackage.aipb
            public final void a() {
                aifv.this.c(bArr, i, i2);
            }
        }, 4));
    }
}
