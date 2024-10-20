package com.google.android.apps.messaging.shared.datamodel.action;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import defpackage.agnq;
import defpackage.akrh;
import defpackage.aktp;
import defpackage.alvi;
import defpackage.amdy;
import defpackage.armf;
import defpackage.lpg;
import defpackage.mho;
import defpackage.qyn;
import defpackage.rbw;
import defpackage.rdk;
import defpackage.rfl;
import defpackage.rim;
import defpackage.rji;
import defpackage.rtb;
import defpackage.ryg;
import defpackage.rys;
import defpackage.sxt;
import defpackage.sxy;
import defpackage.tqx;
import defpackage.wyt;
import defpackage.wzs;
import defpackage.xnv;
import defpackage.xyl;
import defpackage.xze;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ReceiveWapPushSiMessageAction extends Action<MessageCoreData> implements Parcelable {
    private final rim A;
    private final rji B;
    private final agnq C;
    private final armf D;
    private final armf E;
    private final armf F;
    private final armf G;
    private final armf H;
    private final armf I;
    private final lpg J;
    public final armf a;
    public final armf b;
    public final armf c;
    public final qyn d;
    public final rys e;
    public final tqx f;
    public final rtb g;
    public final armf h;
    private final Context k;
    private final xnv l;
    private final wyt m;
    private final mho n;
    private final wzs o;
    private final armf p;
    private final armf q;
    private final ryg z;
    private static final xze i = xze.g("BugleDataModel", "ReceiveWapPushSiMessageAction");
    private static final alvi j = alvi.m("com/google/android/apps/messaging/shared/datamodel/action/ReceiveWapPushSiMessageAction");
    public static final Parcelable.Creator<Action<MessageCoreData>> CREATOR = new rdk(8);

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public interface a {
        rfl Pv();
    }

    public ReceiveWapPushSiMessageAction(Context context, armf armfVar, xnv xnvVar, wyt wytVar, mho mhoVar, wzs wzsVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, ryg rygVar, qyn qynVar, rim rimVar, rys rysVar, rji rjiVar, tqx tqxVar, rtb rtbVar, agnq agnqVar, armf armfVar6, lpg lpgVar, armf armfVar7, armf armfVar8, armf armfVar9, armf armfVar10, armf armfVar11, armf armfVar12, int i2, byte[] bArr, long j2) {
        super(amdy.RECEIVE_WAP_PUSH_SI_MESSAGE_ACTION);
        this.B = rjiVar;
        this.C = agnqVar;
        this.D = armfVar6;
        this.E = armfVar7;
        this.F = armfVar8;
        this.u.r("sub_id", i2);
        this.u.q("push_data", bArr);
        this.u.s("message_logging_id", j2);
        this.k = context;
        this.a = armfVar;
        this.l = xnvVar;
        this.m = wytVar;
        this.n = mhoVar;
        this.o = wzsVar;
        this.b = armfVar2;
        this.p = armfVar3;
        this.c = armfVar4;
        this.q = armfVar5;
        this.z = rygVar;
        this.d = qynVar;
        this.A = rimVar;
        this.e = rysVar;
        this.f = tqxVar;
        this.g = rtbVar;
        this.J = lpgVar;
        this.h = armfVar9;
        this.G = armfVar10;
        this.H = armfVar11;
        this.I = armfVar12;
    }

    private final MessageCoreData h(String str) {
        MessageCoreData messageCoreData;
        akrh e = aktp.e("ReceiveWapPushSiMessageAction#readWapPushSiMessageData");
        try {
            xyl.h();
            sxy d = MessagesTable.d();
            d.w("readWapPushSiMessageData");
            d.g(new rbw(str, 4));
            MessagesTable.BindData bindData = (MessagesTable.BindData) ((sxt) d.b().n()).cO();
            if (bindData != null) {
                messageCoreData = this.f.a();
                messageCoreData.aI(bindData);
            } else {
                messageCoreData = null;
            }
            e.close();
            return messageCoreData;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final akrh a() {
        return aktp.e("ReceiveWapPushSiMessageAction");
    }

    /* JADX WARN: Code restructure failed: missing block: B:181:0x02e7, code lost:
    
        if (r2 != 0) goto L194;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x02ea, code lost:
    
        if (r15 != 1) goto L194;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x02f0, code lost:
    
        if (r3.g > r3.e) goto L194;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x02f2, code lost:
    
        r7 = r3.h;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:220:0x00fe. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:287:0x0116. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0308 A[Catch: all -> 0x0742, TryCatch #0 {all -> 0x0742, blocks: (B:3:0x0007, B:9:0x02fd, B:14:0x0308, B:16:0x032a, B:19:0x033e, B:20:0x0353, B:22:0x035b, B:23:0x0370, B:25:0x037f, B:26:0x039f, B:28:0x03a7, B:29:0x03c7, B:30:0x03df, B:32:0x0403, B:33:0x0406, B:35:0x040e, B:36:0x041e, B:37:0x03e5, B:38:0x03eb, B:39:0x03f1, B:40:0x03f7, B:41:0x03fd, B:42:0x03c2, B:43:0x039a, B:44:0x036b, B:45:0x034e, B:46:0x042d, B:50:0x0438, B:52:0x0440, B:55:0x0449, B:56:0x0452, B:58:0x045a, B:60:0x046e, B:61:0x0489, B:63:0x048f, B:65:0x0495, B:67:0x049f, B:68:0x04a8, B:69:0x04ad, B:71:0x0517, B:73:0x051d, B:74:0x0561, B:76:0x059c, B:78:0x05a2, B:81:0x05ab, B:83:0x05b3, B:85:0x05c0, B:86:0x05c5, B:88:0x05dd, B:89:0x05e6, B:91:0x0630, B:95:0x0691, B:97:0x0696, B:99:0x06a6, B:100:0x06a9, B:102:0x06bc, B:103:0x06bf, B:104:0x0716, B:105:0x064f, B:107:0x065b, B:108:0x0663, B:110:0x068b, B:113:0x0639, B:114:0x070e, B:115:0x0520, B:116:0x0570, B:118:0x0578, B:119:0x058f, B:120:0x058d, B:121:0x071c, B:124:0x072b, B:125:0x0735, B:126:0x0038, B:129:0x003f, B:139:0x005c, B:141:0x006b, B:144:0x0073, B:145:0x0075, B:146:0x0080, B:161:0x00ac, B:163:0x00b2, B:165:0x00ba, B:167:0x00c0, B:169:0x00c6, B:171:0x00cd, B:173:0x00d4, B:176:0x02d8, B:184:0x02ec, B:186:0x02f2, B:219:0x00f6, B:220:0x00fe, B:221:0x0103, B:223:0x010e, B:225:0x0224, B:227:0x022d, B:230:0x0231, B:232:0x0236, B:233:0x023d, B:234:0x0242, B:243:0x02b3, B:246:0x0256, B:248:0x025d, B:249:0x029b, B:251:0x02a3, B:254:0x02a7, B:257:0x02ac, B:262:0x0262, B:263:0x0268, B:265:0x026c, B:267:0x0272, B:269:0x027f, B:272:0x0287, B:274:0x028e, B:287:0x0116, B:289:0x0127, B:291:0x0132, B:292:0x013e, B:294:0x0169, B:296:0x0171, B:299:0x0142, B:300:0x014a, B:301:0x014d, B:302:0x0156, B:303:0x015f, B:312:0x017a, B:319:0x0210, B:320:0x0215, B:322:0x018e, B:325:0x019b, B:329:0x01a9, B:331:0x01c3, B:333:0x01db, B:335:0x021a, B:347:0x02c9, B:354:0x02d4), top: B:2:0x0007, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:227:0x022d A[Catch: all -> 0x0742, TryCatch #0 {all -> 0x0742, blocks: (B:3:0x0007, B:9:0x02fd, B:14:0x0308, B:16:0x032a, B:19:0x033e, B:20:0x0353, B:22:0x035b, B:23:0x0370, B:25:0x037f, B:26:0x039f, B:28:0x03a7, B:29:0x03c7, B:30:0x03df, B:32:0x0403, B:33:0x0406, B:35:0x040e, B:36:0x041e, B:37:0x03e5, B:38:0x03eb, B:39:0x03f1, B:40:0x03f7, B:41:0x03fd, B:42:0x03c2, B:43:0x039a, B:44:0x036b, B:45:0x034e, B:46:0x042d, B:50:0x0438, B:52:0x0440, B:55:0x0449, B:56:0x0452, B:58:0x045a, B:60:0x046e, B:61:0x0489, B:63:0x048f, B:65:0x0495, B:67:0x049f, B:68:0x04a8, B:69:0x04ad, B:71:0x0517, B:73:0x051d, B:74:0x0561, B:76:0x059c, B:78:0x05a2, B:81:0x05ab, B:83:0x05b3, B:85:0x05c0, B:86:0x05c5, B:88:0x05dd, B:89:0x05e6, B:91:0x0630, B:95:0x0691, B:97:0x0696, B:99:0x06a6, B:100:0x06a9, B:102:0x06bc, B:103:0x06bf, B:104:0x0716, B:105:0x064f, B:107:0x065b, B:108:0x0663, B:110:0x068b, B:113:0x0639, B:114:0x070e, B:115:0x0520, B:116:0x0570, B:118:0x0578, B:119:0x058f, B:120:0x058d, B:121:0x071c, B:124:0x072b, B:125:0x0735, B:126:0x0038, B:129:0x003f, B:139:0x005c, B:141:0x006b, B:144:0x0073, B:145:0x0075, B:146:0x0080, B:161:0x00ac, B:163:0x00b2, B:165:0x00ba, B:167:0x00c0, B:169:0x00c6, B:171:0x00cd, B:173:0x00d4, B:176:0x02d8, B:184:0x02ec, B:186:0x02f2, B:219:0x00f6, B:220:0x00fe, B:221:0x0103, B:223:0x010e, B:225:0x0224, B:227:0x022d, B:230:0x0231, B:232:0x0236, B:233:0x023d, B:234:0x0242, B:243:0x02b3, B:246:0x0256, B:248:0x025d, B:249:0x029b, B:251:0x02a3, B:254:0x02a7, B:257:0x02ac, B:262:0x0262, B:263:0x0268, B:265:0x026c, B:267:0x0272, B:269:0x027f, B:272:0x0287, B:274:0x028e, B:287:0x0116, B:289:0x0127, B:291:0x0132, B:292:0x013e, B:294:0x0169, B:296:0x0171, B:299:0x0142, B:300:0x014a, B:301:0x014d, B:302:0x0156, B:303:0x015f, B:312:0x017a, B:319:0x0210, B:320:0x0215, B:322:0x018e, B:325:0x019b, B:329:0x01a9, B:331:0x01c3, B:333:0x01db, B:335:0x021a, B:347:0x02c9, B:354:0x02d4), top: B:2:0x0007, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0236 A[Catch: all -> 0x0742, TryCatch #0 {all -> 0x0742, blocks: (B:3:0x0007, B:9:0x02fd, B:14:0x0308, B:16:0x032a, B:19:0x033e, B:20:0x0353, B:22:0x035b, B:23:0x0370, B:25:0x037f, B:26:0x039f, B:28:0x03a7, B:29:0x03c7, B:30:0x03df, B:32:0x0403, B:33:0x0406, B:35:0x040e, B:36:0x041e, B:37:0x03e5, B:38:0x03eb, B:39:0x03f1, B:40:0x03f7, B:41:0x03fd, B:42:0x03c2, B:43:0x039a, B:44:0x036b, B:45:0x034e, B:46:0x042d, B:50:0x0438, B:52:0x0440, B:55:0x0449, B:56:0x0452, B:58:0x045a, B:60:0x046e, B:61:0x0489, B:63:0x048f, B:65:0x0495, B:67:0x049f, B:68:0x04a8, B:69:0x04ad, B:71:0x0517, B:73:0x051d, B:74:0x0561, B:76:0x059c, B:78:0x05a2, B:81:0x05ab, B:83:0x05b3, B:85:0x05c0, B:86:0x05c5, B:88:0x05dd, B:89:0x05e6, B:91:0x0630, B:95:0x0691, B:97:0x0696, B:99:0x06a6, B:100:0x06a9, B:102:0x06bc, B:103:0x06bf, B:104:0x0716, B:105:0x064f, B:107:0x065b, B:108:0x0663, B:110:0x068b, B:113:0x0639, B:114:0x070e, B:115:0x0520, B:116:0x0570, B:118:0x0578, B:119:0x058f, B:120:0x058d, B:121:0x071c, B:124:0x072b, B:125:0x0735, B:126:0x0038, B:129:0x003f, B:139:0x005c, B:141:0x006b, B:144:0x0073, B:145:0x0075, B:146:0x0080, B:161:0x00ac, B:163:0x00b2, B:165:0x00ba, B:167:0x00c0, B:169:0x00c6, B:171:0x00cd, B:173:0x00d4, B:176:0x02d8, B:184:0x02ec, B:186:0x02f2, B:219:0x00f6, B:220:0x00fe, B:221:0x0103, B:223:0x010e, B:225:0x0224, B:227:0x022d, B:230:0x0231, B:232:0x0236, B:233:0x023d, B:234:0x0242, B:243:0x02b3, B:246:0x0256, B:248:0x025d, B:249:0x029b, B:251:0x02a3, B:254:0x02a7, B:257:0x02ac, B:262:0x0262, B:263:0x0268, B:265:0x026c, B:267:0x0272, B:269:0x027f, B:272:0x0287, B:274:0x028e, B:287:0x0116, B:289:0x0127, B:291:0x0132, B:292:0x013e, B:294:0x0169, B:296:0x0171, B:299:0x0142, B:300:0x014a, B:301:0x014d, B:302:0x0156, B:303:0x015f, B:312:0x017a, B:319:0x0210, B:320:0x0215, B:322:0x018e, B:325:0x019b, B:329:0x01a9, B:331:0x01c3, B:333:0x01db, B:335:0x021a, B:347:0x02c9, B:354:0x02d4), top: B:2:0x0007, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:236:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x02b3 A[Catch: all -> 0x0742, TryCatch #0 {all -> 0x0742, blocks: (B:3:0x0007, B:9:0x02fd, B:14:0x0308, B:16:0x032a, B:19:0x033e, B:20:0x0353, B:22:0x035b, B:23:0x0370, B:25:0x037f, B:26:0x039f, B:28:0x03a7, B:29:0x03c7, B:30:0x03df, B:32:0x0403, B:33:0x0406, B:35:0x040e, B:36:0x041e, B:37:0x03e5, B:38:0x03eb, B:39:0x03f1, B:40:0x03f7, B:41:0x03fd, B:42:0x03c2, B:43:0x039a, B:44:0x036b, B:45:0x034e, B:46:0x042d, B:50:0x0438, B:52:0x0440, B:55:0x0449, B:56:0x0452, B:58:0x045a, B:60:0x046e, B:61:0x0489, B:63:0x048f, B:65:0x0495, B:67:0x049f, B:68:0x04a8, B:69:0x04ad, B:71:0x0517, B:73:0x051d, B:74:0x0561, B:76:0x059c, B:78:0x05a2, B:81:0x05ab, B:83:0x05b3, B:85:0x05c0, B:86:0x05c5, B:88:0x05dd, B:89:0x05e6, B:91:0x0630, B:95:0x0691, B:97:0x0696, B:99:0x06a6, B:100:0x06a9, B:102:0x06bc, B:103:0x06bf, B:104:0x0716, B:105:0x064f, B:107:0x065b, B:108:0x0663, B:110:0x068b, B:113:0x0639, B:114:0x070e, B:115:0x0520, B:116:0x0570, B:118:0x0578, B:119:0x058f, B:120:0x058d, B:121:0x071c, B:124:0x072b, B:125:0x0735, B:126:0x0038, B:129:0x003f, B:139:0x005c, B:141:0x006b, B:144:0x0073, B:145:0x0075, B:146:0x0080, B:161:0x00ac, B:163:0x00b2, B:165:0x00ba, B:167:0x00c0, B:169:0x00c6, B:171:0x00cd, B:173:0x00d4, B:176:0x02d8, B:184:0x02ec, B:186:0x02f2, B:219:0x00f6, B:220:0x00fe, B:221:0x0103, B:223:0x010e, B:225:0x0224, B:227:0x022d, B:230:0x0231, B:232:0x0236, B:233:0x023d, B:234:0x0242, B:243:0x02b3, B:246:0x0256, B:248:0x025d, B:249:0x029b, B:251:0x02a3, B:254:0x02a7, B:257:0x02ac, B:262:0x0262, B:263:0x0268, B:265:0x026c, B:267:0x0272, B:269:0x027f, B:272:0x0287, B:274:0x028e, B:287:0x0116, B:289:0x0127, B:291:0x0132, B:292:0x013e, B:294:0x0169, B:296:0x0171, B:299:0x0142, B:300:0x014a, B:301:0x014d, B:302:0x0156, B:303:0x015f, B:312:0x017a, B:319:0x0210, B:320:0x0215, B:322:0x018e, B:325:0x019b, B:329:0x01a9, B:331:0x01c3, B:333:0x01db, B:335:0x021a, B:347:0x02c9, B:354:0x02d4), top: B:2:0x0007, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:244:0x02b2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:251:0x02a3 A[Catch: all -> 0x0742, TryCatch #0 {all -> 0x0742, blocks: (B:3:0x0007, B:9:0x02fd, B:14:0x0308, B:16:0x032a, B:19:0x033e, B:20:0x0353, B:22:0x035b, B:23:0x0370, B:25:0x037f, B:26:0x039f, B:28:0x03a7, B:29:0x03c7, B:30:0x03df, B:32:0x0403, B:33:0x0406, B:35:0x040e, B:36:0x041e, B:37:0x03e5, B:38:0x03eb, B:39:0x03f1, B:40:0x03f7, B:41:0x03fd, B:42:0x03c2, B:43:0x039a, B:44:0x036b, B:45:0x034e, B:46:0x042d, B:50:0x0438, B:52:0x0440, B:55:0x0449, B:56:0x0452, B:58:0x045a, B:60:0x046e, B:61:0x0489, B:63:0x048f, B:65:0x0495, B:67:0x049f, B:68:0x04a8, B:69:0x04ad, B:71:0x0517, B:73:0x051d, B:74:0x0561, B:76:0x059c, B:78:0x05a2, B:81:0x05ab, B:83:0x05b3, B:85:0x05c0, B:86:0x05c5, B:88:0x05dd, B:89:0x05e6, B:91:0x0630, B:95:0x0691, B:97:0x0696, B:99:0x06a6, B:100:0x06a9, B:102:0x06bc, B:103:0x06bf, B:104:0x0716, B:105:0x064f, B:107:0x065b, B:108:0x0663, B:110:0x068b, B:113:0x0639, B:114:0x070e, B:115:0x0520, B:116:0x0570, B:118:0x0578, B:119:0x058f, B:120:0x058d, B:121:0x071c, B:124:0x072b, B:125:0x0735, B:126:0x0038, B:129:0x003f, B:139:0x005c, B:141:0x006b, B:144:0x0073, B:145:0x0075, B:146:0x0080, B:161:0x00ac, B:163:0x00b2, B:165:0x00ba, B:167:0x00c0, B:169:0x00c6, B:171:0x00cd, B:173:0x00d4, B:176:0x02d8, B:184:0x02ec, B:186:0x02f2, B:219:0x00f6, B:220:0x00fe, B:221:0x0103, B:223:0x010e, B:225:0x0224, B:227:0x022d, B:230:0x0231, B:232:0x0236, B:233:0x023d, B:234:0x0242, B:243:0x02b3, B:246:0x0256, B:248:0x025d, B:249:0x029b, B:251:0x02a3, B:254:0x02a7, B:257:0x02ac, B:262:0x0262, B:263:0x0268, B:265:0x026c, B:267:0x0272, B:269:0x027f, B:272:0x0287, B:274:0x028e, B:287:0x0116, B:289:0x0127, B:291:0x0132, B:292:0x013e, B:294:0x0169, B:296:0x0171, B:299:0x0142, B:300:0x014a, B:301:0x014d, B:302:0x0156, B:303:0x015f, B:312:0x017a, B:319:0x0210, B:320:0x0215, B:322:0x018e, B:325:0x019b, B:329:0x01a9, B:331:0x01c3, B:333:0x01db, B:335:0x021a, B:347:0x02c9, B:354:0x02d4), top: B:2:0x0007, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:256:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x02ac A[Catch: all -> 0x0742, TryCatch #0 {all -> 0x0742, blocks: (B:3:0x0007, B:9:0x02fd, B:14:0x0308, B:16:0x032a, B:19:0x033e, B:20:0x0353, B:22:0x035b, B:23:0x0370, B:25:0x037f, B:26:0x039f, B:28:0x03a7, B:29:0x03c7, B:30:0x03df, B:32:0x0403, B:33:0x0406, B:35:0x040e, B:36:0x041e, B:37:0x03e5, B:38:0x03eb, B:39:0x03f1, B:40:0x03f7, B:41:0x03fd, B:42:0x03c2, B:43:0x039a, B:44:0x036b, B:45:0x034e, B:46:0x042d, B:50:0x0438, B:52:0x0440, B:55:0x0449, B:56:0x0452, B:58:0x045a, B:60:0x046e, B:61:0x0489, B:63:0x048f, B:65:0x0495, B:67:0x049f, B:68:0x04a8, B:69:0x04ad, B:71:0x0517, B:73:0x051d, B:74:0x0561, B:76:0x059c, B:78:0x05a2, B:81:0x05ab, B:83:0x05b3, B:85:0x05c0, B:86:0x05c5, B:88:0x05dd, B:89:0x05e6, B:91:0x0630, B:95:0x0691, B:97:0x0696, B:99:0x06a6, B:100:0x06a9, B:102:0x06bc, B:103:0x06bf, B:104:0x0716, B:105:0x064f, B:107:0x065b, B:108:0x0663, B:110:0x068b, B:113:0x0639, B:114:0x070e, B:115:0x0520, B:116:0x0570, B:118:0x0578, B:119:0x058f, B:120:0x058d, B:121:0x071c, B:124:0x072b, B:125:0x0735, B:126:0x0038, B:129:0x003f, B:139:0x005c, B:141:0x006b, B:144:0x0073, B:145:0x0075, B:146:0x0080, B:161:0x00ac, B:163:0x00b2, B:165:0x00ba, B:167:0x00c0, B:169:0x00c6, B:171:0x00cd, B:173:0x00d4, B:176:0x02d8, B:184:0x02ec, B:186:0x02f2, B:219:0x00f6, B:220:0x00fe, B:221:0x0103, B:223:0x010e, B:225:0x0224, B:227:0x022d, B:230:0x0231, B:232:0x0236, B:233:0x023d, B:234:0x0242, B:243:0x02b3, B:246:0x0256, B:248:0x025d, B:249:0x029b, B:251:0x02a3, B:254:0x02a7, B:257:0x02ac, B:262:0x0262, B:263:0x0268, B:265:0x026c, B:267:0x0272, B:269:0x027f, B:272:0x0287, B:274:0x028e, B:287:0x0116, B:289:0x0127, B:291:0x0132, B:292:0x013e, B:294:0x0169, B:296:0x0171, B:299:0x0142, B:300:0x014a, B:301:0x014d, B:302:0x0156, B:303:0x015f, B:312:0x017a, B:319:0x0210, B:320:0x0215, B:322:0x018e, B:325:0x019b, B:329:0x01a9, B:331:0x01c3, B:333:0x01db, B:335:0x021a, B:347:0x02c9, B:354:0x02d4), top: B:2:0x0007, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:259:0x02a7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0262 A[Catch: all -> 0x0742, TryCatch #0 {all -> 0x0742, blocks: (B:3:0x0007, B:9:0x02fd, B:14:0x0308, B:16:0x032a, B:19:0x033e, B:20:0x0353, B:22:0x035b, B:23:0x0370, B:25:0x037f, B:26:0x039f, B:28:0x03a7, B:29:0x03c7, B:30:0x03df, B:32:0x0403, B:33:0x0406, B:35:0x040e, B:36:0x041e, B:37:0x03e5, B:38:0x03eb, B:39:0x03f1, B:40:0x03f7, B:41:0x03fd, B:42:0x03c2, B:43:0x039a, B:44:0x036b, B:45:0x034e, B:46:0x042d, B:50:0x0438, B:52:0x0440, B:55:0x0449, B:56:0x0452, B:58:0x045a, B:60:0x046e, B:61:0x0489, B:63:0x048f, B:65:0x0495, B:67:0x049f, B:68:0x04a8, B:69:0x04ad, B:71:0x0517, B:73:0x051d, B:74:0x0561, B:76:0x059c, B:78:0x05a2, B:81:0x05ab, B:83:0x05b3, B:85:0x05c0, B:86:0x05c5, B:88:0x05dd, B:89:0x05e6, B:91:0x0630, B:95:0x0691, B:97:0x0696, B:99:0x06a6, B:100:0x06a9, B:102:0x06bc, B:103:0x06bf, B:104:0x0716, B:105:0x064f, B:107:0x065b, B:108:0x0663, B:110:0x068b, B:113:0x0639, B:114:0x070e, B:115:0x0520, B:116:0x0570, B:118:0x0578, B:119:0x058f, B:120:0x058d, B:121:0x071c, B:124:0x072b, B:125:0x0735, B:126:0x0038, B:129:0x003f, B:139:0x005c, B:141:0x006b, B:144:0x0073, B:145:0x0075, B:146:0x0080, B:161:0x00ac, B:163:0x00b2, B:165:0x00ba, B:167:0x00c0, B:169:0x00c6, B:171:0x00cd, B:173:0x00d4, B:176:0x02d8, B:184:0x02ec, B:186:0x02f2, B:219:0x00f6, B:220:0x00fe, B:221:0x0103, B:223:0x010e, B:225:0x0224, B:227:0x022d, B:230:0x0231, B:232:0x0236, B:233:0x023d, B:234:0x0242, B:243:0x02b3, B:246:0x0256, B:248:0x025d, B:249:0x029b, B:251:0x02a3, B:254:0x02a7, B:257:0x02ac, B:262:0x0262, B:263:0x0268, B:265:0x026c, B:267:0x0272, B:269:0x027f, B:272:0x0287, B:274:0x028e, B:287:0x0116, B:289:0x0127, B:291:0x0132, B:292:0x013e, B:294:0x0169, B:296:0x0171, B:299:0x0142, B:300:0x014a, B:301:0x014d, B:302:0x0156, B:303:0x015f, B:312:0x017a, B:319:0x0210, B:320:0x0215, B:322:0x018e, B:325:0x019b, B:329:0x01a9, B:331:0x01c3, B:333:0x01db, B:335:0x021a, B:347:0x02c9, B:354:0x02d4), top: B:2:0x0007, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0235 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0231 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0132 A[Catch: all -> 0x0742, TryCatch #0 {all -> 0x0742, blocks: (B:3:0x0007, B:9:0x02fd, B:14:0x0308, B:16:0x032a, B:19:0x033e, B:20:0x0353, B:22:0x035b, B:23:0x0370, B:25:0x037f, B:26:0x039f, B:28:0x03a7, B:29:0x03c7, B:30:0x03df, B:32:0x0403, B:33:0x0406, B:35:0x040e, B:36:0x041e, B:37:0x03e5, B:38:0x03eb, B:39:0x03f1, B:40:0x03f7, B:41:0x03fd, B:42:0x03c2, B:43:0x039a, B:44:0x036b, B:45:0x034e, B:46:0x042d, B:50:0x0438, B:52:0x0440, B:55:0x0449, B:56:0x0452, B:58:0x045a, B:60:0x046e, B:61:0x0489, B:63:0x048f, B:65:0x0495, B:67:0x049f, B:68:0x04a8, B:69:0x04ad, B:71:0x0517, B:73:0x051d, B:74:0x0561, B:76:0x059c, B:78:0x05a2, B:81:0x05ab, B:83:0x05b3, B:85:0x05c0, B:86:0x05c5, B:88:0x05dd, B:89:0x05e6, B:91:0x0630, B:95:0x0691, B:97:0x0696, B:99:0x06a6, B:100:0x06a9, B:102:0x06bc, B:103:0x06bf, B:104:0x0716, B:105:0x064f, B:107:0x065b, B:108:0x0663, B:110:0x068b, B:113:0x0639, B:114:0x070e, B:115:0x0520, B:116:0x0570, B:118:0x0578, B:119:0x058f, B:120:0x058d, B:121:0x071c, B:124:0x072b, B:125:0x0735, B:126:0x0038, B:129:0x003f, B:139:0x005c, B:141:0x006b, B:144:0x0073, B:145:0x0075, B:146:0x0080, B:161:0x00ac, B:163:0x00b2, B:165:0x00ba, B:167:0x00c0, B:169:0x00c6, B:171:0x00cd, B:173:0x00d4, B:176:0x02d8, B:184:0x02ec, B:186:0x02f2, B:219:0x00f6, B:220:0x00fe, B:221:0x0103, B:223:0x010e, B:225:0x0224, B:227:0x022d, B:230:0x0231, B:232:0x0236, B:233:0x023d, B:234:0x0242, B:243:0x02b3, B:246:0x0256, B:248:0x025d, B:249:0x029b, B:251:0x02a3, B:254:0x02a7, B:257:0x02ac, B:262:0x0262, B:263:0x0268, B:265:0x026c, B:267:0x0272, B:269:0x027f, B:272:0x0287, B:274:0x028e, B:287:0x0116, B:289:0x0127, B:291:0x0132, B:292:0x013e, B:294:0x0169, B:296:0x0171, B:299:0x0142, B:300:0x014a, B:301:0x014d, B:302:0x0156, B:303:0x015f, B:312:0x017a, B:319:0x0210, B:320:0x0215, B:322:0x018e, B:325:0x019b, B:329:0x01a9, B:331:0x01c3, B:333:0x01db, B:335:0x021a, B:347:0x02c9, B:354:0x02d4), top: B:2:0x0007, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:304:0x0131 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:318:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x020c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0696 A[Catch: all -> 0x0742, TryCatch #0 {all -> 0x0742, blocks: (B:3:0x0007, B:9:0x02fd, B:14:0x0308, B:16:0x032a, B:19:0x033e, B:20:0x0353, B:22:0x035b, B:23:0x0370, B:25:0x037f, B:26:0x039f, B:28:0x03a7, B:29:0x03c7, B:30:0x03df, B:32:0x0403, B:33:0x0406, B:35:0x040e, B:36:0x041e, B:37:0x03e5, B:38:0x03eb, B:39:0x03f1, B:40:0x03f7, B:41:0x03fd, B:42:0x03c2, B:43:0x039a, B:44:0x036b, B:45:0x034e, B:46:0x042d, B:50:0x0438, B:52:0x0440, B:55:0x0449, B:56:0x0452, B:58:0x045a, B:60:0x046e, B:61:0x0489, B:63:0x048f, B:65:0x0495, B:67:0x049f, B:68:0x04a8, B:69:0x04ad, B:71:0x0517, B:73:0x051d, B:74:0x0561, B:76:0x059c, B:78:0x05a2, B:81:0x05ab, B:83:0x05b3, B:85:0x05c0, B:86:0x05c5, B:88:0x05dd, B:89:0x05e6, B:91:0x0630, B:95:0x0691, B:97:0x0696, B:99:0x06a6, B:100:0x06a9, B:102:0x06bc, B:103:0x06bf, B:104:0x0716, B:105:0x064f, B:107:0x065b, B:108:0x0663, B:110:0x068b, B:113:0x0639, B:114:0x070e, B:115:0x0520, B:116:0x0570, B:118:0x0578, B:119:0x058f, B:120:0x058d, B:121:0x071c, B:124:0x072b, B:125:0x0735, B:126:0x0038, B:129:0x003f, B:139:0x005c, B:141:0x006b, B:144:0x0073, B:145:0x0075, B:146:0x0080, B:161:0x00ac, B:163:0x00b2, B:165:0x00ba, B:167:0x00c0, B:169:0x00c6, B:171:0x00cd, B:173:0x00d4, B:176:0x02d8, B:184:0x02ec, B:186:0x02f2, B:219:0x00f6, B:220:0x00fe, B:221:0x0103, B:223:0x010e, B:225:0x0224, B:227:0x022d, B:230:0x0231, B:232:0x0236, B:233:0x023d, B:234:0x0242, B:243:0x02b3, B:246:0x0256, B:248:0x025d, B:249:0x029b, B:251:0x02a3, B:254:0x02a7, B:257:0x02ac, B:262:0x0262, B:263:0x0268, B:265:0x026c, B:267:0x0272, B:269:0x027f, B:272:0x0287, B:274:0x028e, B:287:0x0116, B:289:0x0127, B:291:0x0132, B:292:0x013e, B:294:0x0169, B:296:0x0171, B:299:0x0142, B:300:0x014a, B:301:0x014d, B:302:0x0156, B:303:0x015f, B:312:0x017a, B:319:0x0210, B:320:0x0215, B:322:0x018e, B:325:0x019b, B:329:0x01a9, B:331:0x01c3, B:333:0x01db, B:335:0x021a, B:347:0x02c9, B:354:0x02d4), top: B:2:0x0007, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x02fd A[Catch: all -> 0x0742, TryCatch #0 {all -> 0x0742, blocks: (B:3:0x0007, B:9:0x02fd, B:14:0x0308, B:16:0x032a, B:19:0x033e, B:20:0x0353, B:22:0x035b, B:23:0x0370, B:25:0x037f, B:26:0x039f, B:28:0x03a7, B:29:0x03c7, B:30:0x03df, B:32:0x0403, B:33:0x0406, B:35:0x040e, B:36:0x041e, B:37:0x03e5, B:38:0x03eb, B:39:0x03f1, B:40:0x03f7, B:41:0x03fd, B:42:0x03c2, B:43:0x039a, B:44:0x036b, B:45:0x034e, B:46:0x042d, B:50:0x0438, B:52:0x0440, B:55:0x0449, B:56:0x0452, B:58:0x045a, B:60:0x046e, B:61:0x0489, B:63:0x048f, B:65:0x0495, B:67:0x049f, B:68:0x04a8, B:69:0x04ad, B:71:0x0517, B:73:0x051d, B:74:0x0561, B:76:0x059c, B:78:0x05a2, B:81:0x05ab, B:83:0x05b3, B:85:0x05c0, B:86:0x05c5, B:88:0x05dd, B:89:0x05e6, B:91:0x0630, B:95:0x0691, B:97:0x0696, B:99:0x06a6, B:100:0x06a9, B:102:0x06bc, B:103:0x06bf, B:104:0x0716, B:105:0x064f, B:107:0x065b, B:108:0x0663, B:110:0x068b, B:113:0x0639, B:114:0x070e, B:115:0x0520, B:116:0x0570, B:118:0x0578, B:119:0x058f, B:120:0x058d, B:121:0x071c, B:124:0x072b, B:125:0x0735, B:126:0x0038, B:129:0x003f, B:139:0x005c, B:141:0x006b, B:144:0x0073, B:145:0x0075, B:146:0x0080, B:161:0x00ac, B:163:0x00b2, B:165:0x00ba, B:167:0x00c0, B:169:0x00c6, B:171:0x00cd, B:173:0x00d4, B:176:0x02d8, B:184:0x02ec, B:186:0x02f2, B:219:0x00f6, B:220:0x00fe, B:221:0x0103, B:223:0x010e, B:225:0x0224, B:227:0x022d, B:230:0x0231, B:232:0x0236, B:233:0x023d, B:234:0x0242, B:243:0x02b3, B:246:0x0256, B:248:0x025d, B:249:0x029b, B:251:0x02a3, B:254:0x02a7, B:257:0x02ac, B:262:0x0262, B:263:0x0268, B:265:0x026c, B:267:0x0272, B:269:0x027f, B:272:0x0287, B:274:0x028e, B:287:0x0116, B:289:0x0127, B:291:0x0132, B:292:0x013e, B:294:0x0169, B:296:0x0171, B:299:0x0142, B:300:0x014a, B:301:0x014d, B:302:0x0156, B:303:0x015f, B:312:0x017a, B:319:0x0210, B:320:0x0215, B:322:0x018e, B:325:0x019b, B:329:0x01a9, B:331:0x01c3, B:333:0x01db, B:335:0x021a, B:347:0x02c9, B:354:0x02d4), top: B:2:0x0007, inners: #1 }] */
    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* bridge */ /* synthetic */ java.lang.Object b() {
        /*
            Method dump skipped, instructions count: 1934
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.messaging.shared.datamodel.action.ReceiveWapPushSiMessageAction.b():java.lang.Object");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.ReceiveWapPushSiMessage.ExecuteAction.Latency";
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final boolean fA() {
        return false;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        C(parcel, i2);
    }

    public ReceiveWapPushSiMessageAction(Context context, armf armfVar, xnv xnvVar, wyt wytVar, mho mhoVar, wzs wzsVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, ryg rygVar, qyn qynVar, rim rimVar, rys rysVar, rji rjiVar, tqx tqxVar, rtb rtbVar, agnq agnqVar, armf armfVar6, lpg lpgVar, armf armfVar7, armf armfVar8, armf armfVar9, armf armfVar10, armf armfVar11, armf armfVar12, Parcel parcel) {
        super(parcel, amdy.RECEIVE_WAP_PUSH_SI_MESSAGE_ACTION);
        this.k = context;
        this.a = armfVar;
        this.l = xnvVar;
        this.m = wytVar;
        this.n = mhoVar;
        this.o = wzsVar;
        this.b = armfVar2;
        this.p = armfVar3;
        this.c = armfVar4;
        this.q = armfVar5;
        this.z = rygVar;
        this.d = qynVar;
        this.A = rimVar;
        this.e = rysVar;
        this.B = rjiVar;
        this.f = tqxVar;
        this.g = rtbVar;
        this.C = agnqVar;
        this.D = armfVar6;
        this.J = lpgVar;
        this.E = armfVar7;
        this.F = armfVar8;
        this.h = armfVar9;
        this.G = armfVar10;
        this.H = armfVar11;
        this.I = armfVar12;
    }
}
