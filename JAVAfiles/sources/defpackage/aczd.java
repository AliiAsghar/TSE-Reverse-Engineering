package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.Locale;
import java.util.concurrent.ConcurrentMap;

/* compiled from: PG */
@Deprecated
/* loaded from: classes.dex */
public final class aczd extends aczc {
    private static final Object a = new Object();
    private static volatile aczd b;
    private final ConcurrentMap e;

    private aczd() {
        super("KillSwitch__");
        this.e = new ConcurrentHashMap();
    }

    public static acyz a(int i) {
        aczd c = c();
        String format = String.format(Locale.US, "bug_%s", Integer.valueOf(i));
        acyz acyzVar = (acyz) c.e.get(format);
        if (acyzVar == null) {
            acyzVar = c().i(format, true);
            acyz acyzVar2 = (acyz) c.e.putIfAbsent(format, acyzVar);
            if (acyzVar2 != null) {
                return acyzVar2;
            }
        }
        return acyzVar;
    }

    public static aczd c() {
        if (b == null) {
            d();
        }
        if (b != null) {
            return b;
        }
        throw new IllegalStateException("CsLibKillSwitch flags are not initialized!");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void d() {
        synchronized (a) {
            if (b == null) {
                b = new aczd();
                b.l();
            }
        }
    }

    @Override // defpackage.aczc
    protected final alog b() {
        return alog.n(this.e.values());
    }
}
