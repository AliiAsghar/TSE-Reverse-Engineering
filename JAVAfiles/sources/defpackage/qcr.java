package defpackage;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class qcr implements Function {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ qcr(Object obj, int i) {
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
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r0v36, types: [agnw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v57, types: [java.lang.Object, arqr] */
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        Integer valueOf;
        switch (this.b) {
            case 0:
                snh snhVar = (snh) obj;
                snhVar.u(((qfo) this.a).h);
                return snhVar;
            case 1:
                return ((ryg) this.a).f(((Integer) obj).intValue());
            case 2:
                return ((ajrt) ((qdc) this.a).d.m().fu((qej) obj)).b;
            case 3:
                syc sycVar = (syc) obj;
                sycVar.d((String) this.a);
                return sycVar;
            case 4:
                snh snhVar2 = (snh) obj;
                snhVar2.z(1);
                valueOf = Integer.valueOf(a.bp().c());
                int intValue = valueOf.intValue();
                if (intValue < 8500) {
                    agnc.t("participant_id_list", intValue);
                }
                snhVar2.U(new agmd("conversations.participant_id_list", 1, String.valueOf(this.a)));
                return snhVar2;
            case 5:
                sjl sjlVar = (sjl) obj;
                ?? r0 = this.a;
                r0.getClass();
                sjlVar.b(r0);
                return sjlVar;
            case 6:
                sjl sjlVar2 = (sjl) obj;
                sjlVar2.b(this.a);
                return sjlVar2;
            case 7:
                sjl sjlVar3 = (sjl) obj;
                ?? r02 = this.a;
                r02.getClass();
                sjlVar3.b(r02);
                return sjlVar3;
            case 8:
                sjl sjlVar4 = (sjl) obj;
                sjlVar4.b(this.a);
                return sjlVar4;
            case 9:
                return ((qqq) this.a).a((String) obj).b;
            case 10:
                qpv qpvVar = (qpv) obj;
                xze xzeVar = qpn.a;
                qpvVar.b((ConversationIdType) ((alog) this.a).get(0));
                qpvVar.c(qpn.d);
                return qpvVar;
            case 11:
                qpv qpvVar2 = (qpv) obj;
                qpvVar2.U(new agmd("conversation_matcher_cache.destination_key", 1, ((qpm) this.a).a));
                qpvVar2.c(qpn.d);
                return qpvVar2;
            case 12:
                qpv qpvVar3 = (qpv) obj;
                qpvVar3.b((ConversationIdType) this.a);
                return qpvVar3;
            case 13:
                return Long.valueOf(this.a.Q("conversation_matcher_cache", (ContentValues) obj, 4));
            case 14:
                return ((qqq) this.a).c((String) obj);
            case 15:
                return ((uac) this.a).F((String) obj);
            case 16:
                snh snhVar3 = (snh) obj;
                alvi alviVar = qqw.a;
                snhVar3.j(((smr) this.a).x());
                return snhVar3;
            case 17:
                String k = ((msh) obj).k();
                k.getClass();
                return ((qqw) this.a).z(k);
            case 18:
                String str = (String) obj;
                if (((oyr) ((qqw) this.a).h.b()).a()) {
                    return DatabaseUtils.sqlEscapeString(str);
                }
                return String.format("'%s'", str);
            case 19:
                return ((qqq) this.a).a((String) obj);
            default:
                return this.a.a(obj);
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
