package defpackage;

import com.google.android.apps.messaging.blockandreportspam.ui.dialog.BlockAndReportSpamCallbacks;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class igu implements akbp<igw, apdj<xxn>> {
    final /* synthetic */ BlockAndReportSpamCallbacks a;

    public igu(BlockAndReportSpamCallbacks blockAndReportSpamCallbacks) {
        this.a = blockAndReportSpamCallbacks;
    }

    @Override // defpackage.akbp
    public final /* bridge */ /* synthetic */ void a(Object obj, Throwable th) {
    }

    @Override // defpackage.akbp
    public final /* synthetic */ void c(Object obj, Object obj2) {
        final igw igwVar = (igw) obj;
        final xxn xxnVar = (xxn) ((apdj) obj2).a(xxn.a, aozs.a());
        int i = xxnVar.b;
        boolean z = true;
        if ((i & 16) == 0 && (i & 2) == 0 && (i & 1) == 0) {
            return;
        }
        boolean z2 = igwVar.e;
        boolean z3 = igwVar.f;
        if (!z2 && !z3) {
            z = false;
        }
        albo.U(z, "The dialog must result in at least the block or spam status being updated, if not both.");
        ibi ibiVar = (ibi) this.a.d.b();
        String str = igwVar.b;
        pwq a = ifz.a();
        a.a = str;
        a.l(z2, z2);
        a.m(z3, z3);
        a.j(this.a.a());
        a.k(new Runnable() { // from class: igt
            @Override // java.lang.Runnable
            public final void run() {
                BlockAndReportSpamCallbacks blockAndReportSpamCallbacks = igu.this.a;
                igw igwVar2 = igwVar;
                ((akbo) blockAndReportSpamCallbacks.g.b()).j(ahlp.l(aktp.ah(new faq(blockAndReportSpamCallbacks, igwVar2, xxnVar, 18, (char[]) null), blockAndReportSpamCallbacks.i)), new ahlp(igwVar2), blockAndReportSpamCallbacks.l);
            }
        });
        a.i(igwVar.d);
        ibiVar.d(a.h());
    }

    @Override // defpackage.akbp
    public final /* synthetic */ void b(Object obj) {
    }
}
