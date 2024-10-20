package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afmq {
    public boolean a;
    public final CopyOnWriteArrayList b;
    public final Map c;
    public final Map d;
    public final aiwu e;
    private final arwe f;
    private final arml g;
    private arxm h;
    private final afmd i;

    public afmq(armf armfVar, aiwu aiwuVar, arwe arweVar, afmd afmdVar) {
        armfVar.getClass();
        aiwuVar.getClass();
        arweVar.getClass();
        afmdVar.getClass();
        this.e = aiwuVar;
        this.f = arweVar;
        this.i = afmdVar;
        this.g = armd.a(new afjm(armfVar, 7));
        this.b = new CopyOnWriteArrayList();
        this.c = new LinkedHashMap();
        this.d = new LinkedHashMap();
    }

    private final afmr j() {
        return (afmr) this.g.a();
    }

    private final Object k(arqr arqrVar, arpe arpeVar) {
        final aezb aezbVar = new aezb(arqrVar, 19);
        ListenableFuture b = this.e.b(new algk() { // from class: afmn
            @Override // defpackage.algk
            public final /* synthetic */ Object apply(Object obj) {
                return arqr.this.a(obj);
            }
        }, andi.a);
        arwl I = arrn.I(this.f, null, null, new afmg(b, (arpe) null, 2), 3);
        I.s(new aezb(b, 18));
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((afme) it.next()).a();
        }
        Object n = I.n(arpeVar);
        if (n == arpl.a) {
            return n;
        }
        return arnb.a;
    }

    private final Object l(afnb afnbVar, aflq aflqVar, arpe arpeVar) {
        return e(afnbVar, new aezb(aflqVar, 20), new afmo(aflqVar, 1), arpeVar);
    }

    private final Object m(afnb afnbVar, aflq aflqVar, aflr aflrVar, arpe arpeVar) {
        return e(afnbVar, new afho(aflqVar, aflrVar, 4), new afho(aflqVar, aflrVar, 5), arpeVar);
    }

    private final Object n(afnb afnbVar, aflr aflrVar, arpe arpeVar) {
        return e(afnbVar, new afmo(aflrVar, 0), new afmo(aflrVar, 2), arpeVar);
    }

    private final Object o(aflw aflwVar, arpe arpeVar) {
        CharSequence a = aflwVar.b().a();
        CharSequence a2 = aflwVar.a();
        if (d.F(a2, a) ? this.c.remove(a) != null : !d.F(this.c.put(a, a2), a2)) {
            Object k = k(new afho(a, a2, 6), arpeVar);
            if (k == arpl.a) {
                return k;
            }
        }
        return arnb.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0053, code lost:
    
        if (r6.q(r0) == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.arpe r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.afmh
            if (r0 == 0) goto L13
            r0 = r6
            afmh r0 = (defpackage.afmh) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            afmh r0 = new afmh
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.aqil.P(r6)
            goto L56
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L32:
            afmq r2 = r0.d
            defpackage.aqil.P(r6)
            goto L46
        L38:
            defpackage.aqil.P(r6)
            r0.d = r5
            r0.c = r4
            java.lang.Object r6 = r5.i()
            if (r6 == r1) goto L59
            r2 = r5
        L46:
            arxm r6 = r2.h
            if (r6 == 0) goto L56
            r2 = 0
            r0.d = r2
            r0.c = r3
            java.lang.Object r6 = r6.q(r0)
            if (r6 != r1) goto L56
            goto L59
        L56:
            arnb r6 = defpackage.arnb.a
            return r6
        L59:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afmq.a(arpe):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0082 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0085 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0065 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(defpackage.afnb r7, defpackage.arpe r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.afmi
            if (r0 == 0) goto L13
            r0 = r8
            afmi r0 = (defpackage.afmi) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            afmi r0 = new afmi
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.b
            arpl r1 = defpackage.arpl.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r7 = r0.a
            aflx r7 = (defpackage.aflx) r7
            defpackage.aqil.P(r8)
            goto L76
        L2e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L36:
            java.lang.Object r7 = r0.a
            afmq r7 = (defpackage.afmq) r7
            defpackage.aqil.P(r8)
            goto L61
        L3e:
            defpackage.aqil.P(r8)
            afmr r8 = r6.j()
            afmr r2 = defpackage.afmr.c
            if (r8 != r2) goto L4c
            java.lang.String r7 = "__GLOBAL__"
            goto L87
        L4c:
            afmd r8 = r6.i
            r0.a = r6
            r0.d = r4
            aezb r2 = new aezb
            r4 = 16
            r2.<init>(r7, r4)
            java.lang.Object r8 = r8.e(r2, r0)
            if (r8 != r1) goto L60
            return r1
        L60:
            r7 = r6
        L61:
            aflx r8 = (defpackage.aflx) r8
            if (r8 != 0) goto L67
            r7 = 0
            goto L87
        L67:
            afmd r7 = r7.i
            r0.a = r8
            r0.d = r3
            java.lang.Object r7 = r7.d(r0)
            if (r7 == r1) goto L88
            r5 = r8
            r8 = r7
            r7 = r5
        L76:
            java.util.List r8 = (java.util.List) r8
            java.lang.Object r8 = defpackage.aqjn.X(r8)
            boolean r7 = defpackage.d.F(r7, r8)
            if (r7 == 0) goto L85
            java.lang.String r7 = "body-parts"
            goto L87
        L85:
            java.lang.String r7 = "person"
        L87:
            return r7
        L88:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afmq.b(afnb, arpe):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x010d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:78:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(defpackage.afnb r9, defpackage.arpe r10) {
        /*
            Method dump skipped, instructions count: 272
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afmq.c(afnb, arpe):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0071 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(defpackage.afnb r6, defpackage.arpe r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.afmk
            if (r0 == 0) goto L13
            r0 = r7
            afmk r0 = (defpackage.afmk) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            afmk r0 = new afmk
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
            goto L6d
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            java.lang.Object r6 = r0.a
            afmq r2 = r0.e
            defpackage.aqil.P(r7)
            goto L4a
        L3a:
            defpackage.aqil.P(r7)
            r0.e = r5
            r0.a = r6
            r0.d = r4
            java.lang.Object r7 = r5.a(r0)
            if (r7 == r1) goto L72
            r2 = r5
        L4a:
            java.util.Map r7 = r2.c
            afnb r6 = (defpackage.afnb) r6
            aflp r6 = r6.a()
            java.lang.CharSequence r6 = r6.a()
            java.lang.Object r6 = r7.get(r6)
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            r7 = 0
            if (r6 == 0) goto L71
            afmd r2 = r2.i
            r0.e = r7
            r0.a = r7
            r0.d = r3
            java.lang.Object r7 = r2.b(r6, r0)
            if (r7 == r1) goto L70
        L6d:
            aflw r7 = (defpackage.aflw) r7
            goto L71
        L70:
            return r1
        L71:
            return r7
        L72:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afmq.d(afnb, arpe):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(defpackage.afnb r9, defpackage.arqr r10, defpackage.arqr r11, defpackage.arpe r12) {
        /*
            r8 = this;
            boolean r0 = r12 instanceof defpackage.afml
            if (r0 == 0) goto L13
            r0 = r12
            afml r0 = (defpackage.afml) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            afml r0 = new afml
            r0.<init>(r8, r12)
        L18:
            java.lang.Object r12 = r0.d
            arpl r1 = defpackage.arpl.a
            int r2 = r0.f
            r3 = 2
            r4 = 1
            r5 = 3
            r6 = 0
            if (r2 == 0) goto L53
            if (r2 == r4) goto L43
            if (r2 == r3) goto L37
            if (r2 != r5) goto L2f
            defpackage.aqil.P(r12)
            goto Lb5
        L2f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L37:
            java.lang.Object r9 = r0.b
            java.lang.Object r10 = r0.a
            arqr r10 = (defpackage.arqr) r10
            afmq r11 = r0.g
            defpackage.aqil.P(r12)
            goto L7b
        L43:
            java.lang.Object r11 = r0.c
            java.lang.Object r10 = r0.b
            java.lang.Object r9 = r0.a
            afnb r9 = (defpackage.afnb) r9
            afmq r2 = r0.g
            defpackage.aqil.P(r12)
            r12 = r11
            r11 = r2
            goto L68
        L53:
            defpackage.aqil.P(r12)
            r0.g = r8
            r0.a = r9
            r0.b = r10
            r0.c = r11
            r0.f = r4
            java.lang.Object r12 = r8.a(r0)
            if (r12 == r1) goto Lb8
            r12 = r11
            r11 = r8
        L68:
            r0.g = r11
            r0.a = r10
            r0.b = r12
            r0.c = r6
            r0.f = r3
            java.lang.Object r9 = r11.b(r9, r0)
            if (r9 == r1) goto Lb8
            r7 = r12
            r12 = r9
            r9 = r7
        L7b:
            java.lang.String r12 = (java.lang.String) r12
            if (r12 == 0) goto Lb7
            java.util.Map r2 = r11.d
            java.lang.Object r3 = r2.get(r12)
            if (r3 != 0) goto L8f
            afmf r3 = new afmf
            r3.<init>(r6)
            r2.put(r12, r3)
        L8f:
            afmf r3 = (defpackage.afmf) r3
            java.lang.Object r10 = r10.a(r3)
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto Lb5
            r9.a(r3)
            afho r9 = new afho
            r9.<init>(r12, r3, r5, r6)
            r0.g = r6
            r0.a = r6
            r0.b = r6
            r0.f = r5
            java.lang.Object r9 = r11.k(r9, r0)
            if (r9 == r1) goto Lb4
            goto Lb5
        Lb4:
            return r1
        Lb5:
            arnb r6 = defpackage.arnb.a
        Lb7:
            return r6
        Lb8:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afmq.e(afnb, arqr, arqr, arpe):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(defpackage.afnb r9, defpackage.arpe r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof defpackage.afmm
            if (r0 == 0) goto L13
            r0 = r10
            afmm r0 = (defpackage.afmm) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            afmm r0 = new afmm
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.b
            arpl r1 = defpackage.arpl.a
            int r2 = r0.d
            r3 = 5
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            if (r2 == 0) goto L49
            if (r2 == r7) goto L41
            if (r2 == r6) goto L3c
            if (r2 == r5) goto L3c
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L34
            defpackage.aqil.P(r10)
            goto La9
        L34:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3c:
            defpackage.aqil.P(r10)
            goto Lb2
        L41:
            java.lang.Object r9 = r0.a
            afmq r2 = r0.e
            defpackage.aqil.P(r10)
            goto L59
        L49:
            defpackage.aqil.P(r10)
            r0.e = r8
            r0.a = r9
            r0.d = r7
            java.lang.Object r10 = r8.a(r0)
            if (r10 == r1) goto Lb9
            r2 = r8
        L59:
            boolean r10 = r9 instanceof defpackage.afmy
            r7 = 0
            if (r10 == 0) goto L6d
            r0.e = r7
            r0.a = r7
            r0.d = r6
            afnb r9 = (defpackage.afnb) r9
            java.lang.Object r10 = r2.l(r9, r7, r0)
            if (r10 != r1) goto Lb2
            return r1
        L6d:
            boolean r10 = r9 instanceof defpackage.afna
            if (r10 == 0) goto L80
            r0.e = r7
            r0.a = r7
            r0.d = r5
            afnb r9 = (defpackage.afnb) r9
            java.lang.Object r10 = r2.n(r9, r7, r0)
            if (r10 != r1) goto Lb2
            return r1
        L80:
            boolean r10 = r9 instanceof defpackage.afmx
            if (r10 == 0) goto L93
            r0.e = r7
            r0.a = r7
            r0.d = r4
            afnb r9 = (defpackage.afnb) r9
            java.lang.Object r10 = r2.m(r9, r7, r7, r0)
            if (r10 != r1) goto Lb2
            return r1
        L93:
            boolean r10 = r9 instanceof defpackage.afmu
            if (r10 == 0) goto Lad
            afmu r9 = (defpackage.afmu) r9
            aflp r9 = r9.a()
            r0.e = r7
            r0.a = r7
            r0.d = r3
            java.lang.Object r9 = r2.o(r9, r0)
            if (r9 == r1) goto Lac
        La9:
            arnb r10 = defpackage.arnb.a
            goto Lb2
        Lac:
            return r1
        Lad:
            boolean r9 = r9 instanceof defpackage.afmz
            if (r9 == 0) goto Lb3
            goto La9
        Lb2:
            return r10
        Lb3:
            armm r9 = new armm
            r9.<init>()
            throw r9
        Lb9:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afmq.f(afnb, arpe):java.lang.Object");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x001e. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(defpackage.afnb r6, defpackage.aflw r7, defpackage.arpe r8) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afmq.g(afnb, aflw, arpe):java.lang.Object");
    }

    public final void h(afme afmeVar) {
        afmeVar.getClass();
        this.b.remove(afmeVar);
    }

    public final Object i() {
        arxm arxmVar = this.h;
        if ((arxmVar == null || arxmVar.z()) && !this.a) {
            this.h = arrn.J(this.f, null, null, new afmg(this, (arpe) null, 0), 3);
        }
        return arnb.a;
    }
}
