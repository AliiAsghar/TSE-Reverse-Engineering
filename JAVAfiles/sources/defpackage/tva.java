package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class tva {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/shared/datamodel/etouffee/impl/IdentityVerificationPendingMessageProcessor");
    public final anen b;
    public final anen c;
    public final tvr d;
    public final anen e;
    public final pwb f = new pwb();
    public final armf g;
    public final armf h;
    public final ofv i;
    public final msk j;
    public final armf k;
    public final armf l;
    public final qco m;
    private final armf n;
    private final armf o;

    public tva(anen anenVar, anen anenVar2, armf armfVar, tvr tvrVar, armf armfVar2, anen anenVar3, qco qcoVar, armf armfVar3, armf armfVar4, armf armfVar5, msk mskVar, ofv ofvVar, armf armfVar6) {
        this.l = armfVar;
        this.c = anenVar2;
        this.b = anenVar;
        this.d = tvrVar;
        this.n = armfVar2;
        this.e = anenVar3;
        this.m = qcoVar;
        this.g = armfVar3;
        this.h = armfVar4;
        this.o = armfVar5;
        this.i = ofvVar;
        this.j = mskVar;
        this.k = armfVar6;
    }

    public static String a(qei qeiVar, String str) {
        if (qeiVar != null) {
            return qeiVar.d;
        }
        return str;
    }

    public static boolean e(vqy vqyVar, boolean z) {
        agnw d;
        agnw d2;
        tcd b = tcf.b();
        b.d(new ttr(vqyVar, 7));
        if (b.b().K()) {
            return false;
        }
        tbx a2 = tcf.a();
        vqyVar.b(a2);
        if (z) {
            a2.j(tqn.WAITING_IDENTITY_VERIFICATION);
        } else {
            a2.j(tqn.WAITING_PRIOR_MESSAGE);
        }
        tbw a3 = a2.a(new taq(12));
        d = agnc.d("$primary");
        d2 = agnc.d("$primary");
        agnc.a(d2, "pending_incoming_message_rcs_table", a3, new tbe(d, 3), new swb(3));
        return true;
    }

    public static upm f(gvf gvfVar) {
        if (!new gsw().equals(gvfVar)) {
            if (!new gsu().equals(gvfVar)) {
                if (new gsv().equals(gvfVar)) {
                    return upm.e();
                }
                return upm.d();
            }
            return upm.e();
        }
        return upm.b();
    }

    public final void b(vqy vqyVar, String str) {
        alvi alviVar = a;
        alvw e = alviVar.e();
        e.X(alwp.a, "BugleEtouffee");
        alvg alvgVar = (alvg) e;
        alvgVar.X(ydl.D, str);
        alvgVar.X(ydl.f, vqyVar.a);
        ((alvg) alvgVar.h("com/google/android/apps/messaging/shared/datamodel/etouffee/impl/IdentityVerificationPendingMessageProcessor", "performIdentityCheckInTheBackground", 152, "IdentityVerificationPendingMessageProcessor.java")).q("Performing identity check for pending messages.");
        if (!e(vqyVar, true)) {
            alvw g = alviVar.g();
            g.X(alwp.a, "BugleEtouffee");
            ((alvg) ((alvg) g).h("com/google/android/apps/messaging/shared/datamodel/etouffee/impl/IdentityVerificationPendingMessageProcessor", "performIdentityCheckInTheBackground", 158, "IdentityVerificationPendingMessageProcessor.java")).q("Skip queuing. The message is already in the queue.");
        } else if (((Boolean) ((utz) ttd.z.get()).e()).booleanValue()) {
            d(this.j.b(vqyVar.c), str);
        } else {
            c(str);
        }
    }

    @Deprecated
    public final void c(String str) {
        ((izc) this.o.b()).i(1);
        uof uofVar = (uof) this.n.b();
        aozy createBuilder = aple.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        aple apleVar = (aple) createBuilder.b;
        str.getClass();
        apleVar.b = 1 | apleVar.b;
        apleVar.c = str;
        uofVar.a(upk.b("IdentityVerificationPendingMessageHandler", createBuilder.s(), new uta(str, null, null, null, null, null)));
    }

    public final void d(msh mshVar, String str) {
        ((izc) this.o.b()).i(2);
        uof uofVar = (uof) this.n.b();
        aozy createBuilder = aple.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        aple apleVar = (aple) createBuilder.b;
        str.getClass();
        apleVar.b |= 1;
        apleVar.c = str;
        msz m = lqn.m(mshVar);
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        aple apleVar2 = (aple) createBuilder.b;
        m.getClass();
        apleVar2.d = m;
        apleVar2.b |= 2;
        uofVar.a(upk.b("IdentityVerificationPendingMessageHandler", createBuilder.s(), new uta(mshVar.n(), null, null, null, null, null)));
    }
}
