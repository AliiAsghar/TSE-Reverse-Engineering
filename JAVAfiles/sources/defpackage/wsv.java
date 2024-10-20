package defpackage;

import com.google.android.apps.messaging.shared.scheduledsend.database.ScheduledSendTable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class wsv {
    public static final agpj a;

    static {
        wtc b = ScheduledSendTable.b();
        b.w("SCHEDULED_MESSAGES_COUNT_SUBQUERY");
        b.c((wsz) ScheduledSendTable.d.g);
        b.d(new wmi(5));
        a = b.b().r();
    }
}
