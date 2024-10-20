package defpackage;

import android.content.Context;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jfa implements jcu {
    public final Context a;
    private final arwe b;
    private final yjf c;
    private final alwo d;
    private final asai e;
    private final Set f;
    private final lkd g;
    private final gpx h;

    public jfa(Context context, arwe arweVar, khb khbVar, yjf yjfVar, gpx gpxVar, lkd lkdVar) {
        context.getClass();
        arweVar.getClass();
        khbVar.getClass();
        yjfVar.getClass();
        lkdVar.getClass();
        this.a = context;
        this.b = arweVar;
        this.c = yjfVar;
        this.h = gpxVar;
        this.g = lkdVar;
        this.d = alwo.o("Bugle");
        this.e = new idx(khbVar.a(), this, 10);
        this.f = aqil.r(new khe[]{khe.b, khe.c});
    }

    private final Object f(arpe arpeVar) {
        if (!yhx.c && !this.c.n()) {
            return this.g.a(new lny(yjh.STORAGE_PERMISSIONS), arpeVar);
        }
        return true;
    }

    @Override // defpackage.jcu
    public final Set a() {
        return this.f;
    }

    @Override // defpackage.jcu
    public final asai b() {
        return this.e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(java.util.List r7, defpackage.arpe r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.jex
            if (r0 == 0) goto L13
            r0 = r8
            jex r0 = (defpackage.jex) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            jex r0 = new jex
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.b
            arpl r1 = defpackage.arpl.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r7 = r0.a
            jfa r0 = r0.e
            defpackage.aqil.P(r8)
            goto L43
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            defpackage.aqil.P(r8)
            r0.e = r6
            r0.a = r7
            r0.d = r3
            java.lang.Object r8 = r6.f(r0)
            if (r8 == r1) goto L9f
            r0 = r6
        L43:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L8f
            gpx r8 = r0.h
            java.lang.String r0 = "Bugle.Async.ConversationFragment.ActionMode.Callback.onActionItemClicked.Duration"
            ibr r8 = r8.o(r0)
            java.util.Iterator r7 = r7.iterator()
        L57:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L88
            java.lang.Object r0 = r7.next()
            miz r0 = (defpackage.miz) r0
            mym r0 = r0.e()
            mxf r0 = (defpackage.mxf) r0
            android.net.Uri r1 = r0.d()
            java.lang.String r2 = r0.j()
            android.net.Uri r3 = r0.b()
            boolean r4 = r0 instanceof defpackage.myk
            r5 = 0
            if (r4 == 0) goto L7d
            myk r0 = (defpackage.myk) r0
            goto L7e
        L7d:
            r0 = r5
        L7e:
            if (r0 == 0) goto L84
            java.lang.String r5 = r0.l()
        L84:
            r8.b(r1, r2, r3, r5)
            goto L57
        L88:
            r7 = 0
            java.lang.Void[] r7 = new java.lang.Void[r7]
            r8.e(r7)
            goto L9c
        L8f:
            alwo r7 = r0.d
            java.util.logging.Level r8 = java.util.logging.Level.WARNING
            alwl r7 = r7.a(r8)
            java.lang.String r8 = "Unable to obtain storage permission. Attachment will not be saved."
            r7.q(r8)
        L9c:
            arnb r7 = defpackage.arnb.a
            return r7
        L9f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jfa.c(java.util.List, arpe):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x00ac -> B:11:0x00ae). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(java.util.List r11, defpackage.arpe r12) {
        /*
            Method dump skipped, instructions count: 222
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jfa.d(java.util.List, arpe):java.lang.Object");
    }

    public final void e(List list) {
        qjh.l(this.b, null, new lxi(list, this, (arpe) null, 1), 3);
    }
}
