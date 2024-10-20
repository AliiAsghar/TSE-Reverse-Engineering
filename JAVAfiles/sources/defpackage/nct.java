package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class nct {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/shared/api/messaging/protocol/ConversationRcsSelector");
    private static final alvz c = new alvz("is_rcs_available_convo_v1", Boolean.class, false, false);
    public final armf b;
    private final vqu d;
    private final psw e;
    private final armf f;
    private final armf g;
    private final ryg h;

    public nct(vqu vquVar, armf armfVar, psw pswVar, ryg rygVar, armf armfVar2, armf armfVar3) {
        this.d = vquVar;
        this.b = armfVar;
        this.e = pswVar;
        this.h = rygVar;
        this.f = armfVar2;
        this.g = armfVar3;
    }

    public static amjj a(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return amjj.UNKNOWN_SEND_MODE;
                }
                return amjj.SEND_MODE_XMS_LATCH;
            }
            return amjj.SEND_MODE_XMS;
        }
        return amjj.SEND_MODE_AUTO;
    }

    public static boolean g(amjj amjjVar) {
        int ordinal = amjjVar.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        alvw f = a.f();
                        f.X(alwp.a, "BugleDataModel");
                        ((alvg) ((alvg) f).h("com/google/android/apps/messaging/shared/api/messaging/protocol/ConversationRcsSelector", "isRcsSendingEnabledBySendModeStatic", 219, "ConversationRcsSelector.java")).q("RCS sending disabled, XMS latch in effect");
                        return false;
                    }
                    throw new IllegalArgumentException("Invalid send mode valie");
                }
                alvw f2 = a.f();
                f2.X(alwp.a, "BugleDataModel");
                ((alvg) ((alvg) f2).h("com/google/android/apps/messaging/shared/api/messaging/protocol/ConversationRcsSelector", "isRcsSendingEnabledBySendModeStatic", 216, "ConversationRcsSelector.java")).q("RCS sending disabled, XMS mode set");
                return false;
            }
            alvw f3 = a.f();
            f3.X(alwp.a, "BugleDataModel");
            ((alvg) ((alvg) f3).h("com/google/android/apps/messaging/shared/api/messaging/protocol/ConversationRcsSelector", "isRcsSendingEnabledBySendModeStatic", 222, "ConversationRcsSelector.java")).q("RCS sending AUTO mode set");
            return true;
        }
        alvw i = a.i();
        i.X(alwp.a, "BugleDataModel");
        ((alvg) ((alvg) i).h("com/google/android/apps/messaging/shared/api/messaging/protocol/ConversationRcsSelector", "isRcsSendingEnabledBySendModeStatic", 213, "ConversationRcsSelector.java")).q("RCS sending mode unknown");
        return false;
    }

    public final ammc b(Optional optional, int i) {
        boolean z;
        boolean O;
        boolean z2;
        alvi alviVar = a;
        alvw d = alviVar.d();
        d.X(alwp.a, "BugleDataModel");
        ((alvg) ((alvg) d).h("com/google/android/apps/messaging/shared/api/messaging/protocol/ConversationRcsSelector", "createDefaultRcsOneOnOneConditions", 117, "ConversationRcsSelector.java")).r("ConversationRcsSelector#createDefaultRcsOneOnOneConditions subId=%d", i);
        amwt amwtVar = ((adjc) this.b.b()).d(i).a;
        boolean w = ((adjc) this.b.b()).w(i);
        alvw d2 = alviVar.d();
        d2.X(alwp.a, "BugleDataModel");
        alvg alvgVar = (alvg) d2;
        alvgVar.X(ydl.t, Integer.valueOf(i));
        alvgVar.X(ydl.N, amwtVar.name());
        alvgVar.X(c, Boolean.valueOf(w));
        ((alvg) alvgVar.h("com/google/android/apps/messaging/shared/api/messaging/protocol/ConversationRcsSelector", "doCreateDefaultRcsOneOnOneConditions", 154, "ConversationRcsSelector.java")).q("ConversationRcsSelector#createDefaultRcsOneOnOneConditions RCS availability");
        aozy createBuilder = ammc.a.createBuilder();
        boolean z3 = false;
        if (optional.isPresent() && ((psv) optional.get()).f()) {
            z = true;
        } else {
            z = false;
        }
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        ammc ammcVar = (ammc) apagVar;
        ammcVar.b |= 2;
        ammcVar.d = z;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        ammc.a((ammc) createBuilder.b);
        if (((pcw) this.f.b()).a()) {
            if (i >= 0 && ((wfe) this.g.b()).m(i)) {
                O = true;
            } else {
                O = false;
            }
        } else {
            O = this.d.O();
        }
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        ammc ammcVar2 = (ammc) createBuilder.b;
        ammcVar2.b |= 8;
        ammcVar2.f = O;
        boolean z4 = !this.d.H();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        ammc ammcVar3 = (ammc) createBuilder.b;
        ammcVar3.b |= 16;
        ammcVar3.g = z4;
        if (optional.isPresent() && ((psv) optional.get()).h()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        ammc ammcVar4 = (ammc) createBuilder.b;
        ammcVar4.b |= 32;
        ammcVar4.h = z2;
        if (optional.isPresent() && ((psv) optional.get()).k()) {
            z3 = true;
        }
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar2 = createBuilder.b;
        ammc ammcVar5 = (ammc) apagVar2;
        ammcVar5.b |= 64;
        ammcVar5.i = z3;
        if (!apagVar2.isMutable()) {
            createBuilder.u();
        }
        apag apagVar3 = createBuilder.b;
        ammc ammcVar6 = (ammc) apagVar3;
        ammcVar6.b |= 128;
        ammcVar6.j = w;
        if (!apagVar3.isMutable()) {
            createBuilder.u();
        }
        apag apagVar4 = createBuilder.b;
        ammc ammcVar7 = (ammc) apagVar4;
        ammcVar7.k = amwtVar.E;
        ammcVar7.b |= 256;
        if (!apagVar4.isMutable()) {
            createBuilder.u();
        }
        ammc ammcVar8 = (ammc) createBuilder.b;
        ammcVar8.b |= 1;
        ammcVar8.c = w;
        return (ammc) createBuilder.s();
    }

    public final ammc c(int i, Optional optional) {
        akrh e = aktp.e("ConversationRcsSelector::getRcsOneOnOneConditions");
        try {
            Optional empty = Optional.empty();
            if (optional.isPresent()) {
                msh mshVar = (msh) optional.get();
                if (this.e.a()) {
                    empty = Optional.of(this.h.n(mshVar));
                } else {
                    empty = this.d.m(mshVar);
                }
            }
            ammc b = b(empty, i);
            e.close();
            return b;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final boolean d(ConversationIdType conversationIdType) {
        return this.d.D(conversationIdType);
    }

    public final boolean e(ammc ammcVar) {
        boolean z;
        if (ammcVar.c && ammcVar.d) {
            z = true;
        } else {
            z = false;
        }
        if (!ammcVar.e) {
            if (ammcVar.f && ammcVar.g && z) {
                return true;
            }
            return false;
        }
        return z;
    }

    public final boolean f(amjk amjkVar) {
        if (amjkVar != null && amjkVar.p && (amjkVar.b & 1024) != 0) {
            amfg b = amfg.b(amjkVar.f);
            if (b == null) {
                b = amfg.UNKNOWN_BUGLE_CONVERSATION_TYPE;
            }
            if (b.equals(amfg.CONVERSATION_TYPE_ONE_ON_ONE)) {
                ammc ammcVar = amjkVar.l;
                if (ammcVar == null) {
                    ammcVar = ammc.a;
                }
                if (!ammcVar.h) {
                    return true;
                }
            }
        }
        return false;
    }
}
