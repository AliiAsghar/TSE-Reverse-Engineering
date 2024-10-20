package defpackage;

import com.google.android.apps.messaging.shared.datamodel.database.upgrade.CustomUpgradeSteps;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class qqv implements Function {
    public final /* synthetic */ int a;
    private final /* synthetic */ int b;

    public /* synthetic */ qqv(int i, int i2) {
        this.b = i2;
        this.a = i;
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
            default:
                return Function$CC.$default$andThen(this, function);
        }
    }

    /* JADX WARN: Type inference failed for: r7v12, types: [xyt, java.lang.Object] */
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        Integer valueOf;
        switch (this.b) {
            case 0:
                snh snhVar = (snh) obj;
                alvi alviVar = qqw.a;
                int[] iArr = {1, 0};
                valueOf = Integer.valueOf(a.bp().c());
                int intValue = valueOf.intValue();
                if (intValue < 10007) {
                    agnc.t("conv_type", intValue);
                }
                int i = this.a;
                snhVar.U(new agmf("conversations.conv_type", 3, snh.Y(iArr), true));
                snhVar.q(i);
                return snhVar;
            case 1:
                sfy sfyVar = new sfy();
                sfyVar.U(new agoi("backup_id_map.backup_id", 1, Long.valueOf(this.a)));
                String[] strArr = PartsTable.a;
                sfyVar.f("parts");
                return sfyVar;
            case 2:
                qwv qwvVar = (qwv) obj;
                int i2 = qwd.a;
                qwvVar.d(this.a);
                qwvVar.b();
                return qwvVar;
            case 3:
                qwv qwvVar2 = (qwv) obj;
                int i3 = qwd.a;
                qwvVar2.d(this.a);
                qwvVar2.c("unknown_iccid");
                return qwvVar2;
            case 4:
                tbd tbdVar = (tbd) obj;
                alwo alwoVar = qxb.a;
                tbdVar.q(this.a);
                return tbdVar;
            case 5:
                syc sycVar = (syc) obj;
                CustomUpgradeSteps.lambda$upgradeToVersion4020$0(this.a, sycVar);
                return sycVar;
            case 6:
                srl srlVar = (srl) obj;
                xze xzeVar = ukq.a;
                srlVar.g(this.a);
                return srlVar;
            case 7:
                srl srlVar2 = (srl) obj;
                xze xzeVar2 = ukq.a;
                srlVar2.U(new agmf("generic_worker_queue.worker_type", 3, srl.Y(new int[]{32, 64, 128}), true));
                srlVar2.g(this.a);
                return srlVar2;
            case 8:
                tkq tkqVar = (tkq) obj;
                tkqVar.b(this.a);
                return tkqVar;
            case 9:
                return new adjl(((vrn) ((znj) obj).b.a()).f(this.a));
            default:
                return "JT_" + this.a + "_" + ((String) obj);
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
            default:
                return Function$CC.$default$compose(this, function);
        }
    }
}
