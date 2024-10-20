package defpackage;

import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Map;
import j$.util.Optional;
import java.security.GeneralSecurityException;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ver implements vgq {
    public static final /* synthetic */ int e = 0;
    private static final alvi f = alvi.m("com/google/android/apps/messaging/shared/net/handler/InboxSendRpcHandler");
    public final aqfn a;
    public final String b;
    public final vcc c;
    public final anfy d;
    private final armf g;
    private final apwt h;
    private final mbl i;
    private final armf j;
    private final vcy k;
    private final vfi l;
    private final aqfn m;
    private final aqdq n;
    private final trn o;
    private final anen p;
    private final aozb q;
    private final aozb r;
    private final Optional s;
    private final armf t;
    private String u = "";
    private long v = 0;
    private String w;
    private final iew x;

    static {
        uuh.e(uuh.b, "ditto_max_hours_to_retry_push", 24);
    }

    public ver(xnv xnvVar, trn trnVar, vcc vccVar, anen anenVar, armf armfVar, apwt apwtVar, mbl mblVar, yyt yytVar, armf armfVar2, vfg vfgVar, vcy vcyVar, vcy vcyVar2, armf armfVar3, iew iewVar, veq veqVar) {
        vcy vcyVar3;
        String str;
        this.w = "";
        this.o = trnVar;
        this.c = vccVar;
        this.g = armfVar;
        this.h = apwtVar;
        this.i = mblVar;
        this.j = armfVar2;
        this.x = iewVar;
        if (true == ((lpg) armfVar3.b()).z()) {
            vcyVar3 = vcyVar2;
        } else {
            vcyVar3 = vcyVar;
        }
        this.k = vcyVar3;
        this.t = armfVar3;
        this.l = yytVar.X(vcyVar3, vfgVar);
        this.r = veqVar.g;
        Optional optional = veqVar.h;
        this.s = optional;
        aqfn aqfnVar = veqVar.a;
        this.m = aqfnVar;
        if (((lpg) armfVar3.b()).z() && optional.isPresent()) {
            this.a = ((tro) optional.get()).d;
        } else {
            this.a = aqfnVar;
        }
        this.p = anenVar;
        this.b = UUID.randomUUID().toString();
        if (!TextUtils.isEmpty(null)) {
            this.w = null;
        }
        aqdq aqdqVar = veqVar.e;
        if (aqdqVar == null) {
            this.n = aqdq.STATUS;
        } else {
            this.n = aqdqVar;
        }
        this.q = veqVar.c;
        aozy createBuilder = anfy.a.createBuilder();
        long micros = TimeUnit.MILLISECONDS.toMicros(xnvVar.f().toEpochMilli());
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        ((anfy) apagVar).f = micros;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        ((anfy) createBuilder.b).g = albo.aE(18);
        boolean z = veqVar.f;
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar2 = createBuilder.b;
        ((anfy) apagVar2).e = z;
        if (!apagVar2.isMutable()) {
            createBuilder.u();
        }
        ((anfy) createBuilder.b).d = 1;
        if (!trn.f(this.a)) {
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            ((anfy) createBuilder.b).i = true;
        }
        if (!TextUtils.isEmpty(veqVar.b)) {
            String str2 = veqVar.b;
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            anfy anfyVar = (anfy) createBuilder.b;
            str2.getClass();
            anfyVar.b = str2;
        }
        if (!veqVar.d.G()) {
            try {
                aozb i = vbm.i(veqVar.d, this.a);
                if (i != null && !i.G()) {
                    if (((lpg) armfVar3.b()).z()) {
                        if (!createBuilder.b.isMutable()) {
                            createBuilder.u();
                        }
                        ((anfy) createBuilder.b).j = i;
                    } else {
                        if (!createBuilder.b.isMutable()) {
                            createBuilder.u();
                        }
                        ((anfy) createBuilder.b).c = i;
                    }
                } else {
                    xzb.l("BugleNetwork", "Encrypted Request Error was empty");
                }
            } catch (GeneralSecurityException e2) {
                xzb.i("BugleNetwork", e2, "Request Error Encryption Failed");
            }
        }
        if (!veqVar.c.G()) {
            try {
                aozb i2 = vbm.i(veqVar.c, this.a);
                if (i2 != null && !i2.G()) {
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    ((anfy) createBuilder.b).h = i2;
                } else {
                    xzb.l("BugleNetwork", "encryptedData was empty");
                }
            } catch (GeneralSecurityException e3) {
                xzb.i("BugleNetwork", e3, "Encryption failed");
            }
        }
        anfy anfyVar2 = (anfy) createBuilder.s();
        this.d = anfyVar2;
        int aF = albo.aF(anfyVar2.g);
        if (aF != 0 && aF == 18 && !veqVar.c.G()) {
            try {
                int aF2 = albo.aF(anfyVar2.g);
                if (aF2 != 0) {
                    r3 = aF2;
                }
                String aG = albo.aG(r3);
                switch (albo.aH(((angd) apag.parseFrom(angd.a, veqVar.c, aozs.a())).b)) {
                    case 1:
                        str = "CONVERSATION";
                        break;
                    case 2:
                        str = "MESSAGE";
                        break;
                    case 3:
                        str = "TYPING";
                        break;
                    case 4:
                        str = "SETTINGS";
                        break;
                    case 5:
                        str = "PARTICIPANTS";
                        break;
                    case 6:
                        str = "USER_ALERT";
                        break;
                    case 7:
                        str = "BROWSER_PRESENCE_CHECK";
                        break;
                    case 8:
                        str = "CONVERSATION_TYPE";
                        break;
                    case 9:
                        str = "FAVORITE_STICKER_PACKS";
                        break;
                    case 10:
                        str = "RECENT_STICKERS";
                        break;
                    case 11:
                        str = "CLOUD_STORE_INFO";
                        break;
                    case 12:
                        str = "GET_BLOB_FOR_ATTACHMENT_PROGRESS_UPDATE";
                        break;
                    case 13:
                        str = "UNPAIR_GAIA_PAIRING";
                        break;
                    case 14:
                        str = "GAIA_PAIRING_INFO";
                        break;
                    case 15:
                        str = "UPDATE_NOT_SET";
                        break;
                    default:
                        str = "null";
                        break;
                }
                xzb.c("BugleNetwork", a.cg(str, aG, "Created InboxSendRequest, type: ", "."));
                return;
            } catch (apba unused) {
                xzb.g("BugleNetwork", "Created InboxSendRequest, type: " + albo.aE(18) + " with unknown inner type");
                return;
            }
        }
        int aF3 = albo.aF(anfyVar2.g);
        xzb.c("BugleNetwork", "Created InboxSendRequest, type: ".concat(albo.aG(aF3 != 0 ? aF3 : 1)));
    }

    public static void m(Throwable th) {
        if (th != null) {
            xzb.n("BugleNetwork", "Error executing RPC for Ditto InboxSendRpcHandler: ".concat(String.valueOf(th.getMessage())));
        }
    }

    @Deprecated
    public static void n(vcc vccVar, aqdu aqduVar, aqfn aqfnVar) {
        xzb.m("BugleNetwork", "result is %s", aqduVar);
        long j = aqduVar.c;
        if (aqfnVar != null && j > 0) {
            synchronized (vccVar.d) {
                if (((Long) Map.EL.getOrDefault(vccVar.e, aqfnVar, 0L)).longValue() < j) {
                    vccVar.e.put(aqfnVar, Long.valueOf(j));
                }
            }
        }
    }

    @Override // defpackage.vgq
    public final long a() {
        return this.v;
    }

    @Override // defpackage.vgq
    public final vgp b() {
        if (((lpg) this.t.b()).z() && k().equals("GDitto")) {
            return new vgl();
        }
        return vgp.c;
    }

    /* JADX WARN: Type inference failed for: r2v19, types: [java.util.concurrent.Executor, java.lang.Object] */
    @Override // defpackage.vgq
    public final ListenableFuture c(aqgb aqgbVar) {
        aozy createBuilder = aqdt.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        aqdt aqdtVar = (aqdt) apagVar;
        aqgbVar.getClass();
        aqdtVar.f = aqgbVar;
        aqdtVar.b |= 4;
        aqfn aqfnVar = this.m;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        aqdt aqdtVar2 = (aqdt) createBuilder.b;
        aqdtVar2.c = aqfnVar;
        aqdtVar2.b |= 1;
        aozy createBuilder2 = aqds.a.createBuilder();
        String str = this.b;
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        apag apagVar2 = createBuilder2.b;
        str.getClass();
        ((aqds) apagVar2).c = str;
        aqdq aqdqVar = this.n;
        if (!apagVar2.isMutable()) {
            createBuilder2.u();
        }
        ((aqds) createBuilder2.b).j = aqdqVar.a();
        aqdr aqdrVar = aqdr.DITTO;
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        ((aqds) createBuilder2.b).d = aqdrVar.a();
        aozb byteString = this.d.toByteString();
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        ((aqds) createBuilder2.b).e = byteString;
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        aqdt aqdtVar3 = (aqdt) createBuilder.b;
        aqds aqdsVar = (aqds) createBuilder2.s();
        aqdsVar.getClass();
        aqdtVar3.e = aqdsVar;
        aqdtVar3.b |= 2;
        if (((lpg) this.t.b()).z() && k().equals("GDitto")) {
            aozb aozbVar = this.r;
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            aqdt aqdtVar4 = (aqdt) createBuilder.b;
            aozbVar.getClass();
            apax apaxVar = aqdtVar4.d;
            if (!apaxVar.c()) {
                aqdtVar4.d = apag.mutableCopy(apaxVar);
            }
            aqdtVar4.d.add(aozbVar);
        }
        aqdt aqdtVar5 = (aqdt) createBuilder.s();
        this.u = aqgbVar.c;
        int aF = albo.aF(this.d.g);
        if (aF != 0 && aF == 18) {
            try {
                if (albo.aH(((angd) apag.parseFrom(angd.a, this.q, aozs.a())).b) == 2) {
                    uqg uqgVar = (uqg) this.j.b();
                    return aktp.ai(new rbg(this.a, 9), uqgVar.d).i(new prf(uqgVar, 20), andi.a).h(new veg(aqdtVar5, 14), this.p).e(Exception.class, new veg(aqdtVar5, 15), this.p);
                }
            } catch (apba unused) {
                xzb.g("BugleNetwork", "CreateRequest, type: " + albo.aE(18) + " with unknown inner type");
            }
        }
        return albo.bI(aqdtVar5);
    }

    @Override // defpackage.vgq
    public final /* bridge */ /* synthetic */ ListenableFuture d(veo veoVar, apbt apbtVar) {
        aqdt aqdtVar = (aqdt) apbtVar;
        xzb.m("BugleNetwork", "Sent InboxSendRequest: %s", aqdtVar.toString());
        return veoVar.a().e(aqdtVar);
    }

    @Override // defpackage.vgq
    public final /* bridge */ /* synthetic */ ListenableFuture e(apbt apbtVar) {
        long j;
        aqdu aqduVar = (aqdu) apbtVar;
        if (aqduVar != null) {
            aqgc aqgcVar = aqduVar.b;
            if (aqgcVar == null) {
                aqgcVar = aqgc.a;
            }
            j = aqgcVar.b;
        } else {
            j = 0;
        }
        this.v = j;
        return albo.bI(aqduVar);
    }

    @Override // defpackage.vgq
    public final String f() {
        return "InboxSendRpcHandler";
    }

    @Override // defpackage.vgq
    public final String g() {
        return this.u;
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x0131, code lost:
    
        if (((defpackage.lpg) r19.t.b()).z() != false) goto L97;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0158  */
    @Override // defpackage.vgq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(java.lang.Throwable r20) {
        /*
            Method dump skipped, instructions count: 798
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ver.h(java.lang.Throwable):void");
    }

    @Override // defpackage.vgq
    public final void i() {
        if (((lpg) this.t.b()).z()) {
            int aF = albo.aF(this.d.g);
            if (aF == 0) {
                aF = 1;
            }
            xzb.k("BugleNetwork", "Executing RPC: className=%s, type=%s, dcrId=%s, tachyonId=%s, browserId=%s, proxy=%s", "InboxSendRpcHandler", Integer.valueOf(albo.aE(aF)), this.d.b, this.b, this.a.c, this.k.getClass().getSimpleName());
            return;
        }
        int aF2 = albo.aF(this.d.g);
        if (aF2 == 0) {
            aF2 = 1;
        }
        xzb.k("BugleNetwork", "Executing RPC: className=%s, type=%s, dcrId=%s, tachyonId=%s, browserId=%s", "InboxSendRpcHandler", Integer.valueOf(albo.aE(aF2)), this.d.b, this.b, this.a.c);
    }

    @Override // defpackage.vgq
    public final void j() {
        if (((lpg) this.t.b()).z()) {
            int aF = albo.aF(this.d.g);
            if (aF == 0) {
                aF = 1;
            }
            xzb.k("BugleNetwork", "Received result for RPC: className=%s, type=%s, dcrId=%s, tachyonId=%s, browserId=%s, proxy=%s", "InboxSendRpcHandler", Integer.valueOf(albo.aE(aF)), this.d.b, this.b, this.a.c, this.k.getClass().getSimpleName());
            return;
        }
        int aF2 = albo.aF(this.d.g);
        if (aF2 == 0) {
            aF2 = 1;
        }
        xzb.k("BugleNetwork", "Received result for RPC: className=%s, type=%s, dcrId=%s, tachyonId=%s, browserId=%s", "InboxSendRpcHandler", Integer.valueOf(albo.aE(aF2)), this.d.b, this.b, this.a.c);
    }

    public final String k() {
        return this.m.d;
    }

    public final void l(ListenableFuture listenableFuture) {
        qiu.h(akul.g(listenableFuture).h(new veg(this, 13), this.p).e(aqwb.class, new vej(14), this.p).e(vbd.class, new vej(15), this.p));
    }
}
