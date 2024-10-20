package defpackage;

import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.data.MessageData;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class wqw implements Consumer {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ wqw(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r0v10, types: [com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r0v56, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    /* JADX WARN: Type inference failed for: r0v58, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v68, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void q(Object obj) {
        switch (this.b) {
            case 0:
                this.a.a(obj);
                return;
            case 1:
                Object obj2 = this.a;
                wpj wpjVar = (wpj) obj;
                obj2.getClass();
                wpjVar.getClass();
                qwe qweVar = ((qvo) obj2).c;
                qweVar.getClass();
                wpjVar.d(qweVar);
                return;
            case 2:
                this.a.a(obj);
                return;
            case 3:
                qgr qgrVar = (qgr) obj;
                aozy aozyVar = (aozy) this.a;
                if (!aozyVar.b.isMutable()) {
                    aozyVar.u();
                }
                qgf qgfVar = (qgf) aozyVar.b;
                qgf qgfVar2 = qgf.a;
                qgrVar.getClass();
                qgfVar.l = qgrVar;
                qgfVar.b |= 512;
                return;
            case 4:
                ((xhc) obj).c(this.a);
                return;
            case 5:
                String str = (String) obj;
                aozy aozyVar2 = (aozy) this.a;
                if (!aozyVar2.b.isMutable()) {
                    aozyVar2.u();
                }
                pua puaVar = (pua) aozyVar2.b;
                pua puaVar2 = pua.a;
                str.getClass();
                puaVar.b |= 2;
                puaVar.d = str;
                return;
            case 6:
                ((aozy) this.a).z((pua) obj);
                return;
            case 7:
                String str2 = (String) obj;
                aozy aozyVar3 = (aozy) this.a;
                if (!aozyVar3.b.isMutable()) {
                    aozyVar3.u();
                }
                pua puaVar3 = (pua) aozyVar3.b;
                pua puaVar4 = pua.a;
                str2.getClass();
                puaVar3.b |= 2;
                puaVar3.d = str2;
                return;
            case 8:
                ((aozy) this.a).z((pua) obj);
                return;
            case 9:
                qfm qfmVar = (qfm) obj;
                aozy aozyVar4 = (aozy) this.a;
                if (!aozyVar4.b.isMutable()) {
                    aozyVar4.u();
                }
                qfj qfjVar = (qfj) aozyVar4.b;
                qfj qfjVar2 = qfj.a;
                qfmVar.getClass();
                qfjVar.d = qfmVar;
                qfjVar.b |= 2;
                return;
            case 10:
                qfm qfmVar2 = (qfm) obj;
                aozy aozyVar5 = (aozy) this.a;
                if (!aozyVar5.b.isMutable()) {
                    aozyVar5.u();
                }
                qfa qfaVar = (qfa) aozyVar5.b;
                qfa qfaVar2 = qfa.a;
                qfmVar2.getClass();
                qfaVar.d = qfmVar2;
                qfaVar.b |= 2;
                return;
            case 11:
                String str3 = (String) obj;
                alwo alwoVar = xew.a;
                aozy aozyVar6 = (aozy) this.a;
                if (!aozyVar6.b.isMutable()) {
                    aozyVar6.u();
                }
                qey qeyVar = (qey) aozyVar6.b;
                apap apapVar = qey.a;
                str3.getClass();
                qeyVar.d |= 4;
                qeyVar.k = str3;
                boolean isEmpty = TextUtils.isEmpty(str3);
                if (!aozyVar6.b.isMutable()) {
                    aozyVar6.u();
                }
                qey qeyVar2 = (qey) aozyVar6.b;
                qeyVar2.d |= 2;
                qeyVar2.j = isEmpty;
                return;
            case 12:
                anjg anjgVar = (anjg) obj;
                alwo alwoVar2 = xew.a;
                String str4 = anjgVar.b;
                aozy aozyVar7 = (aozy) this.a;
                if (!aozyVar7.b.isMutable()) {
                    aozyVar7.u();
                }
                qey qeyVar3 = (qey) aozyVar7.b;
                apap apapVar2 = qey.a;
                qeyVar3.d |= 16;
                qeyVar3.m = str4;
                boolean F = d.F(anjgVar, anjg.a);
                if (!aozyVar7.b.isMutable()) {
                    aozyVar7.u();
                }
                qey qeyVar4 = (qey) aozyVar7.b;
                qeyVar4.d |= 8;
                qeyVar4.l = F;
                return;
            case 13:
                qfm qfmVar3 = (qfm) obj;
                aozy aozyVar8 = (aozy) this.a;
                if (!aozyVar8.b.isMutable()) {
                    aozyVar8.u();
                }
                qff qffVar = (qff) aozyVar8.b;
                qff qffVar2 = qff.a;
                qfmVar3.getClass();
                qffVar.e = qfmVar3;
                qffVar.b |= 4;
                return;
            case 14:
                qei qeiVar = (qei) obj;
                aozy aozyVar9 = (aozy) this.a;
                if (!aozyVar9.b.isMutable()) {
                    aozyVar9.u();
                }
                qfo qfoVar = (qfo) aozyVar9.b;
                apap apapVar3 = qfo.a;
                qeiVar.getClass();
                qfoVar.f = qeiVar;
                qfoVar.c |= 16;
                return;
            case 15:
                aozb aozbVar = (aozb) obj;
                aozy aozyVar10 = (aozy) this.a;
                if (!aozyVar10.b.isMutable()) {
                    aozyVar10.u();
                }
                aqfn aqfnVar = (aqfn) aozyVar10.b;
                aqfn aqfnVar2 = aqfn.a;
                aozbVar.getClass();
                aqfnVar.e = aozbVar;
                return;
            case 16:
                alvi alviVar = xgw.a;
                xbz xbzVar = (xbz) ((armf) obj).b();
                this.a.aE();
                xbzVar.c();
                return;
            case 17:
                xze xzeVar = xiu.a;
                this.a.add((wyc) ((wyb) obj));
                return;
            case 18:
                vqe vqeVar = (vqe) obj;
                xze xzeVar2 = xja.a;
                if ((vqeVar.b & 2) != 0) {
                    ((MessageData) this.a).p = new rwn(vqeVar.g);
                    return;
                }
                return;
            case 19:
                int intValue = ((Integer) obj).intValue();
                aozy aozyVar11 = (aozy) this.a;
                if (!aozyVar11.b.isMutable()) {
                    aozyVar11.u();
                }
                amvb amvbVar = (amvb) aozyVar11.b;
                amvb amvbVar2 = amvb.a;
                amvbVar.b |= 32;
                amvbVar.h = intValue;
                return;
            default:
                this.a.by(((Integer) obj).intValue());
                return;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.b) {
            case 0:
                return Consumer$CC.$default$andThen(this, consumer);
            case 1:
                return Consumer$CC.$default$andThen(this, consumer);
            case 2:
                return Consumer$CC.$default$andThen(this, consumer);
            case 3:
                return Consumer$CC.$default$andThen(this, consumer);
            case 4:
                return Consumer$CC.$default$andThen(this, consumer);
            case 5:
                return Consumer$CC.$default$andThen(this, consumer);
            case 6:
                return Consumer$CC.$default$andThen(this, consumer);
            case 7:
                return Consumer$CC.$default$andThen(this, consumer);
            case 8:
                return Consumer$CC.$default$andThen(this, consumer);
            case 9:
                return Consumer$CC.$default$andThen(this, consumer);
            case 10:
                return Consumer$CC.$default$andThen(this, consumer);
            case 11:
                return Consumer$CC.$default$andThen(this, consumer);
            case 12:
                return Consumer$CC.$default$andThen(this, consumer);
            case 13:
                return Consumer$CC.$default$andThen(this, consumer);
            case 14:
                return Consumer$CC.$default$andThen(this, consumer);
            case 15:
                return Consumer$CC.$default$andThen(this, consumer);
            case 16:
                return Consumer$CC.$default$andThen(this, consumer);
            case 17:
                return Consumer$CC.$default$andThen(this, consumer);
            case 18:
                return Consumer$CC.$default$andThen(this, consumer);
            case 19:
                return Consumer$CC.$default$andThen(this, consumer);
            default:
                return Consumer$CC.$default$andThen(this, consumer);
        }
    }
}
