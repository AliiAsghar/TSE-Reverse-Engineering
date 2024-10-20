package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afvs implements Parcelable {
    public static final Parcelable.Creator<afvs> CREATOR;
    public static final afvs a;
    public static final afvs b;
    private static final /* synthetic */ afvs[] c;

    static {
        afvs afvsVar = new afvs("PHOTOS_LINK", 0);
        a = afvsVar;
        afvs afvsVar2 = new afvs("ATTACHMENT", 1);
        b = afvsVar2;
        afvs[] afvsVarArr = {afvsVar, afvsVar2};
        c = afvsVarArr;
        arhi.f(afvsVarArr);
        CREATOR = new aftg(9);
    }

    private afvs(String str, int i) {
    }

    public static afvs[] values() {
        return (afvs[]) c.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(name());
    }
}
