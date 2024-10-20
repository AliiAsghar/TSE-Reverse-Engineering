package j$.nio.channels;

import j$.nio.file.attribute.m;
import j$.nio.file.attribute.p;
import j$.time.format.H;
import java.nio.file.attribute.FileAttribute;
import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.TimeZone;
import java.util.function.DoubleConsumer;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class c {
    /* JADX WARN: Type inference failed for: r0v0, types: [j$.util.function.c] */
    public static j$.util.function.c a(final DoubleConsumer doubleConsumer, final DoubleConsumer doubleConsumer2) {
        doubleConsumer2.getClass();
        return new DoubleConsumer() { // from class: j$.util.function.c
            @Override // java.util.function.DoubleConsumer
            public final void accept(double d) {
                DoubleConsumer.this.accept(d);
                doubleConsumer2.accept(d);
            }

            public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer3) {
                return j$.nio.channels.c.a(this, doubleConsumer3);
            }
        };
    }

    private static String b(int i, String str, Locale locale) {
        TimeZone timeZone = TimeZone.getTimeZone("UTC");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, locale);
        simpleDateFormat.setTimeZone(timeZone);
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeZone(timeZone);
        calendar.set(2016, 1, i, 0, 0, 0);
        return simpleDateFormat.format(calendar.getTime());
    }

    private static String c(int i, String str, Locale locale) {
        TimeZone timeZone = TimeZone.getTimeZone("UTC");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, locale);
        simpleDateFormat.setTimeZone(timeZone);
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeZone(timeZone);
        calendar.set(0, i, 0, 0, 0, 0);
        return simpleDateFormat.format(calendar.getTime());
    }

    public static void d(HashMap hashMap, DateFormatSymbols dateFormatSymbols, Locale locale) {
        int length = dateFormatSymbols.getWeekdays().length;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        for (int i = 1; i <= length; i++) {
            String b = b(i, "cccc", locale);
            long j = i;
            linkedHashMap.put(Long.valueOf(j), b);
            linkedHashMap2.put(Long.valueOf(j), b.substring(0, Character.charCount(b.codePointAt(0))));
            linkedHashMap3.put(Long.valueOf(j), b(i, "ccc", locale));
        }
        if (length > 0) {
            hashMap.put(H.FULL_STANDALONE, linkedHashMap);
            hashMap.put(H.NARROW_STANDALONE, linkedHashMap2);
            hashMap.put(H.SHORT_STANDALONE, linkedHashMap3);
        }
    }

    public static void e(HashMap hashMap, DateFormatSymbols dateFormatSymbols, Locale locale) {
        int length = dateFormatSymbols.getMonths().length;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        for (int i = 1; i <= length; i++) {
            String c = c(i, "LLLL", locale);
            long j = i;
            linkedHashMap.put(Long.valueOf(j), c);
            linkedHashMap2.put(Long.valueOf(j), c.substring(0, Character.charCount(c.codePointAt(0))));
            linkedHashMap3.put(Long.valueOf(j), c(i, "LLL", locale));
        }
        if (length > 0) {
            hashMap.put(H.FULL_STANDALONE, linkedHashMap);
            hashMap.put(H.NARROW_STANDALONE, linkedHashMap2);
            hashMap.put(H.SHORT_STANDALONE, linkedHashMap3);
        }
    }

    public static /* synthetic */ int f(long j) {
        int i = (int) j;
        if (j == i) {
            return i;
        }
        throw new ArithmeticException();
    }

    public static /* synthetic */ long g(long j, long j2) {
        boolean z;
        long j3 = j + j2;
        boolean z2 = false;
        if ((j2 ^ j) < 0) {
            z = true;
        } else {
            z = false;
        }
        if ((j ^ j3) >= 0) {
            z2 = true;
        }
        if (z | z2) {
            return j3;
        }
        throw new ArithmeticException();
    }

    public static /* synthetic */ m[] h(FileAttribute[] fileAttributeArr) {
        if (fileAttributeArr == null) {
            return null;
        }
        int length = fileAttributeArr.length;
        m[] mVarArr = new m[length];
        for (int i = 0; i < length; i++) {
            mVarArr[i] = p.a(fileAttributeArr[i]);
        }
        return mVarArr;
    }

    public static /* synthetic */ FileAttribute[] i(m[] mVarArr) {
        if (mVarArr == null) {
            return null;
        }
        int length = mVarArr.length;
        FileAttribute[] fileAttributeArr = new FileAttribute[length];
        for (int i = 0; i < length; i++) {
            fileAttributeArr[i] = p.c(mVarArr[i]);
        }
        return fileAttributeArr;
    }

    public static /* synthetic */ long j(long j, long j2) {
        boolean z;
        int numberOfLeadingZeros = Long.numberOfLeadingZeros(~j2) + Long.numberOfLeadingZeros(j2) + Long.numberOfLeadingZeros(~j) + Long.numberOfLeadingZeros(j);
        if (numberOfLeadingZeros > 65) {
            return j * j2;
        }
        if (numberOfLeadingZeros >= 64) {
            boolean z2 = false;
            if (j >= 0) {
                z = true;
            } else {
                z = false;
            }
            if (j2 != Long.MIN_VALUE) {
                z2 = true;
            }
            if (z | z2) {
                long j3 = j * j2;
                if (j == 0 || j3 / j == j2) {
                    return j3;
                }
            }
        }
        throw new ArithmeticException();
    }

    public static /* synthetic */ long k(long j, long j2) {
        boolean z;
        long j3 = j - j2;
        boolean z2 = false;
        if ((j2 ^ j) >= 0) {
            z = true;
        } else {
            z = false;
        }
        if ((j ^ j3) >= 0) {
            z2 = true;
        }
        if (z | z2) {
            return j3;
        }
        throw new ArithmeticException();
    }
}
