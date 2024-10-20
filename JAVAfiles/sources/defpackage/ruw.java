package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class ruw implements Function {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ ruw(Object obj, int i) {
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
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r0v31, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r0v39, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    /* JADX WARN: Type inference failed for: r0v58, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r0v60, types: [java.lang.Object, agpj] */
    /* JADX WARN: Type inference failed for: r0v8, types: [rvm, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v5, types: [armf, java.lang.Object] */
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        boolean z = false;
        int i = 1;
        switch (this.b) {
            case 0:
                sll sllVar = (sll) obj;
                alog g = ((alob) this.a).g();
                alob alobVar = new alob();
                alur it = g.iterator();
                while (it.hasNext()) {
                    alobVar.h(String.valueOf(ruy.a((ConversationIdType) it.next())));
                }
                sllVar.U(new agmf("conversation_pin.conversation_id", 3, sll.X(alobVar.g()), true));
                return sllVar;
            case 1:
                snh snhVar = (snh) obj;
                snhVar.r((String) this.a);
                return snhVar;
            case 2:
                sny snyVar = (sny) obj;
                snyVar.b(this.a.a());
                return snyVar;
            case 3:
                long h = ((snq) obj).h();
                ((rvm) this.a.b()).f();
                if (h >= 2) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 4:
                snh snhVar2 = (snh) obj;
                snhVar2.j((ConversationIdType) this.a);
                return snhVar2;
            case 5:
                syc sycVar = (syc) obj;
                xze xzeVar = rwd.a;
                sycVar.m(this.a);
                return sycVar;
            case 6:
                syc sycVar2 = (syc) obj;
                xze xzeVar2 = rwd.a;
                sycVar2.I((Uri) this.a);
                return sycVar2;
            case 7:
                syc sycVar3 = (syc) obj;
                xze xzeVar3 = rwd.a;
                sycVar3.z((rve) this.a);
                return sycVar3;
            case 8:
                syc sycVar4 = (syc) obj;
                xze xzeVar4 = rwd.a;
                sycVar4.f((ConversationIdType) this.a);
                return sycVar4;
            case 9:
                tol tolVar = (tol) obj;
                xze xzeVar5 = rwd.a;
                tolVar.U(new agmd("user_references.message_id", 1, Long.valueOf(rvc.a((MessageIdType) this.a))));
                return tolVar;
            case 10:
                syc sycVar5 = (syc) obj;
                xze xzeVar6 = rwd.a;
                sycVar5.i((MessageIdType) this.a);
                return sycVar5;
            case 11:
                syc sycVar6 = (syc) obj;
                xze xzeVar7 = rwd.a;
                sycVar6.G(this.a);
                return sycVar6;
            case 12:
                syc sycVar7 = (syc) obj;
                xze xzeVar8 = rwd.a;
                sycVar7.f((ConversationIdType) this.a);
                sycVar7.Q(1, 22);
                return sycVar7;
            case 13:
                syc sycVar8 = (syc) obj;
                xze xzeVar9 = rwd.a;
                sycVar8.P(1, 2);
                ?? r0 = this.a;
                sycVar8.f(r0.z());
                sycVar8.U(new agoi("messages.sent_timestamp", 8, Long.valueOf(r0.q())));
                sycVar8.k(r0.B().a);
                return sycVar8;
            case 14:
                syc sycVar9 = (syc) obj;
                xze xzeVar10 = rwd.a;
                sycVar9.M(3);
                sycVar9.f((ConversationIdType) this.a);
                return sycVar9;
            case 15:
                rwd rwdVar = (rwd) this.a;
                MessageCoreData a = ((tqx) rwdVar.e.b()).a();
                a.aI((MessagesTable.BindData) obj);
                ((rxc) rwdVar.f.b()).b(a, false);
                return a;
            case 16:
                scc sccVar = (scc) obj;
                xze xzeVar11 = rwd.a;
                sccVar.U(new agmd("draft_parts_view.conversation_id_messages", 1, Long.valueOf(ruy.a((ConversationIdType) this.a))));
                return sccVar;
            case 17:
                syc sycVar10 = (syc) obj;
                xze xzeVar12 = rwd.a;
                sycVar10.M(3);
                sycVar10.f((ConversationIdType) this.a);
                return sycVar10;
            case 18:
                syc sycVar11 = (syc) obj;
                xze xzeVar13 = rwd.a;
                Object obj2 = this.a;
                sycVar11.f((ConversationIdType) obj2);
                sxy d = MessagesTable.d();
                d.w("hasUnreadMessagesForConversation2");
                d.g(new rwb(obj2, i));
                sycVar11.W(new agov(d.b()));
                return sycVar11;
            case 19:
                syc sycVar12 = (syc) obj;
                xze xzeVar14 = rwd.a;
                sycVar12.O(this.a);
                return sycVar12;
            default:
                syc sycVar13 = (syc) obj;
                xze xzeVar15 = rwd.a;
                sycVar13.l(this.a);
                return sycVar13;
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
