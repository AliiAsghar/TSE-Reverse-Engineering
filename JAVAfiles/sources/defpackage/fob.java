package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.vcard.VCardConstants;

/* compiled from: PG */
@Deprecated
/* loaded from: classes.dex */
public class fob implements erj {
    public static final Parcelable.Creator<fob> CREATOR = new eri(8);
    public final String a;
    public final String b;

    public fob(Parcel parcel) {
        String readString = parcel.readString();
        int i = eul.a;
        this.a = readString;
        this.b = parcel.readString();
    }

    @Override // defpackage.erj
    public final /* synthetic */ eqn a() {
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.erj
    public final void b(erg ergVar) {
        char c;
        String str = this.a;
        switch (str.hashCode()) {
            case 62359119:
                if (str.equals("ALBUM")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 79833656:
                if (str.equals(VCardConstants.PROPERTY_TITLE)) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 428414940:
                if (str.equals("DESCRIPTION")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 1746739798:
                if (str.equals("ALBUMARTIST")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1939198791:
                if (str.equals("ARTIST")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c != 0) {
            if (c != 1) {
                if (c != 2) {
                    if (c != 3) {
                        if (c != 4) {
                            return;
                        }
                        ergVar.e = this.b;
                        return;
                    }
                    ergVar.d = this.b;
                    return;
                }
                ergVar.c = this.b;
                return;
            }
            ergVar.b = this.b;
            return;
        }
        ergVar.a = this.b;
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
            fob fobVar = (fob) obj;
            if (this.a.equals(fobVar.a) && this.b.equals(fobVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() + 527) * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "VC: " + this.a + "=" + this.b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
    }

    public fob(String str, String str2) {
        this.a = albo.aq(str);
        this.b = str2;
    }
}
