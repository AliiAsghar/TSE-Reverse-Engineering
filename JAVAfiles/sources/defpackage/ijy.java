package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class ijy<T> implements akgh<T> {
    private final String a;

    /* JADX INFO: Access modifiers changed from: protected */
    public ijy(String str) {
        this.a = str;
    }

    @Override // defpackage.akgh
    public final void a(Throwable th) {
        qiu.d(new ijx("Subscription mixin failed: ".concat(this.a), th));
    }

    @Override // defpackage.akgh
    public final void b() {
    }
}
