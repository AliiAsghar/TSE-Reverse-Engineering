package defpackage;

import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akou {
    public final Set a;
    public final long b;
    public final algw c;

    public akou() {
        throw null;
    }

    public static akou a(akou akouVar, akou akouVar2) {
        albo.T(akouVar.a.equals(akouVar2.a));
        HashSet hashSet = new HashSet();
        Set set = akouVar.a;
        algw algwVar = alfd.a;
        aktp.v(set, hashSet);
        long min = Math.min(akouVar.b, akouVar2.b);
        algw algwVar2 = akouVar.c;
        boolean f = algwVar2.f();
        algw algwVar3 = akouVar2.c;
        if (f && algwVar3.f()) {
            algwVar = algw.i(Long.valueOf(Math.min(((Long) algwVar2.b()).longValue(), ((Long) algwVar3.b()).longValue())));
        } else if (!algwVar2.f()) {
            if (algwVar3.f()) {
                algwVar = algwVar3;
            }
        } else {
            algwVar = algwVar2;
        }
        return new akou(hashSet, min, algwVar);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof akou) {
            akou akouVar = (akou) obj;
            if (this.a.equals(akouVar.a) && this.b == akouVar.b && this.c.equals(akouVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() ^ 1000003;
        long j = this.b;
        return (((hashCode * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        algw algwVar = this.c;
        return "SyncSchedule{constraints=" + this.a.toString() + ", nextSyncTime=" + this.b + ", ignoreFirstConstraintTime=" + String.valueOf(algwVar) + "}";
    }

    public akou(Set set, long j, algw algwVar) {
        this.a = set;
        this.b = j;
        if (algwVar == null) {
            throw new NullPointerException("Null ignoreFirstConstraintTime");
        }
        this.c = algwVar;
    }
}
