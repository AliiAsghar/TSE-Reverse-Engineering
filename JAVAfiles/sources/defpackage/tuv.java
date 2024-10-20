package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.communication.synapse.security.scytale.HandleReceiptResult;
import com.google.communication.synapse.security.scytale.NativeMessageEncryptorV2;
import com.google.communication.synapse.security.scytale.ReceiptError;
import com.google.communication.synapse.security.scytale.ReceiptInfo;
import com.google.communication.synapse.security.scytale.Scope;
import com.google.communication.synapse.security.scytale.UserDevice;
import com.google.communication.synapse.security.scytale.UserDevices;
import io.grpc.Status;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class tuv extends unp {
    private final Context a;
    private final tup b;
    private final armf c;
    private final via d;
    private final armf e;

    public tuv(Context context, tup tupVar, armf armfVar, via viaVar, armf armfVar2) {
        this.a = context;
        this.b = tupVar;
        this.c = armfVar;
        this.d = viaVar;
        this.e = armfVar2;
    }

    private final qei j(String str) {
        if (((Boolean) new mss(17).get()).booleanValue()) {
            return ((psq) this.e.b()).a(str, false);
        }
        return null;
    }

    @Override // defpackage.unp, defpackage.unx
    public final unf a() {
        une a = unf.a();
        a.d(5);
        a.g(gry.LINEAR);
        a.h(60000L);
        a.c(unv.FOREGROUND_SERVICE);
        a.b = this.d.b(this.a.getString(R.string.ftd_handler_notification_text));
        return a.a();
    }

    @Override // defpackage.unx
    public final akrh c() {
        return aktp.e("FtdHandlerWorkItem");
    }

    @Override // defpackage.unp
    public final /* bridge */ /* synthetic */ akul d(uns unsVar, apbt apbtVar) {
        apld apldVar = (apld) apbtVar;
        if (tte.f()) {
            final tuu tuuVar = (tuu) this.c.b();
            apwl apwlVar = apldVar.c;
            if (apwlVar == null) {
                apwlVar = apwl.a;
            }
            final qei j = j(apldVar.d);
            final qei j2 = j(apldVar.e);
            final String str = apldVar.d;
            final String str2 = apldVar.e;
            final String str3 = apwlVar.d;
            try {
                final ReceiptInfo a = tvm.a(apwlVar.c);
                xyo c = tuu.a.c();
                c.H("Received SIGNAL_FTD");
                c.z("remoteRegistrationId", yyb.bh(str3));
                c.z("rcsMessageId", a.getMessageId());
                c.z("reason", a.getError());
                c.q();
                if (tte.h() && a.getError() == ReceiptError.OTK_NOT_TARGETED_TO_ME) {
                    tuu.a.o("FTD is due to OTK not meant for me. Ignore it.");
                    ((mbl) tuuVar.l.b()).e("Bugle.Etouffee.Ftd.Process.Status.Counts", 19);
                    return aktp.ag(upm.b());
                }
                tuuVar.k.b();
                final Scope create = Scope.create(tuuVar.n.b());
                return ((ttb) tuuVar.c.b()).b(tuu.a(j, str)).i(new ancs() { // from class: tur
                    @Override // defpackage.ancs
                    public final ListenableFuture a(Object obj) {
                        akul h;
                        qei qeiVar = j;
                        tuu tuuVar2 = tuu.this;
                        zai zaiVar = tuuVar2.o;
                        String str4 = str;
                        NativeMessageEncryptorV2 nativeMessageEncryptorV2 = (NativeMessageEncryptorV2) obj;
                        Instant f = tuuVar2.d.f();
                        twc C = zaiVar.C(tuu.a(qeiVar, str4));
                        qei qeiVar2 = j2;
                        String str5 = str2;
                        String a2 = tuu.a(qeiVar2, str5);
                        String str6 = str3;
                        UserDevice userDevice = new UserDevice(a2, str6);
                        Scope scope = create;
                        ReceiptInfo receiptInfo = a;
                        if (!((HandleReceiptResult) twd.a(nativeMessageEncryptorV2.handleReceiptV2(scope, userDevice, receiptInfo))).getReceiptIsVerifiedFtd()) {
                            ((mbl) tuuVar2.l.b()).e("Bugle.Etouffee.Ftd.Process.Status.Counts", 18);
                            h = aktp.af(new aqwb(Status.g.withDescription("getReceiptIsVerifiedFtd is false for an FTD, it was likely not sent by us. Ignoring FTD as invalid.")));
                        } else {
                            h = akul.g(C.c(alzz.ap(new UserDevices(tuu.a(qeiVar2, str5), alzz.ap(str6))))).h(new tul(nativeMessageEncryptorV2, scope, receiptInfo, 2, (byte[]) null), tuuVar2.i);
                        }
                        return h.h(new tus(tuuVar2, f, qeiVar2, str5, str6, receiptInfo, 0), tuuVar2.i);
                    }
                }, tuuVar.i).e(aqwb.class, new ttg(tuuVar, 7), andi.a).e(twg.class, new ttg(tuuVar, 8), andi.a);
            } catch (apba e) {
                ((mbl) tuuVar.l.b()).e("Bugle.Etouffee.Ftd.Process.Status.Counts", 12);
                xyo e2 = tuu.a.e();
                e2.H("Received SIGNAL_FTD, Error while processing proto.");
                e2.L("remoteRegistrationId", str3);
                e2.r(e);
                return aktp.ag(upm.d());
            }
        }
        tup tupVar = this.b;
        apwl apwlVar2 = apldVar.c;
        if (apwlVar2 == null) {
            apwlVar2 = apwl.a;
        }
        qei j3 = j(apldVar.d);
        qei j4 = j(apldVar.e);
        String str4 = apldVar.d;
        String str5 = apldVar.e;
        String str6 = apwlVar2.d;
        try {
            ReceiptInfo a2 = tvm.a(apwlVar2.c);
            xyo c2 = tup.a.c();
            c2.H("Received SIGNAL_FTD");
            c2.z("remoteRegistrationId", yyb.bh(str6));
            c2.z("rcsMessageId", a2.getMessageId());
            c2.q();
            if (tte.h() && a2.getError() == ReceiptError.OTK_NOT_TARGETED_TO_ME) {
                tup.a.o("FTD is due to OTK not meant for me. Ignore it.");
                return aktp.ag(upm.b());
            }
            xnv xnvVar = tupVar.d;
            zai zaiVar = tupVar.o;
            Instant f = xnvVar.f();
            twc C = zaiVar.C(tup.a(j3, str4));
            tupVar.k.b();
            Scope create2 = Scope.create(tupVar.n.b());
            akul b = ((ttb) tupVar.c.b()).b(tup.a(j3, str4));
            akul i = b.i(new tua(tupVar, j4, str5, str6, create2, a2, C, 2), tupVar.i);
            return aktp.ap(i, b).h(new imh((Object) b, i, (Object) create2, (Object) a2, 7), tupVar.i).h(new tus(tupVar, f, j4, str5, str6, a2, 1), tupVar.i).e(aqwb.class, new ttg(tupVar, 5), andi.a).e(twg.class, new ttg(tupVar, 6), andi.a);
        } catch (apba e3) {
            ((mbl) tupVar.l.b()).e("Bugle.Etouffee.Ftd.Process.Status.Counts", 12);
            xyo e4 = tup.a.e();
            e4.H("Received SIGNAL_FTD, Error while processing proto.");
            e4.L("remoteRegistrationId", str6);
            e4.r(e3);
            return aktp.ag(upm.d());
        }
    }

    @Override // defpackage.unx
    public final apca e() {
        return apld.a.getParserForType();
    }
}
