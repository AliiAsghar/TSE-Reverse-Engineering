package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class ambd extends amaz {
    @Override // defpackage.amaz
    public final ambl d(int i) {
        boolean z;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        d.s(z);
        return new ambb(this, i);
    }

    @Override // defpackage.ambk
    public final ambl f() {
        return d(32);
    }
}
