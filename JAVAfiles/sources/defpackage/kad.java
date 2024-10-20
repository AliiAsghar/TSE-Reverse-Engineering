package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kad extends arrp implements arqg {
    final /* synthetic */ qkg[] a;
    final /* synthetic */ jzz b;
    final /* synthetic */ jzx c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kad(qkg[] qkgVarArr, jzz jzzVar, jzx jzxVar) {
        super(0);
        this.a = qkgVarArr;
        this.b = jzzVar;
        this.c = jzxVar;
    }

    @Override // defpackage.arqg
    public final Object a() {
        aeva aevaVar;
        ArrayList arrayList = new ArrayList(9);
        int i = 0;
        while (true) {
            aevaVar = null;
            Object obj = null;
            if (i >= 9) {
                break;
            }
            qkg qkgVar = this.a[i];
            if (qkgVar != null) {
                obj = qkgVar.b();
            }
            arrayList.add(obj);
            i++;
        }
        Object[] array = arrayList.toArray(new Object[0]);
        Object obj2 = array[0];
        obj2.getClass();
        aetv aetvVar = (aetv) obj2;
        aevm aevmVar = (aevm) array[1];
        aeve aeveVar = (aeve) array[2];
        aexx aexxVar = (aexx) array[3];
        aevq aevqVar = (aevq) array[4];
        if (this.b.n) {
            aevaVar = (aeva) array[5];
        }
        return kag.b(this.c, aetvVar, aevmVar, aeveVar, aexxVar, aevqVar, aevaVar, (apdv) array[6], (kdi) array[7], (apdv) array[8]);
    }
}
