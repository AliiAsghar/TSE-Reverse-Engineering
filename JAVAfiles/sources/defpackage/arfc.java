package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class arfc extends aqtx {
    public final aqtw a;
    final /* synthetic */ arfd b;
    private final AtomicBoolean c = new AtomicBoolean(false);

    public arfc(arfd arfdVar, aqtw aqtwVar) {
        this.b = arfdVar;
        this.a = aqtwVar;
    }

    @Override // defpackage.aqtx
    public final aqtt a(aqtu aqtuVar) {
        if (this.c.compareAndSet(false, true)) {
            this.b.f.c().execute(new arer(this, 4));
        }
        return aqtt.a;
    }
}
