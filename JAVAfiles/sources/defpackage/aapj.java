package defpackage;

import android.os.Bundle;
import android.view.MenuItem;
import com.google.android.apps.messaging.ui.mediapicker.c2o.content.AttachmentQueueState;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class aapj extends aapl {
    public AttachmentQueueState C;
    public long D;
    public boolean E;
    public mcm F;
    public xnv G;
    private boolean H = false;
    private boolean I = false;
    private boolean J = false;
    private Long K;

    private final amqj A() {
        aozy createBuilder = amqj.a.createBuilder();
        amqh I = I();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        amqj amqjVar = (amqj) apagVar;
        amqjVar.c = I.v;
        amqjVar.b |= 1;
        amqi amqiVar = amqi.EXPANDED;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        amqj amqjVar2 = (amqj) createBuilder.b;
        amqjVar2.d = amqiVar.e;
        amqjVar2.b |= 2;
        return (amqj) createBuilder.s();
    }

    private final void C() {
        AttachmentQueueState attachmentQueueState = this.C;
        if (attachmentQueueState != null) {
            attachmentQueueState.a(J());
        }
    }

    protected abstract amqh I();

    protected abstract Class J();

    public final void K(amqd amqdVar) {
        if (!this.H) {
            L(amqf.INTERRUPTED);
        }
        if (!this.I) {
            mcm mcmVar = this.F;
            amqj A = A();
            C();
            if (!this.J) {
                xyl.l(this.K);
                this.G.f().toEpochMilli();
                Long l = this.K;
                if (l != null) {
                    l.longValue();
                }
            }
            mcmVar.c(A, amqdVar);
            this.I = true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x009f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void L(defpackage.amqf r10) {
        /*
            r9 = this;
            boolean r0 = r9.H
            if (r0 != 0) goto La2
            xnv r0 = r9.G
            j$.time.Instant r0 = r0.f()
            long r0 = r0.toEpochMilli()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r9.K = r0
            amqj r0 = r9.A()
            r9.C()
            android.content.Intent r1 = r9.getIntent()
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L71
            java.lang.String r4 = "EXTRA_OPENING_SOURCE"
            boolean r5 = r1.hasExtra(r4)
            if (r5 == 0) goto L71
            java.lang.String r5 = r1.getStringExtra(r4)     // Catch: java.lang.IllegalArgumentException -> L3b
            r5.getClass()     // Catch: java.lang.IllegalArgumentException -> L3b
            java.lang.Class<amqe> r6 = defpackage.amqe.class
            java.lang.Enum r5 = java.lang.Enum.valueOf(r6, r5)     // Catch: java.lang.IllegalArgumentException -> L3b
            amqe r5 = (defpackage.amqe) r5     // Catch: java.lang.IllegalArgumentException -> L3b
            goto L73
        L3b:
            r5 = move-exception
            java.lang.String r1 = r1.getStringExtra(r4)
            java.lang.Object[] r4 = new java.lang.Object[r3]
            r4[r2] = r1
            alvi r1 = defpackage.xzb.a
            alvw r1 = r1.h()
            alvg r1 = (defpackage.alvg) r1
            alvz r6 = defpackage.alwp.a
            java.lang.String r7 = "Bugle"
            r1.X(r6, r7)
            alvr r6 = defpackage.alvr.a
            r1.Y(r6)
            alvw r1 = r1.g(r5)
            alvg r1 = (defpackage.alvg) r1
            java.lang.String r5 = "e"
            r6 = 511(0x1ff, float:7.16E-43)
            java.lang.String r7 = "com/google/android/apps/messaging/shared/util/common/LogUtil"
            java.lang.String r8 = "LogUtil.java"
            alvw r1 = r1.h(r7, r5, r6, r8)
            alvg r1 = (defpackage.alvg) r1
            java.lang.String r5 = "Invalid opening source %s"
            r1.Q(r5, r4)
        L71:
            amqe r5 = defpackage.amqe.UNKNOWN_OPENING_SOURCE
        L73:
            alvi r1 = defpackage.mcm.a
            alvw r1 = r1.i()
            alvg r1 = (defpackage.alvg) r1
            alwk r4 = defpackage.alwk.MEDIUM
            r1.Z(r4)
            java.lang.String r4 = "deprecatedLogScreenOpened"
            r6 = 83
            java.lang.String r7 = "com/google/android/apps/messaging/shared/analytics/compose/ComposeNavigationEventLogger"
            java.lang.String r8 = "ComposeNavigationEventLogger.java"
            alvw r1 = r1.h(r7, r4, r6, r8)
            alvg r1 = (defpackage.alvg) r1
            int r4 = r5.r
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.String r5 = "ComposeNavigationEventLogger.deprecatedLogScreenOpened 3 %s, %s, %s"
            r1.J(r5, r0, r10, r4)
            r9.H = r3
            amqf r0 = defpackage.amqf.INTERRUPTED
            if (r10 != r0) goto La0
            r2 = r3
        La0:
            r9.J = r2
        La2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aapj.L(amqf):void");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.zgu, defpackage.zgr, defpackage.zgw, defpackage.aitz, defpackage.cj, defpackage.re, defpackage.dx, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        c().b(this, new aapi(this));
        en j = j();
        if (j != null) {
            j.setDisplayHomeAsUpEnabled(true);
        }
        this.C = (AttachmentQueueState) getIntent().getParcelableExtra("draft_message_data");
        if (((Boolean) abdh.a.e()).booleanValue()) {
            this.D = getIntent().getIntExtra("EXTRA_MAX_ATTACHMENT_SIZE", -1);
        }
        this.E = getIntent().getBooleanExtra("EXTRA_IS_RCS_ON_OPEN", false);
        getIntent().getLongExtra("EXTRA_OPENING_TIME", this.G.f().toEpochMilli());
    }

    @Override // defpackage.zgu, defpackage.aitz, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            K(amqd.BACK_ICON);
            c().d();
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }
}
