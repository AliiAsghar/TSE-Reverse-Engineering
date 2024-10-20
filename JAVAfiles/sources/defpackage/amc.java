package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class amc implements and {
    private final and a;
    private final int b;

    public amc(and andVar, int i) {
        this.a = andVar;
        this.b = i;
    }

    @Override // defpackage.and
    public final int a(dqv dqvVar) {
        if (ank.b(this.b, 32)) {
            return this.a.a(dqvVar);
        }
        return 0;
    }

    @Override // defpackage.and
    public final int b(dqv dqvVar, drk drkVar) {
        int i;
        if (drkVar == drk.a) {
            i = 8;
        } else {
            i = 2;
        }
        if (ank.b(this.b, i)) {
            return this.a.b(dqvVar, drkVar);
        }
        return 0;
    }

    @Override // defpackage.and
    public final int c(dqv dqvVar, drk drkVar) {
        int i;
        if (drkVar == drk.a) {
            i = 4;
        } else {
            i = 1;
        }
        if (ank.b(this.b, i)) {
            return this.a.c(dqvVar, drkVar);
        }
        return 0;
    }

    @Override // defpackage.and
    public final int d(dqv dqvVar) {
        if (ank.b(this.b, 16)) {
            return this.a.d(dqvVar);
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof amc)) {
            return false;
        }
        amc amcVar = (amc) obj;
        if (d.F(this.a, amcVar.a) && a.bA(this.b, amcVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        sb.append(this.a);
        sb.append(" only ");
        StringBuilder sb2 = new StringBuilder("WindowInsetsSides(");
        StringBuilder sb3 = new StringBuilder();
        int i = this.b;
        if ((i & 9) == 9) {
            ank.a(sb3, "Start");
        }
        if ((i & 10) == 10) {
            ank.a(sb3, "Left");
        }
        if ((i & 16) == 16) {
            ank.a(sb3, "Top");
        }
        if ((i & 6) == 6) {
            ank.a(sb3, "End");
        }
        if ((i & 5) == 5) {
            ank.a(sb3, "Right");
        }
        if ((i & 32) == 32) {
            ank.a(sb3, "Bottom");
        }
        sb2.append(sb3.toString());
        sb2.append(')');
        sb.append((Object) sb2.toString());
        sb.append(')');
        return sb.toString();
    }
}
