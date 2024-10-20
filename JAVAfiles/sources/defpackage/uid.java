package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityIdImpl;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class uid implements Function {
    private final /* synthetic */ int a;

    public /* synthetic */ uid(int i) {
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
        Integer valueOf;
        int i = 0;
        switch (this.a) {
            case 0:
                tbh tbhVar = (tbh) obj;
                return new tbi[]{tbhVar.k, tbhVar.a};
            case 1:
                tbu tbuVar = (tbu) obj;
                tbuVar.l();
                return tbuVar;
            case 2:
                tbu tbuVar2 = (tbu) obj;
                tbuVar2.l();
                return tbuVar2;
            case 3:
                return ((tbh) obj).a;
            case 4:
                return ((Context) obj).getCacheDir();
            case 5:
                return ((nfw) obj).f();
            case 6:
                return String.valueOf(((rtw) obj).a);
            case 7:
                alvi alviVar = ujv.a;
                return ((SelfIdentityIdImpl) ((nfw) obj).f()).a;
            case 8:
                return aozb.w((byte[]) ((Optional) obj).get());
            case 9:
                tbd tbdVar = (tbd) obj;
                tbdVar.k(tqr.VERIFICATION_NA);
                return tbdVar;
            case 10:
                syc sycVar = (syc) obj;
                tqr tqrVar = tqr.VERIFICATION_NA;
                valueOf = Integer.valueOf(a.bp().c());
                int intValue = valueOf.intValue();
                if (intValue < 29090) {
                    agnc.t(BusinessInfoDatabaseConstants.BusinessInfoTableConstants.Columns.VERIFICATION_STATUS, intValue);
                }
                if (tqrVar != null) {
                    i = tqrVar.ordinal();
                }
                sycVar.U(new agoi("messages.verification_status", 7, Integer.valueOf(i)));
                return sycVar;
            case 11:
                return ((srd) obj).o();
            case 12:
                xze xzeVar = ukq.a;
                return ((upt) obj).i;
            case 13:
                srl srlVar = (srl) obj;
                xze xzeVar2 = ukq.a;
                String[] strArr = srm.a;
                srlVar.U(new agme("generic_worker_queue._id", 3, new agpl("(SELECT one._id FROM generic_worker_queue AS one INNER JOIN generic_worker_queue AS other  ON one.worker_type = other.worker_type AND one.item_table_type = other.item_table_type AND one.item_id = other.item_id AND one.account_id = other.account_id AND one._id > other._id AND one.in_flight = other.in_flight AND one.flags = other.flags AND other.retry_count < " + riw.c() + ")")));
                srlVar.d(false);
                return srlVar;
            case 14:
                srl srlVar2 = (srl) obj;
                xze xzeVar3 = ukq.a;
                srlVar2.d(true);
                return srlVar2;
            case 15:
                int i2 = uku.a;
                return Collection.EL.stream(((xxr) obj).a());
            case 16:
                snh snhVar = (snh) obj;
                snhVar.e(2);
                return snhVar;
            case 17:
                alvi alviVar2 = ulw.a;
                return ((sxo) obj).a;
            case 18:
                return Uri.parse((String) obj);
            case 19:
                return Uri.parse((String) obj);
            default:
                return ruy.b((String) obj);
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
