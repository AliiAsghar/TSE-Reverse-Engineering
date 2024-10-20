package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aafz implements xde {
    private static final xze a = xze.g("Bugle", "RbmSuggestionsFilter");
    private final wfh b;

    public aafz(wfh wfhVar) {
        this.b = wfhVar;
    }

    @Override // defpackage.xde
    public final /* synthetic */ alog a(List list, xcv xcvVar, int i) {
        return yyb.cN(this, list, xcvVar, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0082 -> B:10:0x0087). Please report as a decompilation issue!!! */
    @Override // defpackage.xde
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.util.List r10, defpackage.xcv r11, int r12, defpackage.arpe r13) {
        /*
            r9 = this;
            boolean r0 = r13 instanceof defpackage.aafy
            if (r0 == 0) goto L13
            r0 = r13
            aafy r0 = (defpackage.aafy) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            aafy r0 = new aafy
            r0.<init>(r9, r13)
        L18:
            java.lang.Object r13 = r0.c
            arpl r1 = defpackage.arpl.a
            int r2 = r0.e
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r10 = r0.b
            java.lang.Object r11 = r0.a
            alob r12 = r0.g
            int r2 = r0.i
            ixs r4 = r0.h
            aafz r5 = r0.f
            defpackage.aqil.P(r13)
            goto L87
        L33:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L3b:
            defpackage.aqil.P(r13)
            boolean r13 = r10.isEmpty()
            if (r13 == 0) goto L4c
            int r10 = defpackage.alog.d
            alog r10 = defpackage.alsx.a
            r10.getClass()
            return r10
        L4c:
            alob r13 = new alob
            r13.<init>()
            java.util.Iterator r10 = r10.iterator()
            r5 = r9
            r7 = r11
            r11 = r10
            r10 = r7
            r8 = r13
            r13 = r12
            r12 = r8
        L5c:
            boolean r2 = r11.hasNext()
            if (r2 == 0) goto Lad
            java.lang.Object r2 = r11.next()
            com.google.android.apps.messaging.shared.datamodel.data.suggestions.SuggestionData r2 = (com.google.android.apps.messaging.shared.datamodel.data.suggestions.SuggestionData) r2
            wfh r4 = r5.b
            r0.f = r5
            r6 = r10
            ixs r6 = (defpackage.ixs) r6
            r0.h = r6
            r0.i = r13
            r0.g = r12
            r0.a = r11
            r0.b = r2
            r0.e = r3
            java.lang.Object r4 = r4.k(r2, r10, r13, r0)
            if (r4 != r1) goto L82
            return r1
        L82:
            r7 = r4
            r4 = r10
            r10 = r2
            r2 = r13
            r13 = r7
        L87:
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            if (r13 == 0) goto L93
            r12.h(r10)
            goto Laa
        L93:
            xze r13 = defpackage.aafz.a
            xyo r13 = r13.a()
            java.lang.String r6 = "Discarding unacceptable"
            r13.H(r6)
            java.lang.String r10 = r10.toString()
            java.lang.String r6 = "suggestion"
            r13.C(r6, r10)
            r13.q()
        Laa:
            r13 = r2
            r10 = r4
            goto L5c
        Lad:
            alog r10 = r12.g()
            r10.getClass()
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aafz.b(java.util.List, xcv, int, arpe):java.lang.Object");
    }
}
