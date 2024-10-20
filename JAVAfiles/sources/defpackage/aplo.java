package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum aplo implements apak {
    SOURCE_UNKNOWN(0),
    GROUP_FULL_STATE_NOTIFICATION(1),
    GROUP_EVENT_NOTIFICATION(2),
    LOCAL_RCS_GROUP_CREATION(3),
    GROUP_FULL_STATE_UPDATE_NOTIFICATION(4);

    public final int f;

    aplo(int i) {
        this.f = i;
    }

    @Override // defpackage.apak
    public final int a() {
        return this.f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f);
    }
}
