package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akge {
    public final akfb a;
    public final Object b;
    public final akgo c;
    public final long d;
    public final akgf e;
    public final int f;

    public akge() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof akge) {
            akge akgeVar = (akge) obj;
            if (this.a.equals(akgeVar.a) && this.b.equals(akgeVar.b) && this.c.equals(akgeVar.c) && this.d == akgeVar.d && this.f == akgeVar.f && this.e.equals(akgeVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
        int i = this.f;
        a.aS(i);
        long j = this.d;
        return (((((hashCode * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ i) * 1000003) ^ this.e.hashCode();
    }

    public final String toString() {
        String str;
        int i = this.f;
        akgo akgoVar = this.c;
        Object obj = this.b;
        String obj2 = this.a.toString();
        String obj3 = obj.toString();
        String obj4 = akgoVar.toString();
        if (i != 1) {
            if (i != 2) {
                str = "SUBSCRIBE";
            } else {
                str = "FORCE_REFRESH";
            }
        } else {
            str = "UNDEFINED";
        }
        return "SubscribeCallState{dataSource=" + obj2 + ", contentKey=" + obj3 + ", tolerance=" + obj4 + ", index=" + this.d + ", subscribeCallType=" + str + ", subscribeSequenceState=" + this.e.toString() + "}";
    }

    public akge(akfb akfbVar, Object obj, akgo akgoVar, long j, int i, akgf akgfVar) {
        this.a = akfbVar;
        if (obj == null) {
            throw new NullPointerException("Null contentKey");
        }
        this.b = obj;
        this.c = akgoVar;
        this.d = j;
        this.f = i;
        this.e = akgfVar;
    }
}
