package defpackage;

import android.util.Pair;
import com.google.android.apps.messaging.helpandfeedback.advancedfeedback.ui.AdvancedFeedbackDataView;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class koa implements Function {
    private final /* synthetic */ int a;

    public /* synthetic */ koa(int i) {
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

    /* JADX WARN: Type inference failed for: r7v29, types: [ksq, java.lang.Object] */
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        String o;
        switch (this.a) {
            case 0:
                snh snhVar = (snh) obj;
                snhVar.x();
                return snhVar;
            case 1:
                smu smuVar = (smu) obj;
                return new smv[]{smuVar.a, smuVar.M, smuVar.c};
            case 2:
                smu smuVar2 = (smu) obj;
                return new smv[]{smuVar2.a, smuVar2.b, smuVar2.c, smuVar2.O, smuVar2.M};
            case 3:
                Pair pair = (Pair) obj;
                xou xouVar = new xou((short[]) null);
                xouVar.j("Fi_".concat(String.valueOf((String) pair.first)));
                xouVar.k((String) pair.second);
                return xouVar.i();
            case 4:
                return ((ksq) obj).a();
            case 5:
                return ((ksq) obj).h();
            case 6:
                ksq ksqVar = (ksq) obj;
                xze xzeVar = kso.a;
                return ksqVar;
            case 7:
                o = ((msh) obj).o(((Boolean) msw.d.e()).booleanValue());
                return o;
            case 8:
                tcy tcyVar = (tcy) obj;
                tcyVar.U(new agmg("pii_hash.hash_key", 6));
                tcyVar.U(new agmg("pii_hash.hash_value", 6));
                return tcyVar;
            case 9:
                return ((ksw) obj).a();
            case 10:
                return (ksq) ((Optional) obj).get();
            case 11:
                return ((ktd) obj).c();
            case 12:
                return ((ksy) obj).c;
            case 13:
                return ((AdvancedFeedbackDataView) obj).f().get().e();
            case 14:
                int i = kws.m;
                return ((ConversationIdType) obj).a();
            case 15:
                int i2 = kws.m;
                return ((tar) obj).f;
            case 16:
                tbd tbdVar = (tbd) obj;
                int i3 = kws.m;
                tbdVar.c();
                return tbdVar;
            case 17:
                return a.aZ(obj);
            case 18:
                lcy lcyVar = (lcy) obj;
                lcyVar.l();
                return lcyVar;
            case 19:
                lcy lcyVar2 = (lcy) obj;
                lcyVar2.k("EMERGENCY+SERVICE+PROVIDER", "EMERGENCY+SERVICE+PROVIDER+DEMO");
                return lcyVar2;
            default:
                lcy lcyVar3 = (lcy) obj;
                lcyVar3.l();
                return lcyVar3;
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
