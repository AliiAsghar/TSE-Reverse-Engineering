package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum aots implements apak {
    SOURCE_UNKNOWN(0),
    SOURCE_SYSTEM_SETTINGS(1),
    SOURCE_QUICK_SETTINGS(2),
    SOURCE_LOCATION_ACCURACY(3),
    SOURCE_LOCATION_SETTINGS_DIALOG(4),
    SOURCE_LOCATION_OFF_WARNING_DIALOG(5),
    SOURCE_SETUP_WIZARD(6),
    SOURCE_ADD_ACCOUNT(7),
    SOURCE_EMERGENCY_LOCATION_SERVICE(8),
    SOURCE_FAMILY_LINK(9),
    SOURCE_TEST(10),
    SOURCE_DEMO_USER(11);

    public final int m;

    aots(int i) {
        this.m = i;
    }

    @Override // defpackage.apak
    public final int a() {
        return this.m;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.m);
    }
}
