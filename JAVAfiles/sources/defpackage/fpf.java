package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fpf extends foz {
    public static final Parcelable.Creator<fpf> CREATOR = new fot(8);
    public final List a;

    public fpf(Parcel parcel) {
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            arrayList.add(new fpe(parcel));
        }
        this.a = DesugarCollections.unmodifiableList(arrayList);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int size = this.a.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            fpe fpeVar = (fpe) this.a.get(i2);
            parcel.writeLong(fpeVar.a);
            parcel.writeByte(fpeVar.b ? (byte) 1 : (byte) 0);
            parcel.writeByte(fpeVar.c ? (byte) 1 : (byte) 0);
            parcel.writeByte(fpeVar.d ? (byte) 1 : (byte) 0);
            int size2 = fpeVar.f.size();
            parcel.writeInt(size2);
            for (int i3 = 0; i3 < size2; i3++) {
                atgu atguVar = (atgu) fpeVar.f.get(i3);
                parcel.writeInt(atguVar.a);
                parcel.writeLong(atguVar.b);
            }
            parcel.writeLong(fpeVar.e);
            parcel.writeByte(fpeVar.g ? (byte) 1 : (byte) 0);
            parcel.writeLong(fpeVar.h);
            parcel.writeInt(fpeVar.i);
            parcel.writeInt(fpeVar.j);
            parcel.writeInt(fpeVar.k);
        }
    }

    public fpf(List list) {
        this.a = DesugarCollections.unmodifiableList(list);
    }
}
