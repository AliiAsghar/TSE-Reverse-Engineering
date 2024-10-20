package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kgq {
    private static final Map a;
    private static final alvi b;
    private final armf c;
    private final arwe d;
    private Map e;
    private final arxm f;

    static {
        Map m;
        if (qjh.r()) {
            m = aqjn.m(new armo("Screen_Effects_Olympics", "olympics_effect.binarypb"), new armo("Screen_Effects_Pride", "pride_effect.binarypb"), new armo("Screen_Effects_Fireworks", "fireworks_effect.binarypb"), new armo("Screen_Effects_Fall", "fall_effect.binarypb"), new armo("Screen_Effects_Winter", "winter_effect.binarypb"), new armo("Screen_Effects_Spring", "spring_effect.binarypb"), new armo("Screen_Effects_Summer", "summer_effect.binarypb"), new armo("Screen_Effects_Celebrate", "celebrate_effect.binarypb"), new armo("Screen_Effects_Goodmorning", "good_morning_effect.binarypb"), new armo("Screen_Effects_Poop", "poop_effect.binarypb"), new armo("Screen_Effects_Anger", "anger_effect.binarypb"), new armo("Screen_Effects_Laugh", "laugh_effect.binarypb"), new armo("Screen_Effects_Love", "love_effect.binarypb"), new armo("Screen_Effects_Surprise", "surprise_effect.binarypb"), new armo("Screen_Effects_Thumbsup", "thumbs_up_effect.binarypb"), new armo("Screen_Effects_Thumbsdown", "thumbs_down_effect.binarypb"), new armo("Screen_Effects_Sad", "sad_effect.binarypb"), new armo("Screen_Effects_Drumroll", "drumroll_effect.binarypb"), new armo("Screen_Effects_Applause", "applause_effect.binarypb"), new armo("Screen_Effects_Halloween", "halloween_effect.binarypb"), new armo("Screen_Effects_Diwali", "diwali_effect.binarypb"), new armo("Screen_Effects_Goodnight", "good_night_effect.binarypb"), new armo("Screen_Effects_Thanksgiving", "thanksgiving_effect.binarypb"), new armo("Screen_Effects_Hannukah", "hannukah_effect.binarypb"), new armo("Screen_Effects_Christmas", "christmas_effect.binarypb"), new armo("Screen_Effects_Easter", "easter_effect.binarypb"), new armo("Screen_Effects_Lunarnewyear", "lunar_new_year_effect.binarypb"), new armo("Screen_Effects_Placeholderone", "placeholder_one_effect.binarypb"), new armo("Screen_Effects_Placeholdertwo", "placeholder_two_effect.binarypb"), new armo("Screen_Effects_Placeholderthree", "placeholder_three_effect.binarypb"));
        } else {
            m = aqjn.m(new armo("Screen_Effects_Olympics", "olympics_effect.binarypb"), new armo("Screen_Effects_Pride", "pride_effect.binarypb"), new armo("Screen_Effects_Fireworks", "fireworks_effect.binarypb"), new armo("Screen_Effects_Fall", "fall_effect.binarypb"), new armo("Screen_Effects_Winter", "winter_effect.binarypb"), new armo("Screen_Effects_Spring", "spring_effect.binarypb"), new armo("Screen_Effects_Summer", "summer_effect.binarypb"), new armo("Screen_Effects_Celebrate", "celebrate_effect.binarypb"), new armo("Screen_Effects_Goodmorning", "good_morning_effect.binarypb"), new armo("Screen_Effects_Poop", "poop_effect.binarypb"), new armo("Screen_Effects_Anger", "anger_effect.binarypb"), new armo("Screen_Effects_Laugh", "laugh_effect.binarypb"), new armo("Screen_Effects_Love", "love_effect.binarypb"), new armo("Screen_Effects_Surprise", "surprise_effect.binarypb"), new armo("Screen_Effects_Thumbsup", "thumbs_up_effect.binarypb"), new armo("Screen_Effects_Thumbsdown", "thumbs_down_effect.binarypb"), new armo("Screen_Effects_Sad", "sad_effect.binarypb"), new armo("Screen_Effects_Drumroll", "drumroll_effect.binarypb"), new armo("Screen_Effects_Applause", "applause_effect.binarypb"));
        }
        a = m;
        b = alvi.m("com/google/android/apps/messaging/conversation2/messagelist/screeneffects/ScreenEffectAnimationsRepository");
    }

    public kgq(armf armfVar, arwe arweVar) {
        armfVar.getClass();
        arweVar.getClass();
        this.c = armfVar;
        this.d = arweVar;
        this.f = qjh.l(arweVar, null, new eig(this, (arpe) null, 19), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.String r6, defpackage.arpe r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.kgn
            if (r0 == 0) goto L13
            r0 = r7
            kgn r0 = (defpackage.kgn) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            kgn r0 = new kgn
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            java.lang.String r6 = r0.e
            kgq r0 = r0.d
            defpackage.aqil.P(r7)
            goto L5d
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            defpackage.aqil.P(r7)
            arxm r7 = r5.f
            java.lang.String r2 = "preloadJob"
            if (r7 != 0) goto L41
            defpackage.arro.b(r2)
            r7 = r4
        L41:
            boolean r7 = r7.z()
            if (r7 != 0) goto L5c
            arxm r7 = r5.f
            if (r7 != 0) goto L4f
            defpackage.arro.b(r2)
            r7 = r4
        L4f:
            r0.d = r5
            r0.e = r6
            r0.c = r3
            java.lang.Object r7 = r7.q(r0)
            if (r7 != r1) goto L5c
            return r1
        L5c:
            r0 = r5
        L5d:
            java.util.Map r7 = defpackage.kgq.a
            boolean r7 = r7.containsKey(r6)
            if (r7 == 0) goto L70
            java.util.Map r7 = r0.e
            if (r7 == 0) goto L70
            java.lang.Object r6 = r7.get(r6)
            apdz r6 = (defpackage.apdz) r6
            return r6
        L70:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kgq.a(java.lang.String, arpe):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.String r8, defpackage.arpe r9) {
        /*
            Method dump skipped, instructions count: 249
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kgq.b(java.lang.String, arpe):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0083 -> B:10:0x0084). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(defpackage.arpe r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof defpackage.kgp
            if (r0 == 0) goto L13
            r0 = r10
            kgp r0 = (defpackage.kgp) r0
            int r1 = r0.g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.g = r1
            goto L18
        L13:
            kgp r0 = new kgp
            r0.<init>(r9, r10)
        L18:
            java.lang.Object r10 = r0.e
            arpl r1 = defpackage.arpl.a
            int r2 = r0.g
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r2 = r0.d
            java.lang.Object r4 = r0.c
            kgq r5 = r0.i
            java.lang.Object r6 = r0.b
            java.lang.Object r7 = r0.a
            kgq r8 = r0.h
            defpackage.aqil.P(r10)
            goto L84
        L33:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L3b:
            defpackage.aqil.P(r10)
            java.util.Map r10 = defpackage.kgq.a
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            int r4 = r10.size()
            int r4 = defpackage.aqjn.i(r4)
            r2.<init>(r4)
            java.util.Set r10 = r10.entrySet()
            java.util.Iterator r10 = r10.iterator()
            r5 = r9
            r8 = r5
            r6 = r10
            r4 = r2
        L59:
            boolean r10 = r6.hasNext()
            if (r10 == 0) goto L8c
            java.lang.Object r10 = r6.next()
            java.util.Map$Entry r10 = (java.util.Map.Entry) r10
            java.lang.Object r2 = r10.getKey()
            java.lang.Object r10 = r10.getValue()
            java.lang.String r10 = (java.lang.String) r10
            r0.h = r8
            r0.a = r4
            r0.b = r6
            r0.i = r5
            r0.c = r4
            r0.d = r2
            r0.g = r3
            java.lang.Object r10 = r8.b(r10, r0)
            if (r10 == r1) goto L8b
            r7 = r4
        L84:
            apdz r10 = (defpackage.apdz) r10
            r4.put(r2, r10)
            r4 = r7
            goto L59
        L8b:
            return r1
        L8c:
            r5.e = r4
            arnb r10 = defpackage.arnb.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kgq.c(arpe):java.lang.Object");
    }
}
