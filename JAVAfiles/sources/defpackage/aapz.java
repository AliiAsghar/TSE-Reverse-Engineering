package defpackage;

import com.google.android.apps.messaging.ui.mediapicker.c2o.ContentGridView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class aapz implements aaqe {
    public aapu a;
    public final aaqa b;
    public final int c;
    public aaqp d;
    protected final ContentGridView e;
    private final aaqh f;

    public aapz(aaqh aaqhVar, aaqa aaqaVar, ContentGridView contentGridView, int i) {
        this.f = aaqhVar;
        this.b = aaqaVar;
        this.e = contentGridView;
        this.c = i;
    }

    public final int a() {
        return this.f.a();
    }

    public int b(int i) {
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public long c(int i, int i2) {
        return -1L;
    }

    public void d(aaqi aaqiVar, int i) {
        aaqiVar.b(new aaqf(this, i));
    }

    @Override // defpackage.aaqe
    public final void e(aaqi aaqiVar, int i) {
        f(aaqiVar, i);
    }

    protected abstract void f(aaqi aaqiVar, int i);

    @Override // defpackage.aaqe
    public /* synthetic */ void g() {
    }
}
