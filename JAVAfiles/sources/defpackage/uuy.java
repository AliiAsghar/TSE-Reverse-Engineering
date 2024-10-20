package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class uuy implements Function {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ uuy(Object obj, int i) {
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
    /* JADX WARN: Type inference failed for: r0v16, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v50, types: [java.lang.Object, agpj] */
    /* JADX WARN: Type inference failed for: r0v58, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r0v59, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.lang.Object, java.lang.Iterable] */
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        Integer valueOf;
        Integer valueOf2;
        int i = 6;
        int i2 = 1;
        int i3 = 0;
        switch (this.b) {
            case 0:
                uuz uuzVar = (uuz) this.a;
                return uuzVar.b.d((String) obj, 9).i(new uva(i2), uuzVar.c);
            case 1:
                List list = ((uss) this.a).c;
                uqa uqaVar = (uqa) obj;
                ArrayList arrayList = new ArrayList(aqjn.J(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(Long.valueOf(((upr) it.next()).k()));
                }
                uqaVar.c(arrayList);
                return uqaVar;
            case 2:
                return ((vbs) ((uvb) this.a).b.b()).d((String) obj, 10).i(new uva(i3), andi.a);
            case 3:
                return ((uvn) ((lpg) this.a).a.get((String) obj)).b();
            case 4:
                uuf uufVar = uvq.a;
                uvn uvnVar = (uvn) this.a.get((String) obj);
                uvnVar.getClass();
                return uvnVar.c();
            case 5:
                akul akulVar = (akul) obj;
                uuf uufVar2 = uvq.a;
                try {
                    return Optional.of((List) albo.bQ(akulVar));
                } catch (Exception unused) {
                    Object obj2 = this.a;
                    alvw i4 = uvq.b.i();
                    i4.X(alwp.a, "Bugle");
                    ((alvg) ((alvg) ((alvg) i4).g((Throwable) obj2)).h("com/google/android/apps/messaging/shared/feedback/psd/BugleFeedbackProductSpecificDataV2", "getAsyncFeedbackPsbd", 239, "BugleFeedbackProductSpecificDataV2.java")).q("Skipping PSD");
                    return Optional.empty();
                }
            case 6:
                uuf uufVar3 = uvq.a;
                uvn uvnVar2 = (uvn) this.a.get((String) obj);
                uvnVar2.getClass();
                return uvnVar2.d();
            case 7:
                syc sycVar = (syc) obj;
                sycVar.f((ConversationIdType) this.a);
                sycVar.R();
                return sycVar;
            case 8:
                snh snhVar = (snh) obj;
                snhVar.j((ConversationIdType) this.a);
                return snhVar;
            case 9:
                syc sycVar2 = (syc) obj;
                sycVar2.f((ConversationIdType) this.a);
                sycVar2.q(false);
                sycVar2.b(new uzd(5), new uzd(i));
                return sycVar2;
            case 10:
                spi spiVar = (spi) obj;
                spiVar.b((ConversationIdType) this.a);
                return spiVar;
            case 11:
                snh snhVar2 = (snh) obj;
                snhVar2.j((ConversationIdType) this.a);
                return snhVar2;
            case 12:
                snh snhVar3 = (snh) obj;
                snhVar3.j((ConversationIdType) this.a);
                return snhVar3;
            case 13:
                syc sycVar3 = (syc) obj;
                sycVar3.f((ConversationIdType) this.a);
                valueOf = Integer.valueOf(a.bp().c());
                int intValue = valueOf.intValue();
                if (intValue < 58210) {
                    agnc.t("cms_life_cycle", intValue);
                }
                sycVar3.U(new agmg("messages.cms_life_cycle", 6));
                return sycVar3;
            case 14:
                snh snhVar4 = (snh) obj;
                snhVar4.j((ConversationIdType) this.a);
                return snhVar4;
            case 15:
                syc sycVar4 = (syc) obj;
                sycVar4.f((ConversationIdType) this.a);
                return sycVar4;
            case 16:
                syc sycVar5 = (syc) obj;
                sycVar5.l(this.a);
                return sycVar5;
            case 17:
                syc sycVar6 = (syc) obj;
                apax apaxVar = ((uzw) this.a).d;
                valueOf2 = Integer.valueOf(a.bp().c());
                int intValue2 = valueOf2.intValue();
                if (intValue2 < 8500) {
                    agnc.t("cloud_sync_id", intValue2);
                }
                sycVar6.U(new agmf("messages.cloud_sync_id", 3, syc.X(apaxVar), false));
                return sycVar6;
            case 18:
                suq suqVar = (suq) obj;
                alob alobVar = new alob();
                Iterator it2 = this.a.iterator();
                while (it2.hasNext()) {
                    alobVar.h(String.valueOf(rvc.a((MessageIdType) it2.next())));
                }
                suqVar.U(new agmf("message_edits.latest_message_id", 3, suq.X(alobVar.g()), true));
                return suqVar;
            case 19:
                syc sycVar7 = (syc) obj;
                sycVar7.m(this.a);
                return sycVar7;
            default:
                svp svpVar = (svp) obj;
                svpVar.b(this.a);
                return svpVar;
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
