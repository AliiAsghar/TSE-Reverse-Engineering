package defpackage;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aldq {
    public static final Pattern a = Pattern.compile("(?i)(account|acct|ac|A/C)\\s*((number|no|n)\\.?\\s+)?([\\*X0-9]+[0-9]{4,})");
    public static final Pattern b = Pattern.compile("(?i)([0-9]{4,}[*X]{4,}[0-9]{4,})");

    public static List a(Pattern pattern, String str, int i) {
        Matcher matcher = pattern.matcher(str);
        alob alobVar = new alob();
        while (matcher.find()) {
            if (matcher.groupCount() >= i) {
                aozy createBuilder = aqby.a.createBuilder();
                int start = matcher.start(i);
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                ((aqby) createBuilder.b).g = start;
                int end = matcher.end(i);
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                ((aqby) createBuilder.b).h = end;
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                ((aqby) createBuilder.b).d = aqas.f(10);
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                ((aqby) createBuilder.b).e = "ACCOUNT_NUMBER";
                aozy createBuilder2 = aqcv.a.createBuilder();
                String group = matcher.group(i);
                if (!createBuilder2.b.isMutable()) {
                    createBuilder2.u();
                }
                aqcv aqcvVar = (aqcv) createBuilder2.b;
                group.getClass();
                aqcvVar.b = group;
                aqcv aqcvVar2 = (aqcv) createBuilder2.s();
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                aqby aqbyVar = (aqby) createBuilder.b;
                aqcvVar2.getClass();
                aqbyVar.c = aqcvVar2;
                aqbyVar.b = 13;
                alobVar.h((aqby) createBuilder.s());
            }
        }
        return alobVar.g();
    }
}
