package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ymh {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/shared/util/spam/SpamReporter");
    public static final alhr b = uuh.y("spam_reporter_kt_fix_undo_archive_status");
    public final armf c;
    public final armf d;
    public final armf e;
    public final xwt f;
    public final armf g;
    public final armf h;
    public final armf i;
    public final armf j;
    public final agnq k;
    public final armf l;
    public final armf m;
    public final armf n;
    public final armf o;

    public ymh(armf armfVar, armf armfVar2, armf armfVar3, xwt xwtVar, armf armfVar4, armf armfVar5, armf armfVar6, armf armfVar7, agnq agnqVar, armf armfVar8, armf armfVar9, @oqd armf armfVar10, armf armfVar11) {
        armfVar.getClass();
        armfVar2.getClass();
        armfVar3.getClass();
        xwtVar.getClass();
        armfVar4.getClass();
        armfVar5.getClass();
        armfVar6.getClass();
        armfVar7.getClass();
        agnqVar.getClass();
        armfVar8.getClass();
        armfVar9.getClass();
        armfVar10.getClass();
        armfVar11.getClass();
        this.c = armfVar;
        this.d = armfVar2;
        this.e = armfVar3;
        this.f = xwtVar;
        this.g = armfVar4;
        this.h = armfVar5;
        this.i = armfVar6;
        this.j = armfVar7;
        this.k = agnqVar;
        this.l = armfVar8;
        this.m = armfVar9;
        this.n = armfVar10;
        this.o = armfVar11;
    }

    public final tqc a(boolean z, ConversationIdType conversationIdType, ParticipantsTable.BindData bindData) {
        smr q;
        if (z) {
            return tqc.SPAM_FOLDER;
        }
        tqc tqcVar = tqc.UNARCHIVED;
        if (bindData != null && (q = ((rtz) this.h.b()).q(conversationIdType)) != null && q.o() == 1 && bindData.R()) {
            return tqc.BLOCKED_FOLDER;
        }
        return tqcVar;
    }

    public final ymv b(final ymi ymiVar) {
        aiut.b();
        final aozy createBuilder = ymv.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        ymv ymvVar = (ymv) apagVar;
        ymvVar.b |= 32;
        ymvVar.h = ymiVar.e;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        boolean z = ymiVar.f;
        ymv ymvVar2 = (ymv) createBuilder.b;
        ymvVar2.b |= 64;
        ymvVar2.i = z;
        int an = a.an(ymiVar.m);
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        ymv ymvVar3 = (ymv) createBuilder.b;
        ymvVar3.b |= 128;
        ymvVar3.j = an;
        return (ymv) this.k.c("SpamReporter#updateAndReportSpamStatus", new alhr() { // from class: ymf
            /* JADX WARN: Code restructure failed: missing block: B:40:0x0103, code lost:
            
                if (defpackage.d.F(r4, new defpackage.ypj(defpackage.aqjn.e(r7))) == false) goto L38;
             */
            /* JADX WARN: Code restructure failed: missing block: B:53:0x0183, code lost:
            
                if (r4 != null) goto L67;
             */
            /* JADX WARN: Removed duplicated region for block: B:29:0x011e  */
            @Override // defpackage.alhr
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object get() {
                /*
                    Method dump skipped, instructions count: 560
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.ymf.get():java.lang.Object");
            }
        });
    }
}
