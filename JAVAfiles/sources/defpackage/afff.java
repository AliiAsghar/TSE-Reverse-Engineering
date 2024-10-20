package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afff {
    public static final alvi a = alvi.m("com/google/android/libraries/compose/audio/recorder/AudioRecorder");
    public final affg b;
    public affq c;
    public afft d;
    public final adec e;
    public agcp f;
    public final addp g;

    public afff(addp addpVar, adec adecVar, affg affgVar) {
        this.g = addpVar;
        this.e = adecVar;
        this.b = affgVar;
    }

    public final Object a(arpe arpeVar) {
        alvw g = a.g();
        g.X(alwp.a, "HugoAudio");
        ((alvg) g.h("com/google/android/libraries/compose/audio/recorder/AudioRecorder", "release", 101, "AudioRecorder.kt")).t("Releasing AudioRecorder for %s", this.b.a);
        agcp agcpVar = this.f;
        if (agcpVar == null) {
            arro.b("audioGraph");
            agcpVar = null;
        }
        Object f = agcpVar.f(arpeVar);
        if (f == arpl.a) {
            return f;
        }
        return arnb.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0096 A[PHI: r10
  0x0096: PHI (r10v21 java.lang.Object) = (r10v18 java.lang.Object), (r10v1 java.lang.Object) binds: [B:20:0x0093, B:10:0x0027] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0095 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(defpackage.arpe r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof defpackage.affe
            if (r0 == 0) goto L13
            r0 = r10
            affe r0 = (defpackage.affe) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            affe r0 = new affe
            r0.<init>(r9, r10)
        L18:
            java.lang.Object r10 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L39
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2b
            defpackage.aqil.P(r10)
            goto L96
        L2b:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L33:
            afff r2 = r0.d
            defpackage.aqil.P(r10)
            goto L7f
        L39:
            defpackage.aqil.P(r10)
            alvi r10 = defpackage.afff.a
            alvw r10 = r10.g()
            alvz r2 = defpackage.alwp.a
            java.lang.String r6 = "HugoAudio"
            r10.X(r2, r6)
            java.lang.String r2 = "stop"
            r6 = 94
            java.lang.String r7 = "com/google/android/libraries/compose/audio/recorder/AudioRecorder"
            java.lang.String r8 = "AudioRecorder.kt"
            alvw r10 = r10.h(r7, r2, r6, r8)
            alvg r10 = (defpackage.alvg) r10
            affg r2 = r9.b
            java.lang.String r6 = "Stopping AudioRecorder for %s"
            android.net.Uri r2 = r2.a
            r10.t(r6, r2)
            agcp r10 = r9.f
            if (r10 != 0) goto L6a
            java.lang.String r10 = "audioGraph"
            defpackage.arro.b(r10)
            r10 = r5
        L6a:
            r0.d = r9
            r0.c = r4
            java.lang.Object r10 = r10.c
            afft r10 = (defpackage.afft) r10
            java.lang.Object r10 = r10.e(r0)
            arpl r2 = defpackage.arpl.a
            if (r10 == r2) goto L7c
            arnb r10 = defpackage.arnb.a
        L7c:
            if (r10 == r1) goto L97
            r2 = r9
        L7f:
            affq r10 = r2.c
            if (r10 != 0) goto L89
            java.lang.String r10 = "fileAudioSink"
            defpackage.arro.b(r10)
            r10 = r5
        L89:
            r0.d = r5
            r0.c = r3
            arvv r10 = r10.j
            java.lang.Object r10 = r10.hk(r0)
            if (r10 != r1) goto L96
            return r1
        L96:
            return r10
        L97:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afff.b(arpe):java.lang.Object");
    }
}
