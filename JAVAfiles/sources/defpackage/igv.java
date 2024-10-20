package defpackage;

import com.google.android.apps.messaging.blockandreportspam.ui.dialog.BlockAndReportSpamCallbacks;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class igv implements akbp<igw, Void> {
    final /* synthetic */ BlockAndReportSpamCallbacks a;

    public igv(BlockAndReportSpamCallbacks blockAndReportSpamCallbacks) {
        this.a = blockAndReportSpamCallbacks;
    }

    @Override // defpackage.akbp
    public final /* bridge */ /* synthetic */ void a(Object obj, Throwable th) {
    }

    @Override // defpackage.akbp
    public final /* synthetic */ void c(Object obj, Object obj2) {
        boolean z;
        boolean c;
        igw igwVar = (igw) obj;
        String str = igwVar.b;
        pwq a = ifz.a();
        a.a = str;
        boolean z2 = false;
        if (igwVar.l == 2) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            c = false;
        } else {
            BlockAndReportSpamCallbacks.ParticipantBlockAndSpamStatus participantBlockAndSpamStatus = igwVar.j;
            participantBlockAndSpamStatus.getClass();
            c = participantBlockAndSpamStatus.c();
        }
        if (!z) {
            BlockAndReportSpamCallbacks.ParticipantBlockAndSpamStatus participantBlockAndSpamStatus2 = igwVar.j;
            participantBlockAndSpamStatus2.getClass();
            z2 = participantBlockAndSpamStatus2.d();
        }
        BlockAndReportSpamCallbacks blockAndReportSpamCallbacks = this.a;
        a.l(igwVar.e, c);
        a.m(igwVar.f, z2);
        a.i(igwVar.d);
        ((ibi) blockAndReportSpamCallbacks.d.b()).e(a.h(), true);
    }

    @Override // defpackage.akbp
    public final /* synthetic */ void b(Object obj) {
    }
}
