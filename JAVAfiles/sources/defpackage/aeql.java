package defpackage;

import android.content.Context;
import android.view.View;
import defpackage.cvc;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aeql extends arrp implements arqr {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aeql(Object obj, int i) {
        super(1);
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [byj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r0v27, types: [byn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v39, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v41, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v44, types: [cas, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v46, types: [cas, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v48, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v21, types: [java.lang.Object, aesf] */
    /* JADX WARN: Type inference failed for: r9v51, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r9v60, types: [java.lang.Object, arqg] */
    /* JADX WARN: Type inference failed for: r9v8, types: [aeqx, java.lang.Object] */
    @Override // defpackage.arqr
    public final /* synthetic */ Object a(Object obj) {
        float floatValue;
        float floatValue2;
        switch (this.b) {
            case 0:
                this.a.get(((Number) obj).intValue());
                return null;
            case 1:
                cle cleVar = (cle) obj;
                cleVar.getClass();
                cleVar.E((-agkx.u(this.a)) / 2.0f);
                cleVar.x(1500.0f / Float.intBitsToFloat((int) (cleVar.a() >> 32)));
                cleVar.y(1500.0f / Float.intBitsToFloat((int) (cleVar.a() & 4294967295L)));
                return arnb.a;
            case 2:
                aos aosVar = (aos) obj;
                aosVar.getClass();
                List list = ((aeqm) this.a).b;
                aosVar.b(list.size(), null, new aeql(list, 0), new cdj(-632812321, true, new jle(list, 15)));
                return arnb.a;
            case 3:
                long j = ((cjn) obj).a;
                this.a.c().a();
                return true;
            case 4:
                return Boolean.valueOf(!d.F(obj, ((abt) this.a).f()));
            case 5:
                Context context = (Context) obj;
                context.getClass();
                View view = new View(context);
                view.setId(((Integer) this.a).intValue());
                return view;
            case 6:
                cvc.a aVar = (cvc.a) obj;
                aVar.getClass();
                Iterator it = this.a.iterator();
                int i = 0;
                while (it.hasNext()) {
                    cvc.a.m(aVar, (cvc) it.next(), i, 0);
                    i += (int) (r2.a * 0.62f);
                }
                return arnb.a;
            case 7:
                long j2 = ((cjn) obj).a;
                return (Boolean) this.a.a().a();
            case 8:
                ((Boolean) obj).booleanValue();
                ((aesh) this.a).f.a();
                return arnb.a;
            case 9:
                ((Boolean) obj).booleanValue();
                ((aesn) this.a).f.a();
                return arnb.a;
            case 10:
                ((Boolean) obj).booleanValue();
                ((aetb) this.a).d.a();
                return arnb.a;
            case 11:
                this.a.h(Float.valueOf(Math.min(Math.abs(((Number) obj).floatValue()) / 250.0f, 1.0f)));
                return arnb.a;
            case 12:
                cti ctiVar = (cti) obj;
                ctiVar.getClass();
                ((ascd) ((arsb) this.a).a).f(new dre(drf.c(ctj.b(ctiVar))));
                return arnb.a;
            case 13:
                long j3 = ((cjn) obj).a;
                this.a.a(aeuj.a);
                return arnb.a;
            case 14:
                dho dhoVar = (dho) obj;
                dhoVar.getClass();
                dhl.g(dhoVar, this.a.subList(0, Math.min(((aron) this.a).c, 32)));
                return arnb.a;
            case 15:
                cvc.a aVar2 = (cvc.a) obj;
                aVar2.getClass();
                int i2 = 0;
                for (cvc cvcVar : this.a) {
                    cvc.a.m(aVar2, cvcVar, i2, 0);
                    i2 += cvcVar.a;
                }
                return arnb.a;
            case 16:
                cvc.a aVar3 = (cvc.a) obj;
                aVar3.getClass();
                int i3 = 0;
                for (cvc cvcVar2 : this.a) {
                    cvc.a.m(aVar3, cvcVar2, 0, i3);
                    i3 += cvcVar2.b;
                }
                return arnb.a;
            case 17:
                long j4 = ((cjn) obj).a;
                this.a.a();
                return arnb.a;
            case 18:
                cle cleVar2 = (cle) obj;
                cleVar2.getClass();
                floatValue = ((Number) this.a.a()).floatValue();
                cleVar2.x(floatValue);
                floatValue2 = ((Number) this.a.a()).floatValue();
                cleVar2.y(floatValue2);
                return arnb.a;
            case 19:
                this.a.get(((Number) obj).intValue());
                return null;
            default:
                aos aosVar2 = (aos) obj;
                aosVar2.getClass();
                List list2 = ((aeyr) this.a).a;
                aosVar2.b(list2.size(), null, new aeql(list2, 19), new cdj(-632812321, true, new jle(list2, 16)));
                return arnb.a;
        }
    }
}
