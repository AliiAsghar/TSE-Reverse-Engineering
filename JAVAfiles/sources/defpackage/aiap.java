package defpackage;

import android.util.Log;
import j$.time.DateTimeException;
import j$.time.DayOfWeek;
import j$.time.LocalDate;
import j$.time.LocalTime;
import j$.time.OffsetDateTime;
import j$.time.ZoneOffset;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aiap {
    public static final /* synthetic */ int a = 0;
    private static final alor b;
    private static final aiak c;

    static {
        alok alokVar = new alok();
        alokVar.h(DayOfWeek.SUNDAY, aiac.SUNDAY);
        alokVar.h(DayOfWeek.MONDAY, aiac.MONDAY);
        alokVar.h(DayOfWeek.TUESDAY, aiac.TUESDAY);
        alokVar.h(DayOfWeek.WEDNESDAY, aiac.WEDNESDAY);
        alokVar.h(DayOfWeek.THURSDAY, aiac.THURSDAY);
        alokVar.h(DayOfWeek.FRIDAY, aiac.FRIDAY);
        alokVar.h(DayOfWeek.SATURDAY, aiac.SATURDAY);
        b = alokVar.b();
        c = aiak.a(23, 59);
    }

    static long a(ZoneOffset zoneOffset, aiaj aiajVar, int i, int i2) {
        return OffsetDateTime.of(LocalDate.of(aiajVar.a, aiajVar.b, aiajVar.c), LocalTime.of(i, i2), zoneOffset).toInstant().toEpochMilli();
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x007a, code lost:
    
        if (defpackage.alst.d(java.lang.Long.valueOf(a(r0, r6, 0, 0)), java.lang.Long.valueOf(a(r0, r5, 23, 59))).a(java.lang.Long.valueOf(r12)) != false) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Boolean b(defpackage.aiba r11, long r12) {
        /*
            Method dump skipped, instructions count: 431
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aiap.b(aiba, long):java.lang.Boolean");
    }

    private static ZoneOffset c(int i) {
        try {
            return ZoneOffset.ofTotalSeconds(i * 60);
        } catch (DateTimeException unused) {
            Log.w("Places OpeningHoursUtil", String.format("Cannot find timezone that associates with utcOffsetMinutes %d from Place object.", Integer.valueOf(i)));
            return null;
        }
    }
}
