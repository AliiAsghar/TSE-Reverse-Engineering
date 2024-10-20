package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.Optional;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class mqf extends arpw implements arqv {
    int a;
    final /* synthetic */ mqi b;
    final /* synthetic */ alog c;
    final /* synthetic */ alog d;
    final /* synthetic */ Optional e;
    final /* synthetic */ boolean f;
    final /* synthetic */ Integer g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mqf(mqi mqiVar, alog alogVar, alog alogVar2, Optional optional, boolean z, Integer num, arpe arpeVar) {
        super(2, arpeVar);
        this.b = mqiVar;
        this.c = alogVar;
        this.d = alogVar2;
        this.e = optional;
        this.f = z;
        this.g = num;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((mqf) c((arwe) obj, (arpe) obj2)).b(arnb.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v22, types: [ahqr] */
    /* JADX WARN: Type inference failed for: r1v3, types: [ahqr] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v2, types: [ashu] */
    /* JADX WARN: Type inference failed for: r2v20, types: [java.lang.Throwable, ashu] */
    /* JADX WARN: Type inference failed for: r2v26, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r2v31 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v7, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r4v8 */
    @Override // defpackage.arpq
    public final Object b(Object obj) {
        Object b;
        String str;
        ahqq ahqqVar;
        ?? r2;
        akrh akrhVar;
        Throwable th;
        List B;
        String str2;
        akrh akrhVar2;
        ahqq ahqqVar2;
        agmq agmqVar;
        String str3;
        ArrayList arrayList;
        akrh akrhVar3;
        ahqq ahqqVar3;
        alpt alptVar;
        ArrayList arrayList2;
        Throwable th2;
        String str4 = "ConversationSearcher#findAllConversationPartialMatchInternal";
        arpl arplVar = arpl.a;
        int i = this.a;
        aqil.P(obj);
        if (i != 0) {
            b = obj;
        } else {
            mqi mqiVar = this.b;
            this.a = 1;
            b = mqiVar.b(this);
            if (b == arplVar) {
                return arplVar;
            }
        }
        int intValue = ((Number) b).intValue();
        mqi mqiVar2 = this.b;
        alog alogVar = this.c;
        alog alogVar2 = this.d;
        Optional optional = this.e;
        boolean z = this.f;
        Integer num = this.g;
        if (alogVar.isEmpty() && alogVar2.isEmpty() && !optional.isPresent()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        ahqq d = ((ahqr) mqiVar2.a.b()).d();
        d.getClass();
        try {
            akrh e = aktp.e("ConversationSearcher#findAllConversationPartialMatchInternal");
            try {
                ArrayList arrayList3 = new ArrayList();
                if (z) {
                    try {
                        B = aqjn.B(1, 2);
                    } catch (Throwable th3) {
                        th = th3;
                        str = "ConversationSearcher#findAllConversationPartialMatchInternal";
                        akrhVar = e;
                        ahqqVar = d;
                        r2 = 0;
                        try {
                            throw th;
                        } catch (Throwable th4) {
                            try {
                                armd.i(akrhVar, th);
                                throw th4;
                            } catch (Throwable th5) {
                                th = th5;
                                ((ahqr) mqiVar2.a.b()).f(ahqqVar, new ahka(str), r2, ahqp.SUCCESS);
                                throw th;
                            }
                        }
                    }
                } else {
                    B = aqjn.y(0);
                }
                int i2 = 14;
                if (!((okf) mqiVar2.b.b()).a()) {
                    str3 = "ConversationSearcher#findAllConversationPartialMatchInternal";
                    arrayList = arrayList3;
                    akrhVar3 = e;
                    ahqqVar3 = d;
                    r2 = 0;
                    r2 = 0;
                    r2 = 0;
                    try {
                        mqv a = mqx.a();
                        a.w("findAllConversationPartialMatchInternal");
                        a.c(new ivj(B, alogVar, 15, r2));
                        a.d(new atkn((agmh) mqx.b.b));
                        a.q();
                        agmq n = a.b().n();
                        try {
                            mqt mqtVar = (mqt) n;
                            while (mqtVar.moveToNext()) {
                                if (num != null) {
                                    try {
                                        int size = arrayList.size();
                                        num.intValue();
                                        if (size > 0) {
                                            break;
                                        }
                                    } catch (Throwable th6) {
                                        th2 = th6;
                                        str = str3;
                                        akrhVar = akrhVar3;
                                        ahqqVar = ahqqVar3;
                                        try {
                                            throw th2;
                                        } catch (Throwable th7) {
                                            try {
                                                armd.i(n, th2);
                                                throw th7;
                                            } catch (Throwable th8) {
                                                th = th8;
                                                th = th;
                                                r2 = r2;
                                                throw th;
                                            }
                                        }
                                    }
                                }
                                alpt alptVar2 = (alpt) Stream.CC.of((Object[]) new String[][]{mqtVar.h(), mqtVar.i(), mqtVar.j()}).flatMap(new moh(mqc.a, 10)).filter(new isg(mqd.b, i2)).collect(alls.b);
                                alptVar2.getClass();
                                int i3 = i2;
                                if (mqiVar2.d(alptVar2, mqtVar.f(), alogVar, alogVar2, optional, intValue)) {
                                    arrayList.add(mqtVar.d());
                                }
                                i2 = i3;
                            }
                            armd.i(n, null);
                        } catch (Throwable th9) {
                            str = str3;
                            akrhVar = akrhVar3;
                            ahqqVar = ahqqVar3;
                            th2 = th9;
                        }
                    } catch (Throwable th10) {
                        th = th10;
                        str = str3;
                        akrhVar = akrhVar3;
                        ahqqVar = ahqqVar3;
                    }
                } else {
                    try {
                        mqn a2 = mqp.a();
                        a2.w("findAllConversationPartialMatchInternal");
                        ?? r4 = null;
                        try {
                            try {
                                a2.c(new ivj(B, alogVar, i2, r4));
                                a2.d(new atkn((agmh) mqp.b.b));
                                a2.q();
                                agmq n2 = a2.b().n();
                                try {
                                    mqt mqtVar2 = (mqt) n2;
                                    str4 = "ConversationSearcher#findAllConversationPartialMatchInternal";
                                    while (mqtVar2.moveToNext()) {
                                        if (num != null) {
                                            int size2 = arrayList3.size();
                                            num.intValue();
                                            if (size2 > 0) {
                                                break;
                                            }
                                        }
                                        try {
                                            alptVar = (alpt) Stream.CC.of((Object[]) new String[][]{mqtVar2.h(), mqtVar2.i(), mqtVar2.j()}).flatMap(new moh(mqb.a, 9)).filter(new isg(lgk.t, 13)).collect(alls.b);
                                            alptVar.getClass();
                                            arrayList2 = arrayList3;
                                            akrhVar2 = e;
                                            str2 = str4;
                                            agmqVar = n2;
                                            str4 = null;
                                            ahqqVar2 = d;
                                        } catch (Throwable th11) {
                                            th = th11;
                                            str2 = str4;
                                            akrhVar2 = e;
                                            agmqVar = n2;
                                            ahqqVar2 = d;
                                            str4 = null;
                                        }
                                        try {
                                            if (mqiVar2.d(alptVar, mqtVar2.f(), alogVar, alogVar2, optional, intValue)) {
                                                arrayList2.add(mqtVar2.d());
                                            }
                                            n2 = agmqVar;
                                            arrayList3 = arrayList2;
                                            e = akrhVar2;
                                            d = ahqqVar2;
                                            r4 = null;
                                            str4 = str2;
                                        } catch (Throwable th12) {
                                            th = th12;
                                            Throwable th13 = th;
                                            try {
                                                throw th13;
                                            } catch (Throwable th14) {
                                                armd.i(agmqVar, th13);
                                                throw th14;
                                            }
                                        }
                                    }
                                    str3 = str4;
                                    Throwable th15 = r4;
                                    arrayList = arrayList3;
                                    akrhVar3 = e;
                                    ahqqVar3 = d;
                                    armd.i(n2, th15);
                                    r2 = th15;
                                } catch (Throwable th16) {
                                    th = th16;
                                    str2 = str4;
                                    str4 = r4;
                                    akrhVar2 = e;
                                    agmqVar = n2;
                                    ahqqVar2 = d;
                                }
                            } catch (Throwable th17) {
                                th = th17;
                                str2 = "ConversationSearcher#findAllConversationPartialMatchInternal";
                                str4 = null;
                                akrhVar2 = e;
                                ahqqVar2 = d;
                                th = th;
                                str = str2;
                                akrhVar = akrhVar2;
                                ahqqVar = ahqqVar2;
                                r2 = str4;
                                throw th;
                            }
                        } catch (Throwable th18) {
                            th = th18;
                            th = th;
                            str = str2;
                            akrhVar = akrhVar2;
                            ahqqVar = ahqqVar2;
                            r2 = str4;
                            throw th;
                        }
                    } catch (Throwable th19) {
                        th = th19;
                        str2 = "ConversationSearcher#findAllConversationPartialMatchInternal";
                        akrhVar2 = e;
                        ahqqVar2 = d;
                        str4 = null;
                    }
                }
                alog aZ = alzz.aZ(arrayList);
                try {
                    armd.i(akrhVar3, r2);
                    ((ahqr) mqiVar2.a.b()).f(ahqqVar3, new ahka(str3), r2, ahqp.SUCCESS);
                    ArrayList arrayList4 = new ArrayList(aqjn.J(aZ, 10));
                    Iterator it = aZ.iterator();
                    while (it.hasNext()) {
                        arrayList4.add(new BugleConversationId((ConversationIdType) it.next()));
                    }
                    return alzz.aZ(arrayList4);
                } catch (Throwable th20) {
                    th = th20;
                    str = str3;
                    ahqqVar = ahqqVar3;
                    ((ahqr) mqiVar2.a.b()).f(ahqqVar, new ahka(str), r2, ahqp.SUCCESS);
                    throw th;
                }
            } catch (Throwable th21) {
                th = th21;
                str = "ConversationSearcher#findAllConversationPartialMatchInternal";
                akrhVar = e;
                ahqqVar = d;
                r2 = 0;
            }
        } catch (Throwable th22) {
            th = th22;
            str = "ConversationSearcher#findAllConversationPartialMatchInternal";
            ahqqVar = d;
            r2 = 0;
        }
    }

    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        return new mqf(this.b, this.c, this.d, this.e, this.f, this.g, arpeVar);
    }
}
