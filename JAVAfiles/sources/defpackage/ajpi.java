package defpackage;

import android.os.Parcel;
import j$.time.Duration;
import j$.time.Instant;
import j$.util.Collection;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class ajpi implements ajrm {
    private final /* synthetic */ int a;

    public /* synthetic */ ajpi(int i) {
        this.a = i;
    }

    @Override // defpackage.ajrm
    public final void a(Parcel parcel, Object obj, int i) {
        int i2 = 9;
        int i3 = 8;
        int i4 = 11;
        int i5 = 6;
        int i6 = 5;
        int i7 = 7;
        int i8 = 4;
        switch (this.a) {
            case 0:
                ajro.o(parcel, 1, ((ajpk) obj).a() ? 1 : 0);
                ajro.l(parcel);
                return;
            case 1:
                ajrp.a(parcel, (ajpu) obj);
                return;
            case 2:
                ajpy ajpyVar = (ajpy) obj;
                ajpyVar.a().ifPresent(new wog(parcel, i, i7));
                ajpyVar.b().ifPresent(new ajpx(parcel, i4));
                ajro.l(parcel);
                return;
            case 3:
                ajrp.a(parcel, (ajpu) obj);
                return;
            case 4:
                ajpo ajpoVar = (ajpo) obj;
                ajro.r(parcel, 1, ajpoVar.f());
                int i9 = 14;
                ajro.p(parcel, 2, ajpoVar.b(), new ajpi(i9), i);
                ajro.o(parcel, 3, ajpoVar.a().b() - 1);
                ajpn a = ajpoVar.a();
                int b = a.b() - 1;
                if (b != 0) {
                    if (b != 1) {
                        if (b != 2) {
                            if (b != 3) {
                                if (b != 4) {
                                    ajro.p(parcel, 4, a.a(), new ajpi(13), i);
                                } else {
                                    ajro.p(parcel, 4, a.f(), new ajpi(i4), i);
                                }
                            } else {
                                ajro.p(parcel, 4, a.d(), new ajpi(10), i);
                            }
                        } else {
                            ajro.p(parcel, 4, a.g(), new ajpi(12), i);
                        }
                    } else {
                        ajro.p(parcel, 4, a.e(), new ajpi(i2), i);
                    }
                } else {
                    ajro.p(parcel, 4, a.c(), new ajpi(i3), i);
                }
                if (ajpoVar.d().isPresent()) {
                    ajro.p(parcel, 5, ajpoVar.d().get(), new ajpi(i9), i);
                }
                if (ajpoVar.e().isPresent()) {
                    ajro.n(parcel, 7, (Instant) ajpoVar.e().get());
                }
                alog c = ajpoVar.c();
                ajpi ajpiVar = new ajpi(15);
                parcel.writeInt(6);
                int dataPosition = parcel.dataPosition();
                parcel.writeInt(0);
                int dataPosition2 = parcel.dataPosition();
                parcel.writeInt(c.size());
                Collection.EL.stream(c).forEach(new mua(ajpiVar, parcel, i, i8));
                ajro.k(parcel, dataPosition, dataPosition2);
                ajro.l(parcel);
                return;
            case 5:
                ajrc.a(parcel, (ajpd) obj);
                return;
            case 6:
                ajrc.a(parcel, (ajpd) obj);
                return;
            case 7:
                ajpf ajpfVar = (ajpf) obj;
                if (ajpfVar.e().isPresent()) {
                    ajro.r(parcel, 1, (String) ajpfVar.e().get());
                }
                ajro.o(parcel, 2, ajpfVar.a());
                ajro.p(parcel, 3, ajpfVar.b(), new ajpi(i5), i);
                ajro.r(parcel, 4, ajpfVar.f());
                ajro.n(parcel, 5, ajpfVar.c());
                ajro.l(parcel);
                return;
            case 8:
                ajpc ajpcVar = (ajpc) obj;
                ajro.p(parcel, 1, ajpcVar.a(), new ajpi(i6), i);
                byte[] H = ajpcVar.b().H();
                parcel.writeInt(2);
                int dataPosition3 = parcel.dataPosition();
                parcel.writeInt(0);
                int dataPosition4 = parcel.dataPosition();
                parcel.writeByteArray(H);
                ajro.k(parcel, dataPosition3, dataPosition4);
                ajro.l(parcel);
                return;
            case 9:
                ajpl ajplVar = (ajpl) obj;
                ajro.o(parcel, 1, ajplVar.c() - 1);
                Object obj2 = ajplVar.a().get();
                parcel.writeInt(2);
                int dataPosition5 = parcel.dataPosition();
                parcel.writeInt(0);
                int dataPosition6 = parcel.dataPosition();
                parcel.writeLong(((Duration) obj2).getSeconds());
                ajro.k(parcel, dataPosition5, dataPosition6);
                if (ajplVar.b().isPresent()) {
                    ajro.n(parcel, 3, (Instant) ajplVar.b().get());
                }
                ajro.l(parcel);
                return;
            case 10:
                ajpg ajpgVar = (ajpg) obj;
                ajro.p(parcel, 1, ajpgVar.a(), new ajpi(i7), i);
                if (ajpgVar.b().isPresent()) {
                    ajro.p(parcel, 2, ajpgVar.b().get(), new ajpi(i7), i);
                }
                ajro.l(parcel);
                return;
            case 11:
                ajpm ajpmVar = (ajpm) obj;
                ajro.r(parcel, 1, ajpmVar.i());
                if (ajpmVar.h().isPresent()) {
                    ajro.n(parcel, 2, (Instant) ajpmVar.h().get());
                }
                if (ajpmVar.d().isPresent()) {
                    ajro.n(parcel, 3, (Instant) ajpmVar.d().get());
                }
                if (ajpmVar.e().isPresent()) {
                    ajro.r(parcel, 4, (String) ajpmVar.e().get());
                }
                if (ajpmVar.f().isPresent()) {
                    ajro.r(parcel, 5, (String) ajpmVar.f().get());
                }
                ajro.m(parcel, 6, ajpmVar.b());
                ajro.m(parcel, 7, ajpmVar.a());
                if (ajpmVar.g().isPresent()) {
                    ajro.m(parcel, 8, ((Double) ajpmVar.g().get()).doubleValue());
                }
                if (ajpmVar.c().isPresent()) {
                    ajro.r(parcel, 9, (String) ajpmVar.c().get());
                }
                ajro.l(parcel);
                return;
            case 12:
                ajpr ajprVar = (ajpr) obj;
                ajro.o(parcel, 1, ajprVar.a().ordinal());
                ajro.r(parcel, 2, ajprVar.c());
                ajro.n(parcel, 3, ajprVar.b());
                ajro.r(parcel, 4, ajprVar.d());
                ajro.l(parcel);
                return;
            case 13:
                ajro.r(parcel, 1, ((ajpb) obj).a());
                ajro.l(parcel);
                return;
            case 14:
                ajrp.a(parcel, (ajpu) obj);
                return;
            case 15:
                ajpp ajppVar = (ajpp) obj;
                ajro.r(parcel, 1, ajppVar.b());
                ajro.r(parcel, 2, ajppVar.a());
                ajro.r(parcel, 3, ajppVar.c());
                ajro.l(parcel);
                return;
            default:
                ajrp.a(parcel, (ajpu) obj);
                return;
        }
    }
}
