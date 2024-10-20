package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.android.vcard.VCardConfig;
import com.google.android.apps.messaging.R;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class tvb extends unp {
    private static final xze a = xze.g("BugleEtouffee", "IdentityVerificationPendingMessageWorkItemHandler");
    private final Context b;
    private final tva c;
    private final via d;
    private final armf e;
    private final armf f;
    private final armf g;
    private final armf h;
    private final armf i;

    public tvb(Context context, tva tvaVar, via viaVar, armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5) {
        this.b = context;
        this.c = tvaVar;
        this.d = viaVar;
        this.e = armfVar;
        this.f = armfVar3;
        this.g = armfVar4;
        this.h = armfVar2;
        this.i = armfVar5;
    }

    public static String j(String str, qei qeiVar) {
        if (qeiVar == null) {
            return str;
        }
        return qeiVar.d;
    }

    private final qei k(String str) {
        if (!TextUtils.isEmpty(str) && ((Boolean) new mss(11).get()).booleanValue()) {
            return ((psq) this.h.b()).a(str, false);
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [armf, java.lang.Object] */
    private final akul l(String str, qei qeiVar, int i, amkb amkbVar) {
        int i2;
        if (amkbVar == amkb.IDENTITY_VERIFICATION_RETRY_LIMIT_REACHED) {
            ((mbl) this.f.b()).e("Bugle.Etouffee.DecryptionAborted.Reason", ttf.IDENTITY_VERIFICATION_RETRY_LIMIT_REACHED.y);
        }
        tcd b = tcf.b();
        b.w("logFailureForPendingMessages");
        b.d(new tux(str, qeiVar, 4, null));
        tca tcaVar = (tca) b.b().n();
        while (tcaVar.moveToNext()) {
            try {
                iji ijiVar = (iji) this.e.b();
                String e = rve.e(tcaVar.h());
                amfq amfqVar = (amfq) amfr.a.createBuilder();
                amfp amfpVar = amfp.BUGLE_E2EE_IDENTITY_VERIFICATION_MESSAGE_DROPPED;
                if (!amfqVar.b.isMutable()) {
                    amfqVar.u();
                }
                amfr amfrVar = (amfr) amfqVar.b;
                amfrVar.i = amfpVar.dg;
                amfrVar.b |= 1;
                aozy createBuilder = amkc.a.createBuilder();
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                apag apagVar = createBuilder.b;
                amkc amkcVar = (amkc) apagVar;
                amkcVar.b |= 1;
                amkcVar.c = e;
                if (!apagVar.isMutable()) {
                    createBuilder.u();
                }
                apag apagVar2 = createBuilder.b;
                amkc amkcVar2 = (amkc) apagVar2;
                amkcVar2.d = amkbVar.i;
                amkcVar2.b |= 2;
                if (!apagVar2.isMutable()) {
                    createBuilder.u();
                }
                amkc amkcVar3 = (amkc) createBuilder.b;
                amkcVar3.b |= 4;
                amkcVar3.e = i;
                if (!amfqVar.b.isMutable()) {
                    amfqVar.u();
                }
                amfr amfrVar2 = (amfr) amfqVar.b;
                amkc amkcVar4 = (amkc) createBuilder.s();
                amkcVar4.getClass();
                amfrVar2.Y = amkcVar4;
                amfrVar2.c |= VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES;
                ((maq) ijiVar.a.b()).j(amfqVar);
                iji ijiVar2 = (iji) this.e.b();
                rve h = tcaVar.h();
                int ordinal = amkbVar.ordinal();
                if (ordinal != 2) {
                    if (ordinal == 7) {
                        i2 = 42;
                    } else {
                        throw new IllegalStateException("Unknown reason");
                    }
                } else {
                    i2 = 25;
                }
                ijiVar2.p(h, i2);
            } catch (Throwable th) {
                try {
                    tcaVar.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        tcaVar.close();
        qei k = k(j(str, qeiVar));
        String j = j(str, qeiVar);
        tcb tcbVar = new tcb();
        tcbVar.f("IdentityVerificationPendingMessageProcessor#clearQueue");
        tcbVar.b(new tux(k, j, 0));
        tcbVar.d();
        return aktp.ag(upm.d());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final akul m(uns unsVar, String str, qei qeiVar) {
        String str2;
        String str3;
        xze xzeVar = a;
        xyo c = xzeVar.c();
        c.H("Starting identity verification worker.");
        String str4 = "remoteUserId";
        if (qeiVar == 0) {
            str2 = "remoteUserId";
        } else {
            str2 = "chatEndpoint";
        }
        if (qeiVar == 0) {
            str3 = str;
        } else {
            str3 = qeiVar;
        }
        c.M(str2, str3);
        c.q();
        int i = unsVar.a().b;
        if (i > ((Integer) ttd.x.e()).intValue()) {
            xyo e = xzeVar.e();
            e.H("Unable to refresh remote user registration. Dropping all pending messages from that user.");
            if (qeiVar != 0) {
                str4 = "chatEndpoint";
            }
            e.M(str4, str3);
            e.x("runAttemptCount", i);
            e.q();
            return l(str, qeiVar, i, amkb.IDENTITY_VERIFICATION_RETRY_LIMIT_REACHED);
        }
        tva tvaVar = this.c;
        qei k = k(j(str, qeiVar));
        String j = j(str, qeiVar);
        tcd b = tcf.b();
        b.w("pendingMessagesExistFor1");
        b.d(new tux(k, j, 3));
        return akul.g(b.b().v()).i(new tuy(tvaVar, k, j, i, 0), tvaVar.e).h(new ikg(tvaVar, i, 4), tvaVar.e).e(Throwable.class, new ikg(tvaVar, i, 5), tvaVar.e);
    }

    private final akul n(uns unsVar, String str, qei qeiVar, int i) {
        ((izc) this.g.b()).h(i);
        return m(unsVar, str, qeiVar);
    }

    @Override // defpackage.unp, defpackage.unx
    public final unf a() {
        une a2 = unf.a();
        a2.d(Integer.MAX_VALUE);
        a2.c(unv.FOREGROUND_SERVICE);
        a2.h(60000L);
        gsd gsdVar = new gsd();
        gsdVar.c(2);
        a2.a = gsdVar.a();
        a2.b = this.d.b(this.b.getString(R.string.identity_verification_notification_text));
        a2.g(gry.EXPONENTIAL);
        return a2.b();
    }

    @Override // defpackage.unx
    public final akrh c() {
        return aktp.e("IdentityVerificationPendingMessageWorkItemHandler");
    }

    @Override // defpackage.unp
    protected final /* synthetic */ akul d(uns unsVar, apbt apbtVar) {
        qei qeiVar;
        aple apleVar = (aple) apbtVar;
        String str = apleVar.c;
        qei qeiVar2 = null;
        if (((Boolean) new mss(17).get()).booleanValue() && !str.isEmpty()) {
            qeiVar = ((psq) this.h.b()).a(str, false);
        } else {
            qeiVar = null;
        }
        if (((Boolean) ((utz) ttd.z.get()).e()).booleanValue()) {
            if ((apleVar.b & 2) != 0) {
                ((izc) this.g.b()).h(3);
                lqn lqnVar = (lqn) this.i.b();
                msz mszVar = apleVar.d;
                if (mszVar == null) {
                    mszVar = msz.a;
                }
                Optional e = lqnVar.l(mszVar).e();
                if (e.isPresent()) {
                    String str2 = ((qei) e.get()).d;
                    if (((Boolean) new mss(17).get()).booleanValue()) {
                        qeiVar2 = (qei) e.get();
                    }
                    return m(unsVar, str2, qeiVar2);
                }
                return l(str, qeiVar, unsVar.a().b, amkb.SENDERS_USER_ID_EMPTY);
            }
            return n(unsVar, str, qeiVar, 2);
        }
        return n(unsVar, str, qeiVar, 1);
    }

    @Override // defpackage.unx
    public final apca e() {
        return aple.a.getParserForType();
    }
}
