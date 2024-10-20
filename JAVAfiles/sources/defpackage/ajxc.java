package defpackage;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajxc implements Parcelable {
    public static final Parcelable.Creator<ajxc> CREATOR = new ajuw(5);
    public final ajwt a;
    public final ajzb b;
    public final ajyz c;
    public final Intent d;
    public final ajxb e;

    public ajxc(Parcel parcel) {
        this.a = (ajwt) parcel.readParcelable(ajwt.class.getClassLoader());
        try {
            this.b = (ajzb) aowt.b(parcel, ajzb.a, aozs.a());
            this.c = (ajyz) parcel.readParcelable(ajyz.class.getClassLoader());
            this.d = (Intent) parcel.readParcelable(ajyz.class.getClassLoader());
            this.e = (ajxb) parcel.readParcelable(ajyz.class.getClassLoader());
        } catch (apba e) {
            throw new IllegalStateException("Failed to convert AccountInfo to Parcelable!", e);
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, 0);
        aowt.g(parcel, this.b);
        parcel.writeParcelable(this.c, 0);
        parcel.writeParcelable(this.d, 0);
        parcel.writeParcelable(this.e, 0);
    }

    public ajxc(ajwt ajwtVar, ajzb ajzbVar, ajyz ajyzVar, Intent intent, ajxb ajxbVar) {
        this.a = ajwtVar;
        ajzbVar.getClass();
        this.b = ajzbVar;
        this.c = ajyzVar;
        this.d = intent;
        this.e = ajxbVar;
    }
}
