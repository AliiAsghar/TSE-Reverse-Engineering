package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yrp implements yoz, ypf {
    public static final uuf a;
    public static final utz b;
    public static final utz c;
    public static final alhr d;
    private static final alvi g = alvi.m("com/google/android/apps/messaging/shared/util/spam/safeurl/SafeUrlSpamProtection");
    public final armf e;
    public final armf f;
    private final armf h;
    private final armf i;
    private final armf j;
    private final arpi k;

    static {
        ahtn ahtnVar = uuh.b;
        aozy createBuilder = aplf.a.createBuilder();
        createBuilder.bf(30);
        createBuilder.bf(30);
        createBuilder.bf(30);
        a = uuh.u(ahtnVar, "safe_url_recheck_delay_array_seconds", createBuilder.s(), new mdd(11));
        b = uuh.n(uuh.b, "enable_safe_url_on_click_prevent_redundant_check", true);
        c = uuh.n(uuh.b, "enable_safe_url_reclassify_after_verdict", false);
        d = uuh.w("safe_url_optimize_reclassification");
    }

    public yrp(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, arpi arpiVar) {
        armfVar.getClass();
        armfVar2.getClass();
        armfVar3.getClass();
        armfVar4.getClass();
        armfVar5.getClass();
        armfVar6.getClass();
        arpiVar.getClass();
        this.e = armfVar;
        this.f = armfVar2;
        this.h = armfVar3;
        this.i = armfVar4;
        this.j = armfVar5;
        this.k = arpiVar;
    }

    @Override // defpackage.yoz
    public final ypi a() {
        return ypi.g;
    }

    @Override // defpackage.yoz
    public final akrh b() {
        return aktp.e("SafeUrlSpamProtection.classify");
    }

    @Override // defpackage.yoz
    public final akrh c() {
        return aktp.e("SafeUrlSpamProtection.reclassify");
    }

    @Override // defpackage.yoz
    public final Object d(you youVar, arpe arpeVar) {
        return arro.q(this.k, new yqs(this, youVar, (arpe) null, 4), arpeVar);
    }

    @Override // defpackage.yoz
    public final Object e(you youVar, int i, arpe arpeVar) {
        return arro.q(this.k, new mdi(this, youVar, i, (arpe) null, 11), arpeVar);
    }

    @Override // defpackage.ypf
    public final akrh f() {
        return aktp.e("SafeUrlSpamProtection.classifyOnClickTrace");
    }

    @Override // defpackage.ypf
    public final Object g(you youVar, String str, arpe arpeVar) {
        if (str.length() > 0) {
            return arro.q(this.k, new wiu(this, youVar, str, (arpe) null, 13), arpeVar);
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ef A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object h(defpackage.you r8, java.util.List r9, defpackage.arpe r10) {
        /*
            Method dump skipped, instructions count: 325
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yrp.h(you, java.util.List, arpe):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0117 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0143 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object i(defpackage.you r18, java.util.List r19, defpackage.amzf r20, java.lang.Integer r21, defpackage.arpe r22) {
        /*
            Method dump skipped, instructions count: 368
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yrp.i(you, java.util.List, amzf, java.lang.Integer, arpe):java.lang.Object");
    }

    public final boolean j() {
        if (!((lrf) this.j.b()).c()) {
            ((alvg) g.d().h("com/google/android/apps/messaging/shared/util/spam/safeurl/SafeUrlSpamProtection", "allowedToCheckUrls", 274, "SafeUrlSpamProtection.kt")).q("Link preview disabled, skipping URL check");
            return false;
        }
        return true;
    }

    public final Object k(you youVar) {
        if (!j()) {
            return null;
        }
        String str = youVar.h;
        if (str != null && str.length() != 0) {
            List c2 = uzc.c(str);
            if (c2 != null && !c2.isEmpty()) {
                return c2;
            }
            ((alvg) g.d().h("com/google/android/apps/messaging/shared/util/spam/safeurl/SafeUrlSpamProtection", "getUrlsFromMessage", 290, "SafeUrlSpamProtection.kt")).q("No urls found, skipping bad urls check.");
            return null;
        }
        ((alvg) g.d().h("com/google/android/apps/messaging/shared/util/spam/safeurl/SafeUrlSpamProtection", "getUrlsFromMessage", 284, "SafeUrlSpamProtection.kt")).q("No text in the message, skipping URL check.");
        return null;
    }
}
