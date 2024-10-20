package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agpa extends arpw implements arqv {
    int a;
    final /* synthetic */ Object b;
    private /* synthetic */ Object c;
    private final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agpa(agmq agmqVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.d = i;
        this.b = agmqVar;
    }

    @Override // defpackage.arqv
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        if (this.d != 0) {
            return ((agpa) c((asaj) obj, (arpe) obj2)).b(arnb.a);
        }
        return ((agpa) c((arzu) obj, (arpe) obj2)).b(arnb.a);
    }

    /* JADX WARN: Type inference failed for: r7v6, types: [agmq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v8, types: [agmq, java.lang.Object] */
    @Override // defpackage.arpq
    public final Object b(Object obj) {
        asaj asajVar;
        aglz cM;
        if (this.d != 0) {
            arpl arplVar = arpl.a;
            if (this.a != 0) {
                asajVar = (asaj) this.c;
                aqil.P(obj);
            } else {
                aqil.P(obj);
                asajVar = (asaj) this.c;
            }
            do {
                ?? r7 = this.b;
                if (r7.getPosition() != r7.getCount() && (cM = this.b.cM()) != null) {
                    this.c = asajVar;
                    this.a = 1;
                } else {
                    return arnb.a;
                }
            } while (asajVar.fv(cM, this) != arplVar);
            return arplVar;
        }
        arpl arplVar2 = arpl.a;
        if (this.a != 0) {
            aqil.P(obj);
        } else {
            aqil.P(obj);
            arzu arzuVar = (arzu) this.c;
            agpb agpbVar = new agpb(arzuVar);
            ((agoz) this.b).E(agpbVar);
            arhi.s(arzuVar, this.b);
            afzu afzuVar = new afzu(this.b, agpbVar, 8);
            this.a = 1;
            if (arhi.p(arzuVar, afzuVar, this) == arplVar2) {
                return arplVar2;
            }
        }
        return arnb.a;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [agmq, java.lang.Object] */
    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        if (this.d != 0) {
            agpa agpaVar = new agpa((agmq) this.b, arpeVar, 1);
            agpaVar.c = obj;
            return agpaVar;
        }
        agpa agpaVar2 = new agpa((agoz) this.b, arpeVar, 0);
        agpaVar2.c = obj;
        return agpaVar2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agpa(agoz agozVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.d = i;
        this.b = agozVar;
    }
}
