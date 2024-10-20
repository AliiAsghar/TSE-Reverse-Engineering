package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import j$.time.Duration;
import j$.util.Optional;
import j$.util.concurrent.ConcurrentHashMap;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class wet implements weq, wev, wew {
    public final wep f;
    public final nfx g;
    private final anen i;
    private final ConcurrentHashMap j = new ConcurrentHashMap();
    public static final alvi a = alvi.m("com/google/android/apps/messaging/shared/rcs/performance/PhoneChannelAwaker");
    public static final utz b = uuh.b("enable_prewarm_on_typing", true);
    public static final utz c = uuh.b("enable_prewarm_on_send_button_pressed", false);
    private static final utz h = uuh.a("prewarm_on_typing_max_frequency_ms", 65000);
    static final utz d = uuh.a("send_button_prewarm_tickle_priority", 5);
    public static final utz e = uuh.a("typing_prewarm_tickle_priority", 10);

    public wet(wep wepVar, anen anenVar, nfx nfxVar) {
        this.f = wepVar;
        this.i = anenVar;
        this.g = nfxVar;
    }

    public static int f(long j) {
        if (j == 10) {
            return 2;
        }
        return 1;
    }

    public static final boolean g(msh mshVar) {
        if (mshVar.e().isEmpty()) {
            ((alvg) ((alvg) a.d()).h("com/google/android/apps/messaging/shared/rcs/performance/PhoneChannelAwaker", "isValidPreWarmDestination", 270, "PhoneChannelAwaker.java")).q("Not prewarming invalid chat endpoint");
            return false;
        }
        if (mshVar.A()) {
            ((alvg) ((alvg) a.d()).h("com/google/android/apps/messaging/shared/rcs/performance/PhoneChannelAwaker", "isValidPreWarmDestination", 275, "PhoneChannelAwaker.java")).q("Not prewarming bot conversation");
            return false;
        }
        return true;
    }

    private final akul h(rrl rrlVar) {
        SelfIdentityId selfIdentityId = rrlVar.k;
        if (selfIdentityId == null) {
            return aktp.ag(Optional.empty());
        }
        return aktp.aj(new uvj(this, selfIdentityId, 12, null), this.i);
    }

    @Override // defpackage.weq
    public final void a(rrl rrlVar, MessageCoreData messageCoreData) {
        if (!((Boolean) c.e()).booleanValue()) {
            return;
        }
        if (!messageCoreData.cI()) {
            ((alvg) ((alvg) a.d()).h("com/google/android/apps/messaging/shared/rcs/performance/PhoneChannelAwaker", "onMessageSending", 149, "PhoneChannelAwaker.java")).q("Not prewarming - not an RCS message");
        } else if (messageCoreData.cJ()) {
            ((alvg) ((alvg) a.d()).h("com/google/android/apps/messaging/shared/rcs/performance/PhoneChannelAwaker", "onMessageSending", 159, "PhoneChannelAwaker.java")).q("Not prewarming - RCS file transfer");
        } else {
            qiu.h(h(rrlVar).h(new vqv(this, rrlVar, 13), this.i));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x005a  */
    /* JADX WARN: Type inference failed for: r7v4, types: [msh, java.lang.Object] */
    @Override // defpackage.weq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(defpackage.rrl r6, defpackage.wzk r7) {
        /*
            r5 = this;
            utz r0 = defpackage.wet.b
            java.lang.Object r0 = r0.e()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L6e
            wzk r0 = defpackage.wzk.ACTIVE
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L6e
            ikl r7 = r6.b
            j$.util.Optional r0 = r7.k
            boolean r0 = r0.isEmpty()
            r1 = 0
            if (r0 == 0) goto L23
        L21:
            r7 = r1
            goto L57
        L23:
            boolean r0 = r7.c()
            if (r0 != 0) goto L2a
            goto L21
        L2a:
            j$.util.Optional r7 = r7.k
            java.lang.Object r7 = r7.get()
            r0 = 1
            java.lang.String r7 = r7.o(r0)
            boolean r0 = defpackage.albo.ah(r7)
            if (r0 == 0) goto L57
            alvi r7 = defpackage.wet.a
            alvw r7 = r7.i()
            alvg r7 = (defpackage.alvg) r7
            java.lang.String r0 = "getConversationComparableDestination"
            r2 = 227(0xe3, float:3.18E-43)
            java.lang.String r3 = "com/google/android/apps/messaging/shared/rcs/performance/PhoneChannelAwaker"
            java.lang.String r4 = "PhoneChannelAwaker.java"
            alvw r7 = r7.h(r3, r0, r2, r4)
            alvg r7 = (defpackage.alvg) r7
            java.lang.String r0 = "1:1 RCS conversation does not have valid comparable destination"
            r7.q(r0)
            goto L21
        L57:
            if (r7 != 0) goto L5a
            goto L6e
        L5a:
            akul r6 = r5.h(r6)
            vqv r0 = new vqv
            r2 = 14
            r0.<init>(r5, r7, r2, r1)
            anen r7 = r5.i
            akul r6 = r6.h(r0, r7)
            defpackage.qiu.h(r6)
        L6e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wet.b(rrl, wzk):void");
    }

    @Override // defpackage.wew
    public final void c(nfw nfwVar, msh mshVar) {
        if (((Boolean) b.e()).booleanValue() && g(mshVar)) {
            e(nfwVar, mshVar.n());
        }
    }

    public final void d(nfw nfwVar, String str) {
        this.f.a(nfwVar).a(str, f(((Long) d.e()).longValue()));
    }

    public final void e(nfw nfwVar, String str) {
        this.j.putIfAbsent(str, albo.E(new tdw(this, nfwVar, str, 12, (char[]) null), Duration.ofMillis(((Long) h.e()).longValue())));
        ((alhr) this.j.get(str)).get();
    }
}
