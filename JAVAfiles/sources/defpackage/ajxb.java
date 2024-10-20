package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajxb implements Parcelable {
    public static final Parcelable.Creator<ajxb> CREATOR = new ajuw(4);
    public final AtomicBoolean a;
    private final ConcurrentHashMap b;

    public ajxb() {
        this.a = new AtomicBoolean(false);
        this.b = new ConcurrentHashMap();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Bundle bundle = new Bundle();
        for (Map.Entry entry : this.b.entrySet()) {
            bundle.putString((String) entry.getKey(), (String) entry.getValue());
        }
        parcel.writeParcelable(bundle, 0);
    }

    public ajxb(Parcel parcel) {
        this.a = new AtomicBoolean(false);
        Bundle bundle = (Bundle) parcel.readParcelable(Bundle.class.getClassLoader());
        this.b = new ConcurrentHashMap();
        for (String str : bundle.keySet()) {
            this.b.put(str, bundle.getString(str));
        }
    }
}
