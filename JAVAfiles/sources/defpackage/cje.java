package defpackage;

import androidx.compose.ui.focus.FocusTargetNode;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cje {
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0039, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final androidx.compose.ui.focus.FocusTargetNode a(androidx.compose.ui.focus.FocusTargetNode r8) {
        /*
            ciz r0 = r8.e()
            drk r1 = defpackage.drk.a
            ciz r1 = defpackage.ciz.a
            int r0 = r0.ordinal()
            if (r0 == 0) goto Lae
            r1 = 0
            r2 = 1
            if (r0 == r2) goto L1f
            r2 = 2
            if (r0 == r2) goto Lae
            r8 = 3
            if (r0 != r8) goto L19
            return r1
        L19:
            armm r8 = new armm
            r8.<init>()
            throw r8
        L1f:
            cga$c r8 = r8.p
            boolean r0 = r8.z
            if (r0 == 0) goto La6
            cbh r0 = new cbh
            r3 = 16
            cga$c[] r4 = new cga.c[r3]
            r0.<init>(r4)
            cga$c r4 = r8.t
            if (r4 != 0) goto L36
            defpackage.cwp.j(r0, r8)
            goto L39
        L36:
            r0.n(r4)
        L39:
            int r8 = r0.b
            if (r8 == 0) goto La5
            int r8 = r8 + (-1)
            java.lang.Object r8 = r0.c(r8)
            cga$c r8 = (cga.c) r8
            int r4 = r8.r
            r4 = r4 & 1024(0x400, float:1.435E-42)
            if (r4 != 0) goto L4f
            defpackage.cwp.j(r0, r8)
            goto L39
        L4f:
            if (r8 == 0) goto L39
            int r4 = r8.q
            r4 = r4 & 1024(0x400, float:1.435E-42)
            if (r4 == 0) goto La2
            r4 = r1
        L58:
            if (r8 == 0) goto L39
            boolean r5 = r8 instanceof androidx.compose.ui.focus.FocusTargetNode
            if (r5 == 0) goto L68
            androidx.compose.ui.focus.FocusTargetNode r8 = (androidx.compose.ui.focus.FocusTargetNode) r8
            androidx.compose.ui.focus.FocusTargetNode r8 = a(r8)
            if (r8 != 0) goto L67
            goto L9d
        L67:
            return r8
        L68:
            int r5 = r8.q
            r5 = r5 & 1024(0x400, float:1.435E-42)
            if (r5 == 0) goto L9d
            boolean r5 = r8 instanceof defpackage.cwr
            if (r5 == 0) goto L9d
            r5 = r8
            cwr r5 = (defpackage.cwr) r5
            cga$c r5 = r5.B
            r6 = 0
        L78:
            if (r5 == 0) goto L9b
            int r7 = r5.q
            r7 = r7 & 1024(0x400, float:1.435E-42)
            if (r7 == 0) goto L98
            int r6 = r6 + 1
            if (r6 != r2) goto L86
            r8 = r5
            goto L98
        L86:
            if (r4 != 0) goto L8f
            cbh r4 = new cbh
            cga$c[] r7 = new cga.c[r3]
            r4.<init>(r7)
        L8f:
            if (r8 == 0) goto L94
            r4.n(r8)
        L94:
            r4.n(r5)
            r8 = r1
        L98:
            cga$c r5 = r5.t
            goto L78
        L9b:
            if (r6 == r2) goto L58
        L9d:
            cga$c r8 = defpackage.cwp.a(r4)
            goto L58
        La2:
            cga$c r8 = r8.t
            goto L4f
        La5:
            return r1
        La6:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "visitChildren called on an unattached node"
            r8.<init>(r0)
            throw r8
        Lae:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cje.a(androidx.compose.ui.focus.FocusTargetNode):androidx.compose.ui.focus.FocusTargetNode");
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x001b, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final androidx.compose.ui.focus.FocusTargetNode b(androidx.compose.ui.focus.FocusTargetNode r8) {
        /*
            cga$c r8 = r8.p
            boolean r0 = r8.z
            r1 = 0
            if (r0 == 0) goto L9b
            cbh r0 = new cbh
            r2 = 16
            cga$c[] r3 = new cga.c[r2]
            r0.<init>(r3)
            cga$c r3 = r8.t
            if (r3 != 0) goto L18
            defpackage.cwp.j(r0, r8)
            goto L1b
        L18:
            r0.n(r3)
        L1b:
            int r8 = r0.b
            if (r8 == 0) goto L9b
            int r8 = r8 + (-1)
            java.lang.Object r8 = r0.c(r8)
            cga$c r8 = (cga.c) r8
            int r3 = r8.r
            r3 = r3 & 1024(0x400, float:1.435E-42)
            if (r3 != 0) goto L31
            defpackage.cwp.j(r0, r8)
            goto L1b
        L31:
            if (r8 == 0) goto L1b
            int r3 = r8.q
            r3 = r3 & 1024(0x400, float:1.435E-42)
            if (r3 == 0) goto L98
            r3 = r1
        L3a:
            if (r8 == 0) goto L1b
            boolean r4 = r8 instanceof androidx.compose.ui.focus.FocusTargetNode
            r5 = 1
            if (r4 == 0) goto L5e
            androidx.compose.ui.focus.FocusTargetNode r8 = (androidx.compose.ui.focus.FocusTargetNode) r8
            cga$c r4 = r8.p
            boolean r4 = r4.z
            if (r4 == 0) goto L93
            ciz r4 = r8.e()
            drk r6 = defpackage.drk.a
            ciz r6 = defpackage.ciz.a
            int r4 = r4.ordinal()
            if (r4 == 0) goto L5d
            if (r4 == r5) goto L5d
            r5 = 2
            if (r4 == r5) goto L5d
            goto L93
        L5d:
            return r8
        L5e:
            int r4 = r8.q
            r4 = r4 & 1024(0x400, float:1.435E-42)
            if (r4 == 0) goto L93
            boolean r4 = r8 instanceof defpackage.cwr
            if (r4 == 0) goto L93
            r4 = r8
            cwr r4 = (defpackage.cwr) r4
            cga$c r4 = r4.B
            r6 = 0
        L6e:
            if (r4 == 0) goto L91
            int r7 = r4.q
            r7 = r7 & 1024(0x400, float:1.435E-42)
            if (r7 == 0) goto L8e
            int r6 = r6 + 1
            if (r6 != r5) goto L7c
            r8 = r4
            goto L8e
        L7c:
            if (r3 != 0) goto L85
            cbh r3 = new cbh
            cga$c[] r7 = new cga.c[r2]
            r3.<init>(r7)
        L85:
            if (r8 == 0) goto L8a
            r3.n(r8)
        L8a:
            r3.n(r4)
            r8 = r1
        L8e:
            cga$c r4 = r4.t
            goto L6e
        L91:
            if (r6 == r5) goto L3a
        L93:
            cga$c r8 = defpackage.cwp.a(r3)
            goto L3a
        L98:
            cga$c r8 = r8.t
            goto L31
        L9b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cje.b(androidx.compose.ui.focus.FocusTargetNode):androidx.compose.ui.focus.FocusTargetNode");
    }

    public static final cjp c(FocusTargetNode focusTargetNode) {
        cyn cynVar = focusTargetNode.v;
        if (cynVar != null) {
            return ctj.f(cynVar).n(cynVar, false);
        }
        return cjp.a;
    }

    public static final boolean d(FocusTargetNode focusTargetNode) {
        cxn cxnVar;
        cyn cynVar;
        cxn cxnVar2;
        cyn cynVar2 = focusTargetNode.v;
        if (cynVar2 != null && (cxnVar = cynVar2.r) != null && cxnVar.ew() && (cynVar = focusTargetNode.v) != null && (cxnVar2 = cynVar.r) != null && cxnVar2.am()) {
            return true;
        }
        return false;
    }
}
