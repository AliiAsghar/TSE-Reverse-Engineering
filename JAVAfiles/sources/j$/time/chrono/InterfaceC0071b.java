package j$.time.chrono;

import j$.time.LocalTime;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAmount;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalUnit;

/* renamed from: j$.time.chrono.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public interface InterfaceC0071b extends Temporal, j$.time.temporal.k, Comparable {
    ChronoLocalDateTime B(LocalTime localTime);

    n H();

    boolean N();

    InterfaceC0071b O(TemporalAmount temporalAmount);

    /* renamed from: S */
    InterfaceC0071b n(long j, TemporalUnit temporalUnit);

    int U();

    /* renamed from: V */
    int compareTo(InterfaceC0071b interfaceC0071b);

    m a();

    @Override // j$.time.temporal.Temporal
    InterfaceC0071b c(long j, TemporalField temporalField);

    @Override // j$.time.temporal.Temporal
    InterfaceC0071b d(long j, TemporalUnit temporalUnit);

    @Override // j$.time.temporal.Temporal
    long e(Temporal temporal, TemporalUnit temporalUnit);

    boolean equals(Object obj);

    @Override // j$.time.temporal.TemporalAccessor
    boolean f(TemporalField temporalField);

    int hashCode();

    /* renamed from: k */
    InterfaceC0071b t(j$.time.temporal.k kVar);

    long toEpochDay();

    String toString();
}
