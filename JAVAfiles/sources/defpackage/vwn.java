package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vwn {
    public final alog a;
    public final alog b;

    public vwn() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vwn) {
            vwn vwnVar = (vwn) obj;
            if (alzz.at(this.a, vwnVar.a) && alzz.at(this.b, vwnVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        alog alogVar = this.b;
        return "UsersToUpdate{usersWhoLeft=" + this.a.toString() + ", usersWhoJoined=" + String.valueOf(alogVar) + "}";
    }

    public vwn(alog alogVar, alog alogVar2) {
        if (alogVar == null) {
            throw new NullPointerException("Null usersWhoLeft");
        }
        this.a = alogVar;
        if (alogVar2 != null) {
            this.b = alogVar2;
            return;
        }
        throw new NullPointerException("Null usersWhoJoined");
    }
}
