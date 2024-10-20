package defpackage;

import java.util.HashMap;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class alds {
    private static final alog d = alog.C("USD", "INR", "SGD", "GBP", "AED", "EUR", "CAD", "HKD", "JPY", "AUD", "CHF", "KRW", "ZAR", "THB");
    public static final Pattern a = Pattern.compile("([0-9]{1,3}[,\\s]?)*[0-9]{1,3}(\\.[0-9]+)?");
    public static final Pattern b = Pattern.compile("(?i)\\(?(\\$|usd|inr|sgd|gbp|aed|eur|cad|hkd|jpy|aud|chf|krw|jye|zar|thb|rs|cr)[\\.:]?\\)?\\s*[\\{\\(]?(<MONEY_[0-9]+>)[\\}\\)]?");
    public static final Pattern c = Pattern.compile("(?i)[\\{\\(]?(<MONEY_[0-9]+>)[\\}\\)]?\\s*(\\$|usd|inr|sgd|gbp|aed|eur|cad|hkd|jpy|aud|chf|krw|jye|zar|thb|rs|cr)");
    private static final Pattern e = Pattern.compile("\\s|,");

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.CharSequence, java.lang.Object] */
    public static void a(alob alobVar, Matcher matcher, HashMap hashMap, int i, int i2) {
        aspl asplVar;
        while (matcher.find()) {
            if (matcher.groupCount() >= 2 && (asplVar = (aspl) hashMap.get(matcher.group(i))) != null) {
                try {
                    double parseDouble = Double.parseDouble(e.matcher(asplVar.c).replaceAll("")) * 1000000.0d;
                    aozy createBuilder = aqby.a.createBuilder();
                    int start = matcher.start() - asplVar.a;
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    ((aqby) createBuilder.b).g = start;
                    int end = matcher.end() - asplVar.a;
                    int i3 = asplVar.b;
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    ((aqby) createBuilder.b).h = end - i3;
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    ((aqby) createBuilder.b).e = "MONEY";
                    aozy createBuilder2 = aqcb.a.createBuilder();
                    aozy createBuilder3 = aqfo.a.createBuilder();
                    if (!createBuilder3.b.isMutable()) {
                        createBuilder3.u();
                    }
                    ((aqfo) createBuilder3.b).b = (long) parseDouble;
                    String upperCase = matcher.group(i2).toUpperCase(Locale.US);
                    String str = "USD";
                    if (!upperCase.startsWith("USD") && !upperCase.startsWith("$")) {
                        String str2 = "INR";
                        if (!upperCase.startsWith("CR") && !upperCase.startsWith("RS") && !upperCase.startsWith("INR")) {
                            str2 = "JPY";
                            if (!upperCase.startsWith("JYE") && !upperCase.startsWith("JPY")) {
                                alog alogVar = d;
                                int i4 = ((alsx) alogVar).c;
                                int i5 = 0;
                                while (i5 < i4) {
                                    String str3 = (String) alogVar.get(i5);
                                    i5++;
                                    if (upperCase.startsWith(str3)) {
                                        str = str3;
                                    }
                                }
                                throw new IllegalStateException("Money regex matches unknown currency");
                            }
                        }
                        str = str2;
                    }
                    if (!createBuilder3.b.isMutable()) {
                        createBuilder3.u();
                    }
                    aqfo aqfoVar = (aqfo) createBuilder3.b;
                    str.getClass();
                    aqfoVar.c = str;
                    if (!createBuilder2.b.isMutable()) {
                        createBuilder2.u();
                    }
                    aqcb aqcbVar = (aqcb) createBuilder2.b;
                    aqfo aqfoVar2 = (aqfo) createBuilder3.s();
                    aqfoVar2.getClass();
                    aqcbVar.c = aqfoVar2;
                    aqcbVar.b |= 1;
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    aqby aqbyVar = (aqby) createBuilder.b;
                    aqcb aqcbVar2 = (aqcb) createBuilder2.s();
                    aqcbVar2.getClass();
                    aqbyVar.c = aqcbVar2;
                    aqbyVar.b = 11;
                    alobVar.h((aqby) createBuilder.s());
                } catch (NumberFormatException unused) {
                    return;
                }
            }
        }
    }
}
