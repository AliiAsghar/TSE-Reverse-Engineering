package j$.time.format;

import j$.time.ZoneId;
import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalField;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Locale;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class w {
    private DateTimeFormatter a;
    private boolean b = true;
    private boolean c = true;
    private final ArrayList d;
    private ArrayList e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public w(DateTimeFormatter dateTimeFormatter) {
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        this.e = null;
        this.a = dateTimeFormatter;
        arrayList.add(new E());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean c(char c, char c2) {
        if (c != c2 && Character.toUpperCase(c) != Character.toUpperCase(c2) && Character.toLowerCase(c) != Character.toLowerCase(c2)) {
            return false;
        }
        return true;
    }

    private E e() {
        return (E) this.d.get(r0.size() - 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(o oVar) {
        if (this.e == null) {
            this.e = new ArrayList();
        }
        this.e.add(oVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean b(char c, char c2) {
        if (this.b) {
            if (c == c2) {
                return true;
            }
            return false;
        }
        return c(c, c2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final w d() {
        w wVar = new w(this.a);
        wVar.b = this.b;
        wVar.c = this.c;
        return wVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void f(boolean z) {
        ArrayList arrayList = this.d;
        if (z) {
            arrayList.remove(arrayList.size() - 2);
        } else {
            arrayList.remove(arrayList.size() - 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final D g() {
        return this.a.b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final j$.time.chrono.m h() {
        j$.time.chrono.m mVar = e().c;
        if (mVar == null) {
            j$.time.chrono.m a = this.a.a();
            if (a == null) {
                return j$.time.chrono.t.d;
            }
            return a;
        }
        return mVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Locale i() {
        return this.a.c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Long j(ChronoField chronoField) {
        return (Long) e().a.get(chronoField);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean k() {
        return this.b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean l() {
        return this.c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void m(boolean z) {
        this.b = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void n(ZoneId zoneId) {
        Objects.a(zoneId, "zone");
        e().b = zoneId;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int o(TemporalField temporalField, long j, int i, int i2) {
        Objects.a(temporalField, "field");
        Long l = (Long) e().a.put(temporalField, Long.valueOf(j));
        if (l != null && l.longValue() != j) {
            return ~i;
        }
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void p() {
        e().d = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void q(boolean z) {
        this.c = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void r() {
        ArrayList arrayList = this.d;
        E e = e();
        e.getClass();
        E e2 = new E();
        e2.a.putAll(e.a);
        e2.b = e.b;
        e2.c = e.c;
        e2.d = e.d;
        arrayList.add(e2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean s(CharSequence charSequence, int i, CharSequence charSequence2, int i2, int i3) {
        if (i + i3 > charSequence.length() || i2 + i3 > charSequence2.length()) {
            return false;
        }
        if (this.b) {
            for (int i4 = 0; i4 < i3; i4++) {
                if (charSequence.charAt(i + i4) != charSequence2.charAt(i2 + i4)) {
                    return false;
                }
            }
            return true;
        }
        for (int i5 = 0; i5 < i3; i5++) {
            char charAt = charSequence.charAt(i + i5);
            char charAt2 = charSequence2.charAt(i2 + i5);
            if (charAt != charAt2 && Character.toUpperCase(charAt) != Character.toUpperCase(charAt2) && Character.toLowerCase(charAt) != Character.toLowerCase(charAt2)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final TemporalAccessor t(F f) {
        E e = e();
        e.c = h();
        ZoneId zoneId = e.b;
        if (zoneId == null) {
            zoneId = this.a.d();
        }
        e.b = zoneId;
        e.l(f);
        return e;
    }

    public final String toString() {
        return e().toString();
    }
}
