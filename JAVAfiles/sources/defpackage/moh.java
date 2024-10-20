package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.time.Duration;
import j$.time.Instant;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class moh implements Function {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ moh(Object obj, int i) {
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

    /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r0v32, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r0v34, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r0v36, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r0v37, types: [java.lang.Object, arqr] */
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        Integer valueOf;
        Integer valueOf2;
        switch (this.b) {
            case 0:
                sry sryVar = (sry) obj;
                mof mofVar = (mof) this.a;
                sryVar.b(mofVar.c);
                long j = mofVar.m;
                valueOf = Integer.valueOf(a.bp().c());
                int intValue = valueOf.intValue();
                if (intValue < 59100) {
                    agnc.t("sync_timestamp_ms", intValue);
                }
                sryVar.U(new agoi("lighter_conversations_table.sync_timestamp_ms", 10, Long.valueOf(j)));
                return sryVar;
            case 1:
                sry sryVar2 = (sry) obj;
                sryVar2.b((String) this.a);
                return sryVar2;
            case 2:
                snh snhVar = (snh) obj;
                snhVar.j((ConversationIdType) this.a);
                valueOf2 = Integer.valueOf(a.bp().c());
                int intValue2 = valueOf2.intValue();
                if (intValue2 < 29020) {
                    agnc.t("delete_timestamp", intValue2);
                }
                snhVar.U(new agoi("conversations.delete_timestamp", 1, 0L));
                return snhVar;
            case 3:
                sry sryVar3 = (sry) obj;
                sryVar3.b(((mof) this.a).c);
                return sryVar3;
            case 4:
                moq moqVar = (moq) this.a;
                armf armfVar = moqVar.d;
                snh snhVar2 = (snh) obj;
                Instant f = moqVar.c.f();
                Object b = armfVar.b();
                b.getClass();
                Duration ofDays = Duration.ofDays(((Number) b).longValue());
                ofDays.getClass();
                snhVar2.U(new agoi("conversations.sort_timestamp", 7, Long.valueOf(f.minus(ofDays).toEpochMilli())));
                return snhVar2;
            case 5:
                return d.V(this.a, obj);
            case 6:
                return this.a.a(obj);
            case 7:
                sgg sggVar = (sgg) obj;
                sggVar.b(((mpx) this.a).a.j().a);
                return sggVar;
            case 8:
                int i = mqi.c;
                return this.a.a(obj);
            case 9:
                int i2 = mqi.c;
                return this.a.a(obj);
            case 10:
                int i3 = mqi.c;
                return this.a.a(obj);
            case 11:
                int i4 = mqi.c;
                return this.a.a(obj);
            case 12:
                return this.a.a(obj);
            case 13:
                return ((yjr) ((mrk) this.a).g.b()).s((yjt) obj);
            case 14:
                return ((yjr) ((mrq) this.a).g.b()).s((yjt) obj);
            case 15:
                Object obj2 = this.a;
                alwo alwoVar = msb.a;
                return msb.s((qqq) obj2, ((yjt) obj).toString());
            case 16:
                return ((msb) this.a).m(((ykb) obj).r());
            case 17:
                return ((msb) this.a).m(((ykb) obj).u());
            case 18:
                return ((msj) this.a).a(((ykb) obj).r());
            case 19:
                return ((msj) this.a).a(((ykb) obj).u());
            default:
                alhr alhrVar = msx.a;
                return Boolean.valueOf(((vni) obj).m().equals(this.a));
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
