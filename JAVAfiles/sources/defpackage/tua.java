package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.communication.synapse.security.scytale.HandleReceiptResult;
import com.google.communication.synapse.security.scytale.NativeMessageEncryptorV2;
import com.google.communication.synapse.security.scytale.ReceiptInfo;
import com.google.communication.synapse.security.scytale.Scope;
import com.google.communication.synapse.security.scytale.UserDevice;
import com.google.communication.synapse.security.scytale.UserDevices;
import io.grpc.Status;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class tua implements ancs {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    private final /* synthetic */ int h;

    public /* synthetic */ tua(ttz ttzVar, qei qeiVar, byte[] bArr, String str, rve rveVar, apwq apwqVar, Instant instant, int i) {
        this.h = i;
        this.b = ttzVar;
        this.e = qeiVar;
        this.f = bArr;
        this.d = str;
        this.g = rveVar;
        this.a = apwqVar;
        this.c = instant;
    }

    @Override // defpackage.ancs
    public final ListenableFuture a(Object obj) {
        String k;
        int i = this.h;
        boolean z = true;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        Object obj2 = this.g;
                        Object obj3 = this.b;
                        Object obj4 = this.a;
                        Object obj5 = this.e;
                        return ((wxz) this.d).g((rve) this.c, (qej) obj, (apwq) this.f, (aoia) obj5, (qgj) obj4, (qft) obj3, (qei) obj2);
                    }
                    ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) obj;
                    Object obj6 = this.b;
                    Object obj7 = this.c;
                    if (bindData != null) {
                        vwy vwyVar = (vwy) obj7;
                        msh q = ((msk) vwyVar.i.b()).q(bindData);
                        if (!q.e().isEmpty()) {
                            qei qeiVar = (qei) q.e().get();
                            aozy createBuilder = qfx.a.createBuilder();
                            if (!createBuilder.b.isMutable()) {
                                createBuilder.u();
                            }
                            Object obj8 = this.f;
                            apag apagVar = createBuilder.b;
                            qfx qfxVar = (qfx) apagVar;
                            qfxVar.b = 1 | qfxVar.b;
                            qfxVar.c = (String) obj8;
                            if (!apagVar.isMutable()) {
                                createBuilder.u();
                            }
                            Object obj9 = this.d;
                            apag apagVar2 = createBuilder.b;
                            qfx qfxVar2 = (qfx) apagVar2;
                            obj9.getClass();
                            qfxVar2.b = 2 | qfxVar2.b;
                            qfxVar2.d = (String) obj9;
                            if (!apagVar2.isMutable()) {
                                createBuilder.u();
                            }
                            Object obj10 = this.e;
                            qfx qfxVar3 = (qfx) createBuilder.b;
                            obj6.getClass();
                            qfxVar3.f = (qgr) obj6;
                            qfxVar3.b |= 16;
                            qfx qfxVar4 = (qfx) createBuilder.s();
                            if (!((okf) vwyVar.k.b()).a()) {
                                Object obj11 = this.a;
                                psq psqVar = (psq) vwyVar.h.b();
                                String W = ((smr) obj11).W();
                                W.getClass();
                                obj10 = psqVar.a(W, false);
                            }
                            return aktp.aj(new tvp(vwyVar, (qfb) this.g, qeiVar, qfxVar4, (qei) obj10, 4), vwyVar.b);
                        }
                        ((vti) vwyVar.e.b()).i((qgr) obj6, amwx.CHAT_API_REMOTE_PARTICIPANT_NOT_RCS_CAPABLE);
                        throw new IllegalStateException("no RCS identifier found for the participant to remove");
                    }
                    ((vti) ((vwy) obj7).e.b()).i((qgr) obj6, amwx.CHAT_API_INVALID_REMOTE_PARTICIPANT);
                    throw new IllegalStateException("Could not resolve Recipient for given bugleParticipantId.");
                }
                Object obj12 = this.d;
                qei qeiVar2 = (qei) this.e;
                String str = (String) obj12;
                String a = tup.a(qeiVar2, str);
                String str2 = (String) this.f;
                if (!((HandleReceiptResult) twd.a(((NativeMessageEncryptorV2) obj).handleReceipt((Scope) this.c, new UserDevice(a, str2), (ReceiptInfo) this.a))).getReceiptIsVerifiedFtd()) {
                    ((mbl) ((tup) this.g).l.b()).e("Bugle.Etouffee.Ftd.Process.Status.Counts", 18);
                    return aktp.af(new aqwb(Status.g.withDescription("getReceiptIsVerifiedFtd is false for an FTD, it was likely not sent by us. Ignoring FTD as invalid.")));
                }
                return ((twc) this.b).c(alzz.ap(new UserDevices(tup.a(qeiVar2, str), alzz.ap(str2))));
            }
            ttz ttzVar = (ttz) this.b;
            altk altkVar = (altk) obj;
            if (((okg) ttzVar.i.b()).a()) {
                Object obj13 = this.e;
                if (obj13 != null) {
                    k = ((qei) obj13).d;
                } else {
                    throw new IllegalArgumentException();
                }
            } else {
                k = ((vbu) ttzVar.f.b()).k();
            }
            Object obj14 = this.c;
            return ((ttb) ttzVar.b.b()).b(k).h(new tty(ttzVar, (String) this.d, (byte[]) this.f, (apwq) this.a, (rve) this.g, altkVar, (Instant) obj14, 0), ttzVar.d);
        }
        String str3 = (String) obj;
        Object obj15 = this.g;
        Object obj16 = this.f;
        Object obj17 = this.e;
        Object obj18 = this.d;
        Object obj19 = this.c;
        Object obj20 = this.b;
        Object obj21 = this.a;
        if (tte.i()) {
            aoia aoiaVar = (aoia) obj17;
            if (aoiaVar.e()) {
                tub tubVar = (tub) obj21;
                alog y = tubVar.c.y(aoiaVar);
                if (((alsx) y).c != 1) {
                    xyo e = tub.a.e();
                    e.H("Trying to encrypt IMDN display to multiple recipients in etouffee group message.");
                    e.H("{");
                    alur it = y.iterator();
                    while (it.hasNext()) {
                        msh mshVar = (msh) it.next();
                        if (!z) {
                            e.u(", ");
                        }
                        e.o(mshVar);
                        e.u(e);
                        z = false;
                    }
                    e.u("}");
                    e.q();
                    throw new IllegalStateException("Cannot encrypt IMDN display receipt to multiple recipients in group messaging.");
                }
                ttz ttzVar2 = tubVar.b;
                msh mshVar2 = (msh) y.get(0);
                akrh e2 = aktp.e("EtouffeeMessageConverter#encryptDisplayReceiptInXmlFormat");
                if (obj19 == null) {
                    try {
                        obj19 = apwq.a;
                    } finally {
                    }
                }
                akul f = ttzVar2.d(alog.r(mshVar2), true).i(new tua(ttzVar2, (qei) obj15, (byte[]) obj16, str3, (rve) obj20, (apwq) obj19, (Instant) obj18, 1), ttzVar2.d).f(Throwable.class, new tsm(mshVar2, obj20, 11, null), ttzVar2.e);
                e2.b(f);
                e2.close();
                return f;
            }
        }
        tub tubVar2 = (tub) obj21;
        return tubVar2.b.c((byte[]) obj16, str3, (qei) obj15, (rve) obj20, alog.r(tubVar2.c.b(((aoia) obj17).b())), "application/vnd.google.rcs.success", true, amhz.READ_REPORT, false, (apwq) obj19);
    }

    public /* synthetic */ tua(tub tubVar, rve rveVar, apwq apwqVar, Instant instant, aoia aoiaVar, byte[] bArr, qei qeiVar, int i) {
        this.h = i;
        this.a = tubVar;
        this.b = rveVar;
        this.c = apwqVar;
        this.d = instant;
        this.e = aoiaVar;
        this.f = bArr;
        this.g = qeiVar;
    }

    public /* synthetic */ tua(tup tupVar, qei qeiVar, String str, String str2, Scope scope, ReceiptInfo receiptInfo, twc twcVar, int i) {
        this.h = i;
        this.g = tupVar;
        this.e = qeiVar;
        this.d = str;
        this.f = str2;
        this.c = scope;
        this.a = receiptInfo;
        this.b = twcVar;
    }

    public /* synthetic */ tua(vwy vwyVar, qgr qgrVar, smr smrVar, String str, String str2, qfb qfbVar, qei qeiVar, int i) {
        this.h = i;
        this.c = vwyVar;
        this.b = qgrVar;
        this.a = smrVar;
        this.d = str;
        this.f = str2;
        this.g = qfbVar;
        this.e = qeiVar;
    }

    public /* synthetic */ tua(wxz wxzVar, rve rveVar, apwq apwqVar, aoia aoiaVar, qgj qgjVar, qft qftVar, qei qeiVar, int i) {
        this.h = i;
        this.d = wxzVar;
        this.c = rveVar;
        this.f = apwqVar;
        this.e = aoiaVar;
        this.a = qgjVar;
        this.b = qftVar;
        this.g = qeiVar;
    }
}
