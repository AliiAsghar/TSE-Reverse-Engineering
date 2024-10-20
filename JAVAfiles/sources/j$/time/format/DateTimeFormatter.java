package j$.time.format;

import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import j$.time.ZoneId;
import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalAccessor;
import j$.util.Objects;
import java.io.IOException;
import java.text.ParsePosition;
import java.util.HashMap;
import java.util.Locale;

/* loaded from: classes5.dex */
public final class DateTimeFormatter {
    public static final DateTimeFormatter ISO_LOCAL_DATE;
    public static final DateTimeFormatter g;
    private final C0085e a;
    private final Locale b;
    private final D c;
    private final F d;
    private final j$.time.chrono.t e;
    private final ZoneId f;

    static {
        v vVar = new v();
        ChronoField chronoField = ChronoField.YEAR;
        G g2 = G.EXCEEDS_PAD;
        vVar.p(chronoField, 4, 10, g2);
        vVar.e('-');
        ChronoField chronoField2 = ChronoField.MONTH_OF_YEAR;
        vVar.o(chronoField2, 2);
        vVar.e('-');
        ChronoField chronoField3 = ChronoField.DAY_OF_MONTH;
        vVar.o(chronoField3, 2);
        F f = F.STRICT;
        j$.time.chrono.t tVar = j$.time.chrono.t.d;
        DateTimeFormatter y = vVar.y(f, tVar);
        ISO_LOCAL_DATE = y;
        v vVar2 = new v();
        vVar2.t();
        vVar2.a(y);
        vVar2.i();
        vVar2.y(f, tVar);
        v vVar3 = new v();
        vVar3.t();
        vVar3.a(y);
        vVar3.s();
        vVar3.i();
        vVar3.y(f, tVar);
        v vVar4 = new v();
        ChronoField chronoField4 = ChronoField.HOUR_OF_DAY;
        vVar4.o(chronoField4, 2);
        vVar4.e(':');
        ChronoField chronoField5 = ChronoField.MINUTE_OF_HOUR;
        vVar4.o(chronoField5, 2);
        vVar4.s();
        vVar4.e(':');
        ChronoField chronoField6 = ChronoField.SECOND_OF_MINUTE;
        vVar4.o(chronoField6, 2);
        vVar4.s();
        vVar4.b(ChronoField.NANO_OF_SECOND, 0, 9, true);
        DateTimeFormatter y2 = vVar4.y(f, null);
        v vVar5 = new v();
        vVar5.t();
        vVar5.a(y2);
        vVar5.i();
        vVar5.y(f, null);
        v vVar6 = new v();
        vVar6.t();
        vVar6.a(y2);
        vVar6.s();
        vVar6.i();
        vVar6.y(f, null);
        v vVar7 = new v();
        vVar7.t();
        vVar7.a(y);
        vVar7.e('T');
        vVar7.a(y2);
        DateTimeFormatter y3 = vVar7.y(f, tVar);
        v vVar8 = new v();
        vVar8.t();
        vVar8.a(y3);
        vVar8.v();
        vVar8.i();
        vVar8.w();
        DateTimeFormatter y4 = vVar8.y(f, tVar);
        v vVar9 = new v();
        vVar9.a(y4);
        vVar9.s();
        vVar9.e('[');
        vVar9.u();
        vVar9.q();
        vVar9.e(']');
        vVar9.y(f, tVar);
        v vVar10 = new v();
        vVar10.a(y3);
        vVar10.s();
        vVar10.i();
        vVar10.s();
        vVar10.e('[');
        vVar10.u();
        vVar10.q();
        vVar10.e(']');
        vVar10.y(f, tVar);
        v vVar11 = new v();
        vVar11.t();
        vVar11.p(chronoField, 4, 10, g2);
        vVar11.e('-');
        vVar11.o(ChronoField.DAY_OF_YEAR, 3);
        vVar11.s();
        vVar11.i();
        vVar11.y(f, tVar);
        v vVar12 = new v();
        vVar12.t();
        vVar12.p(j$.time.temporal.g.c, 4, 10, g2);
        vVar12.f("-W");
        vVar12.o(j$.time.temporal.g.b, 2);
        vVar12.e('-');
        ChronoField chronoField7 = ChronoField.DAY_OF_WEEK;
        vVar12.o(chronoField7, 1);
        vVar12.s();
        vVar12.i();
        vVar12.y(f, tVar);
        v vVar13 = new v();
        vVar13.t();
        vVar13.c();
        g = vVar13.y(f, null);
        v vVar14 = new v();
        vVar14.t();
        vVar14.o(chronoField, 4);
        vVar14.o(chronoField2, 2);
        vVar14.o(chronoField3, 2);
        vVar14.s();
        vVar14.v();
        vVar14.h("+HHMMss", "Z");
        vVar14.w();
        vVar14.y(f, tVar);
        HashMap hashMap = new HashMap();
        hashMap.put(1L, "Mon");
        hashMap.put(2L, "Tue");
        hashMap.put(3L, "Wed");
        hashMap.put(4L, "Thu");
        hashMap.put(5L, "Fri");
        hashMap.put(6L, "Sat");
        hashMap.put(7L, "Sun");
        HashMap hashMap2 = new HashMap();
        hashMap2.put(1L, "Jan");
        hashMap2.put(2L, "Feb");
        hashMap2.put(3L, "Mar");
        hashMap2.put(4L, "Apr");
        hashMap2.put(5L, "May");
        hashMap2.put(6L, "Jun");
        hashMap2.put(7L, "Jul");
        hashMap2.put(8L, "Aug");
        hashMap2.put(9L, "Sep");
        hashMap2.put(10L, "Oct");
        hashMap2.put(11L, "Nov");
        hashMap2.put(12L, "Dec");
        v vVar15 = new v();
        vVar15.t();
        vVar15.v();
        vVar15.s();
        vVar15.k(chronoField7, hashMap);
        vVar15.f(", ");
        vVar15.r();
        vVar15.p(chronoField3, 1, 2, G.NOT_NEGATIVE);
        vVar15.e(' ');
        vVar15.k(chronoField2, hashMap2);
        vVar15.e(' ');
        vVar15.o(chronoField, 4);
        vVar15.e(' ');
        vVar15.o(chronoField4, 2);
        vVar15.e(':');
        vVar15.o(chronoField5, 2);
        vVar15.s();
        vVar15.e(':');
        vVar15.o(chronoField6, 2);
        vVar15.r();
        vVar15.e(' ');
        vVar15.h("+HHMM", "GMT");
        vVar15.y(F.SMART, tVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public DateTimeFormatter(C0085e c0085e, Locale locale, D d, F f, j$.time.chrono.t tVar, ZoneId zoneId) {
        Objects.a(c0085e, "printerParser");
        this.a = c0085e;
        Objects.a(locale, "locale");
        this.b = locale;
        Objects.a(d, "decimalStyle");
        this.c = d;
        Objects.a(f, "resolverStyle");
        this.d = f;
        this.e = tVar;
        this.f = zoneId;
    }

    private TemporalAccessor f(CharSequence charSequence) {
        String charSequence2;
        ParsePosition parsePosition = new ParsePosition(0);
        Objects.a(charSequence, ConversationSuggestion.SUGGESTION_PROPERTY_TEXT);
        w wVar = new w(this);
        int t = this.a.t(wVar, charSequence, parsePosition.getIndex());
        if (t < 0) {
            parsePosition.setErrorIndex(~t);
            wVar = null;
        } else {
            parsePosition.setIndex(t);
        }
        if (wVar != null && parsePosition.getErrorIndex() < 0 && parsePosition.getIndex() >= charSequence.length()) {
            return wVar.t(this.d);
        }
        if (charSequence.length() > 64) {
            charSequence2 = charSequence.subSequence(0, 64).toString() + "...";
        } else {
            charSequence2 = charSequence.toString();
        }
        if (parsePosition.getErrorIndex() >= 0) {
            String str = "Text '" + charSequence2 + "' could not be parsed at index " + parsePosition.getErrorIndex();
            parsePosition.getErrorIndex();
            throw new x(str, charSequence);
        }
        String str2 = "Text '" + charSequence2 + "' could not be parsed, unparsed text found at index " + parsePosition.getIndex();
        parsePosition.getIndex();
        throw new x(str2, charSequence);
    }

    public static DateTimeFormatter ofPattern(String str) {
        v vVar = new v();
        vVar.j(str);
        return vVar.x();
    }

    public final j$.time.chrono.m a() {
        return this.e;
    }

    public final D b() {
        return this.c;
    }

    public final Locale c() {
        return this.b;
    }

    public final ZoneId d() {
        return this.f;
    }

    public final Object e(CharSequence charSequence, j$.desugar.sun.nio.fs.n nVar) {
        String charSequence2;
        Objects.a(charSequence, ConversationSuggestion.SUGGESTION_PROPERTY_TEXT);
        try {
            return ((E) f(charSequence)).D(nVar);
        } catch (x e) {
            throw e;
        } catch (RuntimeException e2) {
            if (charSequence.length() > 64) {
                charSequence2 = charSequence.subSequence(0, 64).toString() + "...";
            } else {
                charSequence2 = charSequence.toString();
            }
            RuntimeException runtimeException = new RuntimeException(j$.time.d.d("Text '", charSequence2, "' could not be parsed: ", e2.getMessage()), e2);
            charSequence.toString();
            throw runtimeException;
        }
    }

    public String format(TemporalAccessor temporalAccessor) {
        StringBuilder sb = new StringBuilder(32);
        Objects.a(temporalAccessor, "temporal");
        try {
            this.a.n(new z(temporalAccessor, this), sb);
            return sb.toString();
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage(), e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final C0085e g() {
        return this.a.a();
    }

    public final String toString() {
        String c0085e = this.a.toString();
        if (!c0085e.startsWith("[")) {
            return c0085e.substring(1, c0085e.length() - 1);
        }
        return c0085e;
    }

    public DateTimeFormatter withZone(ZoneId zoneId) {
        if (Objects.equals(this.f, zoneId)) {
            return this;
        }
        return new DateTimeFormatter(this.a, this.b, this.c, this.d, this.e, zoneId);
    }
}
