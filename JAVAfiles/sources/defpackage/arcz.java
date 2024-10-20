package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class arcz extends aqtx {
    final /* synthetic */ Throwable a;
    private final aqtt b;

    public arcz(Throwable th) {
        this.a = th;
        Status d = Status.m.withDescription("Panic! This is a bug!").d(th);
        aqtt aqttVar = aqtt.a;
        d.t(!d.f(), "drop status shouldn't be OK");
        this.b = new aqtt(null, d, true);
    }

    @Override // defpackage.aqtx
    public final aqtt a(aqtu aqtuVar) {
        return this.b;
    }

    public final String toString() {
        algv ai = albo.ai(arcz.class);
        ai.b("panicPickResult", this.b);
        return ai.toString();
    }
}
