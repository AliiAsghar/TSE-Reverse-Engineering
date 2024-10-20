package defpackage;

import android.content.Context;
import android.provider.Telephony;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jlj {
    private static final alvi d = alvi.m("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/attachment/AttachmentSecurityFilter");
    private static final String e;
    private static final utz f;
    public final Context a;
    public final arpi b;
    public final ydh c;
    private final arpi g;
    private final Set h;
    private final znp i;

    static {
        String authority = Telephony.Mms.CONTENT_URI.getAuthority();
        authority.getClass();
        e = authority;
        f = uuh.i(uuh.b, "allow_forwarding_and_sharing_authority_kill_switch", false);
    }

    public jlj(Context context, arpi arpiVar, arpi arpiVar2, ydh ydhVar, znp znpVar) {
        context.getClass();
        arpiVar.getClass();
        arpiVar2.getClass();
        ydhVar.getClass();
        this.a = context;
        this.g = arpiVar;
        this.b = arpiVar2;
        this.c = ydhVar;
        this.i = znpVar;
        aroy aroyVar = new aroy();
        aroyVar.add(e);
        aroyVar.add(uho.b(context));
        aroyVar.add(uho.a(context));
        aroyVar.add(lga.aD(context));
        if (!((Boolean) f.e()).booleanValue()) {
            aroyVar.add(znpVar.b);
        }
        this.h = aqjn.d(aroyVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x00bd, code lost:
    
        if (((java.lang.Boolean) r7).booleanValue() != false) goto L31;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x00b4 -> B:10:0x00b7). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.afcq r6, defpackage.arpe r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.jlg
            if (r0 == 0) goto L13
            r0 = r7
            jlg r0 = (defpackage.jlg) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            jlg r0 = new jlg
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.b
            arpl r1 = defpackage.arpl.a
            int r2 = r0.d
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L35
            if (r2 != r4) goto L2d
            java.lang.Object r6 = r0.a
            jlj r2 = r0.e
            defpackage.aqil.P(r7)
            goto Lb7
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            defpackage.aqil.P(r7)
            boolean r7 = r6 instanceof defpackage.afcv
            if (r7 == 0) goto L49
            java.lang.String r6 = r6.i()
            android.net.Uri r6 = android.net.Uri.parse(r6)
            java.util.List r6 = defpackage.aqjn.y(r6)
            goto L8e
        L49:
            boolean r7 = r6 instanceof defpackage.afsm
            if (r7 == 0) goto L5c
            afsm r6 = (defpackage.afsm) r6
            java.lang.String r6 = r6.i()
            android.net.Uri r6 = android.net.Uri.parse(r6)
            java.util.List r6 = defpackage.aqjn.y(r6)
            goto L8e
        L5c:
            boolean r7 = r6 instanceof defpackage.afsn
            if (r7 == 0) goto Lc4
            afsn r6 = (defpackage.afsn) r6
            java.lang.Iterable r6 = r6.f()
            java.util.ArrayList r7 = new java.util.ArrayList
            r2 = 10
            int r2 = defpackage.aqjn.J(r6, r2)
            r7.<init>(r2)
            java.util.Iterator r6 = r6.iterator()
        L75:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L8d
            java.lang.Object r2 = r6.next()
            afsm r2 = (defpackage.afsm) r2
            java.lang.String r2 = r2.i()
            android.net.Uri r2 = android.net.Uri.parse(r2)
            r7.add(r2)
            goto L75
        L8d:
            r6 = r7
        L8e:
            boolean r7 = r6.isEmpty()
            if (r7 == 0) goto L96
        L94:
            r3 = r4
            goto Lbf
        L96:
            java.util.Iterator r6 = r6.iterator()
            r2 = r5
        L9b:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L94
            java.lang.Object r7 = r6.next()
            android.net.Uri r7 = (android.net.Uri) r7
            r7.getClass()
            r0.e = r2
            r0.a = r6
            r0.d = r4
            java.lang.Object r7 = r2.b(r7, r0)
            if (r7 != r1) goto Lb7
            return r1
        Lb7:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 != 0) goto L9b
        Lbf:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r3)
            return r6
        Lc4:
            alvi r7 = defpackage.jlj.d
            alvw r7 = r7.h()
            alvz r0 = defpackage.alwp.a
            java.lang.String r1 = "BugleComposeRow2"
            r7.X(r0, r1)
            java.lang.String r0 = "isAllowed"
            r1 = 91
            java.lang.String r2 = "com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/attachment/AttachmentSecurityFilter"
            java.lang.String r4 = "AttachmentSecurityFilter.kt"
            alvw r7 = r7.h(r2, r0, r1, r4)
            alvg r7 = (defpackage.alvg) r7
            java.lang.String r0 = "AttachmentSecurityFilter unable to inspect URI for %s"
            r7.t(r0, r6)
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r3)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jlj.a(afcq, arpe):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(android.net.Uri r9, defpackage.arpe r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof defpackage.jlh
            if (r0 == 0) goto L13
            r0 = r10
            jlh r0 = (defpackage.jlh) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            jlh r0 = new jlh
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L34
            if (r2 != r4) goto L2c
            akrh r9 = r0.d
            defpackage.aqil.P(r10)     // Catch: java.lang.Throwable -> L2a
            goto L72
        L2a:
            r10 = move-exception
            goto L86
        L2c:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L34:
            defpackage.aqil.P(r10)
            java.lang.String r10 = "AttachmentSecurityFilter#isAllowedUri"
            akrh r10 = defpackage.aktp.e(r10)
            java.lang.String r2 = r9.getScheme()     // Catch: java.lang.Throwable -> L82
            java.lang.String r5 = "content"
            boolean r2 = defpackage.d.F(r2, r5)     // Catch: java.lang.Throwable -> L82
            if (r2 == 0) goto L5d
            java.util.Set r2 = r8.h     // Catch: java.lang.Throwable -> L82
            java.lang.String r5 = r9.getAuthority()     // Catch: java.lang.Throwable -> L82
            boolean r2 = defpackage.aqjn.aH(r2, r5)     // Catch: java.lang.Throwable -> L82
            if (r2 == 0) goto L5d
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r4)     // Catch: java.lang.Throwable -> L82
            defpackage.armd.i(r10, r3)
            return r9
        L5d:
            arpi r2 = r8.g     // Catch: java.lang.Throwable -> L82
            jli r5 = new jli     // Catch: java.lang.Throwable -> L82
            r6 = 0
            r5.<init>(r8, r9, r3, r6)     // Catch: java.lang.Throwable -> L82
            r0.d = r10     // Catch: java.lang.Throwable -> L82
            r0.c = r4     // Catch: java.lang.Throwable -> L82
            java.lang.Object r9 = defpackage.arro.q(r2, r5, r0)     // Catch: java.lang.Throwable -> L82
            if (r9 == r1) goto L81
            r7 = r10
            r10 = r9
            r9 = r7
        L72:
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> L2a
            boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> L2a
            r10 = r10 ^ r4
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)     // Catch: java.lang.Throwable -> L2a
            defpackage.armd.i(r9, r3)
            return r10
        L81:
            return r1
        L82:
            r9 = move-exception
            r7 = r10
            r10 = r9
            r9 = r7
        L86:
            throw r10     // Catch: java.lang.Throwable -> L87
        L87:
            r0 = move-exception
            defpackage.armd.i(r9, r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jlj.b(android.net.Uri, arpe):java.lang.Object");
    }
}
