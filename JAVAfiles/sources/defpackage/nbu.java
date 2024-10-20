package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.statsdata.MessageUsageStatisticsDataImpl;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class nbu extends arpw implements arqv {
    int a;
    final /* synthetic */ nfw b;
    final /* synthetic */ mll c;
    final /* synthetic */ kjp d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nbu(nfw nfwVar, mll mllVar, kjp kjpVar, arpe arpeVar) {
        super(2, arpeVar);
        this.b = nfwVar;
        this.c = mllVar;
        this.d = kjpVar;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((nbu) c((arwe) obj, (arpe) obj2)).b(arnb.a);
    }

    /* JADX WARN: Type inference failed for: r1v32, types: [psz, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, vqu] */
    @Override // defpackage.arpq
    public final Object b(Object obj) {
        Object F;
        amgk amgkVar;
        amgh amghVar;
        ammd ammdVar;
        int i;
        arpl arplVar = arpl.a;
        int i2 = this.a;
        aqil.P(obj);
        if (i2 != 0) {
            F = obj;
        } else {
            akul b = this.b.d().b();
            b.getClass();
            this.a = 1;
            F = arro.F(b, this);
            if (F == arplVar) {
                return arplVar;
            }
        }
        mll mllVar = this.c;
        ngh nghVar = (ngh) F;
        amgj amgjVar = amgj.MESSAGE_SEND_RETRY;
        int r = mllVar.r();
        amgi amgiVar = amgi.RESEND_ATTEMPT;
        amge amgeVar = amge.UNKNOWN_INSTANT_MESSAGING_ALWAYS_ON;
        if (mllVar.E()) {
            amgkVar = amgk.WAS_RCS_CONVERSATION;
        } else {
            amgkVar = amgk.HAS_ALWAYS_BEEN_XMS_CONVERSATION;
        }
        amgk amgkVar2 = amgkVar;
        kjp kjpVar = this.d;
        mll mllVar2 = this.c;
        nfw nfwVar = this.b;
        boolean a = nghVar.a();
        if (mllVar2.b() == mit.GROUP) {
            amghVar = amgh.GROUP_CONVERSATION;
        } else if (mllVar2.x() == amjj.SEND_MODE_XMS) {
            amghVar = amgh.CONVERSATION_SET_TO_XMS_ONLY;
        } else if (!a) {
            amghVar = amgh.SENDER_NOT_AVAILABLE_RCS_AVAILABILITIES_ISSUES;
        } else {
            Optional c = kjpVar.c(mllVar2, nfwVar);
            if (c.isEmpty()) {
                amghVar = amgh.RECEIVER_NOT_AVAILABLE;
            } else {
                Optional m = kjpVar.b.m((msh) c.get());
                m.getClass();
                if (!m.isEmpty() && ((psv) m.get()).f()) {
                    if (mllVar2.x() == amjj.SEND_MODE_XMS_LATCH) {
                        amghVar = amgh.CONVERSATION_LATCHED_TO_XMS;
                    } else {
                        amghVar = amgh.OTHER_REASON;
                    }
                } else {
                    amghVar = amgh.RECEIVER_NOT_AVAILABLE;
                }
            }
        }
        amgh amghVar2 = amghVar;
        kjp kjpVar2 = this.d;
        mll mllVar3 = this.c;
        Optional c2 = kjpVar2.c(mllVar3, this.b);
        int i3 = 2;
        if (c2.isPresent()) {
            ammdVar = kjpVar2.d.d((msh) c2.get());
        } else {
            aozy createBuilder = ammd.a.createBuilder();
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            ammd ammdVar2 = (ammd) createBuilder.b;
            ammdVar2.d = 0;
            ammdVar2.c = 2;
            ammdVar = (ammd) createBuilder.s();
        }
        aozy createBuilder2 = amjk.a.createBuilder();
        amfg v = lgb.v(Integer.valueOf(mllVar3.r()));
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        apag apagVar = createBuilder2.b;
        amjk amjkVar = (amjk) apagVar;
        amjkVar.f = v.f;
        amjkVar.b |= 8;
        if (mllVar3.x() == amjj.SEND_MODE_XMS) {
            i = 3;
        } else {
            i = 2;
        }
        if (!apagVar.isMutable()) {
            createBuilder2.u();
        }
        apag apagVar2 = createBuilder2.b;
        amjk amjkVar2 = (amjk) apagVar2;
        amjkVar2.g = i - 1;
        amjkVar2.b |= 16;
        if (mllVar3.x() == amjj.SEND_MODE_XMS_LATCH) {
            i3 = 3;
        }
        if (!apagVar2.isMutable()) {
            createBuilder2.u();
        }
        apag apagVar3 = createBuilder2.b;
        amjk amjkVar3 = (amjk) apagVar3;
        amjkVar3.h = i3 - 1;
        amjkVar3.b |= 32;
        if (!apagVar3.isMutable()) {
            createBuilder2.u();
        }
        amjk amjkVar4 = (amjk) createBuilder2.b;
        ammdVar.getClass();
        amjkVar4.i = ammdVar;
        amjkVar4.b |= 128;
        apag s = createBuilder2.s();
        s.getClass();
        return new MessageUsageStatisticsDataImpl(amgjVar, null, r, amgiVar, amgeVar, amgkVar2, amghVar2, (amjk) s, nghVar.ordinal(), ((xnv) this.d.c).f().toEpochMilli());
    }

    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        return new nbu(this.b, this.c, this.d, arpeVar);
    }
}
