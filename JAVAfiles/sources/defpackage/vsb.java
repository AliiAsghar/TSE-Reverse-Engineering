package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.Optional;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vsb implements vsh {
    private static final xze c = xze.g("BugleDataModel", "DefaultRcsConversationAndThreadIdGetterImpl");
    private static final alvi d = alvi.m("com/google/android/apps/messaging/shared/rcs/conversation/DefaultRcsConversationAndThreadIdGetterImpl");
    public final armf a;
    public final armf b;
    private final anen e;
    private final vsg f;
    private final vxr g;
    private final mbl h;
    private final armf i;
    private final armf j;
    private final armf k;
    private final armf l;
    private final vsm m;
    private final apwt n;

    public vsb(anen anenVar, vsg vsgVar, vxr vxrVar, mbl mblVar, armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, vsm vsmVar, armf armfVar6, apwt apwtVar) {
        this.e = anenVar;
        this.f = vsgVar;
        this.g = vxrVar;
        this.h = mblVar;
        this.i = armfVar;
        this.j = armfVar2;
        this.k = armfVar3;
        this.a = armfVar4;
        this.l = armfVar5;
        this.m = vsmVar;
        this.b = armfVar6;
        this.n = apwtVar;
    }

    private static alog e(snh snhVar) {
        snf e = sni.e();
        e.w("+queryConversationsTableWithIdAndThreadIdProjection");
        e.e(new vmd(19));
        e.g(snhVar);
        return e.b().t();
    }

    private static alog f(vry vryVar, Optional optional) {
        alog alogVar = vryVar.a;
        if (alogVar.size() != 1) {
            Optional optional2 = vryVar.b;
            int i = 3;
            if (optional2.isPresent() && ((alog) optional2.get()).size() == 1) {
                xyo a = c.a();
                a.H("Single conversation matched by global identifiers fallback query.");
                a.q();
                optional.ifPresent(new vrw(2));
                optional.ifPresent(new vrw(3));
                return (alog) optional2.get();
            }
            Optional optional3 = vryVar.c;
            int i2 = 5;
            int i3 = 4;
            if (optional3.isPresent() && ((alog) optional3.get()).size() == 1) {
                xyo a2 = c.a();
                a2.H("Single conversation matched by session ID fallback query.");
                a2.q();
                optional.ifPresent(new vrw(4));
                optional.ifPresent(new vrw(5));
                return (alog) optional3.get();
            }
            Optional optional4 = vryVar.d;
            if (optional4.isPresent()) {
                int size = ((alog) optional4.get()).size();
                xyo a3 = c.a();
                a3.x("NumberOfConversationsMatched", size);
                a3.H("Multiple conversations matched by Telephony fallback query.");
                a3.q();
                optional.ifPresent(new ivb(size, i));
                optional.ifPresent(new uhb(18));
                return (alog) optional4.get();
            }
            if (optional2.isPresent() && !((alog) optional2.get()).isEmpty()) {
                int size2 = ((alog) optional2.get()).size();
                xyo a4 = c.a();
                a4.x("NumberOfConversationsMatched", size2);
                a4.H("Multiple conversations matched by global identifiers fallback query.");
                a4.q();
                optional.ifPresent(new ivb(size2, i3));
                optional.ifPresent(new uhb(19));
                return (alog) optional2.get();
            }
            if (optional3.isPresent() && !((alog) optional3.get()).isEmpty()) {
                int size3 = ((alog) optional3.get()).size();
                xyo a5 = c.a();
                a5.x("NumberOfConversationsMatched", size3);
                a5.H("Multiple conversations matched by session ID fallback query.");
                a5.q();
                optional.ifPresent(new ivb(size3, i2));
                optional.ifPresent(new uhb(20));
                return (alog) optional3.get();
            }
            int size4 = alogVar.size();
            xyo a6 = c.a();
            a6.x("NumberOfConversationsMatched", size4);
            a6.H("Multiple conversations matched by all parameters query.");
            a6.q();
            optional.ifPresent(new ivb(size4, 6));
            if (size4 > 0) {
                optional.ifPresent(new vrw(1));
            }
            return alogVar;
        }
        xyo a7 = c.a();
        a7.H("Single conversation matched by all parameters query.");
        a7.q();
        optional.ifPresent(new uhb(17));
        optional.ifPresent(new vrw(0));
        return alogVar;
    }

    private final void g(final boolean z, boolean z2, Optional optional) {
        if (optional.isEmpty()) {
            return;
        }
        aozy aozyVar = (aozy) optional.get();
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        amkv amkvVar = (amkv) aozyVar.b;
        amkv amkvVar2 = amkv.a;
        amkvVar.b |= 128;
        amkvVar.j = z2;
        final vsm vsmVar = this.m;
        final amkv amkvVar3 = (amkv) ((aozy) optional.get()).s();
        ((alwl) vsm.a.m().h("com/google/android/apps/messaging/shared/rcs/conversation/analytics/RcsGroupResolutionAnalytics", "logRcsGroupResolution", 45, "RcsGroupResolutionAnalytics.java")).q("Sending GroupResolution event to Clearcut");
        vsmVar.b.n(new Supplier() { // from class: vsl
            @Override // java.util.function.Supplier
            public final Object get() {
                int i;
                aozy createBuilder = amfv.a.createBuilder();
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                boolean z3 = z;
                apag apagVar = createBuilder.b;
                amfv amfvVar = (amfv) apagVar;
                amfvVar.c = 10;
                amfvVar.b |= 1;
                if (true != z3) {
                    i = 3;
                } else {
                    i = 2;
                }
                if (!apagVar.isMutable()) {
                    createBuilder.u();
                }
                vsm vsmVar2 = vsm.this;
                amfv amfvVar2 = (amfv) createBuilder.b;
                amfvVar2.d = i - 1;
                amfvVar2.b |= 2;
                amhb x = vsmVar2.d.x(vsmVar2.e.Q(vqk.r));
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                amfv amfvVar3 = (amfv) createBuilder.b;
                amfvVar3.e = x;
                amfvVar3.b |= 4;
                amwt a = ((vru) vsmVar2.c.b()).a();
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                apag apagVar2 = createBuilder.b;
                amfv amfvVar4 = (amfv) apagVar2;
                amfvVar4.f = a.E;
                amfvVar4.b |= 8;
                if (!apagVar2.isMutable()) {
                    createBuilder.u();
                }
                amkv amkvVar4 = amkvVar3;
                amfv amfvVar5 = (amfv) createBuilder.b;
                amkvVar4.getClass();
                amfvVar5.k = amkvVar4;
                amfvVar5.b |= 512;
                return (amfv) createBuilder.s();
            }
        });
    }

    @Override // defpackage.vsh
    public final ConversationIdType a(vsj vsjVar) {
        xwa c2 = c(vsjVar);
        if (c2 == null) {
            return ruy.a;
        }
        return c2.a;
    }

    public final xhv b(ConversationIdType conversationIdType) {
        if (((Boolean) qpf.d.e()).booleanValue()) {
            return ((qos) this.l.b()).a(conversationIdType);
        }
        smr a = sni.a(conversationIdType);
        if (a != null) {
            return a.F();
        }
        return new xhv();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(17:9|(1:11)|12|(1:14)|26|27|28|(3:311|312|(9:314|31|32|(3:306|307|308)(1:34)|35|(27:37|38|(2:44|(1:46))|53|54|56|(3:220|221|(31:223|224|225|226|227|228|(1:230)(7:239|(1:287)(1:243)|(1:245)|246|(6:249|(1:284)(3:251|(2:253|(1:267)(3:(1:258)|264|265))(2:268|(5:(2:271|(2:273|274))|275|(1:279)|264|265)(2:282|283))|261)|259|260|261|247)|285|286)|231|(2:234|232)|235|236|237|60|61|(2:63|(1:65))(3:206|207|(3:209|(1:211)|(1:213))(2:214|(1:216)))|66|(2:68|(1:70))|71|(1:73)|74|75|76|(1:78)(1:205)|79|80|81|(1:83)(6:198|199|(2:201|(1:203))(1:204)|(1:86)(3:193|194|(1:196))|87|88)|84|(0)(0)|87|88))(1:58)|59|60|61|(0)(0)|66|(0)|71|(0)|74|75|76|(0)(0)|79|80|81|(0)(0)|84|(0)(0)|87|88)(4:300|301|302|303)|219|51|52))|30|31|32|(0)(0)|35|(0)(0)|219|51|52) */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x09c4, code lost:
    
        if (r5 != false) goto L265;
     */
    /* JADX WARN: Code restructure failed: missing block: B:309:0x06e7, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:310:0x06ec, code lost:
    
        r6 = "Bugle.Rcs.Groups.Conversation.Resolution.Latency";
     */
    /* JADX WARN: Code restructure failed: missing block: B:372:0x0056, code lost:
    
        if (((java.lang.Boolean) defpackage.qpi.f.e()).booleanValue() != false) goto L16;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0a30 A[Catch: all -> 0x0c2d, TryCatch #6 {all -> 0x0c2d, blocks: (B:87:0x06c7, B:90:0x085c, B:94:0x0864, B:97:0x086c, B:99:0x08b8, B:100:0x0909, B:103:0x0913, B:104:0x0934, B:106:0x0959, B:107:0x09e0, B:109:0x09ef, B:111:0x09f3, B:113:0x0a02, B:114:0x0a08, B:118:0x0a20, B:121:0x0a2b, B:129:0x0968, B:131:0x097a, B:132:0x0988, B:134:0x0990, B:135:0x099c, B:137:0x09a4, B:138:0x09b0, B:140:0x09b8, B:141:0x09c6, B:142:0x09c9, B:145:0x08c0, B:147:0x08de, B:148:0x08fa, B:149:0x0a30, B:151:0x0a3f, B:154:0x0a8e, B:155:0x0a89, B:156:0x0a94, B:159:0x0aaf, B:161:0x0ae6, B:162:0x0b07, B:165:0x0b0f, B:166:0x0b50, B:168:0x0b73, B:173:0x0bbb, B:175:0x0bc9, B:176:0x0be0, B:177:0x0bab, B:178:0x0b33, B:180:0x0be3, B:182:0x0be7, B:184:0x0bed, B:187:0x0c01, B:190:0x0c06, B:192:0x0c14, B:51:0x06ee, B:52:0x06f9, B:322:0x06fa, B:324:0x0714, B:327:0x072c, B:329:0x075a, B:332:0x076e, B:335:0x0787, B:337:0x07a1, B:338:0x07c5, B:340:0x07df, B:344:0x07ec, B:346:0x07fc, B:347:0x0810, B:349:0x0816, B:351:0x0829, B:353:0x0831, B:354:0x0843, B:355:0x07f0), top: B:7:0x009f }] */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0be7 A[Catch: all -> 0x0c2d, TryCatch #6 {all -> 0x0c2d, blocks: (B:87:0x06c7, B:90:0x085c, B:94:0x0864, B:97:0x086c, B:99:0x08b8, B:100:0x0909, B:103:0x0913, B:104:0x0934, B:106:0x0959, B:107:0x09e0, B:109:0x09ef, B:111:0x09f3, B:113:0x0a02, B:114:0x0a08, B:118:0x0a20, B:121:0x0a2b, B:129:0x0968, B:131:0x097a, B:132:0x0988, B:134:0x0990, B:135:0x099c, B:137:0x09a4, B:138:0x09b0, B:140:0x09b8, B:141:0x09c6, B:142:0x09c9, B:145:0x08c0, B:147:0x08de, B:148:0x08fa, B:149:0x0a30, B:151:0x0a3f, B:154:0x0a8e, B:155:0x0a89, B:156:0x0a94, B:159:0x0aaf, B:161:0x0ae6, B:162:0x0b07, B:165:0x0b0f, B:166:0x0b50, B:168:0x0b73, B:173:0x0bbb, B:175:0x0bc9, B:176:0x0be0, B:177:0x0bab, B:178:0x0b33, B:180:0x0be3, B:182:0x0be7, B:184:0x0bed, B:187:0x0c01, B:190:0x0c06, B:192:0x0c14, B:51:0x06ee, B:52:0x06f9, B:322:0x06fa, B:324:0x0714, B:327:0x072c, B:329:0x075a, B:332:0x076e, B:335:0x0787, B:337:0x07a1, B:338:0x07c5, B:340:0x07df, B:344:0x07ec, B:346:0x07fc, B:347:0x0810, B:349:0x0816, B:351:0x0829, B:353:0x0831, B:354:0x0843, B:355:0x07f0), top: B:7:0x009f }] */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0bfc  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0bff  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0c06 A[Catch: all -> 0x0c2d, TryCatch #6 {all -> 0x0c2d, blocks: (B:87:0x06c7, B:90:0x085c, B:94:0x0864, B:97:0x086c, B:99:0x08b8, B:100:0x0909, B:103:0x0913, B:104:0x0934, B:106:0x0959, B:107:0x09e0, B:109:0x09ef, B:111:0x09f3, B:113:0x0a02, B:114:0x0a08, B:118:0x0a20, B:121:0x0a2b, B:129:0x0968, B:131:0x097a, B:132:0x0988, B:134:0x0990, B:135:0x099c, B:137:0x09a4, B:138:0x09b0, B:140:0x09b8, B:141:0x09c6, B:142:0x09c9, B:145:0x08c0, B:147:0x08de, B:148:0x08fa, B:149:0x0a30, B:151:0x0a3f, B:154:0x0a8e, B:155:0x0a89, B:156:0x0a94, B:159:0x0aaf, B:161:0x0ae6, B:162:0x0b07, B:165:0x0b0f, B:166:0x0b50, B:168:0x0b73, B:173:0x0bbb, B:175:0x0bc9, B:176:0x0be0, B:177:0x0bab, B:178:0x0b33, B:180:0x0be3, B:182:0x0be7, B:184:0x0bed, B:187:0x0c01, B:190:0x0c06, B:192:0x0c14, B:51:0x06ee, B:52:0x06f9, B:322:0x06fa, B:324:0x0714, B:327:0x072c, B:329:0x075a, B:332:0x076e, B:335:0x0787, B:337:0x07a1, B:338:0x07c5, B:340:0x07df, B:344:0x07ec, B:346:0x07fc, B:347:0x0810, B:349:0x0816, B:351:0x0829, B:353:0x0831, B:354:0x0843, B:355:0x07f0), top: B:7:0x009f }] */
    /* JADX WARN: Removed duplicated region for block: B:193:0x062c A[Catch: all -> 0x06d8, TRY_LEAVE, TryCatch #10 {all -> 0x06d8, blocks: (B:61:0x0489, B:66:0x04f1, B:71:0x052e, B:75:0x053f, B:80:0x0577, B:193:0x062c, B:198:0x05af, B:204:0x0617, B:205:0x056b, B:206:0x04aa, B:214:0x04df), top: B:60:0x0489 }] */
    /* JADX WARN: Removed duplicated region for block: B:198:0x05af A[Catch: all -> 0x06d8, TRY_ENTER, TRY_LEAVE, TryCatch #10 {all -> 0x06d8, blocks: (B:61:0x0489, B:66:0x04f1, B:71:0x052e, B:75:0x053f, B:80:0x0577, B:193:0x062c, B:198:0x05af, B:204:0x0617, B:205:0x056b, B:206:0x04aa, B:214:0x04df), top: B:60:0x0489 }] */
    /* JADX WARN: Removed duplicated region for block: B:205:0x056b A[Catch: all -> 0x06d8, TRY_ENTER, TryCatch #10 {all -> 0x06d8, blocks: (B:61:0x0489, B:66:0x04f1, B:71:0x052e, B:75:0x053f, B:80:0x0577, B:193:0x062c, B:198:0x05af, B:204:0x0617, B:205:0x056b, B:206:0x04aa, B:214:0x04df), top: B:60:0x0489 }] */
    /* JADX WARN: Removed duplicated region for block: B:206:0x04aa A[Catch: all -> 0x06d8, TRY_ENTER, TRY_LEAVE, TryCatch #10 {all -> 0x06d8, blocks: (B:61:0x0489, B:66:0x04f1, B:71:0x052e, B:75:0x053f, B:80:0x0577, B:193:0x062c, B:198:0x05af, B:204:0x0617, B:205:0x056b, B:206:0x04aa, B:214:0x04df), top: B:60:0x0489 }] */
    /* JADX WARN: Removed duplicated region for block: B:300:0x06dc  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x0157 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:322:0x06fa A[Catch: all -> 0x0c2d, TryCatch #6 {all -> 0x0c2d, blocks: (B:87:0x06c7, B:90:0x085c, B:94:0x0864, B:97:0x086c, B:99:0x08b8, B:100:0x0909, B:103:0x0913, B:104:0x0934, B:106:0x0959, B:107:0x09e0, B:109:0x09ef, B:111:0x09f3, B:113:0x0a02, B:114:0x0a08, B:118:0x0a20, B:121:0x0a2b, B:129:0x0968, B:131:0x097a, B:132:0x0988, B:134:0x0990, B:135:0x099c, B:137:0x09a4, B:138:0x09b0, B:140:0x09b8, B:141:0x09c6, B:142:0x09c9, B:145:0x08c0, B:147:0x08de, B:148:0x08fa, B:149:0x0a30, B:151:0x0a3f, B:154:0x0a8e, B:155:0x0a89, B:156:0x0a94, B:159:0x0aaf, B:161:0x0ae6, B:162:0x0b07, B:165:0x0b0f, B:166:0x0b50, B:168:0x0b73, B:173:0x0bbb, B:175:0x0bc9, B:176:0x0be0, B:177:0x0bab, B:178:0x0b33, B:180:0x0be3, B:182:0x0be7, B:184:0x0bed, B:187:0x0c01, B:190:0x0c06, B:192:0x0c14, B:51:0x06ee, B:52:0x06f9, B:322:0x06fa, B:324:0x0714, B:327:0x072c, B:329:0x075a, B:332:0x076e, B:335:0x0787, B:337:0x07a1, B:338:0x07c5, B:340:0x07df, B:344:0x07ec, B:346:0x07fc, B:347:0x0810, B:349:0x0816, B:351:0x0829, B:353:0x0831, B:354:0x0843, B:355:0x07f0), top: B:7:0x009f }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0160 A[Catch: all -> 0x06e7, TRY_ENTER, TryCatch #3 {all -> 0x06e7, blocks: (B:32:0x014a, B:35:0x016e, B:37:0x01b1, B:54:0x0261, B:34:0x0160), top: B:31:0x014a }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01b1 A[Catch: all -> 0x06e7, TRY_LEAVE, TryCatch #3 {all -> 0x06e7, blocks: (B:32:0x014a, B:35:0x016e, B:37:0x01b1, B:54:0x0261, B:34:0x0160), top: B:31:0x014a }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0495 A[Catch: all -> 0x04a8, TRY_ENTER, TryCatch #4 {all -> 0x04a8, blocks: (B:237:0x0423, B:63:0x0495, B:65:0x04a0, B:68:0x04f9, B:70:0x051b, B:73:0x0536, B:78:0x0567, B:83:0x0589, B:196:0x0669, B:201:0x05b6, B:203:0x05f4, B:209:0x04b1, B:211:0x04ce, B:213:0x04d7, B:216:0x04ea, B:290:0x0464, B:291:0x0470), top: B:56:0x0265 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x04f9 A[Catch: all -> 0x04a8, TRY_ENTER, TryCatch #4 {all -> 0x04a8, blocks: (B:237:0x0423, B:63:0x0495, B:65:0x04a0, B:68:0x04f9, B:70:0x051b, B:73:0x0536, B:78:0x0567, B:83:0x0589, B:196:0x0669, B:201:0x05b6, B:203:0x05f4, B:209:0x04b1, B:211:0x04ce, B:213:0x04d7, B:216:0x04ea, B:290:0x0464, B:291:0x0470), top: B:56:0x0265 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0536 A[Catch: all -> 0x04a8, TRY_ENTER, TRY_LEAVE, TryCatch #4 {all -> 0x04a8, blocks: (B:237:0x0423, B:63:0x0495, B:65:0x04a0, B:68:0x04f9, B:70:0x051b, B:73:0x0536, B:78:0x0567, B:83:0x0589, B:196:0x0669, B:201:0x05b6, B:203:0x05f4, B:209:0x04b1, B:211:0x04ce, B:213:0x04d7, B:216:0x04ea, B:290:0x0464, B:291:0x0470), top: B:56:0x0265 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0567 A[Catch: all -> 0x04a8, TRY_ENTER, TRY_LEAVE, TryCatch #4 {all -> 0x04a8, blocks: (B:237:0x0423, B:63:0x0495, B:65:0x04a0, B:68:0x04f9, B:70:0x051b, B:73:0x0536, B:78:0x0567, B:83:0x0589, B:196:0x0669, B:201:0x05b6, B:203:0x05f4, B:209:0x04b1, B:211:0x04ce, B:213:0x04d7, B:216:0x04ea, B:290:0x0464, B:291:0x0470), top: B:56:0x0265 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0589 A[Catch: all -> 0x04a8, TRY_ENTER, TRY_LEAVE, TryCatch #4 {all -> 0x04a8, blocks: (B:237:0x0423, B:63:0x0495, B:65:0x04a0, B:68:0x04f9, B:70:0x051b, B:73:0x0536, B:78:0x0567, B:83:0x0589, B:196:0x0669, B:201:0x05b6, B:203:0x05f4, B:209:0x04b1, B:211:0x04ce, B:213:0x04d7, B:216:0x04ea, B:290:0x0464, B:291:0x0470), top: B:56:0x0265 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x062a  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0860 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x086c A[Catch: all -> 0x0c2d, TRY_ENTER, TryCatch #6 {all -> 0x0c2d, blocks: (B:87:0x06c7, B:90:0x085c, B:94:0x0864, B:97:0x086c, B:99:0x08b8, B:100:0x0909, B:103:0x0913, B:104:0x0934, B:106:0x0959, B:107:0x09e0, B:109:0x09ef, B:111:0x09f3, B:113:0x0a02, B:114:0x0a08, B:118:0x0a20, B:121:0x0a2b, B:129:0x0968, B:131:0x097a, B:132:0x0988, B:134:0x0990, B:135:0x099c, B:137:0x09a4, B:138:0x09b0, B:140:0x09b8, B:141:0x09c6, B:142:0x09c9, B:145:0x08c0, B:147:0x08de, B:148:0x08fa, B:149:0x0a30, B:151:0x0a3f, B:154:0x0a8e, B:155:0x0a89, B:156:0x0a94, B:159:0x0aaf, B:161:0x0ae6, B:162:0x0b07, B:165:0x0b0f, B:166:0x0b50, B:168:0x0b73, B:173:0x0bbb, B:175:0x0bc9, B:176:0x0be0, B:177:0x0bab, B:178:0x0b33, B:180:0x0be3, B:182:0x0be7, B:184:0x0bed, B:187:0x0c01, B:190:0x0c06, B:192:0x0c14, B:51:0x06ee, B:52:0x06f9, B:322:0x06fa, B:324:0x0714, B:327:0x072c, B:329:0x075a, B:332:0x076e, B:335:0x0787, B:337:0x07a1, B:338:0x07c5, B:340:0x07df, B:344:0x07ec, B:346:0x07fc, B:347:0x0810, B:349:0x0816, B:351:0x0829, B:353:0x0831, B:354:0x0843, B:355:0x07f0), top: B:7:0x009f }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00a1 A[Catch: all -> 0x0c2f, TRY_LEAVE, TryCatch #7 {all -> 0x0c2f, blocks: (B:3:0x0010, B:6:0x009b, B:9:0x00a1, B:12:0x00c1, B:26:0x00dc, B:361:0x0037, B:364:0x003c, B:366:0x005f), top: B:2:0x0010 }] */
    /* JADX WARN: Type inference failed for: r10v17, types: [j$.util.Optional] */
    /* JADX WARN: Type inference failed for: r11v14, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v20, types: [j$.util.Optional] */
    /* JADX WARN: Type inference failed for: r2v28, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v26, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v52, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v21, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v22, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v23, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v54, types: [j$.util.Optional] */
    @Override // defpackage.vsh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.xwa c(defpackage.vsj r39) {
        /*
            Method dump skipped, instructions count: 3133
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vsb.c(vsj):xwa");
    }

    @Override // defpackage.vsh
    public final akul d(vsj vsjVar) {
        return aktp.ai(new vmb(this, vsjVar, 3), this.e);
    }
}
