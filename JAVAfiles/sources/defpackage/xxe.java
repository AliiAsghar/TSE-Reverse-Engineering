package defpackage;

import android.content.Context;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xxe {
    public static volatile boolean b;
    static boolean c;
    public final Context d;
    public final anen e;
    public final anen f;
    private final armf h;
    private final armf i;
    public static final alwo a = alwo.o("BugleBlock");
    private static final Lock g = new ReentrantLock();

    public xxe(Context context, armf armfVar, armf armfVar2, anen anenVar, anen anenVar2) {
        this.d = context;
        this.h = armfVar;
        this.i = armfVar2;
        this.e = anenVar;
        this.f = anenVar2;
    }

    public final void a(boolean z) {
        Lock lock = g;
        lock.lock();
        try {
            if (b) {
                if (!z) {
                    z = false;
                }
                lock.unlock();
            }
            ((ykw) this.h.b()).h("app_already_migrated_blocked_contacts", z);
            c = z;
            lock.unlock();
        } catch (Throwable th) {
            g.unlock();
            throw th;
        }
    }

    public final boolean b() {
        boolean d = ((yjv) this.i.b()).d();
        boolean g2 = yhx.g(this.d);
        boolean z = !g2;
        boolean z2 = false;
        if (d && !g2) {
            z2 = true;
        }
        if (!z2) {
            ((alwl) ((alwl) a.g()).h("com/google/android/apps/messaging/shared/util/block/BlockedParticipantsUtil", "canAttemptToQuerySystemBlockList", 207, "BlockedParticipantsUtil.java")).I("BlockedParticipantsUtil#isDefaultAppAndPrimaryUser isDefaultSmsApp: %b | isPrimaryUser: %b", d, z);
        }
        return z2;
    }

    public final boolean c() {
        boolean z;
        Lock lock = g;
        lock.lock();
        try {
            if (c) {
                ((alwl) ((alwl) a.g()).h("com/google/android/apps/messaging/shared/util/block/BlockedParticipantsUtil", "haveMigratedContacts", 161, "BlockedParticipantsUtil.java")).q("BlockedParticipantsUtil#shouldUseSystemBlockedContacts: blocked contacts already migrated");
                z = true;
            } else {
                c = ((ykw) this.h.b()).q("app_already_migrated_blocked_contacts", false);
                ((alwl) ((alwl) a.g()).h("com/google/android/apps/messaging/shared/util/block/BlockedParticipantsUtil", "haveMigratedContacts", 172, "BlockedParticipantsUtil.java")).t("BlockedParticipantsUtil#shouldUseSystemBlockedContacts: check haveMigratedContacts from prefs: %b", Boolean.valueOf(c));
                z = c;
            }
            lock.unlock();
            return z;
        } catch (Throwable th) {
            g.unlock();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean d() {
        if (!b()) {
            return false;
        }
        return c();
    }
}
