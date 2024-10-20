package defpackage;

import java.util.concurrent.ScheduledFuture;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class vfq implements algk {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ vfq(Object obj, boolean z, int i) {
        this.c = i;
        this.b = obj;
        this.a = z;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [vcu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v15, types: [vcu, java.lang.Object] */
    @Override // defpackage.algk
    public final Object apply(Object obj) {
        aozy S;
        int i = this.c;
        int i2 = 1;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        zxk zxkVar = (zxk) obj;
                        aozy builder = zxkVar.toBuilder();
                        if (!builder.b.isMutable()) {
                            builder.u();
                        }
                        boolean z = this.a;
                        apag apagVar = builder.b;
                        zxk zxkVar2 = (zxk) apagVar;
                        zxkVar2.b = 2 | zxkVar2.b;
                        zxkVar2.d = z;
                        float f = zxkVar.c;
                        if (!apagVar.isMutable()) {
                            builder.u();
                        }
                        Object obj2 = this.b;
                        zxk zxkVar3 = (zxk) builder.b;
                        zxkVar3.b = 1 | zxkVar3.b;
                        zxkVar3.c = f;
                        zxk zxkVar4 = (zxk) builder.s();
                        if (!z) {
                            ((mbl) ((zxm) obj2).b.b()).c("Bugle.ConversationScale.ConversationScaleDisableCount.Count");
                        } else {
                            ((mbl) ((zxm) obj2).b.b()).c("Bugle.ConversationScale.ConversationScaleEnableCount.Count");
                        }
                        return zxkVar4;
                    }
                    yfq yfqVar = (yfq) obj;
                    boolean z2 = this.a;
                    Object obj3 = this.b;
                    if (z2) {
                        aozy builder2 = yfqVar.toBuilder();
                        if (!builder2.b.isMutable()) {
                            builder2.u();
                        }
                        yfq yfqVar2 = (yfq) builder2.b;
                        yfqVar2.b |= 4;
                        yfqVar2.e = true;
                        int intValue = ((Integer) yfs.a.e()).intValue();
                        if (!builder2.b.isMutable()) {
                            builder2.u();
                        }
                        yfq yfqVar3 = (yfq) builder2.b;
                        yfqVar3.b = 1 | yfqVar3.b;
                        yfqVar3.c = intValue;
                        int intValue2 = ((Integer) yfs.b.e()).intValue();
                        if (!builder2.b.isMutable()) {
                            builder2.u();
                        }
                        yfq yfqVar4 = (yfq) builder2.b;
                        yfqVar4.b |= 2;
                        yfqVar4.d = intValue2;
                        yfq yfqVar5 = (yfq) builder2.s();
                        ((mbl) ((yfr) obj3).b.b()).c("Bugle.Media.FastImageSending.OptIn.Count");
                        return yfqVar5;
                    }
                    aozy builder3 = yfqVar.toBuilder();
                    if (!builder3.b.isMutable()) {
                        builder3.u();
                    }
                    yfq yfqVar6 = (yfq) builder3.b;
                    yfqVar6.b |= 4;
                    yfqVar6.e = false;
                    int intValue3 = ((Integer) yfs.c.e()).intValue();
                    if (!builder3.b.isMutable()) {
                        builder3.u();
                    }
                    yfq yfqVar7 = (yfq) builder3.b;
                    yfqVar7.b = 1 | yfqVar7.b;
                    yfqVar7.c = intValue3;
                    int intValue4 = ((Integer) yfs.d.e()).intValue();
                    if (!builder3.b.isMutable()) {
                        builder3.u();
                    }
                    yfq yfqVar8 = (yfq) builder3.b;
                    yfqVar8.b |= 2;
                    yfqVar8.d = intValue4;
                    yfq yfqVar9 = (yfq) builder3.s();
                    ((mbl) ((yfr) obj3).b.b()).c("Bugle.Media.FastImageSending.OptOut.Count");
                    return yfqVar9;
                }
                xze xzeVar = whj.a;
                aozy builder4 = ((whc) obj).toBuilder();
                Object obj4 = this.b;
                obj4.getClass();
                if (!builder4.b.isMutable()) {
                    builder4.u();
                }
                whc whcVar = (whc) builder4.b;
                apbo apboVar = whcVar.d;
                if (!apboVar.b) {
                    whcVar.d = apboVar.a();
                }
                whcVar.d.put(obj4, Boolean.valueOf(this.a));
                return (whc) builder4.s();
            }
            mfb mfbVar = (mfb) obj;
            aozy builder5 = mfbVar.toBuilder();
            Object obj5 = this.b;
            if (this.a) {
                mex mexVar = (mex) obj5;
                int aJ = a.aJ(mexVar.c);
                if (aJ == 0) {
                    aJ = 1;
                }
                int i3 = aJ - 1;
                if (i3 != 1) {
                    if (i3 != 2) {
                        if (i3 == 3) {
                            int i4 = mexVar.g;
                            if (!builder5.b.isMutable()) {
                                builder5.u();
                            }
                            apag apagVar2 = builder5.b;
                            mfb mfbVar2 = (mfb) apagVar2;
                            mfbVar2.b |= 8;
                            mfbVar2.f = i4;
                            if ((mexVar.b & 32) != 0) {
                                int e = aotl.e(mexVar.h);
                                if (e != 0) {
                                    i2 = e;
                                }
                                if (!apagVar2.isMutable()) {
                                    builder5.u();
                                }
                                mfb mfbVar3 = (mfb) builder5.b;
                                mfbVar3.g = i2 - 1;
                                mfbVar3.b |= 16;
                            }
                        }
                    } else if (mfc.g(mexVar)) {
                        int i5 = mexVar.g;
                        if (!builder5.b.isMutable()) {
                            builder5.u();
                        }
                        mfb mfbVar4 = (mfb) builder5.b;
                        mfbVar4.b |= 64;
                        mfbVar4.j = i5;
                    } else {
                        int i6 = mexVar.g;
                        if (!builder5.b.isMutable()) {
                            builder5.u();
                        }
                        apag apagVar3 = builder5.b;
                        mfb mfbVar5 = (mfb) apagVar3;
                        mfbVar5.b |= 4;
                        mfbVar5.e = i6;
                        int i7 = mexVar.i;
                        if (!apagVar3.isMutable()) {
                            builder5.u();
                        }
                        mfb mfbVar6 = (mfb) builder5.b;
                        mfbVar6.b |= 32;
                        mfbVar6.i = i7;
                    }
                } else if (mfc.g(mexVar)) {
                    int i8 = mexVar.g;
                    if (!builder5.b.isMutable()) {
                        builder5.u();
                    }
                    mfb mfbVar7 = (mfb) builder5.b;
                    mfbVar7.b |= 64;
                    mfbVar7.j = i8;
                } else {
                    int i9 = mexVar.f;
                    if (!builder5.b.isMutable()) {
                        builder5.u();
                    }
                    apag apagVar4 = builder5.b;
                    mfb mfbVar8 = (mfb) apagVar4;
                    mfbVar8.b = 1 | mfbVar8.b;
                    mfbVar8.c = i9;
                    int i10 = mexVar.g;
                    if (!apagVar4.isMutable()) {
                        builder5.u();
                    }
                    mfb mfbVar9 = (mfb) builder5.b;
                    mfbVar9.b = 2 | mfbVar9.b;
                    mfbVar9.d = i10;
                }
            }
            if (mfbVar.h.size() == 10) {
                if (!builder5.b.isMutable()) {
                    builder5.u();
                }
                mfb mfbVar10 = (mfb) builder5.b;
                mfbVar10.a();
                mfbVar10.h.remove(0);
            }
            if (!builder5.b.isMutable()) {
                builder5.u();
            }
            mfb mfbVar11 = (mfb) builder5.b;
            obj5.getClass();
            mfbVar11.a();
            mfbVar11.h.add(obj5);
            return (mfb) builder5.s();
        }
        Object obj6 = this.b;
        Object obj7 = ((vfv) obj6).m;
        aqfg aqfgVar = (aqfg) obj;
        boolean z3 = this.a;
        synchronized (obj7) {
            if (((vfv) obj6).l == null) {
                alvw g = vfv.c.g();
                g.X(alwp.a, "BugleNetwork");
                ((alvg) ((alvg) g).h("com/google/android/apps/messaging/shared/net/handler/bindhandler/BindHandlerImpl", "startStreamIfNotStarted", 397, "BindHandlerImpl.java")).t("%s BindHandler: Starting new receiveMessages", akec.aD(((vfv) obj6).E));
                ((vfv) obj6).l = new vfu((vfv) obj6);
                vfu vfuVar = ((vfv) obj6).l;
                String j = ((vfv) obj6).x.j();
                if (((vfv) obj6).B) {
                    S = ((vfv) obj6).F.T(j);
                } else {
                    S = ((vfv) obj6).F.S(j);
                }
                aozb aozbVar = aqfgVar.b;
                if (!S.b.isMutable()) {
                    S.u();
                }
                aqgb aqgbVar = (aqgb) S.b;
                aqgb aqgbVar2 = aqgb.a;
                aozbVar.getClass();
                aqgbVar.e = aozbVar;
                aozy createBuilder = aqec.a.createBuilder();
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                aqec aqecVar = (aqec) createBuilder.b;
                aqgb aqgbVar3 = (aqgb) S.s();
                aqgbVar3.getClass();
                aqecVar.c = aqgbVar3;
                aqecVar.b = 1 | aqecVar.b;
                aqec aqecVar2 = (aqec) createBuilder.s();
                alvw d = vfv.c.d();
                d.X(alwp.a, "BugleNetwork");
                alvg alvgVar = (alvg) ((alvg) d).h("com/google/android/apps/messaging/shared/net/handler/bindhandler/BindHandlerImpl", "startStreamIfNotStarted", 402, "BindHandlerImpl.java");
                String aD = akec.aD(((vfv) obj6).E);
                aqgb aqgbVar4 = aqecVar2.c;
                if (aqgbVar4 == null) {
                    aqgbVar4 = aqgb.a;
                }
                alvgVar.D("%s BindHandler: starting rpc receiveMessages. requestId: %s", aD, aqgbVar4.c);
                ((vfv) obj6).d.f(aqecVar2, vfuVar);
            }
            if (z3) {
                ScheduledFuture scheduledFuture = ((vfv) obj6).o;
                ((vfv) obj6).h();
                if (((vfv) obj6).y.isPresent() && scheduledFuture == null) {
                    alvw g2 = vfv.c.g();
                    g2.X(alwp.a, "BugleNetwork");
                    ((alvg) ((alvg) g2).h("com/google/android/apps/messaging/shared/net/handler/bindhandler/BindHandlerImpl", "startStreamIfNotStarted", 412, "BindHandlerImpl.java")).t("%s BindHandler: Notifying listener that a bind session has started.", akec.aD(((vfv) obj6).E));
                    Object obj8 = ((vfv) obj6).y.get();
                    ((vjs) obj8).a.c();
                    ((vjs) obj8).a.d();
                }
            }
        }
        return null;
    }

    public /* synthetic */ vfq(boolean z, mex mexVar, int i) {
        this.c = i;
        this.a = z;
        this.b = mexVar;
    }
}
