package j$.time.format;

import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalField;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;

/* loaded from: classes5.dex */
public final class v {
    private static final C0081a h = new Object();
    private static final HashMap i;
    private v a;
    private final v b;
    private final ArrayList c;
    private final boolean d;
    private int e;
    private char f;
    private int g;

    /* JADX WARN: Type inference failed for: r0v0, types: [j$.time.format.a, java.lang.Object] */
    static {
        HashMap hashMap = new HashMap();
        i = hashMap;
        hashMap.put('G', ChronoField.ERA);
        hashMap.put('y', ChronoField.YEAR_OF_ERA);
        hashMap.put('u', ChronoField.YEAR);
        TemporalField temporalField = j$.time.temporal.g.a;
        hashMap.put('Q', temporalField);
        hashMap.put('q', temporalField);
        ChronoField chronoField = ChronoField.MONTH_OF_YEAR;
        hashMap.put('M', chronoField);
        hashMap.put('L', chronoField);
        hashMap.put('D', ChronoField.DAY_OF_YEAR);
        hashMap.put('d', ChronoField.DAY_OF_MONTH);
        hashMap.put('F', ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH);
        ChronoField chronoField2 = ChronoField.DAY_OF_WEEK;
        hashMap.put('E', chronoField2);
        hashMap.put('c', chronoField2);
        hashMap.put('e', chronoField2);
        hashMap.put('a', ChronoField.AMPM_OF_DAY);
        hashMap.put('H', ChronoField.HOUR_OF_DAY);
        hashMap.put('k', ChronoField.CLOCK_HOUR_OF_DAY);
        hashMap.put('K', ChronoField.HOUR_OF_AMPM);
        hashMap.put('h', ChronoField.CLOCK_HOUR_OF_AMPM);
        hashMap.put('m', ChronoField.MINUTE_OF_HOUR);
        hashMap.put('s', ChronoField.SECOND_OF_MINUTE);
        ChronoField chronoField3 = ChronoField.NANO_OF_SECOND;
        hashMap.put('S', chronoField3);
        hashMap.put('A', ChronoField.MILLI_OF_DAY);
        hashMap.put('n', chronoField3);
        hashMap.put('N', ChronoField.NANO_OF_DAY);
        hashMap.put('g', j$.time.temporal.i.a);
    }

    public v() {
        this.a = this;
        this.c = new ArrayList();
        this.g = -1;
        this.b = null;
        this.d = false;
    }

    private int d(InterfaceC0086f interfaceC0086f) {
        Objects.a(interfaceC0086f, "pp");
        v vVar = this.a;
        int i2 = vVar.e;
        if (i2 > 0) {
            l lVar = new l(interfaceC0086f, i2, vVar.f);
            vVar.e = 0;
            vVar.f = (char) 0;
            interfaceC0086f = lVar;
        }
        vVar.c.add(interfaceC0086f);
        this.a.g = -1;
        return r5.c.size() - 1;
    }

    private void m(j jVar) {
        j e;
        G g;
        v vVar = this.a;
        int i2 = vVar.g;
        if (i2 >= 0) {
            j jVar2 = (j) vVar.c.get(i2);
            int i3 = jVar.b;
            int i4 = jVar.c;
            if (i3 == i4) {
                g = jVar.d;
                if (g == G.NOT_NEGATIVE) {
                    e = jVar2.f(i4);
                    d(jVar.e());
                    this.a.g = i2;
                    this.a.c.set(i2, e);
                    return;
                }
            }
            e = jVar2.e();
            this.a.g = d(jVar);
            this.a.c.set(i2, e);
            return;
        }
        vVar.g = d(jVar);
    }

    private DateTimeFormatter z(Locale locale, F f, j$.time.chrono.t tVar) {
        Objects.a(locale, "locale");
        while (this.a.b != null) {
            r();
        }
        return new DateTimeFormatter(new C0085e(this.c, false), locale, D.a, f, tVar, null);
    }

    public final void a(DateTimeFormatter dateTimeFormatter) {
        Objects.a(dateTimeFormatter, "formatter");
        d(dateTimeFormatter.g());
    }

    public final void b(ChronoField chronoField, int i2, int i3, boolean z) {
        if (i2 == i3 && !z) {
            m(new C0087g(chronoField, i2, i3, z));
        } else {
            d(new C0087g(chronoField, i2, i3, z));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [j$.time.format.f, java.lang.Object] */
    public final void c() {
        d(new Object());
    }

    public final void e(char c) {
        d(new C0084d(c));
    }

    public final void f(String str) {
        Objects.a(str, "literal");
        if (!str.isEmpty()) {
            if (str.length() == 1) {
                d(new C0084d(str.charAt(0)));
            } else {
                d(new C0089i(1, str));
            }
        }
    }

    public final void g(H h2) {
        Objects.a(h2, "style");
        if (h2 != H.FULL && h2 != H.SHORT) {
            throw new IllegalArgumentException("Style must be either full or short");
        }
        d(new C0089i(0, h2));
    }

    public final void h(String str, String str2) {
        d(new k(str, str2));
    }

    public final void i() {
        d(k.e);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:59:0x00df. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:60:0x00e2. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:61:0x00e5. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0456  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x046f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j(java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 1256
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.format.v.j(java.lang.String):void");
    }

    public final void k(ChronoField chronoField, HashMap hashMap) {
        Objects.a(chronoField, "field");
        LinkedHashMap linkedHashMap = new LinkedHashMap(hashMap);
        H h2 = H.FULL;
        d(new r(chronoField, h2, new C0082b(new B(Collections.singletonMap(h2, linkedHashMap)))));
    }

    public final void l(TemporalField temporalField, H h2) {
        Objects.a(h2, "textStyle");
        d(new r(temporalField, h2, C.d()));
    }

    public final void n(TemporalField temporalField) {
        m(new j(temporalField, 1, 19, G.NORMAL));
    }

    public final void o(TemporalField temporalField, int i2) {
        Objects.a(temporalField, "field");
        if (i2 >= 1 && i2 <= 19) {
            m(new j(temporalField, i2, i2, G.NOT_NEGATIVE));
        } else {
            throw new IllegalArgumentException("The width must be from 1 to 19 inclusive but was " + i2);
        }
    }

    public final void p(TemporalField temporalField, int i2, int i3, G g) {
        if (i2 == i3 && g == G.NOT_NEGATIVE) {
            o(temporalField, i3);
            return;
        }
        Objects.a(temporalField, "field");
        Objects.a(g, "signStyle");
        if (i2 >= 1 && i2 <= 19) {
            if (i3 >= 1 && i3 <= 19) {
                if (i3 >= i2) {
                    m(new j(temporalField, i2, i3, g));
                    return;
                }
                throw new IllegalArgumentException("The maximum width must exceed or equal the minimum width but " + i3 + " < " + i2);
            }
            throw new IllegalArgumentException("The maximum width must be from 1 to 19 inclusive but was " + i3);
        }
        throw new IllegalArgumentException("The minimum width must be from 1 to 19 inclusive but was " + i2);
    }

    public final void q() {
        d(new t(h, "ZoneRegionId()"));
    }

    public final void r() {
        v vVar = this.a;
        if (vVar.b != null) {
            if (vVar.c.size() > 0) {
                v vVar2 = this.a;
                C0085e c0085e = new C0085e(vVar2.c, vVar2.d);
                this.a = this.a.b;
                d(c0085e);
                return;
            }
            this.a = this.a.b;
            return;
        }
        throw new IllegalStateException("Cannot call optionalEnd() as there was no previous call to optionalStart()");
    }

    public final void s() {
        v vVar = this.a;
        vVar.g = -1;
        this.a = new v(vVar);
    }

    public final void t() {
        d(q.INSENSITIVE);
    }

    public final void u() {
        d(q.SENSITIVE);
    }

    public final void v() {
        d(q.LENIENT);
    }

    public final void w() {
        d(q.STRICT);
    }

    public final DateTimeFormatter x() {
        return z(Locale.getDefault(), F.SMART, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final DateTimeFormatter y(F f, j$.time.chrono.t tVar) {
        return z(Locale.getDefault(), f, tVar);
    }

    private v(v vVar) {
        this.a = this;
        this.c = new ArrayList();
        this.g = -1;
        this.b = vVar;
        this.d = true;
    }
}
