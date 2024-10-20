package defpackage;

import android.content.Intent;
import android.database.CharArrayBuffer;
import android.graphics.Typeface;
import android.support.v7.widget.RecyclerView;
import android.util.Pair;
import android.widget.TextView;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.database.upgrade.OnDeviceDatabaseUpgradeHandler;
import j$.util.Optional;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.Serializable;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qq implements Runnable {
    final /* synthetic */ int a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ qq(Object obj, int i, Object obj2, int i2) {
        this.d = i2;
        this.c = obj;
        this.a = i;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v64, types: [arwe, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v66, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r1v23, types: [fdq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v47, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v59, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v64, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v10, types: [rv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Object, java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r2v17, types: [etv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v29, types: [java.lang.Object, ggj] */
    /* JADX WARN: Type inference failed for: r2v38, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    @Override // java.lang.Runnable
    public final void run() {
        Integer num;
        int i = 3;
        Object obj = null;
        int i2 = -1;
        switch (this.d) {
            case 0:
                RecyclerView recyclerView = ((qx) this.c).m;
                if (recyclerView != null && recyclerView.p) {
                    qv qvVar = (qv) this.b;
                    if (!qvVar.n && qvVar.h.a() != -1) {
                        nt ntVar = ((qx) this.c).m.C;
                        if (ntVar == null || !ntVar.p()) {
                            qx qxVar = (qx) this.c;
                            int size = qxVar.l.size();
                            for (int i3 = 0; i3 < size; i3++) {
                                if (((qv) qxVar.l.get(i3)).o) {
                                }
                            }
                            ((qx) this.c).j.h(((qv) this.b).h, this.a);
                            return;
                        }
                        ((qx) this.c).m.post(this);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                lg.f((TextView) this.c, (Typeface) this.b, this.a);
                return;
            case 2:
                int i4 = this.a;
                sb sbVar = (sb) this.b;
                String str = (String) sbVar.a.get(Integer.valueOf(i4));
                if (str != null) {
                    fvq fvqVar = (fvq) sbVar.d.get(str);
                    if (fvqVar != null) {
                        obj = fvqVar.a;
                    }
                    Object obj2 = ((efu) this.c).a;
                    if (obj != null) {
                        ?? r2 = fvqVar.a;
                        if (sbVar.c.remove(str)) {
                            r2.a(obj2);
                            return;
                        }
                        return;
                    }
                    sbVar.f.remove(str);
                    sbVar.e.put(str, obj2);
                    return;
                }
                return;
            case 3:
                ((sb) this.c).e(this.a, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", (Serializable) this.b));
                return;
            case 4:
                Iterator it = ((CopyOnWriteArraySet) this.c).iterator();
                while (it.hasNext()) {
                    etx etxVar = (etx) it.next();
                    if (!etxVar.c) {
                        int i5 = this.a;
                        if (i5 != -1) {
                            etxVar.d.c(i5);
                        }
                        ?? r22 = this.b;
                        etxVar.b = true;
                        r22.a(etxVar.a);
                    }
                }
                return;
            case 5:
                Pair pair = (Pair) this.b;
                ((fau) this.c).a.j.d(((Integer) pair.first).intValue(), (fgv) pair.second, this.a);
                return;
            case 6:
                this.c.d(0, (fgv) ((apuv) this.b).b, this.a);
                return;
            case 7:
                ((gge) this.b).b.a(this.a, this.c);
                return;
            case 8:
                this.b.a(this.a, this.c);
                return;
            case 9:
                Object obj3 = this.b;
                afnr afnrVar = (afnr) this.c;
                ioy ioyVar = (ioy) obj3;
                amoq a = ioyVar.a(afnrVar);
                if (afnrVar.e != afnn.a && (num = afnrVar.c) != null) {
                    i2 = num.intValue();
                }
                ioyVar.a.j(this.a, a, i2, null).k(qiu.b(), andi.a);
                return;
            case 10:
                laj lajVar = (laj) this.b;
                if (((mho) lajVar.h.b()).al()) {
                    maq maqVar = (maq) lajVar.i.b();
                    amfq amfqVar = (amfq) amfr.a.createBuilder();
                    amfp amfpVar = amfp.BUGLE_PERFORMANCE;
                    if (!amfqVar.b.isMutable()) {
                        amfqVar.u();
                    }
                    amfr amfrVar = (amfr) amfqVar.b;
                    amfrVar.i = amfpVar.dg;
                    amfrVar.b |= 1;
                    aozy createBuilder = amhn.a.createBuilder();
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    Object obj4 = this.c;
                    amhn amhnVar = (amhn) createBuilder.b;
                    amhnVar.c = 5;
                    amhnVar.b |= 1;
                    if (true == ((uye) obj4).a()) {
                        i = 2;
                    }
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    apag apagVar = createBuilder.b;
                    amhn amhnVar2 = (amhn) apagVar;
                    amhnVar2.d = i - 1;
                    amhnVar2.b |= 2;
                    if (!apagVar.isMutable()) {
                        createBuilder.u();
                    }
                    int i6 = this.a;
                    amhn amhnVar3 = (amhn) createBuilder.b;
                    amhnVar3.b |= 8;
                    amhnVar3.e = i6;
                    if (!amfqVar.b.isMutable()) {
                        amfqVar.u();
                    }
                    amfr amfrVar2 = (amfr) amfqVar.b;
                    amhn amhnVar4 = (amhn) createBuilder.s();
                    amhnVar4.getClass();
                    amfrVar2.m = amhnVar4;
                    amfrVar2.b |= 16;
                    maqVar.j(amfqVar);
                    return;
                }
                laj.e.l("Clearcut loggings are disabled.");
                return;
            case 11:
                ((mic) this.b).bn(this.c, this.a, -1, (amgl) amgu.a.createBuilder());
                return;
            case 12:
                mic micVar = (mic) this.c;
                Optional of = Optional.of(micVar.K.n());
                Optional of2 = Optional.of(amgn.UNKNOWN_FORMAT_TYPE);
                mgo mgoVar = (mgo) this.b;
                micVar.bv(mgoVar.a, this.a, -2, 0, -1, 18, null, 1, 0, of, of2, Optional.of(mgoVar.b), Optional.empty());
                return;
            case 13:
                ((qxr) this.b).p(this.a, (ConversationIdType) this.c);
                return;
            case 14:
                int i7 = this.a;
                Object obj5 = this.c;
                lrf lrfVar = (lrf) this.b;
                qjh.l(lrfVar.a, null, new psl(lrfVar, (ConversationIdType) obj5, i7, (arpe) null, 3), 3);
                return;
            case 15:
                ((OnDeviceDatabaseUpgradeHandler) this.b).m198x143a30bd(this.c, this.a);
                return;
            case 16:
                ((OnDeviceDatabaseUpgradeHandler) this.b).m199xccc6f11c(this.a, this.c);
                return;
            case 17:
                ((tzj) ((tzc) this.c).d.b()).a((ConversationIdType) this.b, this.a);
                return;
            case 18:
                ((ueb) this.c).B(this.a, (CharArrayBuffer) this.b);
                return;
            case 19:
                ((ConcurrentHashMap) this.b).remove(this.c, Integer.valueOf(this.a));
                return;
            default:
                aozy createBuilder2 = amvz.a.createBuilder();
                if (!createBuilder2.b.isMutable()) {
                    createBuilder2.u();
                }
                int i8 = this.a;
                amvz amvzVar = (amvz) createBuilder2.b;
                Object obj6 = this.b;
                Object obj7 = this.c;
                amvzVar.c = i8 - 1;
                amvzVar.b |= 1;
                ConversationIdType conversationIdType = (ConversationIdType) obj6;
                if (!conversationIdType.b()) {
                    long a2 = ((lzz) ((wpp) obj7).c.b()).a(conversationIdType);
                    if (!createBuilder2.b.isMutable()) {
                        createBuilder2.u();
                    }
                    amvz amvzVar2 = (amvz) createBuilder2.b;
                    amvzVar2.b |= 4;
                    amvzVar2.e = a2;
                }
                maq maqVar2 = (maq) ((wpp) obj7).b.b();
                amfq amfqVar2 = (amfq) amfr.a.createBuilder();
                amfp amfpVar2 = amfp.LIGHTER_EVENT;
                if (!amfqVar2.b.isMutable()) {
                    amfqVar2.u();
                }
                amfr amfrVar3 = (amfr) amfqVar2.b;
                amfrVar3.i = amfpVar2.dg;
                amfrVar3.b |= 1;
                if (!amfqVar2.b.isMutable()) {
                    amfqVar2.u();
                }
                amfr amfrVar4 = (amfr) amfqVar2.b;
                amvz amvzVar3 = (amvz) createBuilder2.s();
                amvzVar3.getClass();
                amfrVar4.aW = amvzVar3;
                amfrVar4.f |= 16384;
                maqVar2.j(amfqVar2);
                return;
        }
    }

    public /* synthetic */ qq(Object obj, int i, Object obj2, int i2, byte[] bArr) {
        this.d = i2;
        this.b = obj;
        this.a = i;
        this.c = obj2;
    }

    public qq(Object obj, Object obj2, int i, int i2) {
        this.d = i2;
        this.c = obj;
        this.b = obj2;
        this.a = i;
    }

    public /* synthetic */ qq(Object obj, Object obj2, int i, int i2, byte[] bArr) {
        this.d = i2;
        this.c = obj;
        this.b = obj2;
        this.a = i;
    }

    public /* synthetic */ qq(Object obj, Object obj2, int i, int i2, char[] cArr) {
        this.d = i2;
        this.b = obj;
        this.c = obj2;
        this.a = i;
    }
}
