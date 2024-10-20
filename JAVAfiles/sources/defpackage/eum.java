package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eum implements erj {
    public static final Parcelable.Creator<eum> CREATOR = new eri(2);
    public final String a;
    public final byte[] b;
    public final int c;
    public final int d;

    public eum(Parcel parcel) {
        String readString = parcel.readString();
        int i = eul.a;
        this.a = readString;
        byte[] createByteArray = parcel.createByteArray();
        this.b = createByteArray;
        this.c = parcel.readInt();
        int readInt = parcel.readInt();
        this.d = readInt;
        d(readString, createByteArray, readInt);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static void d(String str, byte[] bArr, int i) {
        char c;
        byte b;
        boolean z = true;
        switch (str.hashCode()) {
            case -1949883051:
                if (str.equals("com.android.capture.fps")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -1555642602:
                if (str.equals("editable.tracks.samples.location")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 101820674:
                if (str.equals("editable.tracks.length")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 188404399:
                if (str.equals("editable.tracks.offset")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 1805012160:
                if (str.equals("editable.tracks.map")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c != 0) {
            if (c != 1 && c != 2) {
                if (c != 3) {
                    if (c != 4) {
                        return;
                    }
                    if (i != 75 || bArr.length != 1 || ((b = bArr[0]) != 0 && b != 1)) {
                        z = false;
                    }
                    d.s(z);
                    return;
                }
                if (i != 0) {
                    z = false;
                }
                d.s(z);
                return;
            }
            if (i != 78 || bArr.length != 8) {
                z = false;
            }
            d.s(z);
            return;
        }
        if (i != 23 || bArr.length != 4) {
            z = false;
        }
        d.s(z);
    }

    @Override // defpackage.erj
    public final /* synthetic */ eqn a() {
        return null;
    }

    @Override // defpackage.erj
    public final /* synthetic */ byte[] c() {
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            eum eumVar = (eum) obj;
            if (this.a.equals(eumVar.a) && Arrays.equals(this.b, eumVar.b) && this.c == eumVar.c && this.d == eumVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() + 527) * 31) + Arrays.hashCode(this.b)) * 31) + this.c) * 31) + this.d;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00af A[LOOP:0: B:17:0x00ac->B:19:0x00af, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String toString() {
        /*
            r5 = this;
            int r0 = r5.d
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L5b
            if (r0 == r2) goto L53
            r2 = 23
            if (r0 == r2) goto L43
            r2 = 67
            if (r0 == r2) goto L37
            r2 = 75
            if (r0 == r2) goto L2b
            r2 = 78
            if (r0 == r2) goto L1a
            goto La3
        L1a:
            byte[] r0 = r5.b
            euf r1 = new euf
            r1.<init>(r0)
            long r0 = r1.s()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            goto Ld0
        L2b:
            byte[] r0 = r5.b
            r0 = r0[r1]
            r0 = r0 & 255(0xff, float:3.57E-43)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            goto Ld0
        L37:
            byte[] r0 = r5.b
            int r0 = defpackage.albo.cq(r0)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            goto Ld0
        L43:
            byte[] r0 = r5.b
            int r0 = defpackage.albo.cq(r0)
            float r0 = java.lang.Float.intBitsToFloat(r0)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            goto Ld0
        L53:
            byte[] r0 = r5.b
            java.lang.String r0 = defpackage.eul.H(r0)
            goto Ld0
        L5b:
            java.lang.String r0 = r5.a
            java.lang.String r3 = "editable.tracks.map"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto La3
            java.lang.String r0 = r5.a
            boolean r0 = r0.equals(r3)
            java.lang.String r3 = "Metadata is not an editable tracks map"
            defpackage.dzg.e(r0, r3)
            byte[] r0 = r5.b
            r0 = r0[r2]
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
        L79:
            if (r1 >= r0) goto L8b
            byte[] r3 = r5.b
            int r4 = r1 + 2
            r3 = r3[r4]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2.add(r3)
            int r1 = r1 + 1
            goto L79
        L8b:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "track types = "
            r0.append(r1)
            r1 = 44
            algs r1 = defpackage.algs.c(r1)
            r1.h(r0, r2)
            java.lang.String r0 = r0.toString()
            goto Ld0
        La3:
            byte[] r0 = r5.b
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            int r3 = r0.length
            int r3 = r3 + r3
            r2.<init>(r3)
        Lac:
            int r3 = r0.length
            if (r1 >= r3) goto Lcc
            r3 = r0[r1]
            int r3 = r3 >> 4
            r3 = r3 & 15
            r4 = 16
            char r3 = java.lang.Character.forDigit(r3, r4)
            r2.append(r3)
            r3 = r0[r1]
            r3 = r3 & 15
            char r3 = java.lang.Character.forDigit(r3, r4)
            r2.append(r3)
            int r1 = r1 + 1
            goto Lac
        Lcc:
            java.lang.String r0 = r2.toString()
        Ld0:
            java.lang.String r1 = r5.a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "mdta: key="
            r2.<init>(r3)
            r2.append(r1)
            java.lang.String r1 = ", value="
            r2.append(r1)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eum.toString():java.lang.String");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeByteArray(this.b);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
    }

    public eum(String str, byte[] bArr, int i, int i2) {
        d(str, bArr, i2);
        this.a = str;
        this.b = bArr;
        this.c = i;
        this.d = i2;
    }

    @Override // defpackage.erj
    public final /* synthetic */ void b(erg ergVar) {
    }
}
