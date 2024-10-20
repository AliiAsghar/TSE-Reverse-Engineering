package defpackage;

import android.content.Context;
import com.google.android.gms.common.internal.IGmsServiceBroker;
import j$.util.Map;
import j$.util.Objects;
import j$.util.Optional;
import java.util.Calendar;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acqk extends acqj {
    public static final /* synthetic */ int d = 0;
    private final acoc g;
    static final acyz c = acyy.b("enable_logging_preferred_service");
    private static final alor e = alor.l("+g.gsma.rcs.isbot", aphk.RCS_RBM_BOT_CAPABILITY);
    private static final alor f = alor.n("urn:urn-7:3gpp-service.ims.icsi.oma.cpm.session", aphm.CPM_SESSION_SERVICE, "urn:urn-7:3gpp-service.ims.icsi.oma.cpm.msg", aphm.CPM_PAGER_MODE_SERVICE, "urn:urn-7:3gpp-service.ims.icsi.oma.cpm.largemsg", aphm.CPM_LARGE_MESSAGE_MODE_SERVICE);

    public acqk(Context context, acoc acocVar) {
        super(context);
        this.g = acocVar;
    }

    public static String d(aiom aiomVar) {
        Iterator it = aiomVar.o().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            aiok aiokVar = (aiok) it.next();
            if (agkx.af(aiokVar.b, "message/cpim")) {
                try {
                    return aifd.b(aiokVar.a).g("urn:ietf:params:imdn", "Message-ID");
                } catch (Exception e2) {
                    advr.i(e2, "Failed to parse CPIM msg to get IMDN msg ID!", new Object[0]);
                }
            }
        }
        return null;
    }

    @Override // defpackage.acqj
    public final void a(String str, String str2, int i, int i2, boolean z) {
        int i3;
        aozy createBuilder = apfd.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        apfd apfdVar = (apfd) apagVar;
        apfdVar.b |= 1;
        apfdVar.c = str;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        apag apagVar2 = createBuilder.b;
        apfd apfdVar2 = (apfd) apagVar2;
        int i4 = 2;
        apfdVar2.b |= 2;
        apfdVar2.d = str2;
        int i5 = 10;
        switch (i) {
            case 1:
                i3 = 2;
                break;
            case 2:
                i3 = 3;
                break;
            case 3:
                i3 = 4;
                break;
            case 4:
            default:
                i3 = 1;
                break;
            case 5:
                i3 = 6;
                break;
            case 6:
                i3 = 7;
                break;
            case 7:
                i3 = 8;
                break;
            case 8:
                i3 = 9;
                break;
            case 9:
                i3 = 10;
                break;
        }
        if (!apagVar2.isMutable()) {
            createBuilder.u();
        }
        apag apagVar3 = createBuilder.b;
        apfd apfdVar3 = (apfd) apagVar3;
        apfdVar3.f = i3 - 1;
        apfdVar3.b |= 64;
        switch (i2) {
            case 1:
                i5 = 2;
                break;
            case 2:
                i5 = 3;
                break;
            case 3:
                i5 = 4;
                break;
            case 4:
                i5 = 5;
                break;
            case 5:
                i5 = 6;
                break;
            case 6:
                i5 = 7;
                break;
            case 7:
                i5 = 8;
                break;
            case 8:
                i5 = 9;
                break;
            case 9:
                break;
            case 10:
                i5 = 11;
                break;
            case 11:
                i5 = 12;
                break;
            case 12:
                i5 = 13;
                break;
            case 13:
                i5 = 14;
                break;
            case 14:
                i5 = 15;
                break;
            case 15:
                i5 = 16;
                break;
            case 16:
                i5 = 17;
                break;
            case 17:
                i5 = 18;
                break;
            case 18:
                i5 = 19;
                break;
            case 19:
                i5 = 20;
                break;
            case 20:
                i5 = 21;
                break;
            case 21:
                i5 = 22;
                break;
            case 22:
                i5 = 23;
                break;
            case 23:
                i5 = 24;
                break;
            case 24:
                i5 = 25;
                break;
            case 25:
                i5 = 26;
                break;
            case 26:
                i5 = 27;
                break;
            case 27:
                i5 = 28;
                break;
            case 28:
                i5 = 29;
                break;
            case ahby.ERROR_VENDOR_IMS_NOT_FOUND /* 29 */:
                i5 = 30;
                break;
            case 30:
                i5 = 31;
                break;
            case 31:
                i5 = 32;
                break;
            case 32:
                i5 = 33;
                break;
            case IGmsServiceBroker.Stub.TRANSACTION_GET_CLOUD_SAVE_SERVICE /* 33 */:
                i5 = 34;
                break;
            case IGmsServiceBroker.Stub.TRANSACTION_GET_UDC_SERVICE /* 34 */:
                i5 = 35;
                break;
            case IGmsServiceBroker.Stub.TRANSACTION_GET_SEARCH_CORPORA_SERVICE /* 35 */:
                i5 = 36;
                break;
            case IGmsServiceBroker.Stub.TRANSACTION_GET_DEVICE_MANAGER_SERVICE /* 36 */:
                i5 = 37;
                break;
            case IGmsServiceBroker.Stub.TRANSACTION_GET_PSEUDONYMOUS_ID_SERVICE /* 37 */:
                i5 = 38;
                break;
            case IGmsServiceBroker.Stub.TRANSACTION_GET_REMINDERS_SERVICE /* 38 */:
                i5 = 39;
                break;
            case 39:
                i5 = 40;
                break;
            case IGmsServiceBroker.Stub.TRANSACTION_GET_COMMON_SERVICE /* 40 */:
                i5 = 41;
                break;
            case IGmsServiceBroker.Stub.TRANSACTION_GET_CLEARCUT_LOGGER_SERVICE /* 41 */:
                i5 = 42;
                break;
            case IGmsServiceBroker.Stub.TRANSACTION_GET_WALLET_SERVICE_WITH_PACKAGE /* 42 */:
                i5 = 43;
                break;
            case IGmsServiceBroker.Stub.TRANSACTION_GET_USAGE_REPORTING_SERVICE /* 43 */:
                i5 = 44;
                break;
            case IGmsServiceBroker.Stub.TRANSACTION_GET_DEVICE_CONNECTION_SERVICE /* 44 */:
                i5 = 45;
                break;
            case IGmsServiceBroker.Stub.TRANSACTION_GET_KIDS_SERVICE /* 45 */:
                i5 = 46;
                break;
            case IGmsServiceBroker.Stub.TRANSACTION_GET_SERVICE /* 46 */:
                i5 = 47;
                break;
            case IGmsServiceBroker.Stub.TRANSACTION_VALIDATE_ACCOUNT /* 47 */:
                i5 = 48;
                break;
            case 48:
                i5 = 49;
                break;
            case 49:
                i5 = 50;
                break;
            case 50:
                i5 = 51;
                break;
            case 51:
                i5 = 52;
                break;
            case 52:
                i5 = 53;
                break;
            case 53:
                i5 = 54;
                break;
            case 54:
                i5 = 55;
                break;
            case 55:
                i5 = 56;
                break;
            case 56:
                i5 = 57;
                break;
            case 57:
                i5 = 58;
                break;
            case 58:
                i5 = 59;
                break;
            case 59:
                i5 = 60;
                break;
            case 60:
                i5 = 61;
                break;
            case 61:
                i5 = 62;
                break;
            case 62:
                i5 = 63;
                break;
            case 63:
                i5 = 64;
                break;
            case 64:
                i5 = 65;
                break;
            case 65:
                i5 = 66;
                break;
            case 66:
                i5 = 67;
                break;
            case 67:
            default:
                i5 = 1;
                break;
            case 68:
                i5 = 69;
                break;
            case 69:
                i5 = 70;
                break;
            case 70:
                i5 = 71;
                break;
        }
        if (!apagVar3.isMutable()) {
            createBuilder.u();
        }
        apag apagVar4 = createBuilder.b;
        apfd apfdVar4 = (apfd) apagVar4;
        apfdVar4.g = i5 - 1;
        apfdVar4.b |= 128;
        if (true == z) {
            i4 = 3;
        }
        if (!apagVar4.isMutable()) {
            createBuilder.u();
        }
        apfd apfdVar5 = (apfd) createBuilder.b;
        apfdVar5.e = i4 - 1;
        apfdVar5.b |= 4;
        this.g.d(this.a, (apfd) createBuilder.s());
    }

    @Override // defpackage.acqj
    public final void b(String str, int i) {
        aozy createBuilder = apfd.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        apfd apfdVar = (apfd) apagVar;
        apfdVar.b |= 2;
        apfdVar.d = str;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        apag apagVar2 = createBuilder.b;
        apfd apfdVar2 = (apfd) apagVar2;
        apfdVar2.b |= 1;
        apfdVar2.c = str;
        if (!apagVar2.isMutable()) {
            createBuilder.u();
        }
        apfd apfdVar3 = (apfd) createBuilder.b;
        apfdVar3.h = i - 1;
        apfdVar3.b |= 512;
        this.g.d(this.a, (apfd) createBuilder.s());
    }

    @Override // defpackage.acqj
    public final void c(aiom aiomVar, Optional optional, int i, int i2, aior aiorVar) {
        int i3;
        int aQ;
        int i4;
        String j;
        aozy createBuilder = aphn.a.createBuilder();
        int a = aiomVar.a();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        aphn aphnVar = (aphn) createBuilder.b;
        aphnVar.b |= 64;
        aphnVar.i = a;
        long micros = TimeUnit.MILLISECONDS.toMicros(Calendar.getInstance().getTimeInMillis());
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        aphn aphnVar2 = (aphn) createBuilder.b;
        aphnVar2.b |= 1;
        aphnVar2.c = micros;
        int E = adwf.E(aiomVar);
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        aphn aphnVar3 = (aphn) apagVar;
        aphnVar3.f = E - 1;
        aphnVar3.b |= 8;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        aphn aphnVar4 = (aphn) createBuilder.b;
        aphnVar4.d = i - 1;
        aphnVar4.b |= 2;
        String d2 = aiomVar.d();
        if (d2 != null) {
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            aphn aphnVar5 = (aphn) createBuilder.b;
            aphnVar5.b |= 512;
            aphnVar5.l = d2;
        }
        String d3 = d(aiomVar);
        String str = null;
        if (d3 == null) {
            d3 = (String) optional.map(new acpr(7)).orElse(null);
        }
        if (d3 != null) {
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            aphn aphnVar6 = (aphn) createBuilder.b;
            aphnVar6.b |= 4096;
            aphnVar6.n = d3;
        }
        String e2 = aiomVar.e();
        if (e2 != null) {
            Map.EL.forEach(e, new ajrn(e2, createBuilder, 1));
        }
        if (aiomVar instanceof aion) {
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            aphn aphnVar7 = (aphn) createBuilder.b;
            aphnVar7.e = 1;
            aphnVar7.b |= 4;
        } else {
            aioo aiooVar = (aioo) aiomVar;
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            aphn aphnVar8 = (aphn) createBuilder.b;
            aphnVar8.e = 2;
            aphnVar8.b |= 4;
            int y = aiooVar.y();
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            aphn aphnVar9 = (aphn) createBuilder.b;
            aphnVar9.b |= 16;
            aphnVar9.g = y;
            String A = aiooVar.A();
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            aphn aphnVar10 = (aphn) createBuilder.b;
            A.getClass();
            aphnVar10.b |= 32;
            aphnVar10.h = A;
            int a2 = aiol.a(aiooVar);
            if (a2 != 0) {
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                aphn aphnVar11 = (aphn) createBuilder.b;
                aphnVar11.b |= 256;
                aphnVar11.k = a2;
            }
            if (((Boolean) adwe.a.a()).booleanValue() && (i3 = aiooVar.z().m) != 0) {
                aozy createBuilder2 = aphj.a.createBuilder();
                if (!createBuilder2.b.isMutable()) {
                    createBuilder2.u();
                }
                aphj aphjVar = (aphj) createBuilder2.b;
                aphjVar.c = i3 - 1;
                aphjVar.b |= 1;
                aphj aphjVar2 = (aphj) createBuilder2.s();
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                aphn aphnVar12 = (aphn) createBuilder.b;
                aphjVar2.getClass();
                aphnVar12.r = aphjVar2;
                aphnVar12.b |= 524288;
            }
        }
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        aphn aphnVar13 = (aphn) createBuilder.b;
        aphnVar13.o = i2 - 1;
        aphnVar13.b |= 8192;
        String j2 = aiomVar.j("X-Google-Event-Id");
        if (j2 != null) {
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            aphn aphnVar14 = (aphn) createBuilder.b;
            aphnVar14.b |= 2048;
            aphnVar14.m = j2;
        }
        aimh d4 = aiomVar.a.d("Reason");
        if (d4 != null) {
            String a3 = d4.a();
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            aphn aphnVar15 = (aphn) createBuilder.b;
            a3.getClass();
            aphnVar15.b |= 128;
            aphnVar15.j = a3;
        }
        int i5 = ((aphn) createBuilder.b).f;
        int aQ2 = a.aQ(i5);
        if (((aQ2 != 0 && aQ2 == 6) || ((aQ = a.aQ(i5)) != 0 && aQ == 12)) && aiomVar.v("Contact")) {
            try {
                ailx b = aiomVar.b();
                if (b != null) {
                    str = b.e();
                }
                if (!Objects.isNull(b) && !Objects.isNull(str)) {
                    int parseInt = Integer.parseInt(str);
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    aphn aphnVar16 = (aphn) createBuilder.b;
                    aphnVar16.b |= 65536;
                    aphnVar16.q = parseInt;
                }
            } catch (NumberFormatException unused) {
            }
        }
        aozy createBuilder3 = apfs.a.createBuilder();
        String f2 = aiorVar.f();
        if (!createBuilder3.b.isMutable()) {
            createBuilder3.u();
        }
        apfs apfsVar = (apfs) createBuilder3.b;
        apfsVar.b |= 1;
        apfsVar.c = f2;
        int b2 = aiorVar.b();
        if (!createBuilder3.b.isMutable()) {
            createBuilder3.u();
        }
        apfs apfsVar2 = (apfs) createBuilder3.b;
        apfsVar2.b |= 2;
        apfsVar2.d = b2;
        if (true != aiorVar.m()) {
            i4 = 4;
        } else {
            i4 = 3;
        }
        if (!createBuilder3.b.isMutable()) {
            createBuilder3.u();
        }
        apfs apfsVar3 = (apfs) createBuilder3.b;
        apfsVar3.f = i4 - 1;
        apfsVar3.b |= 8;
        aiorVar.c();
        String c2 = aiorVar.c();
        if (!createBuilder3.b.isMutable()) {
            createBuilder3.u();
        }
        apfs apfsVar4 = (apfs) createBuilder3.b;
        apfsVar4.b = 4 | apfsVar4.b;
        apfsVar4.e = c2;
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        aphn aphnVar17 = (aphn) createBuilder.b;
        apfs apfsVar5 = (apfs) createBuilder3.s();
        apfsVar5.getClass();
        aphnVar17.p = apfsVar5;
        aphnVar17.b |= 16384;
        if (((Boolean) c.a()).booleanValue() && (j = aiomVar.j("P-Preferred-Service")) != null) {
            aphm aphmVar = (aphm) f.getOrDefault(j, aphm.UNEXPECTED_SERVICE);
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            aphn aphnVar18 = (aphn) createBuilder.b;
            aphnVar18.t = aphmVar.f;
            aphnVar18.b |= 4194304;
        }
        aphn aphnVar19 = (aphn) createBuilder.s();
        acoc acocVar = this.g;
        Context context = this.a;
        aozy createBuilder4 = apkr.a.createBuilder();
        if (!createBuilder4.b.isMutable()) {
            createBuilder4.u();
        }
        apkr apkrVar = (apkr) createBuilder4.b;
        aphnVar19.getClass();
        apkrVar.d = aphnVar19;
        apkrVar.c = 2;
        acocVar.i(context, createBuilder4, apkj.SIP_EVENT);
    }
}
