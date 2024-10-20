package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.Spanned;
import android.text.TextUtils;
import j$.util.Collection;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kmk implements Comparable<kmk>, Parcelable {
    public static final Parcelable.Creator<kmk> CREATOR = new imp(9);
    public final String a;
    public final String b;
    public final alog c;
    public int d;

    public kmk(Parcel parcel) {
        String readString = parcel.readString();
        readString.getClass();
        this.a = readString;
        String readString2 = parcel.readString();
        readString2.getClass();
        this.b = readString2;
        ArrayList arrayList = new ArrayList();
        parcel.readTypedList(arrayList, kmj.CREATOR);
        this.c = alog.n(arrayList);
        this.d = parcel.readInt();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int a() {
        return this.c.size();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    public final long b(int i) {
        return ((kmj) this.c.get(i)).a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Spanned c(int i) {
        return ((kmj) this.c.get(i)).c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(kmk kmkVar) {
        return ((kmj) this.c.get(0)).compareTo((kmj) kmkVar.c.get(0));
    }

    public final void d(boolean z) {
        int i;
        Collection.EL.stream(this.c).forEach(new ivd(z, 4));
        if (z) {
            i = a();
        } else {
            i = 0;
        }
        this.d = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean e(int i) {
        return ((kmj) this.c.get(i)).e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeTypedList(this.c);
        parcel.writeInt(this.d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public kmk(kks kksVar) {
        d.s(!kksVar.a.isEmpty());
        this.a = ((kkr) kksVar.a.get(0)).a;
        this.b = ((kkr) kksVar.a.get(0)).b;
        alob alobVar = new alob();
        alog alogVar = kksVar.a;
        int size = alogVar.size();
        for (int i = 0; i < size; i++) {
            kkr kkrVar = (kkr) alogVar.get(i);
            d.t(kkrVar.e, "ParticipantMessageList only supports incoming messages");
            albo.Q(TextUtils.equals(this.a, kkrVar.a), "ParticipantMessageList only supports 1:1 conversations, normalizedDestination: %s | message.normalizedDestination: %s", yyb.bh(this.a), yyb.bh(kkrVar.a));
            alobVar.h(new kmj(kkrVar));
        }
        alog D = alog.D(alobVar.g());
        this.c = D;
        this.d = D.size();
    }
}
