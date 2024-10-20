package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum amnf implements apak {
    UNKNOWN_TRIGGER(0),
    SMS_MMS_DB_RECREATED(1),
    SMS_MMS_DB_CREATED(5),
    SMS_MMS_DB_LOST(2),
    RECURRING_EVENT(3),
    OOBE_PERMISSIONS_HANDLER(4);

    public final int g;

    amnf(int i) {
        this.g = i;
    }

    @Override // defpackage.apak
    public final int a() {
        return this.g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.g);
    }
}
