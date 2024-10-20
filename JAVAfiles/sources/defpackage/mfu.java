package defpackage;

import j$.time.LocalDate;
import j$.time.ZoneId;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mfu {
    public static final /* synthetic */ int a = 0;
    private static final ZoneId b;

    static {
        ZoneId of = ZoneId.of("America/Los_Angeles");
        b = of;
        LocalDate.EPOCH.atStartOfDay(of).getClass();
    }
}
