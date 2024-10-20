package defpackage;

import j$.util.Optional;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acnv {
    public aphx a;
    final /* synthetic */ acob b;
    private final String c;
    private final int d;

    public acnv(acob acobVar, String str, int i) {
        this.b = acobVar;
        this.c = str;
        this.d = i;
    }

    public final void a(aphy aphyVar) {
        this.b.e(this.d, this.c, 5, Optional.ofNullable(this.a), Optional.ofNullable(aphyVar));
    }

    public final void b(String str, int i, long j) {
        Optional ofNullable = Optional.ofNullable(this.a);
        aozy createBuilder = apih.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        apih apihVar = (apih) apagVar;
        apihVar.b |= 1;
        apihVar.c = i;
        int i2 = (int) j;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        apih apihVar2 = (apih) createBuilder.b;
        apihVar2.b |= 2;
        apihVar2.d = i2;
        aozy createBuilder2 = apib.a.createBuilder();
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        apib apibVar = (apib) createBuilder2.b;
        apih apihVar3 = (apih) createBuilder.s();
        apihVar3.getClass();
        apibVar.d = apihVar3;
        apibVar.c = 2;
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        apib apibVar2 = (apib) createBuilder2.b;
        apibVar2.e = 1;
        apibVar2.b |= 1;
        if (aczs.n()) {
            if (!createBuilder2.b.isMutable()) {
                createBuilder2.u();
            }
            apib apibVar3 = (apib) createBuilder2.b;
            str.getClass();
            apibVar3.b |= 4;
            apibVar3.g = str;
        }
        aozy g = acob.g(this.d, this.c, ofNullable);
        if (!g.b.isMutable()) {
            g.u();
        }
        acob acobVar = this.b;
        aphz aphzVar = (aphz) g.b;
        apib apibVar4 = (apib) createBuilder2.s();
        aphz aphzVar2 = aphz.a;
        apibVar4.getClass();
        aphzVar.d = apibVar4;
        aphzVar.b |= 2;
        acobVar.f(g);
    }

    public final void c(int i) {
        this.b.e(this.d, this.c, i, Optional.ofNullable(this.a), Optional.empty());
    }

    public final void d(String str, int i, Map map) {
        Optional ofNullable = Optional.ofNullable(this.a);
        aozy createBuilder = apig.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        apig apigVar = (apig) apagVar;
        apigVar.c = i - 1;
        apigVar.b |= 1;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        ((apig) createBuilder.b).a().putAll(map);
        aozy createBuilder2 = apib.a.createBuilder();
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        apib apibVar = (apib) createBuilder2.b;
        apig apigVar2 = (apig) createBuilder.s();
        apigVar2.getClass();
        apibVar.d = apigVar2;
        apibVar.c = 1;
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        apib apibVar2 = (apib) createBuilder2.b;
        apibVar2.e = 1;
        apibVar2.b |= 1;
        if (aczs.n()) {
            if (!createBuilder2.b.isMutable()) {
                createBuilder2.u();
            }
            apib apibVar3 = (apib) createBuilder2.b;
            str.getClass();
            apibVar3.b |= 4;
            apibVar3.g = str;
        }
        aozy g = acob.g(this.d, this.c, ofNullable);
        if (!g.b.isMutable()) {
            g.u();
        }
        acob acobVar = this.b;
        aphz aphzVar = (aphz) g.b;
        apib apibVar4 = (apib) createBuilder2.s();
        aphz aphzVar2 = aphz.a;
        apibVar4.getClass();
        aphzVar.d = apibVar4;
        aphzVar.b |= 2;
        acobVar.f(g);
    }

    public final void e(String str) {
        Optional ofNullable = Optional.ofNullable(this.a);
        aozy createBuilder = apia.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apia apiaVar = (apia) createBuilder.b;
        apiaVar.c = 2;
        apiaVar.b |= 1;
        aozy createBuilder2 = apib.a.createBuilder();
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        apib apibVar = (apib) createBuilder2.b;
        apia apiaVar2 = (apia) createBuilder.s();
        apiaVar2.getClass();
        apibVar.d = apiaVar2;
        apibVar.c = 3;
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        apib apibVar2 = (apib) createBuilder2.b;
        apibVar2.e = 1;
        apibVar2.b |= 1;
        if (aczs.n()) {
            if (!createBuilder2.b.isMutable()) {
                createBuilder2.u();
            }
            apib apibVar3 = (apib) createBuilder2.b;
            str.getClass();
            apibVar3.b |= 4;
            apibVar3.g = str;
        }
        aozy g = acob.g(this.d, this.c, ofNullable);
        if (!g.b.isMutable()) {
            g.u();
        }
        acob acobVar = this.b;
        aphz aphzVar = (aphz) g.b;
        apib apibVar4 = (apib) createBuilder2.s();
        aphz aphzVar2 = aphz.a;
        apibVar4.getClass();
        aphzVar.d = apibVar4;
        aphzVar.b |= 2;
        acobVar.f(g);
    }
}
