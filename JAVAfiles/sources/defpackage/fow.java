package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fow implements erj {
    public static final Parcelable.Creator<fow> CREATOR = new fot(2);
    public final List a;

    public fow(List list) {
        this.a = list;
        boolean z = false;
        if (!list.isEmpty()) {
            long j = ((fov) list.get(0)).b;
            int i = 1;
            while (true) {
                if (i >= list.size()) {
                    break;
                }
                if (((fov) list.get(i)).a < j) {
                    z = true;
                    break;
                } else {
                    j = ((fov) list.get(i)).b;
                    i++;
                }
            }
        }
        d.s(!z);
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
            return this.a.equals(((fow) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SlowMotion: segments=".concat(this.a.toString());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(this.a);
    }

    @Override // defpackage.erj
    public final /* synthetic */ void b(erg ergVar) {
    }
}
