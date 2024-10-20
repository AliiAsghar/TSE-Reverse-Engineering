package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.ims.rcsservice.chatsession.message.ChatMessage;
import com.google.android.rcs.client.chatsession.message.RbmSuggestionResponseMessage;
import com.google.android.rcs.client.chatsession.message.TextMessage;
import com.google.android.rcs.client.messaging.data.ContentType;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.communication.synapse.security.scytale.NativeMessageEncryptorV2;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ttz extends wzc {
    public static final xze a = xze.g("BugleEtouffee", "EncryptedRcsMessageConverter");
    public final armf b;
    public final tvr c;
    public final anen d;
    public final anen e;

    @Deprecated
    public final armf f;
    public final mbl g;
    public final qdx h;
    public final armf i;
    public final tvy j;
    public final iji k;
    private final anen n;
    private final pvz o;
    private final msk p;
    private final iji q;

    public ttz(armf armfVar, iji ijiVar, tvr tvrVar, anen anenVar, anen anenVar2, anen anenVar3, armf armfVar2, mbl mblVar, ajsg ajsgVar, pvz pvzVar, pwa pwaVar, msk mskVar, tvy tvyVar, iji ijiVar2, armf armfVar3, qdx qdxVar) {
        super(ajsgVar, pwaVar, anenVar3);
        this.b = armfVar;
        this.q = ijiVar;
        this.c = tvrVar;
        this.d = anenVar;
        this.n = anenVar2;
        this.e = anenVar3;
        this.f = armfVar2;
        this.g = mblVar;
        this.o = pvzVar;
        this.p = mskVar;
        this.j = tvyVar;
        this.k = ijiVar2;
        this.i = armfVar3;
        this.h = qdxVar;
        ContentType contentType = ajsa.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final akul a(rve rveVar, qei qeiVar, alog alogVar, byte[] bArr, String str, amhz amhzVar, apwq apwqVar, boolean z) {
        String k;
        if (!tte.h()) {
            albo.U(!z, "Only 1:1 conversations can be encrypted");
        }
        if (qeiVar != null) {
            k = qeiVar.d;
        } else {
            k = ((vbu) this.f.b()).k();
        }
        return this.q.j(k).i(new xqx(this, rveVar, bArr, qeiVar, alogVar, str, amhzVar, z, apwqVar, 1), this.e);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final akul b(byte[] bArr, String str, qei qeiVar, rve rveVar, alog alogVar, String str2, boolean z, apwq apwqVar) {
        char c;
        amhz amhzVar;
        switch (str2.hashCode()) {
            case -1655110853:
                if (str2.equals("application/vnd.gsma.rcs-ft-http+xml")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -1334079056:
                if (str2.equals("application/vnd.gsma.rcspushlocation+xml")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -146831897:
                if (str2.equals("application/im-iscomposing+xml")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 817335912:
                if (str2.equals("text/plain")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 1151341552:
                if (str2.equals("video/ok")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1420231267:
                if (str2.equals("application/vnd.google.rcs.success")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c != 0) {
            if (c != 1) {
                if (c != 2) {
                    if (c != 3 && c != 4) {
                        if (c == 5) {
                            amhzVar = amhz.TYPING_INDICATOR;
                        } else {
                            throw new IllegalArgumentException("Unable to convert ChatMessage type to Scytale logs message type");
                        }
                    } else {
                        amhzVar = amhz.SUCCESS_RECEIPT;
                    }
                } else {
                    amhzVar = amhz.LOCATION;
                }
            } else {
                amhzVar = amhz.ATTACHMENT;
            }
        } else {
            amhzVar = amhz.TEXT;
        }
        return c(bArr, str, qeiVar, rveVar, alogVar, str2, false, amhzVar, z, apwqVar);
    }

    public final akul c(final byte[] bArr, final String str, final qei qeiVar, final rve rveVar, alog alogVar, final String str2, final boolean z, final amhz amhzVar, final boolean z2, apwq apwqVar) {
        boolean z3;
        final apwq apwqVar2;
        akrh e = aktp.e("EtouffeeMessageConverter#convert");
        if (apwqVar == null) {
            try {
                z3 = z2;
                apwqVar2 = apwq.a;
            } finally {
            }
        } else {
            z3 = z2;
            apwqVar2 = apwqVar;
        }
        akul f = d(alogVar, z3).i(new ancs() { // from class: ttw
            @Override // defpackage.ancs
            public final ListenableFuture a(Object obj) {
                String k;
                final altk altkVar = (altk) obj;
                final ttz ttzVar = ttz.this;
                if (((okg) ttzVar.i.b()).a()) {
                    qei qeiVar2 = qeiVar;
                    if (qeiVar2 != null) {
                        k = qeiVar2.d;
                    } else {
                        throw new IllegalArgumentException("Missing self identity");
                    }
                } else {
                    k = ((vbu) ttzVar.f.b()).k();
                }
                final apwq apwqVar3 = apwqVar2;
                final boolean z4 = z2;
                final amhz amhzVar2 = amhzVar;
                final boolean z5 = z;
                final String str3 = str2;
                final rve rveVar2 = rveVar;
                final String str4 = str;
                final byte[] bArr2 = bArr;
                return ((ttb) ttzVar.b.b()).b(k).h(new algk() { // from class: ttx
                    @Override // defpackage.algk
                    public final Object apply(Object obj2) {
                        String str5;
                        NativeMessageEncryptorV2 nativeMessageEncryptorV2 = (NativeMessageEncryptorV2) obj2;
                        aozy createBuilder = apwo.a.createBuilder();
                        if (!createBuilder.b.isMutable()) {
                            createBuilder.u();
                        }
                        String str6 = str4;
                        apag apagVar = createBuilder.b;
                        apwo apwoVar = (apwo) apagVar;
                        str6.getClass();
                        apwoVar.b |= 2;
                        apwoVar.d = str6;
                        if (!apagVar.isMutable()) {
                            createBuilder.u();
                        }
                        byte[] bArr3 = bArr2;
                        String str7 = str3;
                        apwo apwoVar2 = (apwo) createBuilder.b;
                        boolean z6 = true;
                        apwoVar2.b |= 1;
                        apwoVar2.c = str7;
                        aozb w = aozb.w(bArr3);
                        if (!createBuilder.b.isMutable()) {
                            createBuilder.u();
                        }
                        apag apagVar2 = createBuilder.b;
                        apwo apwoVar3 = (apwo) apagVar2;
                        apwoVar3.b |= 4;
                        apwoVar3.e = w;
                        if (!apagVar2.isMutable()) {
                            createBuilder.u();
                        }
                        amhz amhzVar3 = amhzVar2;
                        boolean z7 = z4;
                        boolean z8 = z5;
                        altk altkVar2 = altkVar;
                        rve rveVar3 = rveVar2;
                        apwq apwqVar4 = apwqVar3;
                        ttz ttzVar2 = ttz.this;
                        apwo apwoVar4 = (apwo) createBuilder.b;
                        apwqVar4.getClass();
                        apwoVar4.f = apwqVar4;
                        apwoVar4.b |= 8;
                        apwl c = ttzVar2.j.c((apwo) createBuilder.s(), rveVar3, str6, altkVar2, z8, z7, amhzVar3, nativeMessageEncryptorV2);
                        if (((Boolean) ttd.m.e()).booleanValue()) {
                            str5 = (String) ttd.n.e();
                        } else {
                            str5 = "";
                        }
                        ChatMessage.Type b = ttzVar2.j.b();
                        byte[] H = wcm.H(c, str5);
                        String e2 = rve.e(rveVar3);
                        if (amhzVar3 != amhz.READ_REPORT) {
                            z6 = false;
                        }
                        return new ChatMessage(b, H, e2, z6);
                    }
                }, ttzVar.d);
            }
        }, this.n).f(Throwable.class, new tsm(alogVar, rveVar, 12), andi.a);
        e.b(f);
        e.close();
        return f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final akul d(alog alogVar, boolean z) {
        return aktp.ai(new mti(this, alogVar, z, 3), this.d);
    }

    @Override // defpackage.wzc
    public final akul e(MessageCoreData messageCoreData, aoia aoiaVar) {
        qei qeiVar;
        akul a2;
        Object textMessage;
        if (!messageCoreData.cn()) {
            return super.e(messageCoreData, aoiaVar);
        }
        alog y = this.p.y(aoiaVar);
        boolean e = aoiaVar.e();
        akrh e2 = aktp.e("EtouffeeMessageConverter#toChat");
        try {
            if (!messageCoreData.cn()) {
                rve E = messageCoreData.E();
                E.getClass();
                Long valueOf = Long.valueOf(messageCoreData.s());
                String at = messageCoreData.at();
                at.getClass();
                if (messageCoreData.ce()) {
                    textMessage = new RbmSuggestionResponseMessage(at, rve.e(E), valueOf);
                } else {
                    textMessage = new TextMessage(at, rve.e(E), valueOf, messageCoreData.V());
                }
                a2 = aktp.ag(textMessage);
            } else {
                messageCoreData.getClass();
                rve E2 = messageCoreData.E();
                if (((okg) this.i.b()).a()) {
                    qeiVar = messageCoreData.w();
                } else {
                    qeiVar = null;
                }
                qei qeiVar2 = qeiVar;
                String at2 = messageCoreData.at();
                at2.getClass();
                a2 = a(E2, qeiVar2, y, at2.getBytes(), "text/plain", amhz.TEXT, messageCoreData.V(), e);
            }
            e2.b(a2);
            e2.close();
            return a2.h(new ttu(3), this.e).e(IllegalStateException.class, new ttu(4), this.e);
        } catch (Throwable th) {
            try {
                e2.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
