package j$.time.temporal;

import j$.time.format.F;
import java.util.HashMap;

/* loaded from: classes5.dex */
public interface TemporalField {
    Temporal D(Temporal temporal, long j);

    p G(TemporalAccessor temporalAccessor);

    boolean a0();

    p n();

    TemporalAccessor t(HashMap hashMap, TemporalAccessor temporalAccessor, F f);

    long u(TemporalAccessor temporalAccessor);

    boolean y(TemporalAccessor temporalAccessor);
}
