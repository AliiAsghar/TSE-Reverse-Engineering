package defpackage;

import android.location.Location;
import android.os.Handler;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class acdl implements acig {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ acdl(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.acig
    public final Object a(acir acirVar) {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    Exception g = acirVar.g();
                    boolean l = acirVar.l();
                    Object obj = this.a;
                    if (l) {
                        ((acit) obj).b(acirVar.h());
                    } else if (!((aciv) acirVar).c && g != null) {
                        ((acit) obj).a(g);
                    }
                    return ((acit) obj).a;
                }
                aozy createBuilder = anal.a.createBuilder();
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                Object obj2 = this.a;
                anal analVar = (anal) createBuilder.b;
                analVar.c = 1;
                analVar.b = 1 | analVar.b;
                anal analVar2 = (anal) createBuilder.s();
                ahiy ahiyVar = ((ahxl) obj2).c;
                aozy d = ahop.d((aicm) ahiyVar.a, 3, 3);
                if (!d.b.isMutable()) {
                    d.u();
                }
                anah anahVar = (anah) d.b;
                anah anahVar2 = anah.a;
                anahVar.d = 5;
                anahVar.b = 2 | anahVar.b;
                if (!d.b.isMutable()) {
                    d.u();
                }
                anah anahVar3 = (anah) d.b;
                analVar2.getClass();
                anahVar3.g = analVar2;
                anahVar3.b |= 512;
                String a = ((ahyr) ahiyVar.c).a();
                if (!d.b.isMutable()) {
                    d.u();
                }
                anah anahVar4 = (anah) d.b;
                a.getClass();
                anahVar4.b |= 1073741824;
                anahVar4.m = a;
                ahiyVar.e((anah) d.s());
                ahxl.j(new ahka("GetPhotoMedia"));
                return (aibp) acirVar.h();
            }
            Object obj3 = this.a;
            if (((acce) obj3).m) {
                abrc abrcVar = (abrc) obj3;
                abso absoVar = abrcVar.j;
                znp znpVar = new znp(abrcVar.f);
                Handler handler = absoVar.o;
                handler.sendMessage(handler.obtainMessage(14, znpVar));
                return ((acit) znpVar.b).a;
            }
            return actx.s(true);
        }
        aaoc aaocVar = acdo.a;
        boolean l2 = acirVar.l();
        Object obj4 = this.a;
        if (l2) {
            ((acit) obj4).d((Location) acirVar.h());
            return null;
        }
        Exception g2 = acirVar.g();
        g2.getClass();
        ((acit) obj4).c(g2);
        return null;
    }
}
