package defpackage;

import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import j$.time.Instant;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class affq implements affb {
    public static final alvi a = alvi.m("com/google/android/libraries/compose/audio/sink/FileAudioSink");
    public final arwe b;
    public final Optional c;
    public final affr d;
    public final ascg e;
    public afes f;
    public volatile boolean g;
    public boolean h;
    public arxm i;
    public final arvv j = new arvv();
    public final addp k;
    public final addp l;
    private final arpi m;
    private arxm n;
    private arxm o;

    public affq(arpi arpiVar, arwe arweVar, addp addpVar, addp addpVar2, Optional optional, affr affrVar) {
        this.m = arpiVar;
        this.b = arweVar;
        this.k = addpVar;
        this.l = addpVar2;
        this.c = optional;
        this.d = affrVar;
        this.e = affrVar.c;
        Instant.EPOCH.getClass();
    }

    @Override // defpackage.affb
    public final Object a(arpe arpeVar) {
        Object q = arro.q(this.m, new affn(this, null), arpeVar);
        if (q == arpl.a) {
            return q;
        }
        return arnb.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.affb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(defpackage.arpe r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof defpackage.affo
            if (r0 == 0) goto L13
            r0 = r8
            affo r0 = (defpackage.affo) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            affo r0 = new affo
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            affq r0 = r0.d
            defpackage.aqil.P(r8)
            goto L63
        L29:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L31:
            defpackage.aqil.P(r8)
            alvi r8 = defpackage.affq.a
            alvw r8 = r8.g()
            alvz r2 = defpackage.alwp.a
            java.lang.String r4 = "HugoAudio"
            r8.X(r2, r4)
            java.lang.String r2 = "release"
            r4 = 193(0xc1, float:2.7E-43)
            java.lang.String r5 = "com/google/android/libraries/compose/audio/sink/FileAudioSink"
            java.lang.String r6 = "FileAudioSink.kt"
            alvw r8 = r8.h(r5, r2, r4, r6)
            alvg r8 = (defpackage.alvg) r8
            affr r2 = r7.d
            java.lang.String r4 = "Releasing FileAudioSink for %s"
            android.net.Uri r2 = r2.a
            r8.t(r4, r2)
            r0.d = r7
            r0.c = r3
            java.lang.Object r8 = r7.d(r0)
            if (r8 == r1) goto L6d
            r0 = r7
        L63:
            afes r8 = r0.f
            if (r8 == 0) goto L6a
            r8.h()
        L6a:
            arnb r8 = defpackage.arnb.a
            return r8
        L6d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.affq.b(arpe):java.lang.Object");
    }

    @Override // defpackage.affb
    public final Object c(arpe arpeVar) {
        if (h()) {
            alvw g = a.g();
            g.X(alwp.a, "HugoAudio");
            ((alvg) g.h("com/google/android/libraries/compose/audio/sink/FileAudioSink", ConversationSuggestion.SUGGESTION_PROPERTY_CALENDAR_START_TIME, 81, "FileAudioSink.kt")).t("Starting FileAudioSink for %s", this.d.a);
            Object g2 = g(arpeVar);
            if (g2 == arpl.a) {
                return g2;
            }
            return arnb.a;
        }
        throw new IllegalStateException("This instance needs to be prepared prior to starting");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x005b, code lost:
    
        if (defpackage.arwi.t(r6, r0) == r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005d, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004c, code lost:
    
        if (defpackage.arwi.t(r6, r0) != r1) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(defpackage.arpe r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.affj
            if (r0 == 0) goto L13
            r0 = r6
            affj r0 = (defpackage.affj) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            affj r0 = new affj
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            affq r0 = r0.d
            defpackage.aqil.P(r6)
            goto L5f
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L34:
            affq r2 = r0.d
            defpackage.aqil.P(r6)
            goto L4f
        L3a:
            defpackage.aqil.P(r6)
            r6 = 0
            r5.g = r6
            arxm r6 = r5.n
            if (r6 == 0) goto L4e
            r0.d = r5
            r0.c = r4
            java.lang.Object r6 = defpackage.arwi.t(r6, r0)
            if (r6 == r1) goto L5d
        L4e:
            r2 = r5
        L4f:
            arxm r6 = r2.o
            if (r6 == 0) goto L5e
            r0.d = r2
            r0.c = r3
            java.lang.Object r6 = defpackage.arwi.t(r6, r0)
            if (r6 != r1) goto L5e
        L5d:
            return r1
        L5e:
            r0 = r2
        L5f:
            r6 = 0
            r0.n = r6
            r0.o = r6
            arnb r6 = defpackage.arnb.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.affq.d(arpe):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0061, code lost:
    
        if (r7.a(r6, r0) != r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(java.lang.Exception r6, defpackage.arpe r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.affk
            if (r0 == 0) goto L13
            r0 = r7
            affk r0 = (defpackage.affk) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            affk r0 = new affk
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
            goto L64
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            java.lang.Object r6 = r0.a
            affq r2 = r0.e
            defpackage.aqil.P(r7)
            goto L4a
        L3a:
            defpackage.aqil.P(r7)
            r0.e = r5
            r0.a = r6
            r0.d = r4
            java.lang.Object r7 = r5.d(r0)
            if (r7 == r1) goto L67
            r2 = r5
        L4a:
            arvv r7 = r2.j
            r4 = r6
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            r7.b(r4)
            affr r7 = r2.d
            arqv r7 = r7.i
            r2 = 0
            r0.e = r2
            r0.a = r2
            r0.d = r3
            java.lang.Object r6 = r7.a(r6, r0)
            if (r6 != r1) goto L64
            goto L67
        L64:
            arnb r6 = defpackage.arnb.a
            return r6
        L67:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.affq.e(java.lang.Exception, arpe):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(defpackage.arpe r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof defpackage.affl
            if (r0 == 0) goto L13
            r0 = r8
            affl r0 = (defpackage.affl) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            affl r0 = new affl
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.b
            arpl r1 = defpackage.arpl.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.lang.Object r0 = r0.a
            defpackage.aqil.P(r8)
            goto L54
        L29:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L31:
            defpackage.aqil.P(r8)
            arvv r8 = new arvv
            r8.<init>()
            arwe r2 = r7.b
            adzx r4 = new adzx
            r5 = 14
            r6 = 0
            r4.<init>(r7, r8, r6, r5)
            r5 = 3
            arxm r2 = defpackage.arrn.J(r2, r6, r6, r4, r5)
            r0.a = r2
            r0.d = r3
            java.lang.Object r8 = r8.hk(r0)
            if (r8 != r1) goto L53
            return r1
        L53:
            r0 = r2
        L54:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.affq.f(arpe):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(defpackage.arpe r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.affp
            if (r0 == 0) goto L13
            r0 = r6
            affp r0 = (defpackage.affp) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            affp r0 = new affp
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            affq r1 = r0.e
            affq r0 = r0.d
            defpackage.aqil.P(r6)
            goto L5c
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L34:
            defpackage.aqil.P(r6)
            arxm r6 = r5.n
            if (r6 != 0) goto L72
            arxm r6 = r5.o
            if (r6 != 0) goto L72
            afes r6 = r5.f
            if (r6 != 0) goto L49
            java.lang.String r6 = "encoder"
            defpackage.arro.b(r6)
            r6 = r4
        L49:
            r6.i()
            r5.g = r3
            r0.d = r5
            r0.e = r5
            r0.c = r3
            java.lang.Object r6 = r5.f(r0)
            if (r6 == r1) goto L71
            r0 = r5
            r1 = r0
        L5c:
            arxm r6 = (defpackage.arxm) r6
            r1.n = r6
            affm r6 = new affm
            r6.<init>(r0, r4)
            arwe r1 = r0.b
            r2 = 3
            arxm r6 = defpackage.arrn.J(r1, r4, r4, r6, r2)
            r0.o = r6
            arnb r6 = defpackage.arnb.a
            return r6
        L71:
            return r1
        L72:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "FileAudioSink cannot start while previous jobs are active."
            r6.<init>(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.affq.g(arpe):java.lang.Object");
    }

    public final boolean h() {
        if (this.f != null) {
            return true;
        }
        return false;
    }
}
