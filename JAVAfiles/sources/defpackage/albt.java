package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class albt extends arpw implements arqv {
    int a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public albt(arqv arqvVar, Object obj, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.d = i;
        this.c = arqvVar;
        this.b = obj;
    }

    @Override // defpackage.arqv
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        int i = this.d;
        if (i != 0) {
            if (i != 1) {
                return ((albt) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            }
            return ((albt) c((arwe) obj, (arpe) obj2)).b(arnb.a);
        }
        return ((albt) c((arwe) obj, (arpe) obj2)).b(arnb.a);
    }

    /* JADX WARN: Type inference failed for: r2v5, types: [asaj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, arqv] */
    /* JADX WARN: Type inference failed for: r6v4, types: [asai, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v8, types: [asai, java.lang.Object] */
    @Override // defpackage.arpq
    public final Object b(Object obj) {
        int i = this.d;
        if (i != 0) {
            if (i != 1) {
                arpl arplVar = arpl.a;
                int i2 = this.a;
                aqil.P(obj);
                if (i2 == 0) {
                    ?? r6 = this.b;
                    ?? r2 = this.c;
                    this.a = 1;
                    if (r6.a(r2, this) == arplVar) {
                        return arplVar;
                    }
                }
                return arnb.a;
            }
            arpl arplVar2 = arpl.a;
            if (this.a != 0) {
                aqil.P(obj);
            } else {
                aqil.P(obj);
                ?? r62 = this.c;
                yzp yzpVar = new yzp(this.b, 14);
                this.a = 1;
                if (r62.a(yzpVar, this) == arplVar2) {
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
            ?? r63 = this.c;
            Object obj2 = this.b;
            this.a = 1;
            obj = r63.a(obj2, this);
            if (obj == arplVar3) {
                return arplVar3;
            }
        }
        return obj;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, arqv] */
    /* JADX WARN: Type inference failed for: r0v2, types: [asai, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [asai, java.lang.Object] */
    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        int i = this.d;
        if (i != 0) {
            if (i != 1) {
                return new albt((asai) this.b, (asec) this.c, arpeVar, 2);
            }
            return new albt((asai) this.c, (cez) this.b, arpeVar, 1);
        }
        return new albt((arqv) this.c, this.b, arpeVar, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public albt(asai asaiVar, asec asecVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.d = i;
        this.b = asaiVar;
        this.c = asecVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public albt(asai asaiVar, cez cezVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.d = i;
        this.c = asaiVar;
        this.b = cezVar;
    }
}
