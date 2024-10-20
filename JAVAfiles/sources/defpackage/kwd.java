package defpackage;

import j$.util.Optional;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public class kwd implements akgh<Optional<wfx>> {
    final /* synthetic */ kvw a;

    public kwd(kvw kvwVar) {
        this.a = kvwVar;
    }

    @Override // defpackage.akgh
    public final void a(Throwable th) {
        xyo e = kuy.a.e();
        e.H("SubscriptionCallback: Failed to load PhoneNumberInputUIEvents");
        e.z("message", th.getMessage());
        e.q();
    }

    @Override // defpackage.akgh
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        Optional optional = (Optional) obj;
        if (optional.isEmpty()) {
            kuy.a.l("SubscriptionCallback: Not triggering PhoneNumberInput popup");
            return;
        }
        int ordinal = ((wfx) optional.get()).ordinal();
        if (ordinal != 2) {
            if (ordinal != 3) {
                return;
            }
            ((lzv) this.a.B.b()).W(this.a.b.F());
            kuy.a.l("SubscriptionCallback: Showing PhoneNumber Input fullscreen");
            return;
        }
        this.a.ao.d(6);
        kuy.a.l("SubscriptionCallback: Showing PhoneNumber Input popup");
    }

    @Override // defpackage.akgh
    public final /* synthetic */ void b() {
    }
}
