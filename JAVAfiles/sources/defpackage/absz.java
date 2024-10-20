package defpackage;

import android.os.Handler;
import android.os.SystemClock;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.ConnectionInfo;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class absz implements acik {
    private final abso a;
    private final int b;
    private final abrv c;
    private final long d;
    private final long e;

    public absz(abso absoVar, int i, abrv abrvVar, long j, long j2) {
        this.a = absoVar;
        this.b = i;
        this.c = abrvVar;
        this.d = j;
        this.e = j2;
    }

    public static ConnectionTelemetryConfiguration b(absl abslVar, BaseGmsClient baseGmsClient, int i) {
        ConnectionTelemetryConfiguration connectionTelemetryConfiguration;
        int[] iArr;
        int[] iArr2;
        ConnectionInfo connectionInfo = baseGmsClient.o;
        if (connectionInfo == null) {
            connectionTelemetryConfiguration = null;
        } else {
            connectionTelemetryConfiguration = connectionInfo.d;
        }
        if (connectionTelemetryConfiguration == null || !connectionTelemetryConfiguration.b || ((iArr = connectionTelemetryConfiguration.d) != null ? !abhi.c(iArr, i) : !((iArr2 = connectionTelemetryConfiguration.f) == null || !abhi.c(iArr2, i))) || abslVar.h >= connectionTelemetryConfiguration.e) {
            return null;
        }
        return connectionTelemetryConfiguration;
    }

    @Override // defpackage.acik
    public final void a(acir acirVar) {
        absl b;
        boolean z;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        long j;
        int i7;
        if (this.a.h()) {
            RootTelemetryConfiguration rootTelemetryConfiguration = abus.a().a;
            if ((rootTelemetryConfiguration == null || rootTelemetryConfiguration.b) && (b = this.a.b(this.c)) != null) {
                Object obj = b.b;
                if (obj instanceof BaseGmsClient) {
                    BaseGmsClient baseGmsClient = (BaseGmsClient) obj;
                    long j2 = 0;
                    boolean z2 = true;
                    if (this.d > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    int i8 = baseGmsClient.k;
                    if (rootTelemetryConfiguration != null) {
                        z &= rootTelemetryConfiguration.c;
                        boolean F = baseGmsClient.F();
                        int i9 = rootTelemetryConfiguration.d;
                        int i10 = rootTelemetryConfiguration.e;
                        i = rootTelemetryConfiguration.a;
                        if (F && !baseGmsClient.q()) {
                            ConnectionTelemetryConfiguration b2 = b(b, baseGmsClient, this.b);
                            if (b2 != null) {
                                if (!b2.c || this.d <= 0) {
                                    z2 = false;
                                }
                                i10 = b2.e;
                                z = z2;
                            } else {
                                return;
                            }
                        }
                        i3 = i9;
                        i2 = i10;
                    } else {
                        i = 0;
                        i2 = 100;
                        i3 = 5000;
                    }
                    abso absoVar = this.a;
                    if (acirVar.l()) {
                        i5 = 0;
                        i6 = 0;
                    } else {
                        if (((aciv) acirVar).c) {
                            i5 = 100;
                        } else {
                            Exception g = acirVar.g();
                            if (g instanceof abra) {
                                Status status = ((abra) g).a;
                                i4 = status.f;
                                ConnectionResult connectionResult = status.i;
                                if (connectionResult != null) {
                                    i6 = connectionResult.c;
                                    i5 = i4;
                                }
                            } else {
                                i4 = 101;
                            }
                            i5 = i4;
                        }
                        i6 = -1;
                    }
                    if (z) {
                        long j3 = this.d;
                        long j4 = this.e;
                        long currentTimeMillis = System.currentTimeMillis();
                        i7 = (int) (SystemClock.elapsedRealtime() - j4);
                        j = j3;
                        j2 = currentTimeMillis;
                    } else {
                        j = 0;
                        i7 = -1;
                    }
                    MethodInvocation methodInvocation = new MethodInvocation(this.b, i5, i6, j, j2, null, null, i8, i7);
                    long j5 = i3;
                    Handler handler = absoVar.o;
                    handler.sendMessage(handler.obtainMessage(18, new abta(methodInvocation, i, j5, i2)));
                }
            }
        }
    }
}
