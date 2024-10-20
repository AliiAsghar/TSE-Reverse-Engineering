package defpackage;

import com.google.android.apps.messaging.shared.datamodel.database.upgrade.OnDeviceDatabaseUpgradeHandler;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.function.Function$CC;
import java.util.Locale;
import java.util.Map;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class rzq implements Function {
    private final /* synthetic */ int a;

    public /* synthetic */ rzq(int i) {
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
        int i = 1;
        int i2 = 0;
        switch (this.a) {
            case 0:
                snh snhVar = (snh) obj;
                OnDeviceDatabaseUpgradeHandler.lambda$loadConversationCustomization$1(snhVar);
                return snhVar;
            case 1:
                return OnDeviceDatabaseUpgradeHandler.lambda$loadConversationCustomization$0((smu) obj);
            case 2:
                snh snhVar2 = (snh) obj;
                OnDeviceDatabaseUpgradeHandler.lambda$loadConversationCustomization$2(snhVar2);
                return snhVar2;
            case 3:
                snh snhVar3 = (snh) obj;
                OnDeviceDatabaseUpgradeHandler.lambda$loadConversationCustomization$3(snhVar3);
                return snhVar3;
            case 4:
                snh snhVar4 = (snh) obj;
                OnDeviceDatabaseUpgradeHandler.lambda$loadConversationCustomization$4(snhVar4);
                return snhVar4;
            case 5:
                snh snhVar5 = (snh) obj;
                OnDeviceDatabaseUpgradeHandler.lambda$loadConversationCustomization$5(snhVar5);
                return snhVar5;
            case 6:
                snh snhVar6 = (snh) obj;
                OnDeviceDatabaseUpgradeHandler.lambda$loadConversationCustomization$6(snhVar6);
                return snhVar6;
            case 7:
                return OnDeviceDatabaseUpgradeHandler.lambda$filterUpgradesForDatabase$1((Map.Entry) obj);
            case 8:
                String str = (String) obj;
                return String.format(Locale.US, "(OLD.%s IS NOT NEW.%s)", str, str);
            case 9:
                return a.aZ(obj);
            case 10:
                return Integer.valueOf(((tqc) obj).h);
            case 11:
                return Integer.valueOf(((tqc) obj).h);
            case 12:
                String str2 = sam.a;
                return ((tar) obj).F;
            case 13:
                smo smoVar = (smo) obj;
                String str3 = sam.a;
                smoVar.c(ParticipantsTable.c.a);
                return smoVar;
            case 14:
                tbd tbdVar = (tbd) obj;
                String str4 = sam.a;
                smm smmVar = new smm(smp.a);
                smmVar.d(new sal(i2));
                smmVar.e(new rzq(13));
                tbdVar.i(smmVar.b());
                tbdVar.k(tqr.VERIFICATION_NA);
                return tbdVar;
            case 15:
                String str5 = sam.a;
                return ((tar) obj).F;
            case 16:
                tbd tbdVar2 = (tbd) obj;
                String str6 = sam.a;
                sla a = sld.a();
                a.d(new rzq(20));
                a.f(new sal(i));
                tbdVar2.i(a.b());
                tbdVar2.k(tqr.VERIFICATION_NA);
                return tbdVar2;
            case 17:
                String str7 = sam.a;
                return ((usk) obj).f;
            case 18:
                tgq tgqVar = (tgq) obj;
                String str8 = sam.a;
                tgqVar.b(sni.c.a);
                return tgqVar;
            case 19:
                syc sycVar = (syc) obj;
                String str9 = sam.a;
                sycVar.A(false);
                sycVar.g(sni.c.a);
                return sycVar;
            default:
                String str10 = sam.a;
                return ((jat) obj).e;
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
