package defpackage;

import com.google.android.apps.messaging.blockandreportspam.ui.dialog.BlockAndReportSpamCallbacks;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class igs implements akbp<igw, Integer> {
    final /* synthetic */ BlockAndReportSpamCallbacks a;

    public igs(BlockAndReportSpamCallbacks blockAndReportSpamCallbacks) {
        this.a = blockAndReportSpamCallbacks;
    }

    @Override // defpackage.akbp
    public final /* bridge */ /* synthetic */ void a(Object obj, Throwable th) {
    }

    @Override // defpackage.akbp
    public final /* synthetic */ void c(Object obj, Object obj2) {
        final igw igwVar = (igw) obj;
        boolean z = igwVar.e;
        boolean z2 = igwVar.f;
        boolean z3 = true;
        if (!z && !z2) {
            z3 = false;
        }
        albo.U(z3, "The dialog must result in at least the block or spam status being updated, if not both.");
        ibi ibiVar = (ibi) this.a.d.b();
        String str = igwVar.b;
        pwq a = ifz.a();
        a.a = str;
        a.l(z, z);
        a.m(z2, z2);
        a.j(this.a.a());
        a.k(new Runnable() { // from class: igr
            @Override // java.lang.Runnable
            public final void run() {
                BlockAndReportSpamCallbacks blockAndReportSpamCallbacks = igs.this.a;
                igw igwVar2 = igwVar;
                ((akbo) blockAndReportSpamCallbacks.g.b()).j(ahlp.l(aktp.aj(new imi(blockAndReportSpamCallbacks, igwVar2, 1, null), blockAndReportSpamCallbacks.i)), new ahlp(igwVar2), blockAndReportSpamCallbacks.l);
            }
        });
        a.i(igwVar.d);
        ibiVar.d(a.h());
    }

    @Override // defpackage.akbp
    public final /* synthetic */ void b(Object obj) {
    }
}
