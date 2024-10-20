package defpackage;

import j$.util.Collection;
import java.util.Locale;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ulc {
    public static final Supplier a;
    private static final String b;
    private static final String c;
    private static final String d;
    private static final String e;
    private final qif f;
    private final nxt g;

    static {
        alhr w = uuh.w("cms_create_trigger_check_for_cms_id");
        w.getClass();
        a = new uea(w, 5);
        int i = 19;
        b = String.format(Locale.US, "%s IN (%s)", "NEW.cms_life_cycle", algs.c(',').e((Integer[]) Collection.EL.stream(xxw.w).map(new xos(i)).sorted().toArray(new mlo(18))));
        c = String.format(Locale.US, "%s NOT IN (%s)", "NEW.cms_life_cycle", algs.c(',').e((Integer[]) Collection.EL.stream(xxw.z).map(new xos(i)).sorted().toArray(new mlo(19))));
        d = String.format(Locale.US, "%s NOT IN (%s)", "OLD.cms_life_cycle", algs.c(',').e((Integer[]) Collection.EL.stream(xxw.y).map(new xos(i)).sorted().toArray(new mlo(16))));
        e = String.format(Locale.US, "%s NOT IN (%d, %d) OR %s NOT IN (%d, %d, %d)", "OLD.cms_life_cycle", Integer.valueOf(xxw.UNKNOWN.ordinal()), Integer.valueOf(xxw.RESTORED_FROM_TELEPHONY.ordinal()), "NEW.cms_life_cycle", Integer.valueOf(xxw.MERGED_FROM_CMS.ordinal()), Integer.valueOf(xxw.CMS_RESTORE_FAILED.ordinal()), Integer.valueOf(xxw.EXCLUDED.ordinal()));
        String.format(Locale.US, "%s IN (%s)", "OLD.cms_life_cycle", algs.c(',').e((Integer[]) Collection.EL.stream(xxw.A).map(new xos(i)).sorted().toArray(new mlo(15))));
    }

    public ulc(qif qifVar, nxt nxtVar) {
        this.f = qifVar;
        this.g = nxtVar;
    }

    public final rzy a(int i, int i2, int i3) {
        return c(i, i2, i3, false);
    }

    public final ulb b(int i, int i2) {
        return new ulb(i, i2, this.g.a());
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0054, code lost:
    
        if (((java.lang.Boolean) ((defpackage.utz) r3).e()).booleanValue() != false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.rzy c(int r3, int r4, int r5, boolean r6) {
        /*
            r2 = this;
            rzy r0 = new rzy
            r0.<init>()
            r0.i = r4
            r1 = 32
            r0.d = r1
            r0.b = r3
            r0.c()
            nxt r3 = r2.g
            boolean r3 = r3.a()
            r0.g = r3
            r0.f = r5
            qif r3 = r2.f
            boolean r3 = r3.h()
            if (r3 == 0) goto L40
            int r4 = r4 + (-1)
            if (r4 == 0) goto L3a
            r3 = 1
            if (r4 == r3) goto L2f
            java.lang.String r3 = defpackage.ulc.d
            r0.b(r3)
            goto L69
        L2f:
            java.lang.String r3 = defpackage.ulc.c
            r0.b(r3)
            java.lang.String r3 = defpackage.ulc.e
            r0.b(r3)
            goto L69
        L3a:
            java.lang.String r3 = defpackage.ulc.b
            r0.b(r3)
            goto L69
        L40:
            if (r6 != 0) goto L56
            java.util.function.Supplier r3 = defpackage.ulc.a
            java.lang.Object r3 = defpackage.d$$ExternalSyntheticApiModelOutline0.m324m(r3)
            utz r3 = (defpackage.utz) r3
            java.lang.Object r3 = r3.e()
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L69
        L56:
            int r4 = r4 + (-1)
            if (r4 == 0) goto L64
            r3 = 2
            if (r4 == r3) goto L5e
            goto L69
        L5e:
            java.lang.String r3 = "OLD.cms_id IS NOT NULL"
            r0.b(r3)
            goto L69
        L64:
            java.lang.String r3 = "NEW.cms_id IS NULL"
            r0.b(r3)
        L69:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ulc.c(int, int, int, boolean):rzy");
    }
}
