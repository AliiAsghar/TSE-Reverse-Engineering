package j$.time.temporal;

import j$.time.DayOfWeek;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* loaded from: classes5.dex */
public final class r implements Serializable {
    private static final ConcurrentHashMap g = new ConcurrentHashMap(4, 0.75f, 2);
    public static final TemporalUnit h;
    private static final long serialVersionUID = -1177360819670808121L;
    private final DayOfWeek a;
    private final int b;
    private final transient TemporalField c = q.e(this);
    private final transient TemporalField d = q.h(this);
    private final transient TemporalField e;
    private final transient TemporalField f;

    static {
        new r(DayOfWeek.MONDAY, 4);
        g(DayOfWeek.SUNDAY, 1);
        h = g.d;
    }

    private r(DayOfWeek dayOfWeek, int i) {
        ChronoUnit chronoUnit = ChronoUnit.NANOS;
        this.e = q.i(this);
        this.f = q.g(this);
        Objects.a(dayOfWeek, "firstDayOfWeek");
        if (i >= 1 && i <= 7) {
            this.a = dayOfWeek;
            this.b = i;
            return;
        }
        throw new IllegalArgumentException("Minimal number of days is invalid");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static r g(DayOfWeek dayOfWeek, int i) {
        String str = dayOfWeek.toString() + i;
        ConcurrentHashMap concurrentHashMap = g;
        r rVar = (r) concurrentHashMap.get(str);
        if (rVar == null) {
            concurrentHashMap.putIfAbsent(str, new r(dayOfWeek, i));
            return (r) concurrentHashMap.get(str);
        }
        return rVar;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        if (this.a != null) {
            int i = this.b;
            if (i >= 1 && i <= 7) {
                return;
            } else {
                throw new InvalidObjectException("Minimal number of days is invalid");
            }
        }
        throw new InvalidObjectException("firstDayOfWeek is null");
    }

    private Object readResolve() {
        try {
            return g(this.a, this.b);
        } catch (IllegalArgumentException e) {
            throw new InvalidObjectException("Invalid serialized WeekFields: " + e.getMessage());
        }
    }

    public final TemporalField d() {
        return this.c;
    }

    public final DayOfWeek e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof r) && hashCode() == obj.hashCode()) {
            return true;
        }
        return false;
    }

    public final int f() {
        return this.b;
    }

    public final TemporalField h() {
        return this.f;
    }

    public final int hashCode() {
        return (this.a.ordinal() * 7) + this.b;
    }

    public final TemporalField i() {
        return this.d;
    }

    public final TemporalField j() {
        return this.e;
    }

    public final String toString() {
        return "WeekFields[" + String.valueOf(this.a) + "," + this.b + "]";
    }
}
