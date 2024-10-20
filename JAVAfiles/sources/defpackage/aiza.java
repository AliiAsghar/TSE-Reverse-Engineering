package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aiza implements Parcelable {
    public static final Parcelable.Creator<aiza> CREATOR = new ahzu(17);
    public apqz a;
    public String b;
    public aprm c;
    public long d;
    public boolean e;
    public String f;
    public int g;

    public aiza() {
        this.a = apqz.a;
        this.g = 1;
        this.b = "";
        this.c = aprm.a;
        this.d = 0L;
        this.e = false;
        this.f = "";
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        parcel.writeByteArray(this.a.toByteArray());
        int i2 = this.g;
        switch (i2) {
            case 1:
                str = "NOT_SET";
                break;
            case 2:
                str = "SURVEY_SHOWN";
                break;
            case 3:
                str = "SURVEY_ACCEPTED";
                break;
            case 4:
                str = "INVITATION_ANSWERED";
                break;
            case 5:
                str = "QUESTION_ANSWERED";
                break;
            case 6:
                str = "SURVEY_CLOSED";
                break;
            default:
                str = "null";
                break;
        }
        if (i2 != 0) {
            parcel.writeString(str);
            parcel.writeString(this.b);
            parcel.writeByteArray(this.c.toByteArray());
            parcel.writeLong(this.d);
            parcel.writeInt(this.e ? 1 : 0);
            parcel.writeString(this.f);
            return;
        }
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public aiza(android.os.Parcel r9) {
        /*
            Method dump skipped, instructions count: 234
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aiza.<init>(android.os.Parcel):void");
    }
}
