package defpackage;

import android.app.Notification;
import j$.time.Duration;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class unf {
    static final alhr a = uuh.w("constaints_only_on_work_manager");
    public final gsf b;
    public final unv c;
    public final int d;
    public final int e;
    public final long f;
    public final gry g;
    public final Notification h;
    public final amdy i;
    public final Duration j;
    public final boolean k;
    public final Optional l;

    public unf() {
        throw null;
    }

    public static une a() {
        une uneVar = new une(null);
        uneVar.h(10000L);
        uneVar.g(gry.LINEAR);
        uneVar.c(unv.WAKELOCK);
        uneVar.e = Optional.empty();
        uneVar.e(1);
        uneVar.d(1);
        uneVar.f(false);
        return uneVar;
    }

    public final boolean equals(Object obj) {
        Notification notification;
        amdy amdyVar;
        Duration duration;
        if (obj == this) {
            return true;
        }
        if (obj instanceof unf) {
            unf unfVar = (unf) obj;
            gsf gsfVar = this.b;
            if (gsfVar != null ? gsfVar.equals(unfVar.b) : unfVar.b == null) {
                if (this.c.equals(unfVar.c) && this.d == unfVar.d && this.e == unfVar.e && this.f == unfVar.f && this.g.equals(unfVar.g) && ((notification = this.h) != null ? notification.equals(unfVar.h) : unfVar.h == null) && ((amdyVar = this.i) != null ? amdyVar.equals(unfVar.i) : unfVar.i == null) && ((duration = this.j) != null ? duration.equals(unfVar.j) : unfVar.j == null) && this.k == unfVar.k && this.l.equals(unfVar.l)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int i;
        gsf gsfVar = this.b;
        int i2 = 0;
        if (gsfVar == null) {
            hashCode = 0;
        } else {
            hashCode = gsfVar.hashCode();
        }
        int hashCode4 = (((((hashCode ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d) * 1000003;
        int i3 = this.e;
        long j = this.f;
        int hashCode5 = ((((hashCode4 ^ i3) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.g.hashCode();
        Notification notification = this.h;
        if (notification == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = notification.hashCode();
        }
        int i4 = ((hashCode5 * 1000003) ^ hashCode2) * 1000003;
        amdy amdyVar = this.i;
        if (amdyVar == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = amdyVar.hashCode();
        }
        int i5 = (i4 ^ hashCode3) * 1000003;
        Duration duration = this.j;
        if (duration != null) {
            i2 = duration.hashCode();
        }
        int i6 = (i5 ^ i2) * 1000003;
        if (true != this.k) {
            i = 1237;
        } else {
            i = 1231;
        }
        return ((i6 ^ i) * 1000003) ^ this.l.hashCode();
    }

    public final String toString() {
        Optional optional = this.l;
        Duration duration = this.j;
        amdy amdyVar = this.i;
        Notification notification = this.h;
        gry gryVar = this.g;
        unv unvVar = this.c;
        return "ExecutionParameters{constraints=" + String.valueOf(this.b) + ", keepAliveStrategy=" + String.valueOf(unvVar) + ", maxRowsPerBatch=" + this.d + ", maxAttemptsPerItem=" + this.e + ", retryDelayMillis=" + this.f + ", retryBackoffPolicy=" + String.valueOf(gryVar) + ", foregroundServiceNotification=" + String.valueOf(notification) + ", legacyActionEnumForLogging=" + String.valueOf(amdyVar) + ", cadence=" + String.valueOf(duration) + ", optInForSchedulerMigration=" + this.k + ", foregroundServiceType=" + String.valueOf(optional) + "}";
    }

    public unf(gsf gsfVar, unv unvVar, int i, int i2, long j, gry gryVar, Notification notification, amdy amdyVar, Duration duration, boolean z, Optional optional) {
        this.b = gsfVar;
        this.c = unvVar;
        this.d = i;
        this.e = i2;
        this.f = j;
        this.g = gryVar;
        this.h = notification;
        this.i = amdyVar;
        this.j = duration;
        this.k = z;
        this.l = optional;
    }
}
