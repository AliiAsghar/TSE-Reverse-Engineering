package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qvt extends arpw implements arqv {
    int a;
    final /* synthetic */ long b;
    final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qvt(long j, abul abulVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.d = i;
        this.b = j;
        this.c = abulVar;
    }

    @Override // defpackage.arqv
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        int i = this.d;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return ((qvt) c((arwe) obj, (arpe) obj2)).b(arnb.a);
                }
                return ((qvt) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            }
            return ((qvt) c((arwe) obj, (arpe) obj2)).b(arnb.a);
        }
        return ((qvt) c((arwe) obj, (arpe) obj2)).b(arnb.a);
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        int i = this.d;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    arpl arplVar = arpl.a;
                    int i2 = this.a;
                    aqil.P(obj);
                    if (i2 == 0) {
                        long j = this.b;
                        this.a = 1;
                        if (arwi.m(j, this) == arplVar) {
                            return arplVar;
                        }
                    }
                    ((abul) this.c).b = null;
                    return arnb.a;
                }
                arpl arplVar2 = arpl.a;
                if (this.a != 0) {
                    aqil.P(obj);
                } else {
                    aqil.P(obj);
                    this.a = 1;
                    if (arnb.a == arplVar2) {
                        return arplVar2;
                    }
                }
                return arnb.a;
            }
            arpl arplVar3 = arpl.a;
            if (this.a != 0) {
                aqil.P(obj);
            } else {
                aqil.P(obj);
                akul a = ((mdc) this.c).b.a(new IllegalArgumentException("BugleComposeRow2 ComposeNavigationEvent duration exceeded INT_MAX: " + this.b));
                this.a = 1;
                if (arro.F(a, this) == arplVar3) {
                    return arplVar3;
                }
            }
            return arnb.a;
        }
        arpl arplVar4 = arpl.a;
        if (this.a != 0) {
            aqil.P(obj);
        } else {
            aqil.P(obj);
            this.a = 1;
            if (arnb.a == arplVar4) {
                return arplVar4;
            }
        }
        return arnb.a;
    }

    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        int i = this.d;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return new qvt(this.b, (abul) this.c, arpeVar, 3);
                }
                return new qvt((qwk) this.c, this.b, arpeVar, 2);
            }
            return new qvt((mdc) this.c, this.b, arpeVar, 1);
        }
        return new qvt((qvu) this.c, this.b, arpeVar, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qvt(mdc mdcVar, long j, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.d = i;
        this.c = mdcVar;
        this.b = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qvt(qvu qvuVar, long j, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.d = i;
        this.c = qvuVar;
        this.b = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qvt(qwk qwkVar, long j, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.d = i;
        this.c = qwkVar;
        this.b = j;
    }
}
