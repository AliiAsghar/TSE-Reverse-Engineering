package defpackage;

import android.content.ContentValues;
import com.google.android.apps.messaging.shared.datamodel.action.NoConfirmationMessageSendAction;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class rbe implements Function {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ rbe(int i, Object obj, int i2) {
        this.c = i2;
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo416andThen(Function function) {
        switch (this.c) {
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
            default:
                return Function$CC.$default$andThen(this, function);
        }
    }

    /* JADX WARN: Type inference failed for: r1v7, types: [agnw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.lang.Iterable] */
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        Integer valueOf;
        Integer valueOf2;
        int i = 8;
        switch (this.c) {
            case 0:
                return ((msk) ((NoConfirmationMessageSendAction) this.b).a.b()).t((String) obj, this.a);
            case 1:
                snh snhVar = (snh) obj;
                alvi alviVar = qqw.a;
                valueOf = Integer.valueOf(a.bp().c());
                int intValue = valueOf.intValue();
                if (intValue < 10007) {
                    agnc.t("conv_type", intValue);
                }
                int i2 = this.a;
                snhVar.U(new agmf("conversations.conv_type", 3, snh.X(this.b), true));
                snhVar.q(i2);
                return snhVar;
            case 2:
                return ((zfh) obj).k(this.a, (ConversationIdType) this.b);
            case 3:
                return rxn.j((msh) obj, (String) ((wyj) this.b).c, this.a);
            case 4:
                return Long.valueOf(this.b.Q("drafts", (ContentValues) obj, this.a));
            case 5:
                srl srlVar = (srl) obj;
                xze xzeVar = ukq.a;
                srlVar.b((String) this.b);
                srlVar.U(new agoi("generic_worker_queue.retry_count", 8, Integer.valueOf(this.a)));
                return srlVar;
            case 6:
                srl srlVar2 = (srl) obj;
                xze xzeVar2 = ukq.a;
                srlVar2.b((String) this.b);
                srlVar2.U(new agmf("generic_worker_queue.worker_type", 4, srl.Y(new int[]{32, 64, 128}), true));
                srlVar2.g(this.a);
                return srlVar2;
            case 7:
                srl srlVar3 = (srl) obj;
                srlVar3.f(((ukq) this.b).b.f().toEpochMilli());
                srlVar3.U(new agoi("generic_worker_queue.item_table_type", 1, 1));
                srlVar3.U(new agmd("generic_worker_queue.item_id", 1, String.valueOf(String.valueOf(this.a))));
                srlVar3.U(new agoi("generic_worker_queue.worker_type", 1, 3));
                return srlVar3;
            case 8:
                List list = ((uss) this.b).c;
                uqa uqaVar = (uqa) obj;
                ArrayList arrayList = new ArrayList(aqjn.J(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(Long.valueOf(((upr) it.next()).k()));
                }
                int i3 = this.a;
                uqaVar.c(arrayList);
                uqaVar.U(new agoi("work_queue.attempts", 9, Integer.valueOf(i3)));
                return uqaVar;
            case 9:
                return ((yjy) this.b).h(this.a).h((String) obj);
            case 10:
                xhz xhzVar = (xhz) this.b;
                rxq rxqVar = (rxq) xhzVar.c.b();
                msk mskVar = (msk) xhzVar.e.b();
                int i4 = this.a;
                return ParticipantsTable.b(rxqVar.g(rxn.c(mskVar.t((String) obj, i4), i4)));
            default:
                tbd tbdVar = (tbd) obj;
                sla a = sld.a();
                a.c((skw) sld.e.e);
                a.f(new yur(this.b, i));
                tbdVar.i(a.b());
                valueOf2 = Integer.valueOf(a.bp().c());
                int intValue2 = valueOf2.intValue();
                if (intValue2 < 13050) {
                    agnc.t("video_reachability", intValue2);
                }
                tbdVar.U(new agoi("participants.video_reachability", 1, Integer.valueOf(this.a)));
                return tbdVar;
        }
    }

    public final /* synthetic */ Function compose(Function function) {
        switch (this.c) {
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
            default:
                return Function$CC.$default$compose(this, function);
        }
    }

    public /* synthetic */ rbe(Object obj, int i, int i2) {
        this.c = i2;
        this.b = obj;
        this.a = i;
    }
}
