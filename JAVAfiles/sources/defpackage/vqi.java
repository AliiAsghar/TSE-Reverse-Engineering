package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vqi extends arpw implements arqv {
    Object a;
    int b;
    final /* synthetic */ MessageCoreData c;
    final /* synthetic */ msh d;
    final /* synthetic */ vqj e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vqi(MessageCoreData messageCoreData, msh mshVar, vqj vqjVar, arpe arpeVar) {
        super(2, arpeVar);
        this.c = messageCoreData;
        this.d = mshVar;
        this.e = vqjVar;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((vqi) c((arwe) obj, (arpe) obj2)).b(arnb.a);
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        Object obj2;
        arpl arplVar = arpl.a;
        if (this.b != 0) {
            obj2 = this.a;
            aqil.P(obj);
        } else {
            aqil.P(obj);
            rve E = this.c.E();
            aozy createBuilder = qgd.a.createBuilder();
            createBuilder.getClass();
            String f = E.f();
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            qgd qgdVar = (qgd) createBuilder.b;
            qgdVar.b |= 1;
            qgdVar.c = f;
            apag s = createBuilder.s();
            s.getClass();
            qgd qgdVar2 = (qgd) s;
            Optional e = this.d.e();
            e.getClass();
            Object k = arsd.k(e);
            if (k != null) {
                qei qeiVar = (qei) k;
                qei qeiVar2 = (qei) this.c.ac().flatMap(new viu(vnk.e, 8)).orElseThrow(new uzg(20));
                MessageCoreData messageCoreData = this.c;
                aozy createBuilder2 = qgb.a.createBuilder();
                createBuilder2.getClass();
                if (!createBuilder2.b.isMutable()) {
                    createBuilder2.u();
                }
                qgb qgbVar = (qgb) createBuilder2.b;
                qgbVar.c = qeiVar;
                qgbVar.b |= 1;
                String f2 = E.f();
                if (!createBuilder2.b.isMutable()) {
                    createBuilder2.u();
                }
                qgb qgbVar2 = (qgb) createBuilder2.b;
                qgbVar2.b |= 2;
                qgbVar2.d = f2;
                String a = messageCoreData.z().a();
                a.getClass();
                if (!createBuilder2.b.isMutable()) {
                    createBuilder2.u();
                }
                qgb qgbVar3 = (qgb) createBuilder2.b;
                qgbVar3.b |= 4;
                qgbVar3.e = a;
                aozb byteString = qgdVar2.toByteString();
                if (!createBuilder2.b.isMutable()) {
                    createBuilder2.u();
                }
                apag apagVar = createBuilder2.b;
                qgb qgbVar4 = (qgb) apagVar;
                qgbVar4.b = 8 | qgbVar4.b;
                qgbVar4.f = byteString;
                qeiVar2.getClass();
                if (!apagVar.isMutable()) {
                    createBuilder2.u();
                }
                qgb qgbVar5 = (qgb) createBuilder2.b;
                qgbVar5.g = qeiVar2;
                qgbVar5.b |= 16;
                apag s2 = createBuilder2.s();
                s2.getClass();
                akul d = ((pss) this.e.d.b()).d((qgb) s2);
                d.getClass();
                this.a = E;
                this.b = 1;
                Object F = arro.F(d, this);
                if (F != arplVar) {
                    obj2 = E;
                    obj = F;
                } else {
                    return arplVar;
                }
            } else {
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        qeg qegVar = ((qgc) obj).c;
        if (qegVar == null) {
            qegVar = qeg.a;
        }
        qef b = qef.b(qegVar.c);
        if (b == null) {
            b = qef.UNKNOWN_STATUS;
        }
        b.getClass();
        if (qef.OK != b && qef.PENDING != b) {
            ((mbl) this.e.e.b()).g("Bugle.Rcs.Chat.Message.Revoke.Send.Failed.Counts", 0L);
            alvw d2 = vqj.a.d();
            d2.X(alwp.a, "BugleAction");
            alvg alvgVar = (alvg) d2;
            alvgVar.X(ydl.e, ((rvf) obj2).f());
            ((alvg) alvgVar.h("com/google/android/apps/messaging/shared/rcs/RcsRevocationSenderImpl$revokeWithChatApi$2", "invokeSuspend", 95, "RcsRevocationSenderImpl.kt")).t("Failed to revoke, status: %s.", b.name());
            return false;
        }
        return true;
    }

    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        return new vqi(this.c, this.d, this.e, arpeVar);
    }
}
