package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum amqd implements apak {
    UNKNOWN_CLOSING_SOURCE(0),
    BACK_BUTTON(1),
    BACK_ICON(2),
    KEYBOARD_OPEN(3),
    SELECTION(4),
    DISMISSAL(5),
    MESSAGE_SELECTED(6);

    public final int h;

    amqd(int i2) {
        this.h = i2;
    }

    @Override // defpackage.apak
    public final int a() {
        return this.h;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.h);
    }
}
