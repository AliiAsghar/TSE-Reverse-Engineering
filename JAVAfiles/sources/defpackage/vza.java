package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vza {
    public static final xze a = xze.g("BugleRcs", "MessagingServiceMetrics");
    public final mbl b;
    public final xnv c;

    public vza(mbl mblVar, xnv xnvVar) {
        this.b = mblVar;
        this.c = xnvVar;
    }

    public static int a(int i) {
        if (i <= 0) {
            return 0;
        }
        if (i < 2) {
            return 1;
        }
        if (i < 3) {
            return 2;
        }
        if (i < 6) {
            return 3;
        }
        if (i < 10) {
            return 4;
        }
        return 5;
    }

    public final void b(int i) {
        this.b.e("Bugle.MessagingService.GetMessages.BatchSize.Count", a(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(int i) {
        this.b.e("Bugle.MessagingService.SendMessageRequest.Binder.Count", i);
    }
}
