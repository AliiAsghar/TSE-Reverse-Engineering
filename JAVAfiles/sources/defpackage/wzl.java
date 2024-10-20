package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class wzl {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/shared/sms/SmsReleaseStorage");
    public final xnv b;
    public final wzs c;
    public final armf d;

    static {
        Pattern.compile("([1-9]+\\d*)(w|m|y)");
        TimeUnit.DAYS.toMillis(7L);
        TimeUnit.DAYS.toMillis(30L);
        TimeUnit.DAYS.toMillis(365L);
    }

    public wzl(xnv xnvVar, wzs wzsVar, armf armfVar) {
        this.b = xnvVar;
        this.c = wzsVar;
        this.d = armfVar;
    }
}
