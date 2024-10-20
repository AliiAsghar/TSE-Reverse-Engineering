package defpackage;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acdj {
    public static final DecimalFormat a = new DecimalFormat(".000000", DecimalFormatSymbols.getInstance(Locale.ROOT));
    public static final DecimalFormat b;

    static {
        DecimalFormat decimalFormat = new DecimalFormat(".##", DecimalFormatSymbols.getInstance(Locale.ROOT));
        b = decimalFormat;
        decimalFormat.setRoundingMode(RoundingMode.DOWN);
    }
}
