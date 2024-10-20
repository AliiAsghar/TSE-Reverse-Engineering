package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class neh {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/shared/api/messaging/recipient/kids/RecipientsTrustedContactsApiImpl");
    public final armf b;
    public final armf c;
    public final armf d;
    private final armf e;
    private final armf f;
    private final nfx g;
    private final vco h;

    public neh(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, nfx nfxVar, vco vcoVar) {
        armfVar.getClass();
        armfVar2.getClass();
        armfVar3.getClass();
        armfVar4.getClass();
        armfVar5.getClass();
        nfxVar.getClass();
        vcoVar.getClass();
        this.e = armfVar;
        this.f = armfVar2;
        this.b = armfVar3;
        this.c = armfVar4;
        this.d = armfVar5;
        this.g = nfxVar;
        this.h = vcoVar;
    }

    public static final Uri e(msh mshVar) {
        String str;
        if (!mshVar.u() && !mshVar.A()) {
            str = "sms";
        } else {
            str = "mailto";
        }
        Uri build = new Uri.Builder().scheme(str).opaquePart(mshVar.n()).build();
        build.getClass();
        return build;
    }

    private final boolean f(msh mshVar) {
        if (!uzz.g()) {
            return false;
        }
        if (!mshVar.u() && !mshVar.A()) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0063, code lost:
    
        if (r7 != r1) goto L23;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.util.List r6, defpackage.arpe r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.ned
            if (r0 == 0) goto L13
            r0 = r7
            ned r0 = (defpackage.ned) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            ned r0 = new ned
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.b
            arpl r1 = defpackage.arpl.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.aqil.P(r7)
            goto L65
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            java.lang.Object r6 = r0.a
            neh r2 = r0.e
            defpackage.aqil.P(r7)
            goto L4c
        L3a:
            defpackage.aqil.P(r7)
            vco r7 = r5.h
            r0.e = r5
            r0.a = r6
            r0.d = r4
            java.lang.Object r7 = r7.h(r0)
            if (r7 == r1) goto L92
            r2 = r5
        L4c:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L8d
            java.util.HashSet r6 = defpackage.aqjn.ai(r6)
            r7 = 0
            r0.e = r7
            r0.a = r7
            r0.d = r3
            java.lang.Object r7 = r2.c(r6, r0)
            if (r7 == r1) goto L92
        L65:
            java.util.Map r7 = (java.util.Map) r7
            java.util.Collection r6 = r7.values()
            boolean r7 = r6 instanceof java.util.Collection
            if (r7 == 0) goto L76
            boolean r7 = r6.isEmpty()
            if (r7 == 0) goto L76
            goto L8d
        L76:
            java.util.Iterator r6 = r6.iterator()
        L7a:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L8d
            java.lang.Object r7 = r6.next()
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 != 0) goto L7a
            r4 = 0
        L8d:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r4)
            return r6
        L92:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.neh.a(java.util.List, arpe):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008f A[LOOP:1: B:22:0x0089->B:24:0x008f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(defpackage.arpe r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.nee
            if (r0 == 0) goto L13
            r0 = r5
            nee r0 = (defpackage.nee) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            nee r0 = new nee
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.aqil.P(r5)
            goto L51
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            defpackage.aqil.P(r5)
            boolean r5 = defpackage.ofn.a()
            if (r5 != 0) goto L3b
            arnv r5 = defpackage.arnv.a
            return r5
        L3b:
            nfx r5 = r4.g
            ncq r5 = r5.a()
            akul r5 = r5.b()
            r5.getClass()
            r0.c = r3
            java.lang.Object r5 = defpackage.arro.F(r5, r0)
            if (r5 != r1) goto L51
            return r1
        L51:
            r5.getClass()
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r5 = r5.iterator()
        L5f:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L7a
            java.lang.Object r1 = r5.next()
            r2 = r1
            nfw r2 = (defpackage.nfw) r2
            j$.util.Optional r2 = r2.i()
            boolean r2 = r2.isPresent()
            if (r2 == 0) goto L5f
            r0.add(r1)
            goto L5f
        L7a:
            java.util.ArrayList r5 = new java.util.ArrayList
            r1 = 10
            int r1 = defpackage.aqjn.J(r0, r1)
            r5.<init>(r1)
            java.util.Iterator r0 = r0.iterator()
        L89:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Laa
            java.lang.Object r1 = r0.next()
            nfw r1 = (defpackage.nfw) r1
            j$.util.Optional r1 = r1.i()
            java.lang.Object r1 = r1.get()
            msh r1 = (defpackage.msh) r1
            java.lang.String r1 = r1.k()
            r1.getClass()
            r5.add(r1)
            goto L89
        Laa:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.neh.b(arpe):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x00a4, code lost:
    
        if (r1 != r3) goto L27;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0226 A[LOOP:2: B:67:0x0220->B:69:0x0226, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(java.util.Set r17, defpackage.arpe r18) {
        /*
            Method dump skipped, instructions count: 567
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.neh.c(java.util.Set, arpe):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(defpackage.msh r10, defpackage.arpe r11) {
        /*
            Method dump skipped, instructions count: 255
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.neh.d(msh, arpe):java.lang.Object");
    }
}
