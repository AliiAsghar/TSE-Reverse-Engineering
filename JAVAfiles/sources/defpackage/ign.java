package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ign extends arpw implements arqv {
    Object a;
    int b;
    int c;
    final /* synthetic */ iha d;
    final /* synthetic */ lrc e;
    final /* synthetic */ Object f;
    private final /* synthetic */ int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ign(igl iglVar, iha ihaVar, lrc lrcVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.g = i;
        this.f = iglVar;
        this.d = ihaVar;
        this.e = lrcVar;
    }

    @Override // defpackage.arqv
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        if (this.g != 0) {
            return ((ign) c((arwe) obj, (arpe) obj2)).b(arnb.a);
        }
        return ((ign) c((arwe) obj, (arpe) obj2)).b(arnb.a);
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        Boolean bool;
        amfe amfeVar;
        Object f;
        Object obj2;
        int i;
        boolean z;
        arqg bpVar;
        Boolean bool2;
        amfe amfeVar2;
        Object f2;
        Object obj3;
        int i2;
        boolean z2;
        arqg arqgVar;
        if (this.g != 0) {
            arpl arplVar = arpl.a;
            int i3 = this.c;
            if (i3 != 0) {
                if (i3 != 1) {
                    aqil.P(obj);
                    return arnb.a;
                }
                i2 = this.b;
                obj3 = this.a;
                aqil.P(obj);
                f2 = obj;
            } else {
                aqil.P(obj);
                if (((igl) this.f).d.d) {
                    bool2 = true;
                } else {
                    bool2 = null;
                }
                Object obj4 = this.f;
                iha ihaVar = this.d;
                ResolvedRecipient resolvedRecipient = ihaVar.a;
                resolvedRecipient.getClass();
                iha ihaVar2 = this.d;
                this.a = bool2;
                this.b = 1;
                this.c = 1;
                ConversationIdType b = ruy.b(ihaVar.b.b());
                if (d.F(true, true)) {
                    amfeVar2 = amfe.CONVERSATION_FROM_UNBLOCK_ACTION;
                } else {
                    amfeVar2 = amfe.CONVERSATION_FROM_UNSPAM_ACTION;
                }
                f2 = ((yyz) ((igl) obj4).c.b()).f(yyb.bp(true, bool2, b, resolvedRecipient, amfeVar2, ihaVar2.f, 4, null, 2132), this);
                if (f2 != arplVar) {
                    obj3 = bool2;
                    i2 = 1;
                } else {
                    return arplVar;
                }
            }
            if (1 != i2) {
                z2 = false;
            } else {
                z2 = true;
            }
            xxn xxnVar = (xxn) f2;
            this.e.a();
            iha ihaVar3 = this.d;
            Object obj5 = this.f;
            ResolvedRecipient resolvedRecipient2 = ihaVar3.a;
            resolvedRecipient2.getClass();
            String obj6 = resolvedRecipient2.f().G(true).toString();
            Boolean valueOf = Boolean.valueOf(z2);
            if (xxnVar != null) {
                arqgVar = new bp(this.f, this.d, xxnVar, 7, null);
            } else {
                arqgVar = gqj.j;
            }
            ifb ifbVar = ((igl) obj5).g;
            this.a = null;
            this.c = 2;
            if (ifbVar.a(obj6, valueOf, (Boolean) obj3, arqgVar, this) == arplVar) {
                return arplVar;
            }
            return arnb.a;
        }
        arpl arplVar2 = arpl.a;
        int i4 = this.c;
        if (i4 != 0) {
            if (i4 != 1) {
                aqil.P(obj);
                return arnb.a;
            }
            int i5 = this.b;
            Object obj7 = this.a;
            aqil.P(obj);
            obj2 = obj7;
            i = i5;
            f = obj;
        } else {
            aqil.P(obj);
            if (((igo) this.f).d.d) {
                bool = true;
            } else {
                bool = null;
            }
            Object obj8 = this.f;
            iha ihaVar4 = this.d;
            ResolvedRecipient resolvedRecipient3 = ihaVar4.a;
            resolvedRecipient3.getClass();
            iha ihaVar5 = this.d;
            this.a = bool;
            this.b = 1;
            this.c = 1;
            ConversationIdType b2 = ruy.b(ihaVar4.b.b());
            if (d.F(bool, true)) {
                amfeVar = amfe.CONVERSATION_FROM_UNBLOCK_ACTION;
            } else {
                amfeVar = amfe.CONVERSATION_FROM_UNSPAM_ACTION;
            }
            f = ((yyz) ((igo) obj8).c.b()).f(yyb.bp(bool, true, b2, resolvedRecipient3, amfeVar, ihaVar5.f, 4, null, 2132), this);
            if (f != arplVar2) {
                obj2 = bool;
                i = 1;
            } else {
                return arplVar2;
            }
        }
        if (1 != i) {
            z = false;
        } else {
            z = true;
        }
        xxn xxnVar2 = (xxn) f;
        this.e.a();
        iha ihaVar6 = this.d;
        Object obj9 = this.f;
        ResolvedRecipient resolvedRecipient4 = ihaVar6.a;
        resolvedRecipient4.getClass();
        String obj10 = resolvedRecipient4.f().G(true).toString();
        Boolean valueOf2 = Boolean.valueOf(z);
        if (xxnVar2 == null) {
            bpVar = gqj.l;
        } else {
            bpVar = new bp(this.f, this.d, xxnVar2, 11, null);
        }
        ifb ifbVar2 = ((igo) obj9).g;
        this.a = null;
        this.c = 2;
        if (ifbVar2.a(obj10, (Boolean) obj2, valueOf2, bpVar, this) == arplVar2) {
            return arplVar2;
        }
        return arnb.a;
    }

    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        if (this.g != 0) {
            return new ign((igl) this.f, this.d, this.e, arpeVar, 1);
        }
        return new ign((igo) this.f, this.d, this.e, arpeVar, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ign(igo igoVar, iha ihaVar, lrc lrcVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.g = i;
        this.f = igoVar;
        this.d = ihaVar;
        this.e = lrcVar;
    }
}
