package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum eng {
    DESTROYED,
    INITIALIZED,
    CREATED,
    STARTED,
    RESUMED;

    public final boolean a(eng engVar) {
        engVar.getClass();
        if (compareTo(engVar) >= 0) {
            return true;
        }
        return false;
    }
}
