package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kgw {
    public static final Map a;
    private final armf b;

    static {
        Map m;
        if (qjh.r()) {
            m = aqjn.m(new armo("Screen_Effects_Olympics", 1), new armo("Screen_Effects_Pride", 2), new armo("Screen_Effects_Fireworks", 3), new armo("Screen_Effects_Fall", 4), new armo("Screen_Effects_Winter", 5), new armo("Screen_Effects_Spring", 6), new armo("Screen_Effects_Summer", 7), new armo("Screen_Effects_Celebrate", 8), new armo("Screen_Effects_Goodmorning", 9), new armo("Screen_Effects_Poop", 10), new armo("Screen_Effects_Anger", 11), new armo("Screen_Effects_Laugh", 12), new armo("Screen_Effects_Love", 13), new armo("Screen_Effects_Surprise", 14), new armo("Screen_Effects_Thumbsup", 15), new armo("Screen_Effects_Thumbsdown", 16), new armo("Screen_Effects_Sad", 17), new armo("Screen_Effects_Drumroll", 18), new armo("Screen_Effects_Applause", 19), new armo("Screen_Effects_Halloween", 20), new armo("Screen_Effects_Diwali", 21), new armo("Screen_Effects_Goodnight", 22), new armo("Screen_Effects_Thanksgiving", 23), new armo("Screen_Effects_Hannukah", 24), new armo("Screen_Effects_Christmas", 25), new armo("Screen_Effects_Easter", 26), new armo("Screen_Effects_Lunarnewyear", 27), new armo("Screen_Effects_Placeholderone", 97), new armo("Screen_Effects_Placeholdertwo", 98), new armo("Screen_Effects_Placeholderthree", 99));
        } else {
            m = aqjn.m(new armo("Screen_Effects_Olympics", 1), new armo("Screen_Effects_Pride", 2), new armo("Screen_Effects_Fireworks", 3), new armo("Screen_Effects_Fall", 4), new armo("Screen_Effects_Winter", 5), new armo("Screen_Effects_Spring", 6), new armo("Screen_Effects_Summer", 7), new armo("Screen_Effects_Celebrate", 8), new armo("Screen_Effects_Goodmorning", 9), new armo("Screen_Effects_Poop", 10), new armo("Screen_Effects_Anger", 11), new armo("Screen_Effects_Laugh", 12), new armo("Screen_Effects_Love", 13), new armo("Screen_Effects_Surprise", 14), new armo("Screen_Effects_Thumbsup", 15), new armo("Screen_Effects_Thumbsdown", 16), new armo("Screen_Effects_Sad", 17), new armo("Screen_Effects_Drumroll", 18), new armo("Screen_Effects_Applause", 19));
        }
        a = m;
    }

    public kgw(armf armfVar, arwe arweVar, armf armfVar2) {
        armfVar.getClass();
        arweVar.getClass();
        armfVar2.getClass();
        this.b = armfVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.mqz r7, defpackage.arpe r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.kgv
            if (r0 == 0) goto L13
            r0 = r8
            kgv r0 = (defpackage.kgv) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            kgv r0 = new kgv
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.b
            arpl r1 = defpackage.arpl.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.String r7 = r0.e
            java.lang.Object r0 = r0.a
            defpackage.aqil.P(r8)
            r5 = r8
            r8 = r7
            r7 = r0
            r0 = r5
            goto L6a
        L2f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L37:
            defpackage.aqil.P(r8)
            r7.getClass()
            r8 = r7
            com.google.android.apps.messaging.shared.datamodel.data.suggestions.SmartSuggestionData r8 = (com.google.android.apps.messaging.shared.datamodel.data.suggestions.SmartSuggestionData) r8
            aqcz r8 = r8.g()
            int r2 = r8.c
            r4 = 27
            if (r2 != r4) goto L4f
            java.lang.Object r8 = r8.d
            aqco r8 = (defpackage.aqco) r8
            goto L51
        L4f:
            aqco r8 = defpackage.aqco.a
        L51:
            java.lang.String r8 = r8.b
            r8.getClass()
            armf r2 = r6.b
            java.lang.Object r2 = r2.b()
            kgq r2 = (defpackage.kgq) r2
            r0.a = r7
            r0.e = r8
            r0.d = r3
            java.lang.Object r0 = r2.a(r8, r0)
            if (r0 == r1) goto L86
        L6a:
            apdz r0 = (defpackage.apdz) r0
            if (r0 != 0) goto L75
            kgm r7 = new kgm
            r8 = 0
            r7.<init>(r8)
            goto L85
        L75:
            kgm r1 = new kgm
            java.lang.String r2 = r7.b()
            com.google.android.apps.messaging.shared.datamodel.data.suggestions.SmartSuggestionData r7 = (com.google.android.apps.messaging.shared.datamodel.data.suggestions.SmartSuggestionData) r7
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType r7 = r7.r()
            r1.<init>(r2, r7, r0, r8)
            r7 = r1
        L85:
            return r7
        L86:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kgw.a(mqz, arpe):java.lang.Object");
    }
}
