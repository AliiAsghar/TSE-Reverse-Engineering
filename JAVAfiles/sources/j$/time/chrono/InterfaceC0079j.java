package j$.time.chrono;

import j$.time.LocalTime;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.temporal.Temporal;

/* renamed from: j$.time.chrono.j, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public interface InterfaceC0079j extends Temporal, Comparable {
    ChronoLocalDateTime L();

    long Z();

    m a();

    InterfaceC0071b b();

    ZoneOffset h();

    InterfaceC0079j i(ZoneId zoneId);

    InterfaceC0079j j(ZoneId zoneId);

    LocalTime toLocalTime();

    ZoneId w();
}
