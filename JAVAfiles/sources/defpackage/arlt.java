package defpackage;

import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class arlt {
    public final Object a;
    public final aqtz b;
    final /* synthetic */ arlv e;
    public aqtx d = new aqtq(aqtt.a);
    public aqsd c = aqsd.CONNECTING;

    public arlt(arlv arlvVar, Object obj, aqtp aqtpVar) {
        this.e = arlvVar;
        this.a = obj;
        this.b = aqtpVar.a(a());
    }

    protected arls a() {
        return new arls(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void b() {
        this.b.e();
        this.c = aqsd.SHUTDOWN;
        arlv.f.logp(Level.FINE, "io.grpc.util.MultiChildLoadBalancer$ChildLbState", "shutdown", "Child balancer {0} deleted", this.a);
    }

    public final String toString() {
        return "Address = " + String.valueOf(this.a) + ", state = " + String.valueOf(this.c) + ", picker type: " + String.valueOf(this.d.getClass()) + ", lb: " + String.valueOf(this.b);
    }
}
