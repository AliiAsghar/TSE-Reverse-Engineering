package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.blockandreportspam.ui.dialog.BlockAndReportSpamCallbacks;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fot implements Parcelable.Creator {
    private final /* synthetic */ int a;

    public fot(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        char c;
        int i;
        String str;
        boolean z;
        boolean z2;
        Boolean bool;
        Boolean bool2;
        Integer num;
        String str2;
        boolean z3;
        switch (this.a) {
            case 0:
                return new fou(parcel);
            case 1:
                return new fos(parcel);
            case 2:
                ArrayList arrayList = new ArrayList();
                parcel.readList(arrayList, fov.class.getClassLoader());
                return new fow(arrayList);
            case 3:
                return new fov(parcel.readLong(), parcel.readLong(), parcel.readInt());
            case 4:
                return new fox(parcel);
            case 5:
                return new foy(parcel);
            case 6:
                return new fpc(parcel);
            case 7:
                return new fpd();
            case 8:
                return new fpf(parcel);
            case 9:
                return new fpg(parcel.readLong(), parcel.readLong());
            case 10:
                return new fph(parcel);
            case 11:
                return new gej(parcel.readInt());
            case 12:
                return new geq(parcel);
            case 13:
                return new get(parcel);
            case 14:
                return new gew(parcel);
            case 15:
                return new gez(parcel);
            case 16:
                return new gfm(parcel);
            case 17:
                return new ggb(parcel);
            case 18:
                return new ggd(parcel);
            case 19:
                return new haz(parcel);
            default:
                String readString = parcel.readString();
                int hashCode = readString.hashCode();
                boolean z4 = false;
                if (hashCode != -1374584045) {
                    if (hashCode == 858408507 && readString.equals("LIGHTER_CONVERSATION_ID")) {
                        c = 1;
                    }
                    c = 65535;
                } else {
                    if (readString.equals("PARTICIPANT")) {
                        c = 0;
                    }
                    c = 65535;
                }
                if (c != 0) {
                    if (c == 1) {
                        i = 2;
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    i = 1;
                }
                if (parcel.readInt() == 0) {
                    str = parcel.readString();
                } else {
                    str = null;
                }
                String readString2 = parcel.readString();
                String readString3 = parcel.readString();
                int readInt = parcel.readInt();
                if (parcel.readInt() == 1) {
                    z = true;
                } else {
                    z = false;
                }
                if (parcel.readInt() == 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (parcel.readInt() == 0) {
                    if (parcel.readInt() == 1) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    bool = Boolean.valueOf(z3);
                } else {
                    bool = null;
                }
                if (parcel.readInt() == 0) {
                    if (parcel.readInt() == 1) {
                        z4 = true;
                    }
                    bool2 = Boolean.valueOf(z4);
                } else {
                    bool2 = null;
                }
                if (parcel.readInt() == 0) {
                    num = Integer.valueOf(parcel.readInt());
                } else {
                    num = null;
                }
                BlockAndReportSpamCallbacks.ParticipantBlockAndSpamStatus participantBlockAndSpamStatus = (BlockAndReportSpamCallbacks.ParticipantBlockAndSpamStatus) parcel.readParcelable(igw.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    str2 = parcel.readString();
                } else {
                    str2 = null;
                }
                return new igj(i, str, readString2, readString3, readInt, z, z2, bool, bool2, num, participantBlockAndSpamStatus, str2);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new fou[i];
            case 1:
                return new fos[i];
            case 2:
                return new fow[i];
            case 3:
                return new fov[i];
            case 4:
                return new fox[i];
            case 5:
                return new foy[i];
            case 6:
                return new fpc[i];
            case 7:
                return new fpd[i];
            case 8:
                return new fpf[i];
            case 9:
                return new fpg[i];
            case 10:
                return new fph[i];
            case 11:
                return new gej[i];
            case 12:
                return new geq[i];
            case 13:
                return new get[i];
            case 14:
                return new gew[i];
            case 15:
                return new gez[i];
            case 16:
                return new gfm[i];
            case 17:
                return new ggb[i];
            case 18:
                return new ggd[i];
            case 19:
                return new haz[i];
            default:
                return new igj[i];
        }
    }
}
