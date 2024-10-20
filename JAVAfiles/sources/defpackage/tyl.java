package defpackage;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityIdImpl;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class tyl implements Function {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ tyl(Object obj, int i) {
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
    /* JADX WARN: Type inference failed for: r0v20, types: [java.util.Collection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v52, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v95, types: [java.lang.Object, java.lang.Iterable] */
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        String sqlEscapeString;
        ucn a;
        String str;
        String str2;
        switch (this.b) {
            case 0:
                snh snhVar = (snh) obj;
                alog alogVar = tyo.a;
                snhVar.j((ConversationIdType) this.a);
                return snhVar;
            case 1:
                snh snhVar2 = (snh) obj;
                alog alogVar2 = tyo.a;
                snhVar2.g(1);
                snhVar2.f(((SelfIdentityIdImpl) this.a).a);
                return snhVar2;
            case 2:
                tbu tbuVar = (tbu) obj;
                alog alogVar3 = tyo.a;
                tbuVar.i((MessageIdType) this.a);
                return tbuVar;
            case 3:
                ssr ssrVar = (ssr) obj;
                alog alogVar4 = tyo.a;
                ssrVar.b((MessageIdType) this.a);
                return ssrVar;
            case 4:
                syc sycVar = (syc) obj;
                alog alogVar5 = tyo.a;
                sycVar.i((MessageIdType) this.a);
                return sycVar;
            case 5:
                syc sycVar2 = (syc) obj;
                alog alogVar6 = tyo.a;
                sycVar2.i((MessageIdType) this.a);
                return sycVar2;
            case 6:
                tfo tfoVar = (tfo) obj;
                tfoVar.U(new agmf("recent_expressive_stickers.name", 3, tfo.X((Iterable) Collection.EL.stream(this.a).map(new tvq(14)).collect(Collectors.toCollection(new tyr(2)))), false));
                return tfoVar;
            case 7:
                String str3 = (String) obj;
                alvi alviVar = uci.a;
                Object obj2 = ((ContentValues) this.a).get(str3);
                if (obj2 == null) {
                    sqlEscapeString = "NULL";
                } else if (obj2 instanceof Boolean) {
                    if (true != ((Boolean) obj2).booleanValue()) {
                        sqlEscapeString = "0";
                    } else {
                        sqlEscapeString = "1";
                    }
                } else if (obj2 instanceof Number) {
                    sqlEscapeString = obj2.toString();
                } else {
                    sqlEscapeString = DatabaseUtils.sqlEscapeString(obj2.toString());
                }
                return sqlEscapeString + " -- " + str3 + "\n";
            case 8:
                ude udeVar = (ude) obj;
                StringBuilder sb = new StringBuilder();
                sb.append("D26rHistoryItem:\n");
                ucv.g(sb, "tag", udeVar.a.toString());
                ucv.g(sb, "op", udeVar.b.toString());
                ucv.g(sb, "tid", String.valueOf(Thread.currentThread().getId()));
                ucv.g(sb, "inflt", String.valueOf(udeVar.i));
                ucv.g(sb, "et", ucv.f(udeVar.h));
                ucv.g(sb, "tt", ucv.f(udeVar.g));
                ucv.g(sb, "rows", String.valueOf(udeVar.f.get()));
                if ((udeVar.g.get() > 100 || udeVar.h.get() > 100) && (str = (a = udeVar.a()).a) != null) {
                    str2 = agnc.c(((uci) udeVar.d).k(), str, (String[]) a.b.toArray(new String[0]), ((ucv) this.a).b).a;
                } else {
                    str2 = "not computed";
                }
                ucv.g(sb, "plan", str2);
                return sb.toString();
            case 9:
                smr smrVar = (smr) obj;
                if (smrVar.F().c()) {
                    return smrVar.F();
                }
                if (smrVar.F().c()) {
                    return smrVar.F();
                }
                Object obj3 = this.a;
                if (smrVar.aa()) {
                    ugv ugvVar = (ugv) obj3;
                    ((mbl) ugvVar.b.b()).c("Bugle.Wipeout.ReverseTelephonySync.GetThreadId.AwaitingSync.InvalidThreadId");
                    if (((Boolean) ugv.a.e()).booleanValue()) {
                        ugvVar.c.isPresent();
                        return ((xgl) ugvVar.c.get().b()).a(smrVar.x());
                    }
                } else {
                    ((mbl) ((ugv) obj3).b.b()).c("Bugle.Wipeout.ReverseTelephonySync.GetThreadId.NotAwaitingSync.InvalidThreadId");
                }
                return smrVar.F();
            case 10:
                tbd tbdVar = (tbd) obj;
                tbdVar.h((String) this.a);
                tbdVar.q(-2);
                return tbdVar;
            case 11:
                return ((msk) ((ugw) this.a).a.b()).c((String) obj, new ubz(9));
            case 12:
                return ((msk) ((uhg) this.a).h.b()).x((ParticipantsTable.BindData) obj);
            case 13:
                alvi alviVar2 = uhg.a;
                return Boolean.valueOf(((msh) obj).equals(((Optional) this.a).get()));
            case 14:
                tbd tbdVar2 = (tbd) obj;
                alvi alviVar3 = uhg.a;
                tbdVar2.r(-1);
                tbdVar2.p(((ParticipantsTable.BindData) this.a).o());
                return tbdVar2;
            case 15:
                return ((msk) ((uhg) this.a).h.b()).x((ParticipantsTable.BindData) obj);
            case 16:
                tbd tbdVar3 = (tbd) obj;
                alvi alviVar4 = uhg.a;
                tbdVar3.h((String) this.a);
                return tbdVar3;
            case 17:
                tbd tbdVar4 = (tbd) obj;
                alvi alviVar5 = uhg.a;
                tbdVar4.h((String) this.a);
                return tbdVar4;
            case 18:
                tbd tbdVar5 = (tbd) obj;
                alvi alviVar6 = uhg.a;
                tbdVar5.h((String) this.a);
                return tbdVar5;
            case 19:
                alvi alviVar7 = uhg.a;
                return Boolean.valueOf(((msh) obj).equals(((Optional) this.a).get()));
            default:
                tbu tbuVar2 = (tbu) obj;
                tbuVar2.g(this.a);
                return tbuVar2;
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
