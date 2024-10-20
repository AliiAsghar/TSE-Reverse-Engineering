package j$.time.chrono;

import j$.time.LocalTime;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.chrono.InterfaceC0071b;
import j$.time.temporal.Temporal;

/* loaded from: classes5.dex */
public interface ChronoLocalDateTime<D extends InterfaceC0071b> extends Temporal, j$.time.temporal.k, Comparable<ChronoLocalDateTime<?>> {
    /* renamed from: K */
    int compareTo(ChronoLocalDateTime chronoLocalDateTime);

    m a();

    InterfaceC0071b b();

    InterfaceC0079j p(ZoneId zoneId);

    long toEpochSecond(ZoneOffset zoneOffset);

    LocalTime toLocalTime();
}
