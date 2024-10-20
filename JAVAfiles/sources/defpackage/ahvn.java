package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahvn {
    public final boolean a;
    public final aozb b;
    public final String c;
    public final String d;
    public final alog e;
    public final alog f;
    public final boolean g;

    public ahvn() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ahvn) {
            ahvn ahvnVar = (ahvn) obj;
            if (this.a == ahvnVar.a && this.b.equals(ahvnVar.b) && this.c.equals(ahvnVar.c) && this.d.equals(ahvnVar.d) && alzz.at(this.e, ahvnVar.e) && alzz.at(this.f, ahvnVar.f) && this.g == ahvnVar.g) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2 = 1237;
        if (true != this.a) {
            i = 1237;
        } else {
            i = 1231;
        }
        int hashCode = ((((((((((i ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode();
        if (true == this.g) {
            i2 = 1231;
        }
        return (hashCode * 1000003) ^ i2;
    }

    public final String toString() {
        alog alogVar = this.f;
        alog alogVar2 = this.e;
        return "SharedStorageInfo{shouldUseSharedStorage=" + this.a + ", secret=" + this.b.toString() + ", dirPath=" + this.c + ", gmsCoreDirPath=" + this.d + ", includeStaticConfigPackages=" + alogVar2.toString() + ", excludeStaticConfigPackages=" + alogVar.toString() + ", hasStorageInfoFromGms=" + this.g + "}";
    }

    public ahvn(boolean z, aozb aozbVar, String str, String str2, alog alogVar, alog alogVar2, boolean z2) {
        this.a = z;
        if (aozbVar == null) {
            throw new NullPointerException("Null secret");
        }
        this.b = aozbVar;
        if (str != null) {
            this.c = str;
            if (str2 != null) {
                this.d = str2;
                if (alogVar != null) {
                    this.e = alogVar;
                    if (alogVar2 != null) {
                        this.f = alogVar2;
                        this.g = z2;
                        return;
                    }
                    throw new NullPointerException("Null excludeStaticConfigPackages");
                }
                throw new NullPointerException("Null includeStaticConfigPackages");
            }
            throw new NullPointerException("Null gmsCoreDirPath");
        }
        throw new NullPointerException("Null dirPath");
    }
}
