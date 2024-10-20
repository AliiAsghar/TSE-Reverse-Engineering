package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class arvi extends arxp {
    public arwu a;
    public final arve b = new arve(null, arvf.a);
    final /* synthetic */ asmb c;
    private final arvo h;

    public arvi(asmb asmbVar, arvo arvoVar) {
        this.c = asmbVar;
        this.h = arvoVar;
    }

    @Override // defpackage.arxp
    public final void a(Throwable th) {
        if (th != null) {
            asfn I = ((arvp) this.h).I(new arvx(th), null);
            if (I != null) {
                this.h.a(I);
                arvj arvjVar = (arvj) this.b.a;
                if (arvjVar != null) {
                    arvjVar.a();
                    return;
                }
                return;
            }
            return;
        }
        if (((arvc) this.c.a).a() == 0) {
            arvo arvoVar = this.h;
            arwl[] arwlVarArr = (arwl[]) this.c.b;
            ArrayList arrayList = new ArrayList(arwlVarArr.length);
            for (arwl arwlVar : arwlVarArr) {
                arrayList.add(arwlVar.o());
            }
            arvoVar.w(arrayList);
        }
    }

    @Override // defpackage.arxp
    public final boolean b() {
        return false;
    }
}
