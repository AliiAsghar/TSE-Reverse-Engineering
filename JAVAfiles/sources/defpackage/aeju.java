package defpackage;

import android.view.KeyEvent;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aeju extends arrp implements arqr {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aeju(Object obj, int i) {
        super(1);
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v17, types: [byn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v19, types: [byn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v20, types: [byn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v24, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v26, types: [byj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v29, types: [byj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v15, types: [byn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v19, types: [byn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v22, types: [aemc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v56, types: [java.lang.Object, arqg] */
    /* JADX WARN: Type inference failed for: r8v58, types: [java.lang.Object, arqg] */
    @Override // defpackage.arqr
    public final /* synthetic */ Object a(Object obj) {
        boolean booleanValue;
        int i = 5;
        switch (this.b) {
            case 0:
                ((bxi) obj).getClass();
                return new kbe(this.a, 8);
            case 1:
                dho dhoVar = (dho) obj;
                dhoVar.getClass();
                Object obj2 = this.a;
                if (obj2 != null) {
                    dhl.f(dhoVar, (String) obj2);
                }
                return arnb.a;
            case 2:
                dho dhoVar2 = (dho) obj;
                dhoVar2.getClass();
                dhl.f(dhoVar2, (String) this.a);
                return arnb.a;
            case 3:
                ((aeiy) this.a).b.a(Float.valueOf(((Number) obj).floatValue()));
                return arnb.a;
            case 4:
                dho dhoVar3 = (dho) obj;
                dhoVar3.getClass();
                dhl.f(dhoVar3, (String) this.a);
                return arnb.a;
            case 5:
                diy diyVar = (diy) obj;
                diyVar.getClass();
                if (diyVar.e() <= 3) {
                    i = 3;
                }
                this.a.h(new dqi(i));
                return arnb.a;
            case 6:
                diy diyVar2 = (diy) obj;
                diyVar2.getClass();
                if (diyVar2.e() <= 3) {
                    i = 3;
                }
                this.a.h(new dqi(i));
                return arnb.a;
            case 7:
                this.a.b().a();
                return arnb.a;
            case 8:
                ((aemb) this.a).h.a();
                return arnb.a;
            case 9:
                dho dhoVar4 = (dho) obj;
                dhoVar4.getClass();
                String str = ((aeml) this.a).a;
                if (str != null) {
                    dhl.f(dhoVar4, str);
                }
                return arnb.a;
            case 10:
                ((aya) obj).getClass();
                ((aenr) this.a).d.b.a();
                return arnb.a;
            case 11:
                ((bxi) obj).getClass();
                Object obj3 = this.a;
                if (obj3 != null) {
                    ((aeph) obj3).a.a();
                }
                return new kbe(this.a, 9);
            case 12:
                cnt cntVar = (cnt) obj;
                cntVar.getClass();
                booleanValue = ((Boolean) this.a.a()).booleanValue();
                if (booleanValue) {
                    cntVar.p();
                }
                return arnb.a;
            case 13:
                ciy ciyVar = (ciy) obj;
                ciyVar.getClass();
                this.a.h(Boolean.valueOf(ciyVar.b()));
                return arnb.a;
            case 14:
                ciy ciyVar2 = (ciy) obj;
                ciyVar2.getClass();
                this.a.h(Boolean.valueOf(ciyVar2.b()));
                return arnb.a;
            case 15:
                KeyEvent keyEvent = ((cps) obj).a;
                keyEvent.getClass();
                if (a.bB(cpt.b(keyEvent), cpr.i)) {
                    this.a.a();
                }
                return false;
            case 16:
                ((aya) obj).getClass();
                this.a.a();
                return arnb.a;
            case 17:
                String str2 = (String) obj;
                str2.getClass();
                this.a.a(str2);
                return arnb.a;
            case 18:
                this.a.get(((Number) obj).intValue());
                return null;
            case 19:
                aos aosVar = (aos) obj;
                aosVar.getClass();
                ?? r0 = this.a;
                aosVar.b(r0.size(), null, new aeju(r0, 18), new cdj(-632812321, true, new jle(r0, 14)));
                return arnb.a;
            default:
                cle cleVar = (cle) obj;
                cleVar.getClass();
                if (agkx.u(this.a) == brg.a) {
                    this.a.d(Float.intBitsToFloat((int) (cleVar.a() & 4294967295L)));
                }
                return arnb.a;
        }
    }
}
