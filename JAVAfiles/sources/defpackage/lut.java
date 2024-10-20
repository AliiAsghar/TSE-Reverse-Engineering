package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityIdImpl;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class lut implements Function {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ lut(Object obj, int i) {
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

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, agpj] */
    /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    /* JADX WARN: Type inference failed for: r0v32, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    /* JADX WARN: Type inference failed for: r0v34, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r0v36, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    /* JADX WARN: Type inference failed for: r0v40, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.b) {
            case 0:
                tio tioVar = (tio) obj;
                tioVar.getClass();
                luz.r(tioVar);
                tioVar.U(new agme("restore_workflow_executions._id", 4, this.a));
                return tioVar;
            case 1:
                tio tioVar2 = (tio) obj;
                tioVar2.b(Optional.of(this.a));
                return tioVar2;
            case 2:
                tio tioVar3 = (tio) obj;
                tioVar3.b(Optional.of(this.a));
                return tioVar3;
            case 3:
                tio tioVar4 = (tio) obj;
                tioVar4.b(Optional.of(this.a));
                return tioVar4;
            case 4:
                tio tioVar5 = (tio) obj;
                lgc lgcVar = luz.g;
                Object obj2 = this.a;
                obj2.getClass();
                tioVar5.b(Optional.of(obj2));
                return tioVar5;
            case 5:
                tio tioVar6 = (tio) obj;
                tioVar6.b(Optional.of(this.a));
                return tioVar6;
            case 6:
                tio tioVar7 = (tio) obj;
                tioVar7.b(Optional.of(this.a));
                return tioVar7;
            case 7:
                tio tioVar8 = (tio) obj;
                tioVar8.b(Optional.of(this.a));
                return tioVar8;
            case 8:
                tio tioVar9 = (tio) obj;
                tioVar9.b(Optional.of(this.a));
                return tioVar9;
            case 9:
                tio tioVar10 = (tio) obj;
                tioVar10.b(Optional.of(this.a));
                return tioVar10;
            case 10:
                int i = mdt.d;
                aozy builder = ((apag) this.a).toBuilder();
                long longValue = ((Long) obj).longValue();
                if (!builder.b.isMutable()) {
                    builder.u();
                }
                mdn mdnVar = (mdn) builder.b;
                mdnVar.b |= 2;
                mdnVar.d = longValue;
                return (mdn) builder.s();
            case 11:
                return (amed) ((algf) this.a).fu((yap) obj);
            case 12:
                qwv qwvVar = (qwv) obj;
                xze xzeVar = mfo.a;
                qwvVar.c((String) this.a);
                return qwvVar;
            case 13:
                syc sycVar = (syc) obj;
                sycVar.f(this.a.z());
                return sycVar;
            case 14:
                syc sycVar2 = (syc) obj;
                sycVar2.F(this.a.aw());
                return sycVar2;
            case 15:
                syc sycVar3 = (syc) obj;
                sycVar3.U(new agmf("messages.message_protocol", 3, syc.X(this.a), true));
                return sycVar3;
            case 16:
                syc sycVar4 = (syc) obj;
                sycVar4.U(new agmd("messages.self_id", 1, ((SelfIdentityIdImpl) this.a.v()).a));
                return sycVar4;
            case 17:
                syc sycVar5 = (syc) obj;
                sycVar5.D(this.a.n());
                return sycVar5;
            case 18:
                return Long.valueOf(((lzz) this.a).a((ConversationIdType) obj));
            case 19:
                Long l = (Long) obj;
                if (l.longValue() <= 0) {
                    long epochMilli = ((mic) this.a).v.f().toEpochMilli();
                    xyo a = mic.k.a();
                    a.H(a.ck(epochMilli, "Setting the time of the first use of the app to"));
                    a.q();
                    return Optional.of(Long.valueOf(epochMilli));
                }
                xyo a2 = mic.k.a();
                a2.H("Time of the first use of the app.");
                a2.H(l);
                a2.q();
                return Optional.empty();
            default:
                return ((adje) ((mic) this.a).H.b()).k(((Integer) obj).intValue());
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
