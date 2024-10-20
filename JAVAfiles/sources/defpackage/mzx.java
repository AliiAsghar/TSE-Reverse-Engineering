package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mzx {
    public static final mzx a = a().a();
    public final nbe b;
    public final String c;
    public final alog d;
    public final alor e;
    public final alog f;
    public final alog g;
    public final int h;
    public final ndk i;
    private final alog j;

    public mzx() {
        throw null;
    }

    public static mzw a() {
        mzw mzwVar = new mzw();
        mzwVar.e = (byte) 1;
        mzwVar.g = null;
        mzwVar.a = null;
        mzwVar.f = 1;
        int i = alog.d;
        mzwVar.b(alsx.a);
        mzwVar.c = altc.a;
        mzwVar.d(alsx.a);
        mzwVar.c(alsx.a);
        alog alogVar = alsx.a;
        if (alogVar != null) {
            mzwVar.d = alogVar;
            return mzwVar;
        }
        throw new NullPointerException("Null editHistory");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof mzx) {
            mzx mzxVar = (mzx) obj;
            ndk ndkVar = this.i;
            if (ndkVar != null ? ndkVar.equals(mzxVar.i) : mzxVar.i == null) {
                nbe nbeVar = this.b;
                if (nbeVar != null ? nbeVar.equals(mzxVar.b) : mzxVar.b == null) {
                    String str = this.c;
                    if (str != null ? str.equals(mzxVar.c) : mzxVar.c == null) {
                        int i = this.h;
                        int i2 = mzxVar.h;
                        if (i != 0) {
                            if (i == i2 && alzz.at(this.d, mzxVar.d) && alzz.am(this.e, mzxVar.e) && alzz.at(this.f, mzxVar.f) && alzz.at(this.g, mzxVar.g) && alzz.at(this.j, mzxVar.j)) {
                                return true;
                            }
                        } else {
                            throw null;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        ndk ndkVar = this.i;
        int i = 0;
        if (ndkVar == null) {
            hashCode = 0;
        } else {
            hashCode = ndkVar.hashCode();
        }
        nbe nbeVar = this.b;
        if (nbeVar == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = nbeVar.hashCode();
        }
        int i2 = hashCode ^ 385623362;
        String str = this.c;
        if (str != null) {
            i = str.hashCode();
        }
        int i3 = ((((i2 * 1000003) ^ hashCode2) * (-721379959)) ^ i) * 1000003;
        int i4 = this.h;
        a.bm(i4);
        return (((((((((((i3 ^ i4) * 1000003) ^ this.d.hashCode()) * (-721379959)) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.j.hashCode()) * 1000003;
    }

    public final String toString() {
        String str;
        int i = this.h;
        nbe nbeVar = this.b;
        String valueOf = String.valueOf(this.i);
        String valueOf2 = String.valueOf(nbeVar);
        if (i != 1) {
            if (i != 2) {
                str = "null";
            } else {
                str = "OTP";
            }
        } else {
            str = "NORMAL";
        }
        alog alogVar = this.d;
        alor alorVar = this.e;
        alog alogVar2 = this.f;
        alog alogVar3 = this.g;
        alog alogVar4 = this.j;
        return "MessageExtensionState{starred=false, preview=" + valueOf + ", reactions=" + valueOf2 + ", repliedTo=null, caption=" + this.c + ", contentCategory=" + str + ", annotations=" + String.valueOf(alogVar) + ", suggestionShortcut=null, voiceTranscriptions=" + String.valueOf(alorVar) + ", readByRecipients=" + String.valueOf(alogVar2) + ", failedToDecryptRecipients=" + String.valueOf(alogVar3) + ", editHistory=" + String.valueOf(alogVar4) + ", editStatus=null}";
    }

    public mzx(ndk ndkVar, nbe nbeVar, String str, int i, alog alogVar, alor alorVar, alog alogVar2, alog alogVar3, alog alogVar4) {
        this.i = ndkVar;
        this.b = nbeVar;
        this.c = str;
        this.h = i;
        this.d = alogVar;
        this.e = alorVar;
        this.f = alogVar2;
        this.g = alogVar3;
        this.j = alogVar4;
    }
}
