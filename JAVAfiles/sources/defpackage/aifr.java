package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aifr extends aifh implements aipf {
    private final aipl a;

    public aifr(InputStream inputStream) {
        super(inputStream);
        this.a = aipl.i(aifo.f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ Integer a() {
        return Integer.valueOf(super.read());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ Integer b(byte[] bArr) {
        return Integer.valueOf(super.read(bArr));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ Integer c(byte[] bArr, int i, int i2) {
        return Integer.valueOf(super.read(bArr, i, i2));
    }

    @Override // defpackage.aifh, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.c(aifo.CLOSING, new aify(new aifu(this, 1), 4), aifo.CLOSED);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void d() {
        super.close();
    }

    @Override // defpackage.aipf
    public final void e(aipi aipiVar) {
        this.a.e(aipiVar);
    }

    @Override // defpackage.aifh, java.io.InputStream
    public final int read() {
        return ((Integer) this.a.b(aifo.ACTIVE, new aify(this, 1))).intValue();
    }

    @Override // defpackage.aifh, java.io.InputStream
    public final int read(final byte[] bArr) {
        return ((Integer) this.a.b(aifo.ACTIVE, new aipm() { // from class: aifp
            @Override // defpackage.aipm
            public final /* synthetic */ Class a() {
                return IOException.class;
            }

            @Override // defpackage.aipm
            public final Object b() {
                return aifr.this.b(bArr);
            }
        })).intValue();
    }

    @Override // defpackage.aifh, java.io.InputStream
    public final int read(final byte[] bArr, final int i, final int i2) {
        return ((Integer) this.a.b(aifo.ACTIVE, new aipm() { // from class: aifq
            @Override // defpackage.aipm
            public final /* synthetic */ Class a() {
                return IOException.class;
            }

            @Override // defpackage.aipm
            public final Object b() {
                return aifr.this.c(bArr, i, i2);
            }
        })).intValue();
    }
}
