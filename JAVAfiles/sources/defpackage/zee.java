package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class zee extends arpw implements arqw {
    boolean a;
    int b;
    /* synthetic */ Object c;
    /* synthetic */ Object d;
    final /* synthetic */ zeh e;
    final /* synthetic */ lkd f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zee(zeh zehVar, lkd lkdVar, arpe arpeVar) {
        super(3, arpeVar);
        this.e = zehVar;
        this.f = lkdVar;
    }

    @Override // defpackage.arqw
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        zee zeeVar = new zee(this.e, this.f, (arpe) obj3);
        zeeVar.c = (nfw) obj;
        zeeVar.d = (zem) obj2;
        return zeeVar.b(arnb.a);
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        boolean z;
        boolean z2;
        aehz aehzVar;
        Context context;
        int intValue;
        arpl arplVar = arpl.a;
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                z2 = this.a;
                context = (Context) this.d;
                aehzVar = (aehz) this.c;
                aqil.P(obj);
                intValue = ((Number) obj).intValue();
            } else {
                z2 = this.a;
                context = (Context) this.d;
                aehzVar = (aehz) this.c;
                aqil.P(obj);
                intValue = ((Number) obj).intValue();
            }
        } else {
            aqil.P(obj);
            nfw nfwVar = (nfw) this.c;
            zem zemVar = (zem) this.d;
            boolean z3 = false;
            if (zemVar.d == zep.b && zemVar.a.size() <= zemVar.e.size()) {
                z = true;
            } else {
                z = false;
            }
            if (!((pny) this.e.e.b()).a() ? !this.e.i.a || this.e.b != null : this.e.b != null || z || this.f.f(llg.a)) {
                z3 = true;
            }
            zeh zehVar = this.e;
            aehz a = zehVar.a(z3, new kbx(zehVar, z, this.f, 3));
            zeh zehVar2 = this.e;
            boolean a2 = ((okf) zehVar2.d.b()).a();
            Context context2 = zehVar2.a;
            if (a2) {
                zeh zehVar3 = this.e;
                this.c = a;
                this.d = context2;
                this.a = z;
                this.b = 1;
                obj = zehVar3.c(nfwVar, zemVar, this);
                if (obj != arplVar) {
                    z2 = z;
                    aehzVar = a;
                    context = context2;
                    intValue = ((Number) obj).intValue();
                }
            } else {
                zeh zehVar4 = this.e;
                this.c = a;
                this.d = context2;
                this.a = z;
                this.b = 2;
                obj = zehVar4.d(zemVar, this);
                if (obj != arplVar) {
                    z2 = z;
                    aehzVar = a;
                    context = context2;
                    intValue = ((Number) obj).intValue();
                }
            }
            return arplVar;
        }
        aehz aehzVar2 = aehzVar;
        String string = context.getString(intValue);
        string.getClass();
        return new zea(new afaw(new afas(string, null, null, false, null, null, null, 254), aehzVar2, null, false, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 116), z2);
    }
}
