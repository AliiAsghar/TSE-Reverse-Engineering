package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ajrh implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        boolean z;
        Optional empty = Optional.empty();
        Optional empty2 = Optional.empty();
        Optional empty3 = Optional.empty();
        Optional empty4 = Optional.empty();
        Optional empty5 = Optional.empty();
        Optional empty6 = Optional.empty();
        int a = ajro.a(parcel);
        boolean z2 = false;
        Optional optional = empty;
        Optional optional2 = empty2;
        Optional optional3 = empty3;
        Optional optional4 = empty4;
        Optional optional5 = empty5;
        Optional optional6 = empty6;
        String str = null;
        double d = 0.0d;
        double d2 = 0.0d;
        int i = 0;
        while (a != Integer.MIN_VALUE) {
            switch (a) {
                case 1:
                    str = (String) ajro.h(parcel, a).get();
                    break;
                case 2:
                    optional = Optional.of(ajro.c(parcel, a).get());
                    break;
                case 3:
                    optional2 = Optional.of(ajro.c(parcel, a).get());
                    break;
                case 4:
                    optional3 = Optional.of((String) ajro.h(parcel, a).get());
                    break;
                case 5:
                    optional4 = Optional.of((String) ajro.h(parcel, a).get());
                    break;
                case 6:
                    i |= 1;
                    d = ((Double) ajro.b(parcel, a).get()).doubleValue();
                    break;
                case 7:
                    i |= 2;
                    d2 = ((Double) ajro.b(parcel, a).get()).doubleValue();
                    break;
                case 8:
                    Double d3 = (Double) ajro.b(parcel, a).get();
                    d3.doubleValue();
                    optional5 = Optional.of(d3);
                    break;
                case 9:
                    optional6 = Optional.of((String) ajro.h(parcel, a).get());
                    break;
                default:
                    ajro.i(parcel, a);
                    break;
            }
            a = ajro.a(parcel);
        }
        d.s(ajro.e(parcel).isPresent());
        if (i == 3 && str != null) {
            ajov ajovVar = new ajov(optional, str, optional2, optional3, optional4, d, d2, optional5, optional6);
            double d4 = ajovVar.b;
            int i2 = 1;
            if (d4 >= -180.0d && d4 <= 180.0d) {
                z = true;
            } else {
                z = false;
            }
            albo.U(z, "Latitude must be between -180 and 180.");
            double d5 = ajovVar.a;
            if (d5 >= -180.0d && d5 <= 180.0d) {
                z2 = true;
            }
            albo.U(z2, "Longitude must be between -180 and 180.");
            ajovVar.c.ifPresent(new ajql(i2));
            return ajovVar;
        }
        StringBuilder sb = new StringBuilder();
        if (str == null) {
            sb.append(" id");
        }
        if ((i & 1) == 0) {
            sb.append(" longitude");
        }
        if ((i & 2) == 0) {
            sb.append(" latitude");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ajpm[i];
    }
}
