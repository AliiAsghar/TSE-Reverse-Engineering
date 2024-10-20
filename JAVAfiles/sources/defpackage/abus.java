package defpackage;

import com.google.android.gms.common.internal.RootTelemetryConfiguration;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abus {
    private static abus b;
    private static final RootTelemetryConfiguration c = new RootTelemetryConfiguration(0, false, false, 0, 0);
    public RootTelemetryConfiguration a;

    private abus() {
    }

    public static synchronized abus a() {
        abus abusVar;
        synchronized (abus.class) {
            if (b == null) {
                b = new abus();
            }
            abusVar = b;
        }
        return abusVar;
    }

    public final synchronized void b(RootTelemetryConfiguration rootTelemetryConfiguration) {
        if (rootTelemetryConfiguration == null) {
            this.a = c;
            return;
        }
        RootTelemetryConfiguration rootTelemetryConfiguration2 = this.a;
        if (rootTelemetryConfiguration2 != null) {
            if (rootTelemetryConfiguration2.a >= rootTelemetryConfiguration.a) {
                return;
            }
        }
        this.a = rootTelemetryConfiguration;
    }
}
