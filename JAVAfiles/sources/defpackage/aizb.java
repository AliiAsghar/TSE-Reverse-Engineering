package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.Log;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aizb implements Parcelable {
    public static final Parcelable.Creator<aizb> CREATOR = new ahzu(18);
    private long a;
    private long b;

    public aizb() {
        this.a = -1L;
        this.b = -1L;
    }

    public final void a() {
        if (c()) {
            if (this.b >= 0) {
                long j = aizr.a;
                return;
            } else {
                this.b = SystemClock.elapsedRealtime();
                return;
            }
        }
        Log.e("SurveyQuestionMetrics", "Question was marked as answered but was never marked as shown.");
    }

    public final void b() {
        if (c()) {
            return;
        }
        this.a = SystemClock.elapsedRealtime();
    }

    public final boolean c() {
        if (this.a >= 0) {
            return true;
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a);
        parcel.writeLong(this.b);
    }

    public aizb(Parcel parcel) {
        this.a = parcel.readLong();
        this.b = parcel.readLong();
    }
}
