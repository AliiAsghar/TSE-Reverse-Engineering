package j$.time.temporal;

import j$.time.chrono.AbstractC0077h;
import j$.time.format.F;
import java.util.HashMap;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'JULIAN_DAY' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes5.dex */
final class h implements TemporalField {
    public static final h JULIAN_DAY;
    public static final h MODIFIED_JULIAN_DAY;
    public static final h RATA_DIE;
    private static final /* synthetic */ h[] d;
    private static final long serialVersionUID = -7501623920830201812L;
    private final transient String a;
    private final transient p b;
    private final transient long c;

    static {
        ChronoUnit chronoUnit = ChronoUnit.DAYS;
        ChronoUnit chronoUnit2 = ChronoUnit.FOREVER;
        h hVar = new h("JULIAN_DAY", 0, "JulianDay", chronoUnit, chronoUnit2, 2440588L);
        JULIAN_DAY = hVar;
        h hVar2 = new h("MODIFIED_JULIAN_DAY", 1, "ModifiedJulianDay", chronoUnit, chronoUnit2, 40587L);
        MODIFIED_JULIAN_DAY = hVar2;
        h hVar3 = new h("RATA_DIE", 2, "RataDie", chronoUnit, chronoUnit2, 719163L);
        RATA_DIE = hVar3;
        d = new h[]{hVar, hVar2, hVar3};
    }

    private h(String str, int i, String str2, ChronoUnit chronoUnit, ChronoUnit chronoUnit2, long j) {
        this.a = str2;
        this.b = p.j((-365243219162L) + j, 365241780471L + j);
        this.c = j;
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) d.clone();
    }

    @Override // j$.time.temporal.TemporalField
    public final Temporal D(Temporal temporal, long j) {
        if (this.b.i(j)) {
            return temporal.c(j$.nio.channels.c.k(j, this.c), ChronoField.EPOCH_DAY);
        }
        throw new RuntimeException("Invalid value: " + this.a + " " + j);
    }

    @Override // j$.time.temporal.TemporalField
    public final p G(TemporalAccessor temporalAccessor) {
        if (temporalAccessor.f(ChronoField.EPOCH_DAY)) {
            return this.b;
        }
        throw new RuntimeException("Unsupported field: ".concat(String.valueOf(this)));
    }

    @Override // j$.time.temporal.TemporalField
    public final boolean a0() {
        return true;
    }

    @Override // j$.time.temporal.TemporalField
    public final p n() {
        return this.b;
    }

    @Override // j$.time.temporal.TemporalField
    public final TemporalAccessor t(HashMap hashMap, TemporalAccessor temporalAccessor, F f) {
        long longValue = ((Long) hashMap.remove(this)).longValue();
        j$.time.chrono.m q = AbstractC0077h.q(temporalAccessor);
        F f2 = F.LENIENT;
        long j = this.c;
        if (f == f2) {
            return q.l(j$.nio.channels.c.k(longValue, j));
        }
        this.b.b(longValue, this);
        return q.l(longValue - j);
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.a;
    }

    @Override // j$.time.temporal.TemporalField
    public final long u(TemporalAccessor temporalAccessor) {
        return temporalAccessor.y(ChronoField.EPOCH_DAY) + this.c;
    }

    @Override // j$.time.temporal.TemporalField
    public final boolean y(TemporalAccessor temporalAccessor) {
        return temporalAccessor.f(ChronoField.EPOCH_DAY);
    }
}
