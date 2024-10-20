package j$.time.chrono;

import j$.time.Instant;
import j$.time.ZoneId;
import j$.time.temporal.ChronoField;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAccessor;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public interface m extends Comparable {
    InterfaceC0071b A(int i, int i2);

    InterfaceC0079j C(Temporal temporal);

    ChronoLocalDateTime F(Temporal temporal);

    InterfaceC0071b M(int i, int i2, int i3);

    InterfaceC0071b P(Map map, j$.time.format.F f);

    j$.time.temporal.p Q(ChronoField chronoField);

    InterfaceC0079j R(Instant instant, ZoneId zoneId);

    List T();

    boolean W(long j);

    n X(int i);

    boolean equals(Object obj);

    int g(n nVar, int i);

    int hashCode();

    InterfaceC0071b l(long j);

    String m();

    InterfaceC0071b q(TemporalAccessor temporalAccessor);

    String toString();

    String x();
}
