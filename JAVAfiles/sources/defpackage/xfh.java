package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xfh implements xfe {
    public final xgj a;
    public final anen b;
    private final armf c;
    private final armf d;
    private final /* synthetic */ int e;

    public xfh(xgj xgjVar, armf armfVar, armf armfVar2, anen anenVar, int i) {
        this.e = i;
        this.a = xgjVar;
        this.c = armfVar;
        this.d = armfVar2;
        this.b = anenVar;
    }

    @Override // defpackage.xfe
    public final /* synthetic */ qei a(Object obj) {
        int i = this.e;
        if (i != 0) {
            if (i != 1) {
                qei qeiVar = ((qgb) obj).c;
                if (qeiVar == null) {
                    return qei.a;
                }
                return qeiVar;
            }
            qfb qfbVar = ((qec) obj).c;
            if (qfbVar == null) {
                qfbVar = qfb.a;
            }
            qei qeiVar2 = qfbVar.d;
            if (qeiVar2 == null) {
                return qei.a;
            }
            return qeiVar2;
        }
        qfb qfbVar2 = ((qfy) obj).c;
        if (qfbVar2 == null) {
            qfbVar2 = qfb.a;
        }
        qei qeiVar3 = qfbVar2.d;
        if (qeiVar3 == null) {
            return qei.a;
        }
        return qeiVar3;
    }

    @Override // defpackage.xfe
    public final /* synthetic */ qei b(Object obj) {
        int i = this.e;
        boolean z = false;
        if (i != 0) {
            if (i != 1) {
                qgb qgbVar = (qgb) obj;
                if ((qgbVar.b & 16) != 0) {
                    z = true;
                }
                d.t(z, "Self identity is missing in RevokeChatMessageRequest");
                qei qeiVar = qgbVar.g;
                if (qeiVar == null) {
                    return qei.a;
                }
                return qeiVar;
            }
            qec qecVar = (qec) obj;
            if ((qecVar.b & 4) != 0) {
                z = true;
            }
            d.t(z, "Self identity is missing in AddUserToGroupChatRequest");
            qei qeiVar2 = qecVar.f;
            if (qeiVar2 == null) {
                return qei.a;
            }
            return qeiVar2;
        }
        qfy qfyVar = (qfy) obj;
        if ((qfyVar.b & 4) != 0) {
            z = true;
        }
        d.t(z, "Self identity is missing in RemoveUserFromGroupChatRequest");
        qei qeiVar3 = qfyVar.f;
        if (qeiVar3 == null) {
            return qei.a;
        }
        return qeiVar3;
    }

    @Override // defpackage.xfe
    public final /* synthetic */ akul d(Object obj) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int i = this.e;
        boolean z5 = false;
        if (i != 0) {
            if (i != 1) {
                qgb qgbVar = (qgb) obj;
                if ((qgbVar.b & 16) != 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                d.t(z3, "sender is missing");
                if (1 != (qgbVar.b & 1)) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                d.t(z4, "recipient is missing");
                qei qeiVar = qgbVar.g;
                if (qeiVar == null) {
                    qeiVar = qei.a;
                }
                qei qeiVar2 = qgbVar.c;
                wpp wppVar = (wpp) this.d.b();
                qei qeiVar3 = qgbVar.c;
                if (qeiVar3 == null) {
                    qeiVar3 = qei.a;
                }
                akul h = wppVar.f(qeiVar3, qgbVar.e).h(new xeu(qgbVar, 8), this.b);
                xgj xgjVar = this.a;
                qeiVar.getClass();
                akul d = xgjVar.d(qeiVar, null);
                return aktp.an(h, d).i(akto.c(new uvj(h, d, 20)), this.b);
            }
            qec qecVar = (qec) obj;
            if (qecVar.d.size() != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            albo.T(z2);
            if ((qecVar.b & 4) != 0) {
                z5 = true;
            }
            albo.T(z5);
            znj znjVar = (znj) this.d.b();
            qfb qfbVar = qecVar.c;
            if (qfbVar == null) {
                qfbVar = qfb.a;
            }
            return znjVar.V(qfbVar).i(new wkh(this, qecVar, 9, null), this.b);
        }
        qfy qfyVar = (qfy) obj;
        if (qfyVar.d.size() != 0) {
            z = true;
        } else {
            z = false;
        }
        albo.T(z);
        if ((qfyVar.b & 4) != 0) {
            z5 = true;
        }
        albo.T(z5);
        znj znjVar2 = (znj) this.d.b();
        qfb qfbVar2 = qfyVar.c;
        if (qfbVar2 == null) {
            qfbVar2 = qfb.a;
        }
        return znjVar2.V(qfbVar2).i(new wkh(this, qfyVar, 16, null), this.b);
    }

    @Override // defpackage.xfe
    public final /* synthetic */ akul e(Object obj, qeg qegVar) {
        int i = this.e;
        if (i != 0) {
            if (i != 1) {
                qgb qgbVar = (qgb) obj;
                alwl alwlVar = (alwl) xfj.a.i();
                alwlVar.X(ydl.o, qgbVar.e);
                alwlVar.X(ydl.a, qgbVar.d);
                alvz alvzVar = qas.b;
                qef b = qef.b(qegVar.c);
                if (b == null) {
                    b = qef.UNKNOWN_STATUS;
                }
                alwlVar.X(alvzVar, b);
                ((alwl) alwlVar.h("com/google/android/apps/messaging/shared/tachygram/chat/TachygramRevokeMessageWorkHandler$TachygramRevokeMessageOperation", "onFailure", 170, "TachygramRevokeMessageWorkHandler.java")).q("TachygramTransport has failed to revoke the message.");
                qco qcoVar = (qco) this.c.b();
                aozb aozbVar = qgbVar.f;
                aozy createBuilder = qgc.a.createBuilder();
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                apag apagVar = createBuilder.b;
                qgc qgcVar = (qgc) apagVar;
                aozbVar.getClass();
                qgcVar.b |= 2;
                qgcVar.d = aozbVar;
                if (!apagVar.isMutable()) {
                    createBuilder.u();
                }
                qgc qgcVar2 = (qgc) createBuilder.b;
                qegVar.getClass();
                qgcVar2.c = qegVar;
                qgcVar2.b |= 1;
                return qcoVar.h((qgc) createBuilder.s());
            }
            qco qcoVar2 = (qco) this.c.b();
            aozb aozbVar2 = ((qec) obj).e;
            aozy createBuilder2 = qed.a.createBuilder();
            if (!createBuilder2.b.isMutable()) {
                createBuilder2.u();
            }
            apag apagVar2 = createBuilder2.b;
            qed qedVar = (qed) apagVar2;
            aozbVar2.getClass();
            qedVar.b |= 2;
            qedVar.d = aozbVar2;
            if (!apagVar2.isMutable()) {
                createBuilder2.u();
            }
            qed qedVar2 = (qed) createBuilder2.b;
            qegVar.getClass();
            qedVar2.c = qegVar;
            qedVar2.b |= 1;
            return qcoVar2.b((qed) createBuilder2.s());
        }
        qco qcoVar3 = (qco) this.c.b();
        aozb aozbVar3 = ((qfy) obj).e;
        aozy createBuilder3 = qfz.a.createBuilder();
        if (!createBuilder3.b.isMutable()) {
            createBuilder3.u();
        }
        apag apagVar3 = createBuilder3.b;
        qfz qfzVar = (qfz) apagVar3;
        aozbVar3.getClass();
        qfzVar.b |= 2;
        qfzVar.d = aozbVar3;
        if (!apagVar3.isMutable()) {
            createBuilder3.u();
        }
        qfz qfzVar2 = (qfz) createBuilder3.b;
        qegVar.getClass();
        qfzVar2.c = qegVar;
        qfzVar2.b |= 1;
        return qcoVar3.g((qfz) createBuilder3.s());
    }

    @Override // defpackage.xfe
    public final /* synthetic */ akul f(Object obj, Object obj2) {
        int i = this.e;
        if (i != 0) {
            if (i != 1) {
                qgb qgbVar = (qgb) obj;
                alwl alwlVar = (alwl) xfj.a.g();
                alwlVar.X(ydl.a, qgbVar.d);
                alwlVar.X(ydl.o, qgbVar.e);
                ((alwl) alwlVar.h("com/google/android/apps/messaging/shared/tachygram/chat/TachygramRevokeMessageWorkHandler$TachygramRevokeMessageOperation", "onSuccess", 155, "TachygramRevokeMessageWorkHandler.java")).q("TachygramTransport has successfully processed message revoking.");
                qco qcoVar = (qco) this.c.b();
                aozb aozbVar = qgbVar.f;
                qef qefVar = qef.OK;
                aozy createBuilder = qgc.a.createBuilder();
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                qgc qgcVar = (qgc) createBuilder.b;
                aozbVar.getClass();
                qgcVar.b |= 2;
                qgcVar.d = aozbVar;
                aozy createBuilder2 = qeg.a.createBuilder();
                if (!createBuilder2.b.isMutable()) {
                    createBuilder2.u();
                }
                qeg qegVar = (qeg) createBuilder2.b;
                qegVar.c = qefVar.f;
                qegVar.b |= 1;
                qeg qegVar2 = (qeg) createBuilder2.s();
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                qgc qgcVar2 = (qgc) createBuilder.b;
                qegVar2.getClass();
                qgcVar2.c = qegVar2;
                qgcVar2.b |= 1;
                return qcoVar.h((qgc) createBuilder.s());
            }
            qco qcoVar2 = (qco) this.c.b();
            aozb aozbVar2 = ((qec) obj).e;
            qef qefVar2 = qef.OK;
            aozy createBuilder3 = qed.a.createBuilder();
            if (!createBuilder3.b.isMutable()) {
                createBuilder3.u();
            }
            qed qedVar = (qed) createBuilder3.b;
            aozbVar2.getClass();
            qedVar.b |= 2;
            qedVar.d = aozbVar2;
            aozy createBuilder4 = qeg.a.createBuilder();
            if (!createBuilder4.b.isMutable()) {
                createBuilder4.u();
            }
            qeg qegVar3 = (qeg) createBuilder4.b;
            qegVar3.c = qefVar2.f;
            qegVar3.b |= 1;
            qeg qegVar4 = (qeg) createBuilder4.s();
            if (!createBuilder3.b.isMutable()) {
                createBuilder3.u();
            }
            qed qedVar2 = (qed) createBuilder3.b;
            qegVar4.getClass();
            qedVar2.c = qegVar4;
            qedVar2.b |= 1;
            return qcoVar2.b((qed) createBuilder3.s());
        }
        qco qcoVar3 = (qco) this.c.b();
        aozb aozbVar3 = ((qfy) obj).e;
        qef qefVar3 = qef.OK;
        aozy createBuilder5 = qfz.a.createBuilder();
        if (!createBuilder5.b.isMutable()) {
            createBuilder5.u();
        }
        qfz qfzVar = (qfz) createBuilder5.b;
        aozbVar3.getClass();
        qfzVar.b |= 2;
        qfzVar.d = aozbVar3;
        aozy createBuilder6 = qeg.a.createBuilder();
        if (!createBuilder6.b.isMutable()) {
            createBuilder6.u();
        }
        qeg qegVar5 = (qeg) createBuilder6.b;
        qegVar5.c = qefVar3.f;
        qegVar5.b |= 1;
        qeg qegVar6 = (qeg) createBuilder6.s();
        if (!createBuilder5.b.isMutable()) {
            createBuilder5.u();
        }
        qfz qfzVar2 = (qfz) createBuilder5.b;
        qegVar6.getClass();
        qfzVar2.c = qegVar6;
        qfzVar2.b |= 1;
        return qcoVar3.g((qfz) createBuilder5.s());
    }

    @Override // defpackage.xfe
    public final /* synthetic */ String g(Object obj) {
        int i = this.e;
        if (i != 0) {
            if (i != 1) {
                qgb qgbVar = (qgb) obj;
                qei qeiVar = qgbVar.c;
                if (qeiVar == null) {
                    qeiVar = qei.a;
                }
                qeh b = qeh.b(qeiVar.c);
                if (b == null) {
                    b = qeh.UNKNOWN_TYPE;
                }
                albo.U(b.equals(qeh.GROUP), "getRcsGroupId called on a non-group operation.");
                return qgbVar.e;
            }
            qfb qfbVar = ((qec) obj).c;
            if (qfbVar == null) {
                qfbVar = qfb.a;
            }
            return qfbVar.c;
        }
        qfb qfbVar2 = ((qfy) obj).c;
        if (qfbVar2 == null) {
            qfbVar2 = qfb.a;
        }
        return qfbVar2.c;
    }

    @Override // defpackage.xfe
    public final String h() {
        int i = this.e;
        if (i != 0) {
            if (i != 1) {
                return "TachygramRevokeMessageOperation";
            }
            return "TachygramAddUserToGroupOperation";
        }
        return "TachygramRemoveUserFromGroupOperation";
    }

    @Override // defpackage.xfe
    public final boolean i() {
        return false;
    }
}
