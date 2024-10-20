package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jmi {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/attachment/DraftAttachmentViewer");
    public final afsp b;
    public final lkd c;

    public jmi(lkd lkdVar, afsp afspVar) {
        lkdVar.getClass();
        this.c = lkdVar;
        this.b = afspVar;
    }

    public final jmg a(loq loqVar) {
        afsx H;
        ((alvg) a.e().h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/attachment/DraftAttachmentViewer", "processMediaViewerResult", 103, "DraftAttachmentViewer.kt")).t("Draft MediaViewer result: %s", loqVar);
        if (loqVar == null || (H = afwv.H(loqVar.a)) == null) {
            return null;
        }
        return new jmg(new jgw(H, loqVar.b, null, afco.a));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.util.List r19, int r20, defpackage.arpe r21) {
        /*
            r18 = this;
            r0 = r18
            r1 = r21
            boolean r2 = r1 instanceof defpackage.jmh
            if (r2 == 0) goto L17
            r2 = r1
            jmh r2 = (defpackage.jmh) r2
            int r3 = r2.c
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.c = r3
            goto L1c
        L17:
            jmh r2 = new jmh
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.a
            arpl r3 = defpackage.arpl.a
            int r4 = r2.c
            r5 = 1
            if (r4 == 0) goto L36
            if (r4 != r5) goto L2e
            jmi r2 = r2.d
            defpackage.aqil.P(r1)
            goto Lae
        L2e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L36:
            defpackage.aqil.P(r1)
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.Iterator r1 = r19.iterator()
        L42:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L5a
            java.lang.Object r4 = r1.next()
            jha r4 = (defpackage.jha) r4
            afsp r6 = r0.b
            com.google.android.apps.messaging.ui.mediaviewer.data.MediaViewerItem r4 = defpackage.hld.p(r4, r6)
            if (r4 == 0) goto L42
            r11.add(r4)
            goto L42
        L5a:
            java.lang.Object r1 = r19.get(r20)
            jha r1 = (defpackage.jha) r1
            afsp r4 = r0.b
            com.google.android.apps.messaging.ui.mediaviewer.data.MediaViewerItem r1 = defpackage.hld.p(r1, r4)
            if (r1 == 0) goto Lbd
            int r1 = r11.indexOf(r1)
            if (r1 < 0) goto Lb5
            alvi r4 = defpackage.jmi.a
            alvw r4 = r4.e()
            java.lang.String r6 = "openMediaViewer"
            r7 = 88
            java.lang.String r8 = "com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/attachment/DraftAttachmentViewer"
            java.lang.String r9 = "DraftAttachmentViewer.kt"
            alvw r4 = r4.h(r8, r6, r7, r9)
            alvg r4 = (defpackage.alvg) r4
            java.lang.String r6 = "Navigating to MediaViewer with %s starting at index %d"
            r4.B(r6, r11, r1)
            lkd r4 = r0.c
            lmv r15 = new lmv
            java.lang.Integer r12 = new java.lang.Integer
            r12.<init>(r1)
            r1 = 0
            r16 = 1984(0x7c0, float:2.78E-42)
            r7 = 6
            r8 = 0
            r9 = 0
            r10 = 0
            r13 = 0
            r6 = r15
            r17 = r15
            r15 = r1
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r15, r16)
            r2.d = r0
            r2.c = r5
            r1 = r17
            java.lang.Object r1 = r4.a(r1, r2)
            if (r1 != r3) goto Lad
            return r3
        Lad:
            r2 = r0
        Lae:
            loq r1 = (defpackage.loq) r1
            jmg r1 = r2.a(r1)
            return r1
        Lb5:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Check failed."
            r1.<init>(r2)
            throw r1
        Lbd:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Required value was null."
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jmi.b(java.util.List, int, arpe):java.lang.Object");
    }
}
