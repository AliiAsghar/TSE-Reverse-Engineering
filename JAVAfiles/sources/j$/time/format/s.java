package j$.time.format;

import j$.time.DayOfWeek;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalUnit;
import j$.util.Objects;
import java.util.Calendar;
import java.util.Locale;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class s extends j {
    private char g;
    private int h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public s(char c, int i, int i2, int i3, int i4) {
        super(null, i2, i3, G.NOT_NEGATIVE, i4);
        this.g = c;
        this.h = i;
    }

    private j g(Locale locale) {
        TemporalField i;
        G g;
        TemporalUnit temporalUnit = j$.time.temporal.r.h;
        Objects.a(locale, "locale");
        j$.time.temporal.r g2 = j$.time.temporal.r.g(DayOfWeek.SUNDAY.b0(r7.getFirstDayOfWeek() - 1), Calendar.getInstance(new Locale(locale.getLanguage(), locale.getCountry())).getMinimalDaysInFirstWeek());
        char c = this.g;
        if (c != 'W') {
            if (c != 'Y') {
                if (c != 'c' && c != 'e') {
                    if (c == 'w') {
                        i = g2.j();
                    } else {
                        throw new IllegalStateException("unreachable");
                    }
                } else {
                    i = g2.d();
                }
            } else {
                TemporalField h = g2.h();
                int i2 = this.h;
                if (i2 == 2) {
                    return new p(h, p.h, this.e);
                }
                if (i2 < 4) {
                    g = G.NORMAL;
                } else {
                    g = G.EXCEEDS_PAD;
                }
                return new j(h, i2, 19, g, this.e);
            }
        } else {
            i = g2.i();
        }
        return new j(i, this.b, this.c, G.NOT_NEGATIVE, this.e);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.time.format.j
    public final j e() {
        if (this.e == -1) {
            return this;
        }
        return new s(this.g, this.h, this.b, this.c, -1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.time.format.j
    public final j f(int i) {
        int i2 = this.e + i;
        return new s(this.g, this.h, this.b, this.c, i2);
    }

    @Override // j$.time.format.j, j$.time.format.InterfaceC0086f
    public final boolean n(z zVar, StringBuilder sb) {
        return g(zVar.c()).n(zVar, sb);
    }

    @Override // j$.time.format.j, j$.time.format.InterfaceC0086f
    public final int t(w wVar, CharSequence charSequence, int i) {
        return g(wVar.i()).t(wVar, charSequence, i);
    }

    @Override // j$.time.format.j
    public final String toString() {
        G g;
        StringBuilder sb = new StringBuilder(30);
        sb.append("Localized(");
        int i = this.h;
        char c = this.g;
        if (c == 'Y') {
            if (i == 1) {
                sb.append("WeekBasedYear");
            } else if (i == 2) {
                sb.append("ReducedValue(WeekBasedYear,2,2,2000-01-01)");
            } else {
                sb.append("WeekBasedYear,");
                sb.append(i);
                sb.append(",19,");
                if (i < 4) {
                    g = G.NORMAL;
                } else {
                    g = G.EXCEEDS_PAD;
                }
                sb.append(g);
            }
        } else {
            if (c != 'W') {
                if (c != 'c' && c != 'e') {
                    if (c == 'w') {
                        sb.append("WeekOfWeekBasedYear");
                    }
                } else {
                    sb.append("DayOfWeek");
                }
            } else {
                sb.append("WeekOfMonth");
            }
            sb.append(",");
            sb.append(i);
        }
        sb.append(")");
        return sb.toString();
    }
}
