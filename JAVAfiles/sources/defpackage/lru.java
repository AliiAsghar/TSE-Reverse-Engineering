package defpackage;

import android.util.LruCache;
import com.google.android.apps.messaging.privacy.settings.PrivacySettingsActivity;
import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.common.ParticipantColor;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.time.Duration;
import j$.time.Instant;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lru {
    public final Object a;
    public final Object b;
    public final Object c;

    public lru(agnq agnqVar, armf armfVar, armf armfVar2) {
        this.a = agnqVar;
        this.b = armfVar;
        this.c = armfVar2;
    }

    public static ParticipantColor g(ParticipantsTable.BindData bindData) {
        return new ParticipantColor(bindData.k(), bindData.h(), bindData.l());
    }

    public static void j(tap tapVar, ParticipantColor participantColor) {
        ParticipantColor participantColor2 = new ParticipantColor(tapVar.t, tapVar.s, tapVar.u);
        if (participantColor2.f(participantColor)) {
            participantColor2.d(participantColor);
            tapVar.i(participantColor2.a);
            tapVar.h(participantColor2.b);
            tapVar.s(participantColor2.c);
        }
    }

    private final int m(String str, int i) {
        if (i == 2) {
            return 3;
        }
        xze xzeVar = xca.a;
        if (msx.g(str)) {
            return 4;
        }
        if (((xca) this.b).l(str)) {
            return 2;
        }
        return 1;
    }

    public final void a(msh mshVar, psv psvVar) {
        mshVar.getClass();
        psvVar.getClass();
        Instant f = ((xnv) this.c).f();
        f.getClass();
        ((LruCache) this.a).put(mshVar, new lsd(psvVar, f));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x005d  */
    /* JADX WARN: Type inference failed for: r1v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v15, types: [armf, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(defpackage.amgl r7, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData r8, int r9) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lru.b(amgl, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /* JADX WARN: Type inference failed for: r7v4, types: [arpi, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(defpackage.arpe r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.mdf
            if (r0 == 0) goto L13
            r0 = r7
            mdf r0 = (defpackage.mdf) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            mdf r0 = new mdf
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.aqil.P(r7)     // Catch: java.lang.Exception -> L46
            goto L45
        L27:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L2f:
            defpackage.aqil.P(r7)
            java.lang.Object r7 = r6.a     // Catch: java.lang.Exception -> L46
            lgp r2 = new lgp     // Catch: java.lang.Exception -> L46
            r4 = 0
            r5 = 11
            r2.<init>(r6, r4, r5)     // Catch: java.lang.Exception -> L46
            r0.b = r3     // Catch: java.lang.Exception -> L46
            java.lang.Object r7 = defpackage.arro.q(r7, r2, r0)     // Catch: java.lang.Exception -> L46
            if (r7 != r1) goto L45
            return r1
        L45:
            return r7
        L46:
            r7 = 0
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lru.c(arpe):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [armf, java.lang.Object] */
    public final /* bridge */ /* synthetic */ ncq d(MessageId messageId) {
        arwe arweVar = (arwe) this.b.b();
        arweVar.getClass();
        ujg ujgVar = (ujg) this.c.b();
        ujgVar.getClass();
        wfh wfhVar = (wfh) this.a.b();
        wfhVar.getClass();
        return new mzb(arweVar, ujgVar, wfhVar, messageId);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [armf, java.lang.Object] */
    public final /* bridge */ /* synthetic */ ncq e(MessageIdType messageIdType) {
        xpi xpiVar = (xpi) this.b.b();
        xpiVar.getClass();
        wfh wfhVar = (wfh) this.a.b();
        wfhVar.getClass();
        ExecutorService executorService = (ExecutorService) this.c.b();
        executorService.getClass();
        messageIdType.getClass();
        return new mza(xpiVar, wfhVar, executorService, messageIdType);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [armf, java.lang.Object] */
    public final yjt f(String str) {
        if (str != null) {
            yjt yjtVar = null;
            if (str.length() != 2) {
                str = null;
            }
            if (str != null) {
                yjr g = ((yjy) this.c.b()).g();
                String upperCase = str.toUpperCase(Locale.ROOT);
                upperCase.getClass();
                yjt a = g.a(upperCase);
                if (true != a.a()) {
                    yjtVar = a;
                }
                if (yjtVar != null) {
                    return yjtVar;
                }
            }
        }
        return new yjt(0);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v5, types: [armf, java.lang.Object] */
    public final void h(tap tapVar) {
        if (tapVar.I != -1 && !ycg.a().contains(Long.valueOf(tapVar.I))) {
            tapVar.l(-2L);
        } else {
            tapVar.l(-2L);
            tapVar.C(null);
            tapVar.k(null);
            tapVar.V(0);
            tapVar.p(-1L);
            if (((Boolean) this.c.b()).booleanValue()) {
                tapVar.getClass();
                if (tapVar.Q != vox.PROFILE_PEOPLE_SHARING_SOURCE) {
                    tapVar.M(null);
                    tapVar.J(vox.PROFILE_UNSPECIFIED_SOURCE);
                }
                tapVar.u(null);
                tapVar.t(null);
                tapVar.F(vox.PROFILE_UNSPECIFIED_SOURCE);
            } else {
                tapVar.u(null);
                tapVar.t(null);
                tapVar.M(null);
            }
        }
        i(tapVar);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [armf, java.lang.Object] */
    public final void i(tap tapVar) {
        xyl.l(tapVar);
        if (g(tapVar.a()).a == 2) {
            tapVar.a();
            return;
        }
        j(tapVar, new ParticipantColor(0, ((yje) this.a.b()).b(yyb.bz(tapVar.f)), 0));
        tapVar.a();
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [arwe, java.lang.Object] */
    public final akul k(MessageCoreData messageCoreData, List list) {
        akul c;
        list.getClass();
        c = qjh.c(this.b, arpj.a, arwf.a, new qka(this, messageCoreData, list, (arpe) null, 4));
        return c;
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [agnq, java.lang.Object] */
    public final void l(ConversationIdType conversationIdType, ConversationIdType conversationIdType2, tqc tqcVar) {
        xyl.h();
        this.a.e("ConversationMergeDatabaseOperations#mergeMessagesInConversations", new eex((Object) this, (Object) conversationIdType2, (Object) conversationIdType, (Enum) tqcVar, 17));
    }

    public lru(armf armfVar, agnq agnqVar, armf armfVar2) {
        this.b = armfVar;
        this.a = agnqVar;
        this.c = armfVar2;
    }

    public lru(armf armfVar, armf armfVar2, armf armfVar3, short[] sArr) {
        this.a = armfVar;
        this.b = armfVar2;
        this.c = armfVar3;
    }

    public lru(PrivacySettingsActivity privacySettingsActivity, trz trzVar, iew iewVar) {
        this.a = privacySettingsActivity;
        this.b = trzVar;
        this.c = iewVar;
    }

    public lru(Object obj, Object obj2, Object obj3) {
        this.c = obj;
        this.a = obj2;
        this.b = obj3;
    }

    public lru(LruCache lruCache, xnv xnvVar) {
        lruCache.getClass();
        xnvVar.getClass();
        this.a = lruCache;
        this.c = xnvVar;
        this.b = uuh.f(uuh.b, "single_reg_cached_capability_expiration_seconds", 60L);
    }

    public lru(armf armfVar, armf armfVar2) {
        armfVar.getClass();
        armfVar2.getClass();
        this.c = armfVar;
        this.b = armfVar2;
        utz f = uuh.f(uuh.b, "country_code_cache_expiry_millis", 1000L);
        this.a = f;
        rov rovVar = new rov(this, 17);
        Object e = f.e();
        e.getClass();
        albo.E(rovVar, Duration.ofMillis(((Number) e).longValue()));
    }

    public lru(armf armfVar, armf armfVar2, armf armfVar3, byte[] bArr, char[] cArr) {
        armfVar.getClass();
        armfVar2.getClass();
        armfVar3.getClass();
        this.b = armfVar;
        this.a = armfVar2;
        this.c = armfVar3;
    }

    public lru(armf armfVar, arpi arpiVar, arwe arweVar) {
        armfVar.getClass();
        arpiVar.getClass();
        arweVar.getClass();
        this.c = armfVar;
        this.a = arpiVar;
        this.b = arweVar;
    }

    public lru(arwe arweVar, arpi arpiVar, acjj acjjVar) {
        arweVar.getClass();
        arpiVar.getClass();
        acjjVar.getClass();
        this.c = arweVar;
        this.a = arpiVar;
        this.b = acjjVar;
    }

    public lru(armf armfVar, armf armfVar2, armf armfVar3, byte[] bArr, byte[] bArr2) {
        armfVar.getClass();
        this.c = armfVar;
        armfVar2.getClass();
        this.b = armfVar2;
        armfVar3.getClass();
        this.a = armfVar3;
    }

    public lru(armf armfVar, armf armfVar2, armf armfVar3, char[] cArr) {
        armfVar.getClass();
        this.b = armfVar;
        armfVar2.getClass();
        this.a = armfVar2;
        armfVar3.getClass();
        this.c = armfVar3;
    }

    public lru(armf armfVar, armf armfVar2, armf armfVar3) {
        armfVar.getClass();
        this.b = armfVar;
        armfVar2.getClass();
        this.c = armfVar2;
        armfVar3.getClass();
        this.a = armfVar3;
    }
}
