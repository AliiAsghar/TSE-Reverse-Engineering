package defpackage;

import android.content.Context;
import android.view.View;
import com.google.android.apps.messaging.R;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jvd implements juv {
    public static final alvi b = alvi.m("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/inputs/shortcuts/files/FilesShortcutHandler");
    public final Context c;
    public final ydh d;
    public final eog e;
    public final lkd f;
    public final jxv g;
    private final arwe h;
    private final arpi i;
    private final arpi j;
    private final int k;
    private final afxb l;
    private final qdq m;

    public jvd(arwe arweVar, arpi arpiVar, arpi arpiVar2, lkd lkdVar, qdq qdqVar, Context context, jxv jxvVar, ydh ydhVar, eog eogVar, Map map) {
        arweVar.getClass();
        arpiVar.getClass();
        arpiVar2.getClass();
        lkdVar.getClass();
        context.getClass();
        jxvVar.getClass();
        ydhVar.getClass();
        eogVar.getClass();
        this.h = arweVar;
        this.i = arpiVar;
        this.j = arpiVar2;
        this.f = lkdVar;
        this.m = qdqVar;
        this.c = context;
        this.g = jxvVar;
        this.d = ydhVar;
        this.e = eogVar;
        qjh.l(arweVar, null, new jpc(this, (arpe) null, 14), 3);
        this.k = R.string.files_shortcut_title;
        this.l = new afxb(R.drawable.quantum_gm_ic_attach_file_vd_theme_24, new afxa(hwr.ac(R.color.files_shortcut_background, map), new agei(R.color.files_shortcut_icon_tint)));
    }

    @Override // defpackage.juv
    public final int a() {
        return this.k;
    }

    @Override // defpackage.juv
    public final afxb b() {
        return this.l;
    }

    @Override // defpackage.juv
    public final /* synthetic */ List c() {
        return arnv.a;
    }

    @Override // defpackage.juv
    public final void d(View view) {
        qjh.l(this.h, null, new jec(this, new lla("FilePicker", new sh(), "*/*", hwr.an(view)), (arpe) null, 20), 3);
    }

    @Override // defpackage.juv
    public final boolean e() {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0084, code lost:
    
        if (r1.g(r11, r0) == r8) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(defpackage.arpe r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof defpackage.jvb
            if (r0 == 0) goto L13
            r0 = r11
            jvb r0 = (defpackage.jvb) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            jvb r0 = new jvb
            r0.<init>(r10, r11)
        L18:
            java.lang.Object r11 = r0.a
            arpl r8 = defpackage.arpl.a
            int r1 = r0.c
            r9 = 2
            r2 = 1
            if (r1 == 0) goto L38
            if (r1 == r2) goto L32
            if (r1 != r9) goto L2a
            defpackage.aqil.P(r11)
            goto L87
        L2a:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L32:
            jvd r1 = r0.d
            defpackage.aqil.P(r11)
            goto L54
        L38:
            defpackage.aqil.P(r11)
            eog r11 = r10.e
            lkd r4 = r10.f
            juu r1 = defpackage.juv.a
            jlc r6 = defpackage.jlc.o
            r0.d = r10
            r0.c = r2
            java.lang.String r5 = "FilePicker"
            java.lang.String r3 = "files_shortcut_saved_state_pending_result"
            r2 = r11
            r7 = r0
            java.lang.Object r11 = r1.a(r2, r3, r4, r5, r6, r7)
            if (r11 == r8) goto L8a
            r1 = r10
        L54:
            android.net.Uri r11 = (android.net.Uri) r11
            if (r11 != 0) goto L7b
            alvi r11 = defpackage.jvd.b
            alvw r11 = r11.i()
            alvz r0 = defpackage.alwp.a
            java.lang.String r1 = "BugleComposeRow2"
            r11.X(r0, r1)
            java.lang.String r0 = "checkForAndHandlePendingResult"
            r1 = 154(0x9a, float:2.16E-43)
            java.lang.String r2 = "com/google/android/apps/messaging/conversation2/bottomcontent/composerow/inputs/shortcuts/files/FilesShortcutHandler"
            java.lang.String r3 = "FilesShortcutHandler.kt"
            alvw r11 = r11.h(r2, r0, r1, r3)
            alvg r11 = (defpackage.alvg) r11
            java.lang.String r0 = "Skipping file picker activity result because of null uri"
            r11.q(r0)
            arnb r11 = defpackage.arnb.a
            return r11
        L7b:
            r2 = 0
            r0.d = r2
            r0.c = r9
            java.lang.Object r11 = r1.g(r11, r0)
            if (r11 != r8) goto L87
            goto L8a
        L87:
            arnb r11 = defpackage.arnb.a
            return r11
        L8a:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jvd.f(arpe):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(android.net.Uri r20, defpackage.arpe r21) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jvd.g(android.net.Uri, arpe):java.lang.Object");
    }
}
