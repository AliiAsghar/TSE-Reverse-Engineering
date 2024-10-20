package defpackage;

import android.view.View;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.material.snackbar.Snackbar;
import j$.util.function.Function$CC;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class ijs implements Function {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ ijs(Object obj, int i) {
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

    /* JADX WARN: Type inference failed for: r0v36, types: [msk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v37, types: [msk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v39, types: [java.lang.CharSequence, java.lang.Object] */
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        agpj p;
        agpj p2;
        switch (this.b) {
            case 0:
                syc sycVar = (syc) obj;
                sycVar.f((ConversationIdType) this.a);
                return sycVar;
            case 1:
                snh snhVar = (snh) obj;
                Object obj2 = this.a;
                obj2.getClass();
                snhVar.l(((sjr) obj2).f());
                return snhVar;
            case 2:
                snh snhVar2 = (snh) obj;
                snhVar2.j((ConversationIdType) this.a);
                return snhVar2;
            case 3:
                syc sycVar2 = (syc) obj;
                sycVar2.f((ConversationIdType) this.a);
                sycVar2.S(qkv.b);
                sycVar2.A(false);
                return sycVar2;
            case 4:
                syc sycVar3 = (syc) obj;
                sycVar3.f((ConversationIdType) this.a);
                sycVar3.S(qkv.b);
                return sycVar3;
            case 5:
                smo smoVar = (smo) obj;
                smoVar.b((ConversationIdType) this.a);
                return smoVar;
            case 6:
                tbd tbdVar = (tbd) obj;
                tbdVar.q(-2);
                Object obj3 = this.a;
                if (ody.a()) {
                    p = hwr.q((ConversationIdType) obj3);
                } else {
                    p = hwr.p((ConversationIdType) obj3);
                }
                tbdVar.i(p);
                return tbdVar;
            case 7:
                slc slcVar = (slc) obj;
                slcVar.b((ConversationIdType) this.a);
                return slcVar;
            case 8:
                smo smoVar2 = (smo) obj;
                ConversationIdType conversationIdType = (ConversationIdType) this.a;
                smoVar2.b(conversationIdType);
                smoVar2.W(hwr.t(conversationIdType));
                return smoVar2;
            case 9:
                tbd tbdVar2 = (tbd) obj;
                tbdVar2.q(-2);
                tbdVar2.n(1);
                Object obj4 = this.a;
                if (ody.a()) {
                    p2 = hwr.q((ConversationIdType) obj4);
                } else {
                    p2 = hwr.p((ConversationIdType) obj4);
                }
                tbdVar2.i(p2);
                return tbdVar2;
            case 10:
                slc slcVar2 = (slc) obj;
                ConversationIdType conversationIdType2 = (ConversationIdType) this.a;
                slcVar2.b(conversationIdType2);
                slcVar2.W(hwr.t(conversationIdType2));
                return slcVar2;
            case 11:
                return this.a.r((String) obj);
            case 12:
                return this.a.n((String) obj);
            case 13:
                alwo alwoVar = ilw.a;
                return Snackbar.q((View) obj, this.a, 0);
            case 14:
                sbw sbwVar = (sbw) obj;
                sbwVar.U(new agmd("messages.conversation_id", 1, Long.valueOf(ruy.a((ConversationIdType) this.a))));
                return sbwVar;
            case 15:
                ijs ijsVar = new ijs((imd) obj, 17);
                imk imkVar = (imk) this.a;
                return imkVar.b(imkVar.k.map(ijsVar));
            case 16:
                return ((akul) obj).h(new ezr(18), ((imk) this.a).f);
            case 17:
                ltw ltwVar = (ltw) obj;
                alwo alwoVar2 = imk.a;
                if (((imd) this.a).b == null) {
                    return null;
                }
                return ltwVar.a();
            case 18:
                return ((ioy) this.a).a((afnr) obj);
            case 19:
                rry rryVar = (rry) ((rtn) obj);
                ((rvu) ((itm) this.a).m.b()).a(rryVar);
                return rryVar;
            default:
                return Long.valueOf(((AtomicLong) ((ifb) this.a).b).incrementAndGet());
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
