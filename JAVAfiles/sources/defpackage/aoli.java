package defpackage;

import io.grpc.Status;
import io.grpc.StatusException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aoli implements aqrv {
    private final armf a;
    private final Class b;
    private final Class c;

    public aoli(armf armfVar, Class cls, Class cls2) {
        this.a = armfVar;
        this.b = cls;
        this.c = cls2;
    }

    @Override // defpackage.aqrv
    public final aqru a(aqux aquxVar, aqrr aqrrVar, aqrs aqrsVar) {
        try {
            Object b = this.a.b();
            aotl.E(aquxVar, this.b, true);
            aotl.E(aquxVar, this.c, false);
            return new aolp(new aoln(aqrsVar, aquxVar, aqrrVar, (alog) b));
        } catch (StatusException e) {
            return new aomh(Status.c(e));
        }
    }
}
