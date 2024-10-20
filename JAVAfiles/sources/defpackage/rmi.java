package defpackage;

import java.util.Arrays;
import java.util.Map;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rmi implements aglx {
    public static final rmi a = new rmi();
    public static final Map b = aqjn.m(new armo(c("_id"), d("_id")), new armo(c("message_id"), d("message_id")), new armo(c("reactions_data"), d("reactions_data")), new armo(c("reacted_message_id"), d("reacted_message_id")), new armo(c("reaction"), d("reaction")), new armo(c("applied_reaction"), d("applied_reaction")));

    private rmi() {
    }

    private static final rlz c(String str) {
        String str2;
        agmh[] l = umx.l();
        for (int i = 0; i < 6; i++) {
            agmh agmhVar = l[i];
            String d = agmhVar.d();
            if (d != null) {
                str2 = arsd.I(d, '.', d);
            } else {
                str2 = null;
            }
            if (d.F(str2, str)) {
                agmhVar.getClass();
                return (rlz) agmhVar;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    private static final svk d(String str) {
        String str2;
        agmh[] d = twd.d();
        for (int i = 0; i < 7; i++) {
            agmh agmhVar = d[i];
            String d2 = agmhVar.d();
            if (d2 != null) {
                str2 = arsd.I(d2, '.', d2);
            } else {
                str2 = null;
            }
            if (d.F(str2, str)) {
                agmhVar.getClass();
                return (svk) agmhVar;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @Override // defpackage.aglx
    public final void a() {
        rmc rmcVar = new rmc();
        rmcVar.e();
        rmcVar.a().V();
    }

    @Override // defpackage.aglx
    public final void b() {
        agof agofVar = new agof("message_reactions_backup", "backup");
        agofVar.d = 5;
        Map map = b;
        rlz[] rlzVarArr = (rlz[]) map.keySet().toArray(new rlz[0]);
        agofVar.b((agmh[]) Arrays.copyOf(rlzVarArr, rlzVarArr.length));
        svo a2 = svq.a();
        a2.q();
        svk[] svkVarArr = (svk[]) map.values().toArray(new svk[0]);
        a2.c((svk[]) Arrays.copyOf(svkVarArr, svkVarArr.length));
        agofVar.c = a2.b();
        agofVar.a().a();
    }
}
