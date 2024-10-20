package defpackage;

import j$.util.DesugarTimeZone;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aorh {
    private static final TimeZone a = DesugarTimeZone.getTimeZone("UTC");

    public static Date a(String str, ParsePosition parsePosition) {
        String bW;
        int i;
        int i2;
        int i3;
        int i4;
        int length;
        TimeZone timeZone;
        char charAt;
        int length2;
        try {
            int index = parsePosition.getIndex();
            int i5 = index + 4;
            int b = b(str, index, i5);
            if (c(str, i5, '-')) {
                i5 = index + 5;
            }
            int i6 = i5 + 2;
            int b2 = b(str, i5, i6);
            if (c(str, i6, '-')) {
                i6 = i5 + 3;
            }
            int i7 = i6 + 2;
            int b3 = b(str, i6, i7);
            boolean c = c(str, i7, 'T');
            if (!c && str.length() <= i7) {
                GregorianCalendar gregorianCalendar = new GregorianCalendar(b, b2 - 1, b3);
                gregorianCalendar.setLenient(false);
                parsePosition.setIndex(i7);
                return gregorianCalendar.getTime();
            }
            if (c) {
                int i8 = i6 + 5;
                int b4 = b(str, i6 + 3, i8);
                if (c(str, i8, ':')) {
                    i8 = i6 + 6;
                }
                int i9 = i8 + 2;
                int b5 = b(str, i8, i9);
                if (c(str, i9, ':')) {
                    i9 = i8 + 3;
                }
                if (str.length() > i9 && (charAt = str.charAt(i9)) != 'Z' && charAt != '+' && charAt != '-') {
                    int i10 = i9 + 2;
                    i4 = b(str, i9, i10);
                    if (i4 > 59 && i4 < 63) {
                        i4 = 59;
                    }
                    if (c(str, i10, '.')) {
                        int i11 = i9 + 3;
                        for (int i12 = i9 + 4; i12 < str.length(); i12++) {
                            char charAt2 = str.charAt(i12);
                            if (charAt2 >= '0' && charAt2 <= '9') {
                            }
                            length2 = i12;
                        }
                        length2 = str.length();
                        int min = Math.min(length2, i9 + 6);
                        i3 = b(str, i11, min);
                        int i13 = min - i11;
                        if (i13 != 1) {
                            if (i13 == 2) {
                                i3 *= 10;
                            }
                        } else {
                            i3 *= 100;
                        }
                        i = b4;
                        i7 = length2;
                        i2 = b5;
                    } else {
                        i = b4;
                        i7 = i10;
                        i2 = b5;
                        i3 = 0;
                    }
                } else {
                    i2 = b5;
                    i3 = 0;
                    i4 = 0;
                    i7 = i9;
                    i = b4;
                }
            } else {
                i = 0;
                i2 = 0;
                i3 = 0;
                i4 = 0;
            }
            if (str.length() > i7) {
                char charAt3 = str.charAt(i7);
                if (charAt3 == 'Z') {
                    timeZone = a;
                    length = i7 + 1;
                } else {
                    if (charAt3 != '+' && charAt3 != '-') {
                        throw new IndexOutOfBoundsException("Invalid time zone indicator '" + charAt3 + "'");
                    }
                    String substring = str.substring(i7);
                    if (substring.length() < 5) {
                        substring = hht.h(substring, "00");
                    }
                    length = i7 + substring.length();
                    if (!substring.equals("+0000") && !substring.equals("+00:00")) {
                        String cp = a.cp(substring, "GMT");
                        TimeZone timeZone2 = DesugarTimeZone.getTimeZone(cp);
                        String id = timeZone2.getID();
                        if (!id.equals(cp) && !id.replace(":", "").equals(cp)) {
                            throw new IndexOutOfBoundsException("Mismatching time zone indicator: " + cp + " given, resolves to " + timeZone2.getID());
                        }
                        timeZone = timeZone2;
                    }
                    timeZone = a;
                }
                GregorianCalendar gregorianCalendar2 = new GregorianCalendar(timeZone);
                gregorianCalendar2.setLenient(false);
                gregorianCalendar2.set(1, b);
                gregorianCalendar2.set(2, b2 - 1);
                gregorianCalendar2.set(5, b3);
                gregorianCalendar2.set(11, i);
                gregorianCalendar2.set(12, i2);
                gregorianCalendar2.set(13, i4);
                gregorianCalendar2.set(14, i3);
                parsePosition.setIndex(length);
                return gregorianCalendar2.getTime();
            }
            throw new IllegalArgumentException("No time zone indicator");
        } catch (IllegalArgumentException | IndexOutOfBoundsException e) {
            if (str == null) {
                bW = null;
            } else {
                bW = a.bW(str, "\"", "\"");
            }
            String message = e.getMessage();
            if (message == null || message.isEmpty()) {
                message = "(" + e.getClass().getName() + ")";
            }
            ParseException parseException = new ParseException(a.cg(message, bW, "Failed to parse date [", "]: "), parsePosition.getIndex());
            parseException.initCause(e);
            throw parseException;
        }
    }

    private static int b(String str, int i, int i2) {
        int i3;
        int i4;
        if (i >= 0 && i2 <= str.length() && i <= i2) {
            if (i < i2) {
                i4 = i + 1;
                int digit = Character.digit(str.charAt(i), 10);
                if (digit >= 0) {
                    i3 = -digit;
                } else {
                    throw new NumberFormatException("Invalid number: ".concat(String.valueOf(str.substring(i, i2))));
                }
            } else {
                i3 = 0;
                i4 = i;
            }
            while (i4 < i2) {
                int i5 = i4 + 1;
                int digit2 = Character.digit(str.charAt(i4), 10);
                if (digit2 >= 0) {
                    i3 = (i3 * 10) - digit2;
                    i4 = i5;
                } else {
                    throw new NumberFormatException("Invalid number: ".concat(String.valueOf(str.substring(i, i2))));
                }
            }
            return -i3;
        }
        throw new NumberFormatException(str);
    }

    private static boolean c(String str, int i, char c) {
        if (i < str.length() && str.charAt(i) == c) {
            return true;
        }
        return false;
    }
}
