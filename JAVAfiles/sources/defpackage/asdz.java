package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class asdz extends arps implements asaj, arpt {
    public final asaj a;
    public final arpi b;
    public final int c;
    private arpi d;
    private arpe e;

    public asdz(asaj asajVar, arpi arpiVar) {
        super(asdw.a, arpj.a);
        this.a = asajVar;
        this.b = arpiVar;
        this.c = ((Number) arpiVar.fold(0, afup.t)).intValue();
    }

    @Override // defpackage.arpq
    protected final Object b(Object obj) {
        Throwable c = armq.c(obj);
        if (c != null) {
            this.d = new asdt(c, u());
        }
        arpe arpeVar = this.e;
        if (arpeVar != null) {
            arpeVar.w(obj);
        }
        return arpl.a;
    }

    @Override // defpackage.arpq, defpackage.arpt
    public final arpt dJ() {
        arpe arpeVar = this.e;
        if (arpeVar instanceof arpt) {
            return (arpt) arpeVar;
        }
        return null;
    }

    @Override // defpackage.asaj
    public final Object fv(Object obj, arpe arpeVar) {
        try {
            arpi u = arpeVar.u();
            arwi.y(u);
            arpi arpiVar = this.d;
            if (arpiVar != u) {
                if (!(arpiVar instanceof asdt)) {
                    if (((Number) u.fold(0, new ahhd(this, 4))).intValue() == this.c) {
                        this.d = u;
                    } else {
                        throw new IllegalStateException("Flow invariant is violated:\n\t\tFlow was collected in " + this.b + ",\n\t\tbut emission happened in " + u + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead");
                    }
                } else {
                    throw new IllegalStateException(arsd.q("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((asdt) arpiVar).a + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            "));
                }
            }
            this.e = arpeVar;
            arqw arqwVar = aseb.a;
            asaj asajVar = this.a;
            asajVar.getClass();
            Object a = arqwVar.a(asajVar, obj, this);
            if (!d.F(a, arpl.a)) {
                this.e = null;
            }
            arpl arplVar = arpl.a;
            if (a == arplVar) {
                arpeVar.getClass();
            }
            if (a == arplVar) {
                return a;
            }
            return arnb.a;
        } catch (Throwable th) {
            this.d = new asdt(th, arpeVar.u());
            throw th;
        }
    }

    @Override // defpackage.arps, defpackage.arpq
    public final void g() {
        super.g();
    }

    @Override // defpackage.arps, defpackage.arpe
    public final arpi u() {
        arpi arpiVar = this.d;
        if (arpiVar == null) {
            return arpj.a;
        }
        return arpiVar;
    }

    @Override // defpackage.arpq, defpackage.arpt
    public final void dK() {
    }
}
