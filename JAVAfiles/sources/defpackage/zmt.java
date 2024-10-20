package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zmt {
    public static final akfc a = new akgc("SwipeActionSettings");
    public static final akfc b = new akgc("SwipeLeftAction");
    public static final akfc c = new akgc("SwipeRightAction");
    public final AtomicBoolean d = new AtomicBoolean(false);
    public final armf e;
    private final armf f;

    public zmt(armf armfVar, armf armfVar2) {
        this.e = armfVar;
        this.f = armfVar2;
    }

    public static String a(Context context, zmp zmpVar) {
        int ordinal = zmpVar.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        return context.getString(R.string.action_mark_as_read_or_unread);
                    }
                    throw new AssertionError("Encountered unknown swipe action value.");
                }
                return context.getString(R.string.action_delete);
            }
            return context.getString(R.string.action_archive);
        }
        return context.getString(R.string.action_off);
    }

    public static final zmp[] d() {
        return new zmp[]{zmp.ARCHIVE, zmp.DELETE, zmp.MARK_AS_READ_OR_UNREAD, zmp.NONE};
    }

    public final void b() {
        ((ahiy) this.f.b()).q(aktp.ag(null), a);
    }

    public final void c(akfc akfcVar) {
        ((ahiy) this.f.b()).q(aktp.ag(null), akfcVar);
        b();
    }
}
