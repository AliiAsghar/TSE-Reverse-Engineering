package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.ims.rcsservice.group.GroupInfo;
import com.google.android.ims.rcsservice.group.UserInfo;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mmw implements mmx {
    public static final alhr a = uuh.w("create_conversation_use_conversation_parameters");
    public static final alwo b = alwo.o("Bugle");
    public static final alvi c = alvi.m("com/google/android/apps/messaging/shared/api/messaging/conversation/bugle/create/BugleLegacyConversationCreator");
    private final armf A;
    private final msk B;
    private final qpj C;
    private final ahqr D;
    private final armf E;
    public final anen d;
    public final anen e;
    public final apwt f;
    public final armf g;
    public final armf h;
    public final armf i;
    public final ryg j;
    public final uhj k;
    public final agnq l;
    public final Optional m;
    public final pss n;
    public final vbu o;
    public final armf p;
    public final armf q;
    public final armf r;
    public final armf s;
    private final anen u;
    private final armf v;
    private final armf w;
    private final apwt x;
    private final yjr y;
    private final rsv z;

    public mmw(anen anenVar, anen anenVar2, anen anenVar3, apwt apwtVar, armf armfVar, armf armfVar2, apwt apwtVar2, armf armfVar3, yjr yjrVar, ryg rygVar, uhj uhjVar, agnq agnqVar, rsv rsvVar, Optional optional, pss pssVar, armf armfVar4, vbu vbuVar, msk mskVar, qpj qpjVar, armf armfVar5, armf armfVar6, armf armfVar7, armf armfVar8, ahqr ahqrVar, armf armfVar9, armf armfVar10, armf armfVar11) {
        this.e = anenVar2;
        this.d = anenVar;
        this.u = anenVar3;
        this.f = apwtVar;
        this.g = armfVar;
        this.h = armfVar2;
        this.x = apwtVar2;
        this.i = armfVar3;
        this.y = yjrVar;
        this.j = rygVar;
        this.k = uhjVar;
        this.l = agnqVar;
        this.z = rsvVar;
        this.m = optional;
        this.n = pssVar;
        this.A = armfVar4;
        this.B = mskVar;
        this.o = vbuVar;
        this.C = qpjVar;
        this.v = armfVar5;
        this.w = armfVar6;
        this.p = armfVar7;
        this.q = armfVar8;
        this.D = ahqrVar;
        this.r = armfVar9;
        this.E = armfVar10;
        this.s = armfVar11;
    }

    public static qei a(Optional optional) {
        return (qei) optional.flatMap(new mmv(1)).flatMap(new mmv(0)).orElseThrow(new mcw(12));
    }

    public final List b(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String l = rxn.l((ParticipantsTable.BindData) it.next());
            if (l != null) {
                arrayList.add(((psq) this.A.b()).a(l, false));
            }
        }
        return arrayList;
    }

    @Override // defpackage.mmx
    public final akul c(final long j, final String str, final boolean z, final Optional optional, alog alogVar, final Optional optional2, final qgr qgrVar) {
        if (this.y.y()) {
            return aktp.ai(new mzn(this, alogVar, 1, null), this.d).i(new ancs() { // from class: mmt
                @Override // defpackage.ancs
                public final ListenableFuture a(Object obj) {
                    UUID uuid;
                    final mmw mmwVar = mmw.this;
                    long j2 = j;
                    final String str2 = str;
                    boolean z2 = z;
                    final Optional optional3 = optional;
                    final alog alogVar2 = (alog) obj;
                    if (z2 && alogVar2.size() > 1) {
                        final qgr qgrVar2 = qgrVar;
                        if (((pfr) mmwVar.s.b()).a()) {
                            qgrVar2.getClass();
                        }
                        if (((pfr) mmwVar.s.b()).a()) {
                            uuid = null;
                        } else {
                            armf armfVar = mmwVar.i;
                            UUID randomUUID = UUID.randomUUID();
                            vti vtiVar = (vti) armfVar.b();
                            String uuid2 = randomUUID.toString();
                            uuid2.getClass();
                            vti.n(vtiVar, 2, 0, uuid2, null, null, null, 58);
                            uuid = randomUUID;
                        }
                        final String b2 = aikx.b();
                        GroupInfo groupInfo = new GroupInfo();
                        groupInfo.a(b2);
                        groupInfo.a = str2;
                        alob alobVar = new alob();
                        Iterator it = alogVar2.iterator();
                        while (it.hasNext()) {
                            String O = ((ParticipantsTable.BindData) it.next()).O();
                            if (O == null) {
                                ((alwl) ((alwl) mmw.b.i()).h("com/google/android/apps/messaging/shared/api/messaging/conversation/bugle/create/BugleLegacyConversationCreator", "generateUserInfoListFromBugleParticipants", 877, "BugleLegacyConversationCreator.java")).q("Participant's normalized destination is null. Ignoring participant when converting Bugle participants to UserInfos for ChatAPI conversation creation.");
                                it = it;
                            } else {
                                alobVar.h(new UserInfo(O));
                            }
                        }
                        groupInfo.b = alobVar.g();
                        final UUID uuid3 = uuid;
                        return mmwVar.e(j2, str2, true, optional3, alogVar2, Optional.of(groupInfo)).i(new ancs() { // from class: mms
                            @Override // defpackage.ancs
                            public final ListenableFuture a(Object obj2) {
                                akul b3;
                                ConversationIdType conversationIdType = (ConversationIdType) obj2;
                                if (conversationIdType.b()) {
                                    ((alwl) ((alwl) mmw.b.h()).h("com/google/android/apps/messaging/shared/api/messaging/conversation/bugle/create/BugleLegacyConversationCreator", "createConversationWithChatApi", 826, "BugleLegacyConversationCreator.java")).q("Skipping chat api group creation due to failure creating the conversation.");
                                    return aktp.ag(ruy.a);
                                }
                                alog alogVar3 = alogVar2;
                                String str3 = str2;
                                String str4 = b2;
                                Optional optional4 = optional3;
                                mmw mmwVar2 = mmw.this;
                                if (((pfr) mmwVar2.s.b()).a()) {
                                    qgr qgrVar3 = qgrVar2;
                                    qgrVar3.getClass();
                                    pss pssVar = mmwVar2.n;
                                    aozy createBuilder = qen.a.createBuilder();
                                    if (!createBuilder.b.isMutable()) {
                                        createBuilder.u();
                                    }
                                    apag apagVar = createBuilder.b;
                                    qen qenVar = (qen) apagVar;
                                    str4.getClass();
                                    qenVar.b |= 1;
                                    qenVar.c = str4;
                                    String ag = albo.ag(str3);
                                    if (!apagVar.isMutable()) {
                                        createBuilder.u();
                                    }
                                    qen qenVar2 = (qen) createBuilder.b;
                                    qenVar2.b |= 2;
                                    qenVar2.d = ag;
                                    qei a2 = mmw.a(optional4);
                                    if (!createBuilder.b.isMutable()) {
                                        createBuilder.u();
                                    }
                                    qen qenVar3 = (qen) createBuilder.b;
                                    a2.getClass();
                                    qenVar3.f = a2;
                                    qenVar3.b |= 8;
                                    createBuilder.B(mmwVar2.b(alogVar3));
                                    if (!createBuilder.b.isMutable()) {
                                        createBuilder.u();
                                    }
                                    qen qenVar4 = (qen) createBuilder.b;
                                    qenVar4.j = qgrVar3;
                                    qenVar4.b |= 64;
                                    aozy createBuilder2 = qem.a.createBuilder();
                                    if (!createBuilder2.b.isMutable()) {
                                        createBuilder2.u();
                                    }
                                    apag apagVar2 = createBuilder2.b;
                                    qem qemVar = (qem) apagVar2;
                                    str4.getClass();
                                    qemVar.b |= 1;
                                    qemVar.c = str4;
                                    if (!apagVar2.isMutable()) {
                                        createBuilder2.u();
                                    }
                                    qem qemVar2 = (qem) createBuilder2.b;
                                    qemVar2.e = qgrVar3;
                                    qemVar2.b |= 4;
                                    aozb byteString = ((qem) createBuilder2.s()).toByteString();
                                    if (!createBuilder.b.isMutable()) {
                                        createBuilder.u();
                                    }
                                    qen qenVar5 = (qen) createBuilder.b;
                                    qenVar5.b |= 16;
                                    qenVar5.h = byteString;
                                    b3 = pssVar.b((qen) createBuilder.s());
                                } else {
                                    UUID uuid4 = uuid3;
                                    uuid4.getClass();
                                    pss pssVar2 = mmwVar2.n;
                                    aozy createBuilder3 = qen.a.createBuilder();
                                    if (!createBuilder3.b.isMutable()) {
                                        createBuilder3.u();
                                    }
                                    apag apagVar3 = createBuilder3.b;
                                    qen qenVar6 = (qen) apagVar3;
                                    str4.getClass();
                                    qenVar6.b |= 1;
                                    qenVar6.c = str4;
                                    String ag2 = albo.ag(str3);
                                    if (!apagVar3.isMutable()) {
                                        createBuilder3.u();
                                    }
                                    qen qenVar7 = (qen) createBuilder3.b;
                                    qenVar7.b |= 2;
                                    qenVar7.d = ag2;
                                    qei a3 = mmw.a(optional4);
                                    if (!createBuilder3.b.isMutable()) {
                                        createBuilder3.u();
                                    }
                                    qen qenVar8 = (qen) createBuilder3.b;
                                    a3.getClass();
                                    qenVar8.f = a3;
                                    qenVar8.b |= 8;
                                    createBuilder3.B(mmwVar2.b(alogVar3));
                                    aozy createBuilder4 = qem.a.createBuilder();
                                    if (!createBuilder4.b.isMutable()) {
                                        createBuilder4.u();
                                    }
                                    qem qemVar3 = (qem) createBuilder4.b;
                                    str4.getClass();
                                    qemVar3.b |= 1;
                                    qemVar3.c = str4;
                                    String uuid5 = uuid4.toString();
                                    if (!createBuilder4.b.isMutable()) {
                                        createBuilder4.u();
                                    }
                                    qem qemVar4 = (qem) createBuilder4.b;
                                    uuid5.getClass();
                                    qemVar4.b |= 8;
                                    qemVar4.f = uuid5;
                                    aozb byteString2 = ((qem) createBuilder4.s()).toByteString();
                                    if (!createBuilder3.b.isMutable()) {
                                        createBuilder3.u();
                                    }
                                    qen qenVar9 = (qen) createBuilder3.b;
                                    qenVar9.b |= 16;
                                    qenVar9.h = byteString2;
                                    b3 = pssVar2.b((qen) createBuilder3.s());
                                }
                                return b3.h(new mmq(mmwVar2, conversationIdType, 0), mmwVar2.d);
                            }
                        }, mmwVar.d);
                    }
                    Optional optional4 = optional2;
                    if (z2 && optional4.isEmpty()) {
                        ((alwl) ((alwl) mmw.b.i()).h("com/google/android/apps/messaging/shared/api/messaging/conversation/bugle/create/BugleLegacyConversationCreator", "getOrCreateConversation", 240, "BugleLegacyConversationCreator.java")).q("RCS group was not successfully created");
                        return aktp.ag(ruy.a);
                    }
                    return mmwVar.e(j2, str2, z2, optional3, alogVar2, optional4);
                }
            }, this.d);
        }
        throw new IllegalStateException("Not the default SMS app");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final akul d(Optional optional, long j, boolean z, alog alogVar, ConversationIdType conversationIdType, int i) {
        alog alogVar2;
        akul h;
        qwm d = this.j.d();
        if (z) {
            h = aktp.ag(true);
        } else if (alogVar.size() != 1) {
            h = aktp.ag(false);
        } else {
            String O = ((ParticipantsTable.BindData) alogVar.get(0)).O();
            int intValue = ((Integer) optional.map(new mlm(18)).orElseGet(new ijm(this, 11))).intValue();
            rsv rsvVar = this.z;
            if (O != null) {
                alogVar2 = alog.r(this.B.r(O));
            } else {
                int i2 = alog.d;
                alogVar2 = alsx.a;
            }
            h = rsvVar.c(conversationIdType, alogVar2, null, "", new ArrayList(), intValue, false, Collection.EL.stream(alogVar).anyMatch(new mmd(3))).h(new mme(2), this.e);
            return h.h(new vqo(this, conversationIdType, alogVar, i, optional, d, j, 1), this.u);
        }
        return h.h(new vqo(this, conversationIdType, alogVar, i, optional, d, j, 1), this.u);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:(5:(4:35|36|37|(17:79|80|43|(4:45|(1:47)(1:76)|48|(13:50|51|52|53|54|55|56|57|58|59|60|61|62))(1:77)|75|51|52|53|54|55|56|57|58|59|60|61|62)(17:41|42|43|(0)(0)|75|51|52|53|54|55|56|57|58|59|60|61|62))|59|60|61|62)|53|54|55|56|57|58) */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x043f, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0440, code lost:
    
        r1 = r29;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0216 A[Catch: all -> 0x044d, TryCatch #4 {all -> 0x044d, blocks: (B:3:0x0012, B:7:0x0038, B:9:0x0054, B:14:0x00aa, B:19:0x00b6, B:21:0x00bc, B:22:0x02a2, B:24:0x02a8, B:26:0x02ae, B:27:0x02b2, B:28:0x02be, B:30:0x02c4, B:32:0x02ca, B:35:0x02d2, B:42:0x037c, B:43:0x0396, B:45:0x03a4, B:47:0x03ab, B:48:0x03c6, B:51:0x03d2, B:76:0x03b1, B:79:0x0381, B:90:0x0390, B:89:0x038d, B:92:0x013f, B:97:0x0165, B:99:0x0171, B:101:0x0177, B:103:0x01bb, B:105:0x01e5, B:106:0x01f1, B:109:0x0210, B:111:0x0216, B:112:0x024d, B:114:0x0263, B:117:0x006b, B:37:0x0335, B:39:0x033b, B:41:0x0347, B:84:0x0387), top: B:2:0x0012, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x024d A[Catch: all -> 0x044d, TryCatch #4 {all -> 0x044d, blocks: (B:3:0x0012, B:7:0x0038, B:9:0x0054, B:14:0x00aa, B:19:0x00b6, B:21:0x00bc, B:22:0x02a2, B:24:0x02a8, B:26:0x02ae, B:27:0x02b2, B:28:0x02be, B:30:0x02c4, B:32:0x02ca, B:35:0x02d2, B:42:0x037c, B:43:0x0396, B:45:0x03a4, B:47:0x03ab, B:48:0x03c6, B:51:0x03d2, B:76:0x03b1, B:79:0x0381, B:90:0x0390, B:89:0x038d, B:92:0x013f, B:97:0x0165, B:99:0x0171, B:101:0x0177, B:103:0x01bb, B:105:0x01e5, B:106:0x01f1, B:109:0x0210, B:111:0x0216, B:112:0x024d, B:114:0x0263, B:117:0x006b, B:37:0x0335, B:39:0x033b, B:41:0x0347, B:84:0x0387), top: B:2:0x0012, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00aa A[Catch: all -> 0x044d, TRY_LEAVE, TryCatch #4 {all -> 0x044d, blocks: (B:3:0x0012, B:7:0x0038, B:9:0x0054, B:14:0x00aa, B:19:0x00b6, B:21:0x00bc, B:22:0x02a2, B:24:0x02a8, B:26:0x02ae, B:27:0x02b2, B:28:0x02be, B:30:0x02c4, B:32:0x02ca, B:35:0x02d2, B:42:0x037c, B:43:0x0396, B:45:0x03a4, B:47:0x03ab, B:48:0x03c6, B:51:0x03d2, B:76:0x03b1, B:79:0x0381, B:90:0x0390, B:89:0x038d, B:92:0x013f, B:97:0x0165, B:99:0x0171, B:101:0x0177, B:103:0x01bb, B:105:0x01e5, B:106:0x01f1, B:109:0x0210, B:111:0x0216, B:112:0x024d, B:114:0x0263, B:117:0x006b, B:37:0x0335, B:39:0x033b, B:41:0x0347, B:84:0x0387), top: B:2:0x0012, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x02a8 A[Catch: all -> 0x044d, TryCatch #4 {all -> 0x044d, blocks: (B:3:0x0012, B:7:0x0038, B:9:0x0054, B:14:0x00aa, B:19:0x00b6, B:21:0x00bc, B:22:0x02a2, B:24:0x02a8, B:26:0x02ae, B:27:0x02b2, B:28:0x02be, B:30:0x02c4, B:32:0x02ca, B:35:0x02d2, B:42:0x037c, B:43:0x0396, B:45:0x03a4, B:47:0x03ab, B:48:0x03c6, B:51:0x03d2, B:76:0x03b1, B:79:0x0381, B:90:0x0390, B:89:0x038d, B:92:0x013f, B:97:0x0165, B:99:0x0171, B:101:0x0177, B:103:0x01bb, B:105:0x01e5, B:106:0x01f1, B:109:0x0210, B:111:0x0216, B:112:0x024d, B:114:0x0263, B:117:0x006b, B:37:0x0335, B:39:0x033b, B:41:0x0347, B:84:0x0387), top: B:2:0x0012, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x02c4 A[Catch: all -> 0x044d, TryCatch #4 {all -> 0x044d, blocks: (B:3:0x0012, B:7:0x0038, B:9:0x0054, B:14:0x00aa, B:19:0x00b6, B:21:0x00bc, B:22:0x02a2, B:24:0x02a8, B:26:0x02ae, B:27:0x02b2, B:28:0x02be, B:30:0x02c4, B:32:0x02ca, B:35:0x02d2, B:42:0x037c, B:43:0x0396, B:45:0x03a4, B:47:0x03ab, B:48:0x03c6, B:51:0x03d2, B:76:0x03b1, B:79:0x0381, B:90:0x0390, B:89:0x038d, B:92:0x013f, B:97:0x0165, B:99:0x0171, B:101:0x0177, B:103:0x01bb, B:105:0x01e5, B:106:0x01f1, B:109:0x0210, B:111:0x0216, B:112:0x024d, B:114:0x0263, B:117:0x006b, B:37:0x0335, B:39:0x033b, B:41:0x0347, B:84:0x0387), top: B:2:0x0012, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x03a4 A[Catch: all -> 0x044d, TryCatch #4 {all -> 0x044d, blocks: (B:3:0x0012, B:7:0x0038, B:9:0x0054, B:14:0x00aa, B:19:0x00b6, B:21:0x00bc, B:22:0x02a2, B:24:0x02a8, B:26:0x02ae, B:27:0x02b2, B:28:0x02be, B:30:0x02c4, B:32:0x02ca, B:35:0x02d2, B:42:0x037c, B:43:0x0396, B:45:0x03a4, B:47:0x03ab, B:48:0x03c6, B:51:0x03d2, B:76:0x03b1, B:79:0x0381, B:90:0x0390, B:89:0x038d, B:92:0x013f, B:97:0x0165, B:99:0x0171, B:101:0x0177, B:103:0x01bb, B:105:0x01e5, B:106:0x01f1, B:109:0x0210, B:111:0x0216, B:112:0x024d, B:114:0x0263, B:117:0x006b, B:37:0x0335, B:39:0x033b, B:41:0x0347, B:84:0x0387), top: B:2:0x0012, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x03cf  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0164  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.akul e(final long r30, final java.lang.String r32, final boolean r33, final j$.util.Optional r34, defpackage.alog r35, final j$.util.Optional r36) {
        /*
            Method dump skipped, instructions count: 1119
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mmw.e(long, java.lang.String, boolean, j$.util.Optional, alog, j$.util.Optional):akul");
    }
}
