package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.android.vcard.VCardConfig;
import com.google.android.ims.rcsservice.chatsession.message.ChatMessage;
import com.google.android.rcs.client.messaging.data.ContentType;
import com.google.communication.synapse.security.scytale.DecryptResult;
import com.google.communication.synapse.security.scytale.DecryptState;
import com.google.communication.synapse.security.scytale.EncryptResult;
import com.google.communication.synapse.security.scytale.NativeMessageEncryptorV2;
import com.google.communication.synapse.security.scytale.PlaintextMessage;
import com.google.communication.synapse.security.scytale.ReceiptError;
import com.google.communication.synapse.security.scytale.ReceiptInfo;
import com.google.communication.synapse.security.scytale.Scope;
import com.google.communication.synapse.security.scytale.SecureMessage;
import com.google.communication.synapse.security.scytale.UserDevices;
import j$.time.Instant;
import j$.util.Map;
import j$.util.Optional;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class tvy {
    public static final xze a = xze.g("BugleEtouffee", "ScytaleCrypto");
    public final vcb b;
    private final Context c;
    private final armf d;
    private final armf e;
    private final tva f;
    private final armf g;
    private final armf h;
    private final armf i;
    private final mbl j;
    private final armf k;
    private final apwt l;
    private final trz m;
    private final armf n;
    private final armf o;
    private final armf p;
    private final armf q;
    private final anen r;
    private final ofv s;
    private final armf t;
    private final uac u;

    public tvy(Context context, armf armfVar, armf armfVar2, vcb vcbVar, tva tvaVar, armf armfVar3, uac uacVar, armf armfVar4, armf armfVar5, mbl mblVar, armf armfVar6, apwt apwtVar, trz trzVar, armf armfVar7, armf armfVar8, armf armfVar9, armf armfVar10, anen anenVar, ofv ofvVar, armf armfVar11) {
        this.c = context;
        this.d = armfVar;
        this.e = armfVar2;
        this.b = vcbVar;
        this.f = tvaVar;
        this.g = armfVar3;
        this.u = uacVar;
        this.h = armfVar4;
        this.i = armfVar5;
        this.j = mblVar;
        this.k = armfVar6;
        this.l = apwtVar;
        this.m = trzVar;
        this.n = armfVar7;
        this.o = armfVar8;
        this.p = armfVar9;
        this.q = armfVar10;
        this.r = anenVar;
        this.s = ofvVar;
        ContentType contentType = ajsa.a;
        this.t = armfVar11;
    }

    private static ttf g(amkb amkbVar) {
        DecryptState decryptState = DecryptState.UNTRUSTED_IDENTITY_KEY;
        ReceiptError receiptError = ReceiptError.UNKNOWN;
        int ordinal = amkbVar.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal == 3) {
                    return ttf.SENDERS_USER_ID_INCORRECT;
                }
                throw new IllegalStateException("Invalid failed identity verification reason");
            }
            return ttf.IDENTITY_VERIFICATION_RETRY_LIMIT_REACHED;
        }
        return ttf.SENDERS_IDENTITY_INCORRECT;
    }

    private final tvx h(vqy vqyVar, amkb amkbVar, Optional optional, thm thmVar) {
        if (thmVar != null) {
            long intValue = vqyVar.k - ((Integer) ttd.A.e()).intValue();
            if (intValue <= thmVar.h().toEpochMilli() && intValue <= ((thc) optional.get()).h().toEpochMilli()) {
                xyo e = a.e();
                n(e, vqyVar, optional);
                e.H("Message's identity wasn't successfully verified, dropping message.");
                e.A("remoteUser != null", true);
                e.y("messageMetadata.getReceivedTimestamp", vqyVar.k);
                e.z("remoteUser.getGuaranteedFreshAsOfTimestamp()", thmVar.h());
                e.z("remoteInstance.get().getGuaranteedFreshAsOfTimestamp", ((thc) optional.get()).h());
                e.q();
                m(vqyVar, amkbVar);
                return tvx.b(g(amkbVar));
            }
        }
        if (!((tuw) this.n.b()).a(vqyVar.a)) {
            xyo c = a.c();
            c.H("Exceeded max retry count for identity verification");
            c.g(vqyVar.a);
            c.q();
            return tvx.b(ttf.IDENTITY_VERIFICATION_RETRY_LIMIT_REACHED);
        }
        xyo c2 = a.c();
        n(c2, vqyVar, optional);
        c2.H("Received message from a new identity. Performing extra check");
        c2.z("reason", amkbVar);
        c2.q();
        this.f.b(vqyVar, vqyVar.c.d);
        return tvx.b(ttf.DECRYPTION_POSTPONED_FOR_IDENTITY_CHECK);
    }

    private final tvx i(String str, vqy vqyVar, NativeMessageEncryptorV2 nativeMessageEncryptorV2, rve rveVar, String str2, DecryptResult decryptResult, apwo apwoVar) {
        apwm apwmVar;
        boolean z;
        ChatMessage.Type type;
        String str3;
        ChatMessage chatMessage;
        ReceiptInfo receipt = decryptResult.getReceipt();
        if (receipt == null) {
            return tvx.a(apwoVar, null);
        }
        if (TextUtils.isEmpty(str)) {
            a.q("Can't send message receipt, unknown local registration id");
            if (apwoVar == null) {
                return tvx.b(ttf.LOCAL_REGISTRATION_ID_NOT_FOUND);
            }
            return tvx.a(apwoVar, null);
        }
        try {
            akrh e = aktp.e("ScytaleCryptoImpl#createReceiptMessage");
            try {
                qei qeiVar = vqyVar.c;
                String str4 = qeiVar.d;
                Instant ofEpochMilli = Instant.ofEpochMilli(vqyVar.j);
                boolean z2 = vqyVar.g;
                aozy createBuilder = apwn.a.createBuilder();
                String messageId = receipt.getMessageId();
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                apwn apwnVar = (apwn) createBuilder.b;
                messageId.getClass();
                apwnVar.b |= 1;
                apwnVar.c = messageId;
                ReceiptError error = receipt.getError();
                DecryptState decryptState = DecryptState.UNTRUSTED_IDENTITY_KEY;
                ReceiptError receiptError = ReceiptError.UNKNOWN;
                int ordinal = error.ordinal();
                if (ordinal == 0) {
                    apwmVar = apwm.UNKNOWN;
                } else if (ordinal == 1) {
                    apwmVar = apwm.SUCCESS;
                } else if (ordinal == 2) {
                    apwmVar = apwm.FAILED_TO_DECRYPT;
                } else {
                    if (ordinal != 3) {
                        throw new AssertionError("Unknown enum value");
                    }
                    apwmVar = apwm.NOT_INTENDED_RECIPIENT;
                }
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                apwn apwnVar2 = (apwn) createBuilder.b;
                apwnVar2.d = apwmVar.f;
                apwnVar2.b |= 2;
                byte[] signature = receipt.getSignature();
                if (signature != null) {
                    aozb w = aozb.w(signature);
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    apwn apwnVar3 = (apwn) createBuilder.b;
                    apwnVar3.b |= 4;
                    apwnVar3.e = w;
                }
                byte[] byteArray = ((apwn) createBuilder.s()).toByteArray();
                if (receipt.getError() == ReceiptError.SUCCESS) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(str2);
                    UserDevices[] userDevicesArr = new UserDevices[1];
                    if (((Boolean) new mss(17).get()).booleanValue()) {
                        str4 = qeiVar.d;
                    }
                    z = false;
                    userDevicesArr[0] = new UserDevices(str4, arrayList);
                    ArrayList<UserDevices> arrayList2 = new ArrayList<>(Arrays.asList(userDevicesArr));
                    tvz a2 = this.u.a();
                    a2.b(amhz.SUCCESS_RECEIPT);
                    twa a3 = a2.a();
                    aozy createBuilder2 = apwo.a.createBuilder();
                    if (!createBuilder2.b.isMutable()) {
                        createBuilder2.u();
                    }
                    apwo apwoVar2 = (apwo) createBuilder2.b;
                    apwoVar2.b |= 1;
                    apwoVar2.c = "application/vnd.google.rcs.success";
                    aozb w2 = aozb.w(byteArray);
                    if (!createBuilder2.b.isMutable()) {
                        createBuilder2.u();
                    }
                    apag apagVar = createBuilder2.b;
                    apwo apwoVar3 = (apwo) apagVar;
                    apwoVar3.b |= 4;
                    apwoVar3.e = w2;
                    if (!apagVar.isMutable()) {
                        createBuilder2.u();
                    }
                    apwo apwoVar4 = (apwo) createBuilder2.b;
                    str.getClass();
                    apwoVar4.b |= 2;
                    apwoVar4.d = str;
                    EncryptResult encryptResult = (EncryptResult) twd.a(nativeMessageEncryptorV2.encrypt(Scope.create(a3), arrayList2, true, "", false, new PlaintextMessage(rve.e(rveVar), ((apwo) createBuilder2.s()).toByteArray())));
                    albo.y(encryptResult.getMissingSessions().isEmpty());
                    SecureMessage encryptedData = encryptResult.getEncryptedData();
                    albo.C(encryptedData);
                    byteArray = encryptedData.getCipherText();
                } else {
                    z = false;
                }
                boolean z3 = (tte.i() && (receipt.getError().equals(ReceiptError.FAILED_TO_DECRYPT) || ((!tte.h() || !receipt.getError().equals(ReceiptError.OTK_NOT_TARGETED_TO_ME)) ? z : true)) && z2) ? true : z;
                aozy createBuilder3 = apwl.a.createBuilder();
                aozb w3 = aozb.w(byteArray);
                if (!createBuilder3.b.isMutable()) {
                    createBuilder3.u();
                }
                apag apagVar2 = createBuilder3.b;
                apwl apwlVar = (apwl) apagVar2;
                apwlVar.b |= 1;
                apwlVar.c = w3;
                if (!apagVar2.isMutable()) {
                    createBuilder3.u();
                }
                apag apagVar3 = createBuilder3.b;
                apwl apwlVar2 = (apwl) apagVar3;
                str.getClass();
                apwlVar2.b |= 2;
                apwlVar2.d = str;
                if (z3) {
                    if (!apagVar3.isMutable()) {
                        createBuilder3.u();
                    }
                    apwl apwlVar3 = (apwl) createBuilder3.b;
                    apwlVar3.b |= 4;
                    apwlVar3.e = true;
                }
                apwl apwlVar4 = (apwl) createBuilder3.s();
                String uuid = UUID.randomUUID().toString();
                if (this.m.u() && (receipt.getError().equals(ReceiptError.SUCCESS) || z3)) {
                    ajqu ajquVar = ajqu.DELIVERY;
                    asmg asmgVar = new asmg((byte[]) null, (byte[]) null);
                    asmgVar.q(rve.e(rveVar));
                    asmgVar.t(ajquVar);
                    asmgVar.r(ajquVar.f);
                    asmgVar.s(ofEpochMilli);
                    asmgVar.p(apwlVar4.toByteString());
                    chatMessage = new ChatMessage(ChatMessage.Type.MESSAGE_RECEIPT, ajsa.d(asmgVar.m()).a.H(), uuid);
                } else {
                    if (receipt.getError() == ReceiptError.SUCCESS) {
                        type = b();
                    } else if (f() && ttd.g()) {
                        type = ChatMessage.Type.ENCRYPTION_FTD;
                    } else {
                        type = ChatMessage.Type.TEST_FAILURE;
                    }
                    if (((Boolean) ttd.m.e()).booleanValue()) {
                        str3 = (String) ttd.n.e();
                    } else {
                        str3 = "";
                    }
                    chatMessage = new ChatMessage(type, wcm.H(apwlVar4, str3), uuid);
                }
                e.close();
                return tvx.a(apwoVar, chatMessage);
            } finally {
            }
        } catch (ajsh e2) {
            a.r("Failed to serialize a message receipt.", e2);
            if (apwoVar == null) {
                return tvx.b(ttf.INVALID_FTD_RECEIPT);
            }
            return tvx.a(apwoVar, null);
        }
    }

    private static apwo j(DecryptResult decryptResult) {
        byte[] decryptedMessage = decryptResult.getDecryptedMessage();
        albo.C(decryptedMessage);
        return (apwo) apag.parseFrom(apwo.a, decryptedMessage, aozs.a());
    }

    private static ArrayList k(altk altkVar, boolean z) {
        ArrayList arrayList = new ArrayList();
        Map.EL.forEach(altkVar.t(), new ytn(tte.a(altkVar.e(), z), arrayList, 1));
        return arrayList;
    }

    private static ArrayList l(String str) {
        tib tibVar = new tib(tid.a);
        tibVar.w("getKnownUserIdRepresentations");
        tic ticVar = new tic();
        ticVar.c(str);
        tibVar.k(new agpw(ticVar));
        return (ArrayList) tibVar.b().w().map(new ttr(str, 11)).collect(Collectors.toCollection(new toe(18)));
    }

    private final void m(vqy vqyVar, amkb amkbVar) {
        amfq amfqVar = (amfq) amfr.a.createBuilder();
        amfp amfpVar = amfp.BUGLE_E2EE_IDENTITY_VERIFICATION_MESSAGE_DROPPED;
        if (!amfqVar.b.isMutable()) {
            amfqVar.u();
        }
        amfr amfrVar = (amfr) amfqVar.b;
        amfrVar.i = amfpVar.dg;
        amfrVar.b |= 1;
        aozy createBuilder = amkc.a.createBuilder();
        String e = rve.e(vqyVar.a);
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        amkc amkcVar = (amkc) apagVar;
        amkcVar.b |= 1;
        amkcVar.c = e;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        amkc amkcVar2 = (amkc) createBuilder.b;
        amkcVar2.d = amkbVar.i;
        amkcVar2.b |= 2;
        if (!amfqVar.b.isMutable()) {
            amfqVar.u();
        }
        amfr amfrVar2 = (amfr) amfqVar.b;
        amkc amkcVar3 = (amkc) createBuilder.s();
        amkcVar3.getClass();
        amfrVar2.Y = amkcVar3;
        amfrVar2.c |= VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES;
        ((maq) this.i.b()).j(amfqVar);
    }

    private static void n(xyo xyoVar, vqy vqyVar, Optional optional) {
        xyoVar.L("remoteUserId", vqyVar.c.d);
        xyoVar.z("rcsMessageId", vqyVar.a);
        xyoVar.y("receivedTimestamp", vqyVar.k);
        if (optional.isPresent()) {
            xyoVar.z("remoteInstance.lastModifiedTimestamp", ((thc) optional.get()).k());
            xyoVar.z("remoteInstance.guaranteedFreshAsOfTimestamp", ((thc) optional.get()).h());
            xyoVar.z("remoteIdentityKey", ((thc) optional.get()).o());
            return;
        }
        xyoVar.z("remoteInstance", "empty");
    }

    /* JADX WARN: Removed duplicated region for block: B:151:0x0599 A[Catch: all -> 0x0695, TRY_ENTER, TRY_LEAVE, TryCatch #2 {, blocks: (B:4:0x0007, B:6:0x001e, B:8:0x0023, B:12:0x002b, B:15:0x0033, B:29:0x0093, B:33:0x0192, B:36:0x01a8, B:38:0x01c8, B:41:0x01d6, B:43:0x01f1, B:44:0x01f6, B:46:0x0200, B:48:0x0245, B:50:0x0263, B:53:0x0272, B:56:0x0289, B:58:0x02c6, B:59:0x030c, B:62:0x02e9, B:64:0x02fd, B:65:0x0309, B:66:0x0314, B:68:0x032a, B:73:0x03b4, B:74:0x03b7, B:82:0x057f, B:85:0x03d1, B:88:0x03ee, B:89:0x03fb, B:93:0x0402, B:97:0x041a, B:99:0x0420, B:101:0x043c, B:103:0x0444, B:105:0x04ac, B:111:0x04b5, B:122:0x04c1, B:121:0x04be, B:123:0x04c2, B:125:0x04d9, B:128:0x04e1, B:130:0x04e7, B:132:0x04ef, B:134:0x050c, B:136:0x0512, B:138:0x0516, B:141:0x0559, B:142:0x0548, B:144:0x0550, B:147:0x056f, B:148:0x0591, B:151:0x0599, B:171:0x05aa, B:175:0x05b2, B:172:0x05ad, B:182:0x0222, B:183:0x01f4, B:186:0x05d7, B:189:0x05f4, B:192:0x062c, B:194:0x063a, B:197:0x0653, B:200:0x00a0, B:202:0x00c1, B:205:0x00c8, B:207:0x00e8, B:208:0x00f0, B:210:0x00f5, B:212:0x00f9, B:213:0x00fb, B:215:0x0100, B:217:0x0104, B:218:0x0106, B:219:0x0111, B:221:0x0117, B:222:0x011b, B:224:0x011f, B:225:0x0121, B:227:0x012d, B:228:0x012f, B:235:0x0148, B:236:0x014a, B:237:0x015d, B:246:0x0184, B:247:0x0186, B:248:0x0174, B:249:0x0177, B:250:0x017a, B:251:0x017d, B:252:0x0180, B:253:0x013b, B:254:0x013e, B:255:0x0141, B:256:0x0144, B:271:0x0694, B:270:0x0691, B:91:0x03fc, B:92:0x0401, B:87:0x03d7, B:17:0x0076, B:18:0x007b, B:20:0x0081, B:23:0x0087, B:28:0x008f, B:116:0x04b8, B:265:0x068b), top: B:3:0x0007, inners: #1, #3, #7, #9, #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0192 A[Catch: all -> 0x0695, TRY_LEAVE, TryCatch #2 {, blocks: (B:4:0x0007, B:6:0x001e, B:8:0x0023, B:12:0x002b, B:15:0x0033, B:29:0x0093, B:33:0x0192, B:36:0x01a8, B:38:0x01c8, B:41:0x01d6, B:43:0x01f1, B:44:0x01f6, B:46:0x0200, B:48:0x0245, B:50:0x0263, B:53:0x0272, B:56:0x0289, B:58:0x02c6, B:59:0x030c, B:62:0x02e9, B:64:0x02fd, B:65:0x0309, B:66:0x0314, B:68:0x032a, B:73:0x03b4, B:74:0x03b7, B:82:0x057f, B:85:0x03d1, B:88:0x03ee, B:89:0x03fb, B:93:0x0402, B:97:0x041a, B:99:0x0420, B:101:0x043c, B:103:0x0444, B:105:0x04ac, B:111:0x04b5, B:122:0x04c1, B:121:0x04be, B:123:0x04c2, B:125:0x04d9, B:128:0x04e1, B:130:0x04e7, B:132:0x04ef, B:134:0x050c, B:136:0x0512, B:138:0x0516, B:141:0x0559, B:142:0x0548, B:144:0x0550, B:147:0x056f, B:148:0x0591, B:151:0x0599, B:171:0x05aa, B:175:0x05b2, B:172:0x05ad, B:182:0x0222, B:183:0x01f4, B:186:0x05d7, B:189:0x05f4, B:192:0x062c, B:194:0x063a, B:197:0x0653, B:200:0x00a0, B:202:0x00c1, B:205:0x00c8, B:207:0x00e8, B:208:0x00f0, B:210:0x00f5, B:212:0x00f9, B:213:0x00fb, B:215:0x0100, B:217:0x0104, B:218:0x0106, B:219:0x0111, B:221:0x0117, B:222:0x011b, B:224:0x011f, B:225:0x0121, B:227:0x012d, B:228:0x012f, B:235:0x0148, B:236:0x014a, B:237:0x015d, B:246:0x0184, B:247:0x0186, B:248:0x0174, B:249:0x0177, B:250:0x017a, B:251:0x017d, B:252:0x0180, B:253:0x013b, B:254:0x013e, B:255:0x0141, B:256:0x0144, B:271:0x0694, B:270:0x0691, B:91:0x03fc, B:92:0x0401, B:87:0x03d7, B:17:0x0076, B:18:0x007b, B:20:0x0081, B:23:0x0087, B:28:0x008f, B:116:0x04b8, B:265:0x068b), top: B:3:0x0007, inners: #1, #3, #7, #9, #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01a8 A[Catch: all -> 0x0695, TRY_ENTER, TryCatch #2 {, blocks: (B:4:0x0007, B:6:0x001e, B:8:0x0023, B:12:0x002b, B:15:0x0033, B:29:0x0093, B:33:0x0192, B:36:0x01a8, B:38:0x01c8, B:41:0x01d6, B:43:0x01f1, B:44:0x01f6, B:46:0x0200, B:48:0x0245, B:50:0x0263, B:53:0x0272, B:56:0x0289, B:58:0x02c6, B:59:0x030c, B:62:0x02e9, B:64:0x02fd, B:65:0x0309, B:66:0x0314, B:68:0x032a, B:73:0x03b4, B:74:0x03b7, B:82:0x057f, B:85:0x03d1, B:88:0x03ee, B:89:0x03fb, B:93:0x0402, B:97:0x041a, B:99:0x0420, B:101:0x043c, B:103:0x0444, B:105:0x04ac, B:111:0x04b5, B:122:0x04c1, B:121:0x04be, B:123:0x04c2, B:125:0x04d9, B:128:0x04e1, B:130:0x04e7, B:132:0x04ef, B:134:0x050c, B:136:0x0512, B:138:0x0516, B:141:0x0559, B:142:0x0548, B:144:0x0550, B:147:0x056f, B:148:0x0591, B:151:0x0599, B:171:0x05aa, B:175:0x05b2, B:172:0x05ad, B:182:0x0222, B:183:0x01f4, B:186:0x05d7, B:189:0x05f4, B:192:0x062c, B:194:0x063a, B:197:0x0653, B:200:0x00a0, B:202:0x00c1, B:205:0x00c8, B:207:0x00e8, B:208:0x00f0, B:210:0x00f5, B:212:0x00f9, B:213:0x00fb, B:215:0x0100, B:217:0x0104, B:218:0x0106, B:219:0x0111, B:221:0x0117, B:222:0x011b, B:224:0x011f, B:225:0x0121, B:227:0x012d, B:228:0x012f, B:235:0x0148, B:236:0x014a, B:237:0x015d, B:246:0x0184, B:247:0x0186, B:248:0x0174, B:249:0x0177, B:250:0x017a, B:251:0x017d, B:252:0x0180, B:253:0x013b, B:254:0x013e, B:255:0x0141, B:256:0x0144, B:271:0x0694, B:270:0x0691, B:91:0x03fc, B:92:0x0401, B:87:0x03d7, B:17:0x0076, B:18:0x007b, B:20:0x0081, B:23:0x0087, B:28:0x008f, B:116:0x04b8, B:265:0x068b), top: B:3:0x0007, inners: #1, #3, #7, #9, #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x03c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized defpackage.tvx a(java.lang.String r26, defpackage.apwl r27, defpackage.vqy r28, com.google.communication.synapse.security.scytale.NativeMessageEncryptorV2 r29) {
        /*
            Method dump skipped, instructions count: 1688
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tvy.a(java.lang.String, apwl, vqy, com.google.communication.synapse.security.scytale.NativeMessageEncryptorV2):tvx");
    }

    public final ChatMessage.Type b() {
        if (f() && ttd.g()) {
            return ChatMessage.Type.ENCRYPTED_MESSAGE;
        }
        return ChatMessage.Type.TEST;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:49:0x029b A[Catch: RuntimeException -> 0x0372, TRY_LEAVE, TryCatch #1 {RuntimeException -> 0x0372, blocks: (B:100:0x0110, B:102:0x0118, B:105:0x0128, B:40:0x024d, B:42:0x028a, B:46:0x0295, B:49:0x029b, B:116:0x0196, B:118:0x01c4, B:120:0x01dc, B:122:0x0221, B:123:0x0224, B:124:0x023a, B:125:0x023f, B:126:0x0240, B:127:0x0247), top: B:99:0x0110 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x02ef A[Catch: RuntimeException -> 0x036f, TryCatch #5 {RuntimeException -> 0x036f, blocks: (B:51:0x02c9, B:52:0x02e5, B:54:0x02ef, B:56:0x030c, B:57:0x030f, B:59:0x0322, B:60:0x0325, B:62:0x0342, B:64:0x034a, B:65:0x034d, B:77:0x02a6), top: B:47:0x0299 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0363 A[Catch: RuntimeException -> 0x0390, TryCatch #4 {RuntimeException -> 0x0390, blocks: (B:67:0x0358, B:68:0x035c, B:72:0x0363, B:73:0x036e, B:147:0x037f, B:148:0x0382, B:158:0x0383, B:159:0x038f, B:142:0x0379), top: B:30:0x0080, inners: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x03c9  */
    /* JADX WARN: Type inference failed for: r11v12, types: [java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.apwl c(defpackage.apwo r26, defpackage.rve r27, java.lang.String r28, defpackage.altk r29, boolean r30, boolean r31, defpackage.amhz r32, com.google.communication.synapse.security.scytale.NativeMessageEncryptorV2 r33) {
        /*
            Method dump skipped, instructions count: 1009
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tvy.c(apwo, rve, java.lang.String, altk, boolean, boolean, amhz, com.google.communication.synapse.security.scytale.NativeMessageEncryptorV2):apwl");
    }

    public final void d(thm thmVar) {
        smr l = ((uie) this.d.b()).l(thmVar.k());
        if (l != null && l.k() != 1) {
            ((rgo) this.h.b()).a(l.x()).t();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v11, types: [armf, java.lang.Object] */
    public final void e(vqy vqyVar, uax uaxVar) {
        snf e = sni.e();
        e.w("updateGroupConversationEncryptionStatusIfNeeded");
        e.h(new ttr(vqyVar, 10));
        alog t = e.b().t();
        int i = ((alsx) t).c;
        for (int i2 = 0; i2 < i; i2++) {
            smr smrVar = (smr) t.get(i2);
            if (smrVar.k() != 1) {
                this.j.e("Bugle.Etouffee.Conversation.Encryption.Update", uaxVar.t);
                aozy createBuilder = twz.a.createBuilder();
                String conversationIdType = smrVar.x().toString();
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                twz twzVar = (twz) createBuilder.b;
                conversationIdType.getClass();
                twzVar.c = conversationIdType;
                String ag = albo.ag(smrVar.V());
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                ((twz) createBuilder.b).d = ag;
                String ag2 = albo.ag(smrVar.K());
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                ((twz) createBuilder.b).e = ag2;
                if (((okg) this.t.b()).a()) {
                    qei qeiVar = vqyVar.d;
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    twz twzVar2 = (twz) createBuilder.b;
                    qeiVar.getClass();
                    twzVar2.f = qeiVar;
                    twzVar2.b |= 1;
                }
                ((uof) ((izc) this.q.b()).a.b()).b(upk.a("sync_group_then_encryption_status", (twz) createBuilder.s()));
            }
        }
    }

    final boolean f() {
        Context context = this.c;
        if (adwi.k(context) && !adwi.g(context, "ChatSessionServiceVersions", 3)) {
            return false;
        }
        return true;
    }
}
