package defpackage;

import j$.util.DesugarTimeZone;
import java.io.Serializable;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class advi implements Comparable, Serializable {
    private static final Pattern b = Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)(\\.(\\d+))?([Zz]|((\\+|\\-)(\\d\\d):(\\d\\d)))?");
    private static final Pattern c = Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)([Zz]|((\\+|\\-)(\\d\\d):(\\d\\d)))?");
    private static final SimpleDateFormat d;
    private static final TimeZone e;
    private static final long serialVersionUID = -8521521731915494431L;
    public long a;
    private boolean f;
    private Integer g;

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss Z", Locale.ENGLISH);
        d = simpleDateFormat;
        TimeZone timeZone = DesugarTimeZone.getTimeZone("GMT");
        e = timeZone;
        simpleDateFormat.setTimeZone(timeZone);
    }

    private advi() {
        this.a = 0L;
        this.f = false;
        this.g = null;
    }

    public static advi a() {
        return new advi(new Date(), e);
    }

    public static advi b(String str) {
        Matcher matcher = b.matcher(str);
        if (matcher.matches()) {
            advi adviVar = new advi();
            adviVar.f = false;
            if (matcher.group(9) != null) {
                if (matcher.group(9).equalsIgnoreCase("Z")) {
                    adviVar.g = 0;
                } else {
                    adviVar.g = Integer.valueOf((Integer.valueOf(matcher.group(12)).intValue() * 60) + Integer.valueOf(matcher.group(13)).intValue());
                    if (matcher.group(11).equals("-")) {
                        adviVar.g = Integer.valueOf(-adviVar.g.intValue());
                    }
                }
            }
            GregorianCalendar gregorianCalendar = new GregorianCalendar(e);
            gregorianCalendar.clear();
            gregorianCalendar.set(Integer.valueOf(matcher.group(1)).intValue(), Integer.valueOf(matcher.group(2)).intValue() - 1, Integer.valueOf(matcher.group(3)).intValue(), Integer.valueOf(matcher.group(4)).intValue(), Integer.valueOf(matcher.group(5)).intValue(), Integer.valueOf(matcher.group(6)).intValue());
            if (matcher.group(8) != null && matcher.group(8).length() > 0) {
                gregorianCalendar.set(14, new BigDecimal("0.".concat(String.valueOf(matcher.group(8)))).movePointRight(3).intValue());
            }
            long timeInMillis = gregorianCalendar.getTimeInMillis();
            adviVar.a = timeInMillis;
            if (adviVar.g != null) {
                adviVar.a = timeInMillis - (r10.intValue() * 60000);
            }
            return adviVar;
        }
        throw new IllegalArgumentException("Invalid date/time format.");
    }

    public static advi c(String str) {
        try {
            return b(str);
        } catch (IllegalArgumentException unused) {
            Matcher matcher = c.matcher(str);
            if (matcher.matches()) {
                advi adviVar = new advi();
                adviVar.f = true;
                if (matcher.group(4) != null) {
                    if (matcher.group(4).equalsIgnoreCase("Z")) {
                        adviVar.g = 0;
                    } else {
                        adviVar.g = Integer.valueOf((Integer.valueOf(matcher.group(7)).intValue() * 60) + Integer.valueOf(matcher.group(8)).intValue());
                        if (matcher.group(6).equals("-")) {
                            adviVar.g = Integer.valueOf(-adviVar.g.intValue());
                        }
                    }
                }
                GregorianCalendar gregorianCalendar = new GregorianCalendar(e);
                gregorianCalendar.clear();
                gregorianCalendar.set(Integer.valueOf(matcher.group(1)).intValue(), Integer.valueOf(matcher.group(2)).intValue() - 1, Integer.valueOf(matcher.group(3)).intValue());
                long timeInMillis = gregorianCalendar.getTimeInMillis();
                adviVar.a = timeInMillis;
                if (adviVar.g != null) {
                    adviVar.a = timeInMillis - (r5.intValue() * 60000);
                }
                return adviVar;
            }
            throw new IllegalArgumentException("Invalid date format.");
        }
    }

    private static void d(StringBuilder sb, int i, int i2) {
        if (i < 0) {
            sb.append('-');
            i = -i;
        }
        char[] cArr = new char[i2];
        while (true) {
            i2--;
            if (i2 >= 0) {
                cArr[i2] = (char) ((i % 10) + 48);
                i /= 10;
            } else {
                sb.append(cArr);
                return;
            }
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        if (obj instanceof advi) {
            return Long.valueOf(this.a).compareTo(Long.valueOf(((advi) obj).a));
        }
        if (obj instanceof Date) {
            return Long.valueOf(this.a).compareTo(Long.valueOf(((Date) obj).getTime()));
        }
        throw new RuntimeException("Invalid type.");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof advi) {
            if (this.a == ((advi) obj).a) {
                return true;
            }
            return false;
        }
        if ((obj instanceof Date) && this.a == ((Date) obj).getTime()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.valueOf(this.a).hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        GregorianCalendar gregorianCalendar = new GregorianCalendar(e);
        long j = this.a;
        Integer num = this.g;
        if (num != null) {
            j += num.longValue() * 60000;
        }
        gregorianCalendar.setTimeInMillis(j);
        try {
            d(sb, gregorianCalendar.get(1), 4);
            sb.append('-');
            d(sb, gregorianCalendar.get(2) + 1, 2);
            sb.append('-');
            d(sb, gregorianCalendar.get(5), 2);
            if (!this.f) {
                sb.append('T');
                d(sb, gregorianCalendar.get(11), 2);
                sb.append(':');
                d(sb, gregorianCalendar.get(12), 2);
                sb.append(':');
                d(sb, gregorianCalendar.get(13), 2);
                if (gregorianCalendar.isSet(14)) {
                    sb.append('.');
                    d(sb, gregorianCalendar.get(14), 3);
                }
            }
            Integer num2 = this.g;
            if (num2 != null) {
                if (num2.intValue() == 0) {
                    sb.append('Z');
                } else {
                    int intValue = this.g.intValue();
                    if (this.g.intValue() > 0) {
                        sb.append('+');
                    } else {
                        sb.append('-');
                        intValue = -intValue;
                    }
                    d(sb, intValue / 60, 2);
                    sb.append(':');
                    d(sb, intValue % 60, 2);
                }
            }
            return sb.toString();
        } catch (ArrayIndexOutOfBoundsException e2) {
            throw new RuntimeException(e2);
        }
    }

    public advi(long j) {
        this.f = false;
        this.g = null;
        this.a = j;
        this.g = 0;
    }

    private advi(Date date, TimeZone timeZone) {
        this.a = 0L;
        this.f = false;
        this.g = null;
        this.a = date.getTime();
        this.g = Integer.valueOf(timeZone.getOffset(date.getTime()) / 60000);
    }
}
