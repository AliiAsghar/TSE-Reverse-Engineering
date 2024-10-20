package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aqxw implements aqun {
    private final Parcelable.Creator a;
    private final boolean b;

    public aqxw(Parcelable.Creator creator, boolean z) {
        this.a = creator;
        this.b = z;
    }

    @Override // defpackage.aqun
    public final /* bridge */ /* synthetic */ InputStream a(Object obj) {
        boolean z = this.b;
        return new aqyh(this.a, (Parcelable) obj, z);
    }

    @Override // defpackage.aqun
    public final /* bridge */ /* synthetic */ Object b(InputStream inputStream) {
        if (inputStream instanceof aqyh) {
            aqyh aqyhVar = (aqyh) inputStream;
            if (aqyhVar.b) {
                return aqyhVar.c;
            }
            if (aqyhVar.e == null) {
                Parcelable parcelable = aqyhVar.c;
                Parcelable.Creator creator = aqyhVar.a;
                creator.getClass();
                Parcel obtain = Parcel.obtain();
                parcelable.writeToParcel(obtain, 0);
                obtain.setDataPosition(0);
                Parcelable parcelable2 = (Parcelable) creator.createFromParcel(obtain);
                obtain.recycle();
                aqyhVar.e = parcelable2;
            }
            return aqyhVar.e;
        }
        throw new UnsupportedOperationException("Can't unmarshall a parcelable from a regular byte stream");
    }
}
