package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mfs {
    public final akul a;
    public final amwt b;
    public final amhv c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final amip j;
    public final int k;
    public final alor l;
    public final alor m;
    public final alor n;
    public final int o;
    public final alpt p;

    public mfs() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof mfs) {
            mfs mfsVar = (mfs) obj;
            if (this.a.equals(mfsVar.a) && this.b.equals(mfsVar.b) && this.c.equals(mfsVar.c) && this.d == mfsVar.d && this.e == mfsVar.e && this.f == mfsVar.f && this.g == mfsVar.g && this.h == mfsVar.h && this.i == mfsVar.i && this.j.equals(mfsVar.j) && this.k == mfsVar.k && this.l.equals(mfsVar.l) && this.m.equals(mfsVar.m) && this.n.equals(mfsVar.n) && this.o == mfsVar.o && this.p.equals(mfsVar.p)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d) * 1000003) ^ this.e) * 1000003) ^ this.f) * 1000003) ^ this.g) * 1000003) ^ this.h) * 1000003) ^ this.i) * 1000003) ^ this.j.hashCode()) * 1000003) ^ this.k) * 1000003) ^ this.l.hashCode()) * 1000003) ^ this.m.hashCode()) * 1000003) ^ this.n.hashCode()) * 1000003) ^ this.o) * 1000003) ^ this.p.hashCode();
    }

    public final String toString() {
        alpt alptVar = this.p;
        alor alorVar = this.n;
        alor alorVar2 = this.m;
        alor alorVar3 = this.l;
        amip amipVar = this.j;
        amhv amhvVar = this.c;
        amwt amwtVar = this.b;
        return "SharedRecurringMetrics{engagementLevel=" + this.a.toString() + ", rcsAvailability=" + amwtVar.toString() + ", rcsUninitializedReason=" + amhvVar.toString() + ", activeRcsGroups1DayCount=" + this.d + ", activeRcsGroups28DayCount=" + this.e + ", outgoingRcsFtSuccess1DayCount=" + this.f + ", outgoingRcsFtSuccess28DaysCount=" + this.g + ", activeShortCodeConversations1DayCount=" + this.h + ", activeShortCodeConversations28DaysCount=" + this.i + ", happinessTrackingMode=" + amipVar.toString() + ", happinessTrackingDisabledReasons=" + this.k + ", rbmBotsFromInteractiveRbmConversations1Day=" + alorVar3.toString() + ", rbmBotsFromInteractiveRbmConversations7Days=" + alorVar2.toString() + ", rbmBotsFromInteractiveRbmConversations28Days=" + alorVar.toString() + ", messageCount=" + this.o + ", rcsAvailabilityForSim=" + alptVar.toString() + "}";
    }

    public mfs(akul akulVar, amwt amwtVar, amhv amhvVar, int i, int i2, int i3, int i4, int i5, int i6, amip amipVar, int i7, alor alorVar, alor alorVar2, alor alorVar3, int i8, alpt alptVar) {
        this.a = akulVar;
        if (amwtVar == null) {
            throw new NullPointerException("Null rcsAvailability");
        }
        this.b = amwtVar;
        if (amhvVar != null) {
            this.c = amhvVar;
            this.d = i;
            this.e = i2;
            this.f = i3;
            this.g = i4;
            this.h = i5;
            this.i = i6;
            if (amipVar != null) {
                this.j = amipVar;
                this.k = i7;
                if (alorVar != null) {
                    this.l = alorVar;
                    if (alorVar2 != null) {
                        this.m = alorVar2;
                        if (alorVar3 != null) {
                            this.n = alorVar3;
                            this.o = i8;
                            if (alptVar != null) {
                                this.p = alptVar;
                                return;
                            }
                            throw new NullPointerException("Null rcsAvailabilityForSim");
                        }
                        throw new NullPointerException("Null rbmBotsFromInteractiveRbmConversations28Days");
                    }
                    throw new NullPointerException("Null rbmBotsFromInteractiveRbmConversations7Days");
                }
                throw new NullPointerException("Null rbmBotsFromInteractiveRbmConversations1Day");
            }
            throw new NullPointerException("Null happinessTrackingMode");
        }
        throw new NullPointerException("Null rcsUninitializedReason");
    }
}
