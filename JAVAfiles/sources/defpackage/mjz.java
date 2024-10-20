package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.DefaultConversation;
import com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.Collection;
import j$.util.function.Function$CC;
import java.util.Map;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class mjz implements Function {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ mjz(Object obj, int i) {
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
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.util.Collection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.function.BiFunction, java.lang.Object] */
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        Object apply;
        switch (this.b) {
            case 0:
                sjl sjlVar = (sjl) obj;
                sjlVar.U(new agmf("contacts.lookup_key", 3, sjl.X(this.a), false));
                return sjlVar;
            case 1:
                return ((qsa) this.a).b((msh) obj);
            case 2:
                syc sycVar = (syc) obj;
                sycVar.m(this.a);
                return sycVar;
            case 3:
                syc sycVar2 = (syc) obj;
                sycVar2.m(this.a);
                return sycVar2;
            case 4:
                return ((mlf) this.a).z((ConversationId) obj);
            case 5:
                Map.Entry entry = (Map.Entry) obj;
                apply = this.a.apply((mld) entry.getKey(), (alog) entry.getValue());
                return (akul) apply;
            case 6:
                return Collection.EL.stream(this.a).filter(new isg((String) obj, 7)).findAny();
            case 7:
                smo smoVar = (smo) obj;
                smoVar.b((ConversationIdType) this.a);
                return smoVar;
            case 8:
                snh snhVar = (snh) obj;
                snhVar.j(((BugleConversationId) this.a).a);
                return snhVar;
            case 9:
                tab tabVar = (tab) obj;
                tabVar.b(((BugleConversationId) this.a).a);
                return tabVar;
            case 10:
                mml mmlVar = (mml) obj;
                akrh a = mmlVar.a();
                Object obj2 = this.a;
                try {
                    akul aj = aktp.aj(new imi(obj2, mmlVar, 5), ((DefaultConversation) obj2).b);
                    a.b(aj);
                    a.close();
                    return aj;
                } catch (Throwable th) {
                    try {
                        a.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            case 11:
                snh snhVar2 = (snh) obj;
                alwo alwoVar = mmg.a;
                snhVar2.j((ConversationIdType) this.a);
                return snhVar2;
            case 12:
                snh snhVar3 = (snh) obj;
                alwo alwoVar2 = mmg.a;
                snhVar3.j((ConversationIdType) this.a);
                return snhVar3;
            case 13:
                snh snhVar4 = (snh) obj;
                alwo alwoVar3 = mmg.a;
                snhVar4.j((ConversationIdType) this.a);
                snhVar4.U(new agoi("conversations.show_draft", 1, 1));
                return snhVar4;
            case 14:
                Recipient recipient = (Recipient) obj;
                msh f = recipient.f();
                if (f.q() && f.e().isPresent() && ((adjc) ((mmg) this.a).h.b()).v(((qei) f.e().get()).d)) {
                    return aktp.ag(true);
                }
                return recipient.C();
            case 15:
                snh snhVar5 = (snh) obj;
                snhVar5.k(((snf) ((arsb) this.a).a).b());
                return snhVar5;
            case 16:
                syc sycVar3 = (syc) obj;
                alhr alhrVar = mmw.a;
                sycVar3.f((ConversationIdType) this.a);
                return sycVar3;
            case 17:
                snh snhVar6 = (snh) obj;
                alhr alhrVar2 = mmw.a;
                snhVar6.j((ConversationIdType) this.a);
                return snhVar6;
            case 18:
                return this.a;
            case 19:
                snh snhVar7 = (snh) obj;
                alwo alwoVar4 = mni.a;
                snhVar7.j(((BugleConversationId) this.a).a);
                return snhVar7;
            default:
                srb srbVar = (srb) obj;
                Object obj3 = this.a;
                obj3.getClass();
                srbVar.U(new agmd("gemini.conversation_id", 1, Long.valueOf(ruy.a((ConversationIdType) obj3))));
                return srbVar;
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
