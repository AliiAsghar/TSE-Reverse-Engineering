package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kae extends arpw implements arqw {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ qkg[] c;
    final /* synthetic */ jzz d;
    final /* synthetic */ kag e;
    final /* synthetic */ jzx f;
    private /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kae(arpe arpeVar, qkg[] qkgVarArr, jzz jzzVar, kag kagVar, jzx jzxVar) {
        super(3, arpeVar);
        this.c = qkgVarArr;
        this.d = jzzVar;
        this.e = kagVar;
        this.f = jzxVar;
    }

    @Override // defpackage.arqw
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        kae kaeVar = new kae((arpe) obj3, this.c, this.d, this.e, this.f);
        kaeVar.g = (asaj) obj;
        kaeVar.b = (Object[]) obj2;
        return kaeVar.b(arnb.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r2v1, types: [asaj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v3 */
    @Override // defpackage.arpq
    public final Object b(Object obj) {
        aeva aevaVar;
        arpl arplVar = arpl.a;
        int i = this.a;
        aqil.P(obj);
        if (i == 0) {
            ?? r2 = this.g;
            Object obj2 = this.b;
            qkg[] qkgVarArr = this.c;
            ArrayList arrayList = new ArrayList(9);
            int i2 = 0;
            int i3 = 0;
            while (true) {
                aevaVar = null;
                if (i2 >= 9) {
                    break;
                }
                if (qkgVarArr[i2] != null) {
                    aevaVar = ((Object[]) obj2)[i3];
                    i3++;
                }
                arrayList.add(aevaVar);
                i2++;
            }
            Object[] array = arrayList.toArray(new Object[0]);
            Object obj3 = array[0];
            obj3.getClass();
            aetv aetvVar = (aetv) obj3;
            aevm aevmVar = (aevm) array[1];
            aeve aeveVar = (aeve) array[2];
            aexx aexxVar = (aexx) array[3];
            aevq aevqVar = (aevq) array[4];
            if (this.d.n) {
                aevaVar = (aeva) array[5];
            }
            jzx b = kag.b(this.f, aetvVar, aevmVar, aeveVar, aexxVar, aevqVar, aevaVar, (apdv) array[6], (kdi) array[7], (apdv) array[8]);
            this.a = 1;
            if (r2.fv(b, this) == arplVar) {
                return arplVar;
            }
        }
        return arnb.a;
    }
}
