package defpackage;

import java.util.Arrays;
import java.util.Map;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rla implements aglx {
    public static final rla a = new rla();
    public static final Map b = aqjn.m(new armo(c("_id"), d("_id")), new armo(c("conversation_id"), d("conversation_id")), new armo(c("pin_status"), d("pin_status")));

    private rla() {
    }

    private static final rku c(String str) {
        String str2;
        agmh[] z = vom.z();
        for (int i = 0; i < 3; i++) {
            agmh agmhVar = z[i];
            String d = agmhVar.d();
            if (d != null) {
                str2 = arsd.I(d, '.', d);
            } else {
                str2 = null;
            }
            if (d.F(str2, str)) {
                agmhVar.getClass();
                return (rku) agmhVar;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    private static final slg d(String str) {
        String str2;
        agmh[] K = wch.K();
        for (int i = 0; i < 3; i++) {
            agmh agmhVar = K[i];
            String d = agmhVar.d();
            if (d != null) {
                str2 = arsd.I(d, '.', d);
            } else {
                str2 = null;
            }
            if (d.F(str2, str)) {
                agmhVar.getClass();
                return (slg) agmhVar;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @Override // defpackage.aglx
    public final void a() {
        rkv rkvVar = new rkv();
        rkvVar.e();
        rkvVar.a().V();
    }

    @Override // defpackage.aglx
    public final void b() {
        agof agofVar = new agof("conversation_pins_backup", "backup");
        agofVar.d = 5;
        Map map = b;
        rku[] rkuVarArr = (rku[]) map.keySet().toArray(new rku[0]);
        agofVar.b((agmh[]) Arrays.copyOf(rkuVarArr, rkuVarArr.length));
        slk slkVar = new slk(slm.a);
        slkVar.q();
        slg[] slgVarArr = (slg[]) map.values().toArray(new slg[0]);
        slg[] slgVarArr2 = (slg[]) Arrays.copyOf(slgVarArr, slgVarArr.length);
        int c = a.bp().c();
        Integer.valueOf(c).getClass();
        for (slg slgVar : slgVarArr2) {
            if (((Integer) slm.b.getOrDefault(slgVar.toString(), -1)).intValue() > c) {
                agnc.t("columnReference.toString()", c);
            }
        }
        slkVar.m(slgVarArr2);
        agofVar.c = slkVar.b();
        agofVar.a().a();
    }
}
