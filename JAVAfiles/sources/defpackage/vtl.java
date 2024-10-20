package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public enum vtl {
    NAME_CHANGE(0),
    REMOVE_USER_BY_ALL(1),
    REMOVE_USER_BY_ADMIN(2),
    ICON_CHANGE(3);

    final long e;

    vtl(int i) {
        d.s(true);
        this.e = 1 << i;
    }
}
