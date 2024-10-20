package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ypw {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/shared/util/spam/common/SpamRejectionHandler");
    public static final utz b = uuh.i(uuh.b, "cs_messages_from_contact", false);
    public static final utz c = uuh.e(uuh.b, "cs_conversation_age_threshold", -1);
    public static final utz d = uuh.i(uuh.b, "enable_logging_spam_protection_rejection_reason", true);
    public static final utz e = uuh.i(uuh.b, "enable_logging_allowlisted_rejection_reason", true);
    public final armf f;
    private final armf g;

    public ypw(armf armfVar, armf armfVar2) {
        armfVar.getClass();
        armfVar2.getClass();
        this.f = armfVar;
        this.g = armfVar2;
    }

    public static final void b(String str) {
        ((alvg) a.g().h("com/google/android/apps/messaging/shared/util/spam/common/SpamRejectionHandler", "logToLogcat", 125, "SpamRejectionHandler.kt")).q(str);
    }

    public static /* synthetic */ Object c(ypw ypwVar, you youVar, ypi ypiVar, amzf amzfVar, Integer num, arpe arpeVar, int i) {
        ypi ypiVar2;
        amzf amzfVar2;
        Integer num2;
        boolean z;
        if ((i & 2) != 0) {
            ypiVar2 = null;
        } else {
            ypiVar2 = ypiVar;
        }
        if ((i & 4) != 0) {
            amzfVar2 = null;
        } else {
            amzfVar2 = amzfVar;
        }
        if ((i & 8) != 0) {
            num2 = null;
        } else {
            num2 = num;
        }
        if ((i & 32) != 0) {
            z = true;
        } else {
            z = false;
        }
        return ypwVar.a(youVar, ypiVar2, amzfVar2, num2, null, z, arpeVar);
    }

    public final Object a(you youVar, ypi ypiVar, amzf amzfVar, Integer num, Integer num2, boolean z, arpe arpeVar) {
        if (z) {
            if (ypiVar != null) {
                if (amzfVar == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
            } else {
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        Object b2 = this.g.b();
        b2.getClass();
        return arro.q((arpi) b2, new ypv(youVar, this, num2, z, ypiVar, amzfVar, num, null), arpeVar);
    }
}
