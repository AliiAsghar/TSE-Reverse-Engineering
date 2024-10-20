package defpackage;

import android.app.Activity;
import android.content.Context;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import com.google.android.gms.duokit.DuoId;
import com.google.android.gms.duokit.LookupSingleRemoteReachabilityRequest;
import com.google.android.gms.duokit.LookupSingleRemoteReachabilityResponse;
import com.google.android.ims.provisioning.config.InstantMessageConfiguration;
import com.google.android.ims.rcsservice.filetransfer.FileTransferInfo;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.stream.Collectors;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afxz {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;

    public afxz(adiu adiuVar, adji adjiVar, wyp wypVar, armf armfVar, armf armfVar2, Function function) {
        this.e = adiuVar;
        this.c = adjiVar;
        this.f = wypVar;
        this.d = armfVar;
        this.a = armfVar2;
        this.b = function;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map, java.lang.Object] */
    private final adey l(int i) {
        return (adey) this.a.get(Integer.valueOf(i));
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v8, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0, types: [apwt, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0, types: [apwt, java.lang.Object] */
    public final afye a(ageo ageoVar, da daVar, arqg arqgVar, agdq agdqVar) {
        Activity activity = (Activity) this.a.b();
        activity.getClass();
        agak agakVar = (agak) this.b.b();
        agakVar.getClass();
        agcp agcpVar = (agcp) this.c.b();
        agcpVar.getClass();
        ?? b = this.d.b();
        b.getClass();
        ?? b2 = this.e.b();
        b2.getClass();
        arwe arweVar = (arwe) this.f.b();
        arweVar.getClass();
        return new afye(activity, agakVar, agcpVar, b, b2, arweVar, ageoVar, daVar, arqgVar, agdqVar);
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [afke, java.lang.Object] */
    public final void b() {
        if (((AtomicBoolean) ((adwv) this.f).a).compareAndSet(false, true)) {
            this.a.d("GboardDataInitializer#init", new afjm(this, 15));
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0, types: [armf, java.lang.Object] */
    public final affy c(afhw afhwVar) {
        arwe arweVar = (arwe) this.c.b();
        arweVar.getClass();
        Optional optional = (Optional) this.a.b();
        optional.getClass();
        aful afulVar = (aful) this.b.b();
        afulVar.getClass();
        afdv afdvVar = (afdv) this.e.b();
        afdvVar.getClass();
        afke afkeVar = (afke) this.f.b();
        afkeVar.getClass();
        return new affy(arweVar, optional, afulVar, afdvVar, afkeVar, this.d, afhwVar);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v0, types: [armf, java.lang.Object] */
    public final adtr d(Context context, adts adtsVar, armf armfVar, Executor executor) {
        context.getClass();
        aduw aduwVar = (aduw) this.a.b();
        aduwVar.getClass();
        adtg adtgVar = (adtg) this.f.b();
        adtgVar.getClass();
        adtn adtnVar = (adtn) this.e.b();
        adtnVar.getClass();
        adtj adtjVar = (adtj) this.c.b();
        adtjVar.getClass();
        executor.getClass();
        return new adtr(context, aduwVar, adtsVar, adtgVar, adtnVar, adtjVar, this.b, this.d, armfVar, executor);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [adiu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, java.util.function.Function] */
    public final void e(adiw adiwVar) {
        Object apply;
        Set j = ((adji) this.c).j();
        if (((Boolean) this.d.b()).booleanValue()) {
            if (((Boolean) this.a.b()).booleanValue()) {
                Object obj = this.f;
                apply = this.b.apply(j);
                ((wyp) obj).v(3, j, (Map) apply);
            } else {
                ((wyp) this.f).v(3, j, altc.a);
            }
        }
        this.e.b();
        advr.l(adms.a, "CommonRcsProvisioningChangeListenerHandler.notifyListener : Notify RcsProvisioningChangeListener %s onRcsProvisioningChange, SIM = %s, available rcs provisioning ids  = %s", this.e, advq.SIM_ID.c(adiwVar), Collection.EL.stream(j).map(new adkk(18)).collect(Collectors.joining(",")));
    }

    public final adey f() {
        adey l;
        if (((Optional) this.b).isPresent()) {
            adfc adfcVar = (adfc) ((Optional) this.b).get();
            adey[] adeyVarArr = new adey[18];
            adeyVarArr[0] = l(0);
            adeyVarArr[1] = l(1);
            adeyVarArr[17] = l(17);
            return adfcVar.a(adeyVarArr);
        }
        Object obj = this.d;
        int i = 0;
        while (true) {
            NetworkInfo networkInfo = null;
            if (i >= 3) {
                return null;
            }
            l = l(((int[]) obj)[i]);
            if (l != null) {
                if (l.g == null) {
                    advr.r(l.j, "Active interface is not available because network is null", new Object[0]);
                } else if (l.e.a == null) {
                    advr.r(l.j, "Active interface is not available because ip address is null", new Object[0]);
                } else {
                    adwp k = l.k();
                    try {
                        if (agkx.T() && aczx.z()) {
                            Network b = k.b();
                            advr.l(l.j, "Check if the interface %s is available and active network is: %s", l.d(), b);
                            if (b != null) {
                                NetworkCapabilities c = k.c(b);
                                if (aczx.r()) {
                                    if (c != null && c.hasTransport(l.m) && c.hasCapability(12) && c.hasCapability(16) && c.hasCapability(21)) {
                                        break;
                                    }
                                } else if (c != null && c.hasTransport(l.m) && c.hasCapability(12) && c.hasCapability(16)) {
                                    break;
                                }
                            } else {
                                continue;
                            }
                        } else {
                            adwp k2 = l.k();
                            Network b2 = k2.b();
                            if (b2 != null) {
                                networkInfo = k2.e(b2);
                            }
                            advr.l(l.j, "Check if the interface %s is available and active network info is: %s", l.d(), networkInfo);
                            if (networkInfo != null && networkInfo.isConnected() && networkInfo.getType() == l.l) {
                                break;
                            }
                        }
                    } catch (adwk e) {
                        advr.t(e, l.j, "Can't get active network info, missing permissions.", new Object[0]);
                    }
                }
            }
            i++;
        }
        return l;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(25:2|3|(2:5|(3:7|8|(1:10)(2:12|13)))|15|16|17|18|(3:20|(2:22|23)(2:25|(2:27|28)(2:29|(2:31|32)(2:33|(2:35|36)(2:37|(2:39|40)(1:41)))))|24)|43|44|(1:(2:122|123)(3:46|(2:48|49)(4:51|(4:54|(4:59|60|(2:116|117)(0)|66)|118|52)|121|(2:70|71)(2:68|69))|50))|(1:73)|75|(1:77)(1:110)|78|79|80|(1:82)(1:107)|83|(3:85|(2:87|88)(2:90|(2:97|98))|89)|105|106|99|8|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x022f, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0230, code lost:
    
        defpackage.advr.t(r0, r18.j, "Can't get network info, missing permissions", new java.lang.Object[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x00c3, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x00c4, code lost:
    
        defpackage.advr.t(r0, r18.j, "Can't fill link properties, missing permissions", new java.lang.Object[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0160, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0161, code lost:
    
        defpackage.advr.t(r0, r18.j, "Failed to setup network interface, trying a workaround", new java.lang.Object[0]);
        r6 = r18.l;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0170, code lost:
    
        r0 = r18.k().d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0181, code lost:
    
        if (r0 != null) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0189, code lost:
    
        r0 = java.net.InetAddress.getLocalHost();
        r18.h = defpackage.a.bV(r6, "workaround-if-for-type-");
        defpackage.advr.d(r18.j, "INTERFACE NAME=%s", r18.h);
        r18.e.e(r0.getHostAddress());
        defpackage.advr.l(r18.j, "Set IP address via fallback: %s", defpackage.advq.IP_ADDRESS.c(r0.getHostAddress()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x01c1, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x01c2, code lost:
    
        defpackage.advr.j(r0, r18.j, "Workaround failed, too.", new java.lang.Object[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0175, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0177, code lost:
    
        defpackage.advr.t(r0, r18.j, "Can't get active network info, missing permissions", new java.lang.Object[0]);
        r0 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0258 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0259 A[Catch: SocketException -> 0x0288, TRY_LEAVE, TryCatch #0 {SocketException -> 0x0288, blocks: (B:3:0x0004, B:5:0x000a, B:7:0x0029, B:8:0x024a, B:12:0x0259, B:16:0x0039, B:18:0x0044, B:20:0x004c, B:22:0x0054, B:25:0x0060, B:27:0x0066, B:29:0x0082, B:31:0x0088, B:33:0x0094, B:35:0x009a, B:37:0x00a6, B:39:0x00bd, B:44:0x00cd, B:46:0x00d4, B:50:0x0155, B:51:0x00e2, B:52:0x00e7, B:54:0x00ed, B:57:0x00fd, B:60:0x0103, B:62:0x0109, B:111:0x010e, B:113:0x0114, B:71:0x011e, B:73:0x015c, B:75:0x01cb, B:77:0x01d1, B:78:0x01e3, B:80:0x01eb, B:82:0x01f1, B:83:0x0209, B:85:0x020d, B:90:0x0212, B:92:0x021c, B:95:0x0224, B:99:0x0248, B:106:0x0239, B:107:0x01f6, B:109:0x0230, B:68:0x014c, B:127:0x0161, B:129:0x0170, B:131:0x0183, B:137:0x01c2, B:141:0x0177, B:125:0x00c4, B:134:0x0189), top: B:2:0x0004, inners: #1, #3, #4, #5 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* synthetic */ void g(defpackage.adey r18) {
        /*
            Method dump skipped, instructions count: 665
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afxz.g(adey):void");
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.Map, java.lang.Object] */
    public final void h() {
        advr.d((advp) this.c, "Refreshing ImsNetworkInterfaces.", new Object[0]);
        Collection.EL.stream(this.a.values()).forEach(new acsa(this, 17));
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v9, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0, types: [armf, java.lang.Object] */
    public final acsx i(long j, String str, String str2, FileTransferInfo fileTransferInfo, InstantMessageConfiguration instantMessageConfiguration, acug acugVar, boolean z, acnv acnvVar, actj actjVar, String str3) {
        Context context = (Context) this.d.b();
        acrm acrmVar = (acrm) this.b.b();
        adih adihVar = (adih) this.c.b();
        str.getClass();
        str2.getClass();
        fileTransferInfo.getClass();
        instantMessageConfiguration.getClass();
        acugVar.getClass();
        return new acsx(context, acrmVar, adihVar, this.a, j, str, str2, fileTransferInfo, instantMessageConfiguration, acugVar, z, acnvVar, actjVar, str3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [alhr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [alhr, java.lang.Object] */
    public final acir j(LookupSingleRemoteReachabilityRequest lookupSingleRemoteReachabilityRequest) {
        String str;
        ((acak) this.c.get()).i(14, algw.h(lookupSingleRemoteReachabilityRequest.b));
        abxg abxgVar = (abxg) this.f.get();
        acir a = ((abxa) this.d).a();
        DuoId duoId = lookupSingleRemoteReachabilityRequest.a;
        if (duoId != null && (str = duoId.b) != null && !str.isEmpty()) {
            a.r(new ktn(abxgVar, 9));
            return a.e(new abxe(abxgVar, lookupSingleRemoteReachabilityRequest, 2));
        }
        abxgVar.a.f(apug.a);
        return actx.s(new LookupSingleRemoteReachabilityResponse());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [alhr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [alhr, java.lang.Object] */
    public final acir k() {
        ((acak) this.c.get()).i(8, alfd.a);
        acak acakVar = (acak) this.c.get();
        acir a = ((abxa) this.d).a();
        acit acitVar = new acit();
        a.s(new abwx(acitVar, (Context) this.a, acakVar, 1));
        a.r(new vdn(acakVar, acitVar, 3, null));
        return (acir) acitVar.a;
    }

    public afxz(Context context, armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5) {
        this.a = context;
        this.f = armfVar;
        this.e = armfVar2;
        this.b = armfVar3;
        this.d = armfVar4;
        this.c = armfVar5;
    }

    public afxz(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.d = armfVar;
        this.b = armfVar2;
        this.c = armfVar3;
        this.e = armfVar4;
        this.f = armfVar5;
        this.a = armfVar6;
    }

    public afxz(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, byte[] bArr, short[] sArr) {
        this.a = armfVar;
        this.b = armfVar2;
        this.c = armfVar3;
        this.d = armfVar4;
        this.f = armfVar5;
        this.e = armfVar6;
    }

    public afxz(aczj aczjVar) {
        this.a = aczjVar.f("contacts_service_logging_percent", 0);
        this.d = aczjVar.f("event_service_logging_percent", 0);
        this.b = aczjVar.f("file_transfer_service_logging_percent", 0);
        this.c = aczjVar.f("ims_connection_tracker_service_logging_percent", 0);
        this.e = aczjVar.f("signup_service_logging_percent", 0);
        this.f = aczjVar.f("transport_control_service_logging_percent", 0);
    }

    public afxz(Context context, algw algwVar) {
        alhr D = albo.D(new ynw(algwVar, 11));
        this.b = D;
        this.d = new abxa(context, D);
        this.c = albo.D(new ynw(context, 12));
        this.a = context;
        byte[] bArr = null;
        albo.D(new ylq(this, context, 8, bArr));
        this.f = albo.D(new ylq(this, context, 9, bArr));
        int i = 10;
        this.e = albo.D(new ylq(this, context, i, bArr));
        int i2 = abwu.a;
        albo.D(new ynw(context, i));
    }

    public afxz(Context context, Optional optional, int[] iArr, advp advpVar, acnx acnxVar) {
        this.a = new HashMap();
        this.f = context;
        this.e = acnxVar;
        this.b = optional;
        this.d = iArr;
        this.c = advpVar;
    }

    public afxz(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, short[] sArr) {
        armfVar.getClass();
        this.a = armfVar;
        armfVar2.getClass();
        this.f = armfVar2;
        armfVar3.getClass();
        this.e = armfVar3;
        armfVar4.getClass();
        this.c = armfVar4;
        armfVar5.getClass();
        this.b = armfVar5;
        armfVar6.getClass();
        this.d = armfVar6;
    }

    public afxz(aczy aczyVar) {
        this.f = aczyVar.g("sim_state_changed_delay_seconds", 0L);
        this.e = aczyVar.g("sim_state_changed_delay_max_attempts", 1L);
        this.c = aczyVar.g("multi_sim_state_changed_delay_seconds", 0L);
        this.d = aczyVar.i("enable_iccid_binding", false);
        this.a = aczyVar.i("enable_fi_status_cache", false);
        this.b = aczyVar.i("enable_logging_subscription_changed_event", false);
    }

    public afxz(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, byte[] bArr, char[] cArr) {
        armfVar.getClass();
        this.c = armfVar;
        armfVar2.getClass();
        this.a = armfVar2;
        armfVar3.getClass();
        this.b = armfVar3;
        armfVar4.getClass();
        this.e = armfVar4;
        armfVar5.getClass();
        this.f = armfVar5;
        armfVar6.getClass();
        this.d = armfVar6;
    }

    public afxz(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, char[] cArr) {
        armfVar.getClass();
        this.d = armfVar;
        armfVar2.getClass();
        this.b = armfVar2;
        armfVar3.getClass();
        this.f = armfVar3;
        this.c = armfVar4;
        this.e = armfVar5;
        armfVar6.getClass();
        this.a = armfVar6;
    }

    public afxz(aneo aneoVar, aneo aneoVar2, aneo aneoVar3, aneo aneoVar4, adwv adwvVar, afke afkeVar) {
        aneoVar.getClass();
        aneoVar2.getClass();
        aneoVar3.getClass();
        aneoVar4.getClass();
        adwvVar.getClass();
        afkeVar.getClass();
        this.d = aneoVar;
        this.b = aneoVar2;
        this.e = aneoVar3;
        this.c = aneoVar4;
        this.f = adwvVar;
        this.a = afkeVar;
    }

    public afxz(Context context, aneo aneoVar, aneo aneoVar2, adwv adwvVar, afxz afxzVar, afke afkeVar) {
        context.getClass();
        aneoVar.getClass();
        aneoVar2.getClass();
        adwvVar.getClass();
        afkeVar.getClass();
        this.a = context;
        this.d = aneoVar;
        this.c = aneoVar2;
        this.e = adwvVar;
        this.b = afxzVar;
        this.f = afkeVar;
    }

    public afxz(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, byte[] bArr, byte[] bArr2) {
        armfVar.getClass();
        this.a = armfVar;
        armfVar2.getClass();
        this.b = armfVar2;
        armfVar3.getClass();
        this.f = armfVar3;
        armfVar4.getClass();
        this.c = armfVar4;
        this.d = armfVar5;
        armfVar6.getClass();
        this.e = armfVar6;
    }

    public afxz(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, byte[] bArr) {
        armfVar.getClass();
        this.a = armfVar;
        armfVar2.getClass();
        this.f = armfVar2;
        armfVar3.getClass();
        this.d = armfVar3;
        armfVar4.getClass();
        this.c = armfVar4;
        armfVar5.getClass();
        this.b = armfVar5;
        armfVar6.getClass();
        this.e = armfVar6;
    }

    public afxz(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6) {
        armfVar.getClass();
        this.a = armfVar;
        armfVar2.getClass();
        this.b = armfVar2;
        armfVar3.getClass();
        this.c = armfVar3;
        this.d = armfVar4;
        this.e = armfVar5;
        armfVar6.getClass();
        this.f = armfVar6;
    }
}
