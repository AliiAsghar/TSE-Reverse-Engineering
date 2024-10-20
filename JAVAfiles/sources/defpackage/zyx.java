package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zyx {
    public final String a;
    public final alog b;
    public final aehz c;

    public zyx(String str, alog alogVar, aehz aehzVar) {
        str.getClass();
        this.a = str;
        this.b = alogVar;
        this.c = aehzVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zyx)) {
            return false;
        }
        zyx zyxVar = (zyx) obj;
        if (d.F(this.a, zyxVar.a) && d.F(this.b, zyxVar.b) && d.F(this.c, zyxVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.a.hashCode() * 31) + this.b.hashCode();
        aehz aehzVar = this.c;
        if (aehzVar == null) {
            hashCode = 0;
        } else {
            hashCode = aehzVar.hashCode();
        }
        return (hashCode2 * 31) + hashCode;
    }

    public final String toString() {
        return "GroupMembersUiData(membersCounterText=" + this.a + ", members=" + this.b + ", groupAddAction=" + this.c + ")";
    }
}
