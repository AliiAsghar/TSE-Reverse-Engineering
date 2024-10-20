package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.Collection;
import j$.util.DesugarCollections;
import j$.util.Optional;
import j$.util.stream.Stream;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class yts implements algk {
    private final /* synthetic */ int a;

    public /* synthetic */ yts(int i) {
        this.a = i;
    }

    @Override // defpackage.algk
    public final Object apply(Object obj) {
        switch (this.a) {
            case 0:
                return true;
            case 1:
                alor alorVar = ytp.a;
                return null;
            case 2:
                return true;
            case 3:
                return false;
            case 4:
                Optional optional = (Optional) obj;
                alnr alnrVar = yul.a;
                if (optional.isPresent()) {
                    return yul.a((yub) optional.get());
                }
                return yua.UNKNOWN_TYPE;
            case 5:
                return Long.valueOf(((yuf) obj).f);
            case 6:
                return Boolean.valueOf(((yuf) obj).h);
            case 7:
                yuf yufVar = (yuf) obj;
                alnr alnrVar2 = yul.a;
                if (yufVar == null) {
                    int i = alog.d;
                    return alsx.a;
                }
                Stream map = Collection.EL.stream(DesugarCollections.unmodifiableMap(yufVar.e).values()).map(new yug(2));
                int i2 = alog.d;
                return (List) map.collect(alls.a);
            case 8:
                return true;
            case 9:
                return true;
            case 10:
                return true;
            case 11:
                Stream map2 = Collection.EL.stream((List) obj).map(new yug(10));
                int i3 = alog.d;
                alog alogVar = (alog) map2.collect(alls.a);
                tbb f = ParticipantsTable.f();
                f.aj("updateReachabilityOnlyForDuoKitAndViLTE");
                f.K(6);
                f.M(new yur(alogVar, 7));
                f.a().e();
                return null;
            case 12:
                yvs.a.r("Start group call failure, not logging click.", (Throwable) obj);
                return false;
            case 13:
                yvs.a.n("Start call failure, not logging click.", (Throwable) obj);
                return false;
            case 14:
                vqh vqhVar = (vqh) obj;
                yxp.a.l("SMS sending status: ".concat(String.valueOf(String.valueOf(vqhVar))));
                return vqhVar;
            case 15:
                vqh vqhVar2 = (vqh) obj;
                yxp.a.l("MMS sending status: ".concat(String.valueOf(String.valueOf(vqhVar2))));
                return vqhVar2;
            case 16:
                return ((vqh) obj).c(tqu.SLM);
            case 17:
                return ((vqh) obj).c(tqu.SLM);
            case 18:
                return ((vqh) obj).c(tqu.TELEPHONY_UNSPECIFIED);
            case 19:
                return ((vqh) obj).c(tqu.TELEPHONY_UNSPECIFIED);
            default:
                return null;
        }
    }
}
