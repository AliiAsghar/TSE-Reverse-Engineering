package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kfr extends arpw implements arqv {
    /* synthetic */ Object a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kfr(iqa iqaVar, aapn aapnVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.d = i;
        this.b = iqaVar;
        this.c = aapnVar;
    }

    @Override // defpackage.arqv
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        int i = this.d;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return ((kfr) c((zad) obj, (arpe) obj2)).b(arnb.a);
                }
                return ((kfr) c((zad) obj, (arpe) obj2)).b(arnb.a);
            }
            return ((kfr) c((arwe) obj, (arpe) obj2)).b(arnb.a);
        }
        return ((kfr) c((mjb) obj, (arpe) obj2)).b(arnb.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v1, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v4, types: [msh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object, utz] */
    @Override // defpackage.arpq
    public final Object b(Object obj) {
        aewe z;
        boolean z2;
        int length;
        int i = this.d;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    aqil.P(obj);
                    zad zadVar = (zad) this.a;
                    zadVar.getClass();
                    Object obj2 = this.c;
                    obj2.getClass();
                    return new yzu(zadVar.b.a.toString(), new kdt((Object) zadVar, ((yzk) this.b).j, (zem) obj2, 14));
                }
                aqil.P(obj);
                zad zadVar2 = (zad) this.a;
                zadVar2.getClass();
                Object obj3 = this.b;
                obj3.getClass();
                mkh mkhVar = zadVar2.b;
                alog alogVar = mkhVar.e;
                alogVar.getClass();
                lfl lflVar = (lfl) ((lhm) this.c).k;
                Object obj4 = lflVar.d;
                String l = mkhVar.a.toString();
                String d = ((iew) obj4).d(alogVar);
                boolean a = ((osd) lflVar.b.b()).a();
                mkh mkhVar2 = zadVar2.b;
                if (a) {
                    z = ((ico) lflVar.a.b()).f(mkhVar2, false);
                } else {
                    z = hwr.z(mkhVar2, false, 3);
                }
                alur it = mkhVar2.e.iterator();
                it.getClass();
                while (true) {
                    if (it.hasNext()) {
                        if (((lge) obj3).b(((agoe) it.next()).b)) {
                            z2 = true;
                            break;
                        }
                    } else {
                        z2 = false;
                        break;
                    }
                }
                if (((alsx) alogVar).c > 1) {
                    length = arsd.af(d).length();
                } else {
                    length = d.length();
                }
                return new lhr(l, new aesn(z, mkhVar.d, d, z2, aqjn.y(new aesi(2, 2, 0, length)), new raq((lfl) lflVar.c, mkhVar2, zadVar2.a, 1)), zadVar2.b.c);
            }
            aqil.P(obj);
            return arrn.I((arwe) this.a, null, null, new emz((iqa) this.b, (aapn) this.c, (arpe) null, 17), 3);
        }
        aqil.P(obj);
        mjb mjbVar = (mjb) this.a;
        lfl lflVar2 = ((kfs) this.b).i;
        int A = lflVar2.A();
        int B = lflVar2.B();
        int B2 = lflVar2.B();
        int i2 = B2 + B2;
        Object e = ((kfs) this.b).i.b.e();
        e.getClass();
        return dyg.f(new akee(new akee(new ghw(new gcn(B, 0, false, A, ((Number) e).intValue(), i2, 6), mjbVar, new kfq(this.b, this.c, 0)).a, new fzj((arpe) null, 6, (float[]) null), 10), new gbc((kfs) this.b, (arpe) null, 2), 3), ((kfs) this.b).b);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [mjd, java.lang.Object] */
    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        int i = this.d;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    kfr kfrVar = new kfr((yzk) this.b, (zem) this.c, arpeVar, 3);
                    kfrVar.a = obj;
                    return kfrVar;
                }
                kfr kfrVar2 = new kfr((lhm) this.c, (lge) this.b, arpeVar, 2);
                kfrVar2.a = obj;
                return kfrVar2;
            }
            kfr kfrVar3 = new kfr((iqa) this.b, (aapn) this.c, arpeVar, 1);
            kfrVar3.a = obj;
            return kfrVar3;
        }
        kfr kfrVar4 = new kfr((kfs) this.b, (mjd) this.c, arpeVar, 0);
        kfrVar4.a = obj;
        return kfrVar4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kfr(kfs kfsVar, mjd mjdVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.d = i;
        this.b = kfsVar;
        this.c = mjdVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kfr(lhm lhmVar, lge lgeVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.d = i;
        this.c = lhmVar;
        this.b = lgeVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kfr(yzk yzkVar, zem zemVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.d = i;
        this.b = yzkVar;
        this.c = zemVar;
    }
}
