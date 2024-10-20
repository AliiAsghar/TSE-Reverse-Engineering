package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fny implements erj {
    public static final Parcelable.Creator<fny> CREATOR;
    private static final eqn f;
    private static final eqn g;
    public final String a;
    public final String b;
    public final long c;
    public final long d;
    public final byte[] e;
    private int h;

    static {
        eqm eqmVar = new eqm();
        eqmVar.b("application/id3");
        f = new eqn(eqmVar);
        eqm eqmVar2 = new eqm();
        eqmVar2.b("application/x-scte35");
        g = new eqn(eqmVar2);
        CREATOR = new eri(6);
    }

    public fny(String str, String str2, long j, long j2, byte[] bArr) {
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = j2;
        this.e = bArr;
    }

    @Override // defpackage.erj
    public final eqn a() {
        char c;
        String str = this.a;
        int hashCode = str.hashCode();
        if (hashCode != -1468477611) {
            if (hashCode != -795945609) {
                if (hashCode == 1303648457 && str.equals("https://developer.apple.com/streaming/emsg-id3")) {
                    c = 1;
                }
                c = 65535;
            } else {
                if (str.equals("https://aomedia.org/emsg/ID3")) {
                    c = 0;
                }
                c = 65535;
            }
        } else {
            if (str.equals("urn:scte:scte35:2014:bin")) {
                c = 2;
            }
            c = 65535;
        }
        if (c != 0 && c != 1) {
            if (c != 2) {
                return null;
            }
            return g;
        }
        return f;
    }

    @Override // defpackage.erj
    public final byte[] c() {
        if (a() != null) {
            return this.e;
        }
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
            fny fnyVar = (fny) obj;
            if (this.c == fnyVar.c && this.d == fnyVar.d && Objects.equals(this.a, fnyVar.a) && Objects.equals(this.b, fnyVar.b) && Arrays.equals(this.e, fnyVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2 = this.h;
        if (i2 == 0) {
            String str = this.a;
            int i3 = 0;
            if (str != null) {
                i = str.hashCode();
            } else {
                i = 0;
            }
            String str2 = this.b;
            if (str2 != null) {
                i3 = str2.hashCode();
            }
            long j = this.c;
            long j2 = this.d;
            int hashCode = ((((((((i + 527) * 31) + i3) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + Arrays.hashCode(this.e);
            this.h = hashCode;
            return hashCode;
        }
        return i2;
    }

    public final String toString() {
        return "EMSG: scheme=" + this.a + ", id=" + this.d + ", durationMs=" + this.c + ", value=" + this.b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeLong(this.c);
        parcel.writeLong(this.d);
        parcel.writeByteArray(this.e);
    }

    public fny(Parcel parcel) {
        String readString = parcel.readString();
        int i = eul.a;
        this.a = readString;
        this.b = parcel.readString();
        this.c = parcel.readLong();
        this.d = parcel.readLong();
        this.e = parcel.createByteArray();
    }

    @Override // defpackage.erj
    public final /* synthetic */ void b(erg ergVar) {
    }
}
