package defpackage;

import android.util.Pair;
import com.google.android.apps.messaging.shared.datamodel.action.FixupMessageStatusOnStartupAction;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import j$.time.Duration;
import j$.time.Instant;
import j$.util.Optional;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class qwq implements alhr {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ qwq(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v26, types: [ykb, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v35, types: [ocu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v55, types: [msh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v60, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v63, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v66, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v69, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v72, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v75, types: [armf, java.lang.Object] */
    @Override // defpackage.alhr
    public final Object get() {
        int i = 1;
        int i2 = 0;
        switch (this.b) {
            case 0:
                return "sim_serial_number:".concat(String.valueOf(((qwr) this.a).getString(1)));
            case 1:
                return "sub_id:".concat(String.valueOf(((qwr) this.a).getString(0)));
            case 2:
                return "telephony_phone_number:".concat(String.valueOf(((qwr) this.a).getString(2)));
            case 3:
                return "my_identity_token:".concat(String.valueOf(((qwr) this.a).getString(3)));
            case 4:
                return "my_identity_token_with_foreign_key:".concat(String.valueOf(((qwr) this.a).getString(4)));
            case 5:
                return qxb.g(this.a);
            case 6:
                aiwl a = wus.a();
                a.i(wuk.DB_METADATA);
                a.k(uhh.a);
                a.h(new qxs(i2));
                return ((znj) this.a).ab(a.f());
            case 7:
                return Arrays.toString(((RuntimeException) this.a).getStackTrace());
            case 8:
                return Boolean.valueOf(this.a.a());
            case 9:
                FixupMessageStatusOnStartupAction fixupMessageStatusOnStartupAction = (FixupMessageStatusOnStartupAction) this.a;
                Instant minus = fixupMessageStatusOnStartupAction.e.f().minus(Duration.ofHours(((Long) fixupMessageStatusOnStartupAction.b.b()).longValue()));
                sya syaVar = new sya();
                syaVar.aj("FixupMessageStatusOnStartupAction#executeAction-messages0");
                syaVar.L(7);
                int i3 = 12;
                syaVar.P(new qwz(minus, i3));
                int e = syaVar.a().e();
                sya syaVar2 = new sya();
                syaVar2.aj("FixupMessageStatusOnStartupAction#executeAction-messages1");
                syaVar2.L(106);
                syaVar2.P(new qza(7));
                int e2 = syaVar2.a().e();
                mlb mlbVar = (mlb) fixupMessageStatusOnStartupAction.f.b();
                amlg amlgVar = amlg.APP_RESTART;
                sya syaVar3 = new sya();
                syaVar3.P(new mfk(17));
                int a2 = mlbVar.a(syaVar3, 8, amlgVar, mlbVar.d.a());
                alob alobVar = new alob();
                tbs d = PartsTable.d();
                d.w("getOutputUriForAllProcessingParts");
                d.g(new uid(i));
                d.d(new uid(i2));
                tbn tbnVar = (tbn) d.b().n();
                while (tbnVar.moveToNext()) {
                    try {
                        alobVar.h(new Pair(tbnVar.t(), tbnVar.Q()));
                    } catch (Throwable th) {
                        try {
                            tbnVar.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                tbnVar.close();
                fixupMessageStatusOnStartupAction.d.h(new mla(i3), null, new uym(fixupMessageStatusOnStartupAction, alobVar.g(), a2, e2, 1));
                return Integer.valueOf(e);
            case 10:
                return ((msh) ((Optional) this.a).get()).m();
            case 11:
                return this.a;
            case 12:
                return this.a;
            case 13:
                return this.a.f();
            case 14:
                return ((ParticipantsTable.BindData) this.a).O();
            case 15:
                return (rgf) this.a.b();
            case 16:
                return (yjy) this.a.b();
            case 17:
                return (trz) this.a.b();
            case 18:
                return (xro) this.a.b();
            case 19:
                return (zxy) this.a.b();
            default:
                return (rzx) this.a.b();
        }
    }
}
