package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class voq {
    public final vox a;
    public final boolean b;
    public final String c;
    public final String d;
    public final String e;
    private final String f;
    private final String g;
    private final String h;

    public voq() {
        this(null, null, null, null, false, 31);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof voq)) {
            return false;
        }
        voq voqVar = (voq) obj;
        if (d.F(this.f, voqVar.f) && d.F(this.g, voqVar.g) && d.F(this.h, voqVar.h) && this.a == voqVar.a && this.b == voqVar.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        String str = this.f;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        String str2 = this.g;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i2 = hashCode * 31;
        String str3 = this.h;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return ((((((i2 + hashCode2) * 31) + i) * 31) + this.a.hashCode()) * 31) + a.v(this.b);
    }

    public final String toString() {
        return "DefaultProfileName(defaultFirstName=" + this.f + ", defaultLastName=" + this.g + ", defaultDisplayName=" + this.h + ", source=" + this.a + ", hasName=" + this.b + ")";
    }

    public /* synthetic */ voq(String str, String str2, String str3, vox voxVar, boolean z, int i) {
        voxVar = (i & 8) != 0 ? vox.PROFILE_PEOPLE_SHARING_SOURCE : voxVar;
        int i2 = i & 2;
        int i3 = i & 1;
        String str4 = null;
        str3 = (i & 4) != 0 ? null : str3;
        str2 = i2 != 0 ? null : str2;
        str = 1 == i3 ? null : str;
        boolean z2 = (i & 16) == 0;
        voxVar.getClass();
        this.f = str;
        this.g = str2;
        this.h = str3;
        this.a = voxVar;
        this.b = z & z2;
        this.c = (str == null || str.length() == 0) ? null : str;
        this.d = (str2 == null || str2.length() == 0) ? null : str2;
        if (str3 != null && str3.length() != 0) {
            str4 = str3;
        }
        this.e = str4;
    }
}
