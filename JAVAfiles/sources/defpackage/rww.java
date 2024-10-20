package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import j$.util.Optional;
import j$.util.stream.Collectors;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rww {
    public static final /* synthetic */ int a = 0;
    private static final syb b;
    private final uhj c;
    private final armf d;

    static {
        syc sycVar = new syc();
        sycVar.M(10);
        tbs d = PartsTable.d();
        d.w("PROCESSING_COMPLETE_YET_TO_SEND");
        d.e(new rwc(13));
        d.g(new rwc(14));
        sycVar.U(new agme("messages._id", 4, d.b()));
        b = new syb(sycVar);
    }

    public rww(uhj uhjVar, armf armfVar) {
        this.c = uhjVar;
        this.d = armfVar;
    }

    public final int a() {
        Integer valueOf;
        boolean booleanValue = ((Boolean) vof.a.e()).booleanValue();
        syc sycVar = new syc();
        sycVar.M(10);
        tbs d = PartsTable.d();
        d.w("buildWhereProcessedMessageHasFailedParts");
        d.e(new rwc(12));
        alob alobVar = new alob();
        alobVar.h(tql.SUCCEEDED);
        if (booleanValue) {
            alobVar.h(tql.PENDING);
        }
        tbu tbuVar = new tbu();
        alog g = alobVar.g();
        valueOf = Integer.valueOf(a.bp().c());
        int intValue = valueOf.intValue();
        if (intValue < 4020) {
            agnc.t("processing_status", intValue);
        }
        boolean z = true;
        tbuVar.U(new agmf("parts.processing_status", 4, tbu.X((Iterable) alzz.C(g).map(new sho(17)).collect(Collectors.toCollection(new taq(9)))), true));
        d.k(new agpw(tbuVar));
        sycVar.l(d.b());
        syb sybVar = new syb(sycVar);
        mlb mlbVar = (mlb) this.d.b();
        sxy d2 = MessagesTable.d();
        d2.w("promoteProcessedMessages-messages1");
        d2.q();
        d2.k(sybVar);
        alog g2 = d2.b().g();
        aavj a2 = mlc.a();
        a2.b = Optional.of(10001);
        a2.h(amlg.ATTACHMENT_PROCESS_FAILED);
        mlc g3 = a2.g();
        sya syaVar = new sya();
        syaVar.P(new mjz(g2, 2));
        g3.a.ifPresent(new mht(syaVar, 9));
        int i = g3.c;
        amlg amlgVar = g3.b;
        int i2 = g3.d;
        if (i2 != 0) {
            if (i2 != 1) {
                z = false;
            }
            mlbVar.a(syaVar, i, amlgVar, z);
            syb sybVar2 = b;
            sya syaVar2 = new sya();
            syaVar2.aj("promoteProcessedMessages-messages2");
            syaVar2.L(4);
            sxy d3 = MessagesTable.d();
            d3.w("+notifyAboutMessagesChangeAndUpdate");
            d3.q();
            d3.k(sybVar2);
            sxt sxtVar = (sxt) d3.b().n();
            while (sxtVar.moveToNext()) {
                try {
                    this.c.j(sxtVar.C(), sxtVar.E(), "message_status");
                } catch (Throwable th) {
                    try {
                        sxtVar.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            sxtVar.close();
            syaVar2.Z(sybVar2);
            syaVar2.af();
            return syaVar2.a().e();
        }
        throw null;
    }
}
