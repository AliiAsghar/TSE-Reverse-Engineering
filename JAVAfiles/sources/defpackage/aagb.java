package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.suggestions.SmartSuggestionData;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.SuggestionData;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.impl.SmartSuggestionItemSuggestionData;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aagb implements xdc {
    public static final utz a = uuh.f(uuh.b, "p2p_share_recent_image_suggestion_expiration_age_millis", TimeUnit.MINUTES.toMillis(2));
    public final armf b;
    public final yjf c;
    public final xnv d;
    public final xze e;
    private final armf f;

    public aagb(@nwv armf armfVar, apwt apwtVar, armf armfVar2, armf armfVar3, armf armfVar4, yjf yjfVar, xnv xnvVar) {
        armfVar.getClass();
        apwtVar.getClass();
        armfVar2.getClass();
        armfVar3.getClass();
        armfVar4.getClass();
        yjfVar.getClass();
        xnvVar.getClass();
        this.b = armfVar3;
        this.f = armfVar4;
        this.c = yjfVar;
        this.d = xnvVar;
        this.e = xze.g("Bugle", "SmartSuggestionRule");
    }

    @Override // defpackage.xdc
    public final boolean a(SuggestionData suggestionData) {
        suggestionData.getClass();
        return suggestionData instanceof SmartSuggestionData;
    }

    @Override // defpackage.xdc
    public final Object b(SuggestionData suggestionData, arpe arpeVar) {
        if (suggestionData instanceof SmartSuggestionItemSuggestionData) {
            return c(arpeVar);
        }
        this.e.m("Non smart suggestion passed to SmartSuggestionRule");
        throw new IllegalStateException("Non smart suggestion passed to SmartSuggestionRule");
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(defpackage.arpe r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.aaga
            if (r0 == 0) goto L13
            r0 = r6
            aaga r0 = (defpackage.aaga) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            aaga r0 = new aaga
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            int r1 = r0.c
            r2 = 0
            if (r1 == 0) goto L7d
            r3 = 1
            r4 = 0
            if (r1 == r3) goto L60
            r2 = 2
            r3 = 3
            if (r1 == r2) goto L44
            if (r1 == r3) goto L38
            r0 = 4
            if (r1 != r0) goto L30
            defpackage.aqil.P(r6)
            return r6
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L38:
            defpackage.aqil.P(r6)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L5e
            throw r4
        L44:
            defpackage.aqil.P(r6)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 != 0) goto L5f
            aqbc r6 = defpackage.ryj.b(r4)
            java.util.Set r1 = defpackage.ryj.a
            boolean r6 = r1.contains(r6)
            if (r6 != 0) goto L5e
            r0.c = r3
            throw r4
        L5e:
            throw r4
        L5f:
            throw r4
        L60:
            defpackage.aqil.P(r6)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 != 0) goto L7c
            aqbc r6 = defpackage.ryj.b(r4)
            java.util.Set r0 = defpackage.ryj.b
            boolean r6 = r0.contains(r6)
            if (r6 != 0) goto L7c
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r2)
            return r6
        L7c:
            throw r4
        L7d:
            defpackage.aqil.P(r6)
            armf r6 = r5.f
            java.lang.Object r6 = r6.b()
            yyb r6 = (defpackage.yyb) r6
            xze r6 = r5.e
            java.lang.String r0 = "Skipping smart suggestion (feature disabled)"
            r6.l(r0)
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r2)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aagb.c(arpe):java.lang.Object");
    }
}
