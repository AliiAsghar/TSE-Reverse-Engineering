package defpackage;

import android.graphics.Bitmap;
import android.view.Surface;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class eyw implements exu {
    private final Object a = new Object();
    private ezb b;
    protected final ezc l;

    public eyw(ezc ezcVar) {
        this.l = ezcVar;
    }

    public abstract int a();

    /* JADX INFO: Access modifiers changed from: protected */
    public void b() {
        synchronized (this.a) {
            ezb ezbVar = this.b;
            if (ezbVar != null) {
                this.l.f(ezbVar);
            }
        }
    }

    @Override // defpackage.exu
    public /* synthetic */ void d() {
        throw null;
    }

    public abstract void e();

    public abstract void f(exw exwVar);

    public abstract void g();

    public void h(Bitmap bitmap, eqo eqoVar, etl etlVar) {
        throw new UnsupportedOperationException();
    }

    public Surface i() {
        throw new UnsupportedOperationException();
    }

    public void m(eqo eqoVar) {
        throw new UnsupportedOperationException();
    }

    public final void r(ezb ezbVar) {
        synchronized (this.a) {
            this.b = ezbVar;
        }
    }

    @Override // defpackage.exu
    public final void u() {
        this.l.d(new ewt(this, 20));
    }

    public void w(int i, long j) {
        throw new UnsupportedOperationException();
    }

    public void x(qdq qdqVar) {
        throw new UnsupportedOperationException();
    }

    public void k() {
    }

    public void n() {
    }

    @Override // defpackage.exu
    public /* synthetic */ void v(eqq eqqVar) {
    }

    public void q(eqo eqoVar, boolean z) {
    }
}
