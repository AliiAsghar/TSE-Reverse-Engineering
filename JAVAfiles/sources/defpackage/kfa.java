package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kfa extends arpw implements arqw {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ qkg[] c;
    final /* synthetic */ miz d;
    final /* synthetic */ key e;
    final /* synthetic */ int f;
    final /* synthetic */ lfl g;
    private /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kfa(arpe arpeVar, qkg[] qkgVarArr, miz mizVar, lfl lflVar, key keyVar, int i) {
        super(3, arpeVar);
        this.c = qkgVarArr;
        this.d = mizVar;
        this.g = lflVar;
        this.e = keyVar;
        this.f = i;
    }

    @Override // defpackage.arqw
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        kfa kfaVar = new kfa((arpe) obj3, this.c, this.d, this.g, this.e, this.f);
        kfaVar.h = (asaj) obj;
        kfaVar.b = (Object[]) obj2;
        return kfaVar.b(arnb.a);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [asaj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v3, types: [armf, java.lang.Object] */
    @Override // defpackage.arpq
    public final Object b(Object obj) {
        aelg aelgVar;
        aerb aerbVar;
        arpl arplVar = arpl.a;
        int i = this.a;
        aqil.P(obj);
        if (i == 0) {
            ?? r2 = this.h;
            Object obj2 = this.b;
            qkg[] qkgVarArr = this.c;
            int length = qkgVarArr.length;
            ArrayList arrayList = new ArrayList(length);
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            while (true) {
                Object obj3 = null;
                if (i3 >= length) {
                    break;
                }
                if (qkgVarArr[i3] != null) {
                    obj3 = ((Object[]) obj2)[i4];
                    i4++;
                }
                arrayList.add(obj3);
                i3++;
            }
            aetv[] aetvVarArr = (aetv[]) arrayList.toArray(new aetv[0]);
            MessageId b = this.d.b();
            List o = aqil.o(aetvVarArr);
            ArrayList arrayList2 = new ArrayList(aqjn.J(o, 10));
            for (Object obj4 : o) {
                int i5 = i2 + 1;
                if (i2 < 0) {
                    aqjn.G();
                }
                aetv aetvVar = (aetv) obj4;
                String a = b.a();
                a.getClass();
                if (i2 == o.size() - 1) {
                    aelgVar = kbq.a((kbq) this.g.a, this.d);
                } else {
                    aelgVar = null;
                }
                if (this.d.n()) {
                    aerbVar = aerb.bD;
                } else {
                    aerbVar = aerb.bE;
                }
                key keyVar = this.e;
                List y = aqjn.y(aerbVar);
                aeuh bp = lga.bp(keyVar.e, i2, o.size());
                Object b2 = this.g.c.b();
                b2.getClass();
                arrayList2.add(new jzx(new aeul(a, y, this.f, bp, aelgVar, new aeuk(((Boolean) b2).booleanValue(), 15), 402636748), aetvVar, this.d));
                i2 = i5;
            }
            kex kexVar = new kex(arrayList2, b, lga.bI(this.d));
            this.a = 1;
            if (r2.fv(kexVar, this) == arplVar) {
                return arplVar;
            }
        }
        return arnb.a;
    }
}
