package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aquh implements aqvx {
    private final /* synthetic */ int a;

    public aquh(int i) {
        this.a = i;
    }

    @Override // defpackage.aqvx
    public final /* synthetic */ int a(Object obj) {
        int i = this.a;
        if (i != 0) {
            if (i != 1) {
                ((aqve) obj).e();
                return 5;
            }
            ((aqua) obj).d();
            return 5;
        }
        return ((aqug) obj).a();
    }

    @Override // defpackage.aqvx
    public final /* synthetic */ void b(Object obj) {
        int i = this.a;
        if (i != 0) {
            if (i != 1) {
                ((aqve) obj).d();
                return;
            } else {
                ((aqua) obj).e();
                return;
            }
        }
        ((aqug) obj).c();
    }
}
