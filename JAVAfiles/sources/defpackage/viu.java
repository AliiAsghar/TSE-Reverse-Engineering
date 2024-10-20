package defpackage;

import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.SmartSuggestionData;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.SuggestionData;
import com.google.android.ims.provisioning.config.Configuration;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class viu implements Function {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ viu(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo416andThen(Function function) {
        switch (this.b) {
            case 0:
                return Function$CC.$default$andThen(this, function);
            case 1:
                return Function$CC.$default$andThen(this, function);
            case 2:
                return Function$CC.$default$andThen(this, function);
            case 3:
                return Function$CC.$default$andThen(this, function);
            case 4:
                return Function$CC.$default$andThen(this, function);
            case 5:
                return Function$CC.$default$andThen(this, function);
            case 6:
                return Function$CC.$default$andThen(this, function);
            case 7:
                return Function$CC.$default$andThen(this, function);
            case 8:
                return Function$CC.$default$andThen(this, function);
            case 9:
                return Function$CC.$default$andThen(this, function);
            case 10:
                return Function$CC.$default$andThen(this, function);
            case 11:
                return Function$CC.$default$andThen(this, function);
            case 12:
                return Function$CC.$default$andThen(this, function);
            case 13:
                return Function$CC.$default$andThen(this, function);
            case 14:
                return Function$CC.$default$andThen(this, function);
            case 15:
                return Function$CC.$default$andThen(this, function);
            case 16:
                return Function$CC.$default$andThen(this, function);
            case 17:
                return Function$CC.$default$andThen(this, function);
            case 18:
                return Function$CC.$default$andThen(this, function);
            case 19:
                return Function$CC.$default$andThen(this, function);
            default:
                return Function$CC.$default$andThen(this, function);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.lang.Iterable] */
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        boolean equals;
        switch (this.b) {
            case 0:
                syc sycVar = (syc) obj;
                alwo alwoVar = viv.a;
                sycVar.m(this.a);
                return sycVar;
            case 1:
                syc sycVar2 = (syc) obj;
                int i = vit.n;
                sycVar2.m(this.a);
                return sycVar2;
            case 2:
                alog alogVar = (alog) obj;
                ArrayList arrayList = new ArrayList(alogVar.size());
                ArrayList arrayList2 = new ArrayList(alogVar.size());
                Iterator<E> it = alogVar.iterator();
                while (it.hasNext()) {
                    SmartSuggestionData smartSuggestionData = (SmartSuggestionData) ((SuggestionData) it.next());
                    if (ryj.c(smartSuggestionData)) {
                        String d = smartSuggestionData.d();
                        String b = smartSuggestionData.b();
                        if (!TextUtils.isEmpty(d) && !TextUtils.isEmpty(b)) {
                            arrayList.add(b);
                            arrayList2.add(d);
                        }
                    }
                }
                ((vmy) this.a).a(arrayList);
                if (arrayList2.isEmpty()) {
                    return Optional.empty();
                }
                return Optional.of((CharSequence[]) arrayList2.toArray(new CharSequence[0]));
            case 3:
                return ((vid) ((vmu) this.a).e.b()).b((saz) obj);
            case 4:
                return ((vid) ((vmu) this.a).e.b()).b((saz) obj);
            case 5:
                return d.V(this.a, obj);
            case 6:
                return d.X(this.a, obj);
            case 7:
                return d.X(this.a, obj);
            case 8:
                return this.a.a(obj);
            case 9:
                vqw vqwVar = (vqw) this.a;
                qei qeiVar = (qei) obj;
                if (((pdh) vqwVar.m.b()).a()) {
                    equals = ((wfe) vqwVar.i.b()).k(qeiVar);
                } else {
                    equals = qeiVar.d.equals(vqwVar.t());
                }
                return Boolean.valueOf(equals);
            case 10:
                return ((znj) ((vqw) this.a).j.b()).F((Configuration) obj);
            case 11:
                vqw vqwVar2 = (vqw) this.a;
                Optional j = ((adje) vqwVar2.l.b()).j(((adae) vqwVar2.n.b()).d(((qei) obj).d));
                int I = znj.I(j);
                if (I == 0) {
                    I = Integer.MAX_VALUE;
                }
                return Integer.valueOf(I);
            case 12:
                return ((psq) this.a).c((String) obj);
            case 13:
                msh mshVar = (msh) obj;
                vqw vqwVar3 = (vqw) this.a;
                return ((msk) vqwVar3.k.b()).h(mshVar, vqwVar3.X(Optional.of(mshVar)));
            case 14:
                return ((adae) this.a).d((String) obj);
            case 15:
                return ((adji) this.a).h((adit) obj);
            case 16:
                return ((ryg) this.a).f(((Integer) obj).intValue());
            case 17:
                return ((psq) ((vsg) this.a).j.b()).c((String) obj);
            case 18:
                tbd tbdVar = (tbd) obj;
                Object obj2 = this.a;
                obj2.getClass();
                tbdVar.getClass();
                smm smmVar = new smm(smp.a);
                smmVar.d(new vrx(8));
                smmVar.e(new viu(obj2, 20));
                tbdVar.i(smmVar.b());
                return tbdVar;
            case 19:
                slc slcVar = (slc) obj;
                slcVar.getClass();
                slcVar.b((ConversationIdType) this.a);
                return slcVar;
            default:
                smo smoVar = (smo) obj;
                smoVar.getClass();
                smoVar.b((ConversationIdType) this.a);
                return smoVar;
        }
    }

    public final /* synthetic */ Function compose(Function function) {
        switch (this.b) {
            case 0:
                return Function$CC.$default$compose(this, function);
            case 1:
                return Function$CC.$default$compose(this, function);
            case 2:
                return Function$CC.$default$compose(this, function);
            case 3:
                return Function$CC.$default$compose(this, function);
            case 4:
                return Function$CC.$default$compose(this, function);
            case 5:
                return Function$CC.$default$compose(this, function);
            case 6:
                return Function$CC.$default$compose(this, function);
            case 7:
                return Function$CC.$default$compose(this, function);
            case 8:
                return Function$CC.$default$compose(this, function);
            case 9:
                return Function$CC.$default$compose(this, function);
            case 10:
                return Function$CC.$default$compose(this, function);
            case 11:
                return Function$CC.$default$compose(this, function);
            case 12:
                return Function$CC.$default$compose(this, function);
            case 13:
                return Function$CC.$default$compose(this, function);
            case 14:
                return Function$CC.$default$compose(this, function);
            case 15:
                return Function$CC.$default$compose(this, function);
            case 16:
                return Function$CC.$default$compose(this, function);
            case 17:
                return Function$CC.$default$compose(this, function);
            case 18:
                return Function$CC.$default$compose(this, function);
            case 19:
                return Function$CC.$default$compose(this, function);
            default:
                return Function$CC.$default$compose(this, function);
        }
    }
}
