package defpackage;

import android.text.style.URLSpan;
import android.util.Pair;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class uvo implements Function {
    private final /* synthetic */ int a;

    public /* synthetic */ uvo(int i) {
        this.a = i;
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo416andThen(Function function) {
        switch (this.a) {
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
            default:
                return Function$CC.$default$andThen(this, function);
        }
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        int i = 2;
        switch (this.a) {
            case 0:
                uuf uufVar = uvq.a;
                return (String) ((Pair) obj).first;
            case 1:
                uvm uvmVar = (uvm) obj;
                return new Pair(uvmVar.a, uvmVar.b);
            case 2:
                uuf uufVar2 = uvq.a;
                return (String) ((Pair) obj).first;
            case 3:
                akul akulVar = (akul) obj;
                uuf uufVar3 = uvq.a;
                try {
                    return Optional.of((List) albo.bQ(akulVar));
                } catch (Exception e) {
                    alvw i2 = uvq.b.i();
                    i2.X(alwp.a, "Bugle");
                    ((alvg) ((alvg) ((alvg) i2).g(e)).h("com/google/android/apps/messaging/shared/feedback/psd/BugleFeedbackProductSpecificDataV2", "getAsyncFeedbackPsd", (char) 157, "BugleFeedbackProductSpecificDataV2.java")).q("Skipping PSD");
                    return Optional.empty();
                }
            case 4:
                return uvl.a((Map) obj);
            case 5:
                return Collection.EL.stream((alog) obj);
            case 6:
                return d.ag((URLSpan) obj);
            case 7:
                int i3 = uzc.a;
                return ((uzb) obj).a;
            case 8:
                agpj agpjVar = uze.a;
                return ((tar) obj).a;
            case 9:
                tbd tbdVar = (tbd) obj;
                agpj agpjVar2 = uze.a;
                smm smmVar = new smm(smp.a);
                smmVar.d(new uzd(0));
                smmVar.e(new uzd(i));
                tbdVar.i(smmVar.b());
                tbdVar.n(2);
                return tbdVar;
            case 10:
                agpj agpjVar3 = uze.a;
                return ((tar) obj).a;
            case 11:
                tbd tbdVar2 = (tbd) obj;
                agpj agpjVar4 = uze.a;
                sla a = sld.a();
                a.d(new uvo(12));
                a.f(new uzd(1));
                tbdVar2.i(a.b());
                tbdVar2.n(2);
                return tbdVar2;
            default:
                agpj agpjVar5 = uze.a;
                return ((jat) obj).e;
        }
    }

    public final /* synthetic */ Function compose(Function function) {
        switch (this.a) {
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
            default:
                return Function$CC.$default$compose(this, function);
        }
    }
}
