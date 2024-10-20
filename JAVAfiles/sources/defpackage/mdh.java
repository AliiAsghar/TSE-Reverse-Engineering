package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mdh extends arpw implements arqv {
    int a;
    final /* synthetic */ int b;
    final /* synthetic */ long c;
    final /* synthetic */ int d;
    final /* synthetic */ mgu e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mdh(int i, int i2, long j, mgu mguVar, arpe arpeVar) {
        super(2, arpeVar);
        this.b = i;
        this.d = i2;
        this.c = j;
        this.e = mguVar;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((mdh) c((arwe) obj, (arpe) obj2)).b(arnb.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.arpq
    public final Object b(Object obj) {
        arpl arplVar = arpl.a;
        int i = this.a;
        aqil.P(obj);
        if (i == 0) {
            arrt d = ahow.d(this.b);
            d.g(ahji.aI());
            int i2 = this.d;
            long j = this.c;
            apae apaeVar = ahdg.a;
            aozy createBuilder = amoc.a.createBuilder();
            createBuilder.getClass();
            apaa apaaVar = (apaa) aptf.a.createBuilder();
            apaaVar.getClass();
            aozy createBuilder2 = apte.a.createBuilder();
            createBuilder2.getClass();
            int as = a.as(i2);
            if (!createBuilder2.b.isMutable()) {
                createBuilder2.u();
            }
            apte apteVar = (apte) createBuilder2.b;
            apteVar.b |= 1;
            apteVar.c = as;
            apag s = createBuilder2.s();
            s.getClass();
            apte apteVar2 = (apte) s;
            if (!apaaVar.b.isMutable()) {
                apaaVar.u();
            }
            aptf aptfVar = (aptf) apaaVar.b;
            aptfVar.c = apteVar2;
            aptfVar.b |= 2;
            aozn c = apdp.c(j);
            c.getClass();
            if (!apaaVar.b.isMutable()) {
                apaaVar.u();
            }
            aptf aptfVar2 = (aptf) apaaVar.b;
            aptfVar2.d = c;
            aptfVar2.b |= 4;
            MessageType s2 = apaaVar.s();
            s2.getClass();
            aptf aptfVar3 = (aptf) s2;
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            amoc amocVar = (amoc) createBuilder.b;
            amocVar.d = aptfVar3;
            amocVar.c |= 1;
            apag s3 = createBuilder.s();
            s3.getClass();
            d.f(new ahcr(apaeVar, (amoc) s3));
            d.f(lgb.N((ngu) this.e.h));
            mgu mguVar = this.e;
            ahow q = d.q();
            this.a = 1;
            if (mguVar.l(q, this) == arplVar) {
                return arplVar;
            }
        }
        return arnb.a;
    }

    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        return new mdh(this.b, this.d, this.c, this.e, arpeVar);
    }
}
