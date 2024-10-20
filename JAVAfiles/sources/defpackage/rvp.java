package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import j$.util.stream.Stream;
import java.util.HashSet;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rvp {
    public static final xze a = xze.g("Bugle", "DraftMessageTypeConverter");
    public static final alvi b = alvi.m("com/google/android/apps/messaging/shared/datamodel/data/draft/DraftMessageTypeConverter");
    public final vqu c;
    public final xbf d;
    public final nct e;
    public final armf f;
    public final armf g;

    public rvp(vqu vquVar, xbf xbfVar, nct nctVar, armf armfVar, armf armfVar2) {
        this.c = vquVar;
        this.d = xbfVar;
        this.e = nctVar;
        this.f = armfVar;
        this.g = armfVar2;
    }

    public static rvn a(int i, rvo rvoVar) {
        HashSet hashSet = new HashSet();
        Stream z = ((rsr) rvoVar.a).z();
        int i2 = alog.d;
        List list = (List) z.collect(alls.a);
        if (list.size() <= i) {
            return new rvn();
        }
        if (!rvoVar.c) {
            return new rvn(4);
        }
        a.p("draft forced to change: dropping extra attachments.");
        while (i < list.size()) {
            hashSet.add((MessagePartCoreData) list.get(i));
            i++;
        }
        return new rvn(hashSet, 3);
    }

    public static rvn b(int i, rvo rvoVar) {
        HashSet hashSet = new HashSet();
        if (rvoVar.a.k() <= i) {
            return new rvn();
        }
        if (!rvoVar.c) {
            return new rvn(4);
        }
        a.p("draft forced to change: dropping extra attachments.");
        rtr rtrVar = rvoVar.a;
        while (true) {
            List list = ((rsr) rtrVar).u;
            if (i < list.size()) {
                hashSet.add((MessagePartCoreData) list.get(i));
                i++;
            } else {
                return new rvn(hashSet, 3);
            }
        }
    }

    public static rvn c(rtr rtrVar, int i, boolean z) {
        return f(((rsr) rtrVar).k, i, z, false);
    }

    public static rvn d(rtr rtrVar, int i, boolean z) {
        return f(((rsr) rtrVar).l, i, z, true);
    }

    public static void e(aozy aozyVar, int i) {
        amjy amjyVar;
        if (i != 1) {
            int i2 = i - 1;
            if (i != 0) {
                switch (i2) {
                    case 0:
                        amjyVar = amjy.UNKNOWN_REASON;
                        break;
                    case 1:
                        amjyVar = amjy.FAILED_SUB_HAS_NO_RCS;
                        break;
                    case 2:
                        amjyVar = amjy.FAILED_MESSAGE_TOO_LONG;
                        break;
                    case 3:
                        amjyVar = amjy.FAILED_ATTACHMENT_COUNT_EXCEEDED;
                        break;
                    case 4:
                        amjyVar = amjy.FAILED_SUBJECT_TOO_LONG;
                        break;
                    case 5:
                        amjyVar = amjy.FAILED_QUERY_RCS_MAX_SIZE;
                        break;
                    case 6:
                        amjyVar = amjy.FAILED_DOES_NOT_SUPPORT_FT_OVER_HTTP;
                        break;
                    default:
                        amjyVar = amjy.UNKNOWN_REASON;
                        break;
                }
                if (!aozyVar.b.isMutable()) {
                    aozyVar.u();
                }
                amjz amjzVar = (amjz) aozyVar.b;
                apap apapVar = amjz.a;
                amjyVar.getClass();
                apao apaoVar = amjzVar.e;
                if (!apaoVar.c()) {
                    amjzVar.e = apag.mutableCopy(apaoVar);
                }
                amjzVar.e.g(amjyVar.i);
                return;
            }
            throw null;
        }
    }

    private static rvn f(String str, int i, boolean z, boolean z2) {
        if (str != null && str.length() > i) {
            int i2 = 3;
            if (!z) {
                if (true == z2) {
                    i2 = 5;
                }
                return new rvn(i2);
            }
            a.p("draft forced to change: truncated message.");
            return new rvn(str.substring(0, i), 3);
        }
        return new rvn();
    }
}
