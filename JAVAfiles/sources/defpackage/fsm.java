package defpackage;

import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fsm {
    public static fst a(fst fstVar, String[] strArr, Map map) {
        int length;
        int i = 0;
        if (fstVar == null) {
            if (strArr == null) {
                return null;
            }
            int length2 = strArr.length;
            if (length2 == 1) {
                return (fst) map.get(strArr[0]);
            }
            if (length2 > 1) {
                fst fstVar2 = new fst();
                while (i < length2) {
                    fstVar2.d((fst) map.get(strArr[i]));
                    i++;
                }
                return fstVar2;
            }
        } else {
            if (strArr != null && strArr.length == 1) {
                fstVar.d((fst) map.get(strArr[0]));
                return fstVar;
            }
            if (strArr != null && (length = strArr.length) > 1) {
                while (i < length) {
                    fstVar.d((fst) map.get(strArr[i]));
                    i++;
                }
            }
        }
        return fstVar;
    }

    public static frc b(frl frlVar, byte[] bArr, int i) {
        alob alobVar = new alob();
        frlVar.b(bArr, 0, i, frk.a, new frh(alobVar, 0));
        return new fqz(alobVar.g());
    }

    public static void c(frc frcVar, frk frkVar, etm etmVar) {
        for (int i = 0; i < frcVar.a(); i++) {
            d(frcVar, i, etmVar);
        }
    }

    private static void d(frc frcVar, int i, etm etmVar) {
        long c = frcVar.c(i);
        List e = frcVar.e(c);
        if (!e.isEmpty()) {
            if (i != frcVar.a() - 1) {
                long c2 = frcVar.c(i + 1) - frcVar.c(i);
                if (c2 > 0) {
                    etmVar.a(new xab(e, c, c2));
                    return;
                }
                return;
            }
            throw new IllegalStateException();
        }
    }
}
