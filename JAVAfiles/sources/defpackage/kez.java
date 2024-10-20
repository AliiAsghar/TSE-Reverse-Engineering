package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kez extends arrp implements arqg {
    final /* synthetic */ qkg[] a;
    final /* synthetic */ miz b;
    final /* synthetic */ key c;
    final /* synthetic */ int d;
    final /* synthetic */ lfl e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kez(qkg[] qkgVarArr, miz mizVar, lfl lflVar, key keyVar, int i) {
        super(0);
        this.a = qkgVarArr;
        this.b = mizVar;
        this.e = lflVar;
        this.c = keyVar;
        this.d = i;
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [armf, java.lang.Object] */
    @Override // defpackage.arqg
    public final Object a() {
        aelg aelgVar;
        aerb aerbVar;
        qkg[] qkgVarArr = this.a;
        int length = qkgVarArr.length;
        ArrayList arrayList = new ArrayList(length);
        int i = 0;
        int i2 = 0;
        while (true) {
            Object obj = null;
            if (i2 >= length) {
                break;
            }
            qkg qkgVar = qkgVarArr[i2];
            if (qkgVar != null) {
                obj = qkgVar.b();
            }
            arrayList.add(obj);
            i2++;
        }
        aetv[] aetvVarArr = (aetv[]) arrayList.toArray(new aetv[0]);
        MessageId b = this.b.b();
        List o = aqil.o(aetvVarArr);
        ArrayList arrayList2 = new ArrayList(aqjn.J(o, 10));
        for (Object obj2 : o) {
            int i3 = i + 1;
            if (i < 0) {
                aqjn.G();
            }
            aetv aetvVar = (aetv) obj2;
            String a = b.a();
            a.getClass();
            if (i == o.size() - 1) {
                aelgVar = kbq.a((kbq) this.e.a, this.b);
            } else {
                aelgVar = null;
            }
            if (this.b.n()) {
                aerbVar = aerb.bD;
            } else {
                aerbVar = aerb.bE;
            }
            key keyVar = this.c;
            List y = aqjn.y(aerbVar);
            aeuh bp = lga.bp(keyVar.e, i, o.size());
            Object b2 = this.e.c.b();
            b2.getClass();
            arrayList2.add(new jzx(new aeul(a, y, this.d, bp, aelgVar, new aeuk(((Boolean) b2).booleanValue(), 15), 402636748), aetvVar, this.b));
            i = i3;
        }
        return new kex(arrayList2, b, lga.bI(this.b));
    }
}
