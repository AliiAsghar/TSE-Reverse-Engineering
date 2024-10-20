package defpackage;

import com.google.android.rcs.client.messaging.data.AutoValue_LocationInformation;
import com.google.android.rcs.client.messaging.data.LocationInformation;
import j$.time.Instant;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajqm {
    public Optional a;
    private Optional b;
    private String c;
    private Optional d;
    private Optional e;
    private double f;
    private double g;
    private Optional h;
    private Optional i;
    private byte j;

    public ajqm() {
        throw null;
    }

    public final LocationInformation a() {
        String str;
        boolean z;
        boolean z2 = true;
        if (this.j == 3 && (str = this.c) != null) {
            AutoValue_LocationInformation autoValue_LocationInformation = new AutoValue_LocationInformation(this.b, str, this.d, this.e, this.a, this.f, this.g, this.h, this.i);
            double d = autoValue_LocationInformation.b;
            int i = 0;
            if (d >= -180.0d && d <= 180.0d) {
                z = true;
            } else {
                z = false;
            }
            albo.U(z, "Latitude must be between -180 and 180.");
            double d2 = autoValue_LocationInformation.a;
            if (d2 < -180.0d || d2 > 180.0d) {
                z2 = false;
            }
            albo.U(z2, "Longitude must be between -180 and 180.");
            autoValue_LocationInformation.c.ifPresent(new ajql(i));
            return autoValue_LocationInformation;
        }
        StringBuilder sb = new StringBuilder();
        if (this.c == null) {
            sb.append(" id");
        }
        if ((this.j & 1) == 0) {
            sb.append(" longitude");
        }
        if ((this.j & 2) == 0) {
            sb.append(" latitude");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(String str) {
        this.i = Optional.of(str);
    }

    public final void c(Instant instant) {
        this.d = Optional.of(instant);
    }

    public final void d(String str) {
        if (str != null) {
            this.c = str;
            return;
        }
        throw new NullPointerException("Null id");
    }

    public final void e(String str) {
        this.e = Optional.of(str);
    }

    public final void f(double d) {
        this.g = d;
        this.j = (byte) (this.j | 2);
    }

    public final void g(double d) {
        this.f = d;
        this.j = (byte) (this.j | 1);
    }

    public final void h(double d) {
        this.h = Optional.of(Double.valueOf(d));
    }

    public final void i(Instant instant) {
        this.b = Optional.of(instant);
    }

    public ajqm(byte[] bArr) {
        this.b = Optional.empty();
        this.d = Optional.empty();
        this.e = Optional.empty();
        this.a = Optional.empty();
        this.h = Optional.empty();
        this.i = Optional.empty();
    }
}
