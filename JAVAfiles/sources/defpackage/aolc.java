package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aolc implements aolh {
    private final /* synthetic */ int a;
    private final Object b;

    public aolc(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.aolh
    public final /* synthetic */ aolq a() {
        if (this.a != 0) {
            return aolq.a;
        }
        return aolq.a;
    }

    @Override // defpackage.aolh
    public final /* synthetic */ aolq b() {
        if (this.a != 0) {
            return aolq.a;
        }
        return aolq.a;
    }

    @Override // defpackage.aolh
    public final /* synthetic */ aolq f(atii atiiVar) {
        if (this.a != 0) {
            return aolq.a;
        }
        return aolq.a;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [aojy, java.lang.Object] */
    @Override // defpackage.aolh
    public final aolq g(atii atiiVar) {
        boolean z;
        if (this.a != 0) {
            aqrr aqrrVar = (aqrr) atiiVar.d;
            if (aqrrVar.f(aojs.a) == null) {
                z = true;
            } else {
                z = false;
            }
            albo.U(z, "ChannelConfig provided twice");
            return new aolq(1, null, null, aqrrVar.e(aojs.a, this.b));
        }
        albo.U(true, "Cronet does not support CallOptions.withAuthority(). See https://github.com/grpc/grpc-java/issues/1767");
        Object obj = atiiVar.d;
        aqrr aqrrVar2 = (aqrr) obj;
        aojx aojxVar = (aojx) aqrrVar2.f(aojx.a);
        if (aojxVar == null) {
            aojxVar = this.b.b(((aqux) atiiVar.c).b);
            aojxVar.getClass();
            obj = aqrrVar2.e(aojx.a, aojxVar);
        }
        return new aolq(1, null, null, ((aqrr) obj).e(agqq.a, aojxVar.a()));
    }

    @Override // defpackage.aolh
    public final /* synthetic */ void c() {
    }

    @Override // defpackage.aolh
    public final /* synthetic */ void d() {
    }

    @Override // defpackage.aolh
    public final /* synthetic */ void e(aojh aojhVar) {
    }
}
