package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class arew extends aqtx {
    final /* synthetic */ arey a;
    private final arey b;
    private final AtomicBoolean c = new AtomicBoolean(false);

    public arew(arey areyVar, arey areyVar2) {
        this.a = areyVar;
        this.b = areyVar2;
    }

    @Override // defpackage.aqtx
    public final aqtt a(aqtu aqtuVar) {
        if (this.c.compareAndSet(false, true)) {
            this.a.g.c().execute(new arer(this.b, 3, null));
        }
        return aqtt.a;
    }
}
