package defpackage;

import android.support.v7.widget.RecyclerView;
import com.google.android.apps.messaging.R;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public class kly implements akgh<alog<kmk>> {
    final /* synthetic */ kma a;

    public kly(kma kmaVar) {
        this.a = kmaVar;
    }

    @Override // defpackage.akgh
    public final void a(Throwable th) {
        this.a.a();
        ((abbu) this.a.e.b()).k(R.string.donation_query_error);
        kma.a.r("#messageListsCallback: failed to load conversations", th);
        aktp.K(new klm(5), (cg) this.a.b.b());
        ((klc) this.a.j.b()).b(3);
    }

    @Override // defpackage.akgh
    public final void b() {
        this.a.b();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [armf, java.lang.Object] */
    @Override // defpackage.akgh
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        alog alogVar = (alog) obj;
        this.a.a();
        ((klc) this.a.j.b()).b(2);
        if (this.a.p != null) {
            return;
        }
        if (alogVar.isEmpty()) {
            ((abbu) this.a.e.b()).k(R.string.donation_no_messages_error);
            aktp.K(new klm(3), (cg) this.a.b.b());
        }
        kma kmaVar = this.a;
        RecyclerView recyclerView = kmaVar.o;
        kkc kkcVar = (kkc) kmaVar.d.b();
        ?? r1 = kkcVar.b;
        RecyclerView recyclerView2 = kmaVar.o;
        znj znjVar = (znj) r1.b();
        znjVar.getClass();
        ?? r2 = kkcVar.c;
        ?? r3 = kkcVar.a;
        recyclerView2.getClass();
        alogVar.getClass();
        recyclerView.ag(new kme(znjVar, r2, r3, recyclerView2, alogVar));
        kme kmeVar = (kme) kmaVar.o.l;
        kmeVar.getClass();
        kmaVar.p = kmeVar;
        kmaVar.p.G();
    }
}
