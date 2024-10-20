package defpackage;

import com.google.android.gms.common.internal.IGmsServiceBroker;
import defpackage.bam;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class azj extends arrp implements arqr<bey, arnb> {
    final /* synthetic */ axu a;
    final /* synthetic */ azk b;
    final /* synthetic */ arrx c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public azj(axu axuVar, azk azkVar, arrx arrxVar) {
        super(1);
        this.a = axuVar;
        this.b = azkVar;
        this.c = arrxVar;
    }

    @Override // defpackage.arqr
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        bam.a aVar;
        bey beyVar = (bey) obj;
        doj dojVar = null;
        switch (this.a.ordinal()) {
            case 0:
                bfn bfnVar = beyVar.b;
                azb azbVar = azb.a;
                bfnVar.a();
                if (beyVar.g().length() > 0) {
                    if (djc.h(beyVar.c)) {
                        azbVar.a(beyVar);
                        break;
                    } else if (beyVar.i()) {
                        int d = djc.d(beyVar.c);
                        beyVar.h(d, d);
                        break;
                    } else {
                        int c = djc.c(beyVar.c);
                        beyVar.h(c, c);
                        break;
                    }
                }
                break;
            case 1:
                bfn bfnVar2 = beyVar.b;
                azc azcVar = azc.a;
                bfnVar2.a();
                if (beyVar.g().length() > 0) {
                    if (djc.h(beyVar.c)) {
                        azcVar.a(beyVar);
                        break;
                    } else if (beyVar.i()) {
                        int c2 = djc.c(beyVar.c);
                        beyVar.h(c2, c2);
                        break;
                    } else {
                        int d2 = djc.d(beyVar.c);
                        beyVar.h(d2, d2);
                        break;
                    }
                }
                break;
            case 2:
                beyVar.q();
                break;
            case 3:
                beyVar.m();
                break;
            case 4:
                beyVar.n();
                break;
            case 5:
                beyVar.o();
                break;
            case 6:
                beyVar.w();
                break;
            case 7:
                beyVar.t();
                break;
            case 8:
                beyVar.u();
                break;
            case 9:
                beyVar.v();
                break;
            case 10:
                beyVar.x();
                break;
            case 11:
                beyVar.k();
                break;
            case 12:
                beyVar.B();
                break;
            case 13:
                beyVar.A();
                break;
            case 14:
                beyVar.s();
                break;
            case 15:
                beyVar.r();
                break;
            case 16:
                this.b.b.g(false);
                break;
            case 17:
                this.b.b.m();
                break;
            case 18:
                this.b.b.h();
                break;
            case 19:
                List z = beyVar.z(azd.a);
                if (z != null) {
                    this.b.b(z);
                    break;
                }
                break;
            case 20:
                List z2 = beyVar.z(aze.a);
                if (z2 != null) {
                    this.b.b(z2);
                    break;
                }
                break;
            case 21:
                List z3 = beyVar.z(azf.a);
                if (z3 != null) {
                    this.b.b(z3);
                    break;
                }
                break;
            case 22:
                List z4 = beyVar.z(azg.a);
                if (z4 != null) {
                    this.b.b(z4);
                    break;
                }
                break;
            case 23:
                List z5 = beyVar.z(azh.a);
                if (z5 != null) {
                    this.b.b(z5);
                    break;
                }
                break;
            case 24:
                List z6 = beyVar.z(azi.a);
                if (z6 != null) {
                    this.b.b(z6);
                    break;
                }
                break;
            case 25:
                beyVar.b.a();
                if (beyVar.g().length() > 0) {
                    beyVar.h(0, beyVar.g().length());
                    break;
                }
                break;
            case 26:
                beyVar.l();
                beyVar.j();
                break;
            case 27:
                beyVar.p();
                beyVar.j();
                break;
            case 28:
                beyVar.x();
                beyVar.j();
                break;
            case ahby.ERROR_VENDOR_IMS_NOT_FOUND /* 29 */:
                beyVar.k();
                beyVar.j();
                break;
            case 30:
                beyVar.B();
                beyVar.j();
                break;
            case 31:
                beyVar.A();
                beyVar.j();
                break;
            case 32:
                beyVar.s();
                beyVar.j();
                break;
            case IGmsServiceBroker.Stub.TRANSACTION_GET_CLOUD_SAVE_SERVICE /* 33 */:
                beyVar.r();
                beyVar.j();
                break;
            case IGmsServiceBroker.Stub.TRANSACTION_GET_UDC_SERVICE /* 34 */:
                beyVar.m();
                beyVar.j();
                break;
            case IGmsServiceBroker.Stub.TRANSACTION_GET_SEARCH_CORPORA_SERVICE /* 35 */:
                beyVar.q();
                beyVar.j();
                break;
            case IGmsServiceBroker.Stub.TRANSACTION_GET_DEVICE_MANAGER_SERVICE /* 36 */:
                beyVar.n();
                beyVar.j();
                break;
            case IGmsServiceBroker.Stub.TRANSACTION_GET_PSEUDONYMOUS_ID_SERVICE /* 37 */:
                beyVar.o();
                beyVar.j();
                break;
            case IGmsServiceBroker.Stub.TRANSACTION_GET_REMINDERS_SERVICE /* 38 */:
                beyVar.w();
                beyVar.j();
                break;
            case 39:
                beyVar.t();
                beyVar.j();
                break;
            case IGmsServiceBroker.Stub.TRANSACTION_GET_COMMON_SERVICE /* 40 */:
                beyVar.u();
                beyVar.j();
                break;
            case IGmsServiceBroker.Stub.TRANSACTION_GET_CLEARCUT_LOGGER_SERVICE /* 41 */:
                beyVar.v();
                beyVar.j();
                break;
            case IGmsServiceBroker.Stub.TRANSACTION_GET_WALLET_SERVICE_WITH_PACKAGE /* 42 */:
                beyVar.b.a();
                if (beyVar.g().length() > 0) {
                    int a = djc.a(beyVar.c);
                    beyVar.h(a, a);
                    break;
                }
                break;
            case IGmsServiceBroker.Stub.TRANSACTION_GET_USAGE_REPORTING_SERVICE /* 43 */:
                azk azkVar = this.b;
                if (!azkVar.d) {
                    azkVar.a(new dmw("\n", 1));
                    break;
                } else {
                    azkVar.a.r.a(new dnn(azkVar.k));
                    break;
                }
            case IGmsServiceBroker.Stub.TRANSACTION_GET_DEVICE_CONNECTION_SERVICE /* 44 */:
                azk azkVar2 = this.b;
                if (!azkVar2.d) {
                    azkVar2.a(new dmw("\t", 1));
                    break;
                } else {
                    this.c.a = false;
                    break;
                }
            case IGmsServiceBroker.Stub.TRANSACTION_GET_KIDS_SERVICE /* 45 */:
                bam bamVar = this.b.g;
                if (bamVar != null) {
                    bamVar.b(beyVar.y());
                }
                bam bamVar2 = this.b.g;
                if (bamVar2 != null) {
                    bam.a aVar2 = bamVar2.a;
                    if (aVar2 != null && (aVar = aVar2.a) != null) {
                        bamVar2.a = aVar;
                        bamVar2.c -= aVar2.b.a().length();
                        bamVar2.b = new bam.a(bamVar2.b, aVar2.b);
                        dojVar = aVar.b;
                    }
                    if (dojVar != null) {
                        this.b.j.a(dojVar);
                        break;
                    }
                }
                break;
            case IGmsServiceBroker.Stub.TRANSACTION_GET_SERVICE /* 46 */:
                bam bamVar3 = this.b.g;
                if (bamVar3 != null) {
                    bam.a aVar3 = bamVar3.b;
                    if (aVar3 != null) {
                        bamVar3.b = aVar3.a;
                        doj dojVar2 = aVar3.b;
                        bamVar3.a = new bam.a(bamVar3.a, dojVar2);
                        bamVar3.c += dojVar2.a().length();
                        dojVar = aVar3.b;
                    }
                    if (dojVar != null) {
                        this.b.j.a(dojVar);
                        break;
                    }
                }
                break;
        }
        return arnb.a;
    }
}
