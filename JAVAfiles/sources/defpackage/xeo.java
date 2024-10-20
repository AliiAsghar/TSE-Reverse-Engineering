package defpackage;

import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class xeo implements Function {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ xeo(Object obj, int i) {
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

    /* JADX WARN: Type inference failed for: r0v47, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v51, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r0v52, types: [java.lang.Object, arqr] */
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.b) {
            case 0:
                snh snhVar = (snh) obj;
                alwo alwoVar = xep.a;
                snhVar.u((String) this.a);
                snhVar.t();
                return snhVar;
            case 1:
                return (aqfn) ((algf) this.a).fu((qei) obj);
            case 2:
                tbd tbdVar = (tbd) obj;
                alwo alwoVar2 = xep.a;
                tbdVar.f();
                tbdVar.l(((qei) this.a).d);
                return tbdVar;
            case 3:
                tbd tbdVar2 = (tbd) obj;
                alwo alwoVar3 = xep.a;
                tbdVar2.e();
                tbdVar2.d(((qei) this.a).d);
                return tbdVar2;
            case 4:
                snh snhVar2 = (snh) obj;
                alwo alwoVar4 = xep.a;
                snhVar2.u((String) this.a);
                snhVar2.t();
                return snhVar2;
            case 5:
                tbd tbdVar3 = (tbd) obj;
                alwo alwoVar5 = xep.a;
                tbdVar3.f();
                tbdVar3.l(((qei) this.a).d);
                return tbdVar3;
            case 6:
                tbd tbdVar4 = (tbd) obj;
                alwo alwoVar6 = xep.a;
                tbdVar4.e();
                tbdVar4.d(((qei) this.a).d);
                return tbdVar4;
            case 7:
                String U = ((smr) obj).U();
                boolean isEmpty = TextUtils.isEmpty(U);
                Object obj2 = this.a;
                if (isEmpty) {
                    ((alwl) ((alwl) xep.a.i()).h("com/google/android/apps/messaging/shared/tachygram/chat/TachygramDatabaseOperations", "getConferenceUriFromConversationBindData", 280, "TachygramDatabaseOperations.java")).q("Conversation does not contain RCS conference URI for tachygram group.");
                    ((xep) obj2).b.e("Bugle.Tachygram.ConferenceUriLookup.Counts", yyb.cK(2));
                    return Optional.empty();
                }
                ((xep) obj2).b.e("Bugle.Tachygram.ConferenceUriLookup.Counts", yyb.cK(1));
                return Optional.of(U);
            case 8:
                snh snhVar3 = (snh) obj;
                alwo alwoVar7 = xep.a;
                snhVar3.u((String) this.a);
                return snhVar3;
            case 9:
                return (qei) ((algf) this.a).fu((aqfn) obj);
            case 10:
                qei qeiVar = (qei) obj;
                alwo alwoVar8 = xew.a;
                aozy createBuilder = qff.a.createBuilder();
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                apag apagVar = createBuilder.b;
                qff qffVar = (qff) apagVar;
                qeiVar.getClass();
                qffVar.c = qeiVar;
                qffVar.b |= 1;
                qfe qfeVar = qfe.JOINED;
                if (!apagVar.isMutable()) {
                    createBuilder.u();
                }
                Object obj3 = this.a;
                qff qffVar2 = (qff) createBuilder.b;
                qffVar2.d = qfeVar.e;
                qffVar2.b |= 2;
                ((Optional) obj3).ifPresent(new wqw(createBuilder, 13));
                return (qff) createBuilder.s();
            case 11:
                xff xffVar = (xff) this.a;
                return ((akul) obj).j(((Long) xffVar.g.b()).longValue(), TimeUnit.SECONDS, xffVar.h);
            case 12:
                return (aqfn) ((algf) this.a).fu((qei) obj);
            case 13:
                return (qej) ((algf) this.a).fu((anja) obj);
            case 14:
                return ((psq) ((wpp) this.a).c.b()).d((String) obj);
            case 15:
                alwo alwoVar9 = xft.a;
                return this.a.a(obj);
            case 16:
                return d.V(this.a, obj);
            case 17:
                String str = (String) ((Map.Entry) obj).getKey();
                xfw xfwVar = (xfw) this.a;
                return ((vbs) xfwVar.e.b()).c(str).i(new xdg(8), xfwVar.b);
            case 18:
                snh snhVar4 = (snh) obj;
                alvi alviVar = xgw.a;
                snhVar4.j((ConversationIdType) this.a);
                return snhVar4;
            case 19:
                syc sycVar = (syc) obj;
                alvi alviVar2 = xgw.a;
                sycVar.i(((sxt) this.a).E());
                return sycVar;
            default:
                tbu tbuVar = (tbu) obj;
                alvi alviVar3 = xgw.a;
                tbuVar.i(((sxt) this.a).E());
                return tbuVar;
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
