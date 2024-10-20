package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum amxr implements apak {
    UNDEFINED_EVENT(0),
    REQUEST_BUGLE_DATABASE_RESTORE(1),
    REQUEST_ATTACHMENTS_RESTORE(2),
    COMPLETE_RESTORE(3),
    DO_COMPLETE_RESTORE(4),
    DO_BUGLE_DATABASE_RESTORE(5),
    DO_ATTACHMENTS_RESTORE(6),
    REQUEST_RESTORE_AFTER_APP_UPDATE(7),
    INITIALIZE_RESTORE_WORKFLOW(8),
    CLEAN_UP(9),
    COMPLETE_FROM_STALLED_RESTORE(10);

    public final int l;

    amxr(int i) {
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
