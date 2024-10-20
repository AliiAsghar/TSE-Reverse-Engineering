package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class wki implements Function {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ wki(Object obj, int i) {
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

    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r0v29, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r0v52, types: [java.util.Map, java.lang.Object] */
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.b) {
            case 0:
                adiw n = adom.n((adiv) obj);
                return ((wkk) this.a).y(n, 2, vrk.TACHYON_REPROVISION_ERROR);
            case 1:
                return Boolean.valueOf(((wkk) this.a).o.c(((wxb) obj).c).n);
            case 2:
                wst wstVar = (wst) obj;
                agpj agpjVar = wsv.a;
                wstVar.U(new agmd("scheduled_send.conversation_id", 1, Long.valueOf(ruy.a((ConversationIdType) this.a))));
                return wstVar;
            case 3:
                return this.a.a(obj);
            case 4:
                return (wul) this.a.a(obj);
            case 5:
                tli tliVar = new tli();
                wva wvaVar = (wva) this.a;
                tliVar.b(wvaVar.e.a());
                tliVar.c(wvaVar.f);
                return tliVar;
            case 6:
                wva wvaVar2 = (wva) this.a;
                tli tliVar2 = (tli) obj;
                tliVar2.b(wvaVar2.e.a());
                tliVar2.c(wvaVar2.f);
                return tliVar2;
            case 7:
                tli tliVar3 = (tli) obj;
                tliVar3.b(((wva) this.a).e.a());
                return tliVar3;
            case 8:
                tli tliVar4 = (tli) obj;
                tliVar4.b(((wva) this.a).e.a());
                return tliVar4;
            case 9:
                wva wvaVar3 = (wva) this.a;
                tli tliVar5 = (tli) obj;
                tliVar5.b(wvaVar3.e.a());
                tliVar5.c(wvaVar3.f);
                return tliVar5;
            case 10:
                return d.U(this.a, obj);
            case 11:
                return d.U(this.a, obj);
            case 12:
                return ((msk) ((wyx) this.a).a.b()).q((ParticipantsTable.BindData) obj);
            case 13:
                utz utzVar = wzw.d;
                return ((qqq) this.a).a((String) obj).b;
            case 14:
                return ((qqq) this.a).a(String.valueOf((String) obj)).b;
            case 15:
                msh mshVar = (msh) obj;
                if (ytd.h(mshVar.o(((Boolean) new msn(18).get()).booleanValue()))) {
                    return ((msk) ((wzw) this.a).l.b()).n("ʼUNKNOWN_SENDER!ʼ");
                }
                return mshVar;
            case 16:
                String str = ((qei) obj).d;
                xdn xdnVar = (xdn) this.a;
                return xdnVar.e.d(str, 16).i(new xdg(3), xdnVar.b);
            case 17:
                alwo alwoVar = xdn.a;
                qei qeiVar = (qei) this.a.get(((anlu) obj).a.c);
                qeiVar.getClass();
                return qeiVar;
            case 18:
                return ((xdn) this.a).d((anlu) obj);
            case 19:
                return (qei) ((algf) this.a).fu((aqfn) obj);
            default:
                return (aqfn) ((algf) this.a).fu((qei) obj);
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
