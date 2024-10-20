package defpackage;

import android.os.CancellationSignal;
import com.google.android.apps.messaging.label.data.classification.SuperSortLabel;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.DefaultConversation;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import j$.time.Instant;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class kzr implements Function {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ kzr(Object obj, Object obj2, Object obj3, int i) {
        this.d = i;
        this.b = obj;
        this.c = obj2;
        this.a = obj3;
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo416andThen(Function function) {
        switch (this.d) {
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r0v43, types: [alhr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v50, types: [java.lang.Object, agpj] */
    /* JADX WARN: Type inference failed for: r0v55, types: [java.lang.Object, agpj] */
    /* JADX WARN: Type inference failed for: r1v43, types: [alhr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v15, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v16, types: [java.util.Map, java.lang.Object] */
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        int i = 3;
        int i2 = 2;
        int i3 = 10;
        int i4 = 1;
        switch (this.d) {
            case 0:
                tbd tbdVar = (tbd) obj;
                ?? r0 = this.a;
                ArrayList arrayList = new ArrayList(aqjn.J(r0, 10));
                Iterator it = r0.iterator();
                while (it.hasNext()) {
                    arrayList.add(((msh) it.next()).n());
                }
                Object obj2 = this.c;
                Object obj3 = this.b;
                tbdVar.m(arrayList);
                tbdVar.getClass();
                if (((okf) ((nen) obj3).b.b()).a()) {
                    smm smmVar = new smm(smp.a);
                    smmVar.c((smi) smp.d.c);
                    smmVar.e(new kza(obj2, i));
                    tbdVar.i(smmVar.b());
                } else {
                    sla a = sld.a();
                    a.c((skw) sld.e.e);
                    a.f(new kza(obj2, 4));
                    tbdVar.i(a.b());
                }
                return tbdVar;
            case 1:
                snh snhVar = (snh) obj;
                snhVar.l(((sjr) this.b).f());
                long epochMilli = ((Instant) this.c).toEpochMilli();
                long epochMilli2 = ((Instant) this.a).toEpochMilli();
                sxy d = MessagesTable.d();
                d.w("conversationsWithIsAtLeastOneOutgoingMessageInTimeframeQuery");
                d.e(new idc(i2));
                d.g(new mak(epochMilli, epochMilli2, 1));
                snhVar.k(d.b());
                return snhVar;
            case 2:
                Object obj4 = this.c;
                lbw lbwVar = (lbw) obj;
                boolean a2 = ((pgj) ((lbt) obj4).j.b()).a();
                Object obj5 = this.a;
                if (a2 && ((CancellationSignal) this.b).isCanceled()) {
                    alvw i5 = lbt.a.i();
                    i5.X(alwp.a, "Bugle");
                    ((alvg) ((alvg) i5).h("com/google/android/apps/messaging/label/data/cache/HomeScreenQueryCache", ConversationSuggestion.SUGGESTION_PROPERTY_MAP_QUERY, 429, "HomeScreenQueryCache.java")).q("HomeScreenQuery stream was cancelled");
                    throw new CancellationException();
                }
                akrh e = aktp.e("ConversationListDataSources#fromHomeScreenQuery");
                try {
                    kzd b = kzd.b(lbwVar, (SuperSortLabel) obj5, ((lbt) obj4).b);
                    e.close();
                    return b;
                } catch (Throwable th) {
                    try {
                        e.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            case 3:
                Object obj6 = this.c;
                kzd kzdVar = (kzd) obj;
                boolean a3 = ((pgj) ((lbt) obj6).j.b()).a();
                ?? r3 = this.a;
                if (a3 && ((CancellationSignal) this.b).isCanceled()) {
                    alvw i6 = lbt.a.i();
                    i6.X(alwp.a, "Bugle");
                    ((alvg) ((alvg) i6).h("com/google/android/apps/messaging/label/data/cache/HomeScreenQueryCache", ConversationSuggestion.SUGGESTION_PROPERTY_MAP_QUERY, 441, "HomeScreenQueryCache.java")).q("HomeScreenQuery stream was cancelled");
                    throw new CancellationException();
                }
                akrh e2 = aktp.e("ConversationListDataSources#conversationListItemViewDataFactory");
                try {
                    kzx b2 = ((lbt) obj6).k.b(kzdVar, r3, ((lbt) obj6).i);
                    e2.close();
                    return b2;
                } catch (Throwable th3) {
                    try {
                        e2.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            case 4:
                Object obj7 = this.c;
                lda ldaVar = (lda) obj;
                boolean a4 = ((pgj) ((lbt) obj7).j.b()).a();
                Object obj8 = this.a;
                if (a4 && ((CancellationSignal) this.b).isCanceled()) {
                    alvw i7 = lbt.a.i();
                    i7.X(alwp.a, "Bugle");
                    ((alvg) ((alvg) i7).h("com/google/android/apps/messaging/label/data/cache/HomeScreenQueryCache", ConversationSuggestion.SUGGESTION_PROPERTY_MAP_QUERY, 386, "HomeScreenQueryCache.java")).q("HomeScreenQuery stream was cancelled");
                    throw new CancellationException();
                }
                akrh e3 = aktp.e("ConversationListDataSources#fromSuperSortQuery");
                try {
                    kzd c = kzd.c(ldaVar, (SuperSortLabel) obj8, ((lbt) obj7).b);
                    e3.close();
                    return c;
                } catch (Throwable th5) {
                    try {
                        e3.close();
                    } catch (Throwable th6) {
                        th5.addSuppressed(th6);
                    }
                    throw th5;
                }
            case 5:
                Object obj9 = this.c;
                kzd kzdVar2 = (kzd) obj;
                boolean a5 = ((pgj) ((lbt) obj9).j.b()).a();
                ?? r32 = this.a;
                if (a5 && ((CancellationSignal) this.b).isCanceled()) {
                    alvw i8 = lbt.a.i();
                    i8.X(alwp.a, "Bugle");
                    ((alvg) ((alvg) i8).h("com/google/android/apps/messaging/label/data/cache/HomeScreenQueryCache", ConversationSuggestion.SUGGESTION_PROPERTY_MAP_QUERY, 398, "HomeScreenQueryCache.java")).q("HomeScreenQuery stream was cancelled");
                    throw new CancellationException();
                }
                akrh e4 = aktp.e("ConversationListDataSources#conversationListItemViewDataFactory");
                try {
                    kzx b3 = ((lbt) obj9).k.b(kzdVar2, r32, ((lbt) obj9).i);
                    e4.close();
                    return b3;
                } catch (Throwable th7) {
                    try {
                        e4.close();
                    } catch (Throwable th8) {
                        th7.addSuppressed(th8);
                    }
                    throw th7;
                }
            case 6:
                lcy lcyVar = (lcy) obj;
                Object obj10 = this.b;
                lcyVar.b(new kza(obj10, i3), new ivj(obj10, this.c, 8), new ivj(obj10, this.a, 9));
                return lcyVar;
            case 7:
                lcy lcyVar2 = (lcy) obj;
                Object obj11 = this.b;
                lcyVar2.b(new ldg(obj11, 6), new ivj(obj11, this.c, i3), new ivj(obj11, this.a, 11));
                return lcyVar2;
            case 8:
                mml mmlVar = (mml) obj;
                akrh a6 = mmlVar.a();
                try {
                    akul aj = aktp.aj(new ncx(mmlVar, (DefaultConversation) this.c, (miv) this.b, i4), ((mmg) this.a).j);
                    a6.b(aj);
                    a6.close();
                    return aj;
                } catch (Throwable th9) {
                    try {
                        a6.close();
                    } catch (Throwable th10) {
                        th9.addSuppressed(th10);
                    }
                    throw th9;
                }
            case 9:
                String str = (String) this.c.get();
                return ((mrw) this.b).w(str, (String) obj);
            case 10:
                return ((rib) this.b).b((String) this.c, (String) this.a, ((rhl) obj).i());
            case 11:
                return ((rib) this.b).b((String) this.c, (String) this.a, ((rhl) obj).i());
            default:
                tgq tgqVar = (tgq) obj;
                tgqVar.b(this.c);
                tgqVar.c(((xnv) this.b).f().toEpochMilli());
                tgqVar.U(new agme("reminders.trigger_time", 7, this.a));
                return tgqVar;
        }
    }

    public final /* synthetic */ Function compose(Function function) {
        switch (this.d) {
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

    public /* synthetic */ kzr(Object obj, Object obj2, Object obj3, int i, byte[] bArr) {
        this.d = i;
        this.c = obj;
        this.b = obj2;
        this.a = obj3;
    }

    public /* synthetic */ kzr(Set set, nen nenVar, ConversationIdType conversationIdType, int i) {
        this.d = i;
        this.a = set;
        this.b = nenVar;
        this.c = conversationIdType;
    }

    public /* synthetic */ kzr(mmg mmgVar, DefaultConversation defaultConversation, miv mivVar, int i) {
        this.d = i;
        this.a = mmgVar;
        this.c = defaultConversation;
        this.b = mivVar;
    }
}
