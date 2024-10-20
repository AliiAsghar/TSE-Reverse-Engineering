package defpackage;

import android.app.Activity;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lml implements lju {
    private final Activity a;
    private final armf b;
    private final Optional c;
    private final ofz d;
    private final abbj e;

    public lml(Activity activity, armf armfVar, Optional optional, abbj abbjVar, ofz ofzVar) {
        armfVar.getClass();
        this.a = activity;
        this.b = armfVar;
        this.c = optional;
        this.e = abbjVar;
        this.d = ofzVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x007f, code lost:
    
        if (r9.resolveActivity(r7.a.getPackageManager()) != null) goto L23;
     */
    @Override // defpackage.lju
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* bridge */ /* synthetic */ java.lang.Object a(defpackage.lkf r8, defpackage.arpe r9) {
        /*
            r7 = this;
            lmk r8 = (defpackage.lmk) r8
            j$.util.Optional r9 = r7.c
            boolean r9 = r9.isPresent()
            if (r9 == 0) goto L47
            java.lang.String r9 = r8.b
            boolean r9 = defpackage.gh.f(r9)
            if (r9 == 0) goto L47
            android.app.Activity r0 = r7.a
            android.net.Uri r1 = r8.a
            java.lang.String r2 = r8.c
            java.lang.String r3 = r8.b
            long r4 = r8.d
            android.net.Uri r9 = defpackage.uhn.a(r0, r1, r2, r3, r4)
            java.lang.String r0 = r8.b
            boolean r0 = defpackage.gh.l(r0)
            if (r0 == 0) goto L38
            armf r0 = r7.b
            java.lang.Object r0 = r0.b()
            lzv r0 = (defpackage.lzv) r0
            android.app.Activity r1 = r7.a
            java.lang.String r8 = r8.b
            r0.B(r1, r9, r8)
            goto L43
        L38:
            j$.util.Optional r8 = r7.c
            java.lang.Object r8 = r8.get()
            ihi r8 = (defpackage.ihi) r8
            r8.b()
        L43:
            arnb r8 = defpackage.arnb.a
            goto Lc1
        L47:
            java.lang.String r9 = r8.b
            boolean r9 = defpackage.gh.u(r9)
            if (r9 != 0) goto L9e
            ofz r9 = r7.d
            nnu r9 = (defpackage.nnu) r9
            armf r9 = r9.a
            java.lang.Object r9 = r9.b()
            ansy r9 = (defpackage.ansy) r9
            java.lang.String r0 = "bugle.support_viewing_arbitrary_file_bubbles"
            boolean r9 = r9.e(r0)
            if (r9 != 0) goto L64
            goto L82
        L64:
            android.content.Intent r9 = new android.content.Intent
            r9.<init>()
            java.lang.String r0 = "android.intent.action.VIEW"
            r9.setAction(r0)
            android.net.Uri r0 = r8.a
            java.lang.String r1 = r8.b
            r9.setDataAndType(r0, r1)
            android.app.Activity r0 = r7.a
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            android.content.ComponentName r9 = r9.resolveActivity(r0)
            if (r9 == 0) goto L82
            goto L9e
        L82:
            boolean r9 = r8.e
            if (r9 == 0) goto L9b
            abbj r1 = r7.e
            android.app.Activity r9 = r7.a
            android.net.Uri r4 = r8.a
            java.lang.String r3 = r8.b
            java.lang.String r5 = r8.c
            aakt r8 = new aakt
            r6 = 2
            r0 = r8
            r2 = r4
            r0.<init>(r1, r2, r3, r4, r5, r6)
            defpackage.abbj.b(r9, r8)
        L9b:
            arnb r8 = defpackage.arnb.a
            goto Lc1
        L9e:
            java.lang.String r9 = r8.b
            java.lang.String r9 = defpackage.gh.a(r9)
            android.app.Activity r0 = r7.a
            android.net.Uri r1 = r8.a
            java.lang.String r2 = r8.c
            java.lang.String r3 = r8.b
            long r4 = r8.d
            android.net.Uri r8 = defpackage.uhn.a(r0, r1, r2, r3, r4)
            armf r0 = r7.b
            java.lang.Object r0 = r0.b()
            lzv r0 = (defpackage.lzv) r0
            android.app.Activity r1 = r7.a
            r0.B(r1, r8, r9)
            arnb r8 = defpackage.arnb.a
        Lc1:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lml.a(lkf, arpe):java.lang.Object");
    }
}
