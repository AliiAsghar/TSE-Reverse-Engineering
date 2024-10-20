package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahsl {
    private static final anna d = anna.e('/').d();
    public static final ahsk a = new ahsj(1);
    public static final ahsk b = new ahsj(0);
    public static final ahsk c = new ahsj(2);

    public static List a(String str) {
        return alzz.as(d.c(str), new ahnx(6));
    }

    public static void b(ahsk ahskVar, apbs apbsVar) {
        String a2 = ahskVar.a(apbsVar);
        String b2 = ahskVar.b(apbsVar);
        if (a2.isEmpty() && !b2.isEmpty()) {
            ahskVar.c(apbsVar, aocq.a(b2));
        } else {
            ahskVar.c(apbsVar, null);
        }
        ahskVar.d(apbsVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0158, code lost:
    
        if (r1 == false) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00da, code lost:
    
        if (r0.equals("Attempt to do a synchronize operation on a null object") == false) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0102, code lost:
    
        if (java.util.regex.Pattern.matches("Conflicting default method implementations .+", r0) == false) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0134, code lost:
    
        if (java.util.regex.Pattern.matches("Method '.+' implementing interface method '.+' is not public", r0) == false) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01d2, code lost:
    
        if (java.util.regex.Pattern.matches(".*unmatched serializable field(s) declared", r0) == false) goto L124;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:9:0x0097. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final defpackage.anax c(defpackage.anax r6) {
        /*
            Method dump skipped, instructions count: 614
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahsl.c(anax):anax");
    }
}
