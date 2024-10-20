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
final class mqe extends arpw implements arqv {
    int a;
    final /* synthetic */ mqi b;
    final /* synthetic */ alog c;
    final /* synthetic */ Optional d;
    final /* synthetic */ boolean e;
    final /* synthetic */ boolean f;
    final /* synthetic */ Integer g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mqe(mqi mqiVar, alog alogVar, Optional optional, boolean z, boolean z2, Integer num, arpe arpeVar) {
        super(2, arpeVar);
        this.b = mqiVar;
        this.c = alogVar;
        this.d = optional;
        this.e = z;
        this.f = z2;
        this.g = num;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((mqe) c((arwe) obj, (arpe) obj2)).b(arnb.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v26, types: [java.lang.Throwable, ashu] */
    /* JADX WARN: Type inference failed for: r1v28, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r1v3, types: [ashu] */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r1v32 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r2v21, types: [ahqr] */
    /* JADX WARN: Type inference failed for: r2v3, types: [ahqr] */
    @Override // defpackage.arpq
    public final Object b(Object obj) {
        Object b;
        String str;
        ahqq ahqqVar;
        ?? r1;
        akrh akrhVar;
        Throwable th;
        List B;
        String str2;
        akrh akrhVar2;
        ahqq ahqqVar2;
        String str3;
        ArrayList arrayList;
        akrh akrhVar3;
        ahqq ahqqVar3;
        boolean z;
        Throwable th2;
        boolean z2;
        mqe mqeVar = this;
        String str4 = "ConversationSearcher#findAllConversationExactMatchSyncInternal";
        arpl arplVar = arpl.a;
        int i = mqeVar.a;
        aqil.P(obj);
        if (i != 0) {
            b = obj;
        } else {
            mqi mqiVar = mqeVar.b;
            mqeVar.a = 1;
            b = mqiVar.b(mqeVar);
            if (b == arplVar) {
                return arplVar;
            }
        }
        int intValue = ((Number) b).intValue();
        mqi mqiVar2 = mqeVar.b;
        alog alogVar = mqeVar.c;
        Optional optional = mqeVar.d;
        boolean z3 = mqeVar.e;
        boolean z4 = mqeVar.f;
        Integer num = mqeVar.g;
        if (!alogVar.isEmpty()) {
            ahqq d = ((ahqr) mqiVar2.a.b()).d();
            d.getClass();
            try {
                akrh e = aktp.e("ConversationSearcher#findAllConversationExactMatchSyncInternal");
                try {
                    ArrayList arrayList2 = new ArrayList();
                    if (z3) {
                        try {
                            B = aqjn.B(1, 2);
                        } catch (Throwable th3) {
                            th = th3;
                            str = "ConversationSearcher#findAllConversationExactMatchSyncInternal";
                            akrhVar = e;
                            ahqqVar = d;
                            r1 = 0;
                            try {
                                throw th;
                            } catch (Throwable th4) {
                                try {
                                    armd.i(akrhVar, th);
                                    throw th4;
                                } catch (Throwable th5) {
                                    th = th5;
                                    ((ahqr) mqiVar2.a.b()).f(ahqqVar, new ahka(str), r1, ahqp.SUCCESS);
                                    throw th;
                                }
                            }
                        }
                    } else {
                        B = aqjn.y(0);
                    }
                    if (!((okf) mqiVar2.b.b()).a()) {
                        str3 = "ConversationSearcher#findAllConversationExactMatchSyncInternal";
                        arrayList = arrayList2;
                        akrhVar3 = e;
                        ahqqVar3 = d;
                        r1 = 0;
                        r1 = 0;
                        r1 = 0;
                        try {
                            mqv a = mqx.a();
                            a.w("findAllConversationExactMatchSyncInternal");
                            a.c(new ivj(B, alogVar, 17, r1));
                            lxe lxeVar = mqx.b;
                            a.d(new atkn((agmh) lxeVar.a), new atkn((agmh) lxeVar.b));
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
                                            akrhVar = akrhVar3;
                                            str = str3;
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
                                                    r1 = r1;
                                                    throw th;
                                                }
                                            }
                                        }
                                    }
                                    alpt alptVar = (alpt) Stream.CC.of((Object[]) new String[][]{mqtVar.h(), mqtVar.i(), mqtVar.j()}).flatMap(new moh(mqa.a, 8)).filter(new isg(lgk.s, 9)).collect(alls.b);
                                    int length = mqtVar.g().length;
                                    alptVar.getClass();
                                    String f = mqtVar.f();
                                    int c = mqtVar.c();
                                    if (mqtVar.e() == tqh.NAME_IS_AUTOMATIC) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    if (mqiVar2.c(length, alptVar, f, c, z2, alogVar, optional, intValue, z4)) {
                                        arrayList.add(mqtVar.d());
                                    }
                                }
                                armd.i(n, null);
                            } catch (Throwable th9) {
                                akrhVar = akrhVar3;
                                str = str3;
                                ahqqVar = ahqqVar3;
                                th2 = th9;
                            }
                        } catch (Throwable th10) {
                            th = th10;
                            akrhVar = akrhVar3;
                            str = str3;
                            ahqqVar = ahqqVar3;
                        }
                    } else {
                        try {
                            mqn a2 = mqp.a();
                            a2.w("findAllConversationExactMatchSyncInternal");
                            try {
                                a2.c(new ivj(B, alogVar, 16, null));
                                atkn[] atknVarArr = new atkn[2];
                                lxe lxeVar2 = mqp.b;
                                try {
                                    atknVarArr[0] = new atkn((agmh) lxeVar2.a);
                                    atknVarArr[1] = new atkn((agmh) lxeVar2.b);
                                    a2.d(atknVarArr);
                                    a2.q();
                                    agmq n2 = a2.b().n();
                                    try {
                                        mqt mqtVar2 = (mqt) n2;
                                        while (mqtVar2.moveToNext()) {
                                            if (num != null) {
                                                int size2 = arrayList2.size();
                                                num.intValue();
                                                if (size2 > 0) {
                                                    break;
                                                }
                                            }
                                            alpt alptVar2 = (alpt) Stream.CC.of((Object[]) new String[][]{mqtVar2.h(), mqtVar2.i(), mqtVar2.j()}).flatMap(new moh(mpz.a, 11)).filter(new isg(lgk.r, 15)).collect(alls.b);
                                            int length2 = mqtVar2.g().length;
                                            alptVar2.getClass();
                                            String f2 = mqtVar2.f();
                                            int c2 = mqtVar2.c();
                                            if (mqtVar2.e() == tqh.NAME_IS_AUTOMATIC) {
                                                z = true;
                                            } else {
                                                z = false;
                                            }
                                            str2 = str4;
                                            ArrayList arrayList3 = arrayList2;
                                            akrhVar2 = e;
                                            mqeVar = null;
                                            ahqqVar2 = d;
                                            Integer num2 = num;
                                            boolean z5 = z4;
                                            Optional optional2 = optional;
                                            try {
                                                if (mqiVar2.c(length2, alptVar2, f2, c2, z, alogVar, optional, intValue, z5)) {
                                                    arrayList3.add(mqtVar2.d());
                                                }
                                                arrayList2 = arrayList3;
                                                e = akrhVar2;
                                                num = num2;
                                                str4 = str2;
                                                d = ahqqVar2;
                                                z4 = z5;
                                                optional = optional2;
                                            } catch (Throwable th11) {
                                                th = th11;
                                                Throwable th12 = th;
                                                try {
                                                    throw th12;
                                                } catch (Throwable th13) {
                                                    armd.i(n2, th12);
                                                    throw th13;
                                                }
                                            }
                                        }
                                        str3 = str4;
                                        arrayList = arrayList2;
                                        akrhVar3 = e;
                                        ahqqVar3 = d;
                                        r1 = 0;
                                        armd.i(n2, null);
                                    } catch (Throwable th14) {
                                        th = th14;
                                        str2 = str4;
                                        akrhVar2 = e;
                                        ahqqVar2 = d;
                                        mqeVar = null;
                                    }
                                } catch (Throwable th15) {
                                    th = th15;
                                    th = th;
                                    akrhVar = akrhVar2;
                                    str = str2;
                                    ahqqVar = ahqqVar2;
                                    r1 = mqeVar;
                                    throw th;
                                }
                            } catch (Throwable th16) {
                                th = th16;
                                str2 = "ConversationSearcher#findAllConversationExactMatchSyncInternal";
                                mqeVar = null;
                                akrhVar2 = e;
                                ahqqVar2 = d;
                            }
                        } catch (Throwable th17) {
                            th = th17;
                            str2 = "ConversationSearcher#findAllConversationExactMatchSyncInternal";
                            akrhVar2 = e;
                            ahqqVar2 = d;
                            mqeVar = null;
                        }
                    }
                    alog aZ = alzz.aZ(arrayList);
                    try {
                        armd.i(akrhVar3, r1);
                        ((ahqr) mqiVar2.a.b()).f(ahqqVar3, new ahka(str3), r1, ahqp.SUCCESS);
                        ArrayList arrayList4 = new ArrayList(aqjn.J(aZ, 10));
                        Iterator it = aZ.iterator();
                        while (it.hasNext()) {
                            arrayList4.add(new BugleConversationId((ConversationIdType) it.next()));
                        }
                        return alzz.aZ(arrayList4);
                    } catch (Throwable th18) {
                        th = th18;
                        str = str3;
                        ahqqVar = ahqqVar3;
                        ((ahqr) mqiVar2.a.b()).f(ahqqVar, new ahka(str), r1, ahqp.SUCCESS);
                        throw th;
                    }
                } catch (Throwable th19) {
                    th = th19;
                    str = "ConversationSearcher#findAllConversationExactMatchSyncInternal";
                    akrhVar = e;
                    ahqqVar = d;
                    r1 = 0;
                }
            } catch (Throwable th20) {
                th = th20;
                str = "ConversationSearcher#findAllConversationExactMatchSyncInternal";
                ahqqVar = d;
                r1 = 0;
            }
        } else {
            throw new IllegalArgumentException("Failed requirement.");
        }
    }

    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        return new mqe(this.b, this.c, this.d, this.e, this.f, this.g, arpeVar);
    }
}
