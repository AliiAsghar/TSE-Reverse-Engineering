package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afrt {
    static final /* synthetic */ afrt a = new afrt();
    private static final alvi b = alvi.m("com/google/android/libraries/compose/media/Format$MediaFormat");

    private afrt() {
    }

    public static final afru a(afsx afsxVar, boolean z) {
        String str;
        List B;
        try {
            afsw afswVar = afsxVar.b;
            boolean F = d.F(afswVar, afss.a);
            String str2 = afsxVar.c;
            if (true != z) {
                str = str2;
            } else {
                str = null;
            }
            if (str == null) {
                str = "*";
            }
            if (F) {
                int i = afrs.b;
                if (z) {
                    B = aqjn.B(afrk.a, afrl.a);
                } else {
                    B = aqjn.B(afrr.a, afrj.a, afrk.a, afrl.a, afrm.a, afrn.a, afro.a, afrp.a);
                }
                return e(str2, B, new afrq(str));
            }
            if (d.F(afswVar, afsu.a)) {
                String str3 = afsxVar.c;
                afsf afsfVar = afsk.b;
                return e(str3, afwv.K(), new afsf(str));
            }
            if (d.F(afswVar, afsv.a)) {
                String str4 = afsxVar.c;
                arml armlVar = aftm.b;
                return e(str4, afwv.G(), new afth(str));
            }
            throw new IllegalArgumentException(afsxVar.b.b() + " doesn't have any registered format");
        } catch (IllegalArgumentException e) {
            ((alvg) ((alvg) b.i()).g(e).h("com/google/android/libraries/compose/media/Format$MediaFormat", "fromMediaType", 60, "Format.kt")).t("No media type matches %s", afsxVar);
            return null;
        }
    }

    public static final afru b(String str) {
        afsx H = afwv.H(str);
        if (H != null) {
            return a(H, false);
        }
        return null;
    }

    public static final afru c(afsx afsxVar) {
        afru a2 = a(afsxVar, false);
        if (a2 != null) {
            return a2;
        }
        throw new IllegalArgumentException(a.cc(afsxVar, "Cannot get Format for ", "."));
    }

    public static final afru d(String str) {
        afsx H = afwv.H(str);
        if (H != null) {
            return c(H);
        }
        throw new IllegalArgumentException("Cannot infer Media Type from ".concat(str));
    }

    private static final afru e(String str, Iterable iterable, afru afruVar) {
        Object obj;
        Iterator it = iterable.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (d.F(((afru) obj).a(), str)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        afru afruVar2 = (afru) obj;
        if (afruVar2 == null) {
            return afruVar;
        }
        return afruVar2;
    }
}
