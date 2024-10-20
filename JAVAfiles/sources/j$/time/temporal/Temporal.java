package j$.time.temporal;

import j$.time.LocalDate;

/* loaded from: classes5.dex */
public interface Temporal extends TemporalAccessor {
    Temporal c(long j, TemporalField temporalField);

    Temporal d(long j, TemporalUnit temporalUnit);

    long e(Temporal temporal, TemporalUnit temporalUnit);

    Temporal n(long j, ChronoUnit chronoUnit);

    Temporal t(LocalDate localDate);
}
