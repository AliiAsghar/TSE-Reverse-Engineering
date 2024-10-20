package defpackage;

import java.util.Arrays;
import java.util.Map;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rmr implements aglx {
    public static final rmr a = new rmr();
    public static final Map b = aqjn.m(new armo(c("message_id"), d("message_id")), new armo(c("replied_to_message_id"), d("replied_to_message_id")), new armo(c("replied_to_message_id_null_reason"), d("replied_to_message_id_null_reason")), new armo(c("replied_to_rcs_message_id"), d("replied_to_rcs_message_id")));

    private rmr() {
    }

    private static final rmk c(String str) {
        String str2;
        agmh[] t = upb.t();
        for (int i = 0; i < 4; i++) {
            agmh agmhVar = t[i];
            String d = agmhVar.d();
            if (d != null) {
                str2 = arsd.I(d, '.', d);
            } else {
                str2 = null;
            }
            if (d.F(str2, str)) {
                agmhVar.getClass();
                return (rmk) agmhVar;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    private static final svs d(String str) {
        String str2;
        agmh[] f = twj.f();
        for (int i = 0; i < 4; i++) {
            agmh agmhVar = f[i];
            String d = agmhVar.d();
            if (d != null) {
                str2 = arsd.I(d, '.', d);
            } else {
                str2 = null;
            }
            if (d.F(str2, str)) {
                agmhVar.getClass();
                return (svs) agmhVar;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @Override // defpackage.aglx
    public final void a() {
        rmm rmmVar = new rmm();
        rmmVar.e();
        rmmVar.a().V();
    }

    @Override // defpackage.aglx
    public final void b() {
        agof agofVar = new agof("message_replies_backup", "backup");
        agofVar.d = 5;
        Map map = b;
        rmk[] rmkVarArr = (rmk[]) map.keySet().toArray(new rmk[0]);
        agofVar.b((agmh[]) Arrays.copyOf(rmkVarArr, rmkVarArr.length));
        svx svxVar = new svx(svz.a);
        svxVar.q();
        svs[] svsVarArr = (svs[]) map.values().toArray(new svs[0]);
        svs[] svsVarArr2 = (svs[]) Arrays.copyOf(svsVarArr, svsVarArr.length);
        int c = a.bp().c();
        Integer.valueOf(c).getClass();
        for (svs svsVar : svsVarArr2) {
            if (((Integer) svz.b.getOrDefault(svsVar.toString(), -1)).intValue() > c) {
                agnc.t("columnReference.toString()", c);
            }
        }
        svxVar.m(svsVarArr2);
        agofVar.c = svxVar.b();
        agofVar.a().a();
    }
}
