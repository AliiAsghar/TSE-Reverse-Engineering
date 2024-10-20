package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aqzo {
    public final aqtr a;
    public aqtz b;
    public aqua c;
    final /* synthetic */ asmb d;

    public aqzo(asmb asmbVar, aqtr aqtrVar) {
        this.d = asmbVar;
        this.a = aqtrVar;
        aqua a = ((aqub) asmbVar.a).a((String) asmbVar.b);
        this.c = a;
        if (a != null) {
            this.b = a.a(aqtrVar);
            return;
        }
        throw new IllegalStateException("Could not find policy '" + ((String) asmbVar.b) + "'. Make sure its implementation is either registered to LoadBalancerRegistry or included in META-INF/services/io.grpc.LoadBalancerProvider from your jar files.");
    }
}
