package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class aole extends aqrs {
    private final akbj a;
    private final String b;
    private final Executor c;

    public aole(aokc aokcVar, aokb aokbVar, Executor executor) {
        this.b = aokbVar.c.getAuthority();
        this.c = aokbVar.e;
        this.a = new akbj(new akiq(aokcVar, aokbVar, 11, null), executor);
    }

    @Override // defpackage.aqrs
    public final aqru a(aqux aquxVar, aqrr aqrrVar) {
        agqr.a();
        ListenableFuture c = this.a.c();
        ajzr ajzrVar = new ajzr(aquxVar, aqrrVar, 5, null);
        Executor executor = aqrrVar.c;
        if (executor == null) {
            executor = this.c;
        }
        return new aold(aktp.Y(c, ajzrVar, executor));
    }

    @Override // defpackage.aqrs
    public final String b() {
        return this.b;
    }
}
