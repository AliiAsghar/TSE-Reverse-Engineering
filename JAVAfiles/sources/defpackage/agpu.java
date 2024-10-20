package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agpu {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final agni d;
    public final String e;
    public final alpt f;

    public agpu() {
        throw null;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof agpu) {
            agpu agpuVar = (agpu) obj;
            if (this.a == agpuVar.a && this.b == agpuVar.b && this.c == agpuVar.c && this.d.equals(agpuVar.d) && ((str = this.e) != null ? str.equals(agpuVar.e) : agpuVar.e == null) && this.f.equals(agpuVar.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2;
        int hashCode;
        int i3 = 1237;
        if (true != this.a) {
            i = 1237;
        } else {
            i = 1231;
        }
        if (true != this.b) {
            i2 = 1237;
        } else {
            i2 = 1231;
        }
        int i4 = i ^ 1000003;
        if (true == this.c) {
            i3 = 1231;
        }
        int hashCode2 = (((((i4 * 1000003) ^ i2) * 1000003) ^ i3) * 1000003) ^ this.d.hashCode();
        String str = this.e;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return ((((hashCode2 * 1000003) ^ hashCode) * 1000003) ^ this.f.hashCode()) * (-721379959);
    }

    public final String toString() {
        alpt alptVar = this.f;
        return "UpdateParameters{disableTableFilters=" + this.a + ", omitUnchangedRows=" + this.b + ", exemptFromQueryPlanChecking=" + this.c + ", loggingTag=" + String.valueOf(this.d) + ", databaseName=" + this.e + ", autoUpdateColumns=" + String.valueOf(alptVar) + ", conflictAlgorithm=0, valuesExpression=null}";
    }

    public agpu(boolean z, boolean z2, boolean z3, agni agniVar, String str, alpt alptVar) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = agniVar;
        this.e = str;
        this.f = alptVar;
    }
}
