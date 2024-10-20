package com.google.android.apps.messaging.shared.datamodel.action;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.ims.rcsservice.chatsession.message.groupmanagement.GroupManagementResponse;
import defpackage.actx;
import defpackage.aczx;
import defpackage.akrh;
import defpackage.aktp;
import defpackage.akul;
import defpackage.alhr;
import defpackage.alvg;
import defpackage.alvi;
import defpackage.alvw;
import defpackage.alwp;
import defpackage.amdy;
import defpackage.amgt;
import defpackage.amgu;
import defpackage.amxb;
import defpackage.amxo;
import defpackage.aotl;
import defpackage.aozn;
import defpackage.asgt;
import defpackage.d;
import defpackage.gvc;
import defpackage.qdm;
import defpackage.qee;
import defpackage.qef;
import defpackage.qeg;
import defpackage.qga;
import defpackage.ray;
import defpackage.rdg;
import defpackage.rgf;
import defpackage.rhl;
import defpackage.ruz;
import defpackage.rvc;
import defpackage.rve;
import defpackage.vid;
import defpackage.wyl;
import defpackage.wzm;
import defpackage.yaq;
import j$.time.Duration;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ProcessSentMessageAction extends Action<Void> {
    public final vid b;
    public static final alvi a = alvi.m("com/google/android/apps/messaging/shared/datamodel/action/ProcessSentMessageAction");
    public static final Parcelable.Creator<Action<?>> CREATOR = new ray(18);

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public interface a {
        rdg NF();
    }

    private ProcessSentMessageAction(vid vidVar) {
        super(amdy.PROCESS_SENT_MESSAGE_ACTION);
        this.b = vidVar;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final akrh a() {
        return aktp.e("ProcessSentMessageAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.ProcessSentMessage.ExecuteAction.Latency";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.concurrent.Executor, java.lang.Object] */
    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final akul e() {
        rve b = rve.b(this.u.f(), "rcs_message_id");
        if (b.k() && this.u.b("status", 2) == 0) {
            vid vidVar = this.b;
            ((rgf) vidVar.e).d(b, rvc.a, true);
        }
        ((wyl) this.b.h.b()).c(b, 1);
        wyl wylVar = (wyl) this.b.h.b();
        vid vidVar2 = this.b;
        return wylVar.a(b, vidVar2.g, new gvc(this, 12));
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [agnq, java.lang.Object] */
    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final Void b() {
        alvw g = a.g();
        g.X(alwp.a, "BugleDataModel");
        ((alvg) ((alvg) g).h("com/google/android/apps/messaging/shared/datamodel/action/ProcessSentMessageAction", "executeAction", 680, "ProcessSentMessageAction.java")).q("ProcessSentMessageAction::executeInScope");
        akrh e = aktp.e("ProcessSentMessageAction::executeActionInScope");
        try {
            Void r1 = (Void) this.b.b.b(new alhr() { // from class: rdf
                /* JADX WARN: Removed duplicated region for block: B:126:0x04f7 A[ADDED_TO_REGION] */
                /* JADX WARN: Removed duplicated region for block: B:131:0x0507 A[Catch: all -> 0x0553, TryCatch #0 {all -> 0x0553, blocks: (B:6:0x004b, B:8:0x007f, B:9:0x008b, B:12:0x009f, B:14:0x0141, B:17:0x0167, B:20:0x01c8, B:171:0x01e7, B:24:0x0214, B:27:0x021e, B:29:0x022f, B:31:0x0235, B:32:0x025d, B:34:0x0269, B:35:0x027a, B:38:0x0285, B:40:0x028b, B:42:0x02a2, B:44:0x02a6, B:46:0x02ca, B:48:0x0338, B:50:0x033e, B:53:0x0345, B:57:0x0361, B:60:0x038f, B:144:0x039d, B:147:0x03a7, B:64:0x03d6, B:66:0x03e0, B:68:0x03ea, B:69:0x0410, B:71:0x0420, B:72:0x0424, B:74:0x0468, B:75:0x042a, B:76:0x042d, B:77:0x0430, B:78:0x0433, B:79:0x0436, B:80:0x0439, B:81:0x043c, B:82:0x043f, B:83:0x0442, B:84:0x0445, B:85:0x0448, B:86:0x044b, B:87:0x044e, B:88:0x0451, B:89:0x0454, B:90:0x0457, B:91:0x045a, B:92:0x045d, B:93:0x0460, B:94:0x0463, B:95:0x0466, B:96:0x046c, B:99:0x048b, B:102:0x049b, B:104:0x04a1, B:105:0x04a7, B:108:0x04b1, B:110:0x04b7, B:111:0x04bd, B:113:0x04c3, B:115:0x04c9, B:117:0x04cf, B:118:0x04d5, B:120:0x04dd, B:122:0x04e3, B:124:0x04f1, B:127:0x04f9, B:129:0x0501, B:131:0x0507, B:132:0x050a, B:133:0x050c, B:135:0x051a, B:136:0x0527, B:137:0x0523, B:138:0x04e6, B:151:0x03b7, B:157:0x02a9, B:158:0x02bf, B:161:0x02e7, B:163:0x0312, B:175:0x01ee, B:177:0x0174, B:179:0x0184, B:180:0x0189, B:182:0x018f, B:183:0x019e, B:185:0x014f, B:186:0x00b3, B:188:0x00b9, B:189:0x00c8, B:191:0x00d8, B:193:0x00de, B:197:0x0103, B:199:0x0108, B:200:0x0126, B:212:0x013a, B:211:0x0137, B:206:0x0131, B:196:0x00f0), top: B:5:0x004b, inners: #1, #3, #6 }] */
                /* JADX WARN: Removed duplicated region for block: B:132:0x050a A[Catch: all -> 0x0553, TryCatch #0 {all -> 0x0553, blocks: (B:6:0x004b, B:8:0x007f, B:9:0x008b, B:12:0x009f, B:14:0x0141, B:17:0x0167, B:20:0x01c8, B:171:0x01e7, B:24:0x0214, B:27:0x021e, B:29:0x022f, B:31:0x0235, B:32:0x025d, B:34:0x0269, B:35:0x027a, B:38:0x0285, B:40:0x028b, B:42:0x02a2, B:44:0x02a6, B:46:0x02ca, B:48:0x0338, B:50:0x033e, B:53:0x0345, B:57:0x0361, B:60:0x038f, B:144:0x039d, B:147:0x03a7, B:64:0x03d6, B:66:0x03e0, B:68:0x03ea, B:69:0x0410, B:71:0x0420, B:72:0x0424, B:74:0x0468, B:75:0x042a, B:76:0x042d, B:77:0x0430, B:78:0x0433, B:79:0x0436, B:80:0x0439, B:81:0x043c, B:82:0x043f, B:83:0x0442, B:84:0x0445, B:85:0x0448, B:86:0x044b, B:87:0x044e, B:88:0x0451, B:89:0x0454, B:90:0x0457, B:91:0x045a, B:92:0x045d, B:93:0x0460, B:94:0x0463, B:95:0x0466, B:96:0x046c, B:99:0x048b, B:102:0x049b, B:104:0x04a1, B:105:0x04a7, B:108:0x04b1, B:110:0x04b7, B:111:0x04bd, B:113:0x04c3, B:115:0x04c9, B:117:0x04cf, B:118:0x04d5, B:120:0x04dd, B:122:0x04e3, B:124:0x04f1, B:127:0x04f9, B:129:0x0501, B:131:0x0507, B:132:0x050a, B:133:0x050c, B:135:0x051a, B:136:0x0527, B:137:0x0523, B:138:0x04e6, B:151:0x03b7, B:157:0x02a9, B:158:0x02bf, B:161:0x02e7, B:163:0x0312, B:175:0x01ee, B:177:0x0174, B:179:0x0184, B:180:0x0189, B:182:0x018f, B:183:0x019e, B:185:0x014f, B:186:0x00b3, B:188:0x00b9, B:189:0x00c8, B:191:0x00d8, B:193:0x00de, B:197:0x0103, B:199:0x0108, B:200:0x0126, B:212:0x013a, B:211:0x0137, B:206:0x0131, B:196:0x00f0), top: B:5:0x004b, inners: #1, #3, #6 }] */
                /* JADX WARN: Removed duplicated region for block: B:135:0x051a A[Catch: all -> 0x0553, TryCatch #0 {all -> 0x0553, blocks: (B:6:0x004b, B:8:0x007f, B:9:0x008b, B:12:0x009f, B:14:0x0141, B:17:0x0167, B:20:0x01c8, B:171:0x01e7, B:24:0x0214, B:27:0x021e, B:29:0x022f, B:31:0x0235, B:32:0x025d, B:34:0x0269, B:35:0x027a, B:38:0x0285, B:40:0x028b, B:42:0x02a2, B:44:0x02a6, B:46:0x02ca, B:48:0x0338, B:50:0x033e, B:53:0x0345, B:57:0x0361, B:60:0x038f, B:144:0x039d, B:147:0x03a7, B:64:0x03d6, B:66:0x03e0, B:68:0x03ea, B:69:0x0410, B:71:0x0420, B:72:0x0424, B:74:0x0468, B:75:0x042a, B:76:0x042d, B:77:0x0430, B:78:0x0433, B:79:0x0436, B:80:0x0439, B:81:0x043c, B:82:0x043f, B:83:0x0442, B:84:0x0445, B:85:0x0448, B:86:0x044b, B:87:0x044e, B:88:0x0451, B:89:0x0454, B:90:0x0457, B:91:0x045a, B:92:0x045d, B:93:0x0460, B:94:0x0463, B:95:0x0466, B:96:0x046c, B:99:0x048b, B:102:0x049b, B:104:0x04a1, B:105:0x04a7, B:108:0x04b1, B:110:0x04b7, B:111:0x04bd, B:113:0x04c3, B:115:0x04c9, B:117:0x04cf, B:118:0x04d5, B:120:0x04dd, B:122:0x04e3, B:124:0x04f1, B:127:0x04f9, B:129:0x0501, B:131:0x0507, B:132:0x050a, B:133:0x050c, B:135:0x051a, B:136:0x0527, B:137:0x0523, B:138:0x04e6, B:151:0x03b7, B:157:0x02a9, B:158:0x02bf, B:161:0x02e7, B:163:0x0312, B:175:0x01ee, B:177:0x0174, B:179:0x0184, B:180:0x0189, B:182:0x018f, B:183:0x019e, B:185:0x014f, B:186:0x00b3, B:188:0x00b9, B:189:0x00c8, B:191:0x00d8, B:193:0x00de, B:197:0x0103, B:199:0x0108, B:200:0x0126, B:212:0x013a, B:211:0x0137, B:206:0x0131, B:196:0x00f0), top: B:5:0x004b, inners: #1, #3, #6 }] */
                /* JADX WARN: Removed duplicated region for block: B:137:0x0523 A[Catch: all -> 0x0553, TryCatch #0 {all -> 0x0553, blocks: (B:6:0x004b, B:8:0x007f, B:9:0x008b, B:12:0x009f, B:14:0x0141, B:17:0x0167, B:20:0x01c8, B:171:0x01e7, B:24:0x0214, B:27:0x021e, B:29:0x022f, B:31:0x0235, B:32:0x025d, B:34:0x0269, B:35:0x027a, B:38:0x0285, B:40:0x028b, B:42:0x02a2, B:44:0x02a6, B:46:0x02ca, B:48:0x0338, B:50:0x033e, B:53:0x0345, B:57:0x0361, B:60:0x038f, B:144:0x039d, B:147:0x03a7, B:64:0x03d6, B:66:0x03e0, B:68:0x03ea, B:69:0x0410, B:71:0x0420, B:72:0x0424, B:74:0x0468, B:75:0x042a, B:76:0x042d, B:77:0x0430, B:78:0x0433, B:79:0x0436, B:80:0x0439, B:81:0x043c, B:82:0x043f, B:83:0x0442, B:84:0x0445, B:85:0x0448, B:86:0x044b, B:87:0x044e, B:88:0x0451, B:89:0x0454, B:90:0x0457, B:91:0x045a, B:92:0x045d, B:93:0x0460, B:94:0x0463, B:95:0x0466, B:96:0x046c, B:99:0x048b, B:102:0x049b, B:104:0x04a1, B:105:0x04a7, B:108:0x04b1, B:110:0x04b7, B:111:0x04bd, B:113:0x04c3, B:115:0x04c9, B:117:0x04cf, B:118:0x04d5, B:120:0x04dd, B:122:0x04e3, B:124:0x04f1, B:127:0x04f9, B:129:0x0501, B:131:0x0507, B:132:0x050a, B:133:0x050c, B:135:0x051a, B:136:0x0527, B:137:0x0523, B:138:0x04e6, B:151:0x03b7, B:157:0x02a9, B:158:0x02bf, B:161:0x02e7, B:163:0x0312, B:175:0x01ee, B:177:0x0174, B:179:0x0184, B:180:0x0189, B:182:0x018f, B:183:0x019e, B:185:0x014f, B:186:0x00b3, B:188:0x00b9, B:189:0x00c8, B:191:0x00d8, B:193:0x00de, B:197:0x0103, B:199:0x0108, B:200:0x0126, B:212:0x013a, B:211:0x0137, B:206:0x0131, B:196:0x00f0), top: B:5:0x004b, inners: #1, #3, #6 }] */
                /* JADX WARN: Removed duplicated region for block: B:142:0x040d  */
                /* JADX WARN: Removed duplicated region for block: B:143:0x039d A[EXC_TOP_SPLITTER, SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:155:0x038d  */
                /* JADX WARN: Removed duplicated region for block: B:156:0x02dc  */
                /* JADX WARN: Removed duplicated region for block: B:169:0x032a  */
                /* JADX WARN: Removed duplicated region for block: B:170:0x01e7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:176:0x0172  */
                /* JADX WARN: Removed duplicated region for block: B:19:0x0170  */
                /* JADX WARN: Removed duplicated region for block: B:24:0x0214 A[Catch: all -> 0x0553, TRY_ENTER, TryCatch #0 {all -> 0x0553, blocks: (B:6:0x004b, B:8:0x007f, B:9:0x008b, B:12:0x009f, B:14:0x0141, B:17:0x0167, B:20:0x01c8, B:171:0x01e7, B:24:0x0214, B:27:0x021e, B:29:0x022f, B:31:0x0235, B:32:0x025d, B:34:0x0269, B:35:0x027a, B:38:0x0285, B:40:0x028b, B:42:0x02a2, B:44:0x02a6, B:46:0x02ca, B:48:0x0338, B:50:0x033e, B:53:0x0345, B:57:0x0361, B:60:0x038f, B:144:0x039d, B:147:0x03a7, B:64:0x03d6, B:66:0x03e0, B:68:0x03ea, B:69:0x0410, B:71:0x0420, B:72:0x0424, B:74:0x0468, B:75:0x042a, B:76:0x042d, B:77:0x0430, B:78:0x0433, B:79:0x0436, B:80:0x0439, B:81:0x043c, B:82:0x043f, B:83:0x0442, B:84:0x0445, B:85:0x0448, B:86:0x044b, B:87:0x044e, B:88:0x0451, B:89:0x0454, B:90:0x0457, B:91:0x045a, B:92:0x045d, B:93:0x0460, B:94:0x0463, B:95:0x0466, B:96:0x046c, B:99:0x048b, B:102:0x049b, B:104:0x04a1, B:105:0x04a7, B:108:0x04b1, B:110:0x04b7, B:111:0x04bd, B:113:0x04c3, B:115:0x04c9, B:117:0x04cf, B:118:0x04d5, B:120:0x04dd, B:122:0x04e3, B:124:0x04f1, B:127:0x04f9, B:129:0x0501, B:131:0x0507, B:132:0x050a, B:133:0x050c, B:135:0x051a, B:136:0x0527, B:137:0x0523, B:138:0x04e6, B:151:0x03b7, B:157:0x02a9, B:158:0x02bf, B:161:0x02e7, B:163:0x0312, B:175:0x01ee, B:177:0x0174, B:179:0x0184, B:180:0x0189, B:182:0x018f, B:183:0x019e, B:185:0x014f, B:186:0x00b3, B:188:0x00b9, B:189:0x00c8, B:191:0x00d8, B:193:0x00de, B:197:0x0103, B:199:0x0108, B:200:0x0126, B:212:0x013a, B:211:0x0137, B:206:0x0131, B:196:0x00f0), top: B:5:0x004b, inners: #1, #3, #6 }] */
                /* JADX WARN: Removed duplicated region for block: B:46:0x02ca A[Catch: all -> 0x0553, TryCatch #0 {all -> 0x0553, blocks: (B:6:0x004b, B:8:0x007f, B:9:0x008b, B:12:0x009f, B:14:0x0141, B:17:0x0167, B:20:0x01c8, B:171:0x01e7, B:24:0x0214, B:27:0x021e, B:29:0x022f, B:31:0x0235, B:32:0x025d, B:34:0x0269, B:35:0x027a, B:38:0x0285, B:40:0x028b, B:42:0x02a2, B:44:0x02a6, B:46:0x02ca, B:48:0x0338, B:50:0x033e, B:53:0x0345, B:57:0x0361, B:60:0x038f, B:144:0x039d, B:147:0x03a7, B:64:0x03d6, B:66:0x03e0, B:68:0x03ea, B:69:0x0410, B:71:0x0420, B:72:0x0424, B:74:0x0468, B:75:0x042a, B:76:0x042d, B:77:0x0430, B:78:0x0433, B:79:0x0436, B:80:0x0439, B:81:0x043c, B:82:0x043f, B:83:0x0442, B:84:0x0445, B:85:0x0448, B:86:0x044b, B:87:0x044e, B:88:0x0451, B:89:0x0454, B:90:0x0457, B:91:0x045a, B:92:0x045d, B:93:0x0460, B:94:0x0463, B:95:0x0466, B:96:0x046c, B:99:0x048b, B:102:0x049b, B:104:0x04a1, B:105:0x04a7, B:108:0x04b1, B:110:0x04b7, B:111:0x04bd, B:113:0x04c3, B:115:0x04c9, B:117:0x04cf, B:118:0x04d5, B:120:0x04dd, B:122:0x04e3, B:124:0x04f1, B:127:0x04f9, B:129:0x0501, B:131:0x0507, B:132:0x050a, B:133:0x050c, B:135:0x051a, B:136:0x0527, B:137:0x0523, B:138:0x04e6, B:151:0x03b7, B:157:0x02a9, B:158:0x02bf, B:161:0x02e7, B:163:0x0312, B:175:0x01ee, B:177:0x0174, B:179:0x0184, B:180:0x0189, B:182:0x018f, B:183:0x019e, B:185:0x014f, B:186:0x00b3, B:188:0x00b9, B:189:0x00c8, B:191:0x00d8, B:193:0x00de, B:197:0x0103, B:199:0x0108, B:200:0x0126, B:212:0x013a, B:211:0x0137, B:206:0x0131, B:196:0x00f0), top: B:5:0x004b, inners: #1, #3, #6 }] */
                /* JADX WARN: Removed duplicated region for block: B:50:0x033e A[Catch: all -> 0x0553, TryCatch #0 {all -> 0x0553, blocks: (B:6:0x004b, B:8:0x007f, B:9:0x008b, B:12:0x009f, B:14:0x0141, B:17:0x0167, B:20:0x01c8, B:171:0x01e7, B:24:0x0214, B:27:0x021e, B:29:0x022f, B:31:0x0235, B:32:0x025d, B:34:0x0269, B:35:0x027a, B:38:0x0285, B:40:0x028b, B:42:0x02a2, B:44:0x02a6, B:46:0x02ca, B:48:0x0338, B:50:0x033e, B:53:0x0345, B:57:0x0361, B:60:0x038f, B:144:0x039d, B:147:0x03a7, B:64:0x03d6, B:66:0x03e0, B:68:0x03ea, B:69:0x0410, B:71:0x0420, B:72:0x0424, B:74:0x0468, B:75:0x042a, B:76:0x042d, B:77:0x0430, B:78:0x0433, B:79:0x0436, B:80:0x0439, B:81:0x043c, B:82:0x043f, B:83:0x0442, B:84:0x0445, B:85:0x0448, B:86:0x044b, B:87:0x044e, B:88:0x0451, B:89:0x0454, B:90:0x0457, B:91:0x045a, B:92:0x045d, B:93:0x0460, B:94:0x0463, B:95:0x0466, B:96:0x046c, B:99:0x048b, B:102:0x049b, B:104:0x04a1, B:105:0x04a7, B:108:0x04b1, B:110:0x04b7, B:111:0x04bd, B:113:0x04c3, B:115:0x04c9, B:117:0x04cf, B:118:0x04d5, B:120:0x04dd, B:122:0x04e3, B:124:0x04f1, B:127:0x04f9, B:129:0x0501, B:131:0x0507, B:132:0x050a, B:133:0x050c, B:135:0x051a, B:136:0x0527, B:137:0x0523, B:138:0x04e6, B:151:0x03b7, B:157:0x02a9, B:158:0x02bf, B:161:0x02e7, B:163:0x0312, B:175:0x01ee, B:177:0x0174, B:179:0x0184, B:180:0x0189, B:182:0x018f, B:183:0x019e, B:185:0x014f, B:186:0x00b3, B:188:0x00b9, B:189:0x00c8, B:191:0x00d8, B:193:0x00de, B:197:0x0103, B:199:0x0108, B:200:0x0126, B:212:0x013a, B:211:0x0137, B:206:0x0131, B:196:0x00f0), top: B:5:0x004b, inners: #1, #3, #6 }] */
                /* JADX WARN: Removed duplicated region for block: B:59:0x038a  */
                /* JADX WARN: Removed duplicated region for block: B:62:0x03d2  */
                /* JADX WARN: Removed duplicated region for block: B:66:0x03e0 A[Catch: all -> 0x0553, TryCatch #0 {all -> 0x0553, blocks: (B:6:0x004b, B:8:0x007f, B:9:0x008b, B:12:0x009f, B:14:0x0141, B:17:0x0167, B:20:0x01c8, B:171:0x01e7, B:24:0x0214, B:27:0x021e, B:29:0x022f, B:31:0x0235, B:32:0x025d, B:34:0x0269, B:35:0x027a, B:38:0x0285, B:40:0x028b, B:42:0x02a2, B:44:0x02a6, B:46:0x02ca, B:48:0x0338, B:50:0x033e, B:53:0x0345, B:57:0x0361, B:60:0x038f, B:144:0x039d, B:147:0x03a7, B:64:0x03d6, B:66:0x03e0, B:68:0x03ea, B:69:0x0410, B:71:0x0420, B:72:0x0424, B:74:0x0468, B:75:0x042a, B:76:0x042d, B:77:0x0430, B:78:0x0433, B:79:0x0436, B:80:0x0439, B:81:0x043c, B:82:0x043f, B:83:0x0442, B:84:0x0445, B:85:0x0448, B:86:0x044b, B:87:0x044e, B:88:0x0451, B:89:0x0454, B:90:0x0457, B:91:0x045a, B:92:0x045d, B:93:0x0460, B:94:0x0463, B:95:0x0466, B:96:0x046c, B:99:0x048b, B:102:0x049b, B:104:0x04a1, B:105:0x04a7, B:108:0x04b1, B:110:0x04b7, B:111:0x04bd, B:113:0x04c3, B:115:0x04c9, B:117:0x04cf, B:118:0x04d5, B:120:0x04dd, B:122:0x04e3, B:124:0x04f1, B:127:0x04f9, B:129:0x0501, B:131:0x0507, B:132:0x050a, B:133:0x050c, B:135:0x051a, B:136:0x0527, B:137:0x0523, B:138:0x04e6, B:151:0x03b7, B:157:0x02a9, B:158:0x02bf, B:161:0x02e7, B:163:0x0312, B:175:0x01ee, B:177:0x0174, B:179:0x0184, B:180:0x0189, B:182:0x018f, B:183:0x019e, B:185:0x014f, B:186:0x00b3, B:188:0x00b9, B:189:0x00c8, B:191:0x00d8, B:193:0x00de, B:197:0x0103, B:199:0x0108, B:200:0x0126, B:212:0x013a, B:211:0x0137, B:206:0x0131, B:196:0x00f0), top: B:5:0x004b, inners: #1, #3, #6 }] */
                /* JADX WARN: Removed duplicated region for block: B:71:0x0420 A[Catch: all -> 0x0553, TryCatch #0 {all -> 0x0553, blocks: (B:6:0x004b, B:8:0x007f, B:9:0x008b, B:12:0x009f, B:14:0x0141, B:17:0x0167, B:20:0x01c8, B:171:0x01e7, B:24:0x0214, B:27:0x021e, B:29:0x022f, B:31:0x0235, B:32:0x025d, B:34:0x0269, B:35:0x027a, B:38:0x0285, B:40:0x028b, B:42:0x02a2, B:44:0x02a6, B:46:0x02ca, B:48:0x0338, B:50:0x033e, B:53:0x0345, B:57:0x0361, B:60:0x038f, B:144:0x039d, B:147:0x03a7, B:64:0x03d6, B:66:0x03e0, B:68:0x03ea, B:69:0x0410, B:71:0x0420, B:72:0x0424, B:74:0x0468, B:75:0x042a, B:76:0x042d, B:77:0x0430, B:78:0x0433, B:79:0x0436, B:80:0x0439, B:81:0x043c, B:82:0x043f, B:83:0x0442, B:84:0x0445, B:85:0x0448, B:86:0x044b, B:87:0x044e, B:88:0x0451, B:89:0x0454, B:90:0x0457, B:91:0x045a, B:92:0x045d, B:93:0x0460, B:94:0x0463, B:95:0x0466, B:96:0x046c, B:99:0x048b, B:102:0x049b, B:104:0x04a1, B:105:0x04a7, B:108:0x04b1, B:110:0x04b7, B:111:0x04bd, B:113:0x04c3, B:115:0x04c9, B:117:0x04cf, B:118:0x04d5, B:120:0x04dd, B:122:0x04e3, B:124:0x04f1, B:127:0x04f9, B:129:0x0501, B:131:0x0507, B:132:0x050a, B:133:0x050c, B:135:0x051a, B:136:0x0527, B:137:0x0523, B:138:0x04e6, B:151:0x03b7, B:157:0x02a9, B:158:0x02bf, B:161:0x02e7, B:163:0x0312, B:175:0x01ee, B:177:0x0174, B:179:0x0184, B:180:0x0189, B:182:0x018f, B:183:0x019e, B:185:0x014f, B:186:0x00b3, B:188:0x00b9, B:189:0x00c8, B:191:0x00d8, B:193:0x00de, B:197:0x0103, B:199:0x0108, B:200:0x0126, B:212:0x013a, B:211:0x0137, B:206:0x0131, B:196:0x00f0), top: B:5:0x004b, inners: #1, #3, #6 }] */
                /* JADX WARN: Removed duplicated region for block: B:98:0x0489 A[ADDED_TO_REGION] */
                /* JADX WARN: Type inference failed for: r2v15, types: [armf, java.lang.Object] */
                /* JADX WARN: Type inference failed for: r2v23, types: [armf, java.lang.Object] */
                /* JADX WARN: Type inference failed for: r2v40, types: [armf, java.lang.Object] */
                /* JADX WARN: Type inference failed for: r2v49, types: [armf, java.lang.Object] */
                /* JADX WARN: Type inference failed for: r2v8, types: [armf, java.lang.Object] */
                /* JADX WARN: Type inference failed for: r8v20, types: [wzs, java.lang.Object] */
                @Override // defpackage.alhr
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object get() {
                    /*
                        Method dump skipped, instructions count: 1426
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.rdf.get():java.lang.Object");
                }
            });
            e.close();
            return r1;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C(parcel, i);
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [odn, java.lang.Object] */
    public ProcessSentMessageAction(vid vidVar, int i, Uri uri, Bundle bundle) {
        this(vidVar);
        rhl rhlVar = this.u;
        rhlVar.p("sent_by_mms_api_or_lib", true);
        rhlVar.v("message_id", bundle.getString("message_id"));
        rhlVar.t("message_uri", uri);
        rhlVar.t("updated_message_uri", bundle.getParcelable("updated_message_uri"));
        rhlVar.r("sub_id", bundle.getInt("sub_id", -1));
        rhlVar.r("result_code", i);
        if (vidVar.c.a() && i == 13) {
            rhlVar.r("raw_status", 10006);
        }
        rhlVar.r("http_status_code", bundle.getInt("android.telephony.extra.MMS_HTTP_STATUS", 0));
        rhlVar.t("content_uri", bundle.getParcelable("content_uri"));
        byte[] byteArray = bundle.getByteArray("android.telephony.extra.MMS_DATA");
        if (byteArray != null) {
            rhlVar.q(GroupManagementResponse.XML_TAG, byteArray);
        }
        rhlVar.p("response_important", bundle.getBoolean("response_important"));
        this.u.r("mms_api", 1);
        rhlVar.r("mms_last_connection_failure_cause_code", bundle.getInt("android.telephony.extra.LAST_CONNECTION_FAILURE_CAUSE_CODE"));
        if (bundle.getBoolean("android.telephony.extra.HANDLED_BY_CARRIER_APP")) {
            this.u.r("mms_api", 3);
        }
        rhlVar.r("key_rcs_transport_type", amxo.NOT_RCS.h);
        rhlVar.r("xsl_bugle_sending_status", asgt.BUGLE_SENDING_INTERNAL_STATUS_RETURNED_FROM_MMS.a());
        if (bundle.containsKey("android.telephony.extra.HANDLED_BY_CARRIER_APP")) {
            rhlVar.p("handled_by_carrier_app", bundle.getBoolean("android.telephony.extra.HANDLED_BY_CARRIER_APP"));
        }
        rhlVar.r("xms_transport", amgt.TELEPHONY_UNSPECIFIED.h);
    }

    public ProcessSentMessageAction(vid vidVar, Parcel parcel) {
        super(parcel, amdy.PROCESS_SENT_MESSAGE_ACTION);
        this.b = vidVar;
    }

    public ProcessSentMessageAction(vid vidVar, ruz ruzVar, int i, int i2) {
        this(vidVar);
        d.t(!ruzVar.f().isEmpty(), "Missing Datagram Id");
        rhl rhlVar = this.u;
        rhlVar.p("sent_by_mms_api_or_lib", false);
        ruz.h(rhlVar.f(), "datagram_id", ruzVar);
        rhlVar.r("status", i);
        rhlVar.r("raw_status", 0);
        rhlVar.r("result_code", i2);
        rhlVar.r("key_rcs_transport_type", amxo.NOT_RCS.h);
    }

    public ProcessSentMessageAction(vid vidVar, MessageIdType messageIdType, rve rveVar, Uri uri, Uri uri2, int i, int i2, int i3, int i4, amxb amxbVar, amgt amgtVar) {
        this(vidVar);
        rhl rhlVar = this.u;
        rhlVar.p("sent_by_mms_api_or_lib", false);
        rhlVar.v("message_id", messageIdType.a());
        if (rveVar != null) {
            rve.h(rhlVar.f(), "rcs_message_id", rveVar);
        }
        rhlVar.t("message_uri", uri);
        rhlVar.t("updated_message_uri", uri2);
        rhlVar.r("sub_id", i);
        rhlVar.r("status", i2);
        rhlVar.r("raw_status", i3);
        rhlVar.r("result_code", i4);
        rhlVar.r("sms_error_code", -1);
        rhlVar.r("sms_part_count", 1);
        if (amxbVar != null) {
            rhlVar.q("rcs_diagnostics", amxbVar.toByteArray());
        }
        rhlVar.r("xsl_bugle_sending_status", asgt.BUGLE_SENDING_INTERNAL_STATUS_RETURNED_FROM_FAST_FAILURE.a());
        rhlVar.r("xms_transport", amgtVar.h);
    }

    public ProcessSentMessageAction(vid vidVar, MessageIdType messageIdType, String str, int i, int i2) {
        this(vidVar);
        rhl rhlVar = this.u;
        rhlVar.p("sent_by_mms_api_or_lib", false);
        rhlVar.v("message_id", messageIdType.a());
        rhlVar.r("sub_id", i);
        rhlVar.r("status", i2 != -1 ? 2 : 0);
        rhlVar.r("raw_status", 0);
        rhlVar.r("result_code", i2);
        rhlVar.r("sms_error_code", -1);
        rhlVar.r("sms_part_count", 1);
        if (str != null) {
            rhlVar.v("cloud_sync_id", str);
        }
        rhlVar.r("key_rcs_transport_type", amxo.UNKNOWN_RCS_TYPE.h);
    }

    public ProcessSentMessageAction(vid vidVar, rve rveVar, int i, long j, long j2, Duration duration) {
        this(vidVar);
        rhl rhlVar = this.u;
        rhlVar.p("sent_by_mms_api_or_lib", false);
        rveVar.g(new qdm(rhlVar, 19));
        rhlVar.r("http_status_code", 0);
        rhlVar.s("delivered_time", j2);
        rhlVar.r("sms_error_code", -1);
        if (i == 50030) {
            rhlVar.r("status", 0);
            rhlVar.r("raw_status", 0);
            rhlVar.r("result_code", 0);
        } else {
            int i2 = 1;
            if (aczx.s()) {
                switch ((int) j) {
                    case 59:
                    case 60:
                    case 62:
                    case 63:
                        i2 = 3;
                        break;
                }
            }
            rhlVar.r("status", i2);
            rhlVar.r("result_code", i2);
            rhlVar.r("raw_status", 0);
            rhlVar.r("rcs_chat_session_event_info", actx.b(j) - 1);
        }
        rhlVar.r("key_rcs_transport_type", amxo.RCS_LEGACY.h);
        if (aczx.s()) {
            rhlVar.H(duration);
        }
        rhlVar.r("xsl_bugle_sending_status", asgt.BUGLE_SENDING_INTERNAL_STATUS_RETURNED_FROM_RCS.a());
    }

    public ProcessSentMessageAction(vid vidVar, rve rveVar, int i, Instant instant, int i2, int i3) {
        this(vidVar);
        d.t(!rveVar.f().isEmpty(), "Missing RCS Message Id");
        rhl rhlVar = this.u;
        rhlVar.p("sent_by_mms_api_or_lib", false);
        rve.h(rhlVar.f(), "rcs_message_id", rveVar);
        rhlVar.r("status", i);
        rhlVar.r("raw_status", 0);
        rhlVar.r("result_code", i2);
        rhlVar.s("delivered_time", instant.toEpochMilli());
        rhlVar.r("sub_id", i3);
        rhlVar.r("sms_part_count", 1);
        rhlVar.r("key_rcs_transport_type", amxo.NOT_RCS.h);
        rhlVar.r("xsl_bugle_sending_status", asgt.BUGLE_SENDING_INTERNAL_STATUS_RETURNED_FROM_SLMAPI.a());
        rhlVar.r("xms_transport", amgt.SLM.h);
    }

    public ProcessSentMessageAction(vid vidVar, rve rveVar, int i, Instant instant, amgu amguVar, qga qgaVar) {
        this(vidVar);
        d.t(!rveVar.f().isEmpty(), "Missing RCS Message Id");
        rhl rhlVar = this.u;
        rhlVar.p("sent_by_mms_api_or_lib", false);
        rve.h(rhlVar.f(), "rcs_message_id", rveVar);
        rhlVar.r("sub_id", i);
        rhlVar.r("http_status_code", 0);
        rhlVar.s("delivered_time", instant.toEpochMilli());
        rhlVar.r("sms_error_code", -1);
        rhlVar.r("raw_status", 0);
        rhlVar.r("status", 6);
        rhlVar.r("result_code", 6);
        amxo b = amxo.b(amguVar.aa);
        rhlVar.r("key_rcs_transport_type", (b == null ? amxo.UNKNOWN_RCS_TYPE : b).h);
        if (aczx.s() && (qgaVar.b & 2) != 0) {
            aozn aoznVar = qgaVar.d;
            rhlVar.H(aotl.k(aoznVar == null ? aozn.a : aoznVar));
        }
        rhlVar.r("xsl_bugle_sending_status", asgt.BUGLE_SENDING_INTERNAL_STATUS_RETURNED_FROM_CHATAPI.a());
    }

    public ProcessSentMessageAction(vid vidVar, rve rveVar, qeg qegVar, Instant instant, boolean z, amgu amguVar, qga qgaVar, amxb amxbVar) {
        this(vidVar);
        int i = 1;
        d.t(!rveVar.f().isEmpty(), "Missing RCS Message Id");
        rhl rhlVar = this.u;
        rhlVar.p("sent_by_mms_api_or_lib", false);
        rve.h(rhlVar.f(), "rcs_message_id", rveVar);
        rhlVar.r("http_status_code", 0);
        rhlVar.s("delivered_time", instant.toEpochMilli());
        rhlVar.r("sms_error_code", -1);
        rhlVar.r("raw_status", 0);
        qef b = qef.b(qegVar.c);
        int ordinal = (b == null ? qef.UNKNOWN_STATUS : b).ordinal();
        if (ordinal == 1) {
            rhlVar.p("is_revocation_supported", z);
            i = 0;
        } else if (ordinal != 3) {
            if (ordinal != 4) {
                qef b2 = qef.b(qegVar.c);
                throw new IllegalArgumentException(String.format("Unexpected chatApiResult %s for rcsMessageId %s", (b2 == null ? qef.UNKNOWN_STATUS : b2).name(), rveVar.b));
            }
            i = (!aczx.s() || qgaVar.c) ? 3 : 5;
        }
        rhlVar.r("status", i);
        qee b3 = qee.b(qegVar.d);
        rhlVar.r("result_code", (b3 == null ? qee.UNKNOWN_CAUSE : b3).p);
        amxo b4 = amxo.b(amguVar.aa);
        rhlVar.r("key_rcs_transport_type", (b4 == null ? amxo.UNKNOWN_RCS_TYPE : b4).h);
        if (aczx.s() && (qgaVar.b & 2) != 0) {
            aozn aoznVar = qgaVar.d;
            rhlVar.H(aotl.k(aoznVar == null ? aozn.a : aoznVar));
        }
        if (amxbVar != null) {
            rhlVar.q("rcs_diagnostics", amxbVar.toByteArray());
        }
        rhlVar.r("xsl_bugle_sending_status", asgt.BUGLE_SENDING_INTERNAL_STATUS_RETURNED_FROM_CHATAPI.a());
    }

    public ProcessSentMessageAction(vid vidVar, wzm wzmVar, MessageIdType messageIdType, Uri uri, int i, int i2, int i3, int i4, String str, Boolean bool) {
        this(vidVar);
        int i5;
        rhl rhlVar = this.u;
        rhlVar.p("sent_by_mms_api_or_lib", false);
        rhlVar.v("message_id", messageIdType.a());
        rhlVar.t("message_uri", uri);
        rhlVar.r("sub_id", i3);
        if (i == -1) {
            i5 = 0;
        } else {
            i5 = 2;
            if ((!wzmVar.d.w() && wzmVar.h.a() > 0) || ((yaq) wzmVar.e.a()).r()) {
                if (i == 1) {
                    wzm.a.m("Generic failure");
                } else if (i != 2) {
                    if (i == 3) {
                        wzm.a.m("The PDU sent to the SmsManager was null");
                    } else if (i == 4) {
                        wzm.a.q("No service, returning message send status AUTO_RETRY");
                        i5 = 1;
                    } else if (i != 5) {
                        wzm.a.m(defpackage.a.bV(i, "Unexpected sent intent resultCode = "));
                    } else {
                        wzm.a.m("Message sending limit is exceeded. Either the telephony is applying throttle, or the user declined the premium SMS feature for Bugle.");
                    }
                } else if (((yaq) wzmVar.e.a()).r()) {
                    wzm.a.q("Radio is off, returning message send status AUTO_RETRY");
                    i5 = 1;
                } else {
                    wzm.a.q("Radio is off");
                }
            }
        }
        rhlVar.r("status", i5);
        rhlVar.r("raw_status", 0);
        rhlVar.r("result_code", i);
        rhlVar.r("sms_error_code", i2);
        rhlVar.r("sms_part_count", i4);
        rhlVar.r("key_rcs_transport_type", amxo.NOT_RCS.h);
        rhlVar.r("xsl_bugle_sending_status", asgt.BUGLE_SENDING_INTERNAL_STATUS_RETURNED_FROM_SMS.a());
        if (str != null) {
            rhlVar.v("format", str);
        }
        if (bool != null) {
            rhlVar.p("is_ims", bool.booleanValue());
        }
        rhlVar.r("xms_transport", amgt.TELEPHONY_UNSPECIFIED.h);
    }
}
