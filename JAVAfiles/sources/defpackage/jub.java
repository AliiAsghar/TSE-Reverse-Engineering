package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import j$.util.Optional;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jub implements jtt, jhj, agff {
    private final Optional A;
    private final armf B;
    private final armf C;
    private final armf D;
    private final boolean E;
    private final asai F;
    private final armf G;
    private final armf H;
    private final armf I;
    private final armf J;
    private final armf K;
    private final ascd L;
    private agfn M;
    private final asai N;
    private final ascv O;
    private final ascv P;
    private final arqr Q;
    private agfe R;
    private final asai S;
    private final ascv T;
    private final ascv U;
    private final ascv V;
    private final mgu W;
    private final qdq X;
    private final wpp Y;
    public final arwe c;
    public final armf d;
    public final armf e;
    public final armf f;
    public final armf g;
    public final Context h;
    public final jgq i;
    public final ConversationId j;
    public final orj k;
    public final armf l;
    public final armf m;
    public final armf n;
    public final afqa o;
    public final afkq p;
    public ascd q;
    public arwl r;
    public arwl s;
    public AtomicBoolean t;
    public AtomicBoolean u;
    public final jxv v;
    private final aflb x;
    private final armf y;
    private final armf z;
    public static final alvi a = alvi.m("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/inputs/InputsUiAdapterImpl");
    private static final arqr w = jld.q;
    public static final arml b = armd.a(jlc.k);

    /* JADX WARN: Removed duplicated region for block: B:63:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0403  */
    /* JADX WARN: Type inference failed for: r4v25, types: [java.lang.Object, ascd] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public jub(defpackage.arwe r18, defpackage.aflb r19, defpackage.afku r20, defpackage.armf r21, defpackage.armf r22, defpackage.armf r23, j$.util.Optional r24, defpackage.jvs r25, defpackage.jug r26, defpackage.armf r27, defpackage.eog r28, @defpackage.nwv defpackage.armf r29, @defpackage.nie defpackage.armf r30, defpackage.armf r31, defpackage.armf r32, j$.util.Optional r33, defpackage.wpp r34, boolean r35, defpackage.mgu r36, defpackage.armf r37, defpackage.asai r38, defpackage.armf r39, defpackage.armf r40, defpackage.armf r41, android.content.Context r42, defpackage.jxv r43, defpackage.jgq r44, com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId r45, defpackage.orj r46, defpackage.armf r47, defpackage.armf r48, defpackage.armf r49, defpackage.armf r50, defpackage.armf r51, defpackage.qdq r52, defpackage.armf r53, defpackage.armf r54, defpackage.armf r55) {
        /*
            Method dump skipped, instructions count: 1102
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jub.<init>(arwe, aflb, afku, armf, armf, armf, j$.util.Optional, jvs, jug, armf, eog, armf, armf, armf, armf, j$.util.Optional, wpp, boolean, mgu, armf, asai, armf, armf, armf, android.content.Context, jxv, jgq, com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId, orj, armf, armf, armf, armf, armf, qdq, armf, armf, armf):void");
    }

    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object, ascd] */
    private final aenw j(agek agekVar) {
        switch (agekVar.ordinal()) {
            case 0:
                return aenw.c;
            case 1:
            case 2:
            case 5:
            case 8:
                return aenw.d;
            case 3:
            default:
                return null;
            case 4:
                return aenw.e;
            case 6:
                return aenw.f;
            case 7:
                int i = ((afrh) ((aday) this.A.get()).b.c()).h;
                return aenw.b;
        }
    }

    private final aeny k(agfm agfmVar) {
        if (agfmVar instanceof agfj) {
            return aenx.a;
        }
        if (agfmVar instanceof agfi) {
            return aenw.e;
        }
        if (agfmVar instanceof agfk) {
            return j(((agfk) agfmVar).a.a);
        }
        if (agfmVar instanceof agfl) {
            return j(((agfl) agfmVar).b);
        }
        throw new armm();
    }

    @Override // defpackage.jhj
    public final agfn a() {
        return (agfn) this.q.c();
    }

    @Override // defpackage.jhj
    public final void b(jhi jhiVar) {
        if (this.t.get()) {
            alvw d = a.d();
            d.X(alwp.a, "BugleComposeRow2");
            ((alvg) d.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/inputs/InputsUiAdapterImpl", "selectInput", 501, "InputsUiAdapterImpl.kt")).q("Ignoring selectInput as we are still processing a prior input change.");
            return;
        }
        this.t.set(true);
        if (d.F(jhiVar, jhf.b)) {
            alvw g = a.g();
            g.X(alwp.a, "BugleComposeRow2");
            ((alvg) g.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/inputs/InputsUiAdapterImpl", "selectInput", 507, "InputsUiAdapterImpl.kt")).q("AI input selected");
        } else if (d.F(jhiVar, jhf.a)) {
            alvw g2 = a.g();
            g2.X(alwp.a, "BugleComposeRow2");
            ((alvg) g2.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/inputs/InputsUiAdapterImpl", "selectInput", 508, "InputsUiAdapterImpl.kt")).q("Audio input selected");
        } else if (jhiVar instanceof jhg) {
            jhd jhdVar = ((jhg) jhiVar).a;
            agek agekVar = agek.a;
            int ordinal = jhdVar.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        if (ordinal == 3) {
                            alvw d2 = a.d();
                            d2.X(alwp.a, "BugleComposeRow2");
                            ((alvg) d2.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/inputs/InputsUiAdapterImpl", "selectInput", 518, "InputsUiAdapterImpl.kt")).q("Emotive input selected with custom sticker screen");
                        } else {
                            throw new armm();
                        }
                    } else {
                        alvw d3 = a.d();
                        d3.X(alwp.a, "BugleComposeRow2");
                        ((alvg) d3.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/inputs/InputsUiAdapterImpl", "selectInput", 516, "InputsUiAdapterImpl.kt")).q("Emotive input selected with Stickers screen");
                    }
                } else {
                    alvw d4 = a.d();
                    d4.X(alwp.a, "BugleComposeRow2");
                    ((alvg) d4.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/inputs/InputsUiAdapterImpl", "selectInput", 514, "InputsUiAdapterImpl.kt")).q("Emotive input selected with GIF screen");
                }
            } else {
                alvw d5 = a.d();
                d5.X(alwp.a, "BugleComposeRow2");
                ((alvg) d5.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/inputs/InputsUiAdapterImpl", "selectInput", 512, "InputsUiAdapterImpl.kt")).q("Emotive input selected with emoji screen");
            }
        } else if (d.F(jhiVar, jhf.c)) {
            alvw d6 = a.d();
            d6.X(alwp.a, "BugleComposeRow2");
            ((alvg) d6.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/inputs/InputsUiAdapterImpl", "selectInput", 520, "InputsUiAdapterImpl.kt")).q("Gallery input selected");
        } else if (jhiVar instanceof jhh) {
            jus jusVar = ((jhh) jhiVar).a;
            alvw d7 = a.d();
            d7.X(alwp.a, "BugleComposeRow2");
            ((alvg) d7.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/inputs/InputsUiAdapterImpl", "selectInput", 537, "InputsUiAdapterImpl.kt")).q("Shortcuts input selected");
        } else if (d.F(jhiVar, jhf.d)) {
            alvw d8 = a.d();
            d8.X(alwp.a, "BugleComposeRow2");
            ((alvg) d8.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/inputs/InputsUiAdapterImpl", "selectInput", 541, "InputsUiAdapterImpl.kt")).q("Opening keyboard programmatically");
        } else if (jhiVar == null) {
            alvw d9 = a.d();
            d9.X(alwp.a, "BugleComposeRow2");
            ((alvg) d9.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/inputs/InputsUiAdapterImpl", "selectInput", 542, "InputsUiAdapterImpl.kt")).q("Closing all inputs");
        } else {
            throw new armm();
        }
        qjh.l(this.c, null, new jec(this, jhiVar, (arpe) null, 15), 3);
    }

    @Override // defpackage.jtt
    public final ascv c() {
        return this.V;
    }

    public final agfh d(agek agekVar) {
        return new agfh(agekVar, h(agekVar), 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(defpackage.arpe r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.jtx
            if (r0 == 0) goto L13
            r0 = r7
            jtx r0 = (defpackage.jtx) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            jtx r0 = new jtx
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L39
            if (r2 == r5) goto L33
            if (r2 != r4) goto L2b
            defpackage.aqil.P(r7)
            goto L70
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L33:
            jub r2 = r0.d
            defpackage.aqil.P(r7)
            goto L56
        L39:
            defpackage.aqil.P(r7)
            boolean r7 = defpackage.yig.c()
            if (r7 == 0) goto L7c
            boolean r7 = r6.E
            if (r7 == 0) goto L7c
            afqa r7 = r6.o
            if (r7 == 0) goto L60
            r0.d = r6
            r0.c = r5
            java.lang.Object r7 = r7.a()
            if (r7 != r1) goto L55
            return r1
        L55:
            r2 = r6
        L56:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 != r5) goto L61
            r3 = r5
            goto L61
        L60:
            r2 = r6
        L61:
            if (r3 == 0) goto L7c
            wpp r7 = r2.Y
            r2 = 0
            r0.d = r2
            r0.c = r4
            java.lang.Object r7 = r7.ae(r0)
            if (r7 == r1) goto L7b
        L70:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 != 0) goto L7c
            jhd r7 = defpackage.jhd.d
            goto L7e
        L7b:
            return r1
        L7c:
            jhd r7 = defpackage.jhk.a
        L7e:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jub.e(arpe):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r6v17, types: [java.lang.Object, ascd] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(defpackage.jhi r6, defpackage.arpe r7) {
        /*
            Method dump skipped, instructions count: 309
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jub.f(jhi, arpe):java.lang.Object");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x0020. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00a6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(defpackage.aeny r8, defpackage.arpe r9) {
        /*
            Method dump skipped, instructions count: 390
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jub.g(aeny, arpe):java.lang.Object");
    }

    public final arqr h(agek agekVar) {
        agekVar.getClass();
        if (((Set) b.a()).contains(agekVar)) {
            return w;
        }
        return this.Q;
    }

    public final void i(aenw aenwVar) {
        aeny aenyVar;
        if (this.t.get()) {
            alvw d = a.d();
            d.X(alwp.a, "BugleComposeRow2");
            ((alvg) d.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/inputs/InputsUiAdapterImpl", "onClick", 402, "InputsUiAdapterImpl.kt")).q("Ignoring onClick as we are still processing a prior input change.");
            return;
        }
        if (((odl) this.G.b()).a() && ((wpm) this.H.b()).b.c() == wpn.b) {
            agek agekVar = agek.a;
            int ordinal = aenwVar.ordinal();
            if (ordinal == 2 || ordinal == 5) {
                qjh.l(this.c, null, new jpc(this, (arpe) null, 11, (byte[]) null), 3);
                return;
            }
        }
        this.t.set(true);
        if (this.L.c() != aenwVar) {
            aenyVar = aenwVar;
        } else {
            aenyVar = aenx.a;
        }
        if (d.F(aenyVar, aenx.a)) {
            alvw d2 = a.d();
            d2.X(alwp.a, "BugleComposeRow2");
            ((alvg) d2.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/inputs/InputsUiAdapterImpl", "onClick", 427, "InputsUiAdapterImpl.kt")).q("Closing input in Compose Row and opening keyboard.");
        } else {
            alvw d3 = a.d();
            d3.X(alwp.a, "BugleComposeRow2");
            ((alvg) d3.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/inputs/InputsUiAdapterImpl", "onClick", 429, "InputsUiAdapterImpl.kt")).t("%s input clicked", aenyVar);
        }
        if (((Boolean) this.B.b()).booleanValue() && aenyVar == aenw.c) {
            ((ksi) this.g.b()).a();
        }
        if (((ovh) this.I.b()).a() && ((ovj) this.J.b()).a() && aenyVar == aenw.c) {
            jkg i = this.X.i(amqe.CAMERA_GALLERY_BUTTON);
            if (i.c()) {
                ((agcp) this.K.b()).b(i);
            } else {
                i.b();
            }
            this.t.set(false);
            return;
        }
        if (!((Boolean) this.C.b()).booleanValue() && aenyVar == aenw.f) {
            this.t.set(false);
        } else {
            qjh.l(this.c, null, new gvr(this, aenyVar, aenwVar, (arpe) null, 20), 3);
        }
    }

    @Override // defpackage.agff
    public final Object l(agfe agfeVar) {
        agfd agfdVar;
        agcb agcbVar;
        agex agexVar;
        agew agewVar;
        aeny aenyVar = null;
        if (d.F(agfeVar, agev.a)) {
            if (!d.F(agfeVar, this.R)) {
                alvw d = a.d();
                d.X(alwp.a, "BugleComposeRow2");
                ((alvg) d.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/inputs/InputsUiAdapterImpl", "onStateChanged", 565, "InputsUiAdapterImpl.kt")).q("Compose Row input state is now closed");
            }
            this.L.f(null);
            this.q.f(agfg.a);
        } else if (agfeVar instanceof agew) {
            agew agewVar2 = (agew) agfeVar;
            aeny k = k(agewVar2.a);
            agfe agfeVar2 = this.R;
            if (agfeVar2 instanceof agew) {
                agewVar = (agew) agfeVar2;
            } else {
                agewVar = null;
            }
            if (agewVar != null) {
                aenyVar = k(agewVar.a);
            }
            if (!d.F(aenyVar, k)) {
                alvw d2 = a.d();
                d2.X(alwp.a, "BugleComposeRow2");
                ((alvg) d2.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/inputs/InputsUiAdapterImpl", "onStateChanged", 576, "InputsUiAdapterImpl.kt")).t("Compose Row now showing input %s without keyboard", k);
            }
            this.L.f(k);
            this.q.f(agewVar2.a);
        } else if (agfeVar instanceof agex) {
            agex agexVar2 = (agex) agfeVar;
            aeny k2 = k(agexVar2.a);
            agfe agfeVar3 = this.R;
            if (agfeVar3 instanceof agex) {
                agexVar = (agex) agfeVar3;
            } else {
                agexVar = null;
            }
            if (agexVar != null) {
                aenyVar = k(agexVar.a);
            }
            if (!d.F(aenyVar, k2)) {
                alvw d3 = a.d();
                d3.X(alwp.a, "BugleComposeRow2");
                ((alvg) d3.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/inputs/InputsUiAdapterImpl", "onStateChanged", 587, "InputsUiAdapterImpl.kt")).t("Compose Row now showing input %s over keyboard", k2);
            }
            this.L.f(k2);
            this.q.f(agexVar2.a);
        } else if (agfeVar instanceof agfd) {
            agfe agfeVar4 = this.R;
            if (agfeVar4 instanceof agfd) {
                agfdVar = (agfd) agfeVar4;
            } else {
                agfdVar = null;
            }
            if (agfdVar != null) {
                agcbVar = agfdVar.a;
            } else {
                agcbVar = null;
            }
            if (((agfd) agfeVar).a instanceof agby) {
                if (agcbVar == null || !(agcbVar instanceof agby)) {
                    alvw d4 = a.d();
                    d4.X(alwp.a, "BugleComposeRow2");
                    ((alvg) d4.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/inputs/InputsUiAdapterImpl", "onStateChanged", 597, "InputsUiAdapterImpl.kt")).q("Compose Row keyboard is closing");
                }
                this.L.f(null);
                this.q.f(agfg.a);
            } else {
                if (agcbVar == null || (agcbVar instanceof agby)) {
                    this.W.g(197874, null);
                    alvw d5 = a.d();
                    d5.X(alwp.a, "BugleComposeRow2");
                    ((alvg) d5.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/inputs/InputsUiAdapterImpl", "onStateChanged", 605, "InputsUiAdapterImpl.kt")).q("Compose Row now showing keyboard without input");
                }
                this.L.f(aenx.a);
                this.q.f(new agfj(aeke.bl(this.x)));
            }
        } else {
            throw new armm();
        }
        this.R = agfeVar;
        this.t.set(false);
        return arnb.a;
    }
}
