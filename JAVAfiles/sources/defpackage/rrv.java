package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.VmtTable;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class rrv implements Function {
    private final /* synthetic */ int a;

    public /* synthetic */ rrv(int i) {
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

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.a) {
            case 0:
                return vht.k((szn) obj);
            case 1:
                VmtTable.BindData bindData = (VmtTable.BindData) obj;
                bindData.ao(0, "part_id");
                return bindData.a;
            case 2:
                vid vidVar = (vid) obj;
                return new sbc[]{(sbc) vidVar.d, (sbc) vidVar.c, (sbc) vidVar.k, (sbc) vidVar.e, (sbc) vidVar.n};
            case 3:
                sdb sdbVar = (sdb) obj;
                sdbVar.b();
                return sdbVar;
            case 4:
                sdh sdhVar = (sdh) obj;
                sdhVar.U(new agoi("messages.message_status", 8, Integer.valueOf(BasePaymentResult.ERROR_REQUEST_FAILED)));
                return sdhVar;
            case 5:
                sdb sdbVar2 = (sdb) obj;
                sdbVar2.b();
                return sdbVar2;
            case 6:
                vid vidVar2 = (vid) obj;
                return new sbc[]{(sbc) vidVar2.m, (sbc) vidVar2.a, (sbc) vidVar2.f, (sbc) vidVar2.b, (sbc) vidVar2.l, (sbc) vidVar2.g, (sbc) vidVar2.i};
            case 7:
                ParticipantsTable.BindData bindData2 = (ParticipantsTable.BindData) obj;
                int i = rrz.b;
                return rrz.c(bindData2.L(), bindData2.B());
            case 8:
                return ((ParticipantsTable.BindData) obj).P();
            case 9:
                Recipient recipient = (Recipient) obj;
                int i2 = rrz.b;
                return rrz.c(recipient.p(), recipient.k());
            case 10:
                int i3 = rrz.b;
                return ((Recipient) obj).f().i();
            case 11:
                String O = ((ParticipantsTable.BindData) obj).O();
                O.getClass();
                return O;
            case 12:
                return (ParticipantsTable.BindData) obj;
            case 13:
                return Long.toString(((sku) obj).h());
            case 14:
                return (sku) obj;
            case 15:
                return Long.toString(((smh) obj).h());
            case 16:
                return (smh) obj;
            case 17:
                return ((ParticipantsTable.BindData) obj).M();
            case 18:
                return (ParticipantsTable.BindData) obj;
            case 19:
                return ((ifq) obj).c;
            default:
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
