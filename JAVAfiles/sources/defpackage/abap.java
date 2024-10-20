package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abap extends abaq {
    private final abas a;

    public abap(abas abasVar) {
        this.a = abasVar;
    }

    @Override // defpackage.abaq
    public final abas a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof abaq) {
            return this.a.equals(((abaq) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "ReminderDateTimePickerEvent{reminderDialogData=" + this.a.toString() + "}";
    }
}
