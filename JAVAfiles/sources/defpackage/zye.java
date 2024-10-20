package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zye extends arpw implements arra {
    /* synthetic */ Object a;
    /* synthetic */ Object b;
    /* synthetic */ Object c;
    /* synthetic */ Object d;
    /* synthetic */ Object e;
    /* synthetic */ Object f;

    public zye(arpe arpeVar) {
        super(7, arpeVar);
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        boolean z;
        boolean z2;
        aqil.P(obj);
        Object obj2 = this.a;
        Object obj3 = this.b;
        Object obj4 = this.c;
        Object obj5 = this.d;
        Object obj6 = this.e;
        Object obj7 = this.f;
        obj3.getClass();
        mll mllVar = (mll) obj3;
        amjj x = mllVar.x();
        mjq mjqVar = ((mwc) obj2).c;
        amjj amjjVar = amjj.SEND_MODE_XMS;
        if (!mjqVar.h && !mllVar.p()) {
            z = false;
        } else {
            z = true;
        }
        aron aronVar = new aron((byte[]) null);
        if (obj7 != null) {
            aehz aehzVar = (aehz) obj7;
            aerb aerbVar = aehzVar.b;
            aerbVar.getClass();
            aronVar.add(new zyj(new aeth(aehzVar.a, null, null, null, new aete(aerbVar), aehzVar.j, 94)));
        }
        aehz aehzVar2 = (aehz) obj4;
        String str = aehzVar2.a;
        aerb aerbVar2 = aehzVar2.b;
        aerbVar2.getClass();
        aronVar.add(new zyj(new aeth(str, null, null, null, new aete(aerbVar2), aehzVar2.j, 94)));
        if (z && obj5 != null) {
            if (x == amjjVar) {
                z2 = true;
            } else {
                z2 = false;
            }
            zni zniVar = new zni(obj5, 17);
            aehz aehzVar3 = (aehz) obj5;
            aronVar.add(new zyj(new aetb(aehzVar3.a, aehzVar3.b, z2, zniVar)));
        }
        if (obj6 != null) {
            aehz aehzVar4 = (aehz) obj6;
            aerb aerbVar3 = aehzVar4.b;
            aerbVar3.getClass();
            aronVar.add(new zyj(new aeth(aehzVar4.a, null, null, null, new aete(aerbVar3), aehzVar4.j, 94), 2));
        }
        return new zyc(alzz.aZ(aqjn.x(aronVar)));
    }

    @Override // defpackage.arra
    public final /* bridge */ /* synthetic */ Object i(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        zye zyeVar = new zye((arpe) obj7);
        zyeVar.a = (mwc) obj;
        zyeVar.b = (miu) obj2;
        zyeVar.c = (aehz) obj3;
        zyeVar.d = (aehz) obj4;
        zyeVar.e = (aehz) obj5;
        zyeVar.f = (aehz) obj6;
        return zyeVar.b(arnb.a);
    }
}
