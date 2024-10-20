package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ifx {
    public final ascv a;

    public ifx(ascv ascvVar) {
        ascvVar.getClass();
        this.a = ascvVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof ifx) && d.F(this.a, ((ifx) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "BlockedParticipantsScreenUiData(blockedParticipantListFlow=" + this.a + ")";
    }
}
