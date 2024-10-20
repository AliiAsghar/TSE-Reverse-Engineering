package defpackage;

import android.net.Uri;
import j$.time.Duration;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aghp {
    public static final alvi a = alvi.m("com/google/android/libraries/compose/voice/recorder/VoiceRecordingManager");
    public final aghe b;
    public final anca c;
    public final aghf d;
    public final agfr e;
    public final afku f;
    public final aggo g;
    public Instant h;
    public arxm i;
    public final ascd j;
    public final ascv k;
    public final ascg l;
    public final asgm m;
    private final arwe n;
    private final arwe o;
    private final arpi p;

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, ascg] */
    public aghp(aghe agheVar, arwe arweVar, arwe arweVar2, arpi arpiVar, anca ancaVar, aghf aghfVar, agfr agfrVar, afku afkuVar, aggo aggoVar) {
        arweVar.getClass();
        arweVar2.getClass();
        arpiVar.getClass();
        ancaVar.getClass();
        aghfVar.getClass();
        afkuVar.getClass();
        this.b = agheVar;
        this.n = arweVar;
        this.o = arweVar2;
        this.p = arpiVar;
        this.c = ancaVar;
        this.d = aghfVar;
        this.e = agfrVar;
        this.f = afkuVar;
        this.g = aggoVar;
        this.m = new asgm();
        ascd a2 = ascy.a(aghh.a);
        this.j = a2;
        jdn jdnVar = new jdn(a2, agfrVar.f, new jdy((arpe) null, 8, (char[][]) null), 17, null);
        int i = ascp.a;
        this.k = arrn.T(jdnVar, arweVar2, asco.a, aghh.a);
        this.l = agheVar.c.a;
    }

    public static /* synthetic */ Object l(aghp aghpVar, arpe arpeVar) {
        return aghpVar.h(false, arpeVar);
    }

    private final Object m(arqr arqrVar, arpe arpeVar) {
        return arro.q(this.p, new jvy(this, arqrVar, (arpe) null, 5), arpeVar);
    }

    public final aftn a(Uri uri) {
        String uri2 = uri.toString();
        uri2.getClass();
        Instant a2 = this.c.a();
        a2.getClass();
        aggr aggrVar = aggr.a;
        Duration b = b();
        aozy createBuilder = aggp.a.createBuilder();
        createBuilder.getClass();
        return new aftn(this.d.d.a, uri2, null, null, 0L, a2, aggrVar, b, agiz.H(createBuilder), 12);
    }

    public final Duration b() {
        Instant instant = this.h;
        instant.getClass();
        Duration between = Duration.between(instant, this.c.a());
        between.getClass();
        return between;
    }

    public final Object c(aggp aggpVar, arpe arpeVar) {
        Object m = m(new ikv(this, aggpVar, (arpe) null, 17), arpeVar);
        if (m == arpl.a) {
            return m;
        }
        return arnb.a;
    }

    public final Object d(arpe arpeVar) {
        Object m = m(new ehx(this, (arpe) null, 11), arpeVar);
        if (m == arpl.a) {
            return m;
        }
        return arnb.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(java.lang.Exception r9, defpackage.arpe r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof defpackage.aghl
            if (r0 == 0) goto L13
            r0 = r10
            aghl r0 = (defpackage.aghl) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            aghl r0 = new aghl
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            aghp r9 = r0.d
            defpackage.aqil.P(r10)
            goto L65
        L29:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L31:
            defpackage.aqil.P(r10)
            alvi r10 = defpackage.aghp.a
            alvw r10 = r10.i()
            alvg r10 = (defpackage.alvg) r10
            alvw r10 = r10.g(r9)
            java.lang.String r2 = "handleError"
            r4 = 237(0xed, float:3.32E-43)
            java.lang.String r5 = "com/google/android/libraries/compose/voice/recorder/VoiceRecordingManager"
            java.lang.String r6 = "VoiceRecordingManager.kt"
            alvw r10 = r10.h(r5, r2, r4, r6)
            alvg r10 = (defpackage.alvg) r10
            java.lang.String r2 = "Error occurred during recording."
            r10.q(r2)
            aghf r10 = r8.d
            jvw r10 = r10.e
            r10.e(r9)
            r0.d = r8
            r0.c = r3
            java.lang.Object r10 = r8.h(r3, r0)
            if (r10 == r1) goto L87
            r9 = r8
        L65:
            r4 = r10
            android.net.Uri r4 = (android.net.Uri) r4
            if (r4 == 0) goto L7c
            arwe r10 = r9.n
            afju r0 = new afju
            r6 = 12
            r7 = 0
            r5 = 0
            r2 = r0
            r3 = r9
            r2.<init>(r3, r4, r5, r6, r7)
            r1 = 3
            r2 = 0
            defpackage.arrn.J(r10, r2, r2, r0, r1)
        L7c:
            aghf r10 = r9.d
            r10 = 2132017442(0x7f140122, float:1.9673163E38)
            r9.k(r10)
            arnb r9 = defpackage.arnb.a
            return r9
        L87:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aghp.e(java.lang.Exception, arpe):java.lang.Object");
    }

    public final Object f(arpe arpeVar) {
        return m(new ehx(this, (arpe) null, 12, (byte[]) null), arpeVar);
    }

    public final Object g(arpe arpeVar) {
        Object m = m(new ehx(this, (arpe) null, 13, (char[]) null), arpeVar);
        if (m == arpl.a) {
            return m;
        }
        return arnb.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object h(boolean r6, defpackage.arpe r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.agho
            if (r0 == 0) goto L13
            r0 = r7
            agho r0 = (defpackage.agho) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            agho r0 = new agho
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L49
            if (r2 == r3) goto L43
            r6 = 2
            if (r2 != r6) goto L3b
            aghp r6 = r0.d
            defpackage.aqil.P(r7)
            arwe r7 = r6.n
            aghm r0 = new aghm
            r1 = 3
            r0.<init>(r6, r4, r1, r4)
            arxm r7 = defpackage.arrn.J(r7, r4, r4, r0, r1)
            r6.i = r7
            goto L84
        L3b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L43:
            aghp r6 = r0.d
            defpackage.aqil.P(r7)
            goto L7c
        L49:
            defpackage.aqil.P(r7)
            agfr r7 = r5.e
            r7.a()
            aghf r7 = r5.d
            jvw r7 = r7.e
            if (r6 == 0) goto L5f
            j$.time.Duration r6 = r5.b()
            r7.d(r6)
            goto L66
        L5f:
            j$.time.Duration r6 = r5.b()
            r7.f(r6)
        L66:
            aghe r6 = r5.b
            boolean r7 = r6.f()
            if (r3 == r7) goto L6f
            r6 = r4
        L6f:
            if (r6 == 0) goto L81
            r0.d = r5
            r0.c = r3
            java.lang.Object r7 = r6.d(r0)
            if (r7 == r1) goto L80
            r6 = r5
        L7c:
            android.net.Uri r7 = (android.net.Uri) r7
            r4 = r7
            goto L82
        L80:
            return r1
        L81:
            r6 = r5
        L82:
            aghf r6 = r6.d
        L84:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aghp.h(boolean, arpe):java.lang.Object");
    }

    public final void i(Uri uri) {
        arrn.J(this.n, null, null, new afju(this, uri, (arpe) null, 11), 3);
    }

    public final void j() {
        this.e.a();
        this.h = null;
        this.j.f(aghh.a);
    }

    public final void k(int i) {
        this.e.a();
        this.j.f(new aghg(i));
    }
}
