package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Map;

/* compiled from: PG */
@Deprecated
/* loaded from: classes4.dex */
public final class ajrc {
    public static final Parcelable.Creator a = new ajqp(11);

    public static void a(Parcel parcel, ajpd ajpdVar) {
        ajro.r(parcel, 1, ajpdVar.c());
        ajro.r(parcel, 2, ajpdVar.b());
        alor a2 = ajpdVar.a();
        parcel.writeInt(3);
        int dataPosition = parcel.dataPosition();
        parcel.writeInt(0);
        int i = ((altc) a2).d;
        int dataPosition2 = parcel.dataPosition();
        parcel.writeInt(i);
        Map.EL.forEach(a2, new ajrn(parcel, a2, 0));
        ajro.k(parcel, dataPosition, dataPosition2);
        ajro.l(parcel);
    }
}
