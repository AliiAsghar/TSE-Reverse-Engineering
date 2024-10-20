package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.ims.rcsservice.group.GroupInfo;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class mlm implements Function {
    private final /* synthetic */ int a;

    public /* synthetic */ mlm(int i) {
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
        Object e;
        int i = 3;
        switch (this.a) {
            case 0:
                return ((ParticipantsTable.BindData) obj).O();
            case 1:
                return (String) ((Optional) obj).get();
            case 2:
                return ((msh) obj).k();
            case 3:
                return Optional.ofNullable(((msh) obj).k());
            case 4:
                return ((nfw) obj).i().flatMap(new mlm(i));
            case 5:
                return new BugleConversationId(((smr) obj).x());
            case 6:
                return ((Recipient) obj).f();
            case 7:
                e = ((msh) obj).e();
                return e;
            case 8:
                return ((smu) obj).a;
            case 9:
                return new szw[]{(szw) ((uie) obj).a};
            case 10:
                return new sxp[]{((sxo) obj).k};
            case 11:
                snh snhVar = (snh) obj;
                snhVar.c(tqc.UNARCHIVED);
                return snhVar;
            case 12:
                smu smuVar = (smu) obj;
                return new smv[]{smuVar.a, smuVar.c, smuVar.O, smuVar.g, smuVar.D, smuVar.t, smuVar.k, smuVar.l, smuVar.m, smuVar.n, smuVar.o, smuVar.j, smuVar.L, smuVar.r, smuVar.aq, smuVar.A};
            case 13:
                return ((smu) obj).a;
            case 14:
                snh snhVar2 = (snh) obj;
                snhVar2.c(tqc.UNARCHIVED);
                return snhVar2;
            case 15:
                zai zaiVar = (zai) obj;
                return new tpv[]{(tpv) zaiVar.c, (tpv) zaiVar.e, (tpv) zaiVar.d};
            case 16:
                return new tbi[]{((tbh) obj).e};
            case 17:
                tar tarVar = (tar) obj;
                return new tas[]{tarVar.m, tarVar.n, tarVar.h};
            case 18:
                return Integer.valueOf(((nfw) obj).b());
            case 19:
                alhr alhrVar = mmw.a;
                return Optional.ofNullable(((GroupInfo) obj).c);
            default:
                alhr alhrVar2 = mmw.a;
                return Optional.ofNullable(((GroupInfo) obj).d);
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
