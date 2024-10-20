package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class bzc<T> extends bwv<T> {
    public bzc(arqg arqgVar) {
        super(arqgVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.bwv
    public final cax b(bzd bzdVar, cax caxVar) {
        bxk bxkVar = null;
        if (caxVar instanceof bxk) {
            if (bzdVar.d) {
                bxkVar = (bxk) caxVar;
                bxkVar.a.h(bzdVar.a());
            }
        } else if (caxVar instanceof cau) {
            if ((bzdVar.b || bzdVar.e != null) && !bzdVar.d) {
                cau cauVar = (cau) caxVar;
                if (d.F(bzdVar.a(), cauVar.a)) {
                    bxkVar = cauVar;
                }
            }
        } else if (caxVar instanceof bxb) {
            arqr arqrVar = ((bxb) caxVar).a;
        }
        if (bxkVar == null) {
            if (bzdVar.d) {
                Object obj = bzdVar.e;
                caj cajVar = bzdVar.c;
                if (cajVar == null) {
                    cajVar = cav.a;
                }
                return new bxk(new byu(obj, cajVar));
            }
            return new cau(bzdVar.a());
        }
        return bxkVar;
    }

    public abstract bzd c(Object obj);

    public final bzd d(Object obj) {
        bzd c = c(obj);
        c.f = false;
        return c;
    }
}
