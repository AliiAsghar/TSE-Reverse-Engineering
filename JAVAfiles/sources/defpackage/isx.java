package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public class isx implements akbp<Void, apdj<irm>> {
    final /* synthetic */ itb a;

    public isx(itb itbVar) {
        this.a = itbVar;
    }

    @Override // defpackage.akbp
    public final /* bridge */ /* synthetic */ void a(Object obj, Throwable th) {
        if (th instanceof CancellationException) {
        } else {
            throw new IllegalStateException("Failure to load participants, metadata, or isFallbackSupported. conversationId=".concat(String.valueOf(String.valueOf(this.a.af))), th);
        }
    }

    @Override // defpackage.akbp
    public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
        irm irmVar = (irm) ((apdj) obj2).a(irm.a, aozs.a());
        irl irlVar = this.a.z;
        if (irlVar.f == null) {
            xzb.n("Bugle", "Failed to show options UI: fragment manager is null.");
            return;
        }
        aozy createBuilder = apnf.a.createBuilder();
        String str = irmVar.d;
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        apnf apnfVar = (apnf) apagVar;
        str.getClass();
        boolean z = true;
        apnfVar.b |= 1;
        apnfVar.c = str;
        String str2 = irmVar.e;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        apag apagVar2 = createBuilder.b;
        apnf apnfVar2 = (apnf) apagVar2;
        str2.getClass();
        apnfVar2.b |= 2;
        apnfVar2.d = str2;
        boolean z2 = irmVar.f;
        if (!apagVar2.isMutable()) {
            createBuilder.u();
        }
        apag apagVar3 = createBuilder.b;
        apnf apnfVar3 = (apnf) apagVar3;
        apnfVar3.b |= 8;
        apnfVar3.f = z2;
        int i = irmVar.n;
        if (!apagVar3.isMutable()) {
            createBuilder.u();
        }
        apag apagVar4 = createBuilder.b;
        apnf apnfVar4 = (apnf) apagVar4;
        apnfVar4.b |= 512;
        apnfVar4.l = i;
        boolean z3 = irmVar.g;
        if (!apagVar4.isMutable()) {
            createBuilder.u();
        }
        apag apagVar5 = createBuilder.b;
        apnf apnfVar5 = (apnf) apagVar5;
        apnfVar5.b |= 16;
        apnfVar5.g = z3;
        boolean z4 = irmVar.h;
        if (!apagVar5.isMutable()) {
            createBuilder.u();
        }
        apag apagVar6 = createBuilder.b;
        apnf apnfVar6 = (apnf) apagVar6;
        apnfVar6.b |= 32;
        apnfVar6.h = z4;
        String str3 = irmVar.i;
        if (!apagVar6.isMutable()) {
            createBuilder.u();
        }
        apag apagVar7 = createBuilder.b;
        apnf apnfVar7 = (apnf) apagVar7;
        str3.getClass();
        apnfVar7.b |= 64;
        apnfVar7.i = str3;
        boolean z5 = irmVar.j;
        if (!apagVar7.isMutable()) {
            createBuilder.u();
        }
        apnf apnfVar8 = (apnf) createBuilder.b;
        apnfVar8.b |= 128;
        apnfVar8.j = z5;
        int i2 = irmVar.c;
        if (!((Boolean) vye.a.e()).booleanValue() || !rvx.r(i2)) {
            z = false;
        }
        if (irmVar.k) {
            apne apneVar = apne.ERROR_NO_RETRY_NO_FALLBACK_OPTIONS;
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            apag apagVar8 = createBuilder.b;
            apnf apnfVar9 = (apnf) apagVar8;
            apnfVar9.e = apneVar.k;
            apnfVar9.b |= 4;
            if (!apagVar8.isMutable()) {
                createBuilder.u();
            }
            apag apagVar9 = createBuilder.b;
            apnf apnfVar10 = (apnf) apagVar9;
            apnfVar10.b |= 32;
            apnfVar10.h = false;
            if (!apagVar9.isMutable()) {
                createBuilder.u();
            }
            apnf apnfVar11 = (apnf) createBuilder.b;
            apnfVar11.b |= 128;
            apnfVar11.j = false;
        } else if (!rvx.q(i2) && !z) {
            if (rvx.p(i2)) {
                apne apneVar2 = apne.SENDING_OPTIONS;
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                apnf apnfVar12 = (apnf) createBuilder.b;
                apnfVar12.e = apneVar2.k;
                apnfVar12.b |= 4;
            } else if (irmVar.l) {
                apne apneVar3 = apne.SEND_TIMEOUT_OPTIONS;
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                apnf apnfVar13 = (apnf) createBuilder.b;
                apnfVar13.e = apneVar3.k;
                apnfVar13.b |= 4;
            } else if (irmVar.m) {
                apne apneVar4 = apne.ERROR_RECIPIENT_LOST_ENCRYPTION_OPTIONS;
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                apnf apnfVar14 = (apnf) createBuilder.b;
                apnfVar14.e = apneVar4.k;
                apnfVar14.b |= 4;
            } else if (irlVar.d.i() && tvu.e(irmVar.n) && rvx.s(i2)) {
                apne apneVar5 = apne.ERROR_GROUP_FTD_OPTIONS;
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                apnf apnfVar15 = (apnf) createBuilder.b;
                apnfVar15.e = apneVar5.k;
                apnfVar15.b |= 4;
            } else {
                apne apneVar6 = apne.ERROR_OPTIONS;
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                apnf apnfVar16 = (apnf) createBuilder.b;
                apnfVar16.e = apneVar6.k;
                apnfVar16.b |= 4;
            }
        } else {
            apne apneVar7 = apne.SENT_OPTIONS;
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            apnf apnfVar17 = (apnf) createBuilder.b;
            apnfVar17.e = apneVar7.k;
            apnfVar17.b |= 4;
        }
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apnf apnfVar18 = (apnf) createBuilder.b;
        apnfVar18.b |= 256;
        apnfVar18.k = z;
        xvl.aP((apnf) createBuilder.s()).q(irlVar.f, "messageFailureOptionsBottomModalFragment");
    }

    @Override // defpackage.akbp
    public final /* synthetic */ void b(Object obj) {
    }
}
