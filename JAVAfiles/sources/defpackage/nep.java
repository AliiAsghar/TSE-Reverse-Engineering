package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class nep implements nfa {
    public static final alwo a = alwo.o("BugleRecipients");
    private final armf b;

    public nep(armf armfVar) {
        this.b = armfVar;
    }

    public static String b(msh mshVar) {
        return yyb.bi(mshVar).toString();
    }

    @Override // defpackage.nfa
    public final akul a(msh mshVar) {
        if (mshVar.e().isEmpty()) {
            alwl alwlVar = (alwl) a.g();
            alwlVar.X(ydl.C, b(mshVar));
            ((alwl) alwlVar.h("com/google/android/apps/messaging/shared/api/messaging/recipient/rcs/ChatApiRcsRecipientOnlineProvider", "isOnline", 38, "ChatApiRcsRecipientOnlineProvider.java")).q("Recipient Offline: No RCS Identifier.");
            return aktp.ag(false);
        }
        return ((pvk) ((Optional) this.b.b()).get()).c((qei) mshVar.e().get()).h(new ndd(mshVar, 4), andi.a).e(Exception.class, new ndd(mshVar, 5), andi.a);
    }
}
