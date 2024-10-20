package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahcj {
    public final String a;
    public final apbt b;
    public final amnr c;
    public final Integer d;
    public final apwa e;
    public final abom f;
    public final int[] g;
    public final int[] h;
    public final abnv i;

    public ahcj() {
        throw null;
    }

    public static anzh a() {
        anzh anzhVar = new anzh((short[]) null, (byte[]) null);
        anzhVar.D(apwa.DEFAULT);
        return anzhVar;
    }

    public final boolean equals(Object obj) {
        amnr amnrVar;
        Integer num;
        int[] iArr;
        if (obj == this) {
            return true;
        }
        if (obj instanceof ahcj) {
            ahcj ahcjVar = (ahcj) obj;
            if (this.a.equals(ahcjVar.a) && this.b.equals(ahcjVar.b) && ((amnrVar = this.c) != null ? amnrVar.equals(ahcjVar.c) : ahcjVar.c == null) && ((num = this.d) != null ? num.equals(ahcjVar.d) : ahcjVar.d == null) && this.e.equals(ahcjVar.e)) {
                abom abomVar = ahcjVar.f;
                int[] iArr2 = this.g;
                if (ahcjVar instanceof ahcj) {
                    iArr = ahcjVar.g;
                } else {
                    iArr = ahcjVar.g;
                }
                if (Arrays.equals(iArr2, iArr) && Arrays.equals(this.h, ahcjVar.h)) {
                    abnv abnvVar = ahcjVar.i;
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
        amnr amnrVar = this.c;
        int i = 0;
        if (amnrVar == null) {
            hashCode = 0;
        } else {
            hashCode = amnrVar.hashCode();
        }
        int i2 = ((hashCode2 * 1000003) ^ hashCode) * 1000003;
        Integer num = this.d;
        if (num != null) {
            i = num.hashCode();
        }
        return (((((((i2 ^ i) * 583896283) ^ this.e.hashCode()) * (-721379959)) ^ Arrays.hashCode(this.g)) * 1000003) ^ Arrays.hashCode(this.h)) * 1000003;
    }

    public final String toString() {
        int[] iArr = this.h;
        int[] iArr2 = this.g;
        apwa apwaVar = this.e;
        amnr amnrVar = this.c;
        return "ClearcutData{logSource=" + this.a + ", message=" + String.valueOf(this.b) + ", visualElements=" + String.valueOf(amnrVar) + ", eventCode=" + this.d + ", wallTime=null, elapsedTime=null, qosTier=" + String.valueOf(apwaVar) + ", logVerifier=null, experimentIds=" + Arrays.toString(iArr2) + ", testCodes=" + Arrays.toString(iArr) + ", complianceProductData=null}";
    }

    public ahcj(String str, apbt apbtVar, amnr amnrVar, Integer num, apwa apwaVar, int[] iArr, int[] iArr2) {
        this.a = str;
        this.b = apbtVar;
        this.c = amnrVar;
        this.d = num;
        this.e = apwaVar;
        this.f = null;
        this.g = iArr;
        this.h = iArr2;
        this.i = null;
    }
}
