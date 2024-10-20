package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.time.Instant;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class xgv implements Function {
    private final /* synthetic */ int a;

    public /* synthetic */ xgv(int i) {
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
        boolean z = true;
        switch (this.a) {
            case 0:
                alvi alviVar = xgw.a;
                return ((ParticipantsTable.BindData) obj).P();
            case 1:
                syc sycVar = (syc) obj;
                alvi alviVar2 = xgw.a;
                sycVar.c();
                return sycVar;
            case 2:
                return Integer.valueOf(((xgx) obj).e);
            case 3:
                utz utzVar = xgz.a;
                return Instant.ofEpochMilli(apds.a((apct) obj));
            case 4:
                syc sycVar2 = (syc) obj;
                int i = xhe.c;
                sycVar2.K();
                return sycVar2;
            case 5:
                syc sycVar3 = (syc) obj;
                int i2 = xhe.c;
                sycVar3.L();
                return sycVar3;
            case 6:
                alwo alwoVar = xhz.a;
                ((Boolean) new mst(15).get()).booleanValue();
                return Optional.ofNullable(((msh) obj).o(false));
            case 7:
                alwo alwoVar2 = xhz.a;
                return (String) ((Optional) obj).orElse("ʼUNKNOWN_SENDER!ʼ");
            case 8:
                xze xzeVar = xiu.a;
                return ((Uri) obj).getPathSegments().get(0);
            case 9:
                xze xzeVar2 = xiu.a;
                return ((xin) obj).b;
            case 10:
                xze xzeVar3 = xiu.a;
                return ((xin) obj).a;
            case 11:
                xze xzeVar4 = xiu.a;
                return ((xin) obj).b;
            case 12:
                return ((tbh) obj).c;
            case 13:
                xze xzeVar5 = xja.a;
                return albo.ag(((msh) obj).m());
            case 14:
                tbu tbuVar = (tbu) obj;
                xze xzeVar6 = xng.a;
                tbuVar.h();
                valueOf = Integer.valueOf(a.bp().c());
                int intValue = valueOf.intValue();
                if (intValue < 52050) {
                    agnc.t("file_size_bytes", intValue);
                }
                tbuVar.U(new agoi("parts.file_size_bytes", 7, 0L));
                return tbuVar;
            case 15:
                tbh tbhVar = (tbh) obj;
                xze xzeVar7 = xng.a;
                return new tbi[]{tbhVar.a, tbhVar.S, tbhVar.R};
            case 16:
                tbu tbuVar2 = (tbu) obj;
                xze xzeVar8 = xng.a;
                tbuVar2.h();
                return tbuVar2;
            case 17:
                tbh tbhVar2 = (tbh) obj;
                int i3 = xnh.a;
                return new tbi[]{tbhVar2.a, tbhVar2.S};
            case 18:
                int i4 = xnh.a;
                return ((sxo) obj).a;
            case 19:
                tbh tbhVar3 = (tbh) obj;
                int i5 = xnh.a;
                return new tbi[]{tbhVar3.a, tbhVar3.S};
            default:
                alwo alwoVar3 = xot.a;
                if (((xow) obj).l() != null) {
                    z = false;
                }
                return Boolean.valueOf(z);
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
