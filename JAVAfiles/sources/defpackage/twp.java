package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import java.util.concurrent.Callable;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class twp extends unp {
    public static final xze a = xze.g("BugleEtouffee", "DowngradeOnUnencryptedMessageHandler");
    public final armf b;
    public final armf c;
    public final armf d;
    public final armf e;
    public final armf f;
    public final armf g;
    public final armf h;
    public final armf i;
    public final armf j;
    public final armf k;
    public final armf l;
    public final armf m;
    public final armf n;
    private final armf o;
    private final anen p;

    public twp(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, armf armfVar7, armf armfVar8, armf armfVar9, armf armfVar10, armf armfVar11, anen anenVar, armf armfVar12, armf armfVar13, armf armfVar14) {
        this.c = armfVar;
        this.d = armfVar2;
        this.e = armfVar3;
        this.h = armfVar5;
        this.b = armfVar6;
        this.g = armfVar7;
        this.o = armfVar8;
        this.i = armfVar9;
        this.k = armfVar10;
        this.l = armfVar11;
        this.p = anenVar;
        this.j = armfVar12;
        this.m = armfVar13;
        this.n = armfVar14;
        this.f = armfVar4;
    }

    @Override // defpackage.unx
    public final akrh c() {
        return aktp.e("DowngradeOnUnencryptedMessageHandler");
    }

    @Override // defpackage.unp
    protected final /* bridge */ /* synthetic */ akul d(final uns unsVar, apbt apbtVar) {
        final twr twrVar = (twr) apbtVar;
        final boolean booleanValue = ((Boolean) new mss(11).get()).booleanValue();
        return aktp.ai(new Callable() { // from class: two
            @Override // java.util.concurrent.Callable
            public final Object call() {
                rto rtoVar;
                String str;
                tuk tukVar;
                twp twpVar = twp.this;
                ahqq a2 = ((mgv) twpVar.b.b()).a();
                twr twrVar2 = twrVar;
                ConversationIdType b = ruy.b(twrVar2.c);
                boolean a3 = ((ofq) twpVar.f.b()).a();
                qei qeiVar = null;
                if (a3) {
                    rtoVar = ((uie) twpVar.l.b()).m(b);
                    if (rtoVar == null) {
                        xyo a4 = twp.a.a();
                        a4.H("Early return for null conversation.");
                        a4.b(b);
                        a4.g(rve.a(twrVar2.e));
                        a4.q();
                        return upm.b();
                    }
                    if (!rtoVar.E()) {
                        xyo a5 = twp.a.a();
                        a5.H("Early return for consistent encryption status.");
                        a5.b(b);
                        a5.g(rve.a(twrVar2.e));
                        a5.q();
                        return upm.b();
                    }
                } else {
                    rtoVar = null;
                }
                MessageCoreData k = ((rwd) twpVar.h.b()).k(b);
                if (k != null && k.cn() && k.q() > twrVar2.d && k.cv()) {
                    xyo c = twp.a.c();
                    c.H("Will not downgrade because a new encrypted message has been received");
                    c.b(b);
                    c.g(rve.a(twrVar2.e));
                    c.q();
                    return upm.b();
                }
                alog a6 = ((rus) twpVar.g.b()).a(b, true);
                if (!a3) {
                    rtoVar = ((uac) twpVar.k.b()).z(b);
                }
                if (rtoVar != null) {
                    xyo a7 = twp.a.a();
                    a7.H("Attempting to downgrade a conversation");
                    a7.b(b);
                    a7.g(rve.a(twrVar2.e));
                    a7.x("conversation type", rtoVar.G());
                    a7.q();
                }
                if (rtoVar == null) {
                    xyo c2 = twp.a.c();
                    c2.H("Unable to downgrade conversation because conversation is null");
                    c2.b(b);
                    c2.g(rve.a(twrVar2.e));
                    c2.q();
                } else if (a6.isEmpty()) {
                    xyo c3 = twp.a.c();
                    c3.H("Unable to downgrade conversation because recipient list is empty");
                    c3.b(b);
                    c3.g(rve.a(twrVar2.e));
                    c3.q();
                } else if (rtoVar.S()) {
                    xyo c4 = twp.a.c();
                    c4.H("Downgrading group conversation");
                    c4.b(b);
                    c4.g(rve.a(twrVar2.e));
                    c4.q();
                    ((iji) twpVar.i.b()).t(b, rve.a(twrVar2.e));
                    ((mbl) twpVar.j.b()).e("Bugle.Etouffee.Conversation.Encryption.Update", uax.DOWNGRADE_GROUP_ON_RECEIVING_UNENCRYPTED_MESSAGE_FROM_BUGLE.t);
                    if (((okg) twpVar.e.b()).a()) {
                        rsw rswVar = (rsw) twpVar.d.b();
                        qei qeiVar2 = twrVar2.h;
                        if (qeiVar2 == null) {
                            qeiVar2 = qei.a;
                        }
                        tukVar = rswVar.a(qeiVar2, b);
                        uax uaxVar = uax.DEFAULT;
                        uaxVar.getClass();
                        tukVar.e(0, uaxVar);
                    } else {
                        ((rth) twpVar.c.b()).f(b, 0, uax.DEFAULT);
                        tukVar = null;
                    }
                    String str2 = twrVar2.e;
                    if (!Pattern.matches((String) qdx.a.e(), str2)) {
                        xyo c5 = twp.a.c();
                        c5.H("Downgrading group, unrecognized rcs message id format");
                        c5.b(b);
                        c5.g(rve.a(twrVar2.e));
                        c5.q();
                        ((mbl) twpVar.j.b()).e("Bugle.Etouffee.Conversation.Encryption.Update", uax.DOWNGRADE_GROUP_ON_RECEIVING_UNENCRYPTED_MESSAGE_FROM_NON_BUGLE.t);
                        if (((okg) twpVar.e.b()).a()) {
                            tukVar.getClass();
                            qei qeiVar3 = twrVar2.g;
                            if (qeiVar3 == null) {
                                qeiVar3 = qei.a;
                            }
                            tukVar.d(qeiVar3, true, amkd.RECEIVED_UNENCRYPTED_MESSAGE_IN_ENCRYPTED_CONVERSATION);
                        } else {
                            String str3 = twrVar2.f;
                            try {
                                ((rth) twpVar.c.b()).e(str3, ((psq) twpVar.m.b()).a(str3, false), true, amkd.RECEIVED_UNENCRYPTED_MESSAGE_IN_ENCRYPTED_CONVERSATION);
                            } catch (psr unused) {
                                twp.a.q("Using raw sender destination; unable to parse into ChatEndpoint");
                                ((rth) twpVar.c.b()).e(str3, null, true, amkd.RECEIVED_UNENCRYPTED_MESSAGE_IN_ENCRYPTED_CONVERSATION);
                            }
                        }
                    }
                } else if (((msh) a6.get(0)).e().isEmpty()) {
                    xyo c6 = twp.a.c();
                    c6.H("Unable to downgrade conversation because rcs identifier is empty");
                    c6.b(b);
                    c6.g(rve.a(twrVar2.e));
                    c6.q();
                } else {
                    uns unsVar2 = unsVar;
                    boolean z = booleanValue;
                    xyo c7 = twp.a.c();
                    c7.H("Valid unencrypted message received to downgrade encrypted conversation");
                    c7.b(b);
                    c7.g(rve.a(twrVar2.e));
                    c7.q();
                    qei qeiVar4 = (qei) ((msh) a6.get(0)).e().get();
                    String str4 = qeiVar4.d;
                    if (true == z) {
                        qeiVar = qeiVar4;
                    }
                    if (((okg) twpVar.e.b()).a()) {
                        if (!unsVar2.b()) {
                            rsw rswVar2 = (rsw) twpVar.d.b();
                            qei qeiVar5 = twrVar2.h;
                            if (qeiVar5 == null) {
                                qeiVar5 = qei.a;
                            }
                            tuk a8 = rswVar2.a(qeiVar5, b);
                            if (((tvr) a8.d.b()).g(qeiVar4.d)) {
                                a8.d(qeiVar4, false, amkd.RECEIVED_UNENCRYPTED_MESSAGE_IN_ENCRYPTED_CONVERSATION);
                                twpVar.j(twrVar2, b);
                                twpVar.k(twrVar2, b);
                            }
                        }
                    } else {
                        rth rthVar = (rth) twpVar.c.b();
                        if (z) {
                            str = qeiVar.d;
                        } else {
                            str = str4;
                        }
                        if (rthVar.g(str) && !unsVar2.b()) {
                            ((rth) twpVar.c.b()).e(str4, qeiVar, false, amkd.RECEIVED_UNENCRYPTED_MESSAGE_IN_ENCRYPTED_CONVERSATION);
                            twpVar.j(twrVar2, b);
                            twpVar.k(twrVar2, b);
                        }
                    }
                }
                ((mgv) twpVar.b.b()).h(a2, mgv.M);
                return upm.b();
            }
        }, this.p);
    }

    @Override // defpackage.unx
    public final apca e() {
        return twr.a.getParserForType();
    }

    public final void j(twr twrVar, ConversationIdType conversationIdType) {
        if (ttd.a() && ((Boolean) ((utz) ttd.F.get()).e()).booleanValue()) {
            ((iji) this.i.b()).t(conversationIdType, rve.a(twrVar.e));
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [armf, java.lang.Object] */
    public final void k(twr twrVar, ConversationIdType conversationIdType) {
        izc izcVar = (izc) this.o.b();
        aozy createBuilder = twt.a.createBuilder();
        String str = twrVar.c;
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        twt twtVar = (twt) createBuilder.b;
        str.getClass();
        twtVar.b = str;
        ((uof) izcVar.a.b()).b(upk.b("undelivered_message_fallback", (twt) createBuilder.s(), new uta(null, "etouffee-downgrade-conversation".concat(conversationIdType.toString()), null, null, null, null)));
    }
}
