package defpackage;

import com.android.vcard.VCardBuilder;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class asob implements asro {
    final /* synthetic */ asog a;
    private final asra b;
    private boolean c;

    public asob(asog asogVar) {
        this.a = asogVar;
        this.b = new asra(asogVar.d.a());
    }

    @Override // defpackage.asro
    public final asrs a() {
        return this.b;
    }

    @Override // defpackage.asro, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.c) {
            return;
        }
        this.c = true;
        this.a.d.Z("0\r\n\r\n");
        asog.l(this.b);
        this.a.e = 3;
    }

    @Override // defpackage.asro, java.io.Flushable
    public final synchronized void flush() {
        if (this.c) {
            return;
        }
        this.a.d.flush();
    }

    @Override // defpackage.asro
    public final void hq(asqu asquVar, long j) {
        if (!this.c) {
            asri asriVar = (asri) this.a.d;
            if (!asriVar.c) {
                asriVar.b.V(j);
                asriVar.c();
                this.a.d.Z(VCardBuilder.VCARD_END_OF_LINE);
                this.a.d.hq(asquVar, j);
                this.a.d.Z(VCardBuilder.VCARD_END_OF_LINE);
                return;
            }
            throw new IllegalStateException("closed");
        }
        throw new IllegalStateException("closed");
    }
}
