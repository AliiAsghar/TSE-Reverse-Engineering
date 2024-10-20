package defpackage;

import android.os.Message;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class acym implements acyp {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ acym(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, acyh] */
    @Override // defpackage.acyp
    public final void a(Object obj) {
        if (this.b != 0) {
            Integer.toString(((Message) this.a).what);
            obj.f();
        } else {
            obj.b(this.a);
        }
    }
}
