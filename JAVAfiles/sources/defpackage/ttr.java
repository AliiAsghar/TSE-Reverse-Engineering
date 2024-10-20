package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.communication.synapse.security.scytale.UserDevice;
import j$.time.Instant;
import j$.util.function.Function$CC;
import java.util.Iterator;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class ttr implements Function {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ ttr(Object obj, int i) {
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
    /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r0v33, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r0v5, types: [mre, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v50, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r0v51, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        Integer valueOf;
        switch (this.b) {
            case 0:
                spu spuVar = (spu) obj;
                spuVar.b((rve) this.a);
                return spuVar;
            case 1:
                spu spuVar2 = (spu) obj;
                spuVar2.b((rve) this.a);
                return spuVar2;
            case 2:
                return this.a.b((qei) obj);
            case 3:
                tbu tbuVar = (tbu) obj;
                tbuVar.i(this.a.B());
                return tbuVar;
            case 4:
                tbu tbuVar2 = (tbu) obj;
                tbuVar2.i(this.a.B());
                return tbuVar2;
            case 5:
                tce tceVar = (tce) obj;
                tceVar.f((String) this.a);
                tceVar.c(tqn.WAITING_PRIOR_MESSAGE, tqn.WAITING_IDENTITY_VERIFICATION);
                return tceVar;
            case 6:
                tce tceVar2 = (tce) obj;
                tceVar2.d((rve) this.a);
                tceVar2.c(tqn.WAITING_PRIOR_MESSAGE, tqn.WAITING_IDENTITY_VERIFICATION);
                return tceVar2;
            case 7:
                tce tceVar3 = (tce) obj;
                tceVar3.d(((vqy) this.a).a);
                return tceVar3;
            case 8:
                return ((psq) this.a).c((String) obj);
            case 9:
                tic ticVar = (tic) obj;
                xze xzeVar = tvt.a;
                ticVar.b((String) this.a);
                return ticVar;
            case 10:
                snh snhVar = (snh) obj;
                snhVar.u(((vqy) this.a).h);
                return snhVar;
            case 11:
                thv thvVar = (thv) obj;
                thvVar.ao(0, "remote_user_id");
                return new UserDevice(thvVar.a, (String) this.a);
            case 12:
                return ((wyp) this.a).D((String) obj);
            case 13:
                syc sycVar = (syc) obj;
                sycVar.m(this.a);
                sycVar.y(2);
                return sycVar;
            case 14:
                syc sycVar2 = (syc) obj;
                valueOf = Integer.valueOf(a.bp().c());
                int intValue = valueOf.intValue();
                if (intValue < 48030) {
                    agnc.t("original_message_id", intValue);
                }
                ?? r0 = this.a;
                alob alobVar = new alob();
                Iterator it = r0.iterator();
                while (it.hasNext()) {
                    alobVar.h(String.valueOf(rvc.a((MessageIdType) it.next())));
                }
                sycVar2.U(new agmf("messages.original_message_id", 3, syc.X(alobVar.g()), true));
                sycVar2.q(true);
                sycVar2.y(2);
                return sycVar2;
            case 15:
                tce tceVar4 = (tce) obj;
                tceVar4.d((rve) this.a);
                tceVar4.b(tqn.FAILED_TO_DECRYPT);
                return tceVar4;
            case 16:
                tce tceVar5 = (tce) obj;
                tceVar5.d((rve) this.a);
                tceVar5.b(tqn.FAILED_TO_DECRYPT);
                return tceVar5;
            case 17:
                tce tceVar6 = (tce) obj;
                tceVar6.U(new agoi("pending_incoming_message_rcs_table.received_timestamp", 10, Long.valueOf(((Instant) this.a).toEpochMilli())));
                tceVar6.b(tqn.DECRYPTED);
                return tceVar6;
            case 18:
                tce tceVar7 = (tce) obj;
                tceVar7.d((rve) this.a);
                tceVar7.b(tqn.DECRYPTED);
                return tceVar7;
            case 19:
                return d.X(this.a, obj);
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
