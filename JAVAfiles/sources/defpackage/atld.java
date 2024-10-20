package defpackage;

import j$.util.DesugarTimeZone;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.GregorianCalendar;

/* compiled from: PG */
/* loaded from: classes.dex */
final class atld {
    private static final NumberFormat a;
    private static final NumberFormat b;

    static {
        DecimalFormat decimalFormat = new DecimalFormat();
        a = decimalFormat;
        decimalFormat.setMinimumIntegerDigits(2);
        DecimalFormat decimalFormat2 = new DecimalFormat();
        b = decimalFormat2;
        decimalFormat2.setMinimumIntegerDigits(4);
        decimalFormat2.setGroupingUsed(false);
    }

    public static String a(Date date) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar(DesugarTimeZone.getTimeZone("UTC"));
        StringBuffer stringBuffer = new StringBuffer();
        gregorianCalendar.setTime(date);
        stringBuffer.append(b.format(gregorianCalendar.get(1)));
        NumberFormat numberFormat = a;
        stringBuffer.append(numberFormat.format(gregorianCalendar.get(2) + 1));
        stringBuffer.append(numberFormat.format(gregorianCalendar.get(5)));
        stringBuffer.append(numberFormat.format(gregorianCalendar.get(11)));
        stringBuffer.append(numberFormat.format(gregorianCalendar.get(12)));
        stringBuffer.append(numberFormat.format(gregorianCalendar.get(13)));
        return stringBuffer.toString();
    }
}
