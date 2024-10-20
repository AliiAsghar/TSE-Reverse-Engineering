package defpackage;

import java.net.InetSocketAddress;
import java.util.concurrent.ScheduledExecutorService;
import org.chromium.net.CronetEngine;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aqyv extends aqsr {
    public ScheduledExecutorService a;
    public final CronetEngine b;
    public boolean d;
    public int e;
    public boolean f;
    public int g;
    private final ardy i;
    public final atoi h = arhu.i;
    public int c = 4194304;

    private aqyv(String str, int i, CronetEngine cronetEngine) {
        this.i = new ardy(InetSocketAddress.createUnresolved(str, i), arcb.d(str, i), new ariw(this, 1));
        this.b = cronetEngine;
    }

    public static aqyv j(String str, int i, CronetEngine cronetEngine) {
        cronetEngine.getClass();
        return new aqyv(str, i, cronetEngine);
    }

    @Override // defpackage.aqsr
    protected final aque b() {
        return this.i;
    }

    public final void k(int i) {
        this.d = true;
        this.e = i;
    }
}
