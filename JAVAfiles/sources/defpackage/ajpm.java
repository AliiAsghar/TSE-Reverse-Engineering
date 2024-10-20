package defpackage;

import android.text.TextUtils;
import j$.util.Optional;
import java.util.Arrays;

/* compiled from: PG */
@Deprecated
/* loaded from: classes4.dex */
public abstract class ajpm {
    public abstract double a();

    public abstract double b();

    public abstract Optional c();

    public abstract Optional d();

    public abstract Optional e();

    public abstract Optional f();

    public abstract Optional g();

    public abstract Optional h();

    public abstract String i();

    public final String toString() {
        return String.format("LocationInformation {%s}", TextUtils.join(",", Arrays.asList(String.format("id=%s", i()), String.format("timestamp=%s", h()), String.format("label=%s", advq.LOCATION.c(e())), String.format("location=%s", advq.LOCATION.c(f())), String.format("longitude=%s", advq.LOCATION.c(Double.valueOf(b()))), String.format("latitude=%s", advq.LOCATION.c(Double.valueOf(a()))), String.format("radius=%s", advq.LOCATION.c(g())), String.format("entity=%s", advq.LOCATION.c(c())))));
    }
}
