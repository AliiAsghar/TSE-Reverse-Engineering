package defpackage;

import java.util.Arrays;
import java.util.Map;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ror implements aglx {
    public static final ror a = new ror();
    private static final Map b = aqjn.m(new armo(c("token"), d("token")), new armo(c("address_type"), d("address_type")), new armo(c("phone_number"), d("phone_number")), new armo(c("display_name"), d("display_name")));

    private ror() {
    }

    private static final rok c(String str) {
        String str2;
        agmh[] q = vcp.q();
        for (int i = 0; i < 4; i++) {
            agmh agmhVar = q[i];
            String d = agmhVar.d();
            if (d != null) {
                str2 = arsd.I(d, '.', d);
            } else {
                str2 = null;
            }
            if (d.F(str2, str)) {
                agmhVar.getClass();
                return (rok) agmhVar;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    private static final qve d(String str) {
        String str2;
        agmh[] q = riw.q();
        for (int i = 0; i < 6; i++) {
            agmh agmhVar = q[i];
            String d = agmhVar.d();
            if (d != null) {
                str2 = arsd.I(d, '.', d);
            } else {
                str2 = null;
            }
            if (d.F(str2, str)) {
                agmhVar.getClass();
                return (qve) agmhVar;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @Override // defpackage.aglx
    public final void a() {
        rom romVar = new rom();
        romVar.e();
        romVar.a().V();
    }

    @Override // defpackage.aglx
    public final void b() {
        Integer valueOf;
        agof agofVar = new agof("my_identities_backup", "backup");
        agofVar.d = 5;
        Map map = b;
        rok[] rokVarArr = (rok[]) map.keySet().toArray(new rok[0]);
        agofVar.b((agmh[]) Arrays.copyOf(rokVarArr, rokVarArr.length));
        qvh b2 = qvk.b();
        b2.q();
        qve[] qveVarArr = (qve[]) map.values().toArray(new qve[0]);
        qve[] qveVarArr2 = (qve[]) Arrays.copyOf(qveVarArr, qveVarArr.length);
        valueOf = Integer.valueOf(a.bp().c());
        int intValue = valueOf.intValue();
        for (qve qveVar : qveVarArr2) {
            if (((Integer) qvk.b.getOrDefault(qveVar.toString(), -1)).intValue() > intValue) {
                agnc.t("columnReference.toString()", intValue);
            }
        }
        b2.m(qveVarArr2);
        agofVar.c = b2.b();
        agofVar.a().a();
    }
}
