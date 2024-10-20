package defpackage;

import android.content.Context;
import android.text.format.DateFormat;
import j$.time.Instant;
import j$.time.ZoneId;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lyr {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/scheduledsend/datetimeformatter/ScheduledSendDateTimeFormatter");
    public final xnv b;
    public final Context c;
    public final jat d;

    public lyr(xnv xnvVar, Context context, jat jatVar) {
        this.b = xnvVar;
        this.c = context;
        this.d = jatVar;
    }

    public static Locale c(Locale locale) {
        return new Locale.Builder().setLanguage(locale.getLanguage()).setRegion(locale.getCountry()).build();
    }

    /* JADX WARN: Type inference failed for: r7v11, types: [alhr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v16, types: [alhr, java.lang.Object] */
    public final String a(Instant instant) {
        SimpleDateFormat simpleDateFormat;
        Locale b = yhx.b(this.c);
        alvw d = a.d();
        d.X(alwp.a, "BugleScheduledSend");
        ((alvg) ((alvg) d).h("com/google/android/apps/messaging/scheduledsend/datetimeformatter/ScheduledSendDateTimeFormatter", "formatToTime", 94, "ScheduledSendDateTimeFormatter.java")).t("Locale for formatToTime: %s", b);
        if (c(b).equals(Locale.US)) {
            return new SimpleDateFormat(b(instant), Locale.US).format(Long.valueOf(instant.toEpochMilli()));
        }
        jat jatVar = this.d;
        long epochMilli = instant.toEpochMilli();
        if (yhx.b((Context) jatVar.a).equals(Locale.US)) {
            if (DateFormat.is24HourFormat((Context) jatVar.a)) {
                simpleDateFormat = (SimpleDateFormat) jatVar.e.get();
            } else {
                simpleDateFormat = (SimpleDateFormat) jatVar.g.get();
            }
            return simpleDateFormat.format(Long.valueOf(epochMilli));
        }
        return jatVar.s((Context) jatVar.a, epochMilli, 1);
    }

    public final String b(Instant instant) {
        if (DateFormat.is24HourFormat(this.c)) {
            return "H:mm z";
        }
        if (instant.atZone(ZoneId.systemDefault()).getMinute() == 0) {
            return "h aa z";
        }
        return "h:mm aa z";
    }
}
