package j$.time.temporal;

import j$.time.Duration;

/* loaded from: classes5.dex */
public interface TemporalUnit {
    long between(Temporal temporal, Temporal temporal2);

    Duration getDuration();

    Temporal n(Temporal temporal, long j);

    boolean t();
}
