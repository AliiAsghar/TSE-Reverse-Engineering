package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yxv implements yxn, yxh {
    public static final xze a = xze.g("BugleDataModel", "XmsViaTelephonySender");
    public final Context b;
    public final xbi c;
    public final wzs d;
    public final vak e;
    public final wys f;
    public final ahpf g;
    public final yxo h;
    private final anen i;
    private final anen j;
    private final anen k;
    private final yxg l;
    private final armf m;
    private final ocs n;

    public yxv(Context context, anen anenVar, anen anenVar2, anen anenVar3, xbi xbiVar, wzs wzsVar, vak vakVar, wys wysVar, ahpf ahpfVar, yxo yxoVar, yxg yxgVar, armf armfVar, ocs ocsVar) {
        this.b = context;
        this.j = anenVar;
        this.i = anenVar2;
        this.k = anenVar3;
        this.c = xbiVar;
        this.d = wzsVar;
        this.e = vakVar;
        this.f = wysVar;
        this.g = ahpfVar;
        this.h = yxoVar;
        this.l = yxgVar;
        this.m = armfVar;
        this.n = ocsVar;
    }

    public static vqh c() {
        return vqh.a(2, 0).a();
    }

    @Override // defpackage.yxh
    public final akul a(yxj yxjVar) {
        final MessageCoreData messageCoreData = yxjVar.a;
        d.s(messageCoreData.cB());
        yxg yxgVar = this.l;
        final int i = yxjVar.c;
        final Uri uri = yxjVar.b;
        final long s = messageCoreData.s();
        Optional a2 = yxgVar.a(i, uri, s);
        if (a2.isPresent()) {
            return akul.g(albo.bI(((vqh) a2.get()).c(tqu.TELEPHONY_UNSPECIFIED)));
        }
        return aktp.ai(new yxs(this, messageCoreData, 0), this.i).h(new algk() { // from class: yxt
            /* JADX WARN: Removed duplicated region for block: B:114:0x03ae A[Catch: gl -> 0x043d, TryCatch #17 {gl -> 0x043d, blocks: (B:60:0x0427, B:61:0x042c, B:113:0x03ab, B:114:0x03ae, B:115:0x03fb, B:116:0x040c, B:117:0x03b1, B:16:0x0445, B:118:0x03b8, B:119:0x03bf, B:120:0x03c6, B:121:0x03cd, B:122:0x03d4, B:123:0x03db, B:124:0x03e1, B:125:0x03f4, B:126:0x03f5, B:246:0x0410, B:247:0x0413, B:241:0x037b, B:136:0x039d, B:138:0x03a1, B:133:0x0397, B:289:0x0414, B:290:0x041d, B:14:0x0439), top: B:10:0x0060 }] */
            /* JADX WARN: Removed duplicated region for block: B:117:0x03b1 A[Catch: gl -> 0x043d, TryCatch #17 {gl -> 0x043d, blocks: (B:60:0x0427, B:61:0x042c, B:113:0x03ab, B:114:0x03ae, B:115:0x03fb, B:116:0x040c, B:117:0x03b1, B:16:0x0445, B:118:0x03b8, B:119:0x03bf, B:120:0x03c6, B:121:0x03cd, B:122:0x03d4, B:123:0x03db, B:124:0x03e1, B:125:0x03f4, B:126:0x03f5, B:246:0x0410, B:247:0x0413, B:241:0x037b, B:136:0x039d, B:138:0x03a1, B:133:0x0397, B:289:0x0414, B:290:0x041d, B:14:0x0439), top: B:10:0x0060 }] */
            /* JADX WARN: Removed duplicated region for block: B:118:0x03b8 A[Catch: gl -> 0x043d, TryCatch #17 {gl -> 0x043d, blocks: (B:60:0x0427, B:61:0x042c, B:113:0x03ab, B:114:0x03ae, B:115:0x03fb, B:116:0x040c, B:117:0x03b1, B:16:0x0445, B:118:0x03b8, B:119:0x03bf, B:120:0x03c6, B:121:0x03cd, B:122:0x03d4, B:123:0x03db, B:124:0x03e1, B:125:0x03f4, B:126:0x03f5, B:246:0x0410, B:247:0x0413, B:241:0x037b, B:136:0x039d, B:138:0x03a1, B:133:0x0397, B:289:0x0414, B:290:0x041d, B:14:0x0439), top: B:10:0x0060 }] */
            /* JADX WARN: Removed duplicated region for block: B:119:0x03bf A[Catch: gl -> 0x043d, TryCatch #17 {gl -> 0x043d, blocks: (B:60:0x0427, B:61:0x042c, B:113:0x03ab, B:114:0x03ae, B:115:0x03fb, B:116:0x040c, B:117:0x03b1, B:16:0x0445, B:118:0x03b8, B:119:0x03bf, B:120:0x03c6, B:121:0x03cd, B:122:0x03d4, B:123:0x03db, B:124:0x03e1, B:125:0x03f4, B:126:0x03f5, B:246:0x0410, B:247:0x0413, B:241:0x037b, B:136:0x039d, B:138:0x03a1, B:133:0x0397, B:289:0x0414, B:290:0x041d, B:14:0x0439), top: B:10:0x0060 }] */
            /* JADX WARN: Removed duplicated region for block: B:120:0x03c6 A[Catch: gl -> 0x043d, TryCatch #17 {gl -> 0x043d, blocks: (B:60:0x0427, B:61:0x042c, B:113:0x03ab, B:114:0x03ae, B:115:0x03fb, B:116:0x040c, B:117:0x03b1, B:16:0x0445, B:118:0x03b8, B:119:0x03bf, B:120:0x03c6, B:121:0x03cd, B:122:0x03d4, B:123:0x03db, B:124:0x03e1, B:125:0x03f4, B:126:0x03f5, B:246:0x0410, B:247:0x0413, B:241:0x037b, B:136:0x039d, B:138:0x03a1, B:133:0x0397, B:289:0x0414, B:290:0x041d, B:14:0x0439), top: B:10:0x0060 }] */
            /* JADX WARN: Removed duplicated region for block: B:121:0x03cd A[Catch: gl -> 0x043d, TryCatch #17 {gl -> 0x043d, blocks: (B:60:0x0427, B:61:0x042c, B:113:0x03ab, B:114:0x03ae, B:115:0x03fb, B:116:0x040c, B:117:0x03b1, B:16:0x0445, B:118:0x03b8, B:119:0x03bf, B:120:0x03c6, B:121:0x03cd, B:122:0x03d4, B:123:0x03db, B:124:0x03e1, B:125:0x03f4, B:126:0x03f5, B:246:0x0410, B:247:0x0413, B:241:0x037b, B:136:0x039d, B:138:0x03a1, B:133:0x0397, B:289:0x0414, B:290:0x041d, B:14:0x0439), top: B:10:0x0060 }] */
            /* JADX WARN: Removed duplicated region for block: B:122:0x03d4 A[Catch: gl -> 0x043d, TryCatch #17 {gl -> 0x043d, blocks: (B:60:0x0427, B:61:0x042c, B:113:0x03ab, B:114:0x03ae, B:115:0x03fb, B:116:0x040c, B:117:0x03b1, B:16:0x0445, B:118:0x03b8, B:119:0x03bf, B:120:0x03c6, B:121:0x03cd, B:122:0x03d4, B:123:0x03db, B:124:0x03e1, B:125:0x03f4, B:126:0x03f5, B:246:0x0410, B:247:0x0413, B:241:0x037b, B:136:0x039d, B:138:0x03a1, B:133:0x0397, B:289:0x0414, B:290:0x041d, B:14:0x0439), top: B:10:0x0060 }] */
            /* JADX WARN: Removed duplicated region for block: B:123:0x03db A[Catch: gl -> 0x043d, TryCatch #17 {gl -> 0x043d, blocks: (B:60:0x0427, B:61:0x042c, B:113:0x03ab, B:114:0x03ae, B:115:0x03fb, B:116:0x040c, B:117:0x03b1, B:16:0x0445, B:118:0x03b8, B:119:0x03bf, B:120:0x03c6, B:121:0x03cd, B:122:0x03d4, B:123:0x03db, B:124:0x03e1, B:125:0x03f4, B:126:0x03f5, B:246:0x0410, B:247:0x0413, B:241:0x037b, B:136:0x039d, B:138:0x03a1, B:133:0x0397, B:289:0x0414, B:290:0x041d, B:14:0x0439), top: B:10:0x0060 }] */
            /* JADX WARN: Removed duplicated region for block: B:124:0x03e1 A[Catch: gl -> 0x043d, TryCatch #17 {gl -> 0x043d, blocks: (B:60:0x0427, B:61:0x042c, B:113:0x03ab, B:114:0x03ae, B:115:0x03fb, B:116:0x040c, B:117:0x03b1, B:16:0x0445, B:118:0x03b8, B:119:0x03bf, B:120:0x03c6, B:121:0x03cd, B:122:0x03d4, B:123:0x03db, B:124:0x03e1, B:125:0x03f4, B:126:0x03f5, B:246:0x0410, B:247:0x0413, B:241:0x037b, B:136:0x039d, B:138:0x03a1, B:133:0x0397, B:289:0x0414, B:290:0x041d, B:14:0x0439), top: B:10:0x0060 }] */
            /* JADX WARN: Removed duplicated region for block: B:126:0x03f5 A[Catch: gl -> 0x043d, TryCatch #17 {gl -> 0x043d, blocks: (B:60:0x0427, B:61:0x042c, B:113:0x03ab, B:114:0x03ae, B:115:0x03fb, B:116:0x040c, B:117:0x03b1, B:16:0x0445, B:118:0x03b8, B:119:0x03bf, B:120:0x03c6, B:121:0x03cd, B:122:0x03d4, B:123:0x03db, B:124:0x03e1, B:125:0x03f4, B:126:0x03f5, B:246:0x0410, B:247:0x0413, B:241:0x037b, B:136:0x039d, B:138:0x03a1, B:133:0x0397, B:289:0x0414, B:290:0x041d, B:14:0x0439), top: B:10:0x0060 }] */
            /* JADX WARN: Removed duplicated region for block: B:136:0x039d A[Catch: gl -> 0x043d, TryCatch #17 {gl -> 0x043d, blocks: (B:60:0x0427, B:61:0x042c, B:113:0x03ab, B:114:0x03ae, B:115:0x03fb, B:116:0x040c, B:117:0x03b1, B:16:0x0445, B:118:0x03b8, B:119:0x03bf, B:120:0x03c6, B:121:0x03cd, B:122:0x03d4, B:123:0x03db, B:124:0x03e1, B:125:0x03f4, B:126:0x03f5, B:246:0x0410, B:247:0x0413, B:241:0x037b, B:136:0x039d, B:138:0x03a1, B:133:0x0397, B:289:0x0414, B:290:0x041d, B:14:0x0439), top: B:10:0x0060 }] */
            /* JADX WARN: Removed duplicated region for block: B:19:0x044c  */
            /* JADX WARN: Removed duplicated region for block: B:211:0x032c A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:219:? A[Catch: all -> 0x040d, SYNTHETIC, TryCatch #8 {all -> 0x040d, blocks: (B:171:0x0298, B:173:0x02bf, B:175:0x02c5, B:177:0x02cb, B:179:0x02d8, B:181:0x02e0, B:196:0x0304, B:192:0x0357, B:200:0x030a, B:212:0x032c, B:218:0x0335, B:217:0x0332, B:227:0x0336, B:229:0x0340, B:230:0x0347, B:194:0x035e, B:236:0x036b, B:237:0x0374, B:131:0x038a), top: B:128:0x0221, inners: #7, #12 }] */
            /* JADX WARN: Removed duplicated region for block: B:21:0x0472  */
            /* JADX WARN: Removed duplicated region for block: B:246:0x0410 A[Catch: gl -> 0x043d, DONT_GENERATE, TryCatch #17 {gl -> 0x043d, blocks: (B:60:0x0427, B:61:0x042c, B:113:0x03ab, B:114:0x03ae, B:115:0x03fb, B:116:0x040c, B:117:0x03b1, B:16:0x0445, B:118:0x03b8, B:119:0x03bf, B:120:0x03c6, B:121:0x03cd, B:122:0x03d4, B:123:0x03db, B:124:0x03e1, B:125:0x03f4, B:126:0x03f5, B:246:0x0410, B:247:0x0413, B:241:0x037b, B:136:0x039d, B:138:0x03a1, B:133:0x0397, B:289:0x0414, B:290:0x041d, B:14:0x0439), top: B:10:0x0060 }] */
            @Override // defpackage.algk
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object apply(java.lang.Object r28) {
                /*
                    Method dump skipped, instructions count: 1364
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.yxt.apply(java.lang.Object):java.lang.Object");
            }
        }, this.j).h(new yts(18), this.k);
    }

    @Override // defpackage.yxn
    public final akul b(yxl yxlVar) {
        MessageCoreData messageCoreData = yxlVar.a;
        d.s(messageCoreData.cQ());
        return aktp.ai(new yxs(this, messageCoreData, 2), this.i).h(new yxu(this, yxlVar, messageCoreData, 0), this.j).h(new yts(19), this.k);
    }

    public final boolean d(MessageCoreData messageCoreData) {
        messageCoreData.bO(tqu.TELEPHONY_UNSPECIFIED);
        sya syaVar = new sya();
        syaVar.N(tqu.TELEPHONY_UNSPECIFIED);
        syaVar.aj("updateXmsTransport");
        if (this.n.a()) {
            syaVar.ag();
        }
        boolean O = ((rwd) this.m.b()).O(messageCoreData.z(), messageCoreData.B(), syaVar);
        if (!O) {
            xyo e = a.e();
            e.H("Unable to update XmsTransport when trying to send the message via Telephony");
            e.z("messageId", messageCoreData.B());
            e.q();
        }
        return O;
    }
}
