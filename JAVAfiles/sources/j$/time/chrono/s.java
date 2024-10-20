package j$.time.chrono;

import j$.time.temporal.ChronoField;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalField;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class s implements n {
    public static final s AH;
    private static final /* synthetic */ s[] a;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Enum, j$.time.chrono.s] */
    static {
        ?? r1 = new Enum("AH", 0);
        AH = r1;
        a = new s[]{r1};
    }

    public static s valueOf(String str) {
        return (s) Enum.valueOf(s.class, str);
    }

    public static s[] values() {
        return (s[]) a.clone();
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ Object D(j$.time.temporal.n nVar) {
        return AbstractC0077h.m(this, nVar);
    }

    @Override // j$.time.temporal.k
    public final Temporal G(Temporal temporal) {
        return temporal.c(1, ChronoField.ERA);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ boolean f(TemporalField temporalField) {
        return AbstractC0077h.i(this, temporalField);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ int get(TemporalField temporalField) {
        return AbstractC0077h.f(this, temporalField);
    }

    @Override // j$.time.chrono.n
    public final int getValue() {
        return 1;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.p u(TemporalField temporalField) {
        if (temporalField == ChronoField.ERA) {
            return j$.time.temporal.p.j(1L, 1L);
        }
        return j$.time.temporal.j.d(this, temporalField);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ long y(TemporalField temporalField) {
        return AbstractC0077h.g(this, temporalField);
    }
}
