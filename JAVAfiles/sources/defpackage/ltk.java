package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ltk {
    public final String a;
    public final int b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final arml g;
    public final arml h;
    public final arml i;

    public ltk(ParticipantsTable.BindData bindData) {
        String M = bindData.M();
        M.getClass();
        int p = bindData.p();
        String O = bindData.O();
        String J = bindData.J();
        String L = bindData.L();
        String K = bindData.K();
        this.a = M;
        this.b = p;
        this.c = O;
        this.d = J;
        this.e = L;
        this.f = K;
        this.g = armd.a(new lhb(this, 16));
        this.h = armd.a(new lhb(this, 14));
        this.i = armd.a(new lhb(this, 15));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ltk)) {
            return false;
        }
        ltk ltkVar = (ltk) obj;
        if (d.F(this.a, ltkVar.a) && this.b == ltkVar.b && d.F(this.c, ltkVar.c) && d.F(this.d, ltkVar.d) && d.F(this.e, ltkVar.e) && d.F(this.f, ltkVar.f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4 = this.a.hashCode() * 31;
        String str = this.c;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (((hashCode4 + this.b) * 31) + hashCode) * 31;
        String str2 = this.d;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str3 = this.e;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        String str4 = this.f;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return i4 + i;
    }

    public final String toString() {
        return "Participant(id=" + this.a + ", subId=" + this.b + ", normalizedDestination=" + this.c + ", displayDestination=" + this.d + ", fullName=" + this.e + ", firstName=" + this.f + ")";
    }
}
