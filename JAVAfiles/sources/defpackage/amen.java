package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum amen implements apak {
    UNKNOWN_BUGLE_OPEN_CAUSE(0),
    VIA_LAUNCH_ICON(1),
    VIA_NOTIFICATION(2),
    VIA_SHARING_INTENT(3),
    VIA_LOCKSCREEN(4),
    VIA_WIDGET(5),
    VIA_OTHER_APPS_WITHOUT_SHARING_DATA(6),
    VIA_DEFAULT(7),
    VIA_SHORTCUT(8),
    VIA_TRAMPOLINE(9),
    VIA_ASSISTANT_APP_CONTROL(10);

    public final int l;

    amen(int i) {
        this.l = i;
    }

    @Override // defpackage.apak
    public final int a() {
        return this.l;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.l);
    }
}
