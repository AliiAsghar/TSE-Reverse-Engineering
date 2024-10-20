package defpackage;

import java.util.Arrays;
import java.util.Map;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rna implements aglx {
    public static final rna a = new rna();
    public static final Map b = aqjn.m(new armo(c("_id"), d("_id")), new armo(c("message_id"), d("message_id")));

    private rna() {
    }

    private static final rmu c(String str) {
        String str2;
        agmh[] j = ush.j();
        for (int i = 0; i < 2; i++) {
            agmh agmhVar = j[i];
            String d = agmhVar.d();
            if (d != null) {
                str2 = arsd.I(d, '.', d);
            } else {
                str2 = null;
            }
            if (d.F(str2, str)) {
                agmhVar.getClass();
                return (rmu) agmhVar;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    private static final swy d(String str) {
        String str2;
        agmh[] d = tze.d();
        for (int i = 0; i < 2; i++) {
            agmh agmhVar = d[i];
            String d2 = agmhVar.d();
            if (d2 != null) {
                str2 = arsd.I(d2, '.', d2);
            } else {
                str2 = null;
            }
            if (d.F(str2, str)) {
                agmhVar.getClass();
                return (swy) agmhVar;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @Override // defpackage.aglx
    public final void a() {
        rmv rmvVar = new rmv();
        rmvVar.e();
        rmvVar.a().V();
    }

    @Override // defpackage.aglx
    public final void b() {
        agof agofVar = new agof("message_star_backup", "backup");
        agofVar.d = 5;
        Map map = b;
        rmu[] rmuVarArr = (rmu[]) map.keySet().toArray(new rmu[0]);
        agofVar.b((agmh[]) Arrays.copyOf(rmuVarArr, rmuVarArr.length));
        sxb sxbVar = new sxb(sxc.a);
        sxbVar.q();
        swy[] swyVarArr = (swy[]) map.values().toArray(new swy[0]);
        swy[] swyVarArr2 = (swy[]) Arrays.copyOf(swyVarArr, swyVarArr.length);
        int c = a.bp().c();
        Integer.valueOf(c).getClass();
        for (swy swyVar : swyVarArr2) {
            if (((Integer) sxc.b.getOrDefault(swyVar.toString(), -1)).intValue() > c) {
                agnc.t("columnReference.toString()", c);
            }
        }
        sxbVar.m(swyVarArr2);
        agofVar.c = sxbVar.b();
        agofVar.a().a();
    }
}
