package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afyd extends arpw implements arqz {
    /* synthetic */ Object a;
    /* synthetic */ Object b;
    /* synthetic */ Object c;
    /* synthetic */ Object d;
    /* synthetic */ int e;
    final /* synthetic */ afye f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afyd(afye afyeVar, arpe arpeVar) {
        super(6, arpeVar);
        this.f = afyeVar;
    }

    @Override // defpackage.arqz
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        int intValue = ((Number) obj5).intValue();
        afyd afydVar = new afyd(this.f, (arpe) obj6);
        afydVar.a = (agdp) obj;
        afydVar.b = (agaq) obj2;
        afydVar.c = (agfn) obj3;
        afydVar.d = (agfc) obj4;
        afydVar.e = intValue;
        return afydVar.b(arnb.a);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, agfc] */
    @Override // defpackage.arpq
    public final Object b(Object obj) {
        aqil.P(obj);
        Object obj2 = this.a;
        Object obj3 = this.b;
        Object obj4 = this.c;
        ?? r2 = this.d;
        int i = this.e;
        agaq agaqVar = agaq.a;
        agdp agdpVar = (agdp) obj2;
        int ordinal = agdpVar.ordinal();
        afye afyeVar = this.f;
        agcb agcbVar = null;
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        agcc p = afyeVar.p((agaq) obj3);
                        if (p instanceof agcb) {
                            return new agfd((agcb) p);
                        }
                        if (d.F(p, agbx.a)) {
                            return agev.a;
                        }
                        throw new armm();
                    }
                    throw new armm();
                }
            } else {
                int a = afyeVar.i.a(agdpVar);
                obj4.getClass();
                agfm agfmVar = (agfm) obj4;
                agcc p2 = afyeVar.p((agaq) obj3);
                if (p2 instanceof agcb) {
                    agcbVar = (agcb) p2;
                }
                if (agcbVar == null) {
                    agcbVar = new agca(0, afyeVar.c.a());
                }
                return new agex(r2, a, agfmVar, agcbVar);
            }
        }
        if (obj4 instanceof agfj) {
            agcc p3 = afyeVar.p((agaq) obj3);
            if (p3 instanceof agcb) {
                agcbVar = (agcb) p3;
            }
            if (agcbVar == null) {
                agcbVar = new agca(0, afyeVar.c.a());
            }
            return new agfd(agcbVar);
        }
        if (obj4 instanceof agfg) {
            return agev.a;
        }
        obj4.getClass();
        return new agew(r2, i, (agfm) obj4);
    }
}
