package defpackage;

import android.content.Context;
import java.util.concurrent.TimeUnit;
import java.util.function.BiFunction;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ylg {
    public static final utz a = uuh.e(uuh.b, "rcs_service_connection_timeout_seconds", 60);
    public static final alwo b = alwo.o("ConnectedRcsService");
    private final Context c;
    private final aneo d;
    private final anen e;

    public ylg(Context context, aneo aneoVar, anen anenVar) {
        this.c = context;
        this.d = aneoVar;
        this.e = anenVar;
    }

    public final akul a(BiFunction biFunction, Class cls) {
        akul af;
        Object apply;
        long intValue = ((Integer) a.e()).intValue();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        ylf ylfVar = new ylf();
        try {
            apply = biFunction.apply(this.c, ylfVar);
            ajnv ajnvVar = (ajnv) apply;
            ((alwl) b.m().h("com/google/android/apps/messaging/shared/util/rcs/ConnectedRcsServiceFactory", "connectToInstance", 127, "ConnectedRcsServiceFactory.java")).t("connectToInstance() start for rcsService %s", ajnvVar);
            af = aktp.aj(new ncx(ajnvVar, ylfVar, cls, 16), this.e);
        } catch (Exception e) {
            xzb.p("Bugle", e, "ConnectedRcsService: Unsupported service class ".concat(cls.toString()));
            af = aktp.af(new IllegalArgumentException("Unsupported service class ".concat(cls.toString())));
        }
        return af.j(intValue, timeUnit, this.d);
    }
}
