package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class frb extends ewo implements frd {
    private final frl c;

    public frb(frl frlVar) {
        super(new frf[2], new frg[2]);
        dzg.d(this.b == this.a.length);
        for (ewl ewlVar : this.a) {
            ewlVar.h(1024);
        }
        this.c = frlVar;
    }

    @Override // defpackage.ewo
    protected final /* synthetic */ ewj g(Throwable th) {
        return new fre(th);
    }

    @Override // defpackage.ewo
    protected final /* bridge */ /* synthetic */ ewj h(ewl ewlVar, ewm ewmVar, boolean z) {
        frf frfVar = (frf) ewlVar;
        frg frgVar = (frg) ewmVar;
        try {
            ByteBuffer byteBuffer = frfVar.d;
            dzg.g(byteBuffer);
            byte[] array = byteBuffer.array();
            int limit = byteBuffer.limit();
            if (z) {
                this.c.c();
            }
            frgVar.i(frfVar.f, this.c.a(array, 0, limit), frfVar.h);
            frgVar.d = false;
            return null;
        } catch (fre e) {
            return e;
        }
    }

    @Override // defpackage.ewo
    protected final /* synthetic */ ewl i() {
        return new frf();
    }

    @Override // defpackage.ewo
    protected final /* synthetic */ ewm k() {
        return new fra(this);
    }

    protected frb() {
        super(new frf[2], new frg[2]);
        dzg.d(this.b == this.a.length);
        for (ewl ewlVar : this.a) {
            ewlVar.h(1024);
        }
    }

    @Override // defpackage.frd
    public final void p(long j) {
    }
}
