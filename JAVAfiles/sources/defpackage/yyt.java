package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Looper;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.startchat.StartChatActivity;
import j$.time.Duration;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.stream.Stream;
import java.net.URI;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yyt {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;

    public yyt(Context context, apwt apwtVar, apwt apwtVar2, armf armfVar) {
        this.b = context;
        this.d = apwtVar;
        this.c = apwtVar2;
        this.a = armfVar;
    }

    public static final void G(amgl amglVar, Optional optional) {
        amgw amgwVar = ((amgu) amglVar.b).j;
        if (amgwVar == null) {
            amgwVar = amgw.a;
        }
        aozy builder = amgwVar.toBuilder();
        if (((amgw) builder.b).b.size() > 0 && optional.isPresent() && ((xrz) optional.get()).f.isPresent()) {
            aozy builder2 = builder.aI().toBuilder();
            int aR = yyb.aR(((xrz) optional.get()).f.getAsLong());
            if (!builder2.b.isMutable()) {
                builder2.u();
            }
            amec amecVar = (amec) builder2.b;
            amecVar.f = a.aq(aR);
            amecVar.b |= 16;
            builder.bt(builder2);
        }
        if (!amglVar.b.isMutable()) {
            amglVar.u();
        }
        amgu amguVar = (amgu) amglVar.b;
        amgw amgwVar2 = (amgw) builder.s();
        amgwVar2.getClass();
        amguVar.j = amgwVar2;
        amguVar.b |= 8;
    }

    /* JADX WARN: Type inference failed for: r12v5, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v7, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [armf, java.lang.Object] */
    private final void aa(MessageCoreData messageCoreData, int i, Consumer consumer) {
        int i2;
        int i3;
        long p;
        amgl amglVar = (amgl) amgu.a.createBuilder();
        long a = ((lzz) this.a.b()).a(messageCoreData.z());
        if (!amglVar.b.isMutable()) {
            amglVar.u();
        }
        amgu amguVar = (amgu) amglVar.b;
        amguVar.b |= 1073741824;
        amguVar.G = a;
        long s = messageCoreData.s();
        if (!amglVar.b.isMutable()) {
            amglVar.u();
        }
        amgu amguVar2 = (amgu) amglVar.b;
        amguVar2.b |= 128;
        amguVar2.n = s;
        int x = lgb.x(messageCoreData.d());
        if (!amglVar.b.isMutable()) {
            amglVar.u();
        }
        amgu amguVar3 = (amgu) amglVar.b;
        amguVar3.g = x - 1;
        amguVar3.b |= 1;
        if (!amglVar.b.isMutable()) {
            amglVar.u();
        }
        amgu amguVar4 = (amgu) amglVar.b;
        amguVar4.h = i - 1;
        amguVar4.b |= 2;
        if (true != messageCoreData.cn()) {
            i2 = 3;
        } else {
            i2 = 2;
        }
        if (!amglVar.b.isMutable()) {
            amglVar.u();
        }
        amgu amguVar5 = (amgu) amglVar.b;
        amguVar5.S = i2 - 1;
        amguVar5.c |= 16384;
        String f = messageCoreData.E().f();
        if (!amglVar.b.isMutable()) {
            amglVar.u();
        }
        amgu amguVar6 = (amgu) amglVar.b;
        amguVar6.b |= Integer.MIN_VALUE;
        amguVar6.H = f;
        aozy createBuilder = amhs.a.createBuilder();
        int f2 = messageCoreData.f();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        amhs amhsVar = (amhs) createBuilder.b;
        amhsVar.b |= 1;
        amhsVar.c = f2;
        amhs amhsVar2 = (amhs) createBuilder.s();
        if (!amglVar.b.isMutable()) {
            amglVar.u();
        }
        amgu amguVar7 = (amgu) amglVar.b;
        amhsVar2.getClass();
        amguVar7.f = amhsVar2;
        amguVar7.e = 60;
        List<MessagePartCoreData> W = messageCoreData.W();
        aozy createBuilder2 = amgw.a.createBuilder();
        for (MessagePartCoreData messagePartCoreData : W) {
            String U = messagePartCoreData.U();
            if (U != null) {
                i3 = yyb.aQ(U);
            } else {
                i3 = 2;
            }
            aozy createBuilder3 = amec.a.createBuilder();
            if (!createBuilder3.b.isMutable()) {
                createBuilder3.u();
            }
            amec amecVar = (amec) createBuilder3.b;
            amecVar.c = a.au(i3);
            amecVar.b |= 1;
            ameb M = messagePartCoreData.M();
            if (!createBuilder3.b.isMutable()) {
                createBuilder3.u();
            }
            amec amecVar2 = (amec) createBuilder3.b;
            amecVar2.d = M.a();
            amecVar2.b |= 4;
            if (!createBuilder3.b.isMutable()) {
                createBuilder3.u();
            }
            amec.a((amec) createBuilder3.b);
            if (messagePartCoreData.l() > 0) {
                p = messagePartCoreData.l();
            } else {
                p = messagePartCoreData.p();
            }
            if (!createBuilder3.b.isMutable()) {
                createBuilder3.u();
            }
            int aR = yyb.aR(p);
            amec amecVar3 = (amec) createBuilder3.b;
            amecVar3.f = a.aq(aR);
            amecVar3.b |= 16;
            createBuilder2.bs(createBuilder3);
        }
        amgw amgwVar = (amgw) createBuilder2.s();
        if (!amglVar.b.isMutable()) {
            amglVar.u();
        }
        amgu amguVar8 = (amgu) amglVar.b;
        amgwVar.getClass();
        amguVar8.j = amgwVar;
        amguVar8.b |= 8;
        if (messageCoreData.cI()) {
            amxo n = ((hgj) this.d.b()).n();
            if (!amglVar.b.isMutable()) {
                amglVar.u();
            }
            amgu amguVar9 = (amgu) amglVar.b;
            amguVar9.aa = n.h;
            amguVar9.c |= 2097152;
        }
        consumer.q(amglVar);
        amfq amfqVar = (amfq) amfr.a.createBuilder();
        amfp amfpVar = amfp.BUGLE_MESSAGE;
        if (!amfqVar.b.isMutable()) {
            amfqVar.u();
        }
        amfr amfrVar = (amfr) amfqVar.b;
        amfrVar.i = amfpVar.dg;
        amfrVar.b |= 1;
        amgu amguVar10 = (amgu) amglVar.s();
        if (!amfqVar.b.isMutable()) {
            amfqVar.u();
        }
        amfr amfrVar2 = (amfr) amfqVar.b;
        amguVar10.getClass();
        amfrVar2.k = amguVar10;
        amfrVar2.b |= 4;
        qiu.f(aktp.ah(new wnc(this, amfqVar, 14, null), this.b), "Failed to log upload event.");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, arml] */
    private final wul ab() {
        return (wul) this.c.a();
    }

    public static final aozy d(ypi ypiVar, amzf amzfVar, int i) {
        aozy createBuilder = amzg.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        amzg amzgVar = (amzg) createBuilder.b;
        amzgVar.e = amzfVar.a();
        amzgVar.b |= 1;
        if (amzfVar == amzf.RECLASSIFICATION) {
            aozy createBuilder2 = amzl.a.createBuilder();
            if (!createBuilder2.b.isMutable()) {
                createBuilder2.u();
            }
            amzl amzlVar = (amzl) createBuilder2.b;
            amzlVar.b |= 1;
            amzlVar.c = i;
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            amzg amzgVar2 = (amzg) createBuilder.b;
            amzl amzlVar2 = (amzl) createBuilder2.s();
            amzlVar2.getClass();
            amzgVar2.d = amzlVar2;
            amzgVar2.c = 2;
        }
        aozy createBuilder3 = amze.a.createBuilder();
        amzn a = ypiVar.a();
        if (!createBuilder3.b.isMutable()) {
            createBuilder3.u();
        }
        amze amzeVar = (amze) createBuilder3.b;
        amzeVar.c = a.a();
        amzeVar.b |= 1;
        if (!createBuilder3.b.isMutable()) {
            createBuilder3.u();
        }
        amze amzeVar2 = (amze) createBuilder3.b;
        amzg amzgVar3 = (amzg) createBuilder.s();
        amzgVar3.getClass();
        amzeVar2.d = amzgVar3;
        amzeVar2.b |= 2;
        return createBuilder3;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    public final boolean A() {
        return ((ykw) this.a.b()).q("debugging_features_enabled", ((Boolean) utw.ac.e()).booleanValue());
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v10, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v12, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v15, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v18, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v10, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v12, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v16, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v18, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v8, types: [armf, java.lang.Object] */
    public final yba B(Consumer consumer, int i) {
        if (yhx.e) {
            if (!yhx.f) {
                ybm ybmVar = (ybm) this.d.b();
                if (egl.e(ybmVar.a, "android.permission.ACCESS_FINE_LOCATION") == 0 || egl.e(ybmVar.a, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
                    wpp wppVar = (wpp) this.c.b();
                    ykp ykpVar = (ykp) wppVar.a.b();
                    ykpVar.getClass();
                    anen anenVar = (anen) wppVar.b.b();
                    anenVar.getClass();
                    akbm akbmVar = (akbm) wppVar.c.b();
                    akbmVar.getClass();
                    return new ybl(ykpVar, anenVar, akbmVar, consumer, i);
                }
            }
            yyt yytVar = (yyt) this.a.b();
            ykp ykpVar2 = (ykp) yytVar.c.b();
            ykpVar2.getClass();
            anen anenVar2 = (anen) yytVar.b.b();
            anenVar2.getClass();
            akbm akbmVar2 = (akbm) yytVar.d.b();
            akbmVar2.getClass();
            ybm ybmVar2 = (ybm) yytVar.a.b();
            ybmVar2.getClass();
            return new ybj(ykpVar2, anenVar2, akbmVar2, ybmVar2, consumer, i);
        }
        zai zaiVar = (zai) this.b.b();
        ykp ykpVar3 = (ykp) zaiVar.e.b();
        ykpVar3.getClass();
        anen anenVar3 = (anen) zaiVar.b.b();
        anenVar3.getClass();
        akbm akbmVar3 = (akbm) zaiVar.a.b();
        akbmVar3.getClass();
        aksr aksrVar = (aksr) zaiVar.c.b();
        aksrVar.getClass();
        ybm ybmVar3 = (ybm) zaiVar.d.b();
        ybmVar3.getClass();
        return new ybd(ykpVar3, anenVar3, akbmVar3, aksrVar, ybmVar3, consumer, i);
    }

    public final void C(MessageCoreData messageCoreData, amrl amrlVar, Optional optional) {
        aa(messageCoreData, 21, new vxb(amrlVar, optional, 20, null));
    }

    public final void D(MessageCoreData messageCoreData, amrl amrlVar, amrk amrkVar, Optional optional) {
        aa(messageCoreData, 21, new iqp(amrlVar, amrkVar, optional, 14));
    }

    public final void E(MessageCoreData messageCoreData) {
        aa(messageCoreData, 19, new xet(11));
    }

    public final void F(MessageCoreData messageCoreData, Optional optional, qep qepVar) {
        aa(messageCoreData, 20, new zcd(optional, qepVar, 1, null));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v10, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v12, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v19, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v4, types: [apwt, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v8, types: [armf, java.lang.Object] */
    public final void H(int i) {
        if (!((mif) this.d.b()).b()) {
            ((mif) this.d.b()).a();
            return;
        }
        aozy createBuilder = amnc.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        amnc amncVar = (amnc) createBuilder.b;
        amncVar.c = i - 1;
        amncVar.b |= 1;
        boolean isPresent = ((Optional) this.b.b()).isPresent();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        amnc amncVar2 = (amnc) createBuilder.b;
        amncVar2.b |= 4;
        amncVar2.d = isPresent;
        boolean e = ((yjv) this.c.b()).e();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        amnc amncVar3 = (amnc) createBuilder.b;
        amncVar3.b |= 8;
        amncVar3.e = e;
        boolean d = ((yjv) this.c.b()).d();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        amnc amncVar4 = (amnc) createBuilder.b;
        amncVar4.b |= 16;
        amncVar4.f = d;
        amfq amfqVar = (amfq) amfr.a.createBuilder();
        amfp amfpVar = amfp.TELEPHONY_DATABASE_EVENT;
        if (!amfqVar.b.isMutable()) {
            amfqVar.u();
        }
        amfr amfrVar = (amfr) amfqVar.b;
        amfrVar.i = amfpVar.dg;
        amfrVar.b |= 1;
        if (!amfqVar.b.isMutable()) {
            amfqVar.u();
        }
        amfr amfrVar2 = (amfr) amfqVar.b;
        amnc amncVar5 = (amnc) createBuilder.s();
        amncVar5.getClass();
        amfrVar2.ab = amncVar5;
        amfrVar2.d |= 2;
        ((maq) this.a.b()).j(amfqVar);
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v1, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v3, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v7, types: [armf, java.lang.Object] */
    public final akul I(anjj anjjVar, qei qeiVar) {
        aozy createBuilder = qez.b.createBuilder();
        createBuilder.E(xes.a(anjjVar.c));
        String str = anjjVar.a.a.c;
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        qez qezVar = (qez) createBuilder.b;
        str.getClass();
        qezVar.c |= 1;
        qezVar.d = str;
        qei a = ((psq) this.b.b()).a(((URI) anjjVar.a.b.get()).toString(), true);
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        qez qezVar2 = (qez) createBuilder.b;
        a.getClass();
        qezVar2.e = a;
        int i = 2;
        qezVar2.c |= 2;
        aozy createBuilder2 = qfj.a.createBuilder();
        String str2 = anjjVar.b.a;
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        qfj qfjVar = (qfj) createBuilder2.b;
        qfjVar.b |= 1;
        qfjVar.c = str2;
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        qez qezVar3 = (qez) createBuilder.b;
        qfj qfjVar2 = (qfj) createBuilder2.s();
        qfjVar2.getClass();
        qezVar3.h = qfjVar2;
        qezVar3.c |= 4;
        Stream map = Collection.EL.stream(anjjVar.d).map(new xdo(i)).map(new wki(new xei().m(), 19)).map(new xdo(3));
        int i2 = alog.d;
        createBuilder.F((Iterable) map.collect(alls.a));
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        qez qezVar4 = (qez) createBuilder.b;
        qeiVar.getClass();
        qezVar4.k = qeiVar;
        qezVar4.c |= 32;
        if (((poz) this.d.b()).a()) {
            aozy createBuilder3 = qfa.a.createBuilder();
            anjg anjgVar = anjjVar.b.d;
            if (!createBuilder3.b.isMutable()) {
                createBuilder3.u();
            }
            String str3 = anjgVar.b;
            qfa qfaVar = (qfa) createBuilder3.b;
            qfaVar.b |= 1;
            qfaVar.c = str3;
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            qez qezVar5 = (qez) createBuilder.b;
            qfa qfaVar2 = (qfa) createBuilder3.s();
            qfaVar2.getClass();
            qezVar5.i = qfaVar2;
            qezVar5.c |= 8;
        }
        if (((ojs) this.a.b()).a()) {
            qfd cM = yyb.cM(anjjVar.b.c);
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            qez qezVar6 = (qez) createBuilder.b;
            qezVar6.l = cM;
            qezVar6.c |= 64;
        }
        return ((qco) this.c.b()).e((qez) createBuilder.s());
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0070, code lost:
    
        if (r7 != r1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0061, code lost:
    
        if (r2.K(r0) != r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object J(defpackage.arpe r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.wou
            if (r0 == 0) goto L13
            r0 = r7
            wou r0 = (defpackage.wou) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            wou r0 = new wou
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.b
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L41
            if (r2 == r5) goto L3b
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            defpackage.aqil.P(r7)
            goto L72
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L35:
            yyt r2 = r0.d
            defpackage.aqil.P(r7)
            goto L63
        L3b:
            yyt r2 = r0.d
            defpackage.aqil.P(r7)
            goto L53
        L41:
            defpackage.aqil.P(r7)
            wul r7 = r6.ab()
            r0.d = r6
            r0.b = r5
            java.lang.Object r7 = r7.c(r0)
            if (r7 == r1) goto L7c
            r2 = r6
        L53:
            wow r7 = (defpackage.wow) r7
            int r7 = r7.c
            if (r7 > 0) goto L76
            r0.d = r2
            r0.b = r4
            java.lang.Object r7 = r2.K(r0)
            if (r7 == r1) goto L7c
        L63:
            wul r7 = r2.ab()
            r2 = 0
            r0.d = r2
            r0.b = r3
            java.lang.Object r7 = r7.c(r0)
            if (r7 == r1) goto L7c
        L72:
            wow r7 = (defpackage.wow) r7
            int r7 = r7.c
        L76:
            java.lang.Integer r0 = new java.lang.Integer
            r0.<init>(r7)
            return r0
        L7c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yyt.J(arpe):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0062, code lost:
    
        if (r2.d(r4, r0) != r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object K(defpackage.arpe r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.wov
            if (r0 == 0) goto L13
            r0 = r7
            wov r0 = (defpackage.wov) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            wov r0 = new wov
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.b
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.aqil.P(r7)
            goto L65
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L32:
            yyt r2 = r0.d
            defpackage.aqil.P(r7)
            goto L4a
        L38:
            defpackage.aqil.P(r7)
            java.lang.Object r7 = r6.a
            r0.d = r6
            r0.b = r4
            wqq r7 = (defpackage.wqq) r7
            java.lang.Object r7 = r7.e(r0)
            if (r7 == r1) goto L68
            r2 = r6
        L4a:
            wrl r7 = (defpackage.wrl) r7
            int r7 = r7.d
            wul r2 = r2.ab()
            iim r4 = new iim
            r5 = 8
            r4.<init>(r7, r5)
            r7 = 0
            r0.d = r7
            r0.b = r3
            java.lang.Object r7 = r2.d(r4, r0)
            if (r7 != r1) goto L65
            goto L68
        L65:
            arnb r7 = defpackage.arnb.a
            return r7
        L68:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yyt.K(arpe):java.lang.Object");
    }

    public final akul L(String str, wfy wfyVar) {
        return ((whj) this.a).b(str, wfyVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.util.concurrent.Executor, java.lang.Object] */
    public final void M(String str, wfx wfxVar, int i) {
        aozy N = N(i, 4);
        if (!N.b.isMutable()) {
            N.u();
        }
        wfy wfyVar = (wfy) N.b;
        wfy wfyVar2 = wfy.a;
        wfyVar.h = wfxVar.a();
        wfyVar.b |= 64;
        L(str, (wfy) N.s()).k(qiu.b(), this.b);
    }

    public final aozy N(int i, int i2) {
        aozy createBuilder = wfy.a.createBuilder();
        apct b = apds.b(((xnv) this.d).f().toEpochMilli());
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        wfy wfyVar = (wfy) apagVar;
        b.getClass();
        wfyVar.e = b;
        wfyVar.b |= 4;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        wfy wfyVar2 = (wfy) createBuilder.b;
        wfyVar2.c = a.ak(i);
        wfyVar2.b |= 1;
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        wfy wfyVar3 = (wfy) createBuilder.b;
        wfyVar3.d = a.aq(i2);
        wfyVar3.b |= 2;
        return createBuilder;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v1, types: [arwe, java.lang.Object] */
    public final void O(amlw amlwVar, Optional optional) {
        wyp wypVar = (wyp) this.c.b();
        Optional map = optional.map(new vvi(18));
        amlwVar.getClass();
        map.getClass();
        qjh.l(wypVar.a, null, new qka(amlwVar, wypVar, map, (arpe) null, 19), 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.util.concurrent.Executor, java.lang.Object] */
    public final void P(int i) {
        wfp wfpVar = wfp.BOTTOMSHEET;
        aozy createBuilder = wfq.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        wfq wfqVar = (wfq) createBuilder.b;
        wfqVar.d = wfpVar.a();
        wfqVar.b |= 2;
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        wfq wfqVar2 = (wfq) createBuilder.b;
        wfqVar2.e = a.am(i);
        wfqVar2.b |= 4;
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        wfq wfqVar3 = (wfq) createBuilder.b;
        wfqVar3.c = a.an(3);
        wfqVar3.b |= 1;
        apct b = apds.b(((xnv) this.a).f().toEpochMilli());
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        wfq wfqVar4 = (wfq) createBuilder.b;
        b.getClass();
        wfqVar4.f = b;
        wfqVar4.b |= 8;
        wfq wfqVar5 = (wfq) createBuilder.s();
        whj whjVar = (whj) this.d;
        akul j = whjVar.d.j(new weh(wfqVar5, 10));
        ansy ansyVar = whjVar.g;
        arbj arbjVar = new arbj();
        arbjVar.n(j);
        arbjVar.c = new weh(wfqVar5, 11);
        arbjVar.o(whj.c);
        akul.g(ansyVar.i(arbjVar.m())).h(new whe(5), andi.a).k(qiu.b(), this.b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v1, types: [armf, java.lang.Object] */
    @armg
    public final int Q(vqk vqkVar) {
        vqkVar.getClass();
        if (((okp) this.b.b()).a()) {
            Object obj = this.a;
            ((alvg) vql.a.d().h("com/google/android/apps/messaging/shared/rcs/RcsSubIdFromPreferencesLogger", "logRcsSubIdFromPreferencesCaller", 15, "RcsSubIdFromPreferencesLogger.kt")).t("Called getRcsSubId() from %s", vqkVar);
            ((vql) obj).b.e("Bugle.Rcs.Shared.RcsPreferences.GetRcsSubIdCaller.Counts", vqkVar.y);
        }
        return ((ykw) this.c.b()).d("rcs_sub_id", -2);
    }

    public final String R() {
        String string = ((Context) this.d).getResources().getString(R.string.unknown_business_name);
        string.getClass();
        return string;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [armf, java.lang.Object] */
    public final boolean S() {
        Resources resources = ((Context) this.d).getResources();
        return ((ykw) this.c.b()).q(resources.getString(R.string.rcs_mobile_auto_download_in_roaming_pref_key), resources.getBoolean(R.bool.enable_rcs_mobile_auto_download_in_roaming_default));
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [armf, java.lang.Object] */
    public final boolean T() {
        Resources resources = ((Context) this.d).getResources();
        return ((ykw) this.c.b()).q(resources.getString(R.string.enable_rcs_pref_key), resources.getBoolean(R.bool.enable_rcs_pref_default));
    }

    public final vjb U(viw viwVar) {
        return ((vjs) this.d).l(new iie(this, viwVar, 5), vhu.REPORT_ISSUE, new vie(this, 4));
    }

    /* JADX WARN: Type inference failed for: r10v1, types: [java.util.concurrent.Executor, java.lang.Object] */
    public final void V(aozy aozyVar) {
        qiu.h(aktp.ah(new vhq(this, aozyVar, ((xnv) this.a).f().toEpochMilli(), ((xnv) this.a).a(), 0), this.b));
    }

    public final void W(rve rveVar, aozy aozyVar) {
        double doubleValue = aczf.p().doubleValue();
        if (doubleValue < 1.0d) {
            String f = rveVar.f();
            if (doubleValue <= 0.0d || f.isEmpty() || Math.abs(f.hashCode()) > ((int) (doubleValue * 2.147483647E9d))) {
                return;
            }
        }
        V(aozyVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [armf, java.lang.Object] */
    public final vfi X(vcy vcyVar, vfh vfhVar) {
        anen anenVar = (anen) this.a.b();
        anenVar.getClass();
        xyt xytVar = (xyt) this.c.b();
        xytVar.getClass();
        wpp wppVar = (wpp) this.d.b();
        wppVar.getClass();
        xnv xnvVar = (xnv) this.b.b();
        xnvVar.getClass();
        vcyVar.getClass();
        return new vfi(anenVar, xytVar, wppVar, xnvVar, vcyVar, vfhVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [armf, java.lang.Object] */
    public final zai Y(List list) {
        vmu vmuVar = (vmu) this.b.b();
        vmuVar.getClass();
        ((anen) this.a.b()).getClass();
        Executor executor = (Executor) this.d.b();
        executor.getClass();
        anen anenVar = (anen) this.c.b();
        anenVar.getClass();
        list.getClass();
        return new zai(vmuVar, executor, anenVar, list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.concurrent.Executor, java.lang.Object] */
    public final akul Z(ygf ygfVar, ahjj ahjjVar) {
        Executor fcvVar;
        if (Looper.myLooper() != null) {
            fcvVar = andi.a;
        } else {
            fcvVar = new fcv(this, 5);
        }
        return akuk.b(new mke(this, ygfVar, 2), fcvVar).e(new ygl(this, ahjjVar, 0), this.a).f();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    public final void a() {
        ((ykw) this.d.b()).h("spam_popup_dismissed", true);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    public final void b() {
        h(((wfh) this.c.b()).X());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    public final boolean c() {
        return ((wfh) this.c.b()).X().l();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [armf, java.lang.Object] */
    public final ykg e(yjo yjoVar, int i) {
        znj znjVar = (znj) this.a.b();
        znjVar.getClass();
        ykp ykpVar = (ykp) this.d.b();
        ykpVar.getClass();
        Context context = (Context) this.b.b();
        context.getClass();
        Boolean bool = (Boolean) this.c.b();
        bool.getClass();
        boolean booleanValue = bool.booleanValue();
        yjoVar.getClass();
        return new ykg(znjVar, ykpVar, context, booleanValue, yjoVar, i);
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9, types: [armf, java.lang.Object] */
    public final void f(MessageIdType messageIdType, List list) {
        if (((Boolean) ((utz) yig.at.get()).e()).booleanValue()) {
            yqx yqxVar = (yqx) this.c.b();
            qjh.l(yqxVar.i, null, new yqw(messageIdType, yqxVar, list, null), 3);
        }
        yqv yqvVar = (yqv) this.b.b();
        qjh.l(yqvVar.f, null, new ipz(messageIdType, yqvVar, list, (arpe) null, 4), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x007d A[LOOP:0: B:18:0x0077->B:20:0x007d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Type inference failed for: r1v12, types: [arpi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [arpi, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r17, defpackage.arpe r18) {
        /*
            Method dump skipped, instructions count: 323
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yyt.g(com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType, arpe):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    public final void h(atal atalVar) {
        ((wfh) this.c.b()).W(atalVar);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [armf, java.lang.Object] */
    public final boolean i(atal atalVar, boolean z) {
        if (z && atalVar.n()) {
            ((wfh) this.c.b()).W(atalVar);
            return true;
        }
        return false;
    }

    public final String j() {
        if (((ansy) ((pjb) this.b).a.b()).e("bugle.change_transformer_video_output_mime_type_to_be_configurable") && erl.j((String) uif.h.e())) {
            Object e = uif.h.e();
            e.getClass();
            return (String) e;
        }
        return "video/avc";
    }

    public final void k() {
        ((aoia) ((lpg) this.b).a).f(new ijm((amnl) ((aozy) this.d).s(), 10));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [ojc, java.lang.Object] */
    public final void l(Duration duration) {
        float seconds;
        if (this.a.a()) {
            seconds = ((float) duration.toMillis()) / ((float) TimeUnit.SECONDS.toMillis(1L));
        } else {
            seconds = (float) duration.toSeconds();
        }
        aozy aozyVar = (aozy) this.d;
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        amnl amnlVar = (amnl) aozyVar.b;
        amnl amnlVar2 = amnl.a;
        amnlVar.b |= 4;
        amnlVar.e = seconds;
    }

    public final void m(int i) {
        aozy aozyVar = (aozy) this.d;
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        amnl amnlVar = (amnl) aozyVar.b;
        amnl amnlVar2 = amnl.a;
        amnlVar.b |= 8;
        amnlVar.f = i;
    }

    public final void n(int i) {
        aozy aozyVar = (aozy) this.d;
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        amnl amnlVar = (amnl) aozyVar.b;
        amnl amnlVar2 = amnl.a;
        amnlVar.b |= 16;
        amnlVar.g = i;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [ojc, java.lang.Object] */
    public final void o(Duration duration) {
        float seconds;
        if (this.a.a()) {
            seconds = ((float) duration.toMillis()) / ((float) TimeUnit.SECONDS.toMillis(1L));
        } else {
            seconds = (float) duration.toSeconds();
        }
        aozy aozyVar = (aozy) this.d;
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        amnl amnlVar = (amnl) aozyVar.b;
        amnl amnlVar2 = amnl.a;
        amnlVar.b |= 2;
        amnlVar.d = seconds;
    }

    public final void p(int i) {
        aozy aozyVar = (aozy) this.d;
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        amnl amnlVar = (amnl) aozyVar.b;
        amnl amnlVar2 = amnl.a;
        amnlVar.b |= 2048;
        amnlVar.n = i;
    }

    public final void q(String str) {
        Object obj = this.d;
        amnk a = mio.a(str);
        aozy aozyVar = (aozy) obj;
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        amnl amnlVar = (amnl) aozyVar.b;
        amnl amnlVar2 = amnl.a;
        amnlVar.l = a.a();
        amnlVar.b |= 512;
    }

    public final void r(int i) {
        aozy aozyVar = (aozy) this.d;
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        amnl amnlVar = (amnl) aozyVar.b;
        amnl amnlVar2 = amnl.a;
        amnlVar.b |= 1024;
        amnlVar.m = i;
    }

    public final void s(int i) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 1) {
                aozy aozyVar = (aozy) this.d;
                if (!aozyVar.b.isMutable()) {
                    aozyVar.u();
                }
                amnl amnlVar = (amnl) aozyVar.b;
                amnl amnlVar2 = amnl.a;
                amnlVar.c = a.ak(4);
                amnlVar.b = 1 | amnlVar.b;
                return;
            }
            aozy aozyVar2 = (aozy) this.d;
            if (!aozyVar2.b.isMutable()) {
                aozyVar2.u();
            }
            amnl amnlVar3 = (amnl) aozyVar2.b;
            amnl amnlVar4 = amnl.a;
            amnlVar3.c = a.ak(3);
            amnlVar3.b = 1 | amnlVar3.b;
            return;
        }
        aozy aozyVar3 = (aozy) this.d;
        if (!aozyVar3.b.isMutable()) {
            aozyVar3.u();
        }
        amnl amnlVar5 = (amnl) aozyVar3.b;
        amnl amnlVar6 = amnl.a;
        amnlVar5.c = a.ak(2);
        amnlVar5.b = 1 | amnlVar5.b;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [mbl, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3, types: [mbl, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v4, types: [mbl, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v5, types: [mbl, java.lang.Object] */
    public final void t(int i) {
        int i2 = i - 1;
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    this.c.e("Bugle.Media.Attachment.Resize.Failure.Video.Error.Counts", 4);
                    return;
                } else {
                    this.c.e("Bugle.Media.Attachment.Resize.Failure.Video.Error.Counts", 3);
                    return;
                }
            }
            this.c.e("Bugle.Media.Attachment.Resize.Failure.Video.Error.Counts", 2);
            return;
        }
        this.c.e("Bugle.Media.Attachment.Resize.Failure.Video.Error.Counts", 1);
    }

    public final void u(int i) {
        int i2;
        switch (i - 1) {
            case 1:
                i2 = 3;
                break;
            case 2:
                i2 = 5;
                break;
            case 3:
                i2 = 6;
                break;
            case 4:
                i2 = 4;
                break;
            case 5:
                i2 = 7;
                break;
            case 6:
                i2 = 8;
                break;
            case 7:
                i2 = 9;
                break;
            case 8:
                i2 = 10;
                break;
            case 9:
                i2 = 14;
                break;
            case 10:
                i2 = 15;
                break;
            case 11:
                i2 = 16;
                break;
            case 12:
                i2 = 17;
                break;
            default:
                i2 = 18;
                break;
        }
        aozy aozyVar = (aozy) this.d;
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        amnl amnlVar = (amnl) aozyVar.b;
        amnl amnlVar2 = amnl.a;
        amnlVar.r = akec.aC(i2);
        amnlVar.b |= 32768;
    }

    public final akul v(ygf ygfVar) {
        return Z(ygfVar, null);
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, yfx] */
    public final yga w(final yfv yfvVar, String str, String str2, final String str3) {
        boolean z;
        akrh e = aktp.e(str);
        try {
            xnx xnxVar = new xnx(str2);
            synchronized (this.a) {
                if (((IdentityHashMap) this.b).isEmpty()) {
                    this.c.fs();
                }
                if (((IdentityHashMap) this.b).put(yfvVar, xnxVar) == null) {
                    z = true;
                } else {
                    z = false;
                }
                albo.U(z, "Callback was double-registered");
            }
            yga ygaVar = new yga() { // from class: yfw
                /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object, yfx] */
                @Override // defpackage.yga
                public final void a() {
                    boolean z2;
                    akrh e2 = aktp.e(str3);
                    yfv yfvVar2 = yfvVar;
                    yyt yytVar = yyt.this;
                    try {
                        aktp.d();
                        synchronized (yytVar.a) {
                            if (((IdentityHashMap) yytVar.b).remove(yfvVar2) != null) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            albo.U(z2, "Callback was double-unregistered");
                            if (((IdentityHashMap) yytVar.b).isEmpty()) {
                                yytVar.c.ft();
                            }
                        }
                        e2.close();
                    } catch (Throwable th) {
                        try {
                            e2.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }

                @Override // defpackage.yga, java.io.Closeable, java.lang.AutoCloseable
                public final /* synthetic */ void close() {
                    yyb.aJ(this);
                }
            };
            e.close();
            return ygaVar;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.util.concurrent.Executor, java.lang.Object] */
    public final void x(Object obj, akrh akrhVar) {
        alog alogVar;
        aktp.d();
        synchronized (this.a) {
            if (((IdentityHashMap) this.b).isEmpty()) {
                int i = alog.d;
                alogVar = alsx.a;
            } else {
                Stream map = Collection.EL.stream(alor.j(this.b).entrySet()).map(new yec(obj, 2));
                int i2 = alog.d;
                alogVar = (alog) map.collect(alls.a);
            }
        }
        if (!alogVar.isEmpty()) {
            akul aj = aktp.aj(new vbo(alogVar, 14), this.d);
            akrhVar.b(aj);
            qiu.h(aj);
        }
    }

    public final void y(Supplier supplier, String str) {
        Object obj;
        akrh e = aktp.e(str);
        try {
            obj = supplier.get();
            x(obj, e);
            e.close();
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [armf, java.lang.Object] */
    public final boolean z() {
        if (A()) {
            return true;
        }
        return ((Boolean) this.d.b()).booleanValue();
    }

    public yyt(Context context, yhu yhuVar, luj lujVar, vjs vjsVar) {
        this.b = context;
        this.a = yhuVar;
        this.c = lujVar;
        this.d = vjsVar;
    }

    public yyt(armf armfVar, apwt apwtVar, armf armfVar2, armf armfVar3) {
        this.a = armfVar;
        this.b = apwtVar;
        this.c = armfVar2;
        this.d = armfVar3;
    }

    public yyt(armf armfVar, armf armfVar2, armf armfVar3, anen anenVar) {
        this.c = armfVar3;
        this.a = armfVar;
        this.d = armfVar2;
        this.b = anenVar;
    }

    public yyt(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.b = armfVar;
        this.c = armfVar2;
        this.a = armfVar3;
        this.d = armfVar4;
    }

    public yyt(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, char[] cArr, byte[] bArr) {
        this.b = armfVar;
        this.a = armfVar2;
        this.c = armfVar3;
        this.d = armfVar4;
    }

    public yyt(armf armfVar, xnv xnvVar, armf armfVar2, anen anenVar) {
        this.c = armfVar;
        this.a = xnvVar;
        this.d = armfVar2;
        this.b = anenVar;
    }

    public yyt(Object obj, Object obj2, armf armfVar, armf armfVar2) {
        this.b = obj;
        this.a = obj2;
        this.d = armfVar;
        this.c = armfVar2;
    }

    public yyt(wcj wcjVar, waq waqVar, wao waoVar, wel welVar) {
        this.b = wcjVar;
        this.a = waqVar;
        this.d = waoVar;
        this.c = welVar;
    }

    public yyt(whj whjVar, anen anenVar, adtn adtnVar, xnv xnvVar) {
        this.a = whjVar;
        this.b = anenVar;
        this.c = adtnVar;
        this.d = xnvVar;
    }

    public yyt(wpp wppVar, yyt yytVar, anen anenVar, vzh vzhVar) {
        this.c = wppVar;
        this.a = yytVar;
        this.b = anenVar;
        this.d = vzhVar;
    }

    public yyt(xnv xnvVar, anen anenVar, whj whjVar, armf armfVar) {
        this.a = xnvVar;
        this.b = anenVar;
        this.d = whjVar;
        this.c = armfVar;
    }

    public yyt(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        armfVar.getClass();
        this.a = armfVar;
        armfVar2.getClass();
        this.c = armfVar2;
        armfVar3.getClass();
        this.d = armfVar3;
        armfVar4.getClass();
        this.b = armfVar4;
    }

    public yyt(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, byte[] bArr, char[] cArr) {
        armfVar.getClass();
        this.c = armfVar;
        armfVar2.getClass();
        this.b = armfVar2;
        armfVar3.getClass();
        this.d = armfVar3;
        armfVar4.getClass();
        this.a = armfVar4;
    }

    public yyt(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, char[] cArr, byte[] bArr, byte[] bArr2) {
        armfVar.getClass();
        this.b = armfVar;
        armfVar2.getClass();
        this.a = armfVar2;
        armfVar3.getClass();
        this.d = armfVar3;
        armfVar4.getClass();
        this.c = armfVar4;
    }

    public yyt(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, short[] sArr) {
        armfVar.getClass();
        this.b = armfVar;
        armfVar2.getClass();
        this.d = armfVar2;
        armfVar3.getClass();
        this.a = armfVar3;
        armfVar4.getClass();
        this.c = armfVar4;
    }

    public yyt(armf armfVar, wqq wqqVar, arwe arweVar) {
        armfVar.getClass();
        wqqVar.getClass();
        arweVar.getClass();
        this.d = armfVar;
        this.a = wqqVar;
        this.b = arweVar;
        this.c = armd.a(new vnq(this, 5));
    }

    public yyt(StartChatActivity startChatActivity, armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4) {
        armfVar.getClass();
        armfVar2.getClass();
        armfVar3.getClass();
        armfVar4.getClass();
        this.b = startChatActivity;
        this.a = armfVar;
        this.c = armfVar2;
        this.d = armfVar4;
        ajyt b = ajyu.b(startChatActivity);
        b.b(akag.class);
        b.b(akaa.class);
        ((ajxd) armfVar.b()).c(new yys(this, startChatActivity.getIntent().getExtras(), 0));
        ((ajxd) armfVar.b()).d(b.a());
    }

    public yyt(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5) {
        armfVar.getClass();
        this.d = armfVar;
        armfVar2.getClass();
        this.a = armfVar2;
        armfVar3.getClass();
        armfVar4.getClass();
        this.b = armfVar4;
        armfVar5.getClass();
        this.c = armfVar5;
    }

    public yyt(anen anenVar, yfx yfxVar) {
        this.a = new Object();
        this.b = new IdentityHashMap();
        this.d = anenVar;
        this.c = yfxVar;
    }

    public yyt(armf armfVar, armf armfVar2, armf armfVar3, arwe arweVar) {
        armfVar.getClass();
        armfVar2.getClass();
        armfVar3.getClass();
        arweVar.getClass();
        this.a = armfVar;
        this.d = armfVar2;
        this.c = armfVar3;
        this.b = arweVar;
    }

    public yyt(akbm akbmVar, anen anenVar, wpp wppVar) {
        this.b = new AtomicReference(null);
        this.d = akbmVar;
        this.a = anenVar;
        this.c = wppVar;
    }

    public yyt(Context context, armf armfVar, armf armfVar2, vql vqlVar) {
        context.getClass();
        armfVar.getClass();
        armfVar2.getClass();
        this.d = context;
        this.c = armfVar;
        this.b = armfVar2;
        this.a = vqlVar;
    }

    public yyt(mbl mblVar, lpg lpgVar, ojc ojcVar) {
        aozy createBuilder = amnl.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        amnl amnlVar = (amnl) createBuilder.b;
        amnlVar.c = a.ak(3);
        amnlVar.b |= 1;
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        amnl amnlVar2 = (amnl) createBuilder.b;
        amnlVar2.p = a.ak(5);
        amnlVar2.b |= 8192;
        this.d = createBuilder;
        this.c = mblVar;
        this.b = lpgVar;
        this.a = ojcVar;
    }

    public yyt(Context context, akbm akbmVar, pju pjuVar, pjw pjwVar) {
        context.getClass();
        akbmVar.getClass();
        this.c = context;
        this.d = akbmVar;
        this.b = pjuVar;
        this.a = pjwVar;
    }

    public yyt(arpi arpiVar, arpi arpiVar2, wfh wfhVar, xnv xnvVar) {
        arpiVar.getClass();
        arpiVar2.getClass();
        xnvVar.getClass();
        this.c = arpiVar;
        this.d = arpiVar2;
        this.b = wfhVar;
        this.a = xnvVar;
    }

    public yyt(armf armfVar, armf armfVar2, xnv xnvVar, armf armfVar3, armf armfVar4, uhj uhjVar) {
        armfVar.getClass();
        armfVar2.getClass();
        xnvVar.getClass();
        armfVar3.getClass();
        armfVar4.getClass();
        uhjVar.getClass();
        this.d = armfVar2;
        this.b = armfVar3;
        this.c = armfVar4;
        this.a = xze.g("Bugle", "SmartSuggestionPersister");
    }

    public yyt(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, byte[] bArr, byte[] bArr2) {
        armfVar.getClass();
        this.a = armfVar;
        armfVar2.getClass();
        this.d = armfVar2;
        armfVar3.getClass();
        this.b = armfVar3;
        armfVar4.getClass();
        this.c = armfVar4;
    }

    public yyt(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, byte[] bArr) {
        armfVar.getClass();
        this.d = armfVar;
        armfVar2.getClass();
        this.c = armfVar2;
        armfVar3.getClass();
        this.b = armfVar3;
        armfVar4.getClass();
        this.a = armfVar4;
    }

    public yyt(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4) {
        armfVar.getClass();
        this.d = armfVar;
        armfVar2.getClass();
        this.c = armfVar2;
        armfVar3.getClass();
        this.a = armfVar3;
        armfVar4.getClass();
        this.b = armfVar4;
    }

    public yyt(armf armfVar, armf armfVar2, arwe arweVar, arwe arweVar2) {
        armfVar.getClass();
        armfVar2.getClass();
        arweVar.getClass();
        arweVar2.getClass();
        this.d = armfVar;
        this.c = armfVar2;
        this.a = arweVar;
        this.b = arweVar2;
    }
}
