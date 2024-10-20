package defpackage;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import com.google.android.apps.messaging.R;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jva implements juv {
    public static final alvi b = alvi.m("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/inputs/shortcuts/contacts/ContactsShortcutHandler");
    public final arwe c;
    public final afku d;
    public final yce e;
    public final arpi f;
    public final Context g;
    public final eog h;
    public final lkd i;
    public final aajt j;
    public final zkm k;
    public final jxv l;
    private final aflb m;
    private final arpi n;
    private final int o;
    private final afxb p;
    private final lre q;

    public jva(arwe arweVar, lkd lkdVar, aflb aflbVar, afku afkuVar, zkm zkmVar, aajt aajtVar, yce yceVar, arpi arpiVar, arpi arpiVar2, Context context, lre lreVar, jxv jxvVar, Map map, eog eogVar) {
        arweVar.getClass();
        lkdVar.getClass();
        aflbVar.getClass();
        afkuVar.getClass();
        zkmVar.getClass();
        aajtVar.getClass();
        yceVar.getClass();
        arpiVar.getClass();
        arpiVar2.getClass();
        context.getClass();
        lreVar.getClass();
        jxvVar.getClass();
        eogVar.getClass();
        this.c = arweVar;
        this.i = lkdVar;
        this.m = aflbVar;
        this.d = afkuVar;
        this.k = zkmVar;
        this.j = aajtVar;
        this.e = yceVar;
        this.f = arpiVar;
        this.n = arpiVar2;
        this.g = context;
        this.q = lreVar;
        this.l = jxvVar;
        this.h = eogVar;
        qjh.l(arweVar, null, new jpc(this, (arpe) null, 13), 3);
        this.o = R.string.contacts_shortcut_title;
        this.p = new afxb(R.drawable.quantum_gm_ic_person_vd_theme_24, new afxa(hwr.ac(R.color.contacts_shortcut_background, map), new agei(R.color.contacts_shortcut_icon_tint)));
    }

    @Override // defpackage.juv
    public final int a() {
        return this.o;
    }

    @Override // defpackage.juv
    public final afxb b() {
        return this.p;
    }

    @Override // defpackage.juv
    public final /* synthetic */ List c() {
        return arnv.a;
    }

    @Override // defpackage.juv
    public final void d(View view) {
        qjh.l(this.c, null, new jec(this, new lla("Contacts", new sj(), null, hwr.an(view)), (arpe) null, 16), 3);
    }

    @Override // defpackage.juv
    public final boolean e() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(defpackage.arpe r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof defpackage.jux
            if (r0 == 0) goto L13
            r0 = r9
            jux r0 = (defpackage.jux) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            jux r0 = new jux
            r0.<init>(r8, r9)
        L18:
            r7 = r0
            java.lang.Object r9 = r7.a
            arpl r0 = defpackage.arpl.a
            int r1 = r7.c
            r2 = 1
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2a
            jva r0 = r7.d
            defpackage.aqil.P(r9)
            goto L4d
        L2a:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L32:
            defpackage.aqil.P(r9)
            eog r9 = r8.h
            lkd r4 = r8.i
            juu r1 = defpackage.juv.a
            jlc r6 = defpackage.jlc.n
            r7.d = r8
            r7.c = r2
            java.lang.String r5 = "Contacts"
            java.lang.String r3 = "contact_shortcut_saved_state_pending_result"
            r2 = r9
            java.lang.Object r9 = r1.a(r2, r3, r4, r5, r6, r7)
            if (r9 == r0) goto L92
            r0 = r8
        L4d:
            android.net.Uri r9 = (android.net.Uri) r9
            java.lang.String r1 = "checkForAndHandlePendingResult"
            java.lang.String r2 = "com/google/android/apps/messaging/conversation2/bottomcontent/composerow/inputs/shortcuts/contacts/ContactsShortcutHandler"
            java.lang.String r3 = "ContactsShortcutHandler.kt"
            java.lang.String r4 = "BugleComposeRow2"
            if (r9 != 0) goto L74
            alvi r9 = defpackage.jva.b
            alvw r9 = r9.i()
            alvz r0 = defpackage.alwp.a
            r9.X(r0, r4)
            r0 = 157(0x9d, float:2.2E-43)
            alvw r9 = r9.h(r2, r1, r0, r3)
            alvg r9 = (defpackage.alvg) r9
            java.lang.String r0 = "Skipping contact picker activity result because of null uri"
            r9.q(r0)
            arnb r9 = defpackage.arnb.a
            return r9
        L74:
            alvi r5 = defpackage.jva.b
            alvw r5 = r5.d()
            alvz r6 = defpackage.alwp.a
            r5.X(r6, r4)
            r4 = 160(0xa0, float:2.24E-43)
            alvw r1 = r5.h(r2, r1, r4, r3)
            alvg r1 = (defpackage.alvg) r1
            java.lang.String r2 = "Showing dialog on whether to send contact as file or text."
            r1.q(r2)
            r0.h(r9)
            arnb r9 = defpackage.arnb.a
            return r9
        L92:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jva.f(arpe):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0085, code lost:
    
        if (r13 != r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(android.net.Uri r12, defpackage.arpe r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof defpackage.juz
            if (r0 == 0) goto L13
            r0 = r13
            juz r0 = (defpackage.juz) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            juz r0 = new juz
            r0.<init>(r11, r13)
        L18:
            java.lang.Object r13 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            r3 = 0
            java.lang.String r4 = "sendContactAsText"
            java.lang.String r5 = "com/google/android/apps/messaging/conversation2/bottomcontent/composerow/inputs/shortcuts/contacts/ContactsShortcutHandler"
            java.lang.String r6 = "ContactsShortcutHandler.kt"
            java.lang.String r7 = "BugleComposeRow2"
            r8 = 2
            r9 = 1
            if (r2 == 0) goto L43
            if (r2 == r9) goto L3d
            if (r2 != r8) goto L35
            jva r12 = r0.d
            defpackage.aqil.P(r13)
            goto L88
        L35:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L3d:
            jva r12 = r0.d
            defpackage.aqil.P(r13)
            goto L72
        L43:
            defpackage.aqil.P(r13)
            alvi r13 = defpackage.jva.b
            alvw r13 = r13.d()
            alvz r2 = defpackage.alwp.a
            r13.X(r2, r7)
            r2 = 190(0xbe, float:2.66E-43)
            alvw r13 = r13.h(r5, r4, r2, r6)
            alvg r13 = (defpackage.alvg) r13
            java.lang.String r2 = "Converting contact to text. contactUri %s"
            r13.t(r2, r12)
            arpi r13 = r11.f
            jec r2 = new jec
            r10 = 17
            r2.<init>(r11, r12, r3, r10)
            r0.d = r11
            r0.c = r9
            java.lang.Object r13 = defpackage.arro.q(r13, r2, r0)
            if (r13 == r1) goto Lad
            r12 = r11
        L72:
            aapn r13 = (defpackage.aapn) r13
            arpi r2 = r12.n
            jli r9 = new jli
            r10 = 10
            r9.<init>(r12, r13, r3, r10)
            r0.d = r12
            r0.c = r8
            java.lang.Object r13 = defpackage.arro.q(r2, r9, r0)
            if (r13 != r1) goto L88
            goto Lad
        L88:
            java.lang.String r13 = (java.lang.String) r13
            alvi r0 = defpackage.jva.b
            alvw r0 = r0.d()
            alvz r1 = defpackage.alwp.a
            r0.X(r1, r7)
            r1 = 193(0xc1, float:2.7E-43)
            alvw r0 = r0.h(r5, r4, r1, r6)
            alvg r0 = (defpackage.alvg) r0
            java.lang.String r1 = "Appending selected contact in draft text."
            r0.q(r1)
            aflb r12 = r12.m
            r13.getClass()
            r12.b(r13)
            arnb r12 = defpackage.arnb.a
            return r12
        Lad:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jva.g(android.net.Uri, arpe):java.lang.Object");
    }

    public final void h(Uri uri) {
        this.q.e(true, new jpi(this, uri, 6));
    }
}
